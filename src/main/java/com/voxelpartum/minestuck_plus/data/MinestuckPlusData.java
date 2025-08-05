package com.voxelpartum.minestuck_plus.data;

import com.mraof.minestuck.data.tag.MinestuckBlockTagsProvider;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.data.loot_tables.FDCompatBlockLoot;
import com.voxelpartum.minestuck_plus.data.loot_tables.MSPBlockLoot;
import com.voxelpartum.minestuck_plus.data.recipe.MSPRecipeProvider;
import com.voxelpartum.minestuck_plus.data.tag.MSPBlockTagsProvider;
import com.voxelpartum.minestuck_plus.data.tag.MSPItemTagsProvider;
import com.voxelpartum.minestuck_plus.trim.MSPArmorTrimMaterials;
import com.voxelpartum.minestuck_plus.trim.MSPArmorTrimPattern;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MinestuckPlus.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class MinestuckPlusData{

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput pOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        var builtinEntries = generator.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(pOutput, event.getLookupProvider(), registrySetBuilder(), Set.of(MinestuckPlus.MOD_ID)));
        CompletableFuture<HolderLookup.Provider> lookupProvider = builtinEntries.getRegistryProvider();

        var blockTags = generator.addProvider(event.includeServer(), new MinestuckBlockTagsProvider(pOutput, lookupProvider, fileHelper));

        generator.addProvider(event.includeClient(), new MSPBlockstateProvider(pOutput, fileHelper));
        generator.addProvider(event.includeServer(), new MSPItemTagsProvider(pOutput, event.getLookupProvider(), blockTags.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new MSPBlockTagsProvider(pOutput, event.getLookupProvider(), fileHelper));
        generator.addProvider(event.includeServer(), new MSPRecipeProvider(pOutput, event.getLookupProvider()));
        generator.addProvider(event.includeClient(), new MSPItemProvider(pOutput, fileHelper));

        generator.addProvider(event.includeServer(), new LootTableProvider(pOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(MSPBlockLoot::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(FDCompatBlockLoot::new, LootContextParamSets.BLOCK)
        ), lookupProvider));
    }

    private static RegistrySetBuilder registrySetBuilder()
    {
        return new RegistrySetBuilder()
                .add(Registries.TRIM_MATERIAL, MSPArmorTrimMaterials::bootstrap)
                .add(Registries.TRIM_PATTERN, MSPArmorTrimPattern::bootstrap);
    }
}
