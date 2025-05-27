package com.voxelpartum.minestuck_plus;

import com.voxelpartum.minestuck_plus.block.MSPBlocks;
import com.voxelpartum.minestuck_plus.effects.MSPEffects;
import com.voxelpartum.minestuck_plus.item.MSPCreativeTab;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import com.voxelpartum.minestuck_plus.inventory.captchalogue.MSPModi;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
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

        //Configs for if/when I need them.
        //modContainer.registerConfig(ModConfig.Type.COMMON, MinestuckPlusConfig.commonSpec);
        //modContainer.registerConfig(ModConfig.Type.COMMON, MinestuckPlusConfig.clientSpec);
        //modContainer.registerConfig(ModConfig.Type.COMMON, MinestuckPlusConfig.serverSpec);

        MSPItems.REGISTER.register(modEventBus);
        MSPBlocks.REGISTER.register(modEventBus);
        MSPCreativeTab.REGISTER.register(modEventBus);
        MSPEffects.REGISTER.register(modEventBus);

        MSPModi.REGISTER.register(modEventBus);

    }

    public static ResourceLocation asResource(String path){
        return ResourceLocation.fromNamespaceAndPath("minestuck_plus", path);
    }
}
