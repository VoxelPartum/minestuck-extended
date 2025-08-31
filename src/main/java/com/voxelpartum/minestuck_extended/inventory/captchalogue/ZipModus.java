package com.voxelpartum.minestuck_extended.inventory.captchalogue;

import com.mraof.minestuck.inventory.captchalogue.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalogue.ModusType;
import com.mraof.minestuck.item.CaptchaCardItem;
import com.mraof.minestuck.item.MSItems;
import com.voxelpartum.minestuck_extended.MinestuckExtendedConfig;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.BundleContents;
import net.neoforged.fml.LogicalSide;

public class ZipModus extends BaseModus{

    public ZipModus(ModusType<? extends BaseModus> type, LogicalSide side) {
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

    @Override
    public ItemStack getItem(ServerPlayer player, int id, boolean asCard)
    {
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

        if(id == CaptchaDeckHandler.EMPTY_SYLLADEX) {
            for(ItemStack item : list)
                CaptchaDeckHandler.launchAnyItem(player, item);
            list.clear();
            markDirty();
            return ItemStack.EMPTY;
        }

        if(id < 0 || id >= list.size())
            return ItemStack.EMPTY;

        NonNullList<ItemStack> gottenItems = NonNullList.create();

        int maxBack = Math.max(0, id - MinestuckExtendedConfig.SERVER.zipSize.get());
        int maxFront = Math.min(list.size()-1, id+MinestuckExtendedConfig.SERVER.zipSize.get());

        for(int i = 0; i < maxFront-maxBack+1; i++){
            gottenItems.add(asCard ? CaptchaCardItem.createCardWithItem(list.remove(maxBack), player.server) : list.remove(maxBack));
        }

        if(asCard){
            size-=gottenItems.size();
        }

        markDirty();

        ItemStack zipItem = new ItemStack(MSEItems.ZIP_BUNDLE.get());
        zipItem.set(DataComponents.BUNDLE_CONTENTS, new BundleContents(gottenItems));

        return zipItem;
    }
}