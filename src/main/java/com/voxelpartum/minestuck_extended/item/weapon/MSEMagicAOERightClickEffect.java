package com.voxelpartum.minestuck_extended.item.weapon;

import com.mraof.minestuck.item.weapon.MagicAOERightClickEffect;
import com.mraof.minestuck.util.MSSoundEvents;
import com.voxelpartum.minestuck_extended.network.MSEMagicAOEEffectPacket;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.PacketDistributor;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class MSEMagicAOERightClickEffect extends MagicAOERightClickEffect {

    private static final TargetingConditions visiblePredicate = TargetingConditions.forCombat();

    private final float radius;
    private final int damage;
    private final int cooldown;
    @javax.annotation.Nullable
    private final MSEMagicEffect.MSEAOEType type;
    private final Consumer<LivingEntity> targetEffect;

    protected MSEMagicAOERightClickEffect(float radius, int damage, int cooldownTicks, @Nullable MSEMagicEffect.MSEAOEType type, Consumer<LivingEntity> targetEffect) {
        super(radius, damage, null, targetEffect);
        this.radius = radius;
        this.damage = damage;
        this.cooldown = cooldownTicks;
        this.type = type;
        this.targetEffect = targetEffect;
    }

    public static final MSEMagicAOERightClickEffect ICE_MAGIC = new MSEMagicAOERightClickEffect(3.25F, 4, 45, MSEMagicEffect.MSEAOEType.ICE, target -> target.setTicksFrozen(450));

    @Override
    public InteractionResultHolder<ItemStack> onRightClick(Level level, Player player, InteractionHand hand)
    {
        ItemStack itemStackIn = player.getItemInHand(hand);

        if(player instanceof ServerPlayer serverPlayer)
            magicAttack(serverPlayer);

        if(player.isCreative())
            player.getCooldowns().addCooldown(itemStackIn.getItem(), 10);
        else
            player.getCooldowns().addCooldown(itemStackIn.getItem(), cooldown);

        player.swing(hand, true);
        itemStackIn.hurtAndBreak(6, player, EquipmentSlot.MAINHAND);
        player.awardStat(Stats.ITEM_USED.get(itemStackIn.getItem()));

        return InteractionResultHolder.success(itemStackIn);
    }

    private void magicAttack(ServerPlayer player)
    {
        BlockPos playerPos = player.blockPosition();
        ServerLevel level = player.serverLevel();

        level.playSound(null, player.getX(), player.getY(), player.getZ(), MSSoundEvents.ITEM_MAGIC_CAST.get(), SoundSource.PLAYERS, 1.0F, 1.2F);

        if(player.isInWall())
            return;

        AABB aabb = new AABB(playerPos).inflate(radius);
        List<LivingEntity> targets = level.getNearbyEntities(LivingEntity.class, visiblePredicate, player, aabb);
        targets.remove(player);

        for(LivingEntity target : targets)
        {
            if(target.isAlliedTo(player))
                continue;

            float talliedDamage = calculateDamage(player, target, damage);
            target.hurt(level.damageSources().indirectMagic(player, player), talliedDamage);

            this.targetEffect.accept(target);
        }

        sendEffectPacket(level, aabb);
    }

    protected void sendEffectPacket(ServerLevel level, AABB aabb) {
        if (this.type != null) {
            Vec3 centerPos = aabb.getCenter();
            Vec3 minAOEBound = new Vec3(aabb.minX, aabb.minY, aabb.minZ);
            Vec3 maxAOEBound = new Vec3(aabb.maxX, aabb.maxY, aabb.maxZ);
            PacketDistributor.sendToPlayersNear(level, (ServerPlayer)null, centerPos.x, centerPos.y, centerPos.z, (double)64.0F, new MSEMagicAOEEffectPacket(this.type, minAOEBound, maxAOEBound), new CustomPacketPayload[0]);
        }

    }
}
