package com.voxelpartum.minestuck_extended.data.recipe;

import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.data.recipe.IrradiatingRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.util.MSTags;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.MethodsReturnNonnullByDefault;
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
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

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

        CookingPotRecipeBuilder.cookingPotRecipe(FDCompatItems.GRASSHOPPER_SALSA.get(), 1, 200, 1f)
                .addIngredient(MSItems.GRASSHOPPER)
                .addIngredient(MSItems.GRASSHOPPER)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(ModItems.TOMATO_SAUCE.get())
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
