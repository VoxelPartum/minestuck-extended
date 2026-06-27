package com.voxelpartum.minestuck_extended.item.weapon;

import com.mraof.minestuck.item.weapon.MagicRangedRightClickEffect;
import com.mraof.minestuck.util.MSSoundEvents;
import com.voxelpartum.minestuck_extended.network.MSEMagicRangedEffectPacket;
import com.voxelpartum.minestuck_extended.util.MSESoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.PacketDistributor;


import javax.annotation.Nullable;
import java.util.function.Supplier;

public class MSEMagicRangedRightClickEffect extends MagicRangedRightClickEffect {

    private static final TargetingConditions visiblePredicate = TargetingConditions.forCombat();

    public static final MagicRangedRightClickEffect GUN_MAGIC = new MSEMagicRangedRightClickEffect(30, 10, null, MSESoundEvents.SHOOT, 1.0F, MSEMagicEffect.MSERangedType.GUN);
    public static final MagicRangedRightClickEffect MOONSWORD_MAGIC = new MSEMagicRangedRightClickEffect(20, 5, null, MSSoundEvents.ITEM_MAGIC_CAST, 1.0F, MSEMagicEffect.MSERangedType.MOONSWORD);

    private final int distance;
    private final int damage;
    private final Supplier<MobEffectInstance> effect;
    private final Supplier<SoundEvent> sound;
    private final float pitch;
    @Nullable
    private final MSEMagicEffect.MSERangedType type;

    public MSEMagicRangedRightClickEffect(int distance, int damage, Supplier<MobEffectInstance> effect, Supplier<SoundEvent> sound, float pitch, MSEMagicEffect.@org.jetbrains.annotations.Nullable MSERangedType mseRangedType) {
        super(distance, damage, effect, sound, pitch, null);
        this.distance = distance;
        this.damage = damage;
        this.effect = effect;
        this.sound = sound;
        this.pitch = pitch;
        this.type = mseRangedType;
    }

    @Override
    public InteractionResultHolder<ItemStack> onRightClick(Level level, Player player, InteractionHand hand)
    {
        ItemStack itemStackIn = player.getItemInHand(hand);

        if(player instanceof ServerPlayer serverPlayer)
            magicAttack(serverPlayer);

        if(player.isCreative())
            player.getCooldowns().addCooldown(itemStackIn.getItem(), 10);
        else
            player.getCooldowns().addCooldown(itemStackIn.getItem(), 50);

        player.swing(hand, true);
        itemStackIn.hurtAndBreak(6, player, EquipmentSlot.MAINHAND);
        player.awardStat(Stats.ITEM_USED.get(itemStackIn.getItem()));

        return InteractionResultHolder.success(itemStackIn);
    }

    private void magicAttack(ServerPlayer player)
    {
        ServerLevel level = player.serverLevel();
        level.playSound(null, player.getX(), player.getY(), player.getZ(), sound.get(), SoundSource.PLAYERS, 1.0F, 1.0F);

        targetEffect(player);

        Vec3 eyePos = player.getEyePosition(1.0F);
        Vec3 lookVec = player.getLookAngle();

        for(int step = 0; step < distance * 2; step++)
        {
            Vec3 vecPos = eyePos.add(lookVec.scale(step / 2D));

            boolean hitObstacle = checkCollisionInPath(level, player, vecPos);

            if(hitObstacle)
            {
                sendEffectPacket(level, eyePos, lookVec, step, true);
                return;
            }
        }
        sendEffectPacket(level, eyePos, lookVec, distance * 2, false);
    }

    private boolean checkCollisionInPath(Level level, ServerPlayer player, Vec3 vecPos)
    {
        BlockPos blockPos = BlockPos.containing(vecPos);

        if(!level.getBlockState(blockPos).isPathfindable(PathComputationType.LAND))
        {
            return true;
        }

        AABB axisAlignedBB = new AABB(blockPos);
        LivingEntity closestTarget = player.level().getNearestEntity(LivingEntity.class, visiblePredicate, player, vecPos.x, vecPos.y, vecPos.z, axisAlignedBB);
        if(closestTarget != null)
        {
            float talliedDamage = calculateDamage(player, closestTarget, damage);
            closestTarget.hurt(level.damageSources().indirectMagic(player, player), talliedDamage);

            if(effect != null && player.getRandom().nextFloat() < .25F)
                closestTarget.addEffect(effect.get());

            return true;
        } else return false;
    }

    @Override
    protected void sendEffectPacket(ServerLevel level, Vec3 pos, Vec3 lookVec, int length, boolean collides)
    {
        if(type != null)
            PacketDistributor.sendToPlayersNear(level, null, pos.x, pos.y, pos.z, 64,
                    new MSEMagicRangedEffectPacket(type, pos, lookVec, length, collides));
    }

}