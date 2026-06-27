package com.voxelpartum.minestuck_extended.data.tag;

import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.block.MSBlocks;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class MSEBlockTagsProvider extends BlockTagsProvider {
    public MSEBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MinestuckExtended.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@Nonnull HolderLookup.Provider provider) {

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

    tag(BlockTags.MINEABLE_WITH_SHOVEL).add(MSEBlocks.CHESS_TILE.get());

    }
}
