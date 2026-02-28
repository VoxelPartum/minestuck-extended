package com.voxelpartum.minestuck_extended;

import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.block.MSEFluidInteractions;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatBlocks;
import com.voxelpartum.minestuck_extended.data.loot_modifiers.MSELootModifiers;
import com.voxelpartum.minestuck_extended.effects.MSEEffects;
import com.voxelpartum.minestuck_extended.item.MSECreativeTab;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.inventory.captchalogue.MSEModi;
import com.voxelpartum.minestuck_extended.compat.CreateCompat;
import com.voxelpartum.minestuck_extended.util.MSESoundEvents;
import com.voxelpartum.minestuck_extended.world.lands.MSELandTypes;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(MinestuckExtended.MOD_ID)
public class MinestuckExtended
{
    public static final String MOD_ID = "minestuck_extended";

    public static ResourceLocation id(String path){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID,path);
    }

    public MinestuckExtended(IEventBus modEventBus, ModContainer modContainer)
    {

        modContainer.registerConfig(ModConfig.Type.SERVER, MinestuckExtendedConfig.serverSpec);

        FDCompatBlocks.BLOCKS.register(modEventBus);
        FDCompatBlocks.BLOCK_ENTITIES.register(modEventBus);
        FDCompatItems.ITEMS.register(modEventBus);

        if(ModList.get().isLoaded("create"))
            CreateCompat.REGISTER.register(modEventBus);

        MSEItems.REGISTER.register(modEventBus);
        MSELootModifiers.REGISTER.register(modEventBus);
        MSEBlocks.REGISTER.register(modEventBus);
        MSECreativeTab.REGISTER.register(modEventBus);
        MSEEffects.REGISTER.register(modEventBus);
        MSESoundEvents.REGISTER.register(modEventBus);
        //MSELandTypes.TERRAIN_REGISTER.register(modEventBus);

        MSEModi.REGISTER.register(modEventBus);

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class CommonModEvents {
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event){
            MSEFluidInteractions.registerFluidInteractions();
        }
    }


    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            addBlocking(MSEItems.SHEELD);
            addBlocking(MSEItems.POGO_SHIELD);
            addBlocking(MSEItems.MAGNET_SHIELD);
        }

        public static void addBlocking(DeferredItem<Item> item){
            ItemProperties.register(item.get(), ResourceLocation.withDefaultNamespace("blocking"),
                    ((stack, level, entity, seed) -> entity != null && entity.isUsingItem()
                    && entity.getUseItem() == stack ? 1f : 0f));
        }
    }

}
