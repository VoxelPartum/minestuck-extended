package com.voxelpartum.minestuck_extended.data.tag;

import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.block.MSBlocks;
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

//        tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(MSEBlocks.CRACKED_END_STONE_BRICKS.get())
//                .add(MSEBlocks.CRACKED_END_STONE_BRICKS_SLAB.get())
//                .add(MSEBlocks.CRACKED_END_STONE_BRICKS_STAIRS.get())
//                .add(MSEBlocks.CRACKED_END_STONE_BRICKS_WALL.get())
//        ;
//
//        tag(BlockTags.WALLS).add(MSEBlocks.CRACKED_END_STONE_BRICKS_WALL.get());

        tag(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(AspectTreeBlocks.BREATH_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.LIFE_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.LIGHT_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.TIME_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.HEART_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.RAGE_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.BLOOD_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.DOOM_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.VOID_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.SPACE_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.MIND_ASPECT_BOOKSHELF.asBlock())
                .add(AspectTreeBlocks.HOPE_ASPECT_BOOKSHELF.asBlock())
                .add(MSBlocks.TREATED_BOOKSHELF.get())
                .add(MSBlocks.GLOWING_BOOKSHELF.get())
                .add(MSBlocks.FROST_BOOKSHELF.get())
                .add(MSBlocks.RAINBOW_BOOKSHELF.get())
                .add(MSBlocks.END_BOOKSHELF.get())
                .add(MSBlocks.DEAD_BOOKSHELF.get())
                .add(MSBlocks.CINDERED_BOOKSHELF.get())
                .add(MSBlocks.SHADEWOOD_BOOKSHELF.get())
        ;

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
