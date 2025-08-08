package com.voxelpartum.minestuck_extended.item.loot;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class MSELootTables {

    //Artifacts compat
    public static final ResourceKey<LootTable> WHOOPEE_CUSHION_INJECT = resourceKey("chests/injections/whoopee_cushion_inject");

    //Lands:
    public static final ResourceKey<LootTable> END_INJECT = resourceKey("chests/injections/end_land_inject");
    public static final ResourceKey<LootTable> FLORA_INJECT = resourceKey("chests/injections/flora_land_inject");
    public static final ResourceKey<LootTable> FOREST_INJECT = resourceKey("chests/injections/forest_land_inject");
    public static final ResourceKey<LootTable> FROST_INJECT = resourceKey("chests/injections/frost_land_inject");
    public static final ResourceKey<LootTable> FUNGI_INJECT = resourceKey("chests/injections/fungi_land_inject");
    public static final ResourceKey<LootTable> HEAT_INJECT = resourceKey("chests/injections/heat_land_inject");
    public static final ResourceKey<LootTable> LUSH_DESERTS_INJECT = resourceKey("chests/injections/lush_deserts_land_inject");
    public static final ResourceKey<LootTable> PETRIFICATION_INJECT = resourceKey("chests/injections/petrification_land_inject");
    public static final ResourceKey<LootTable> RAIN_INJECT = resourceKey("chests/injections/rain_land_inject");
    public static final ResourceKey<LootTable> RAINBOW_INJECT = resourceKey("chests/injections/rainbow_land_inject");
    public static final ResourceKey<LootTable> RED_SAND_INJECT = resourceKey("chests/injections/red_sand_land_inject");
    public static final ResourceKey<LootTable> RED_SANDSTONE_INJECT = resourceKey("chests/injections/red_sandstone_land_inject");
    public static final ResourceKey<LootTable> ROCK_INJECT = resourceKey("chests/injections/rock_land_inject");
    public static final ResourceKey<LootTable> SAND_INJECT = resourceKey("chests/injections/sand_land_inject");
    public static final ResourceKey<LootTable> SANDSTONE_INJECT = resourceKey("chests/injections/sandstone_land_inject");
    public static final ResourceKey<LootTable> SHADE_INJECT = resourceKey("chests/injections/shade_land_inject");
    public static final ResourceKey<LootTable> TAIGA_INJECT = resourceKey("chests/injections/taiga_land_inject");
    public static final ResourceKey<LootTable> WOOD_INJECT = resourceKey("chests/injections/wood_land_inject");

    //Titles:
    public static final ResourceKey<LootTable> BUCKET_INJECT = resourceKey("chests/injections/buckets_title_inject");
    public static final ResourceKey<LootTable> CAKE_INJECT = resourceKey("chests/injections/cake_title_inject");
    public static final ResourceKey<LootTable> CLOCKWORK_INJECT = resourceKey("chests/injections/clockwork_title_inject");
    public static final ResourceKey<LootTable> FROGS_INJECT = resourceKey("chests/injections/frogs_title_inject");
    public static final ResourceKey<LootTable> LIGHT_INJECT = resourceKey("chests/injections/light_title_inject");
    public static final ResourceKey<LootTable> MONSTERS_INJECT = resourceKey("chests/injections/monsters_title_inject");
    public static final ResourceKey<LootTable> PULSE_INJECT = resourceKey("chests/injections/pulse_title_inject");
    public static final ResourceKey<LootTable> RABBITS_INJECT = resourceKey("chests/injections/rabbits_title_inject");
    public static final ResourceKey<LootTable> SILENCE_INJECT = resourceKey("chests/injections/silence_title_inject");
    public static final ResourceKey<LootTable> THOUGHT_INJECT = resourceKey("chests/injections/thought_title_inject");
    public static final ResourceKey<LootTable> THUNDER_INJECT = resourceKey("chests/injections/thunder_title_inject");
    public static final ResourceKey<LootTable> TOWERS_INJECT = resourceKey("chests/injections/towers_title_inject");
    public static final ResourceKey<LootTable> UNDEAD_INJECT = resourceKey("chests/injections/undead_title_inject");
    public static final ResourceKey<LootTable> WIND_INJECT = resourceKey("chests/injections/wind_title_inject");

    private static ResourceKey<LootTable> resourceKey(String name)
    {
        return ResourceKey.create(Registries.LOOT_TABLE, MinestuckExtended.id(name));
    }
}
