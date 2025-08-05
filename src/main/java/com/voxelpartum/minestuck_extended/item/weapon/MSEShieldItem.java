package com.voxelpartum.minestuck_extended.item.weapon;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingShieldBlockEvent;

@EventBusSubscriber(modid = MinestuckExtended.MOD_ID)
public class MSEShieldItem extends ShieldItem {

    public MSEShieldItem(Properties properties) {
        super(properties);
    }

    //...I get the feeling this is incredibly inefficient, but eh
    @SubscribeEvent
    public static void shieldEvent(LivingShieldBlockEvent event){
        if(!event.getEntity().level().isClientSide && event.getEntity() instanceof Player player && player.isBlocking()){

            Item shieldItem = player.getUseItem().getItem();
            if((shieldItem == MSEItems.SHEELD.get() && player.getRandom().nextFloat() >= 0.5f)){
                ItemStack stack = player.getUseItem();
                ItemEntity shield = new ItemEntity(player.level(), player.getX(), player.getY(), player.getZ(), stack.copy());
                shield.getItem().setCount(1);
                shield.setPickUpDelay(40);
                player.level().addFreshEntity(shield);
                stack.shrink(1);
                player.sendSystemMessage(Component.literal("the shittyness of this sheeld causes it to slip out of your hands."));
            }

            if(shieldItem == MSEItems.POGO_SHIELD.get() && !event.getDamageSource().is(DamageTypeTags.BYPASSES_SHIELD)){
                Entity attacker = event.getDamageSource().getDirectEntity();
                if(attacker instanceof LivingEntity target){
                    target.knockback(1, Math.sin(event.getEntity().getYRot()/180 * Math.PI), -Math.cos(event.getEntity().getYRot()/180 * Math.PI));
                }
            }

            if(shieldItem == MSEItems.MAGNET_SHIELD.get() && !event.getDamageSource().is(DamageTypeTags.BYPASSES_SHIELD)){
                Entity attacker = event.getDamageSource().getDirectEntity();
                if(attacker instanceof LivingEntity target && player.getRandom().nextFloat() >= 0.3f){
                    ItemStack stack = target.getItemBySlot(EquipmentSlot.MAINHAND);
                    System.out.println(stack);
                    ItemEntity attackItem = new ItemEntity(target.level(), target.getX(), target.getY(), target.getZ(), stack.copy());
                    attackItem.getItem().setCount(1);
                    attackItem.setPickUpDelay(40);
                    player.level().addFreshEntity(attackItem);
                    stack.shrink(1);
                }
            }

        }
    }

}
