package com.voxelpartum.minestuck_extended.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.combination.CombinationRecipeBuilder;
import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.block.SkaiaBlocks;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.util.MSTags;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.compat.create.CreateCompat;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

public class MSECombinationsProvider {

    public static void buildRecipes(RecipeOutput consumer){

        CombinationRecipeBuilder.of(Items.TORCHFLOWER).input(Items.TORCH).and().input(ItemTags.FLOWERS).build(consumer);
        CombinationRecipeBuilder.of(MSItems.GRASSHOPPER).input(Items.SHORT_GRASS).and().input(Items.HOPPER).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.DIAMOND_LICHEN).input(Items.DIAMOND).or().input(Items.GLOW_LICHEN).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CRUXITE_LICHEN).input(MSItems.RAW_CRUXITE).or().input(Items.GLOW_LICHEN).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.URANIUM_LICHEN).input(MSItems.RAW_URANIUM).or().input(Items.GLOW_LICHEN).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SHADOW_CRYSTAL).input(Items.AMETHYST_SHARD).and().input(Items.BLACK_DYE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ROULETTE_CARD).input(MSTags.Items.MODUS_CARD).and().input(MSItems.DICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ZIP_CARD).input(MSTags.Items.MODUS_CARD).and().input(Items.ENCHANTED_BOOK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BEAGLEPUSS).input(Items.GLASS).and().input(Items.BROWN_WOOL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.TESTIFIPUSS).input(MSEItems.BEAGLEPUSS).and().input(Items.EMERALD_BLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BEAGLEPISS).input(MSEItems.BEAGLEPUSS).and().input(MSItems.APPLE_JUICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DISGUISE).input(MSEItems.BEAGLEPUSS).and().input(MSItems.CRUMPLY_HAT).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SCARLET_SUNGLASSES).input(Items.RED_STAINED_GLASS_PANE).and().input(MSItems.FLARP_MANUAL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CINDERBLOCK).input(Tags.Items.CONCRETES).and().input(Items.BRICK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ACABRICK).input(MSEItems.CINDERBLOCK).and().input(MSItems.BI_DYE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.WATER_BALLOON).input(Items.WATER_BUCKET).and().input(Items.SNOWBALL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DELTA_RUNE).input(Items.ENCHANTING_TABLE).and().input(Items.STONE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.LANCER_COOKIE).input(MSItems.ACE_OF_SPADES).and().input(Items.COOKIE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ORANGE_CREAMSICLE).input(Items.ORANGE_DYE).or().input(Items.MILK_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NORMAL_BROWNIE).input(Items.COCOA_BEANS).and().input(ItemTags.LEAVES).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.CHESS_TILE).input(SkaiaBlocks.BLACK_CHESS_DIRT).or().input(SkaiaBlocks.WHITE_CHESS_DIRT).build(consumer);
