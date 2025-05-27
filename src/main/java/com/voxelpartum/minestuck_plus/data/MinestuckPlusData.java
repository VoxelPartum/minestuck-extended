package com.voxelpartum.minestuck_plus.data;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.data.recipe.MSPRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = MinestuckPlus.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MinestuckPlusData {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput pOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new MSPItemProvider(pOutput, fileHelper));
        generator.addProvider(event.includeClient(), new MSPBlockStateProvider(pOutput, fileHelper));

        //I'll get to it when I get to it?
        //generator.addProvider(event.includeServer(), new MSPRecipeProvider(pOutput, event.getLookupProvider()));

    }
}
