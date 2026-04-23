package com.voxelpartum.minestuck_extended.block;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MSEBlocks {

    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(MinestuckExtended.MOD_ID);

    public static final DeferredBlock<Block> CHESS_TILE = REGISTER.register("chess_tile", ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)));

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
