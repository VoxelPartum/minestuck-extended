package com.voxelpartum.minestuck_extended.data;

import com.mraof.minestuck.block.machine.ComputerBlock;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.block.PlushBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;
import java.util.function.Supplier;

import static com.mraof.minestuck.data.MSBlockStateProvider.texture;

public class MSEBlockstateProvider extends BlockStateProvider {
    public MSEBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MinestuckExtended.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(MSEBlocks.CHESS_TILE.get());
        computerBlockWithExistingModels(MSEBlocks.SKAIA_PC);
        translucentGlassBlock(MSEBlocks.HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);

        translucentGlassBlock(MSEBlocks.DEPTHS_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.DEPTHS_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.DEPTHS_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassPillar(MSEBlocks.HOPEYGLASS_PILLAR);

        translucentGlassBlock(MSEBlocks.RED_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.RED_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.RED_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.ORANGE_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.ORANGE_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.ORANGE_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.YELLOW_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.YELLOW_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.YELLOW_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.LIME_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.LIME_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.LIME_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.GREEN_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.GREEN_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.GREEN_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.CYAN_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.CYAN_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.CYAN_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.LIGHT_BLUE_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.LIGHT_BLUE_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.LIGHT_BLUE_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.BLUE_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.BLUE_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.BLUE_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.PURPLE_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.PURPLE_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.PURPLE_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.MAGENTA_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.MAGENTA_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.MAGENTA_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.PINK_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.PINK_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.PINK_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.WHITE_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.WHITE_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.WHITE_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.LIGHT_GRAY_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.LIGHT_GRAY_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.LIGHT_GRAY_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.GRAY_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.GRAY_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.GRAY_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.BLACK_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.BLACK_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.BLACK_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);
        translucentGlassBlock(MSEBlocks.BROWN_HOPEYGLASS);
        paneBlockWithRenderType((IronBarsBlock) MSEBlocks.BROWN_HOPEYGLASS_PANE.get(), resourceBlock(name(MSEBlocks.BROWN_HOPEYGLASS.get())), ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+name(MSEBlocks.HOPEYGLASS_PANE.get())+"_top"), RenderType.TRANSLUCENT.name);

        simpleHorizontal(MSEBlocks.PLUSH_VRISKA.get());
        simpleHorizontal(MSEBlocks.PLUSH_NEPETA.get());
        simpleHorizontal(MSEBlocks.PLUSH_GENESIS_FROG.get());
        simpleHorizontal(MSEBlocks.PLUSH_SPADES_SLICK.get());
        simpleHorizontal(MSEBlocks.PLUSH_HEARTS_BOXCARS.get());
        simpleHorizontal(MSEBlocks.PLUSH_DIAMONDS_DROOG.get());
        simpleHorizontal(MSEBlocks.PLUSH_CLUBS_DEUCE.get());
        simpleHorizontal(MSEBlocks.PLUSH_SALAMANDER.get());
        simpleHorizontal(MSEBlocks.PLUSH_NAKAGATOR.get());
        simpleHorizontal(MSEBlocks.PLUSH_IGUANA.get());
        simpleHorizontal(MSEBlocks.PLUSH_TURTLE.get());
        simpleHorizontal(MSEBlocks.PLUSH_MUTATED_CAT.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_APPLESCAB.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_BERRYBREATH.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_CINNAMONWHIFF.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_HONEYTONGUE.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_LEMONSNOUT.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_PINESNORT.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_PUCEFOOT.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_PUMPKINSNUFFLE.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_PYRALSPITE.get());
        simpleHorizontal(MSEBlocks.SCALEMATE_WITNESS.get());

