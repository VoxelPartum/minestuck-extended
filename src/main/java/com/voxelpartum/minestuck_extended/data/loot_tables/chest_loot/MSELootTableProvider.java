package com.voxelpartum.minestuck_extended.data.loot_tables.chest_loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MSELootTableProvider extends LootTableProvider {
    public MSELootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries,
                                List<SubProviderEntry> subProviders) {
        super(output, Set.of(), subProviders, registries);
    }
}
