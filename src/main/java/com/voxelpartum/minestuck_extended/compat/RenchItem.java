package com.voxelpartum.minestuck_extended.compat;


import com.simibubi.create.AllTags;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nonnull;

public class RenchItem extends Item {
    public RenchItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        return InteractionResultHolder.pass(player.getItemInHand(usedHand));
    }

    @Nonnull
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        if (player == null || !player.mayBuild())
            return super.useOn(context);

        BlockState state = context.getLevel()
                .getBlockState(context.getClickedPos());
        Block block = state.getBlock();

        if (!(block instanceof IWrenchable actor)) {
            if (player.isShiftKeyDown() && canWrenchPickup(state)){
                dropItem(player);
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.PASS;
        }

        if (player.isShiftKeyDown()){
            dropItem(player);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }



    private boolean canWrenchPickup(BlockState state) {
        return AllTags.AllBlockTags.WRENCH_PICKUP.matches(state);
    }

    private static void dropItem(Player player){
        ItemStack dropItem = player.getItemBySlot(EquipmentSlot.MAINHAND);
        ItemEntity item = new ItemEntity(player.level(), player.getX(), player.getY(), player.getZ(), dropItem.copy());
        item.getItem().setCount(1);
        item.setPickUpDelay(40);
        player.level().addFreshEntity(item);
        player.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.AIR));
    }

}
