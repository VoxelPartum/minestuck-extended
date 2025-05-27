package com.voxelpartum.minestuck_plus.inventory.captchalogue;

import com.mraof.minestuck.inventory.captchalogue.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalogue.ModusType;
import com.mraof.minestuck.item.CaptchaCardItem;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.LogicalSide;

public class CatchBallModus extends BaseModus{

    public CatchBallModus(ModusType<? extends CatchBallModus> type, LogicalSide side) {
        super(type, side);
    }

    @Override
    public boolean putItemStack(ServerPlayer player, ItemStack item){
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

    @Override
    public ItemStack getItem(ServerPlayer player, int id, boolean asCard){
        if(id == CaptchaDeckHandler.EMPTY_CARD)
        {
            if(list.size() < size)
            {
                size--;
                markDirty();
                return new ItemStack(MSItems.CAPTCHA_CARD.get());
            } else return ItemStack.EMPTY;
        }

        if(list.isEmpty())
            return ItemStack.EMPTY;

        if(id == CaptchaDeckHandler.EMPTY_SYLLADEX)
        {
            for(ItemStack item : list)
                CaptchaDeckHandler.launchAnyItem(player, item);
            list.clear();
            markDirty();
            return ItemStack.EMPTY;
        }

        if(id < 0 || id >= list.size())
            return ItemStack.EMPTY;

        ItemStack item = list.remove(id);
        markDirty();

        if(asCard)
        {
            size--;
            markDirty();
            CaptchaCardItem.createCardWithItem(item, player.server);
        }

        return ItemStack.EMPTY;
    }

}
