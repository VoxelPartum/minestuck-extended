package com.voxelpartum.minestuck_plus.item.projectile;

import com.mraof.minestuck.entity.MSEntityTypes;
import com.mraof.minestuck.entity.item.ConsumableProjectileEntity;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MSPConsumableProjectile extends ConsumableProjectileWeaponItem {

    public final SoundEvent sound;

    public MSPConsumableProjectile(Properties properties, float velocity, float accuracy, int damage, SoundEvent sound) {
        super(properties, velocity, accuracy, damage);
        this.sound = sound;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerIn, InteractionHand handIn){
        ItemStack item = playerIn.getItemInHand(handIn);

        level.playSound(null, playerIn.getX(), playerIn.getY(), playerIn.getZ(), this.sound, SoundSource.PLAYERS, 0.8F, 1.5F);

        if(!level.isClientSide)
        {
            ConsumableProjectileEntity projectileEntity = new ConsumableProjectileEntity(MSEntityTypes.CONSUMABLE_PROJECTILE.get(), playerIn, level);
            projectileEntity.setItem(item);
            projectileEntity.shootFromRotation(playerIn, playerIn.getXRot(), playerIn.getYRot(), 0.0F, velocity, accuracy);
            level.addFreshEntity(projectileEntity);
        }
        if(!playerIn.isCreative())
        {
            item.shrink(1);
        }

        playerIn.getCooldowns().addCooldown(this, 7);
        playerIn.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResultHolder.success(item);
    }
}
