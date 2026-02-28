package com.voxelpartum.minestuck_extended.data.loot_tables.chest_loot;

import artifacts.registry.ModItems;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public class MSELootSubProvider implements LootTableSubProvider {
    public MSELootSubProvider(HolderLookup.Provider provider) {
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        //#region Artifacts Titles
        output.accept(key("chests/inject/artifacts/title/bucket_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.OBSIDIAN_SKULL.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SNORKEL.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.HELIUM_FLAMINGO.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.UMBRELLA.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.PLASTIC_DRINKING_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.NOVELTY_DRINKING_HAT.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/cake_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.PLASTIC_DRINKING_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.NOVELTY_DRINKING_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ONION_RING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FERAL_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STEADFAST_SPIKES.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/clockwork_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.WITHERED_BRACELET.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STEADFAST_SPIKES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STRIDER_SHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CRYSTAL_HEART.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.KITTY_SLIPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CROSS_NECKLACE.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/frogs_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.UMBRELLA.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHARM_OF_SHRINKING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.PANIC_NECKLACE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CROSS_NECKLACE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ROOTED_BOOTS.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/light_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.CHARM_OF_SHRINKING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ONION_RING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CROSS_NECKLACE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CLOUD_IN_A_BOTTLE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANTIDOTE_VESSEL.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SCARF_OF_INVISIBILITY.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/monsters_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.NIGHT_VISION_GOGGLES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.VAMPIRIC_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FERAL_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STEADFAST_SPIKES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/pulse_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.PANIC_NECKLACE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CRYSTAL_HEART.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHORUS_TOTEM.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.VAMPIRIC_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.UMBRELLA.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANTIDOTE_VESSEL.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/rabbits_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.BUNNY_HOPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.UNIVERSAL_ATTRACTOR.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANTIDOTE_VESSEL.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WARP_DRIVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.LUCKY_SCARF.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/silence_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.KITTY_SLIPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BUNNY_HOPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.VAMPIRIC_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CLOUD_IN_A_BOTTLE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.HELIUM_FLAMINGO.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.AQUA_DASHERS.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/thought_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.PANIC_NECKLACE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CRYSTAL_HEART.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CROSS_NECKLACE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.RUNNING_SHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CLOUD_IN_A_BOTTLE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANTIDOTE_VESSEL.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/thunder_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.UMBRELLA.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FLIPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.AQUA_DASHERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FERAL_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ONION_RING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.HELIUM_FLAMINGO.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/towers_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.CLOUD_IN_A_BOTTLE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.HELIUM_FLAMINGO.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WARP_DRIVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHORUS_TOTEM.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHARM_OF_SHRINKING.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/title/wind_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.CLOUD_IN_A_BOTTLE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.RUNNING_SHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.THORN_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SCARF_OF_INVISIBILITY.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.HELIUM_FLAMINGO.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHORUS_TOTEM.value()).setQuality(1).setWeight(1))
                ));
        //#endregion Artifacts Titles

        //#region Artifacts Terrains
        output.accept(key("chests/inject/artifacts/terrain/end_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COWBOY_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.KITTY_SLIPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.NIGHT_VISION_GOGGLES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SHOCK_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/flora_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ROOTED_BOOTS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.THORN_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ONION_RING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANTIDOTE_VESSEL.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/forest_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.LUCKY_SCARF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ROOTED_BOOTS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FERAL_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SCARF_OF_INVISIBILITY.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STEADFAST_SPIKES.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/frost_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SNOWSHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SHOCK_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHARM_OF_SHRINKING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SCARF_OF_INVISIBILITY.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CROSS_NECKLACE.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/fungi_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.CHORUS_TOTEM.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHARM_OF_SHRINKING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.RUNNING_SHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.POCKET_PISTON.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.GOLDEN_HOOK.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.UMBRELLA.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/heat_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.FLAME_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STRIDER_SHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.PANIC_NECKLACE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.OBSIDIAN_SKULL.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WITHERED_BRACELET.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FIRE_GAUNTLET.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/lush_deserts_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.AQUA_DASHERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.KITTY_SLIPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ROOTED_BOOTS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANTIDOTE_VESSEL.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANGLERS_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BUNNY_HOPPERS.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/petrification_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.PICKAXE_HEATER.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WITHERED_BRACELET.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.UNIVERSAL_ATTRACTOR.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/rain_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.UMBRELLA.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.AQUA_DASHERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FLIPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SNORKEL.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHARM_OF_SINKING.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.ANGLERS_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.HELIUM_FLAMINGO.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/rainbow_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.AQUA_DASHERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.RUNNING_SHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CRYSTAL_HEART.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/red_sand_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COWBOY_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.KITTY_SLIPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.NIGHT_VISION_GOGGLES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SHOCK_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/red_sandstone_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COWBOY_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FIRE_GAUNTLET.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CRYSTAL_HEART.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/rock_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.NOVELTY_DRINKING_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.PLASTIC_DRINKING_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.NIGHT_VISION_GOGGLES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.PICKAXE_HEATER.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STEADFAST_SPIKES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.THORN_PENDANT.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/sand_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COWBOY_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BUNNY_HOPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.NIGHT_VISION_GOGGLES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SHOCK_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/sandstone_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COWBOY_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SUPERSTITIOUS_HAT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.POCKET_PISTON.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.PANIC_NECKLACE.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/shade_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.NIGHT_VISION_GOGGLES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.AQUA_DASHERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.LUCKY_SCARF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CLOUD_IN_A_BOTTLE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BUNNY_HOPPERS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHARM_OF_SINKING.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/taiga_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.ROOTED_BOOTS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.FERAL_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.STEADFAST_SPIKES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.POWER_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.THORN_PENDANT.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.NIGHT_VISION_GOGGLES.value()).setQuality(1).setWeight(1))
                ));

        output.accept(key("chests/inject/artifacts/terrain/wood_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,1))
                        .add(LootItem.lootTableItem(ModItems.DIGGING_CLAWS.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.UNIVERSAL_ATTRACTOR.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.EVERLASTING_BEEF.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.VAMPIRIC_GLOVE.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.RUNNING_SHOES.value()).setQuality(1).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.KITTY_SLIPPERS.value()).setQuality(1).setWeight(1))
                ));
        //#endregion Artifacts Terrains

        //#region Create Titles
        output.accept(key("chests/inject/create/title/clockwork_inject"),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0,3))
                        .add(LootItem.lootTableItem(AllItems.ANDESITE_ALLOY).setQuality(0).setWeight(8))
                        .add(LootItem.lootTableItem(AllBlocks.SHAFT).setQuality(0).setWeight(10)).apply(countRange(0,2))
                        .add(LootItem.lootTableItem(AllBlocks.COGWHEEL).setQuality(0).setWeight(10)).apply(countRange(0,3))
                        .add(LootItem.lootTableItem(AllBlocks.LARGE_COGWHEEL).setQuality(0).setWeight(10)).apply(countRange(0,2))
                        .add(LootItem.lootTableItem(AllItems.ZINC_NUGGET).setQuality(0).setWeight(8)).apply(countRange(0,4))
                ));
        //#endregion Create Titles
    }

    public static ResourceKey<LootTable> key(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, MinestuckExtended.id(path));
    }

    public LootItemFunction.Builder countRange(float min, float max)
    {
        return SetItemCountFunction.setCount(UniformGenerator.between(min, max));
    }

}
