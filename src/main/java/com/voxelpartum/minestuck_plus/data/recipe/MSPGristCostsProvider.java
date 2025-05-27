package com.voxelpartum.minestuck_plus.data.recipe;

import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.data.recipe.GeneratedGristCostBuilder;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;

import static com.mraof.minestuck.api.alchemy.GristTypes.*;

public class MSPGristCostsProvider {

    public static void buildRecipes(RecipeOutput recipeSaver){

        GeneratedGristCostBuilder.create().build(recipeSaver, ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "generated"));

        GristCostRecipeBuilder.of(MSPItems.SHADOW_CRYSTAL.get()).grist(BUILD, 100).build(recipeSaver);

    }

}
