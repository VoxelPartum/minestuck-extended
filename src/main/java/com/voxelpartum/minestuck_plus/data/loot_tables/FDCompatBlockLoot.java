package com.voxelpartum.minestuck_plus.data.loot_tables;

import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class FDCompatBlockLoot extends BlockLootSubProvider {

    public FDCompatBlockLoot(HolderLookup.Provider holder) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), holder);
    }

    @Override
    protected void generate() {

        dropNamedContainer(FDCompatBlocks.BREATH_CABINET.get());
        dropNamedContainer(FDCompatBlocks.LIFE_CABINET.get());
        dropNamedContainer(FDCompatBlocks.LIGHT_CABINET.get());
        dropNamedContainer(FDCompatBlocks.TIME_CABINET.get());
        dropNamedContainer(FDCompatBlocks.HEART_CABINET.get());
        dropNamedContainer(FDCompatBlocks.RAGE_CABINET.get());
        dropNamedContainer(FDCompatBlocks.BLOOD_CABINET.get());
        dropNamedContainer(FDCompatBlocks.DOOM_CABINET.get());
        dropNamedContainer(FDCompatBlocks.VOID_CABINET.get());
        dropNamedContainer(FDCompatBlocks.SPACE_CABINET.get());
        dropNamedContainer(FDCompatBlocks.MIND_CABINET.get());
        dropNamedContainer(FDCompatBlocks.HOPE_CABINET.get());
        dropNamedContainer(FDCompatBlocks.CARVED_CABINET.get());
        dropNamedContainer(FDCompatBlocks.TREATED_CABINET.get());
        dropNamedContainer(FDCompatBlocks.LACQUERED_CABINET.get());
        dropNamedContainer(FDCompatBlocks.GLOWING_CABINET.get());
        dropNamedContainer(FDCompatBlocks.FROST_CABINET.get());
        dropNamedContainer(FDCompatBlocks.RAINBOW_CABINET.get());
        dropNamedContainer(FDCompatBlocks.END_CABINET.get());
        dropNamedContainer(FDCompatBlocks.DEAD_CABINET.get());
        dropNamedContainer(FDCompatBlocks.CINDERED_CABINET.get());
        dropNamedContainer(FDCompatBlocks.SHADEWOOD_CABINET.get());

    }

    protected void dropNamedContainer(Block block) {
        add(block, this::createNameableBlockEntityTable);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return FDCompatBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();
    }

}
