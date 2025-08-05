package com.voxelpartum.minestuck_plus.data;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.block.MSPBlocks;
import com.voxelpartum.minestuck_plus.block.PlushBlock;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.block.CabinetBlock;

public class MSPBlockstateProvider extends BlockStateProvider {
    public MSPBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MinestuckPlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(MSPBlocks.CHESS_TILE.get());

        simpleHorizontal(MSPBlocks.PLUSH_VRISKA.get());
        simpleHorizontal(MSPBlocks.PLUSH_SALAMANDER.get());
        simpleHorizontal(MSPBlocks.PLUSH_NAKAGATOR.get());
        simpleHorizontal(MSPBlocks.PLUSH_IGUANA.get());
        simpleHorizontal(MSPBlocks.PLUSH_TURTLE.get());
        simpleHorizontal(MSPBlocks.PLUSH_MUTATED_CAT.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_APPLESCAB.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_BERRYBREATH.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_CINNAMONWHIFF.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_HONEYTONGUE.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_LEMONSNOUT.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_PINESNORT.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_PUCEFOOT.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_PUMPKINSNUFFLE.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_PYRALSPITE.get());
        simpleHorizontal(MSPBlocks.SCALEMATE_WITNESS.get());

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

    public void cabinetBlock(CabinetBlock block, String type) {
        this.horizontalBlock(block, state -> {
            String suffix = state.getValue(CabinetBlock.OPEN) ? "_open" : "";
            return models().orientable(blockName(block) + suffix,
                    ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "block/" + (type + "_cabinet_side")),
                    ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "block/" + (type + "_cabinet_front" + suffix)),
                    ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "block/" + (type + "_cabinet_top")));
        });
    }

    public void simpleHorizontal(Block block){
        getVariantBuilder(block).forAllStates(state -> {
          return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "block/"+blockName(block))))
                  .rotationY(((int) state.getValue(PlushBlock.HORIZONTAL_FACING).toYRot() + 180) % 360)
                  .build();
        });
    }

    private String blockName(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

}
