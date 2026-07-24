package com.voxelpartum.minestuck_extended.data.recipe;

import com.mraof.minestuck.data.recipe.IrradiatingRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class MSERecipeProvider extends RecipeProvider {
    public MSERecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeBuilder){

        IrradiatingRecipeBuilder.irradiating(Ingredient.of(MSEItems.NORMAL_BROWNIE), MSEItems.NORMALER_BROWNIE.get(), 0.2F, 250).save(recipeBuilder);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MSEItems.GLAIVE.get())
                .pattern("  S")
                .pattern(" L ")
                .pattern("L  ")
                .define('S', Items.IRON_SWORD)
                .define('L', Items.STICK)
                .unlockedBy("has_"+BuiltInRegistries.ITEM.getKey(Items.STRING), has(Items.STRING))
                .save(recipeBuilder);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MSEItems.OVEN_MITT.get())
                .pattern("L#")
                .pattern("#S")
                .define('L', Items.LEATHER)
                .define('#', ItemTags.WOOL)
                .define('S', Items.STRING)
                .unlockedBy("has_"+BuiltInRegistries.ITEM.getKey(Items.LEATHER), has(Items.LEATHER))
                .save(recipeBuilder);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MSEItems.HEADBAND.get())
                .pattern("###")
                .pattern("# #")
                .define('#', Items.STRING)
                .unlockedBy("has_"+BuiltInRegistries.ITEM.getKey(Items.STRING), has(Items.STRING))
                .save(recipeBuilder);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MSEItems.HORUSS_HORNS.get())
                .pattern("ESE")
                .define('E', MSEItems.EQUIUS_HORNS)
                .define('S', Items.STRING)
                .unlockedBy("has_"+BuiltInRegistries.ITEM.getKey(MSEItems.EQUIUS_HORNS.get()), has(MSEItems.EQUIUS_HORNS.get()))
                .save(recipeBuilder);

        paneRecipe(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS_PANE::get, MSEItems.HOPEYGLASS, recipeBuilder);
        paneRecipe(RecipeCategory.DECORATIONS, MSEItems.DEPTHS_HOPEYGLASS_PANE::get, MSEItems.DEPTHS_HOPEYGLASS, recipeBuilder);

        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.RED_DYE, MSEItems.RED_HOPEYGLASS::get, MSEItems.RED_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.ORANGE_DYE, MSEItems.ORANGE_HOPEYGLASS::get, MSEItems.ORANGE_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.YELLOW_DYE, MSEItems.YELLOW_HOPEYGLASS::get, MSEItems.YELLOW_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.LIME_DYE, MSEItems.LIME_HOPEYGLASS::get, MSEItems.LIME_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.GREEN_DYE, MSEItems.GREEN_HOPEYGLASS::get, MSEItems.GREEN_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.CYAN_DYE, MSEItems.CYAN_HOPEYGLASS::get, MSEItems.CYAN_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.LIGHT_BLUE_DYE, MSEItems.LIGHT_BLUE_HOPEYGLASS::get, MSEItems.LIGHT_BLUE_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.BLUE_DYE, MSEItems.BLUE_HOPEYGLASS::get, MSEItems.BLUE_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.PURPLE_DYE, MSEItems.PURPLE_HOPEYGLASS::get, MSEItems.PURPLE_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.MAGENTA_DYE, MSEItems.MAGENTA_HOPEYGLASS::get, MSEItems.MAGENTA_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.PINK_DYE, MSEItems.PINK_HOPEYGLASS::get, MSEItems.PINK_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.WHITE_DYE, MSEItems.WHITE_HOPEYGLASS::get, MSEItems.WHITE_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.LIGHT_GRAY_DYE, MSEItems.LIGHT_GRAY_HOPEYGLASS::get, MSEItems.LIGHT_GRAY_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.GRAY_DYE, MSEItems.GRAY_HOPEYGLASS::get, MSEItems.GRAY_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.BLACK_DYE, MSEItems.BLACK_HOPEYGLASS::get, MSEItems.BLACK_HOPEYGLASS_PANE::get, recipeBuilder);
        stainedGlassSuiteRecipes(RecipeCategory.DECORATIONS, MSEItems.HOPEYGLASS::get, MSEItems.HOPEYGLASS_PANE::get, Items.BROWN_DYE, MSEItems.BROWN_HOPEYGLASS::get, MSEItems.BROWN_HOPEYGLASS_PANE::get, recipeBuilder);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(MSEItems.HOPEYGLASS), RecipeCategory.DECORATIONS, MSEBlocks.HOPEYGLASS_PILLAR)
                .unlockedBy("has_"+ BuiltInRegistries.ITEM.getKey(MSEItems.HOPEYGLASS.get()), has(MSEItems.HOPEYGLASS)).save(recipeBuilder);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.PLUSH_SALAMANDER.get()).unlockedBy("has_plush_salamander_item", has(MSItems.PLUSH_SALAMANDER)).requires(MSItems.PLUSH_SALAMANDER).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_salamander_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.PLUSH_NAKAGATOR.get()).unlockedBy("has_plush_nakagator_item", has(MSItems.PLUSH_NAKAGATOR)).requires(MSItems.PLUSH_NAKAGATOR).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_nakagator_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.PLUSH_IGUANA.get()).unlockedBy("has_plush_iguana_item", has(MSItems.PLUSH_IGUANA)).requires(MSItems.PLUSH_IGUANA).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_iguana_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.PLUSH_TURTLE.get()).unlockedBy("has_plush_turtle_item", has(MSItems.PLUSH_TURTLE)).requires(MSItems.PLUSH_TURTLE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_turtle_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.PLUSH_MUTATED_CAT.get()).unlockedBy("has_plush_mutated_cat_item", has(MSItems.PLUSH_MUTATED_CAT)).requires(MSItems.PLUSH_MUTATED_CAT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_mutated_cat_item_to_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.PLUSH_SALAMANDER.get()).unlockedBy("has_plush_salamander_block", has(MSEItems.PLUSH_SALAMANDER)).requires(MSEItems.PLUSH_SALAMANDER).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_salamander_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.PLUSH_NAKAGATOR.get()).unlockedBy("has_plush_nakagator_block", has(MSEItems.PLUSH_NAKAGATOR)).requires(MSEItems.PLUSH_NAKAGATOR).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_nakagator_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.PLUSH_IGUANA.get()).unlockedBy("has_plush_iguana_block", has(MSEItems.PLUSH_IGUANA)).requires(MSEItems.PLUSH_IGUANA).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_iguana_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.PLUSH_TURTLE.get()).unlockedBy("has_plush_turtle_block", has(MSEItems.PLUSH_TURTLE)).requires(MSEItems.PLUSH_TURTLE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_turtle_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.PLUSH_MUTATED_CAT.get()).unlockedBy("has_plush_mutated_cat_block", has(MSEItems.PLUSH_MUTATED_CAT)).requires(MSEItems.PLUSH_MUTATED_CAT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "plush_mutated_cat_block_to_item"));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_scalemate1_item", has(MSItems.SCALEMATE_APPLESCAB)).requires(MSItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate1_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_BERRYBREATH.get()).unlockedBy("has_scalemate2_item", has(MSItems.SCALEMATE_BERRYBREATH)).requires(MSItems.SCALEMATE_BERRYBREATH).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate2_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_CINNAMONWHIFF.get()).unlockedBy("has_scalemate3_item", has(MSItems.SCALEMATE_CINNAMONWHIFF)).requires(MSItems.SCALEMATE_CINNAMONWHIFF).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate3_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_HONEYTONGUE.get()).unlockedBy("has_scalemate4_item", has(MSItems.SCALEMATE_HONEYTONGUE)).requires(MSItems.SCALEMATE_HONEYTONGUE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate4_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_LEMONSNOUT.get()).unlockedBy("has_scalemate5_item", has(MSItems.SCALEMATE_LEMONSNOUT)).requires(MSItems.SCALEMATE_LEMONSNOUT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate5_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_PINESNORT.get()).unlockedBy("has_scalemate6_item", has(MSItems.SCALEMATE_PINESNORT)).requires(MSItems.SCALEMATE_PINESNORT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate6_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_PUCEFOOT.get()).unlockedBy("has_scalemate7_item", has(MSItems.SCALEMATE_PUCEFOOT)).requires(MSItems.SCALEMATE_PUCEFOOT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate7_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_PUMPKINSNUFFLE.get()).unlockedBy("has_scalemate8_item", has(MSItems.SCALEMATE_PUMPKINSNUFFLE)).requires(MSItems.SCALEMATE_PUMPKINSNUFFLE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate8_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_PYRALSPITE.get()).unlockedBy("has_scalemate9_item", has(MSItems.SCALEMATE_PYRALSPITE)).requires(MSItems.SCALEMATE_PYRALSPITE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate9_item_to_block"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSEItems.SCALEMATE_WITNESS.get()).unlockedBy("has_scalemate10_item", has(MSItems.SCALEMATE_WITNESS)).requires(MSItems.SCALEMATE_WITNESS).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate10_item_to_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_APPLESCAB.get()).unlockedBy("has_scalemate1_block", has(MSEItems.SCALEMATE_APPLESCAB)).requires(MSEItems.SCALEMATE_APPLESCAB).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate1_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_BERRYBREATH.get()).unlockedBy("has_scalemate2_block", has(MSEItems.SCALEMATE_BERRYBREATH)).requires(MSEItems.SCALEMATE_BERRYBREATH).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate2_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_CINNAMONWHIFF.get()).unlockedBy("has_scalemate3_block", has(MSEItems.SCALEMATE_CINNAMONWHIFF)).requires(MSEItems.SCALEMATE_CINNAMONWHIFF).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate3_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_HONEYTONGUE.get()).unlockedBy("has_scalemate4_block", has(MSEItems.SCALEMATE_HONEYTONGUE)).requires(MSEItems.SCALEMATE_HONEYTONGUE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate4_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_LEMONSNOUT.get()).unlockedBy("has_scalemate5_block", has(MSEItems.SCALEMATE_LEMONSNOUT)).requires(MSEItems.SCALEMATE_LEMONSNOUT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate5_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PINESNORT.get()).unlockedBy("has_scalemate6_block", has(MSEItems.SCALEMATE_PINESNORT)).requires(MSEItems.SCALEMATE_PINESNORT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate6_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PUCEFOOT.get()).unlockedBy("has_scalemate7_block", has(MSEItems.SCALEMATE_PUCEFOOT)).requires(MSEItems.SCALEMATE_PUCEFOOT).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate7_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PUMPKINSNUFFLE.get()).unlockedBy("has_scalemate8_block", has(MSEItems.SCALEMATE_PUMPKINSNUFFLE)).requires(MSEItems.SCALEMATE_PUMPKINSNUFFLE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate8_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_PYRALSPITE.get()).unlockedBy("has_scalemate9_block", has(MSEItems.SCALEMATE_PYRALSPITE)).requires(MSEItems.SCALEMATE_PYRALSPITE).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate9_block_to_item"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, MSItems.SCALEMATE_WITNESS.get()).unlockedBy("has_scalemate10_block", has(MSEItems.SCALEMATE_WITNESS)).requires(MSEItems.SCALEMATE_WITNESS).save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "scalemate10_block_to_item"));

        trimSmithing(recipeBuilder, MSEItems.SPIROGRAPH_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "spirograph"));
        trimSmithing(recipeBuilder, MSEItems.BREATH_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "breath"));
        trimSmithing(recipeBuilder, MSEItems.LIFE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "life"));
        trimSmithing(recipeBuilder, MSEItems.LIGHT_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "light"));
        trimSmithing(recipeBuilder, MSEItems.TIME_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "time"));
        trimSmithing(recipeBuilder, MSEItems.HEART_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "heart"));
        trimSmithing(recipeBuilder, MSEItems.RAGE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "rage"));
        trimSmithing(recipeBuilder, MSEItems.BLOOD_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "blood"));
        trimSmithing(recipeBuilder, MSEItems.DOOM_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "doom"));
        trimSmithing(recipeBuilder, MSEItems.VOID_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "void"));
        trimSmithing(recipeBuilder, MSEItems.SPACE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "space"));
        trimSmithing(recipeBuilder, MSEItems.MIND_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "mind"));
        trimSmithing(recipeBuilder, MSEItems.HOPE_ARMOR_TRIM.get(), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "hope"));

        MSEGristCostsProvider.buildRecipes(recipeBuilder);
        MSECombinationsProvider.buildRecipes(recipeBuilder);

    }

    public static void stainedGlassSuiteRecipes(RecipeCategory category, ItemLike fullGlassInput, ItemLike glassPaneInput, ItemLike dyeColor, Supplier<ItemLike> fullStainedGlassOutput, Supplier<ItemLike> stainedGlassPaneOutput, RecipeOutput recipeBuilder){
        filledRingRecipe(category, fullStainedGlassOutput, fullGlassInput, dyeColor, recipeBuilder);
        paneRecipe(category, stainedGlassPaneOutput, fullStainedGlassOutput.get(), recipeBuilder);
        filledRingRecipe(category, stainedGlassPaneOutput, glassPaneInput, dyeColor, recipeBuilder);
    }

    public static void paneRecipe(RecipeCategory category, Supplier<ItemLike> resultItem, ItemLike fullBlockItem, RecipeOutput recipeBuilder){
        ShapedRecipeBuilder.shaped(category, resultItem.get(), 16)
                .pattern("###")
                .pattern("###")
                .define('#', fullBlockItem).unlockedBy("has"+fullBlockItem.asItem(), has(fullBlockItem))
                .save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, BuiltInRegistries.ITEM.getKey(resultItem.get().asItem()).getPath())+"_pane");
    }

    public static void filledRingRecipe(RecipeCategory category, Supplier<ItemLike> resultItem, ItemLike outerItem, ItemLike innerItem, RecipeOutput recipeBuilder){
        ShapedRecipeBuilder.shaped(category, resultItem.get(), 8)
                .pattern("OOO")
                .pattern("OXO")
                .pattern("OOO")
                .define('O', outerItem)
                .define('X', innerItem)
                .unlockedBy("has_"+outerItem.asItem(), has(outerItem))
                .save(recipeBuilder, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, BuiltInRegistries.ITEM.getKey(resultItem.get().asItem()).getPath())+"_ring");
    }


}
