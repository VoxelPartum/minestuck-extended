package com.voxelpartum.minestuck_extended;

import com.mraof.minestuck.blockentity.MSBlockEntityTypes;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.block.MSEFluidInteractions;
import com.voxelpartum.minestuck_extended.data.loot_modifiers.MSELootModifiers;
import com.voxelpartum.minestuck_extended.effects.MSEEffects;
import com.voxelpartum.minestuck_extended.entity.MSEEntities;
import com.voxelpartum.minestuck_extended.item.MSECreativeTab;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.inventory.captchalogue.MSEModi;
import com.voxelpartum.minestuck_extended.compat.create.CreateCompat;
import com.voxelpartum.minestuck_extended.util.MSESoundEvents;
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
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.registries.DeferredItem;

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

        MSEItems.REGISTER.register(modEventBus);
        MSEItems.ARMOR_MATERIAL_REGISTRY.register(modEventBus);
        MSELootModifiers.REGISTER.register(modEventBus);
        MSEBlocks.REGISTER.register(modEventBus);
        MSEEntities.REGISTER.register(modEventBus);
        MSECreativeTab.REGISTER.register(modEventBus);
        MSEEffects.REGISTER.register(modEventBus);
        MSESoundEvents.REGISTER.register(modEventBus);

        MSEModi.REGISTER.register(modEventBus);

        //I've decided to make the farmer's delight stuff into its own mod :P
        if(ModList.get().isLoaded("create"))
            CreateCompat.REGISTER.register(modEventBus);

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class CommonModEvents {
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event){
            MSEFluidInteractions.registerFluidInteractions();
        }

        @SubscribeEvent
        public static void addComputerBlockEntity(BlockEntityTypeAddBlocksEvent event){
            event.modify(MSBlockEntityTypes.COMPUTER.get(), MSEBlocks.SKAIA_PC.get());
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
