package com.voxelpartum.minestuck_plus.client.gui;

import com.google.common.collect.Maps;
import com.mraof.minestuck.client.gui.captchalouge.SylladexScreen;
import com.mraof.minestuck.inventory.captchalogue.Modus;
import com.mraof.minestuck.inventory.captchalogue.ModusType;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.client.gui.captchalouge.RouletteSylladexScreen;
import com.voxelpartum.minestuck_plus.inventory.captchalogue.MSPModi;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

import java.util.Map;
import java.util.function.Function;

import static com.mraof.minestuck.client.gui.MSScreenFactories.registerSylladexFactory;

@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD, modid = MinestuckPlus.MOD_ID)
public class MSPScreenFactories {

    private static final Map<ModusType<?>, Function<Modus, ? extends SylladexScreen>> MSP_SYLLADEX_FACTORIES = Maps.newHashMap();

    @SubscribeEvent
    public static void registerScreenFactories(RegisterMenuScreensEvent event){
        registerSylladexFactory(MSPModi.ROULETTE, RouletteSylladexScreen::new);
    }

}
