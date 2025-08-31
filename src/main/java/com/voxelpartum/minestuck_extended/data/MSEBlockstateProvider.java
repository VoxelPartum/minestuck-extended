package com.voxelpartum.minestuck_extended.data;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.block.PlushBlock;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import vectorwing.farmersdelight.common.block.CabinetBlock;

import java.util.function.Supplier;

import static com.mraof.minestuck.data.MSBlockStateProvider.texture;

public class MSEBlockstateProvider extends BlockStateProvider {
    public MSEBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MinestuckExtended.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(MSEBlocks.CHESS_TILE.get());
//        simpleBlock(MSEBlocks.CRACKED_END_STONE_BRICKS.get());
//        slabWithItem(MSEBlocks.CRACKED_END_STONE_BRICKS_SLAB, MSEBlocks.CRACKED_END_STONE_BRICKS);
//        stairsWithItem(MSEBlocks.CRACKED_END_STONE_BRICKS_STAIRS, MSEBlocks.CRACKED_END_STONE_BRICKS);
//        wallWithItem(MSEBlocks.CRACKED_END_STONE_BRICKS_WALL, MSEBlocks.CRACKED_END_STONE_BRICKS);

        simpleHorizontal(MSEBlocks.PLUSH_VRISKA.get());
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

        cabinetBlock(FDCompatBlocks.BREATH_CABINET.get(), "breath");
        cabinetBlock(FDCompatBlocks.LIFE_CABINET.get(), "life");
        cabinetBlock(FDCompatBlocks.LIGHT_CABINET.get(), "light");
        cabinetBlock(FDCompatBlocks.TIME_CABINET.get(), "time");
        cabinetBlock(FDCompatBlocks.HEART_CABINET.get(), "heart");
        cabinetBlock(FDCompatBlocks.RAGE_CABINET.get(), "rage");
        cabinetBlock(FDCompatBlocks.BLOOD_CABINET.get(), "blood");
        cabinetBlock(FDCompatBlocks.DOOM_CABINET.get(), "doom");
        cabinetBlock(FDCompatBlocks.VOID_CABINET.get(), "void");
        cabinetBlock(FDCompatBlocks.SPACE_CABINET.get(), "space");
        cabinetBlock(FDCompatBlocks.MIND_CABINET.get(), "mind");
        cabinetBlock(FDCompatBlocks.HOPE_CABINET.get(), "hope");
        cabinetBlock(FDCompatBlocks.CARVED_CABINET.get(), "carved");
        cabinetBlock(FDCompatBlocks.TREATED_CABINET.get(), "treated");
        cabinetBlock(FDCompatBlocks.LACQUERED_CABINET.get(), "lacquered");
        cabinetBlock(FDCompatBlocks.GLOWING_CABINET.get(), "glowing");
        cabinetBlock(FDCompatBlocks.FROST_CABINET.get(), "frost");
        cabinetBlock(FDCompatBlocks.RAINBOW_CABINET.get(), "rainbow");
        cabinetBlock(FDCompatBlocks.END_CABINET.get(), "end");
        cabinetBlock(FDCompatBlocks.DEAD_CABINET.get(), "dead");
        cabinetBlock(FDCompatBlocks.CINDERED_CABINET.get(), "cindered");
        cabinetBlock(FDCompatBlocks.SHADEWOOD_CABINET.get(), "shadewood");

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

    public void cabinetBlock(CabinetBlock block, String type) {
        this.horizontalBlock(block, state -> {
            String suffix = state.getValue(CabinetBlock.OPEN) ? "_open" : "";
            return models().orientable(blockName(block) + suffix,
                    ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/" + (type + "_cabinet_side")),
                    ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/" + (type + "_cabinet_front" + suffix)),
                    ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/" + (type + "_cabinet_top")));
        });
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
