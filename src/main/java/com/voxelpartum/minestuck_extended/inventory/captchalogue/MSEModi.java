package com.voxelpartum.minestuck_extended.inventory.captchalogue;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.inventory.captchalogue.ModusType;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class MSEModi {

    public static final DeferredRegister<ModusType<?>> REGISTER = DeferredRegister.create(ResourceLocation.fromNamespaceAndPath(Minestuck.MOD_ID, "modus_type"), Minestuck.MOD_ID);

    public static final Supplier<ModusType<RouletteModus>> ROULETTE = REGISTER.register("roulette", ()-> new ModusType<>(RouletteModus::new, MSEItems.ROULETTE_CARD));
}
