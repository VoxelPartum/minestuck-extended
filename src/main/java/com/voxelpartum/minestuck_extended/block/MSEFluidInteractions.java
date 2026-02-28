package com.voxelpartum.minestuck_extended.block;

import com.mraof.minestuck.block.MSBlocks;
import com.mraof.minestuck.fluid.MSFluids;
import net.minecraft.core.NonNullList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.fluids.FluidInteractionRegistry;

import java.util.Random;

public class MSEFluidInteractions {

    public static void registerFluidInteractions(){

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.OIL_TYPE.get(), fluidState -> Blocks.MAGMA_BLOCK.defaultBlockState()
                //To Do: Make the fluid xplode.
        ));

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.LIGHT_WATER_TYPE.value(), fluidState -> fluidState.isSource()
                ? Blocks.OBSIDIAN.defaultBlockState()
                : Blocks.GLOWSTONE.defaultBlockState()));

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.BLOOD_TYPE.value(), fluidState -> fluidState.isSource()
                ? Blocks.NETHERRACK.defaultBlockState()
                : MSBlocks.COAGULATED_BLOOD.get().defaultBlockState()));

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.BRAIN_JUICE_TYPE.value(), fluidState -> fluidState.isSource()
                ? Blocks.DEAD_BRAIN_CORAL_BLOCK.defaultBlockState()
                : Blocks.BRAIN_CORAL_BLOCK.defaultBlockState()));

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.WATER_COLORS_TYPE.value(), fluidState -> fluidState.isSource()
                ? Blocks.BROWN_CONCRETE.defaultBlockState()
                : randomConcrete().defaultBlockState()));

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.ENDER_TYPE.value(), fluidState -> fluidState.isSource()
                ? Blocks.OBSIDIAN.defaultBlockState()
                : Blocks.END_STONE.defaultBlockState()));

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.CAULK_TYPE.value(), fluidState -> fluidState.isSource()
                ? Blocks.OBSIDIAN.defaultBlockState()
                : Blocks.CALCITE.defaultBlockState()));

        FluidInteractionRegistry.addInteraction(NeoForgeMod.LAVA_TYPE.value(), new FluidInteractionRegistry.InteractionInformation(
                MSFluids.MOLTEN_AMBER_TYPE.value(), fluidState -> fluidState.isSource()
                ? Blocks.HONEY_BLOCK.defaultBlockState()
                : Blocks.TERRACOTTA.defaultBlockState()));

    }

    public static Block randomConcrete(){

        NonNullList<Block> concreteBlocks = NonNullList.create();
        concreteBlocks.add(Blocks.RED_TERRACOTTA);
        concreteBlocks.add(Blocks.ORANGE_TERRACOTTA);
        concreteBlocks.add(Blocks.YELLOW_TERRACOTTA);
        concreteBlocks.add(Blocks.LIME_TERRACOTTA);
        concreteBlocks.add(Blocks.GREEN_TERRACOTTA);
        concreteBlocks.add(Blocks.CYAN_TERRACOTTA);
        concreteBlocks.add(Blocks.LIGHT_BLUE_TERRACOTTA);
        concreteBlocks.add(Blocks.BLUE_TERRACOTTA);
        concreteBlocks.add(Blocks.PURPLE_TERRACOTTA);
        concreteBlocks.add(Blocks.MAGENTA_TERRACOTTA);

        return concreteBlocks.get(new Random().nextInt(concreteBlocks.size()));

    }

}
