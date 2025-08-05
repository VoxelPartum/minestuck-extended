package com.voxelpartum.minestuck_plus.compat.farmers_delight;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.registry.ModBlockEntityTypes;

@EventBusSubscriber(modid = MinestuckPlus.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class FDCompatBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MinestuckPlus.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, MinestuckPlus.MOD_ID);


    public static final DeferredBlock<CabinetBlock> BREATH_CABINET = BLOCKS.register("breath_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> LIFE_CABINET = BLOCKS.register("life_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> LIGHT_CABINET = BLOCKS.register("light_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> TIME_CABINET = BLOCKS.register("time_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> HEART_CABINET = BLOCKS.register("heart_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> RAGE_CABINET = BLOCKS.register("rage_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> BLOOD_CABINET = BLOCKS.register("blood_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> DOOM_CABINET = BLOCKS.register("doom_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> VOID_CABINET = BLOCKS.register("void_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> SPACE_CABINET = BLOCKS.register("space_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> MIND_CABINET = BLOCKS.register("mind_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> HOPE_CABINET = BLOCKS.register("hope_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> CARVED_CABINET = BLOCKS.register("carved_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> TREATED_CABINET = BLOCKS.register("treated_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> LACQUERED_CABINET = BLOCKS.register("lacquered_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> GLOWING_CABINET = BLOCKS.register("glowing_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> FROST_CABINET = BLOCKS.register("frost_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> RAINBOW_CABINET = BLOCKS.register("rainbow_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> END_CABINET = BLOCKS.register("end_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> DEAD_CABINET = BLOCKS.register("dead_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> CINDERED_CABINET = BLOCKS.register("cindered_cabinet",
            FDCompatBlocks::createCabinetBlock);
    public static final DeferredBlock<CabinetBlock> SHADEWOOD_CABINET = BLOCKS.register("shadewood_cabinet",
            FDCompatBlocks::createCabinetBlock);



    @SubscribeEvent
    public static void addCabinetBlockEntites(BlockEntityTypeAddBlocksEvent event){
        event.modify(ModBlockEntityTypes.CABINET.get(),
                BREATH_CABINET.get(),
                LIFE_CABINET.get(),
                LIGHT_CABINET.get(),
                TIME_CABINET.get(),
                HEART_CABINET.get(),
                RAGE_CABINET.get(),
                BLOOD_CABINET.get(),
                DOOM_CABINET.get(),
                VOID_CABINET.get(),
                SPACE_CABINET.get(),
                MIND_CABINET.get(),
                HOPE_CABINET.get(),
                CARVED_CABINET.get(),
                TREATED_CABINET.get(),
                LACQUERED_CABINET.get(),
                GLOWING_CABINET.get(),
                FROST_CABINET.get(),
                RAINBOW_CABINET.get(),
                END_CABINET.get(),
                DEAD_CABINET.get(),
                CINDERED_CABINET.get(),
                SHADEWOOD_CABINET.get());
    }

    public static CabinetBlock createCabinetBlock(){
        return new CabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL));
    }

}
