package com.voxelpartum.minestuck_extended.inventory.captchalogue;

import com.mraof.minestuck.inventory.captchalogue.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalogue.ModusType;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.LogicalSide;

public class RouletteModus extends BaseModus
{

    public RouletteModus(ModusType<? extends RouletteModus> type, LogicalSide side)
    {
        super(type, side);
    }

    @Override
    public boolean putItemStack(ServerPlayer player, ItemStack item)
    {
        if(size <= list.size() || item.isEmpty())
            return false;

        for(ItemStack stack : list)
            if(stack.getItem() == item.getItem())
            {
                CaptchaDeckHandler.launchItem(player, item);
                return true;
            }

        list.add(item);
        markDirty();

        return true;
    }
}