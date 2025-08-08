package com.voxelpartum.minestuck_extended.data.loot_tables;

import artifacts.registry.ModItems;
import com.voxelpartum.minestuck_extended.item.loot.MSELootTables;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public class MSEChestLootTables implements LootTableSubProvider {

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> lootProcessor) {

        lootProcessor.accept(MSELootTables.WHOOPEE_CUSHION_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.WHOOPEE_CUSHION.value()))));

        lootProcessor.accept(MSELootTables.END_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.BUNNY_HOPPERS.value()))
                        .add(addItem(ModItems.CHORUS_TOTEM.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                        .add(addItem(ModItems.WARP_DRIVE.value()))
                        .add(addItem(ModItems.CRYSTAL_HEART.value()))
                        .add(addItem(ModItems.CLOUD_IN_A_BOTTLE.value()))
                ));

        lootProcessor.accept(MSELootTables.FLORA_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                        .add(addItem(ModItems.ROOTED_BOOTS.value()))
                        .add(addItem(ModItems.THORN_PENDANT.value()))
                        .add(addItem(ModItems.ONION_RING.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.ANTIDOTE_VESSEL.value()))
                ));

        lootProcessor.accept(MSELootTables.FOREST_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.LUCKY_SCARF.value()))
                        .add(addItem(ModItems.ROOTED_BOOTS.value()))
                        .add(addItem(ModItems.FERAL_CLAWS.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.SCARF_OF_INVISIBILITY.value()))
                        .add(addItem(ModItems.STEADFAST_SPIKES.value()))
                ));

        lootProcessor.accept(MSELootTables.FROST_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                        .add(addItem(ModItems.SNOWSHOES.value()))
                        .add(addItem(ModItems.SHOCK_PENDANT.value()))
                        .add(addItem(ModItems.CHARM_OF_SHRINKING.value()))
                        .add(addItem(ModItems.SCARF_OF_INVISIBILITY.value()))
                        .add(addItem(ModItems.CROSS_NECKLACE.value()))
                ));

        lootProcessor.accept(MSELootTables.FUNGI_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.CHORUS_TOTEM.value()))
                        .add(addItem(ModItems.CHARM_OF_SHRINKING.value()))
                        .add(addItem(ModItems.RUNNING_SHOES.value()))
                        .add(addItem(ModItems.POCKET_PISTON.value()))
                        .add(addItem(ModItems.GOLDEN_HOOK.value()))
                        .add(addItem(ModItems.UMBRELLA.value()))
                ));

        lootProcessor.accept(MSELootTables.HEAT_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.FLAME_PENDANT.value()))
                        .add(addItem(ModItems.STRIDER_SHOES.value()))
                        .add(addItem(ModItems.PANIC_NECKLACE.value()))
                        .add(addItem(ModItems.OBSIDIAN_SKULL.value()))
                        .add(addItem(ModItems.WITHERED_BRACELET.value()))
                        .add(addItem(ModItems.FIRE_GAUNTLET.value()))
                ));

        lootProcessor.accept(MSELootTables.LUSH_DESERTS_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.AQUA_DASHERS.value()))
                        .add(addItem(ModItems.KITTY_SLIPPERS.value()))
                        .add(addItem(ModItems.ROOTED_BOOTS.value()))
                        .add(addItem(ModItems.ANTIDOTE_VESSEL.value()))
                        .add(addItem(ModItems.ANGLERS_HAT.value()))
                        .add(addItem(ModItems.BUNNY_HOPPERS.value()))
                ));

        lootProcessor.accept(MSELootTables.PETRIFICATION_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.PICKAXE_HEATER.value()))
                        .add(addItem(ModItems.WITHERED_BRACELET.value()))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.UNIVERSAL_ATTRACTOR.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                ));

        lootProcessor.accept(MSELootTables.RAIN_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.UMBRELLA.value()))
                        .add(addItem(ModItems.AQUA_DASHERS.value()))
                        .add(addItem(ModItems.FLIPPERS.value()))
                        .add(addItem(ModItems.SNORKEL.value()))
                        .add(addItem(ModItems.CHARM_OF_SINKING.value()))
                        .add(addItem(ModItems.ANGLERS_HAT.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                ));

        lootProcessor.accept(MSELootTables.RAINBOW_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.AQUA_DASHERS.value()))
                        .add(addItem(ModItems.RUNNING_SHOES.value()))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                        .add(addItem(ModItems.CRYSTAL_HEART.value()))
                ));

        lootProcessor.accept(MSELootTables.RED_SAND_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.COWBOY_HAT.value()))
                        .add(addItem(ModItems.KITTY_SLIPPERS.value()))
                        .add(addItem(ModItems.NIGHT_VISION_GOGGLES.value()))
                        .add(addItem(ModItems.SHOCK_PENDANT.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                ));

        lootProcessor.accept(MSELootTables.RED_SANDSTONE_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.COWBOY_HAT.value()))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                        .add(addItem(ModItems.FIRE_GAUNTLET.value()))
                        .add(addItem(ModItems.CRYSTAL_HEART.value()))
                ));

        lootProcessor.accept(MSELootTables.ROCK_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.NOVELTY_DRINKING_HAT.value()))
                        .add(addItem(ModItems.PLASTIC_DRINKING_HAT.value()))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                        .add(addItem(ModItems.NIGHT_VISION_GOGGLES.value()))
                        .add(addItem(ModItems.PICKAXE_HEATER.value()))
                        .add(addItem(ModItems.STEADFAST_SPIKES.value()))
                        .add(addItem(ModItems.THORN_PENDANT.value()))
                ));

        lootProcessor.accept(MSELootTables.SAND_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.COWBOY_HAT.value()))
                        .add(addItem(ModItems.BUNNY_HOPPERS.value()))
                        .add(addItem(ModItems.NIGHT_VISION_GOGGLES.value()))
                        .add(addItem(ModItems.SHOCK_PENDANT.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                ));

        lootProcessor.accept(MSELootTables.SANDSTONE_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.COWBOY_HAT.value()))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                        .add(addItem(ModItems.POCKET_PISTON.value()))
                        .add(addItem(ModItems.PANIC_NECKLACE.value()))
                ));

        lootProcessor.accept(MSELootTables.SHADE_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.NIGHT_VISION_GOGGLES.value()))
                        .add(addItem(ModItems.AQUA_DASHERS.value()))
                        .add(addItem(ModItems.LUCKY_SCARF.value()))
                        .add(addItem(ModItems.CLOUD_IN_A_BOTTLE.value()))
                        .add(addItem(ModItems.BUNNY_HOPPERS.value()))
                        .add(addItem(ModItems.CHARM_OF_SINKING.value()))
                ));

        lootProcessor.accept(MSELootTables.TAIGA_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.ROOTED_BOOTS.value()))
                        .add(addItem(ModItems.FERAL_CLAWS.value()))
                        .add(addItem(ModItems.STEADFAST_SPIKES.value()))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.THORN_PENDANT.value()))
                        .add(addItem(ModItems.NIGHT_VISION_GOGGLES.value()))
                ));

        lootProcessor.accept(MSELootTables.WOOD_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                        .add(addItem(ModItems.UNIVERSAL_ATTRACTOR.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.VAMPIRIC_GLOVE.value()))
                        .add(addItem(ModItems.RUNNING_SHOES.value()))
                        .add(addItem(ModItems.KITTY_SLIPPERS.value()))
                ));

        lootProcessor.accept(MSELootTables.BUCKET_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.OBSIDIAN_SKULL.value()))
                        .add(addItem(ModItems.SNORKEL.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                        .add(addItem(ModItems.UMBRELLA.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.PLASTIC_DRINKING_HAT.value()))
                        .add(addItem(ModItems.NOVELTY_DRINKING_HAT.value()))
                ));

        lootProcessor.accept(MSELootTables.CAKE_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.PLASTIC_DRINKING_HAT.value()))
                        .add(addItem(ModItems.NOVELTY_DRINKING_HAT.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.ONION_RING.value()))
                        .add(addItem(ModItems.FERAL_CLAWS.value()))
                        .add(addItem(ModItems.DIGGING_CLAWS.value()))
                        .add(addItem(ModItems.STEADFAST_SPIKES.value()))
                ));

        lootProcessor.accept(MSELootTables.CLOCKWORK_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.WITHERED_BRACELET.value()))
                        .add(addItem(ModItems.STEADFAST_SPIKES.value()))
                        .add(addItem(ModItems.STRIDER_SHOES.value()))
                        .add(addItem(ModItems.CRYSTAL_HEART.value()))
                        .add(addItem(ModItems.KITTY_SLIPPERS.value()))
                        .add(addItem(ModItems.CROSS_NECKLACE.value()))
                ));

        lootProcessor.accept(MSELootTables.FROGS_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.UMBRELLA.value()))
                        .add(addItem(ModItems.CHARM_OF_SHRINKING.value()))
                        .add(addItem(ModItems.PANIC_NECKLACE.value()))
                        .add(addItem(ModItems.CROSS_NECKLACE.value()))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.ROOTED_BOOTS.value()))
                ));

        lootProcessor.accept(MSELootTables.LIGHT_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.CHARM_OF_SHRINKING.value()))
                        .add(addItem(ModItems.ONION_RING.value()))
                        .add(addItem(ModItems.CROSS_NECKLACE.value()))
                        .add(addItem(ModItems.CLOUD_IN_A_BOTTLE.value()))
                        .add(addItem(ModItems.ANTIDOTE_VESSEL.value()))
                        .add(addItem(ModItems.SCARF_OF_INVISIBILITY.value()))
                ));

        lootProcessor.accept(MSELootTables.MONSTERS_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.NIGHT_VISION_GOGGLES.value()))
                        .add(addItem(ModItems.POWER_GLOVE.value()))
                        .add(addItem(ModItems.VAMPIRIC_GLOVE.value()))
                        .add(addItem(ModItems.PANIC_NECKLACE.value()))
                        .add(addItem(ModItems.STEADFAST_SPIKES.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                ));

        lootProcessor.accept(MSELootTables.PULSE_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.PANIC_NECKLACE.value()))
                        .add(addItem(ModItems.CRYSTAL_HEART.value()))
                        .add(addItem(ModItems.CHORUS_TOTEM.value()))
                        .add(addItem(ModItems.VAMPIRIC_GLOVE.value()))
                        .add(addItem(ModItems.UMBRELLA.value()))
                        .add(addItem(ModItems.ANTIDOTE_VESSEL.value()))
                ));

        lootProcessor.accept(MSELootTables.RABBITS_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.BUNNY_HOPPERS.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                        .add(addItem(ModItems.ANTIDOTE_VESSEL.value()))
                        .add(addItem(ModItems.WARP_DRIVE.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                        .add(addItem(ModItems.LUCKY_SCARF.value()))
                ));

        lootProcessor.accept(MSELootTables.SILENCE_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.KITTY_SLIPPERS.value()))
                        .add(addItem(ModItems.BUNNY_HOPPERS.value()))
                        .add(addItem(ModItems.VAMPIRIC_GLOVE.value()))
                        .add(addItem(ModItems.CLOUD_IN_A_BOTTLE.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                        .add(addItem(ModItems.AQUA_DASHERS.value()))
                ));

        lootProcessor.accept(MSELootTables.THOUGHT_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.PANIC_NECKLACE.value()))
                        .add(addItem(ModItems.CRYSTAL_HEART.value()))
                        .add(addItem(ModItems.CROSS_NECKLACE.value()))
                        .add(addItem(ModItems.RUNNING_SHOES.value()))
                        .add(addItem(ModItems.CLOUD_IN_A_BOTTLE.value()))
                        .add(addItem(ModItems.ANTIDOTE_VESSEL.value()))
                ));

        lootProcessor.accept(MSELootTables.THUNDER_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.UMBRELLA.value()))
                        .add(addItem(ModItems.FLIPPERS.value()))
                        .add(addItem(ModItems.AQUA_DASHERS.value()))
                        .add(addItem(ModItems.FERAL_CLAWS.value()))
                        .add(addItem(ModItems.ONION_RING.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                ));

        lootProcessor.accept(MSELootTables.TOWERS_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.CLOUD_IN_A_BOTTLE.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                        .add(addItem(ModItems.WARP_DRIVE.value()))
                        .add(addItem(ModItems.CHORUS_TOTEM.value()))
                        .add(addItem(ModItems.EVERLASTING_BEEF.value()))
                        .add(addItem(ModItems.CHARM_OF_SHRINKING.value()))
                ));

        lootProcessor.accept(MSELootTables.UNDEAD_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.WITHERED_BRACELET.value()))
                        .add(addItem(ModItems.THORN_PENDANT.value()))
                        .add(addItem(ModItems.FIRE_GAUNTLET.value()))
                        .add(addItem(ModItems.STEADFAST_SPIKES.value()))
                        .add(addItem(ModItems.SUPERSTITIOUS_HAT.value()))
                        .add(addItem(ModItems.ANTIDOTE_VESSEL.value()))
                ));

        lootProcessor.accept(MSELootTables.WIND_INJECT, LootTable.lootTable()
                .withPool(LootPool.lootPool().name("minestuck_extended").setRolls(UniformGenerator.between(0,1))
                        .add(addItem(ModItems.CLOUD_IN_A_BOTTLE.value()))
                        .add(addItem(ModItems.RUNNING_SHOES.value()))
                        .add(addItem(ModItems.THORN_PENDANT.value()))
                        .add(addItem(ModItems.SCARF_OF_INVISIBILITY.value()))
                        .add(addItem(ModItems.HELIUM_FLAMINGO.value()))
                        .add(addItem(ModItems.CHORUS_TOTEM.value()))
                ));

    }

    public static LootPoolSingletonContainer.Builder<?> addItem(Item item){
        return LootItem.lootTableItem(item).setWeight(1).setQuality(1);
    }

}
