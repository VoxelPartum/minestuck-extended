package com.voxelpartum.minestuck_extended.util;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class MSESoundEvents {

    public static final DeferredRegister<SoundEvent> REGISTER = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, MinestuckExtended.MOD_ID);

    public static final Supplier<SoundEvent> CHAT_USED = register("modus.chat_ping");
    public static final Supplier<SoundEvent> PAN_HIT = register("entity.pan");
    public static final Supplier<SoundEvent> BAT_HIT = register("entity.bat");



    private static DeferredHolder<SoundEvent, SoundEvent> register(String name){
        return REGISTER.register(name, () -> SoundEvent.createVariableRangeEvent(MinestuckExtended.id(name)));
    }
}
