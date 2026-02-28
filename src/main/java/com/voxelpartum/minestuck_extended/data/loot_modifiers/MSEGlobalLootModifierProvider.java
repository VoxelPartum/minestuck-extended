package com.voxelpartum.minestuck_extended.data.loot_modifiers;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.world.lands.LandTypes;
import com.mraof.minestuck.world.lands.terrain.TerrainLandType;
import com.mraof.minestuck.world.lands.title.TitleLandType;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class MSEGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public MSEGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MinestuckExtended.MOD_ID);
    }

    public final ResourceLocation basic_chest = Minestuck.id("chests/medium_basic");

    @Override
    protected void start() {

        //#region Artifacts Title Chests
        modAdd("bucket", "title", Optional.empty(), Optional.of(LandTypes.BUCKETS.get()), "artifacts");
        modAdd("cake", "title", Optional.empty(), Optional.of(LandTypes.CAKE.get()), "artifacts");
        modAdd("clockwork", "title", Optional.empty(), Optional.of(LandTypes.CLOCKWORK.get()), "artifacts");
        modAdd("frogs", "title", Optional.empty(), Optional.of(LandTypes.FROGS.get()), "artifacts");
        modAdd("light", "title", Optional.empty(), Optional.of(LandTypes.LIGHT.get()), "artifacts");
        modAdd("monsters", "title", Optional.empty(), Optional.of(LandTypes.MONSTERS.get()), "artifacts");
        modAdd("pulse", "title", Optional.empty(), Optional.of(LandTypes.PULSE.get()), "artifacts");
        modAdd("rabbits", "title", Optional.empty(), Optional.of(LandTypes.RABBITS.get()), "artifacts");
        modAdd("silence", "title", Optional.empty(), Optional.of(LandTypes.SILENCE.get()), "artifacts");
        modAdd("thought", "title", Optional.empty(), Optional.of(LandTypes.THOUGHT.get()), "artifacts");
        modAdd("thunder", "title", Optional.empty(), Optional.of(LandTypes.THUNDER.get()), "artifacts");
        modAdd("towers", "title", Optional.empty(), Optional.of(LandTypes.TOWERS.get()), "artifacts");
        modAdd("wind", "title", Optional.empty(), Optional.of(LandTypes.WIND.get()), "artifacts");
        //#endregion Artifacts Title Chests

        //#region Artifacts Terrain Chests
        modAdd("end", "terrain", Optional.of(LandTypes.END.get()), Optional.empty(), "artifacts");
        modAdd("flora", "terrain", Optional.of(LandTypes.FLORA.get()), Optional.empty(), "artifacts");
        modAdd("forest", "terrain", Optional.of(LandTypes.FOREST.get()), Optional.empty(), "artifacts");
        modAdd("frost", "terrain", Optional.of(LandTypes.FROST.get()), Optional.empty(), "artifacts");
        modAdd("fungi", "terrain", Optional.of(LandTypes.FUNGI.get()), Optional.empty(), "artifacts");
        modAdd("heat", "terrain", Optional.of(LandTypes.HEAT.get()), Optional.empty(), "artifacts");
        modAdd("rain", "terrain", Optional.of(LandTypes.RAIN.get()), Optional.empty(), "artifacts");
        modAdd("rainbow", "terrain", Optional.of(LandTypes.RAINBOW.get()), Optional.empty(), "artifacts");
        modAdd("rock", "terrain", Optional.of(LandTypes.ROCK.get()), Optional.empty(), "artifacts");
        modAdd("sand", "terrain", Optional.of(LandTypes.SAND.get()), Optional.empty(), "artifacts");
        modAdd("sandstone", "terrain", Optional.of(LandTypes.SANDSTONE.get()), Optional.empty(), "artifacts");
        modAdd("red_sand", "terrain", Optional.of(LandTypes.RED_SAND.get()), Optional.empty(), "artifacts");
        modAdd("red_sandstone", "terrain", Optional.of(LandTypes.RED_SANDSTONE.get()), Optional.empty(), "artifacts");
        modAdd("shade", "terrain", Optional.of(LandTypes.SHADE.get()), Optional.empty(), "artifacts");
        modAdd("wood", "terrain", Optional.of(LandTypes.WOOD.get()), Optional.empty(), "artifacts");
        //#endregion Artifacts Terrain Chests

        //#region Other Title Chests
        modAdd("clockwork", "title", Optional.empty(), Optional.of(LandTypes.CLOCKWORK.get()), "create");
        //#endregion Other Title Chests

    }

    public void modAdd(String modifier, String folder, Optional<TerrainLandType> terrainType, Optional<TitleLandType> titleType, String modid){
        add(modid+"_"+modifier+"_inject", new MSELootModifier(new LootItemCondition[0], MinestuckExtended.id("chests/inject/"+modid+"/"+folder+"/"+modifier),
                basic_chest, terrainType, titleType), List.of(new ModLoadedCondition(modid)));
    }

}
