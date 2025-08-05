package com.voxelpartum.minestuck_extended.data.loot_tables;

import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class MSEBlockLoot extends BlockLootSubProvider {

    public MSEBlockLoot(HolderLookup.Provider holder) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), holder);
    }

    @Override
    protected void generate() {

        dropSelf(MSEBlocks.CHESS_TILE.get());
        dropSelf(MSEBlocks.PLUSH_VRISKA.get());
        dropSelf(MSEBlocks.DIAMOND_LICHEN.get());

        dropSelf(MSEBlocks.PLUSH_SALAMANDER.get());
        dropSelf(MSEBlocks.PLUSH_NAKAGATOR.get());
        dropSelf(MSEBlocks.PLUSH_IGUANA.get());
        dropSelf(MSEBlocks.PLUSH_TURTLE.get());
        dropSelf(MSEBlocks.PLUSH_MUTATED_CAT.get());

        dropSelf(MSEBlocks.SCALEMATE_APPLESCAB.get());
        dropSelf(MSEBlocks.SCALEMATE_BERRYBREATH.get());
        dropSelf(MSEBlocks.SCALEMATE_CINNAMONWHIFF.get());
        dropSelf(MSEBlocks.SCALEMATE_HONEYTONGUE.get());
        dropSelf(MSEBlocks.SCALEMATE_LEMONSNOUT.get());
        dropSelf(MSEBlocks.SCALEMATE_PINESNORT.get());
        dropSelf(MSEBlocks.SCALEMATE_PUCEFOOT.get());
        dropSelf(MSEBlocks.SCALEMATE_PUMPKINSNUFFLE.get());
        dropSelf(MSEBlocks.SCALEMATE_PYRALSPITE.get());
        dropSelf(MSEBlocks.SCALEMATE_WITNESS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MSEBlocks.REGISTER.getEntries().stream().map(e -> (Block) e.value()).toList();
    }

}
