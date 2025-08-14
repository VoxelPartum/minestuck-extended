package com.voxelpartum.minestuck_extended.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.combination.CombinationRecipeBuilder;
import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.block.SkaiaBlocks;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.util.MSTags;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.compat.CreateCompat;
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
        CombinationRecipeBuilder.of(MSEItems.SHADOW_CRYSTAL).input(Items.AMETHYST_SHARD).and().input(Items.BLACK_DYE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ROULETTE_CARD).input(MSTags.Items.MODUS_CARD).and().input(MSItems.DICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BEAGLEPUSS).input(Items.GLASS).and().input(Items.BROWN_WOOL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.TESTIFIPUSS).input(MSEItems.BEAGLEPUSS).and().input(Items.EMERALD_BLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BEAGLEPISS).input(MSEItems.BEAGLEPUSS).and().input(MSItems.APPLE_JUICE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DISGUISE).input(MSEItems.BEAGLEPUSS).and().input(MSItems.CRUMPLY_HAT).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SCARLET_SUNGLASSES).input(Items.RED_STAINED_GLASS_PANE).and().input(MSItems.FLARP_MANUAL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CINDERBLOCK).input(Tags.Items.CONCRETES).and().input(Items.BRICK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ACABRICK).input(MSEItems.CINDERBLOCK).and().input(MSItems.BI_DYE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.DELTA_RUNE).input(Items.ENCHANTING_TABLE).and().input(Items.STONE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.LANCER_COOKIE).input(MSItems.ACE_OF_SPADES).and().input(Items.COOKIE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ORANGE_CREAMSICLE).input(Items.ORANGE_DYE).or().input(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/milk"))).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.NORMAL_BROWNIE).input(Items.COCOA_BEANS).and().input(ItemTags.LEAVES).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.CHESS_TILE).input(SkaiaBlocks.BLACK_CHESS_DIRT).or().input(SkaiaBlocks.WHITE_CHESS_DIRT).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.PLUSH_VRISKA).input(ItemTags.WOOL).and().input(Items.SPIDER_EYE).build(consumer);

        //Weapons:
        CombinationRecipeBuilder.of(MSEItems.SHADOW_SWORD).input(MSEItems.SHADOW_CRYSTAL).and().input(Items.IRON_SWORD).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SHOVEL_BLADE).input(Items.DIAMOND_SHOVEL).and().input(MSItems.CLAYMORE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ENERGY_SWORD).input(Items.DIAMOND_SWORD).and().input(MSItems.CLAYMORE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MEMORY_ALLOCATOR).input(MSItems.CLAYMORE).and().input(MSItems.TILLDEATH_HANDBOOK).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.RUDE_AXE).input(MSEItems.SHADOW_CRYSTAL).and().input(Items.IRON_AXE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.ROCKSTARS_GUITAR).input(Items.NOTE_BLOCK).and().input(Items.DIAMOND_AXE).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SOULSPLITTER).input(Items.ECHO_SHARD).and().input(Items.DIAMOND_AXE).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.WHIFFLEBAT).input(MSItems.METAL_BAT).or().input(ItemTags.WOOL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.METAL_PAN).input(MSItems.SILVER_SPOON).and().input(Items.IRON_BLOCK).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.HOMERUN_BAT).input(MSItems.METAL_BAT).and().input(Items.PISTON).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.CLUB_SPIKED).input(MSItems.METAL_BAT).and().input(ItemTags.PLANKS).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SPRING_MACE).input(Items.MACE).and().input(Items.SLIME_BALL).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.MARKET_GARDENER).input(Items.HEAVY_CORE).and().input(MSItems.SILVER_SPOON).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.BIT_MUNCHER).input(MSItems.SILVER_SPOON).and().input(MSItems.BINARY_CODE).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.LANCER).input(MSItems.WOODEN_LANCE).and().input(MSItems.ACE_OF_SPADES).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.DEVILS_KNIFE).input(MSItems.SCYTHE).and().input(MSItems.HORN).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SEAGRIFT_SCYTHE).input(MSItems.SCYTHE).and().input(MSItems.FLARP_MANUAL).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.PRINCESS_WAND).input(MSItems.WAND).and().input(Items.DIAMOND).build(consumer);

        CombinationRecipeBuilder.of(MSEItems.FLUORITE_ICOSAHEDRON).input(MSItems.FLUORITE_OCTET).and().input(MSItems.TABLESTUCK_MANUAL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.SHEELD).input(Items.SHIELD).and().input(MSItems.SBAHJ_POSTER).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.POGO_SHIELD).input(Items.SHIELD).and().input(Items.SLIME_BALL).build(consumer);
        CombinationRecipeBuilder.of(MSEItems.MAGNET_SHIELD).input(Items.SHIELD).and().input(MSItems.ITEM_MAGNET).build(consumer);

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

        //Create Compat:
        CombinationRecipeBuilder.of(CreateCompat.RENCH).input(AllItems.WRENCH.get()).and().input(MSItems.SBAHJ_POSTER).build(consumer);
        CombinationRecipeBuilder.of(CreateCompat.DEADRINGER).input(AllBlocks.HAUNTED_BELL.get()).and().input(MSItems.SLEDGE_HAMMER).build(consumer);
        CombinationRecipeBuilder.of(CreateCompat.MECHANICAL_CHAINSAW).input(MSItems.LIPSTICK_CHAINSAW).and().input(AllBlocks.ROTATION_SPEED_CONTROLLER.get()).build(consumer);

        CombinationRecipeBuilder.of(AllBlocks.BLAZE_BURNER.get()).input(AllItems.EMPTY_BLAZE_BURNER).or().input(Items.BLAZE_ROD).build(consumer);
        CombinationRecipeBuilder.of(AllItems.BLAZE_CAKE.get()).input(AllItems.BLAZE_CAKE_BASE).or().input(Items.LAVA_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(AllItems.BLAZE_CAKE_BASE.get()).input(Items.NETHERRACK).or().input(Items.EGG).build(consumer);
        CombinationRecipeBuilder.of(AllItems.PULP.get()).input(ItemTags.SAPLINGS).or().input(Items.WATER_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(AllItems.DOUGH.get()).input(MSItems.BREADCRUMBS).and().input(Items.WATER_BUCKET).build(consumer);
        CombinationRecipeBuilder.of(AllItems.HONEYED_APPLE.get()).input(Items.HONEY_BOTTLE).and().input(Items.APPLE).build(consumer);
        CombinationRecipeBuilder.of(AllItems.RAW_ZINC.get()).input(Items.STONE).or().input(Items.LIGHT_GRAY_DYE).build(consumer);
        CombinationRecipeBuilder.of(AllBlocks.ZINC_ORE.get()).input(AllItems.ZINC_INGOT).and().input(Items.STONE).build(consumer);

    }

}
