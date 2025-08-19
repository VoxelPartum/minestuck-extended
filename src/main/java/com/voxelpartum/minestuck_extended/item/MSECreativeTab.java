package com.voxelpartum.minestuck_extended.item;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.compat.CreateCompat;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class MSECreativeTab {

    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinestuckExtended.MOD_ID);

    public static final Supplier<CreativeModeTab> MAIN = REGISTER.register("main",()-> CreativeModeTab.builder()
            .title(Component.translatable("minestuck_extended.item_group.main")).icon(()->new ItemStack(MSEItems.ROULETTE_CARD.get())).displayItems(MSECreativeTab::buildMain).build());


    private static void buildMain(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output){

        output.accept(MSEItems.BEAGLEPUSS.get());
        output.accept(MSEItems.DISGUISE.get());
        output.accept(MSEItems.BEAGLEPISS.get());
        output.accept(MSEItems.TESTIFIPUSS.get());
        output.accept(MSEItems.SCARLET_SUNGLASSES.get());
        output.accept(MSEItems.ORANGE_CREAMSICLE.get());
        output.accept(MSEItems.NORMAL_BROWNIE.get());
        output.accept(MSEItems.NORMALER_BROWNIE.get());
        output.accept(MSEItems.ROULETTE_CARD.get());
        output.accept(MSEItems.ZIP_CARD.get());
        output.accept(MSEItems.ARRAY_CARD.get());

        output.accept(MSEItems.SHADOW_CRYSTAL.get());
        output.accept(MSEItems.DELTA_RUNE.get());
        output.accept(MSEItems.LANCER_COOKIE.get());
        output.accept(MSEItems.CINDERBLOCK.get());
        output.accept(MSEItems.ACABRICK.get());


        output.accept(MSEItems.SHADOW_SWORD.get());
        output.accept(MSEItems.SHOVEL_BLADE.get());
        output.accept(MSEItems.ENERGY_SWORD.get());
        output.accept(MSEItems.MEMORY_ALLOCATOR.get());
        output.accept(MSEItems.RUDE_AXE.get());
        output.accept(MSEItems.ROCKSTARS_GUITAR.get());
        output.accept(MSEItems.SOULSPLITTER.get());
        output.accept(MSEItems.WHIFFLEBAT.get());
        output.accept(MSEItems.METAL_PAN.get());
        output.accept(MSEItems.HOMERUN_BAT.get());
        output.accept(MSEItems.CLUB_SPIKED.get());
        output.accept(MSEItems.SPRING_MACE.get());
        output.accept(MSEItems.MARKET_GARDENER.get());
        output.accept(MSEItems.BIT_MUNCHER.get());
        output.accept(MSEItems.LANCER.get());
        output.accept(MSEItems.DEVILS_KNIFE.get());
        output.accept(MSEItems.SEAGRIFT_SCYTHE.get());
        output.accept(MSEItems.PRINCESS_WAND.get());
        output.accept(MSEItems.FLUORITE_ICOSAHEDRON.get());
        output.accept(MSEItems.SHEELD.get());
        output.accept(MSEItems.POGO_SHIELD.get());
        output.accept(MSEItems.MAGNET_SHIELD.get());

        output.accept(MSEItems.SPIROGRAPH_ARMOR_TRIM.get());
        output.accept(MSEItems.BREATH_ARMOR_TRIM.get());
        output.accept(MSEItems.LIFE_ARMOR_TRIM.get());
        output.accept(MSEItems.LIGHT_ARMOR_TRIM.get());
        output.accept(MSEItems.TIME_ARMOR_TRIM.get());
        output.accept(MSEItems.HEART_ARMOR_TRIM.get());
        output.accept(MSEItems.RAGE_ARMOR_TRIM.get());
        output.accept(MSEItems.BLOOD_ARMOR_TRIM.get());
        output.accept(MSEItems.DOOM_ARMOR_TRIM.get());
        output.accept(MSEItems.VOID_ARMOR_TRIM.get());
        output.accept(MSEItems.SPACE_ARMOR_TRIM.get());
        output.accept(MSEItems.MIND_ARMOR_TRIM.get());
        output.accept(MSEItems.HOPE_ARMOR_TRIM.get());
        
        output.accept(MSEItems.CHESS_TILE.get());
        output.accept(MSEItems.DIAMOND_LICHEN.get());
        output.accept(MSEItems.PLUSH_VRISKA.get());
        output.accept(MSEItems.PLUSH_SALAMANDER.get());
        output.accept(MSEItems.PLUSH_NAKAGATOR.get());
        output.accept(MSEItems.PLUSH_IGUANA.get());
        output.accept(MSEItems.PLUSH_TURTLE.get());
        output.accept(MSEItems.PLUSH_MUTATED_CAT.get());
        output.accept(MSEItems.SCALEMATE_APPLESCAB.get());
        output.accept(MSEItems.SCALEMATE_BERRYBREATH.get());
        output.accept(MSEItems.SCALEMATE_CINNAMONWHIFF.get());
        output.accept(MSEItems.SCALEMATE_HONEYTONGUE.get());
        output.accept(MSEItems.SCALEMATE_LEMONSNOUT.get());
        output.accept(MSEItems.SCALEMATE_PINESNORT.get());
        output.accept(MSEItems.SCALEMATE_PUCEFOOT.get());
        output.accept(MSEItems.SCALEMATE_PUMPKINSNUFFLE.get());
        output.accept(MSEItems.SCALEMATE_PYRALSPITE.get());
        output.accept(MSEItems.SCALEMATE_WITNESS.get());

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
