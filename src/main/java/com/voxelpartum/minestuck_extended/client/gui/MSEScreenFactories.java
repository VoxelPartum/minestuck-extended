package com.voxelpartum.minestuck_extended.client.gui;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.client.gui.captchalouge.ArraySylladexScreen;
import com.voxelpartum.minestuck_extended.client.gui.captchalouge.RouletteSylladexScreen;
import com.voxelpartum.minestuck_extended.client.gui.captchalouge.ZipSylladexScreen;
import com.voxelpartum.minestuck_extended.inventory.captchalogue.MSEModi;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

import static com.mraof.minestuck.client.gui.MSScreenFactories.registerSylladexFactory;

@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD, modid = MinestuckExtended.MOD_ID)
public class MSEScreenFactories {

    @SubscribeEvent
    public static void registerScreenFactories(RegisterMenuScreensEvent event){
        registerSylladexFactory(MSEModi.ROULETTE, RouletteSylladexScreen::new);
        registerSylladexFactory(MSEModi.ZIP, ZipSylladexScreen::new);
        registerSylladexFactory(MSEModi.ARRAY, ArraySylladexScreen::new);
    }

}
