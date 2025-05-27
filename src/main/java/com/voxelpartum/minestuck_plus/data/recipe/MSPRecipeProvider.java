package com.voxelpartum.minestuck_plus.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;

public class MSPRecipeProvider extends RecipeProvider {

    public MSPRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries){ super(output, registries); }

    @Override
    protected void buildRecipes(RecipeOutput recipeBuilder){

        //Here would go the more normal recipes.

        //More complicated data-gen ones.
        MSPGristCostsProvider.buildRecipes(recipeBuilder);
        MSPCombinationsProvider.buildRecipes(recipeBuilder);
    }


}
