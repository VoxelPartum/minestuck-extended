package com.voxelpartum.minestuck_plus.data.loot_tables;

import com.voxelpartum.minestuck_plus.block.MSPBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class MSPBlockLoot extends BlockLootSubProvider {

    public MSPBlockLoot(HolderLookup.Provider holder) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), holder);
    }

    @Override
    protected void generate() {

        dropSelf(MSPBlocks.CHESS_TILE.get());
        dropSelf(MSPBlocks.PLUSH_VRISKA.get());
        dropSelf(MSPBlocks.DIAMOND_LICHEN.get());

        dropSelf(MSPBlocks.PLUSH_SALAMANDER.get());
        dropSelf(MSPBlocks.PLUSH_NAKAGATOR.get());
        dropSelf(MSPBlocks.PLUSH_IGUANA.get());
        dropSelf(MSPBlocks.PLUSH_TURTLE.get());
        dropSelf(MSPBlocks.PLUSH_MUTATED_CAT.get());

        dropSelf(MSPBlocks.SCALEMATE_APPLESCAB.get());
        dropSelf(MSPBlocks.SCALEMATE_BERRYBREATH.get());
        dropSelf(MSPBlocks.SCALEMATE_CINNAMONWHIFF.get());
        dropSelf(MSPBlocks.SCALEMATE_HONEYTONGUE.get());
        dropSelf(MSPBlocks.SCALEMATE_LEMONSNOUT.get());
        dropSelf(MSPBlocks.SCALEMATE_PINESNORT.get());
        dropSelf(MSPBlocks.SCALEMATE_PUCEFOOT.get());
        dropSelf(MSPBlocks.SCALEMATE_PUMPKINSNUFFLE.get());
        dropSelf(MSPBlocks.SCALEMATE_PYRALSPITE.get());
        dropSelf(MSPBlocks.SCALEMATE_WITNESS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MSPBlocks.REGISTER.getEntries().stream().map(e -> (Block) e.value()).toList();
    }

}