//        CombinationRecipeBuilder.of(MSEItems.SKAIA_PC).input(MSItems.COMPUTER).or().input(MSItems.CHESSBOARD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HOPEYGLASS).input(MSEItems.HOPE_ARMOR_TRIM).or().input(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "glass_blocks"))).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DEPTHS_HOPEYGLASS).input(MSEItems.HOPEYGLASS).or().input(MSEItems.SHADOW_CRYSTAL).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.PLUSH_VRISKA).input(ItemTags.WOOL).and().input(Items.SPIDER_EYE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PLUSH_NEPETA).input(ItemTags.WOOL).and().input(ItemTags.FISHES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PLUSH_GENESIS_FROG).input(ItemTags.WOOL).and().input(MSItems.FROG).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PLUSH_SPADES_SLICK).input(ItemTags.WOOL).and().input(MSItems.ACE_OF_SPADES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PLUSH_HEARTS_BOXCARS).input(ItemTags.WOOL).and().input(MSItems.ACE_OF_HEARTS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PLUSH_DIAMONDS_DROOG).input(ItemTags.WOOL).and().input(MSItems.ACE_OF_DIAMONDS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PLUSH_CLUBS_DEUCE).input(ItemTags.WOOL).and().input(MSItems.ACE_OF_CLUBS).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.ZILLYSANTA).input(MSEItems.FANCYSANTA).and().input(MSItems.ZILLIUM_SKITTLES).build(consumer);

        //Weapons:
        CombinationRecipeBuilder.of(MSEItems.METAL_GAUNTLET).input(MSEItems.OVEN_MITT).and().input(Items.IRON_BLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PRISMARINE_GAUNTLET).input(MSEItems.METAL_GAUNTLET).and().namedInput(Items.PRISMARINE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PRISMARINE_GAUNTLET).input(MSEItems.METAL_GAUNTLET).and().namedInput(Items.DARK_PRISMARINE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PRISMARINE_GAUNTLET).input(MSEItems.METAL_GAUNTLET).and().namedInput(Items.PRISMARINE_BRICKS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.STRONG_GLOVES).input(MSEItems.METAL_GAUNTLET).and().input(MSItems.HORSE_CLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MANTISBLADE).input(MSEItems.METAL_GAUNTLET).and().input(Items.REDSTONE).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.SHADOW_SWORD).input(MSEItems.SHADOW_CRYSTAL).and().input(Items.IRON_SWORD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SHOVEL_BLADE).input(Items.DIAMOND_SHOVEL).and().input(MSItems.CLAYMORE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ENERGY_SWORD).input(Items.DIAMOND_SWORD).and().input(MSItems.CLAYMORE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MEMORY_ALLOCATOR).input(MSItems.CLAYMORE).and().input(MSItems.TILLDEATH_HANDBOOK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BLACK_SHARD).input(MSEItems.DELTA_RUNE).and().input(MSEItems.SHADOW_CRYSTAL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HOPEYGLASSSWORD).input(MSEItems.BLACK_SHARD).and().namedInput(MSEItems.HOPEYGLASS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HOPEYGLASSSWORD).input(MSEItems.BLACK_SHARD).and().namedInput(MSEItems.HOPEYGLASS_PANE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HOLYMOONLIGHTSWORD).input(MSItems.SHATTER_BEACON).and().input(MSItems.GRIMOIRE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SMUTSWORD).input(MSItems.PAPER_SWORD).and().input(Items.WRITTEN_BOOK).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.RUDE_AXE).input(MSEItems.SHADOW_CRYSTAL).and().input(Items.IRON_AXE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ROCKSTARS_GUITAR).input(Items.NOTE_BLOCK).and().input(Items.DIAMOND_AXE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SOULSPLITTER).input(Items.ECHO_SHARD).and().input(Items.DIAMOND_AXE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SAPPHIRE_LABRYS).input(Items.DIAMOND_AXE).and().input(Items.LAPIS_BLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SAPPHIC_LABRYS).input(MSEItems.SAPPHIRE_LABRYS).or().input(Items.LILY_OF_THE_VALLEY).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.WHIFFLEBAT).input(MSItems.METAL_BAT).or().input(ItemTags.WOOL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.METAL_PAN).input(MSItems.SILVER_SPOON).and().input(Items.IRON_BLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HOMERUN_BAT).input(MSItems.METAL_BAT).and().input(Items.PISTON).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CLUB_SPIKED).input(MSItems.METAL_BAT).and().input(ItemTags.PLANKS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SPRING_MACE).input(Items.MACE).and().input(Items.SLIME_BALL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MAGNIFIED_GLASS).input(Items.SPYGLASS).or().input(Items.GLASS_PANE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.EXTENDO_BAT).input(MSItems.METAL_BAT).or().input(Items.PISTON).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.MARKET_GARDENER).input(Items.HEAVY_CORE).and().input(MSItems.SILVER_SPOON).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BIT_MUNCHER).input(MSItems.SILVER_SPOON).and().input(MSItems.BINARY_CODE).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.BRAIN_FORK).input(Items.TRIDENT).and().input(Items.PLAYER_HEAD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PSIDON_ENTENTE).input(Items.TRIDENT).and().input(MSItems.GRIMOIRE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PEARLESCENT_SIXANT).input(MSEItems.PSIDON_ENTENTE).and().input(Items.HEART_OF_THE_SEA).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.LANCER).input(MSItems.WOODEN_LANCE).and().input(MSItems.ACE_OF_SPADES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SHADOWGLAIVE).input(MSEItems.SHADOW_CRYSTAL).and().input(MSEItems.GLAIVE).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.DEVILS_KNIFE).input(MSItems.SCYTHE).and().input(MSItems.HORN).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SEAGRIFT_SCYTHE).input(MSItems.SCYTHE).and().input(MSItems.FLARP_MANUAL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.GUNSCYTHE).input(MSItems.SCYTHE).or().input(MSItems.ANCIENT_THUMB_DRIVE).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.PRINCESS_WAND).input(MSItems.WAND).and().input(Items.DIAMOND).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.UNICORN_GUN).input(MSEItems.PRINCESS_WAND).or().input(Items.CLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ICE_STAFF).input(MSItems.WATER_STAFF).or().input(Items.BLUE_ICE).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.FLUORITE_ICOSAHEDRON).input(MSItems.FLUORITE_OCTET).and().input(MSItems.TABLESTUCK_MANUAL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DELTA_TWENTY).input(MSEItems.FLUORITE_ICOSAHEDRON).or().input(MSEItems.DELTA_RUNE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SHEELD).input(Items.SHIELD).and().input(MSItems.SBAHJ_POSTER).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.POGO_SHIELD).input(Items.SHIELD).and().input(Items.SLIME_BALL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MAGNET_SHIELD).input(Items.SHIELD).and().input(MSItems.ITEM_MAGNET).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.ITCHY_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.HAY_BLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DOZE_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.PACKED_ICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.TRACE_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.CLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CLOVER_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.SHORT_GRASS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.FIN_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.FISHING_ROD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DIE_HAT).input(MSItems.CRUMPLY_HAT).and().input(MSItems.DICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CROWBAR_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.LIGHTNING_ROD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SNOWMAN_HAT).input(MSItems.CRUMPLY_HAT).and().input(MSItems.EIGHTBALL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.STITCH_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.STRING).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SAWBUCK_HAT).input(MSItems.CRUMPLY_HAT).and().input(MSItems.LIPSTICK_CHAINSAW).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MATCHSTICKS_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.FIRE_CHARGE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.EGGS_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.EGG).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BISCUITS_HAT).input(MSItems.CRUMPLY_HAT).and().input(Items.BREAD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.QUARTERS_HAT).input(MSItems.CRUMPLY_HAT).and().input(MSItems.BOONDOLLARS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CANS_HAT).input(MSItems.CRUMPLY_HAT).and().input(MSItems.FOOD_CAN).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CAIRO_OVERCOAT).input(Items.NETHERITE_CHESTPLATE).and().input(MSItems.CUEBALL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.INVIS_CLOAK).input(Items.IRON_CHESTPLATE).and().input(MSItems.MIRROR).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.ARADIA_HORNS).input(MSEItems.HEADBAND).or().input(Items.MUTTON).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.TAVROS_HORNS).input(MSEItems.HEADBAND).or().input(Items.MINECART).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SOLLUX_HORNS).input(MSEItems.HEADBAND).or().input(Items.HONEYCOMB).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.KARKAT_HORNS).input(MSEItems.HEADBAND).or().input(Items.LIGHT_GRAY_DYE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NEPETA_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.COD_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NEPETA_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.SALMON_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NEPETA_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.TROPICAL_FISH_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NEPETA_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.PUFFERFISH_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.KANAYA_HORNS).input(MSEItems.HEADBAND).or().input(Items.ROSE_BUSH).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.TEREZI_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.SCALEMATE_APPLESCAB).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.VRISKA_HORNS).input(MSEItems.HEADBAND).or().input(Items.SPIDER_EYE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.EQUIUS_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.LEATHER_HORSE_ARMOR).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.EQUIUS_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.IRON_HORSE_ARMOR).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.EQUIUS_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.GOLDEN_HORSE_ARMOR).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.EQUIUS_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.DIAMOND_HORSE_ARMOR).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HORUSS_HORNS).input(MSEItems.EQUIUS_HORNS).or().input(Items.SADDLE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.GAMZEE_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.HORN).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ERIDAN_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.WAND).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.FEFERI_HORNS).input(MSEItems.HEADBAND).or().input(Items.NAUTILUS_SHELL).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.VETHES_HORNS).input(MSEItems.HEADBAND).or().input(ItemTags.WOOL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HERESA_HORNS).input(MSEItems.HEADBAND).or().input(Items.LEAD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.METTAX_HORNS).input(MSEItems.HEADBAND).or().input(Items.DISPENSER).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NELUMI_HORNS).input(MSEItems.HEADBAND).or().input(ItemTags.SMALL_FLOWERS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DRAYTH_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.DICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.LORKES_HORNS).input(MSEItems.HEADBAND).or().input(Items.REDSTONE_LAMP).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ARAMIA_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.SCYTHE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MIRALA_HORNS).input(MSEItems.HEADBAND).or().input(Items.ICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.AVRIIL_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.METAL_BAT).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PISCAL_HORNS).input(MSEItems.HEADBAND).or().input(Items.WATER_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.GALAAD_HELMET).input(Items.IRON_HELMET).or().input(Items.FEATHER).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.ACHLYS_HORNS).input(MSEItems.HEADBAND).or().input(Items.GHAST_TEAR).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.AZONYP_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.SICKLE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DEVROS_HORNS).input(MSEItems.HEADBAND).or().input(Items.TINTED_GLASS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.FRELSI_HORNS).input(MSEItems.HEADBAND).or().input(Items.LEATHER_HELMET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.FAHRAD_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.CAST_IRON).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.FAHRAD_HORNS).input(MSEItems.HEADBAND).or().namedInput(AllItems.WRENCH).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.INANIS_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.ACE_OF_DIAMONDS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.JENSIS_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.FROG).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MAGNEA_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.LIPSTICK_CHAINSAW).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NERIUS_HORNS).input(MSEItems.HEADBAND).or().input(Items.GLOWSTONE_DUST).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NEYHIL_HORNS).input(MSEItems.HEADBAND).or().input(Items.BELL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PHANES_HORNS).input(MSEItems.HEADBAND).or().input(Items.CYAN_CARPET).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.RENARD_HORNS).input(MSEItems.HEADBAND).or().input(Items.SWEET_BERRIES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.STYBOL_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.BATTERY).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.VERISI_HORNS).input(MSEItems.HEADBAND).or().input(MSItems.CONDUCTORS_BATON).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CASYLA_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.GOLDEN_SWORD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CASYLA_HORNS).input(MSEItems.HEADBAND).or().namedInput(Items.DIAMOND_SWORD).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.SPIROGRAPH_ARMOR_TRIM).input(MSItems.SERVER_DISK).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BREATH_ARMOR_TRIM).input(AspectTreeBlocks.BREATH_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.LIFE_ARMOR_TRIM).input(AspectTreeBlocks.LIFE_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.LIGHT_ARMOR_TRIM).input(AspectTreeBlocks.LIGHT_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.TIME_ARMOR_TRIM).input(AspectTreeBlocks.TIME_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HEART_ARMOR_TRIM).input(AspectTreeBlocks.HEART_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.RAGE_ARMOR_TRIM).input(AspectTreeBlocks.RAGE_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BLOOD_ARMOR_TRIM).input(AspectTreeBlocks.BLOOD_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DOOM_ARMOR_TRIM).input(AspectTreeBlocks.DOOM_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.VOID_ARMOR_TRIM).input(AspectTreeBlocks.VOID_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SPACE_ARMOR_TRIM).input(AspectTreeBlocks.SPACE_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MIND_ARMOR_TRIM).input(AspectTreeBlocks.MIND_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HOPE_ARMOR_TRIM).input(AspectTreeBlocks.HOPE_ASPECT_SAPLING).and().input(ItemTags.TRIM_TEMPLATES).build(consumer);

        CombinationRecipeBuilder.of(MSItems.DRAGON_KEY).input(MSItems.KEYBLADE).and().input(MSEItems.SCALEMATE_APPLESCAB).build(consumer);
        CombinationRecipeBuilder.of(MSItems.NIGHTSTICK).input(MSItems.NIGHT_CLUB).and().input(MSEItems.SCALEMATE_APPLESCAB).build(consumer);
        CombinationRecipeBuilder.of(MSItems.DRAGON_LANCE).input(MSItems.JOUSTING_LANCE).and().input(MSEItems.SCALEMATE_APPLESCAB).build(consumer);

        //Create Compat:
        CombinationRecipeBuilder.of(CreateCompat.RENCH).input(AllItems.WRENCH.get()).and().input(MSItems.SBAHJ_POSTER).build(consumer);
        CombinationRecipeBuilder.of(CreateCompat.DEADRINGER).input(AllBlocks.HAUNTED_BELL.get()).and().input(MSItems.SLEDGE_HAMMER).build(consumer);
        CombinationRecipeBuilder.of(CreateCompat.MECHANICAL_CHAINSAW).input(MSItems.LIPSTICK_CHAINSAW).and().input(AllBlocks.ROTATION_SPEED_CONTROLLER.get()).build(consumer);

        CombinationRecipeBuilder.of(AllBlocks.BLAZE_BURNER.get()).input(AllItems.EMPTY_BLAZE_BURNER).or().input(Items.BLAZE_ROD).build(consumer);
        CombinationRecipeBuilder.of(AllItems.BLAZE_CAKE.get()).input(AllItems.BLAZE_CAKE_BASE).or().input(Items.LAVA_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(AllItems.BLAZE_CAKE_BASE.get()).input(Items.NETHERRACK).or().input(Items.EGG).build(consumer);
        CombinationRecipeBuilder.of(AllBlocks.PACKAGE_FROGPORT).input(MSItems.FROG).or().input(AllBlocks.ANDESITE_CASING).build(consumer);
        CombinationRecipeBuilder.of(AllItems.PULP.get()).input(ItemTags.SAPLINGS).or().input(Items.WATER_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(AllItems.DOUGH.get()).input(MSItems.BREADCRUMBS).and().input(Items.WATER_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(AllItems.HONEYED_APPLE.get()).input(Items.HONEY_BOTTLE).and().input(Items.APPLE).build(consumer);
        CombinationRecipeBuilder.of(AllItems.RAW_ZINC.get()).input(Items.STONE).or().input(Items.LIGHT_GRAY_DYE).build(consumer);
        CombinationRecipeBuilder.of(AllBlocks.ZINC_ORE.get()).input(AllItems.ZINC_INGOT).and().input(Items.STONE).build(consumer);

    }

}
