package com.voxelpartum.minestuck_extended.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.compat.create.CreateCompat;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;

import static com.mraof.minestuck.api.alchemy.GristTypes.*;

public final class MSEGristCostsProvider {

    public static void buildRecipes(RecipeOutput recipeSaver){

        //Vanilla blocks/items
        GristCostRecipeBuilder.of(Items.HORN_CORAL_BLOCK).grist(AMBER,4).grist(BUILD, 2).grist(COBALT, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.HORN_CORAL).grist(AMBER,4).grist(COBALT, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.HORN_CORAL_FAN).grist(AMBER,3).grist(COBALT, 1).grist(CHALK, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.DEAD_HORN_CORAL_BLOCK).grist(BUILD, 8).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.DEAD_HORN_CORAL).grist(CHALK,1).grist(COBALT, 1).grist(AMBER, 3).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.DEAD_HORN_CORAL_FAN).grist(BUILD, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.FROGSPAWN).grist(IODINE, 5).grist(COBALT, 5).grist(AMBER, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.PIGLIN_HEAD).grist(CHALK, 25).grist(RUST, 8).grist(GOLD, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.AXOLOTL_BUCKET).grist(RUST, 27).grist(COBALT, 6).grist(GARNET, 1).grist(CHALK, 5).grist(AMBER, 4).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.TADPOLE_BUCKET).grist(IODINE, 5).grist(RUST, 27).grist(COBALT, 11).grist(AMBER, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.MUSIC_DISC_CREATOR_MUSIC_BOX).grist(BUILD, 15).grist(CAULK, 8).grist(IODINE, 5).grist(GOLD, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.MUSIC_DISC_CREATOR).grist(BUILD, 15).grist(CAULK, 8).grist(SHALE, 5).grist(GOLD, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.MUSIC_DISC_PRECIPICE).grist(BUILD, 15).grist(CAULK, 8).grist(SHALE, 5).grist(DIAMOND, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.MUSIC_DISC_OTHERSIDE).grist(BUILD, 15).grist(CAULK, 8).grist(DIAMOND, 5).grist(URANIUM, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.BREEZE_ROD).grist(URANIUM, 4).grist(SHALE, 40).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.ARMADILLO_SCUTE).grist(AMBER, 5).grist(IODINE, 4).grist(SHALE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(Items.HEAVY_CORE).grist(BUILD, 25).grist(SHALE, 128).grist(URANIUM, 50).grist(MERCURY, 100).build(recipeSaver);


        GristCostRecipeBuilder.of(MSItems.BREADCRUMBS.get()).grist(AMBER,1).grist(IODINE,1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DIAMOND_LICHEN.get()).grist(DIAMOND, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CRUXITE_LICHEN.get()).grist(BUILD, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.URANIUM_LICHEN.get()).grist(URANIUM, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SHADOW_CRYSTAL.get()).grist(AMETHYST,4).grist(TAR,5).grist(QUARTZ,1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ROULETTE_CARD.get()).grist(BUILD, 300).grist(COBALT, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ZIP_CARD.get()).grist(BUILD, 333).grist(MARBLE, 62).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BEAGLEPUSS.get()).grist(BUILD, 5).grist(AMBER, 1).grist(CHALK, 5).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.TESTIFIPUSS.get()).grist(URANIUM, 5).grist(BUILD, 20).grist(SHALE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BEAGLEPISS.get()).grist(AMBER, 50).grist(GOLD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DISGUISE.get()).grist(BUILD, 20).grist(AMBER, 5).grist(CHALK, 20).grist(IODINE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SCARLET_SUNGLASSES.get()).grist(BUILD, 50).grist(GARNET, 62).grist(RUBY, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ITCHY_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DOZE_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.TRACE_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CLOVER_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.FIN_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DIE_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CROWBAR_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SNOWMAN_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.STITCH_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SAWBUCK_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MATCHSTICKS_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.EGGS_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BISCUITS_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.QUARTERS_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CANS_HAT.get()).grist(BUILD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CAIRO_OVERCOAT.get()).grist(BUILD, 10000).grist(AMBER, 1000).grist(CAULK, 1000).grist(CHALK, 1000)
                .grist(IODINE, 1000).grist(SHALE, 1000).grist(TAR, 1000).grist(COBALT, 1000).grist(MARBLE, 1000)
                .grist(MERCURY, 1000).grist(QUARTZ, 1000).grist(SULFUR, 1000).grist(AMETHYST, 1000).grist(GARNET, 1000)
                .grist(RUBY, 1000).grist(RUST, 1000).grist(DIAMOND, 1000).grist(GOLD, 1000).grist(URANIUM, 1000)
                .grist(ARTIFACT, 1000).grist(ZILLIUM, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CINDERBLOCK.get()).grist(BUILD, 2).grist(CAULK, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ACABRICK.get()).grist(BUILD, 5).grist(SHALE, 5).grist(CHALK, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.LANCER_COOKIE.get()).grist(AMBER, 1).grist(IODINE, 1).grist(COBALT, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DELTA_RUNE.get()).grist(AMBER, 1).grist(IODINE, 1).grist(COBALT, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ORANGE_CREAMSICLE.get()).grist(AMBER, 2).grist(GARNET, 2).grist(CHALK, 4).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.NORMAL_BROWNIE.get()).grist(AMBER, 4).grist(IODINE, 4).grist(URANIUM, 64).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.NORMALER_BROWNIE.get()).grist(AMBER, 8).grist(IODINE, 8).grist(URANIUM, 128).build(recipeSaver);

        //Weapons:
        GristCostRecipeBuilder.of(MSEItems.METAL_GAUNTLET.get()).grist(CHALK, 20).grist(RUST, 100).grist(IODINE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PRISMARINE_GAUNTLET.get()).grist(BUILD, 50).grist(COBALT, 15).grist(MARBLE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.STRONG_GLOVES.get()).grist(BUILD, 400).grist(CHALK, 150).grist(GOLD, 50).grist(TAR, 200).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MANTISBLADE.get()).grist(BUILD, 400).grist(RUBY, 150).grist(TAR, 200).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.SHADOW_SWORD.get()).grist(BUILD, 250).grist(TAR, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SHOVEL_BLADE.get()).grist(BUILD, 1500).grist(COBALT, 413).grist(GOLD, 126).grist(DIAMOND, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ENERGY_SWORD.get()).grist(BUILD, 2250).grist(URANIUM, 450).grist(CHALK, 250).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MEMORY_ALLOCATOR.get()).grist(TAR, 592).grist(URANIUM, 123).grist(RUST, 67).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BLACK_SHARD.get()).grist(TAR, 1842).grist(URANIUM, 65).grist(RUST, 16).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HOPEYGLASSSWORD.get()).grist(AMBER, 1842).grist(URANIUM, 65).grist(RUST, 16).grist(DIAMOND, 29).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HOLYMOONLIGHTSWORD.get()).grist(QUARTZ, 1954).grist(DIAMOND, 376).grist(SHALE, 208).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SMUTSWORD.get()).grist(BUILD, 24).grist(TAR, 48).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.RUDE_AXE.get()).grist(BUILD, 400).grist(TAR, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ROCKSTARS_GUITAR.get()).grist(GARNET, 57).grist(BUILD, 580).grist(CHALK, 100).grist(AMBER, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SOULSPLITTER.get()).grist(DIAMOND, 500).grist(BUILD, 2065).grist(CHALK, 729).grist(TAR, 1430).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SAPPHIRE_LABRYS.get()).grist(AMETHYST, 100).grist(COBALT, 480).grist(DIAMOND, 90).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SAPPHIC_LABRYS.get()).grist(IODINE, 763).grist(AMETHYST, 480).grist(MARBLE, 90).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.WHIFFLEBAT.get()).grist(AMBER, 567).grist(BUILD, 479).grist(TAR, 37).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.METAL_PAN.get()).grist(BUILD, 662).grist(RUST, 631).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HOMERUN_BAT.get()).grist(BUILD, 7213).grist(AMBER, 3799).grist(GARNET, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CLUB_SPIKED.get()).grist(BUILD, 90).grist(RUST, 22).grist(CAULK, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SPRING_MACE.get()).grist(BUILD, 4740).grist(RUST, 4897).grist(SHALE, 647).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MAGNIFIED_GLASS.get()).grist(AMETHYST, 80).grist(RUST, 200).grist(QUARTZ, 185).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.EXTENDO_BAT.get()).grist(BUILD, 80).grist(RUST, 100).grist(RUBY, 20).grist(URANIUM, 20).grist(TAR, 50).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.BRAIN_FORK.get()).grist(ARTIFACT, 10).grist(AMETHYST, 60).grist(BUILD, 200).grist(COBALT, 225).grist(QUARTZ, 40).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PSIDON_ENTENTE.get()).grist(AMETHYST, 60).grist(BUILD, 200).grist(COBALT, 225).grist(QUARTZ, 40).grist(GOLD, 700).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PEARLESCENT_SIXANT.get()).grist(BUILD, 200).grist(COBALT, 225).grist(QUARTZ, 800).grist(GOLD, 100).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.MARKET_GARDENER.get()).grist(RUST, 433).grist(CHALK, 375).grist(CAULK, 469).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BIT_MUNCHER.get()).grist(URANIUM, 180).grist(RUST, 46).grist(SHALE, 82).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.LANCER.get()).grist(CHALK, 77).grist(BUILD, 126).grist(COBALT, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SHADOWGLAIVE.get()).grist(TAR, 2134).grist(URANIUM, 56).grist(RUST, 23).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.DEVILS_KNIFE.get()).grist(TAR, 150).grist(SHALE, 276).grist(GOLD, 15).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SEAGRIFT_SCYTHE.get()).grist(SHALE, 88).grist(COBALT, 176).grist(RUST, 45).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.GUNSCYTHE.get()).grist(TAR, 973).grist(RUST, 367).grist(URANIUM, 89).grist(QUARTZ, 36).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.PRINCESS_WAND.get()).grist(SHALE, 126).grist(AMETHYST, 631).grist(AMBER, 100).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.UNICORN_GUN.get()).grist(CHALK, 459).grist(RUBY, 57).grist(URANIUM, 97).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ICE_STAFF.get()).grist(BUILD, 900).grist(COBALT, 486).grist(CHALK, 100).grist(URANIUM, 50).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.FLUORITE_ICOSAHEDRON.get()).grist(DIAMOND, 3400).grist(COBALT, 1700).grist(CHALK, 1200).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DELTA_TWENTY.get()).grist(DIAMOND, 3400).grist(COBALT, 1700).grist(CHALK, 1200).grist(URANIUM, 2900).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SHEELD.get()).grist(ARTIFACT, 10).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.POGO_SHIELD.get()).grist(BUILD, 125).grist(SHALE, 15).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MAGNET_SHIELD.get()).grist(BUILD, 24).grist(MERCURY, 19).grist(GARNET, 9).grist(RUST, 66).grist(DIAMOND, 11).grist(URANIUM, 41).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.ARADIA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.TAVROS_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SOLLUX_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.KARKAT_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.NEPETA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.KANAYA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.TEREZI_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.VRISKA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.EQUIUS_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.GAMZEE_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ERIDAN_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.FEFERI_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.VETHES_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HERESA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.METTAX_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.NELUMI_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DRAYTH_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.LORKES_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ARAMIA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MIRALA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.AVRIIL_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PISCAL_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.GALAAD_HELMET.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.AZONYP_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.FRELSI_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ACHLYS_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.RENARD_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.INANIS_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DEVROS_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.FAHRAD_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.NEYHIL_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.VERISI_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.NERIUS_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.STYBOL_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.JENSIS_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PHANES_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MAGNEA_HORNS.get()).grist(BUILD, 20).grist(IODINE, 20).grist(AMBER, 20).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.CHESS_TILE.get()).grist(CHALK, 32).grist(TAR, 32).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SKAIA_PC.get()).grist(BUILD, 50).grist(MARBLE, 5).grist(QUARTZ, 6)
                .grist(GARNET, 8).grist(RUST, 10).grist(GOLD, 3).grist(URANIUM, 23).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HOPEYGLASS.get()).grist(BUILD, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DEPTHS_HOPEYGLASS.get()).grist(BUILD, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_VRISKA.get()).grist(CHALK, 8).grist(COBALT, 8).grist(BUILD,8).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_NEPETA.get()).grist(CHALK, 8).grist(COBALT, 8).grist(BUILD,8).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_GENESIS_FROG.get()).grist(BUILD, 512).grist(AMETHYST, 274).grist(RUBY, 274).grist(DIAMOND, 274).grist(URANIUM, 274).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_SPADES_SLICK.get()).grist(BUILD, 128).grist(TAR, 283).grist(RUBY, 73).grist(URANIUM, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_HEARTS_BOXCARS.get()).grist(BUILD, 128).grist(TAR, 283).grist(RUBY, 73).grist(URANIUM, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_DIAMONDS_DROOG.get()).grist(BUILD, 128).grist(TAR, 283).grist(RUBY, 73).grist(URANIUM, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_CLUBS_DEUCE.get()).grist(BUILD, 128).grist(TAR, 283).grist(RUBY, 73).grist(URANIUM, 5).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.ZILLYSANTA.get()).grist(ZILLIUM, 1).grist(ARTIFACT, 2000).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.SPIROGRAPH_ARMOR_TRIM.get()).grist(CHALK, 413).grist(URANIUM, 612).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BREATH_ARMOR_TRIM.get()).grist(BUILD, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.LIFE_ARMOR_TRIM.get()).grist(URANIUM, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.LIGHT_ARMOR_TRIM.get()).grist(AMBER, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.TIME_ARMOR_TRIM.get()).grist(IODINE, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HEART_ARMOR_TRIM.get()).grist(GARNET, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.RAGE_ARMOR_TRIM.get()).grist(MARBLE, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BLOOD_ARMOR_TRIM.get()).grist(RUST, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DOOM_ARMOR_TRIM.get()).grist(MERCURY, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.VOID_ARMOR_TRIM.get()).grist(COBALT, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SPACE_ARMOR_TRIM.get()).grist(TAR, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MIND_ARMOR_TRIM.get()).grist(DIAMOND, 413).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HOPE_ARMOR_TRIM.get()).grist(GOLD, 413).build(recipeSaver);

        //Create Compat:
        GristCostRecipeBuilder.of(CreateCompat.RENCH.get()).grist(ARTIFACT, -2).build(recipeSaver);
        GristCostRecipeBuilder.of(CreateCompat.DEADRINGER.get()).grist(CAULK, 83).grist(RUST, 138).grist(BUILD, 5).grist(SULFUR, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(CreateCompat.MECHANICAL_CHAINSAW.get()).grist(RUST, 27).grist(BUILD, 87).grist(GOLD, 9).grist(CAULK, 8).grist(MARBLE, 18).grist(SHALE, 30).build(recipeSaver);

        GristCostRecipeBuilder.of(AllItems.PULP.get()).grist(COBALT, 1).grist(BUILD, 32).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.CARDBOARD.get()).grist(COBALT, 1).grist(BUILD, 32).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.ELECTRON_TUBE.get()).grist(MARBLE, 1).grist(DIAMOND, 4).grist(GARNET,32).grist(RUST,9).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.COPPER_SHEET.get()).grist(SHALE,9).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.BRASS_SHEET.get()).grist(CAULK,8).grist(RUST, 12).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.IRON_SHEET.get()).grist(RUST, 9).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.GOLDEN_SHEET.get()).grist(GOLD, 9).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.DOUGH.get()).grist(IODINE, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(AllBlocks.BLAZE_BURNER.get()).grist(TAR, 150).grist(URANIUM, 10).grist(GOLD, 15).grist(BUILD, 100).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.BLAZE_CAKE_BASE.get()).grist(SHALE, 1).grist(TAR, 1).grist(AMBER, 8).grist(IODINE, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(AllItems.BLAZE_CAKE.get()).grist(SHALE, 5).grist(TAR, 25).grist(AMBER, 8).grist(IODINE, 2).build(recipeSaver);

        GristCostRecipeBuilder.of(AllBlocks.ANDESITE_CASING.get()).grist(BUILD, 12).grist(RUST,2).build(recipeSaver);
        GristCostRecipeBuilder.of(AllBlocks.BRASS_CASING.get()).grist(BUILD, 8).grist(CAULK,8).grist(RUST,12).build(recipeSaver);
        GristCostRecipeBuilder.of(AllBlocks.COPPER_CASING.get()).grist(BUILD, 8).grist(SHALE,9).build(recipeSaver);
        GristCostRecipeBuilder.of(AllPaletteStoneTypes.ASURINE.baseBlock.get()).grist(BUILD, 8).grist(RUST,4).grist(SHALE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(AllPaletteStoneTypes.CRIMSITE.baseBlock.get()).grist(BUILD, 8).grist(RUST,1).build(recipeSaver);
        GristCostRecipeBuilder.of(AllPaletteStoneTypes.LIMESTONE.baseBlock.get()).grist(BUILD, 4).build(recipeSaver);
        GristCostRecipeBuilder.of(AllPaletteStoneTypes.OCHRUM.baseBlock.get()).grist(BUILD, 8).grist(GOLD,4).build(recipeSaver);
        GristCostRecipeBuilder.of(AllPaletteStoneTypes.VERIDIUM.baseBlock.get()).grist(BUILD, 8).grist(SHALE,4).build(recipeSaver);

    }

}
