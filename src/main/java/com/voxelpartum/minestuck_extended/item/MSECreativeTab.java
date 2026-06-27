package com.voxelpartum.minestuck_extended.item;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.compat.create.CreateCompat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
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
        output.accept(MSEItems.ITCHY_HAT.get());
        output.accept(MSEItems.DOZE_HAT.get());
        output.accept(MSEItems.TRACE_HAT.get());
        output.accept(MSEItems.CLOVER_HAT.get());
        output.accept(MSEItems.FIN_HAT.get());
        output.accept(MSEItems.DIE_HAT.get());
        output.accept(MSEItems.CROWBAR_HAT.get());
        output.accept(MSEItems.SNOWMAN_HAT.get());
        output.accept(MSEItems.STITCH_HAT.get());
        output.accept(MSEItems.SAWBUCK_HAT.get());
        output.accept(MSEItems.MATCHSTICKS_HAT.get());
        output.accept(MSEItems.EGGS_HAT.get());
        output.accept(MSEItems.BISCUITS_HAT.get());
        output.accept(MSEItems.QUARTERS_HAT.get());
        output.accept(MSEItems.CANS_HAT.get());
        output.accept(MSEItems.CAIRO_OVERCOAT.get());
        output.accept(MSEItems.ORANGE_CREAMSICLE.get());
        output.accept(MSEItems.NORMAL_BROWNIE.get());
        output.accept(MSEItems.NORMALER_BROWNIE.get());
        output.accept(MSEItems.ROULETTE_CARD.get());
        output.accept(MSEItems.ZIP_CARD.get());

        output.accept(MSEItems.SHADOW_CRYSTAL.get());
        output.accept(MSEItems.DELTA_RUNE.get());
        output.accept(MSEItems.LANCER_COOKIE.get());
        output.accept(MSEItems.CINDERBLOCK.get());
        output.accept(MSEItems.ACABRICK.get());
        output.accept(MSEItems.WATER_BALLOON.get());

        output.accept(MSEItems.OVEN_MITT.get());
        output.accept(MSEItems.METAL_GAUNTLET.get());
        output.accept(MSEItems.PRISMARINE_GAUNTLET.get());
        output.accept(MSEItems.STRONG_GLOVES.get());
        output.accept(MSEItems.MANTISBLADE.get());

        output.accept(MSEItems.SHADOW_SWORD.get());
        output.accept(MSEItems.SHOVEL_BLADE.get());
        output.accept(MSEItems.ENERGY_SWORD.get());
        output.accept(MSEItems.BLACK_SHARD.get());
        output.accept(MSEItems.SMUTSWORD.get());
        output.accept(MSEItems.MEMORY_ALLOCATOR.get());
        output.accept(MSEItems.HOPEYGLASSSWORD.get());
        output.accept(MSEItems.HOLYMOONLIGHTSWORD.get());
        output.accept(MSEItems.UNICORN_KNIFE.get());
        output.accept(MSEItems.RUDE_AXE.get());
        output.accept(MSEItems.ROCKSTARS_GUITAR.get());
        output.accept(MSEItems.SOULSPLITTER.get());
        output.accept(MSEItems.SAPPHIRE_LABRYS.get());
        output.accept(MSEItems.SAPPHIC_LABRYS.get());
        output.accept(MSEItems.WHIFFLEBAT.get());
        output.accept(MSEItems.METAL_PAN.get());
        output.accept(MSEItems.HOMERUN_BAT.get());
        output.accept(MSEItems.CLUB_SPIKED.get());
        output.accept(MSEItems.MAGNIFIED_GLASS.get());
        output.accept(MSEItems.EXTENDO_BAT.get());
        output.accept(MSEItems.SPRING_MACE.get());
        output.accept(MSEItems.MARKET_GARDENER.get());
        output.accept(MSEItems.BIT_MUNCHER.get());
        output.accept(MSEItems.BRAIN_FORK.get());
        output.accept(MSEItems.PEARLESCENT_SIXANT.get());
        output.accept(MSEItems.PSIDON_ENTENTE.get());
        output.accept(MSEItems.LANCER.get());
        output.accept(MSEItems.GLAIVE.get());
        output.accept(MSEItems.SHADOWGLAIVE.get());
        output.accept(MSEItems.DEVILS_KNIFE.get());
        output.accept(MSEItems.SEAGRIFT_SCYTHE.get());
        output.accept(MSEItems.GUNSCYTHE.get());
        output.accept(MSEItems.UNICORN_GUN.get());
        output.accept(MSEItems.PRINCESS_WAND.get());
        output.accept(MSEItems.ICE_STAFF.get());
        output.accept(MSEItems.DELTA_TWENTY.get());
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
	output.accept(MSEItems.SKAIA_PC.get());
        output.accept(MSEItems.HOPEYGLASS.get());
        output.accept(MSEItems.HOPEYGLASS_PILLAR.get());
        output.accept(MSEItems.HOPEYGLASS_PANE.get());
        output.accept(MSEItems.RED_HOPEYGLASS.get());
        output.accept(MSEItems.ORANGE_HOPEYGLASS.get());
        output.accept(MSEItems.YELLOW_HOPEYGLASS.get());
        output.accept(MSEItems.LIME_HOPEYGLASS.get());
        output.accept(MSEItems.GREEN_HOPEYGLASS.get());
        output.accept(MSEItems.CYAN_HOPEYGLASS.get());
        output.accept(MSEItems.LIGHT_BLUE_HOPEYGLASS.get());
        output.accept(MSEItems.BLUE_HOPEYGLASS.get());
        output.accept(MSEItems.PURPLE_HOPEYGLASS.get());
        output.accept(MSEItems.MAGENTA_HOPEYGLASS.get());
        output.accept(MSEItems.PINK_HOPEYGLASS.get());
        output.accept(MSEItems.WHITE_HOPEYGLASS.get());
        output.accept(MSEItems.LIGHT_GRAY_HOPEYGLASS.get());
        output.accept(MSEItems.GRAY_HOPEYGLASS.get());
        output.accept(MSEItems.BLACK_HOPEYGLASS.get());
        output.accept(MSEItems.BROWN_HOPEYGLASS.get());
        output.accept(MSEItems.DEPTHS_HOPEYGLASS.get());
        output.accept(MSEItems.RED_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.ORANGE_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.YELLOW_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.LIME_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.GREEN_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.CYAN_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.LIGHT_BLUE_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.BLUE_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.PURPLE_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.MAGENTA_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.PINK_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.WHITE_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.LIGHT_GRAY_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.GRAY_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.BLACK_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.BROWN_HOPEYGLASS_PANE.get());
        output.accept(MSEItems.DEPTHS_HOPEYGLASS_PANE.get());

        output.accept(MSEItems.DIAMOND_LICHEN.get());
        output.accept(MSEItems.CRUXITE_LICHEN.get());
        output.accept(MSEItems.URANIUM_LICHEN.get());

        output.accept(MSEItems.PLUSH_VRISKA.get());
        output.accept(MSEItems.PLUSH_NEPETA.get());
        output.accept(MSEItems.PLUSH_GENESIS_FROG.get());
        output.accept(MSEItems.PLUSH_SPADES_SLICK.get());
        output.accept(MSEItems.PLUSH_HEARTS_BOXCARS.get());
        output.accept(MSEItems.PLUSH_DIAMONDS_DROOG.get());
        output.accept(MSEItems.PLUSH_CLUBS_DEUCE.get());

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

        output.accept(MSEItems.HEADBAND.get());

        output.accept(MSEItems.ARADIA_HORNS.get());
        output.accept(MSEItems.TAVROS_HORNS.get());
        output.accept(MSEItems.SOLLUX_HORNS.get());
        output.accept(MSEItems.KARKAT_HORNS.get());
        output.accept(MSEItems.NEPETA_HORNS.get());
        output.accept(MSEItems.KANAYA_HORNS.get());
        output.accept(MSEItems.TEREZI_HORNS.get());
        output.accept(MSEItems.VRISKA_HORNS.get());
        output.accept(MSEItems.EQUIUS_HORNS.get());
        output.accept(MSEItems.GAMZEE_HORNS.get());
        output.accept(MSEItems.ERIDAN_HORNS.get());
        output.accept(MSEItems.FEFERI_HORNS.get());
        output.accept(MSEItems.HORUSS_HORNS.get());

        output.accept(MSEItems.VETHES_HORNS.get());
        output.accept(MSEItems.HERESA_HORNS.get());
        output.accept(MSEItems.METTAX_HORNS.get());
        output.accept(MSEItems.NELUMI_HORNS.get());
        output.accept(MSEItems.DRAYTH_HORNS.get());
        output.accept(MSEItems.LORKES_HORNS.get());
        output.accept(MSEItems.ARAMIA_HORNS.get());
        output.accept(MSEItems.MIRALA_HORNS.get());
        output.accept(MSEItems.AVRIIL_HORNS.get());
        output.accept(MSEItems.PISCAL_HORNS.get());
        output.accept(MSEItems.GALAAD_HELMET.get());

        output.accept(MSEItems.AZONYP_HORNS.get());
        output.accept(MSEItems.FRELSI_HORNS.get());
        output.accept(MSEItems.ACHLYS_HORNS.get());
        output.accept(MSEItems.RENARD_HORNS.get());
        output.accept(MSEItems.INANIS_HORNS.get());
        output.accept(MSEItems.DEVROS_HORNS.get());
        output.accept(MSEItems.FAHRAD_HORNS.get());
        output.accept(MSEItems.NEYHIL_HORNS.get());
        output.accept(MSEItems.VERISI_HORNS.get());

        output.accept(MSEItems.NERIUS_HORNS.get());
        output.accept(MSEItems.STYBOL_HORNS.get());
        output.accept(MSEItems.JENSIS_HORNS.get());
        output.accept(MSEItems.PHANES_HORNS.get());
        output.accept(MSEItems.MAGNEA_HORNS.get());

        if(ModList.get().isLoaded("create")){
            output.accept(CreateCompat.RENCH.get());
            output.accept(CreateCompat.DEADRINGER.get());
            output.accept(CreateCompat.MECHANICAL_CHAINSAW.get());
        }

    }



}
