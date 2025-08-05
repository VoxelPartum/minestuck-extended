package com.voxelpartum.minestuck_plus.item;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.compat.CreateCompat;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class MSPCreativeTab {

    public static final String PLUS_KEY = "minestuck_plus.item_group.main";

    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinestuckPlus.MOD_ID);

    public static final Supplier<CreativeModeTab> MAIN = REGISTER.register("main",()-> CreativeModeTab.builder()
            .title(Component.translatable(PLUS_KEY)).icon(()->new ItemStack(MSPItems.ROULETTE_CARD.get())).displayItems(MSPCreativeTab::buildMain).build());


    private static void buildMain(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output){

        //output.accept(MSPItems.GRIST_DISPLAY.get());

        output.accept(MSPItems.BEAGLEPUSS.get());
        output.accept(MSPItems.DISGUISE.get());
        output.accept(MSPItems.BEAGLEPISS.get());
        output.accept(MSPItems.TESTIFIPUSS.get());
        output.accept(MSPItems.ORANGE_CREAMSICLE.get());
        output.accept(MSPItems.NORMAL_BROWNIE.get());
        output.accept(MSPItems.NORMALER_BROWNIE.get());
        output.accept(MSPItems.ROULETTE_CARD.get());

        output.accept(MSPItems.SHADOW_CRYSTAL.get());
        output.accept(MSPItems.DELTA_RUNE.get());
        output.accept(MSPItems.LANCER_COOKIE.get());
        output.accept(MSPItems.CINDERBLOCK.get());
        output.accept(MSPItems.ACABRICK.get());


        output.accept(MSPItems.SHADOW_SWORD.get());
        output.accept(MSPItems.SHOVEL_BLADE.get());
        output.accept(MSPItems.ENERGY_SWORD.get());
        output.accept(MSPItems.RUDE_AXE.get());
        output.accept(MSPItems.ROCKSTARS_GUITAR.get());
        output.accept(MSPItems.SOULSPLITTER.get());
        output.accept(MSPItems.WHIFFLEBAT.get());
        output.accept(MSPItems.METAL_PAN.get());
        output.accept(MSPItems.HOMERUN_BAT.get());
        output.accept(MSPItems.CLUB_SPIKED.get());
        output.accept(MSPItems.SPRING_MACE.get());
        output.accept(MSPItems.MARKET_GARDENER.get());
        output.accept(MSPItems.LANCER.get());
        output.accept(MSPItems.DEVILS_KNIFE.get());
        output.accept(MSPItems.PRINCESS_WAND.get());
        output.accept(MSPItems.SHEELD.get());
        output.accept(MSPItems.POGO_SHIELD.get());
        output.accept(MSPItems.MAGNET_SHIELD.get());

        output.accept(MSPItems.SPIROGRAPH_ARMOR_TRIM.get());
        output.accept(MSPItems.BREATH_ARMOR_TRIM.get());
        output.accept(MSPItems.LIFE_ARMOR_TRIM.get());
        output.accept(MSPItems.LIGHT_ARMOR_TRIM.get());
        output.accept(MSPItems.TIME_ARMOR_TRIM.get());
        output.accept(MSPItems.HEART_ARMOR_TRIM.get());
        output.accept(MSPItems.RAGE_ARMOR_TRIM.get());
        output.accept(MSPItems.BLOOD_ARMOR_TRIM.get());
        output.accept(MSPItems.DOOM_ARMOR_TRIM.get());
        output.accept(MSPItems.VOID_ARMOR_TRIM.get());
        output.accept(MSPItems.SPACE_ARMOR_TRIM.get());
        output.accept(MSPItems.MIND_ARMOR_TRIM.get());
        output.accept(MSPItems.HOPE_ARMOR_TRIM.get());

        output.accept(MSPItems.CHESS_TILE.get());
        output.accept(MSPItems.DIAMOND_LICHEN.get());
        output.accept(MSPItems.PLUSH_VRISKA.get());
        output.accept(MSPItems.PLUSH_SALAMANDER.get());
        output.accept(MSPItems.PLUSH_NAKAGATOR.get());
        output.accept(MSPItems.PLUSH_IGUANA.get());
        output.accept(MSPItems.PLUSH_TURTLE.get());
        output.accept(MSPItems.PLUSH_MUTATED_CAT.get());
        output.accept(MSPItems.SCALEMATE_APPLESCAB.get());
        output.accept(MSPItems.SCALEMATE_BERRYBREATH.get());
        output.accept(MSPItems.SCALEMATE_CINNAMONWHIFF.get());
        output.accept(MSPItems.SCALEMATE_HONEYTONGUE.get());
        output.accept(MSPItems.SCALEMATE_LEMONSNOUT.get());
        output.accept(MSPItems.SCALEMATE_PINESNORT.get());
        output.accept(MSPItems.SCALEMATE_PUCEFOOT.get());
        output.accept(MSPItems.SCALEMATE_PUMPKINSNUFFLE.get());
        output.accept(MSPItems.SCALEMATE_PYRALSPITE.get());
        output.accept(MSPItems.SCALEMATE_WITNESS.get());

        if(ModList.get().isLoaded("create")){
            output.accept(CreateCompat.RENCH.get());
            output.accept(CreateCompat.DEADRINGER.get());
            output.accept(CreateCompat.MECHANICAL_CHAINSAW.get());
        }

        if(ModList.get().isLoaded("farmersdelight")){
            for(Supplier<Item> item : FDCompatItems.CREATIVE_TAB_ITEMS){
                output.accept(item.get());
            }
        }

    }



}
