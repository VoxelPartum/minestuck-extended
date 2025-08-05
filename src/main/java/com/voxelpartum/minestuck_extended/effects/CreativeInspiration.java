package com.voxelpartum.minestuck_extended.effects;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.EntityTickEvent;

import java.util.function.Supplier;

@EventBusSubscriber(modid = MinestuckExtended.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class CreativeInspiration extends MobEffect {

    public static final AttributeModifier attributeModifier =
            new AttributeModifier(MinestuckExtended.asResource("effect.player_reach"), 10,
                    AttributeModifier.Operation.ADD_VALUE);

    private static final Supplier<Multimap<Holder<Attribute>,AttributeModifier>> rangeModifier = Suppliers.memoize(()->
            ImmutableMultimap.of(Attributes.BLOCK_INTERACTION_RANGE, attributeModifier));

    protected CreativeInspiration()
        { super(MobEffectCategory.BENEFICIAL, 0x252525); }


    @SubscribeEvent
    public static void tickEvent(EntityTickEvent.Pre event){
        if (!(event.getEntity() instanceof Player player))
            return;

        if(player.hasEffect(MSEEffects.CREATIVE_INSPIRATION)){
            player.getAttributes()
                    .addTransientAttributeModifiers(rangeModifier.get());
        }else {
            player.getAttributes().removeAttributeModifiers(rangeModifier.get());
        }

    }
}
