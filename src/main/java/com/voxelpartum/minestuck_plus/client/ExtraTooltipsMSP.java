package com.voxelpartum.minestuck_plus.client;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.util.List;

@EventBusSubscriber(modid = MinestuckPlus.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ExtraTooltipsMSP {

    //This was taken from Minestuck's source code.
    // I'd use a mixin, but if im going to be honest, I don't know how :3c

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    private static void addCustomTooltip(ItemTooltipEvent event)
    {
        ItemStack stack = event.getItemStack();
        handleCustomTooltips(stack, event.getToolTip());
    }

    private static void handleCustomTooltips(ItemStack stack, List<Component> tooltips)
    {
        final ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(stack.getItem());
        if(itemId.getNamespace().equals(MinestuckPlus.MOD_ID))
        {
            String name = stack.getDescriptionId() + ".tooltip";
            if(I18n.exists(name))
                tooltips.add(1, Component.translatable(name).withStyle(ChatFormatting.GRAY));
        }
    }

}
