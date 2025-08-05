package com.voxelpartum.minestuck_plus.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.data.recipe.IrradiatingRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.util.MSTags;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatBlocks;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class MSPRecipeProvider extends RecipeProvider {
    public MSPRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeBuilder){

        IrradiatingRecipeBuilder.irradiating(Ingredient.of(MSPItems.NORMAL_BROWNIE), MSPItems.NORMALER_BROWNIE.get(), 0.2F, 250).save(recipeBuilder);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.PLUSH_SALAMANDER.get()).unlockedBy("has_plush_salamander_item", has(MSItems.PLUSH_SALAMANDER)).requires(MSItems.PLUSH_SALAMANDER).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_salamander_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.PLUSH_NAKAGATOR.get()).unlockedBy("has_plush_nakagator_item", has(MSItems.PLUSH_NAKAGATOR)).requires(MSItems.PLUSH_NAKAGATOR).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_nakagator_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.PLUSH_IGUANA.get()).unlockedBy("has_plush_iguana_item", has(MSItems.PLUSH_IGUANA)).requires(MSItems.PLUSH_IGUANA).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_iguana_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.PLUSH_TURTLE.get()).unlockedBy("has_plush_turtle_item", has(MSItems.PLUSH_TURTLE)).requires(MSItems.PLUSH_TURTLE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_turtle_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.PLUSH_MUTATED_CAT.get()).unlockedBy("has_plush_mutated_cat_item", has(MSItems.PLUSH_MUTATED_CAT)).requires(MSItems.PLUSH_MUTATED_CAT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_mutated_cat_item_to_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_plush_salamander_block", has(MSPItems.SCALEMATE_APPLESCAB)).requires(MSPItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_salamander_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_plush_nakagator_block", has(MSPItems.SCALEMATE_APPLESCAB)).requires(MSPItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_nakagator_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_plush_iguana_block", has(MSPItems.SCALEMATE_APPLESCAB)).requires(MSPItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_iguana_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_plush_turtle_block", has(MSPItems.SCALEMATE_APPLESCAB)).requires(MSPItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_turtle_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_plush_mutated_cat_block", has(MSPItems.SCALEMATE_APPLESCAB)).requires(MSPItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "plush_mutated_cat_block_to_item"));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_scalemate1_item", has(MSItems.SCALEMATE_APPLESCAB)).requires(MSItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate1_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_BERRYBREATH.get()).unlockedBy("has_scalemate2_item", has(MSItems.SCALEMATE_BERRYBREATH)).requires(MSItems.SCALEMATE_BERRYBREATH).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate2_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_CINNAMONWHIFF.get()).unlockedBy("has_scalemate3_item", has(MSItems.SCALEMATE_CINNAMONWHIFF)).requires(MSItems.SCALEMATE_CINNAMONWHIFF).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate3_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_HONEYTONGUE.get()).unlockedBy("has_scalemate4_item", has(MSItems.SCALEMATE_HONEYTONGUE)).requires(MSItems.SCALEMATE_HONEYTONGUE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate4_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_LEMONSNOUT.get()).unlockedBy("has_scalemate5_item", has(MSItems.SCALEMATE_LEMONSNOUT)).requires(MSItems.SCALEMATE_LEMONSNOUT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate5_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_PINESNORT.get()).unlockedBy("has_scalemate6_item", has(MSItems.SCALEMATE_PINESNORT)).requires(MSItems.SCALEMATE_PINESNORT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate6_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_PUCEFOOT.get()).unlockedBy("has_scalemate7_item", has(MSItems.SCALEMATE_PUCEFOOT)).requires(MSItems.SCALEMATE_PUCEFOOT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate7_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_PUMPKINSNUFFLE.get()).unlockedBy("has_scalemate8_item", has(MSItems.SCALEMATE_PUMPKINSNUFFLE)).requires(MSItems.SCALEMATE_PUMPKINSNUFFLE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate8_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_PYRALSPITE.get()).unlockedBy("has_scalemate9_item", has(MSItems.SCALEMATE_PYRALSPITE)).requires(MSItems.SCALEMATE_PYRALSPITE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate9_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSPItems.SCALEMATE_WITNESS.get()).unlockedBy("has_scalemate10_item", has(MSItems.SCALEMATE_WITNESS)).requires(MSItems.SCALEMATE_WITNESS).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate10_item_to_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_scalemate1_block", has(MSPItems.SCALEMATE_APPLESCAB)).requires(MSPItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate1_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_BERRYBREATH.get()).unlockedBy("has_scalemate2_block", has(MSPItems.SCALEMATE_BERRYBREATH)).requires(MSPItems.SCALEMATE_BERRYBREATH).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate2_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_CINNAMONWHIFF.get()).unlockedBy("has_scalemate3_block", has(MSPItems.SCALEMATE_CINNAMONWHIFF)).requires(MSPItems.SCALEMATE_CINNAMONWHIFF).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate3_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_HONEYTONGUE.get()).unlockedBy("has_scalemate4_block", has(MSPItems.SCALEMATE_HONEYTONGUE)).requires(MSPItems.SCALEMATE_HONEYTONGUE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate4_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_LEMONSNOUT.get()).unlockedBy("has_scalemate5_block", has(MSPItems.SCALEMATE_LEMONSNOUT)).requires(MSPItems.SCALEMATE_LEMONSNOUT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate5_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PINESNORT.get()).unlockedBy("has_scalemate6_block", has(MSPItems.SCALEMATE_PINESNORT)).requires(MSPItems.SCALEMATE_PINESNORT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate6_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PUCEFOOT.get()).unlockedBy("has_scalemate7_block", has(MSPItems.SCALEMATE_PUCEFOOT)).requires(MSPItems.SCALEMATE_PUCEFOOT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate7_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PUMPKINSNUFFLE.get()).unlockedBy("has_scalemate8_block", has(MSPItems.SCALEMATE_PUMPKINSNUFFLE)).requires(MSPItems.SCALEMATE_PUMPKINSNUFFLE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate8_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PYRALSPITE.get()).unlockedBy("has_scalemate9_block", has(MSPItems.SCALEMATE_PYRALSPITE)).requires(MSPItems.SCALEMATE_PYRALSPITE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate9_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_WITNESS.get()).unlockedBy("has_scalemate10_block", has(MSPItems.SCALEMATE_WITNESS)).requires(MSPItems.SCALEMATE_WITNESS).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "scalemate10_block_to_item"));

        trimSmithing(recipeBuilder, MSPItems.SPIROGRAPH_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "spirograph"));
        trimSmithing(recipeBuilder, MSPItems.BREATH_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "breath"));
        trimSmithing(recipeBuilder, MSPItems.LIFE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "life"));
        trimSmithing(recipeBuilder, MSPItems.LIGHT_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "light"));
        trimSmithing(recipeBuilder, MSPItems.TIME_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "time"));
        trimSmithing(recipeBuilder, MSPItems.HEART_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "heart"));
        trimSmithing(recipeBuilder, MSPItems.RAGE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "rage"));
        trimSmithing(recipeBuilder, MSPItems.BLOOD_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "blood"));
        trimSmithing(recipeBuilder, MSPItems.DOOM_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "doom"));
        trimSmithing(recipeBuilder, MSPItems.VOID_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "void"));
        trimSmithing(recipeBuilder, MSPItems.SPACE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "space"));
        trimSmithing(recipeBuilder, MSPItems.MIND_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "mind"));
        trimSmithing(recipeBuilder, MSPItems.HOPE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "hope"));

        MSPGristCostsProvider.buildRecipes(recipeBuilder);
        MSPCombinationsProvider.buildRecipes(recipeBuilder);

        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.BREATH_CABINET, AspectTreeBlocks.BREATH_ASPECT_SLAB, AspectTreeBlocks.BREATH_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.LIFE_CABINET, AspectTreeBlocks.LIFE_ASPECT_SLAB, AspectTreeBlocks.LIFE_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.LIGHT_CABINET, AspectTreeBlocks.LIGHT_ASPECT_SLAB, AspectTreeBlocks.LIGHT_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.TIME_CABINET, AspectTreeBlocks.TIME_ASPECT_SLAB, AspectTreeBlocks.TIME_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.HEART_CABINET, AspectTreeBlocks.HEART_ASPECT_SLAB, AspectTreeBlocks.HEART_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.RAGE_CABINET, AspectTreeBlocks.RAGE_ASPECT_SLAB, AspectTreeBlocks.RAGE_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.BLOOD_CABINET, AspectTreeBlocks.BLOOD_ASPECT_SLAB, AspectTreeBlocks.BLOOD_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.DOOM_CABINET, AspectTreeBlocks.DOOM_ASPECT_SLAB, AspectTreeBlocks.DOOM_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.VOID_CABINET, AspectTreeBlocks.VOID_ASPECT_SLAB, AspectTreeBlocks.VOID_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.SPACE_CABINET, AspectTreeBlocks.SPACE_ASPECT_SLAB, AspectTreeBlocks.SPACE_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.MIND_CABINET, AspectTreeBlocks.MIND_ASPECT_SLAB, AspectTreeBlocks.MIND_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.HOPE_CABINET, AspectTreeBlocks.HOPE_ASPECT_SLAB, AspectTreeBlocks.HOPE_ASPECT_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.CARVED_CABINET, MSItems.CARVED_SLAB, MSItems.CARVED_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.TREATED_CABINET, MSItems.TREATED_PLANKS_SLAB, MSItems.TREATED_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.LACQUERED_CABINET, MSItems.LACQUERED_SLAB, MSItems.LACQUERED_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.GLOWING_CABINET, MSItems.GLOWING_SLAB, MSItems.GLOWING_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.FROST_CABINET, MSItems.FROST_SLAB, MSItems.FROST_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.RAINBOW_CABINET, MSItems.RAINBOW_SLAB, MSItems.RAINBOW_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.END_CABINET, MSItems.END_SLAB, MSItems.END_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.DEAD_CABINET, MSItems.DEAD_SLAB, MSItems.DEAD_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.CINDERED_CABINET, MSItems.CINDERED_SLAB, MSItems.CINDERED_TRAPDOOR, recipeBuilder);
        cabinetBlock(RecipeCategory.BUILDING_BLOCKS, FDCompatItems.SHADEWOOD_CABINET, MSItems.SHADEWOOD_SLAB, MSItems.SHADEWOOD_TRAPDOOR, recipeBuilder);

        CookingPotRecipeBuilder.cookingPotRecipe(MSItems.JAR_OF_BUGS.get(), 1, 100, 0.35f, Items.GLASS_BOTTLE)
                .addIngredient(MSTags.Items.BUGS)
                .addIngredient(MSTags.Items.BUGS)
                .addIngredient(MSTags.Items.BUGS)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeBuilder);

        CookingPotRecipeBuilder.cookingPotRecipe(MSItems.GRUB_SAUCE.get(), 2, 100, 0.35f, Items.PAPER)
                .addIngredient(MSTags.Items.BUGS)
                .addIngredient(MSTags.Items.BUGS)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeBuilder);

        CookingPotRecipeBuilder.cookingPotRecipe(FDCompatItems.BILESLAW.get(), 1, 200, 1f)
                .addIngredient(CommonTags.CROPS_CABBAGE)
                .addIngredient(CommonTags.CROPS_CABBAGE)
                .addIngredient(Items.CARROT)
                .addIngredient(MSTags.Items.BUGS)
                .addIngredient(MSItems.GRUB_SAUCE)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeBuilder);

        CookingPotRecipeBuilder.cookingPotRecipe(FDCompatItems.STRAWBERRY_MILKSHAKE.get(), 2, 100, 0.35f, Items.GLASS_BOTTLE)
                .addIngredient(MSItems.STRAWBERRY_CHUNK)
                .addIngredient(Items.ICE)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/milk")))
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(recipeBuilder);

    }

    public static void cabinetBlock (RecipeCategory category, Supplier<Item> resultItem, ItemLike slabType, ItemLike trapdoorType, RecipeOutput recipeBuilder){
        ShapedRecipeBuilder.shaped(category, resultItem.get())
                .pattern("___")
                .pattern("# #")
                .pattern("___")
                .define('_', slabType)
                .define('#', trapdoorType)
                .unlockedBy("has_"+trapdoorType.asItem().toString(), has(trapdoorType))
                .save(recipeBuilder);
    }

}
