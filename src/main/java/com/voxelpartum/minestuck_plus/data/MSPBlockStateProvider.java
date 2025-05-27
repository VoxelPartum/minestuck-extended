package com.voxelpartum.minestuck_plus.data;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class MSPBlockStateProvider extends BlockStateProvider {

    public MSPBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, MinestuckPlus.MOD_ID, existingFileHelper);
    }

    //This is where all the blocks have their json files generated.
    @Override
    protected void registerStatesAndModels(){

        //When you have more items/blocks to generate, they'd go here.
    }

}
