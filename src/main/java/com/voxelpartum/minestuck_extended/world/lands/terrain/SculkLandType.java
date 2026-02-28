package com.voxelpartum.minestuck_extended.world.lands.terrain;

import com.mraof.minestuck.block.MSBlocks;
import com.mraof.minestuck.entity.MSEntityTypes;
import com.mraof.minestuck.util.MSSoundEvents;
import com.mraof.minestuck.world.biome.LandBiomeType;
import com.mraof.minestuck.world.gen.feature.MSPlacedFeatures;
import com.mraof.minestuck.world.gen.structure.blocks.StructureBlockRegistry;
import com.mraof.minestuck.world.gen.structure.village.IguanaVillagePieces;
import com.mraof.minestuck.world.lands.LandBiomeGenBuilder;
import com.mraof.minestuck.world.lands.terrain.TerrainLandType;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import net.minecraft.data.worldgen.Carvers;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.SculkPatchFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;

import static com.mraof.minestuck.world.gen.structure.blocks.StructureBlockRegistry.*;

public class SculkLandType extends TerrainLandType {


    public static final String SCULK = "minestuck_extended.sculk";

    public SculkLandType()
    {
        super(new Builder(MSEntityTypes.IGUANA).names(SCULK)
                .skylight(1/2F).fogColor(0.16,0.16,0.16)
                .music(MSSoundEvents.MUSIC_MONSTERS));
    }

    @Override
    public void registerBlocks(StructureBlockRegistry registry) {
        registry.setBlock(CRUXITE_ORE, MSEBlocks.DEEPSLATE_CRUXITE_ORE);
        registry.setBlock(URANIUM_ORE, MSBlocks.DEEPSLATE_URANIUM_ORE);
        registry.setBlock(GROUND, Blocks.DEEPSLATE);
        registry.setBlock(GROUND_SLAB, Blocks.COBBLED_DEEPSLATE_SLAB);
        registry.setBlock(SURFACE, Blocks.DEEPSLATE);
        registry.setBlock(UPPER, Blocks.DEEPSLATE);
        registry.setBlock(OCEAN, Blocks.WATER);

        registry.setBlock(STRUCTURE_PRIMARY, Blocks.DEEPSLATE_BRICKS);
        registry.setBlock(STRUCTURE_PRIMARY_DECORATIVE, Blocks.CHISELED_DEEPSLATE);
        registry.setBlock(STRUCTURE_PRIMARY_CRACKED, Blocks.CRACKED_DEEPSLATE_BRICKS);
        registry.setBlock(STRUCTURE_PRIMARY_COLUMN, Blocks.DEEPSLATE);
        registry.setBlock(STRUCTURE_PRIMARY_STAIRS, Blocks.DEEPSLATE_BRICK_STAIRS);
        registry.setBlock(STRUCTURE_PRIMARY_SLAB, Blocks.DEEPSLATE_BRICK_SLAB);
        registry.setBlock(STRUCTURE_PRIMARY_WALL, Blocks.DEEPSLATE_BRICK_WALL);

        registry.setBlock(STRUCTURE_PRIMARY_MOSSY, MSEBlocks.SCULKED_DEEPSLATE_BRICKS);
        registry.setBlock(STRUCTURE_PRIMARY_MOSSY_STAIRS, MSEBlocks.SCULKED_DEEPSLATE_BRICK_STAIRS);
        registry.setBlock(STRUCTURE_PRIMARY_MOSSY_SLAB, MSEBlocks.SCULKED_DEEPSLATE_BRICK_SLAB);
        registry.setBlock(STRUCTURE_PRIMARY_MOSSY_WALL, MSEBlocks.SCULKED_DEEPSLATE_BRICK_WALL);

        registry.setBlock(STRUCTURE_SECONDARY, Blocks.DEEPSLATE_TILES);
        registry.setBlock(STRUCTURE_SECONDARY_DECORATIVE, Blocks.COBBLED_DEEPSLATE);
        registry.setBlock(STRUCTURE_SECONDARY_STAIRS, Blocks.DEEPSLATE_TILE_STAIRS);
        registry.setBlock(STRUCTURE_SECONDARY_SLAB, Blocks.DEEPSLATE_TILE_SLAB);
        registry.setBlock(STRUCTURE_SECONDARY_WALL, Blocks.DEEPSLATE_TILE_WALL);

        registry.setBlock(STRUCTURE_WOOD, MSBlocks.DEAD_WOOD);
        registry.setBlock(STRUCTURE_LOG, MSBlocks.DEAD_LOG);
        registry.setBlock(STRUCTURE_STRIPPED_WOOD, MSBlocks.STRIPPED_DEAD_WOOD);
        registry.setBlock(STRUCTURE_STRIPPED_LOG, MSBlocks.STRIPPED_DEAD_LOG);
        registry.setBlock(STRUCTURE_PLANKS, MSBlocks.DEAD_PLANKS);
        registry.setBlock(STRUCTURE_PLANKS_SLAB, MSBlocks.DEAD_SLAB);
        registry.setBlock(STRUCTURE_PLANKS_STAIRS, MSBlocks.DEAD_STAIRS);
        registry.setBlock(STRUCTURE_PLANKS_FENCE, MSBlocks.DEAD_FENCE);
        registry.setBlock(STRUCTURE_PLANKS_FENCE_GATE, MSBlocks.DEAD_FENCE_GATE);
        registry.setBlock(STRUCTURE_PLANKS_DOOR, MSBlocks.DEAD_DOOR);
        registry.setBlock(STRUCTURE_PLANKS_TRAPDOOR, MSBlocks.DEAD_TRAPDOOR);

        registry.setBlock(STRUCTURE_WOOL_1, Blocks.GRAY_WOOL);
        registry.setBlock(STRUCTURE_WOOL_3, Blocks.CYAN_WOOL);

        registry.setBlock(VILLAGE_PATH, Blocks.LIGHT_GRAY_WOOL);
        registry.setBlock(VILLAGE_FENCE, Blocks.DEEPSLATE_TILE_WALL);

        registry.setBlock(FALL_FLUID, Blocks.WATER);
        registry.setBlock(LIGHT_BLOCK, MSBlocks.CRUXITE_LAMP);
    }