        simpleHorizontal(MSEBlocks.FANCYSANTA.get());
        simpleHorizontal(MSEBlocks.ZILLYSANTA.get());

    }

    private void computerBlockWithExistingModels(DeferredBlock<?> block)
    {
        computerBlock(block,
                existing(block.getId().withSuffix("_off")),
                existing(block.getId().withSuffix("_on")),
                existing(block.getId().withSuffix("_game_loaded")),
                existing(block.getId().withSuffix("_bsod")));
    }

    private void computerBlock(DeferredBlock<?> block, ModelFile off, ModelFile on, ModelFile gameLoaded, ModelFile bsod)
    {
        horizontal(block, state -> switch(state.getValue(ComputerBlock.STATE))
        {
            case OFF -> off;
            case ON -> on;
            case GAME_LOADED -> gameLoaded;
            case BROKEN -> bsod;
        });
    }

    private ModelFile existing(ResourceLocation id)
    {
        return this.models().getExistingFile(id);
    }

    private void horizontal(DeferredBlock<?> block, Function<BlockState, ModelFile> modelProvider, Property<?>... ignored)
    {
        horizontal(block, 180, modelProvider, ignored);
    }

    private void horizontal(DeferredBlock<?> block, int angleOffset, Function<BlockState, ModelFile> modelProvider, Property<?>... ignored)
    {
        getVariantBuilder(block.get())
                .forAllStatesExcept(state -> ConfiguredModel.builder()
                                .modelFile(modelProvider.apply(state))
                                .rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + angleOffset) % 360)
                                .build(),
                        ignored
                );
    }

    private String name(Block block){
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    public static ResourceLocation resourceBlock(String name) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, ModelProvider.BLOCK_FOLDER + "/" + name);
    }

    public void translucentGlassPillar(Supplier<Block> block){
        axisBlockWithRenderType((RotatedPillarBlock) block.get(), RenderType.TRANSLUCENT.name);
    }

    public void translucentGlassBlock(Supplier<Block> block){
        simpleBlock(block.get(), models().cubeAll(name(block.get()), resourceBlock(name(block.get()))).renderType(RenderType.TRANSLUCENT.name));
    }

    public void slabWithItem(Supplier<SlabBlock> block, DeferredBlock<?> sourceBlock)
    {
        slabWithItem(block, sourceBlock.getId().getPath(), texture(sourceBlock));
    }

    public void slabWithItem(Supplier<SlabBlock> block, String baseName, ResourceLocation texture)
    {
        slabWithItem(block, baseName, texture, texture);
    }

    private void slabWithItem(Supplier<SlabBlock> block, String baseName, ResourceLocation side, ResourceLocation topBottom)
    {
        ModelFile slabBottom = models().slab(baseName + "_slab", side, topBottom, topBottom);
        ModelFile slabTop = models().slabTop(baseName + "_slab_top", side, topBottom, topBottom);
        ModelFile doubleSlab = models().getExistingFile(MinestuckExtended.id(baseName));
        slabBlock(block.get(), slabBottom, slabTop, doubleSlab);
        simpleBlockItem(block.get(), slabBottom);
    }

    public void stairsWithItem(Supplier<StairBlock> block, DeferredBlock<?> sourceBlock)
    {
        stairsWithItem(block, sourceBlock.getId().getPath(), texture(sourceBlock));
    }

    void stairsWithItem(Supplier<StairBlock> block, String baseName, ResourceLocation texture)
    {
        stairsWithItem(block, baseName, texture, texture, texture);
    }

    private void stairsWithItem(Supplier<StairBlock> block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top)
    {
        ModelFile stairs = models().stairs(baseName + "_stairs", side, bottom, top);
        ModelFile stairsInner = models().stairsInner(baseName + "_inner_stairs", side, bottom, top);
        ModelFile stairsOuter = models().stairsOuter(baseName + "_outer_stairs", side, bottom, top);
        stairsBlock(block.get(), stairs, stairsInner, stairsOuter);
        simpleBlockItem(block.get(), stairs);
    }

    void paneWithItem(Supplier<StainedGlassPaneBlock> block, DeferredBlock<?> sourceBlock)
    {
        paneWithItem(block, sourceBlock.getId().getPath(), texture(sourceBlock));
    }

    public void paneWithItem(Supplier<StainedGlassPaneBlock> block, String baseName, ResourceLocation texture)
    {
        ModelFile paneInventory = models().wallInventory(baseName + "_pane_inventory", texture);
        simpleBlockItem(block.get(), paneInventory);
    }

    void wallWithItem(Supplier<WallBlock> block, DeferredBlock<?> sourceBlock)
    {
        wallWithItem(block, sourceBlock.getId().getPath(), texture(sourceBlock));
    }

    public void wallWithItem(Supplier<WallBlock> block, String baseName, ResourceLocation texture)
    {
        wallBlock(block.get(), texture);

        ModelFile wallInventory = models().wallInventory(baseName + "_wall_inventory", texture);
        simpleBlockItem(block.get(), wallInventory);
    }

    public void simpleHorizontal(Block block){
        getVariantBuilder(block).forAllStates(state -> {
          return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/"+blockName(block))))
                  .rotationY(((int) state.getValue(PlushBlock.HORIZONTAL_FACING).toYRot() + 180) % 360)
                  .build();
        });
    }

    private String blockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

}
