package com.voxelpartum.minestuck_extended.data.loot_tables;

import artifacts.registry.ModItems;
import com.mraof.minestuck.data.loot_table.MSChestLootTables;
import com.mraof.minestuck.world.lands.LandTypes;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;

import java.util.function.BiConsumer;

import static com.mraof.minestuck.data.loot_table.MSChestLootTables.locationForTitle;

public class MSEChestLootTables implements LootTableSubProvider {

    public static final ResourceKey<LootTable> RARE_ITEM_TABLE = MSChestLootTables.RARE_ITEM_TABLE;

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> lootProcessor) {

        lootProcessor.accept(locationForTitle(LandTypes.BUCKETS, RARE_ITEM_TABLE), LootTable.lootTable()
                .withPool(LootPool.lootPool().name("item")
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setWeight(25).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ETERNAL_STEAK.value()).setWeight(25).setWeight(1))
                ));

    }
}
