package com.voxelpartum.minestuck_extended.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.compat.CreateCompat;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.common.registry.ModItems;

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
        GristCostRecipeBuilder.of(MSEItems.SHADOW_CRYSTAL.get()).grist(AMETHYST,4).grist(TAR,5).grist(QUARTZ,1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ROULETTE_CARD.get()).grist(BUILD, 300).grist(COBALT, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BEAGLEPUSS.get()).grist(BUILD, 5).grist(AMBER, 1).grist(CHALK, 5).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.TESTIFIPUSS.get()).grist(URANIUM, 5).grist(BUILD, 20).grist(SHALE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BEAGLEPISS.get()).grist(AMBER, 50).grist(GOLD, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DISGUISE.get()).grist(BUILD, 20).grist(AMBER, 5).grist(CHALK, 20).grist(IODINE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CINDERBLOCK.get()).grist(BUILD, 2).grist(CAULK, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ACABRICK.get()).grist(BUILD, 5).grist(SHALE, 5).grist(CHALK, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.LANCER_COOKIE.get()).grist(AMBER, 1).grist(IODINE, 1).grist(COBALT, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.DELTA_RUNE.get()).grist(AMBER, 1).grist(IODINE, 1).grist(COBALT, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ORANGE_CREAMSICLE.get()).grist(AMBER, 2).grist(GARNET, 2).grist(CHALK, 4).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.NORMAL_BROWNIE.get()).grist(AMBER, 4).grist(IODINE, 4).grist(URANIUM, 256).build(recipeSaver);

        //Weapons:
        GristCostRecipeBuilder.of(MSEItems.SHADOW_SWORD.get()).grist(BUILD, 250).grist(TAR, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SHOVEL_BLADE.get()).grist(BUILD, 1500).grist(COBALT, 413).grist(GOLD, 126).grist(DIAMOND, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ENERGY_SWORD.get()).grist(BUILD, 2250).grist(URANIUM, 450).grist(CHALK, 250).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.RUDE_AXE.get()).grist(BUILD, 400).grist(TAR, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.ROCKSTARS_GUITAR.get()).grist(GARNET, 57).grist(BUILD, 580).grist(CHALK, 100).grist(AMBER, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SOULSPLITTER.get()).grist(DIAMOND, 500).grist(BUILD, 2065).grist(CHALK, 729).grist(TAR, 1430).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.FORCE_QUIT.get()).grist(TAR, 592).grist(URANIUM, 123).grist(RUST, 67).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.WHIFFLEBAT.get()).grist(AMBER, 567).grist(BUILD, 479).grist(TAR, 37).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.METAL_PAN.get()).grist(BUILD, 662).grist(RUST, 631).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.HOMERUN_BAT.get()).grist(BUILD, 7213).grist(AMBER, 3799).grist(GARNET, 50).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.CLUB_SPIKED.get()).grist(BUILD, 90).grist(RUST, 22).grist(CAULK, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SPRING_MACE.get()).grist(BUILD, 4740).grist(RUST, 4897).grist(SHALE, 647).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.MARKET_GARDENER.get()).grist(RUST, 433).grist(CHALK, 375).grist(CAULK, 469).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.BIT_MUNCHER.get()).grist(URANIUM, 180).grist(RUST, 46).grist(SHALE, 82).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.LANCER.get()).grist(CHALK, 77).grist(BUILD, 126).grist(COBALT, 413).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.DEVILS_KNIFE.get()).grist(TAR, 150).grist(SHALE, 276).grist(GOLD, 15).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SEAGRIFT_SCYTHE.get()).grist(SHALE, 88).grist(COBALT, 176).grist(RUST, 45).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.PRINCESS_WAND.get()).grist(SHALE, 126).grist(AMETHYST, 631).grist(AMBER, 100).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.FLUORITE_ICOSAHEDRON.get()).grist(DIAMOND, 3400).grist(COBALT, 1700).grist(CHALK, 1200).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.SHEELD.get()).grist(ARTIFACT, 10).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.POGO_SHIELD.get()).grist(BUILD, 125).grist(SHALE, 15).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.MAGNET_SHIELD.get()).grist(BUILD, 24).grist(MERCURY, 19).grist(GARNET, 9).grist(RUST, 66).grist(DIAMOND, 11).grist(URANIUM, 41).build(recipeSaver);

        GristCostRecipeBuilder.of(MSEItems.CHESS_TILE.get()).grist(CHALK, 32).grist(TAR, 32).build(recipeSaver);
        GristCostRecipeBuilder.of(MSEItems.PLUSH_VRISKA.get()).grist(CHALK, 8).grist(COBALT, 8).grist(BUILD,8).build(recipeSaver);

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

        //Farmers Delight Items:
        GristCostRecipeBuilder.of(ModItems.STRAW.get()).grist(IODINE,1 ).grist(BUILD, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.TREE_BARK.get()).grist(BUILD, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.SANDY_SHRUB.get()).grist(BUILD, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.WILD_CABBAGES.get()).grist(BUILD, 3).grist(AMBER, 2).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.WILD_ONIONS.get()).grist(BUILD, 1).grist(AMETHYST, 1).grist(GARNET, 3).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.WILD_TOMATOES.get()).grist(BUILD, 1).grist(GARNET, 4).grist(IODINE, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.WILD_CARROTS.get()).grist(BUILD, 1).grist(AMBER, 3).grist(CHALK, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.WILD_POTATOES.get()).grist(BUILD, 1).grist(AMBER, 4).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.WILD_BEETROOTS.get()).grist(BUILD, 1).grist(IODINE, 2).grist(RUST, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.WILD_RICE.get()).grist(BUILD, 1).grist(CHALK, 2).grist(AMBER, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.BROWN_MUSHROOM_COLONY.get()).grist(IODINE, 25).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.RED_MUSHROOM_COLONY.get()).grist(IODINE, 15).grist(RUBY, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.CABBAGE.get()).grist(BUILD, 2).grist(AMBER, 2).grist(IODINE, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.CABBAGE_LEAF.get()).grist(BUILD, 1).grist(AMBER, 1).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.TOMATO.get()).grist(GARNET, 2).grist(IODINE, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.ONION.get()).grist(AMETHYST, 1).grist(GARNET, 2).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.RICE.get()).grist(CHALK, 2).grist(AMBER, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.CABBAGE_SEEDS.get()).grist(BUILD, 1).grist(AMBER, 1).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.TOMATO_SEEDS.get()).grist(BUILD, 1).grist(AMBER, 1).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.ROTTEN_TOMATO.get()).grist(AMBER, 4).grist(IODINE, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.RAW_PASTA.get()).grist(AMBER, 2).grist(IODINE, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.PUMPKIN_SLICE.get()).grist(AMBER, 3).grist(CAULK, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.MINCED_BEEF.get()).grist(IODINE, 6).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.CHICKEN_CUTS.get()).grist(IODINE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.BACON.get()).grist(IODINE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.COD_SLICE.get()).grist(AMBER, 2).grist(CAULK, 2).grist(COBALT, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.SALMON_SLICE.get()).grist(AMBER, 2).grist(CAULK, 2).grist(COBALT, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.MUTTON_CHOPS.get()).grist(IODINE, 5).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.HAM.get()).grist(IODINE, 20).grist(CHALK, 6).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.SMOKED_HAM.get()).grist(IODINE, 20).grist(CHALK, 6).grist(TAR, 2).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.HONEY_GLAZED_HAM_BLOCK.get()).grist(IODINE, 20).grist(CHALK, 10).grist(TAR, 2).grist(AMBER, 4).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.CAKE_SLICE.get()).grist(IODINE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.APPLE_PIE_SLICE.get()).grist(AMBER, 3).grist(IODINE, 4).grist(SHALE, 1).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.CHOCOLATE_PIE_SLICE.get()).grist(AMBER, 2).grist(CHALK, 2).grist(SHALE, 4).build(recipeSaver);
        GristCostRecipeBuilder.of(ModItems.RICE_ROLL_MEDLEY_BLOCK.get()).grist(IODINE, 4).grist(TAR, 3).grist(COBALT, 12).grist(AMBER, 33).grist(CHALK, 30).build(recipeSaver);



    }

}
