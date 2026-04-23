package com.voxelpartum.minestuck_extended.inventory.captchalogue;

import com.mraof.minestuck.inventory.captchalogue.CaptchaDeckHandler;
import com.mraof.minestuck.inventory.captchalogue.Modus;
import com.mraof.minestuck.inventory.captchalogue.ModusType;
import com.mraof.minestuck.item.CaptchaCardItem;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.util.MSSoundEvents;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.LogicalSide;

import java.util.Iterator;

public class RouletteModus extends Modus {

    protected NonNullList<ItemStack> list;

    // client only
    protected boolean changed;
    protected NonNullList<ItemStack> items;

    public RouletteModus(ModusType<? extends RouletteModus> type, LogicalSide side) {
        super(type, side);
    }

    @Override
    public void initModus(ItemStack modusItem, ServerPlayer player, NonNullList<ItemStack> prev, int size)
    {
        list = NonNullList.create();
        if(prev != null) list.addAll(prev);
        while(list.size() < size) list.add(ItemStack.EMPTY);

        if(side == LogicalSide.CLIENT)
        {
            items = NonNullList.create();
            changed = true;
        }
    }

    @Override
    public void readFromNBT(CompoundTag nbt, HolderLookup.Provider provider)
    {
        int size = nbt.getInt("size");
        list = NonNullList.create();
        for(int i = 0; i < size; i++)
        {
            if(nbt.contains("item" + i, Tag.TAG_COMPOUND))
                list.add(ItemStack.parse(provider, nbt.getCompound("item" + i)).orElseThrow());
            else list.add(ItemStack.EMPTY);
        }
        if(side == LogicalSide.CLIENT)
        {
            if(items == null) items = NonNullList.create();
            changed = true;
        }
    }

    @Override
    public CompoundTag writeToNBT(CompoundTag nbt, HolderLookup.Provider provider)
    {
        nbt.putInt("size", list.size());
        Iterator<ItemStack> iterator = list.iterator();
        for(int i = 0; i < list.size(); i++)
        {
            ItemStack stack = iterator.next();
            if(!stack.isEmpty()) nbt.put("item" + i, stack.save(provider));
        }
        return nbt;
    }

    @Override
    public boolean putItemStack(ServerPlayer player, ItemStack item)
    {
        if(list.isEmpty() || item.isEmpty()) return false;

        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).isEmpty())
            {
                list.set(i, item);
                markDirty();
                return true;
            }
        }

        CaptchaDeckHandler.launchItem(player, list.get(0));
        list.set(0, item);
        markDirty();
        return true;
    }

    @Override
    public ItemStack getItem(ServerPlayer player, int id, boolean asCard)
    {
        if(id == CaptchaDeckHandler.EMPTY_CARD) return ItemStack.EMPTY;
        if(list.isEmpty()) return ItemStack.EMPTY;
        if(id == CaptchaDeckHandler.EMPTY_SYLLADEX)
        {
            player.level().playSound(null, player.getX(), player.getY(), player.getZ(), MSSoundEvents.EVENT_CAPTCHALOGUE_SHUFFLE.get(), SoundSource.AMBIENT, 1F, 1F);
            for(int i = 0; i < list.size(); i++)
                if(!list.get(i).isEmpty())
                {
                    CaptchaDeckHandler.ejectAnyItem(player, list.get(i));
                    list.set(i, ItemStack.EMPTY);
                    markDirty();
                }
            return ItemStack.EMPTY;
        }

        id = id % list.size();
        ItemStack item = list.get(id);

        if(asCard)
        {
            list.remove(id);
            markDirty();
            if(item.isEmpty()) return new ItemStack(MSItems.CAPTCHA_CARD.get());
            else return CaptchaCardItem.createCardWithItem(item, player.server);
        } else
        {
            list.set(id, ItemStack.EMPTY);
            markDirty();
            return item;
        }
    }

    @Override
    public boolean increaseSize(ServerPlayer player)
    {
        if(hasHitMaxCards(player, list.size()))
        {
            player.displayClientMessage(Component.translatable(CAPTCHA_LIMIT), true);
            return false;
        }

        list.add(ItemStack.EMPTY);
        markDirty();
        return true;
    }

    private void fillList(NonNullList<ItemStack> items)
    {
        items.clear();
        items.addAll(list);
    }

    @Override
    public NonNullList<ItemStack> getItems()
    {
        if(side == LogicalSide.SERVER)
        {
            NonNullList<ItemStack> items = NonNullList.create();
            fillList(items);
            return items;
        }

        if(changed) fillList(items);

        return items;
    }

    @Override
    public boolean canSwitchFrom(Modus modus)
    {
        return false;
    }

    @Override
    public int getSize()
    {
        return list.size();
    }

}