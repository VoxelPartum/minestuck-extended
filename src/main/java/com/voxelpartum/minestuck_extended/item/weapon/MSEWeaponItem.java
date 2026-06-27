package com.voxelpartum.minestuck_extended.item.weapon;

import com.google.common.collect.Streams;
import com.mraof.minestuck.item.weapon.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.ItemAbility;

import javax.annotation.Nullable;
import java.util.*;
import java.util.stream.Stream;

public class MSEWeaponItem extends WeaponItem {

    @Nullable
    private final ItemRightClickEffect itemRightClickEffect;
    private final ItemRightClickEffect crouchItemRightClickEffect;

    public MSEWeaponItem(Builder builder, Properties properties) {
        super(builder, properties);

        this.itemRightClickEffect = builder.itemRightClickEffect;
        this.crouchItemRightClickEffect = builder.crouchItemRightClickEffect;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(itemRightClickEffect != null && player.isShiftKeyDown()){
            return crouchItemRightClickEffect.onRightClick(level, player, hand);
        }
        else if(itemRightClickEffect != null)
            return itemRightClickEffect.onRightClick(level, player, hand);
        else return super.use(level, player, hand);
    }

    public static class Builder extends WeaponItem.Builder {
        private final Tier tier;
        private final int attackDamage;
        private final float attackSpeed;
        public ItemRightClickEffect crouchItemRightClickEffect;
        private List<MSToolType> toolType = List.of();
        private final Set<ItemAbility> toolActions = new HashSet<>();
        private float efficiency;
        private boolean disableShield;
        private final List<OnHitEffect> onHitEffects = new ArrayList<>();
        @Nullable
        private DestroyBlockEffect destroyBlockEffect = null;
        @Nullable
        private RightClickBlockEffect rightClickBlockEffect = null;
        @Nullable
        private ItemRightClickEffect itemRightClickEffect;
        private int useDuration = 0;
        private UseAnim useAction = UseAnim.NONE;
        private final List<FinishUseItemEffect> itemUsageEffects = new ArrayList<>();
        private final List<InventoryTickEffect> tickEffects = new ArrayList<>();

        public Builder(Tier tier, int attackDamage, float attackSpeed)
        {
            super(tier, attackDamage, attackSpeed);
            this.tier = tier;
            this.attackDamage = attackDamage;
            this.attackSpeed = attackSpeed;
            efficiency = tier.getSpeed();
        }

        public Builder set(MSToolType... toolTypes)
        {
            this.toolType = List.of(toolTypes);
            for(MSToolType toolType : this.toolType)
                toolActions.addAll(List.of(toolType.abilities()));
            return this;
        }

        public Builder set(DestroyBlockEffect effect)
        {
            if(destroyBlockEffect != null)
                throw new IllegalStateException("Destroy block effect has already been set");
            destroyBlockEffect = effect;
            return this;
        }

        public Builder set(RightClickBlockEffect effect)
        {
            if(rightClickBlockEffect != null)
                throw new IllegalStateException("Right click block effect has already been set");
            rightClickBlockEffect = effect;
            return this;
        }

        public Builder set(ItemRightClickEffect effect)
        {
            if(itemRightClickEffect != null)
                throw new IllegalStateException("Item right click effect has already been set");
            itemRightClickEffect = effect;
            return this;
        }

        public Builder setCrouch(ItemRightClickEffect effect)
        {
            if(crouchItemRightClickEffect != null)
                throw new IllegalStateException("Item crouch right click effect has already been set");
            crouchItemRightClickEffect = effect;
            return this;
        }

        public Builder efficiency(float efficiency)
        {
            this.efficiency = efficiency;
            return this;
        }

        public Builder disableShield()
        {
            disableShield = true;
            return this;
        }

        public Builder add(OnHitEffect... effects)
        {
            onHitEffects.addAll(Arrays.asList(effects));
            return this;
        }

        public Builder add(InventoryTickEffect... effects)
        {
            tickEffects.addAll(Arrays.asList(effects));
            return this;
        }

        public Builder add(ItemAbility... actions)
        {
            toolActions.addAll(List.of(actions));
            return this;
        }

        public Builder setEating(FinishUseItemEffect... effects)
        {
            return addItemUses(32, UseAnim.EAT, effects);
        }

        public Builder setEating(int duration, FinishUseItemEffect... effects)
        {
            return addItemUses(duration, UseAnim.EAT, effects);
        }

        public Builder addItemUses(int duration, UseAnim action, FinishUseItemEffect... effects)
        {
            useDuration = duration;
            useAction = action;
            itemUsageEffects.addAll(Arrays.asList(effects));
            set(ItemRightClickEffect.ACTIVE_HAND);
            return this;
        }

        private Properties updateProperties(Properties properties)
        {
            properties.attributes(DiggerItem.createAttributes(this.tier, this.attackDamage, this.attackSpeed));
            ArrayList<TagKey<Block>> mineableBlocks = new ArrayList<>();
            for(MSToolType toolType : this.toolType)
            {
                if(toolType.mineableBlocks() != null)
                    mineableBlocks.add(toolType.mineableBlocks());
            }
            if(!mineableBlocks.isEmpty())
                properties.component(DataComponents.TOOL, createToolProperties(this.tier, mineableBlocks, efficiency));
            return properties;
        }
    }

    private static Tool createToolProperties(Tier tier, List<TagKey<Block>> mineableBlocks, float efficiency)
    {
        return new Tool(Streams.concat(mineableBlocks.stream().map(tag -> Tool.Rule.minesAndDrops(tag, efficiency)), Stream.of(Tool.Rule.deniesDrops(tier.getIncorrectBlocksForDrops()))).toList(),
                1.0F, 1);
    }

}
