package com.voxelpartum.minestuck_extended.data;

import com.mraof.minestuck.data.tag.MinestuckBlockTagsProvider;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.data.loot_tables.FDCompatBlockLoot;
import com.voxelpartum.minestuck_extended.data.loot_tables.MSEBlockLoot;
import com.voxelpartum.minestuck_extended.data.loot_tables.MSEChestLootTables;
import com.voxelpartum.minestuck_extended.data.recipe.MSERecipeProvider;
import com.voxelpartum.minestuck_extended.data.tag.MSEBlockTagsProvider;
import com.voxelpartum.minestuck_extended.data.tag.MSEItemTagsProvider;
import com.voxelpartum.minestuck_extended.trim.MSEArmorTrimMaterials;
import com.voxelpartum.minestuck_extended.trim.MSEArmorTrimPattern;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
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

@EventBusSubscriber(modid = MinestuckExtended.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class MinestuckExtendedData {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput pOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        var builtinEntries = generator.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(pOutput, event.getLookupProvider(), registrySetBuilder(), Set.of(MinestuckExtended.MOD_ID)));
        CompletableFuture<HolderLookup.Provider> lookupProvider = builtinEntries.getRegistryProvider();

        var blockTags = generator.addProvider(event.includeServer(), new MinestuckBlockTagsProvider(pOutput, lookupProvider, fileHelper));

        generator.addProvider(event.includeClient(), new MSEBlockstateProvider(pOutput, fileHelper));
        generator.addProvider(event.includeServer(), new MSEItemTagsProvider(pOutput, event.getLookupProvider(), blockTags.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new MSEBlockTagsProvider(pOutput, event.getLookupProvider(), fileHelper));
        generator.addProvider(event.includeServer(), new MSERecipeProvider(pOutput, event.getLookupProvider()));
        generator.addProvider(event.includeClient(), new MSEItemProvider(pOutput, fileHelper));

        generator.addProvider(event.includeServer(), new LootTableProvider(pOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(MSEBlockLoot::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(FDCompatBlockLoot::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry((provider ) -> new MSEChestLootTables(), LootContextParamSets.CHEST)
        ), lookupProvider));
    }

    private static RegistrySetBuilder registrySetBuilder()
    {
        return new RegistrySetBuilder()
                .add(Registries.TRIM_MATERIAL, MSEArmorTrimMaterials::bootstrap)
                .add(Registries.TRIM_PATTERN, MSEArmorTrimPattern::bootstrap);
    }
}
