package com.voxelpartum.minestuck_extended.data.loot_tables;

import com.google.common.collect.Sets;
import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.item.loot.MSLootTables;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.item.loot.MSELootTables;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;

import java.util.Set;

@EventBusSubscriber(modid = MinestuckExtended.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class MSELootEvents {

    private static final String land_dir = "chests/misc_item/terrain/minestuck/";
    private static final String title_dir = "chests/misc_item/title/minestuck/";

    private static final Set<ResourceLocation> BASIC_INJECT = Sets.newHashSet(MSLootTables.BASIC_MEDIUM_CHEST.location());

    //Lands:
    private static final Set<ResourceLocation> MISC_ITEM_END_INJECT = Sets.newHashSet(resourceKey(land_dir +"end").location());
    private static final Set<ResourceLocation> MISC_ITEM_FLORA_INJECT = Sets.newHashSet(resourceKey(land_dir +"flora").location());
    private static final Set<ResourceLocation> MISC_ITEM_FOREST_INJECT = Sets.newHashSet(resourceKey(land_dir +"forest").location());
    private static final Set<ResourceLocation> MISC_ITEM_FROST_INJECT = Sets.newHashSet(resourceKey(land_dir +"frost").location());
    private static final Set<ResourceLocation> MISC_ITEM_FUNGI_INJECT = Sets.newHashSet(resourceKey(land_dir +"fungi").location());
    private static final Set<ResourceLocation> MISC_ITEM_HEAT_INJECT = Sets.newHashSet(resourceKey(land_dir +"heat").location());
    private static final Set<ResourceLocation> MISC_ITEM_LUSH_DESERT_INJECT = Sets.newHashSet(resourceKey(land_dir +"lush_deserts").location());
    private static final Set<ResourceLocation> MISC_ITEM_PETRIFICATION_INJECT = Sets.newHashSet(resourceKey(land_dir +"petrification").location());
    private static final Set<ResourceLocation> MISC_ITEM_RAIN_INJECT = Sets.newHashSet(resourceKey(land_dir +"rain").location());
    private static final Set<ResourceLocation> MISC_ITEM_RAINBOW_INJECT = Sets.newHashSet(resourceKey(land_dir +"rainbow").location());
    private static final Set<ResourceLocation> MISC_ITEM_RED_SAND_INJECT = Sets.newHashSet(resourceKey(land_dir +"red_sand").location());
    private static final Set<ResourceLocation> MISC_ITEM_RED_SANDSTONE_INJECT = Sets.newHashSet(resourceKey(land_dir +"red_sandstone").location());
    private static final Set<ResourceLocation> MISC_ITEM_ROCK_INJECT = Sets.newHashSet(resourceKey(land_dir +"rock").location());
    private static final Set<ResourceLocation> MISC_ITEM_SAND_INJECT = Sets.newHashSet(resourceKey(land_dir +"sand").location());
    private static final Set<ResourceLocation> MISC_ITEM_SANDSTONE_INJECT = Sets.newHashSet(resourceKey(land_dir +"sandstone").location());
    private static final Set<ResourceLocation> MISC_ITEM_SHADE_INJECT = Sets.newHashSet(resourceKey(land_dir +"shade").location());
    private static final Set<ResourceLocation> MISC_ITEM_TAIGA_INJECT = Sets.newHashSet(resourceKey(land_dir +"taiga").location());
    private static final Set<ResourceLocation> MISC_ITEM_WOOD_INJECT = Sets.newHashSet(resourceKey(land_dir +"wood").location());

    //Titles:
    private static final Set<ResourceLocation> MISC_ITEM_BUCKET_INJECT = Sets.newHashSet(resourceKey(title_dir +"buckets").location());
    private static final Set<ResourceLocation> MISC_ITEM_CAKE_INJECT = Sets.newHashSet(resourceKey(title_dir +"cake").location());
    private static final Set<ResourceLocation> MISC_ITEM_CLOCKWORK_INJECT = Sets.newHashSet(resourceKey(title_dir +"clockwork").location());
    private static final Set<ResourceLocation> MISC_ITEM_FROGS_INJECT = Sets.newHashSet(resourceKey(title_dir +"frogs").location());
    private static final Set<ResourceLocation> MISC_ITEM_LIGHT_INJECT = Sets.newHashSet(resourceKey(title_dir +"light").location());
    private static final Set<ResourceLocation> MISC_ITEM_MONSTERS_INJECT = Sets.newHashSet(resourceKey(title_dir +"monsters").location());
    private static final Set<ResourceLocation> MISC_ITEM_PULSE_INJECT = Sets.newHashSet(resourceKey(title_dir +"pulse").location());
    private static final Set<ResourceLocation> MISC_ITEM_RABBITS_INJECT = Sets.newHashSet(resourceKey(title_dir +"rabbits").location());
    private static final Set<ResourceLocation> MISC_ITEM_SILENCE_INJECT = Sets.newHashSet(resourceKey(title_dir +"silence").location());
    private static final Set<ResourceLocation> MISC_ITEM_THOUGHT_INJECT = Sets.newHashSet(resourceKey(title_dir +"thought").location());
    private static final Set<ResourceLocation> MISC_ITEM_THUNDER_INJECT = Sets.newHashSet(resourceKey(title_dir +"thunder").location());
    private static final Set<ResourceLocation> MISC_ITEM_TOWERS_INJECT = Sets.newHashSet(resourceKey(title_dir +"towers").location());
    private static final Set<ResourceLocation> MISC_ITEM_UNDEAD_INJECT = Sets.newHashSet(resourceKey(title_dir +"undead").location());
    private static final Set<ResourceLocation> MISC_ITEM_WIND_INJECT = Sets.newHashSet(resourceKey(title_dir +"wind").location());

    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event){

        inject(event, MISC_ITEM_BUCKET_INJECT, MSELootTables.BUCKET_INJECT, "buckets_inject");
        inject(event, MISC_ITEM_CAKE_INJECT, MSELootTables.CAKE_INJECT, "cake_inject");
        inject(event, MISC_ITEM_CLOCKWORK_INJECT, MSELootTables.CLOCKWORK_INJECT, "clockwork_inject");
        inject(event, MISC_ITEM_FROGS_INJECT, MSELootTables.FROGS_INJECT, "frogs_inject");
        inject(event, MISC_ITEM_LIGHT_INJECT, MSELootTables.LIGHT_INJECT, "light_inject");
        inject(event, MISC_ITEM_MONSTERS_INJECT, MSELootTables.MONSTERS_INJECT, "monsters_inject");
        inject(event, MISC_ITEM_PULSE_INJECT, MSELootTables.PULSE_INJECT, "pulse_inject");
        inject(event, MISC_ITEM_RABBITS_INJECT, MSELootTables.RABBITS_INJECT, "rabbits_inject");
        inject(event, MISC_ITEM_SILENCE_INJECT, MSELootTables.SILENCE_INJECT, "silence_inject");
        inject(event, MISC_ITEM_THOUGHT_INJECT, MSELootTables.THOUGHT_INJECT, "thought_inject");
        inject(event, MISC_ITEM_THUNDER_INJECT, MSELootTables.THUNDER_INJECT, "thunder_inject");
        inject(event, MISC_ITEM_TOWERS_INJECT, MSELootTables.TOWERS_INJECT, "towers_inject");
        inject(event, MISC_ITEM_UNDEAD_INJECT, MSELootTables.UNDEAD_INJECT, "undead_inject");
        inject(event, MISC_ITEM_WIND_INJECT, MSELootTables.WIND_INJECT, "wind_inject");

        inject(event, BASIC_INJECT, MSELootTables.WHOOPEE_CUSHION_INJECT, "medium_inject");
        inject(event, MISC_ITEM_END_INJECT, MSELootTables.END_INJECT, "end_land_inject");
        inject(event, MISC_ITEM_FLORA_INJECT, MSELootTables.FLORA_INJECT, "flora_land_inject");
        inject(event, MISC_ITEM_FOREST_INJECT, MSELootTables.FOREST_INJECT, "forest_land_inject");
        inject(event, MISC_ITEM_FROST_INJECT, MSELootTables.FROST_INJECT, "frost_land_inject");
        inject(event, MISC_ITEM_FUNGI_INJECT, MSELootTables.FUNGI_INJECT, "fungi_land_inject");
        inject(event, MISC_ITEM_HEAT_INJECT, MSELootTables.HEAT_INJECT, "heat_land_inject");
        inject(event, MISC_ITEM_LUSH_DESERT_INJECT, MSELootTables.LUSH_DESERTS_INJECT, "lush_deserts_land_inject");
        inject(event, MISC_ITEM_PETRIFICATION_INJECT, MSELootTables.PETRIFICATION_INJECT, "petrification_land_inject");
        inject(event, MISC_ITEM_RAIN_INJECT, MSELootTables.RAIN_INJECT, "rain_land_inject");
        inject(event, MISC_ITEM_RAINBOW_INJECT, MSELootTables.RAINBOW_INJECT, "rainbow_land_inject");
        inject(event, MISC_ITEM_RED_SAND_INJECT, MSELootTables.RED_SAND_INJECT, "red_sand_land_inject");
        inject(event, MISC_ITEM_RED_SANDSTONE_INJECT, MSELootTables.RED_SANDSTONE_INJECT, "red_sandstone_land_inject");
        inject(event, MISC_ITEM_ROCK_INJECT, MSELootTables.ROCK_INJECT, "rock_land_inject");
        inject(event, MISC_ITEM_SAND_INJECT, MSELootTables.SAND_INJECT, "sand_land_inject");
        inject(event, MISC_ITEM_SANDSTONE_INJECT, MSELootTables.SANDSTONE_INJECT, "sandstone_land_inject");
        inject(event, MISC_ITEM_SHADE_INJECT, MSELootTables.SHADE_INJECT, "shade_land_inject");
        inject(event, MISC_ITEM_TAIGA_INJECT, MSELootTables.TAIGA_INJECT, "taiga_land_inject");
        inject(event, MISC_ITEM_WOOD_INJECT, MSELootTables.WOOD_INJECT, "wood_land_inject");

    }

    private static void inject(LootTableLoadEvent event, Set<ResourceLocation> lootTableSet, ResourceKey<LootTable> injectionLootTable, String address)
    {
        if(lootTableSet.contains(event.getName()))
        {
            LootPool pool = LootPool.lootPool().add(NestedLootTable.lootTableReference(injectionLootTable)).name(address).build();
            event.getTable().addPool(pool);
        }
    }


    private static ResourceKey<LootTable> resourceKey(String name)
    {
        return ResourceKey.create(Registries.LOOT_TABLE, Minestuck.id(name));
    }
}
