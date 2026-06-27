package com.voxelpartum.minestuck_extended.block;

import com.mraof.minestuck.block.machine.ComputerBlock;
import com.mraof.minestuck.computer.theme.MSComputerThemes;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.util.MSESoundEvents;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MSEBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(MinestuckExtended.MOD_ID);

    public static final DeferredBlock<Block> CHESS_TILE = REGISTER.register("chess_tile", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)));

    public static final DeferredBlock<Block> SKAIA_PC = REGISTER.register("skaia_pc", () -> new ComputerBlock(MSEBlockShapes.SKAIA_PC_SHAPE, MSEBlockShapes.SKAIA_PC_SHAPE, MSComputerThemes.JOY, Block.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(4.0F)));

    public static final DeferredBlock<Block> HOPEYGLASS = REGISTER.register("hopeyglass", ()-> new StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final DeferredBlock<Block> HOPEYGLASS_PANE = REGISTER.register("hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final DeferredBlock<Block> HOPEYGLASS_PILLAR = REGISTER.register("hopeyglass_pillar", ()-> new StainedGlassPillarBock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));

    public static final DeferredBlock<Block> DEPTHS_HOPEYGLASS = REGISTER.register("depths_hopeyglass", ()-> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final DeferredBlock<Block> DEPTHS_HOPEYGLASS_PANE = REGISTER.register("depths_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));

    public static final DeferredBlock<Block> RED_HOPEYGLASS = REGISTER.register("red_hopeyglass", ()-> new StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)));
    public static final DeferredBlock<Block> ORANGE_HOPEYGLASS = REGISTER.register("orange_hopeyglass", ()-> new StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final DeferredBlock<Block> YELLOW_HOPEYGLASS = REGISTER.register("yellow_hopeyglass", ()-> new StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)));
    public static final DeferredBlock<Block> LIME_HOPEYGLASS = REGISTER.register("lime_hopeyglass", ()-> new StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)));
    public static final DeferredBlock<Block> GREEN_HOPEYGLASS = REGISTER.register("green_hopeyglass", ()-> new StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)));
    public static final DeferredBlock<Block> CYAN_HOPEYGLASS = REGISTER.register("cyan_hopeyglass", ()-> new StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)));
    public static final DeferredBlock<Block> LIGHT_BLUE_HOPEYGLASS = REGISTER.register("light_blue_hopeyglass", ()-> new StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final DeferredBlock<Block> BLUE_HOPEYGLASS = REGISTER.register("blue_hopeyglass", ()-> new StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)));
    public static final DeferredBlock<Block> PURPLE_HOPEYGLASS = REGISTER.register("purple_hopeyglass", ()-> new StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)));
    public static final DeferredBlock<Block> MAGENTA_HOPEYGLASS = REGISTER.register("magenta_hopeyglass", ()-> new StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final DeferredBlock<Block> PINK_HOPEYGLASS = REGISTER.register("pink_hopeyglass", ()-> new StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)));
    public static final DeferredBlock<Block> WHITE_HOPEYGLASS = REGISTER.register("white_hopeyglass", ()-> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final DeferredBlock<Block> LIGHT_GRAY_HOPEYGLASS = REGISTER.register("light_gray_hopeyglass", ()-> new StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final DeferredBlock<Block> GRAY_HOPEYGLASS = REGISTER.register("gray_hopeyglass", ()-> new StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)));
    public static final DeferredBlock<Block> BLACK_HOPEYGLASS = REGISTER.register("black_hopeyglass", ()-> new StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)));
    public static final DeferredBlock<Block> BROWN_HOPEYGLASS = REGISTER.register("brown_hopeyglass", ()-> new StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)));

    public static final DeferredBlock<Block> RED_HOPEYGLASS_PANE = REGISTER.register("red_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.RED, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)));
    public static final DeferredBlock<Block> ORANGE_HOPEYGLASS_PANE = REGISTER.register("orange_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final DeferredBlock<Block> YELLOW_HOPEYGLASS_PANE = REGISTER.register("yellow_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.YELLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)));
    public static final DeferredBlock<Block> LIME_HOPEYGLASS_PANE = REGISTER.register("lime_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.LIME, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)));
    public static final DeferredBlock<Block> GREEN_HOPEYGLASS_PANE = REGISTER.register("green_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.GREEN, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)));
    public static final DeferredBlock<Block> CYAN_HOPEYGLASS_PANE = REGISTER.register("cyan_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)));
    public static final DeferredBlock<Block> LIGHT_BLUE_HOPEYGLASS_PANE = REGISTER.register("light_blue_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final DeferredBlock<Block> BLUE_HOPEYGLASS_PANE = REGISTER.register("blue_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)));
    public static final DeferredBlock<Block> PURPLE_HOPEYGLASS_PANE = REGISTER.register("purple_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.PURPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)));
    public static final DeferredBlock<Block> MAGENTA_HOPEYGLASS_PANE = REGISTER.register("magenta_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final DeferredBlock<Block> PINK_HOPEYGLASS_PANE = REGISTER.register("pink_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.PINK, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)));
    public static final DeferredBlock<Block> WHITE_HOPEYGLASS_PANE = REGISTER.register("white_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final DeferredBlock<Block> LIGHT_GRAY_HOPEYGLASS_PANE = REGISTER.register("light_gray_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final DeferredBlock<Block> GRAY_HOPEYGLASS_PANE = REGISTER.register("gray_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)));
    public static final DeferredBlock<Block> BLACK_HOPEYGLASS_PANE = REGISTER.register("black_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.BLACK, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)));
    public static final DeferredBlock<Block> BROWN_HOPEYGLASS_PANE = REGISTER.register("brown_hopeyglass_pane", ()-> new StainedGlassPaneBlock(DyeColor.BROWN, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)));


    public static final DeferredBlock<Block> DIAMOND_LICHEN = REGISTER.register("diamond_lichen", ()->new GlowLichenBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GLOW_LICHEN).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN).lightLevel(GlowLichenBlock.emission(7)).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CRUXITE_LICHEN = REGISTER.register("cruxite_lichen", ()->new GlowLichenBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GLOW_LICHEN).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN).lightLevel(GlowLichenBlock.emission(7)).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> URANIUM_LICHEN = REGISTER.register("uranium_lichen", ()->new GlowLichenBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GLOW_LICHEN).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN).lightLevel(GlowLichenBlock.emission(7)).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> PLUSH_VRISKA = REGISTER.register("plush_vriska", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> PLUSH_NEPETA = REGISTER.register("plush_nepeta", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL)));
    public static final DeferredBlock<Block> PLUSH_GENESIS_FROG = REGISTER.register("plush_genesis_frog", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));
    public static final DeferredBlock<Block> PLUSH_SPADES_SLICK = REGISTER.register("plush_spades_slick", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));
    public static final DeferredBlock<Block> PLUSH_HEARTS_BOXCARS = REGISTER.register("plush_hearts_boxcars", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));
    public static final DeferredBlock<Block> PLUSH_DIAMONDS_DROOG = REGISTER.register("plush_diamonds_droog", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));
    public static final DeferredBlock<Block> PLUSH_CLUBS_DEUCE = REGISTER.register("plush_clubs_deuce", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));

    public static final DeferredBlock<Block> FANCYSANTA = REGISTER.register("fancy_santa", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL).noOcclusion().instabreak().sound(new DeferredSoundType(1f,1f, MSESoundEvents.SANTA_BREAK, MSESoundEvents.SANTA_BREAK, MSESoundEvents.SANTA_PLACE, MSESoundEvents.SANTA_BREAK, MSESoundEvents.SANTA_PLACE))));
    public static final DeferredBlock<Block> ZILLYSANTA = REGISTER.register("zilly_santa", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL).noOcclusion().instabreak().sound(new DeferredSoundType(1.25f,3f, MSESoundEvents.SANTA_BREAK, MSESoundEvents.SANTA_BREAK, MSESoundEvents.SANTA_PLACE, MSESoundEvents.SANTA_BREAK, MSESoundEvents.SANTA_PLACE))));


    public static final DeferredBlock<Block> PLUSH_SALAMANDER = REGISTER.register("plush_salamander", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL)));
    public static final DeferredBlock<Block> PLUSH_NAKAGATOR = REGISTER.register("plush_nakagator", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));
    public static final DeferredBlock<Block> PLUSH_IGUANA = REGISTER.register("plush_iguana", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> PLUSH_TURTLE = REGISTER.register("plush_turtle", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL)));
    public static final DeferredBlock<Block> PLUSH_MUTATED_CAT = REGISTER.register("plush_mutated_cat", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_APPLESCAB = REGISTER.register("scalemate_applescab", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_BERRYBREATH = REGISTER.register("scalemate_berrybreath", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_CINNAMONWHIFF = REGISTER.register("scalemate_cinnamonwhiff", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_HONEYTONGUE = REGISTER.register("scalemate_honeytongue", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_LEMONSNOUT = REGISTER.register("scalemate_lemonsnout", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_PINESNORT = REGISTER.register("scalemate_pinesnort", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_PUCEFOOT = REGISTER.register("scalemate_pucefoot", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_PUMPKINSNUFFLE = REGISTER.register("scalemate_pumpkinsnuffle", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_PYRALSPITE = REGISTER.register("scalemate_pyralspite", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL)));
    public static final DeferredBlock<Block> SCALEMATE_WITNESS = REGISTER.register("scalemate_witness", ()->new PlushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));

}
