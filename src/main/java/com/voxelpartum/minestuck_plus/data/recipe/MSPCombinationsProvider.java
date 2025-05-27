package com.voxelpartum.minestuck_plus.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.combination.CombinationRecipeBuilder;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;

public class MSPCombinationsProvider {

    public static void buildRecipes(RecipeOutput consumer){

        CombinationRecipeBuilder.of(MSPItems.SHADOW_CRYSTAL)
                .input(Items.AMETHYST_SHARD).or().input(Items.BLACK_DYE)
                .build(consumer);

    }

}
