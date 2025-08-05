package com.voxelpartum.minestuck_extended.data.tag;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MSEBlockTagsProvider extends BlockTagsProvider {
    public MSEBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MinestuckExtended.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    tag(BlockTags.MINEABLE_WITH_AXE)
            .add(FDCompatBlocks.BREATH_CABINET.get())
            .add(FDCompatBlocks.LIFE_CABINET.get())
            .add(FDCompatBlocks.LIGHT_CABINET.get())
            .add(FDCompatBlocks.TIME_CABINET.get())
            .add(FDCompatBlocks.HEART_CABINET.get())
            .add(FDCompatBlocks.RAGE_CABINET.get())
            .add(FDCompatBlocks.BLOOD_CABINET.get())
            .add(FDCompatBlocks.DOOM_CABINET.get())
            .add(FDCompatBlocks.VOID_CABINET.get())
            .add(FDCompatBlocks.SPACE_CABINET.get())
            .add(FDCompatBlocks.MIND_CABINET.get())
            .add(FDCompatBlocks.HOPE_CABINET.get())
            .add(FDCompatBlocks.CARVED_CABINET.get())
            .add(FDCompatBlocks.TREATED_CABINET.get())
            .add(FDCompatBlocks.LACQUERED_CABINET.get())
            .add(FDCompatBlocks.GLOWING_CABINET.get())
            .add(FDCompatBlocks.FROST_CABINET.get())
            .add(FDCompatBlocks.RAINBOW_CABINET.get())
            .add(FDCompatBlocks.END_CABINET.get())
            .add(FDCompatBlocks.DEAD_CABINET.get())
            .add(FDCompatBlocks.CINDERED_CABINET.get())
            .add(FDCompatBlocks.SHADEWOOD_CABINET.get());

    }
}