    @Override
    public void addBiomeGeneration(LandBiomeGenBuilder builder, StructureBlockRegistry blocks){
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, MSPlacedFeatures.DEAD_TREE, LandBiomeType.anyExcept(LandBiomeType.OCEAN));

        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SCULK_PATCH_DEEP_DARK, LandBiomeType.anyExcept(LandBiomeType.OCEAN));
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SCULK_PATCH_ANCIENT_CITY, LandBiomeType.anyExcept(LandBiomeType.OCEAN));
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SCULK_VEIN, LandBiomeType.anyExcept(LandBiomeType.OCEAN));

        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, MSPlacedFeatures.inline(Feature.ORE,
                        new OreConfiguration(blocks.getGroundType(), Blocks.DEEPSLATE_IRON_ORE.defaultBlockState(), 9),
                        CountPlacement.of(40), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)), BiomeFilter.biome()),
                LandBiomeType.any());

        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, MSPlacedFeatures.inline(Feature.ORE,
                        new OreConfiguration(blocks.getGroundType(), Blocks.SCULK.defaultBlockState(), 20),
                        CountPlacement.of(120), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)), BiomeFilter.biome()),
                LandBiomeType.any());

        builder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE, LandBiomeType.any());
    }

    @Override
    public void addVillageCenters(CenterRegister register){
        IguanaVillagePieces.addCenters(register);
    }

    @Override
    public void addVillagePieces(PieceRegister register, RandomSource random)
    {
        IguanaVillagePieces.addPieces(register, random);
    }

}
