package com.voxelpartum.minestuck_extended.client.model;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.client.model.weapon.BrainforkModel;
import com.voxelpartum.minestuck_extended.client.model.weapon.Thrown2x3dentModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = MinestuckExtended.MOD_ID, value = Dist.CLIENT)
public class MSEModelLayers {

    public static final ModelLayerLocation BRAINFORK = new ModelLayerLocation(MinestuckExtended.id("thrown_brainfork"), "main");
    public static final ModelLayerLocation SIXANT = new ModelLayerLocation(MinestuckExtended.id("thrown_sixant"), "main");

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(BRAINFORK, BrainforkModel::createBodyLayer);
        event.registerLayerDefinition(SIXANT, Thrown2x3dentModel::createBodyLayer);

    }

}
