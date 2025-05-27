package com.voxelpartum.minestuck_plus.item;

import com.mraof.minestuck.item.MSItems;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.block.MSPBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class MSPCreativeTab {

    public static final String PLUS_KEY = "minestuck_plus.item_group.main";

    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinestuckPlus.MOD_ID);

    public static final Supplier<CreativeModeTab> MAIN = REGISTER.register("main",()-> CreativeModeTab.builder()
            .title(Component.translatable(PLUS_KEY)).icon(()->new ItemStack(MSPItems.ROULETTE_CARD.get())).displayItems(MSPCreativeTab::buildMain).build());


    private static void buildMain(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output){

        output.accept(MSPItems.BEAGLEPUSS.get());
        output.accept(MSPItems.DISGUISE.get());
        output.accept(MSPItems.BEAGLEPISS.get());
        output.accept(MSPItems.TESTIFIPUSS.get());
        output.accept(MSPItems.CATCHBALL.get());
        output.accept(MSPItems.CATCHBALL_CARD.get());
        output.accept(MSPItems.ROULETTE_CARD.get());
        output.accept(MSPItems.CHAT_CARD.get());
        output.accept(MSPItems.CINDERBLOCK.get());
        output.accept(MSPItems.ACABRICK.get());


        output.accept(MSPItems.SHADOW_CRYSTAL.get());
        output.accept(MSPItems.SHADOW_SWORD.get());
        output.accept(MSPItems.RUDE_AXE.get());

    }

}
