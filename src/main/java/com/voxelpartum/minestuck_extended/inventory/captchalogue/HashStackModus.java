package com.voxelpartum.minestuck_extended.inventory.captchalogue;

import com.mraof.minestuck.inventory.captchalogue.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalogue.ModusType;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.LogicalSide;


public class HashStackModus extends BaseModus{

    public boolean ejectByChat = true;

    public HashStackModus(ModusType<? extends BaseModus> type, LogicalSide side) {
        super(type, side);
    }

    @Override
    public void initModus(ItemStack modusItem, ServerPlayer player, NonNullList<ItemStack> prev, int size){
        super.initModus(modusItem, player, prev, size);
    }

    @Override
    public boolean putItemStack(ServerPlayer player, ItemStack item)
    {
        if(size <= list.size() || item.isEmpty())
            return false;


        String itemName = BuiltInRegistries.ITEM.getKey(item.getItem()).getPath().replace('_', ' ');
        Component customName = item.get(DataComponents.CUSTOM_NAME);
        System.out.println(size);

        int index = ((customName != null) ? customName.getString() : itemName).hashCode() % size;

        if(index < 0)
            index += list.size();

        if(!list.get(index).isEmpty())
        {
            ItemStack otherItem = list.get(index);
            if(ItemStack.isSameItemSameComponents(otherItem, item)
                    && otherItem.getCount() + item.getCount() <= otherItem.getMaxStackSize())
            {
                otherItem.grow(item.getCount());
                markDirty();
                return true;
            } else CaptchaDeckHandler.launchItem(player, list.get(index));
        }

        list.add(item);
        markDirty();

        player.sendSystemMessage(Component.translatable("minestuck.hash_map", item.getDisplayName(), getSize(), index));

        return true;
    }

}
