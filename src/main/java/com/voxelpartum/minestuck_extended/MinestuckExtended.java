package com.voxelpartum.minestuck_extended;

import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatBlocks;
import com.voxelpartum.minestuck_extended.effects.MSEEffects;
import com.voxelpartum.minestuck_extended.item.MSECreativeTab;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.inventory.captchalogue.MSEModi;
import com.voxelpartum.minestuck_extended.compat.CreateCompat;
import com.voxelpartum.minestuck_extended.util.MSESoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

@Mod(MinestuckExtended.MOD_ID)
public class MinestuckExtended
{
    public static final String MOD_ID = "minestuck_extended";

    public static ResourceLocation id(String path){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID,path);
    }

    public MinestuckExtended(IEventBus modEventBus, ModContainer modContainer)
    {

        if(ModList.get().isLoaded("create")){ CreateCompat.REGISTER.register(modEventBus); }
        if(ModList.get().isLoaded("farmersdelight")){
            FDCompatBlocks.BLOCKS.register(modEventBus);
            FDCompatBlocks.BLOCK_ENTITIES.register(modEventBus);
            FDCompatItems.ITEMS.register(modEventBus);
        }

        MSEItems.REGISTER.register(modEventBus);
        MSEBlocks.REGISTER.register(modEventBus);
        MSECreativeTab.REGISTER.register(modEventBus);
        MSEEffects.REGISTER.register(modEventBus);
        MSESoundEvents.REGISTER.register(modEventBus);

        MSEModi.REGISTER.register(modEventBus);

    }

    public static ResourceLocation asResource(String path){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

}
