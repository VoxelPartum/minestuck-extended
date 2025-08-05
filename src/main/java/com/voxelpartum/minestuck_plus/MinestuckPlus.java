package com.voxelpartum.minestuck_plus;

import com.voxelpartum.minestuck_plus.block.MSPBlocks;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatBlocks;
import com.voxelpartum.minestuck_plus.effects.MSPEffects;
import com.voxelpartum.minestuck_plus.item.MSPCreativeTab;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import com.voxelpartum.minestuck_plus.inventory.captchalogue.MSPModi;
import com.voxelpartum.minestuck_plus.compat.CreateCompat;
import com.voxelpartum.minestuck_plus.util.MSPSoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

@Mod(MinestuckPlus.MOD_ID)
public class MinestuckPlus
{
    public static final String MOD_ID = "minestuck_plus";

    public static ResourceLocation id(String path){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID,path);
    }

    public MinestuckPlus(IEventBus modEventBus, ModContainer modContainer)
    {

        if(ModList.get().isLoaded("create")){ CreateCompat.REGISTER.register(modEventBus); }
        if(ModList.get().isLoaded("farmersdelight")){
            FDCompatBlocks.BLOCKS.register(modEventBus);
            FDCompatBlocks.BLOCK_ENTITIES.register(modEventBus);
            FDCompatItems.ITEMS.register(modEventBus);
        }

        MSPItems.REGISTER.register(modEventBus);
        MSPBlocks.REGISTER.register(modEventBus);
        MSPCreativeTab.REGISTER.register(modEventBus);
        MSPEffects.REGISTER.register(modEventBus);
        MSPSoundEvents.REGISTER.register(modEventBus);

        MSPModi.REGISTER.register(modEventBus);

    }

    public static ResourceLocation asResource(String path){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

}
