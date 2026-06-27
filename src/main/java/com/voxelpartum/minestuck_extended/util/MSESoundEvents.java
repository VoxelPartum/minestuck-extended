package com.voxelpartum.minestuck_extended.util;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class MSESoundEvents {

    public static final DeferredRegister<SoundEvent> REGISTER = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, MinestuckExtended.MOD_ID);

    public static final Supplier<SoundEvent> PAN_HIT = register("entity.pan");
    public static final Supplier<SoundEvent> BAT_HIT = register("entity.bat");
    public static final Supplier<SoundEvent> SWOON = register("entity.swoon");
    public static final Supplier<SoundEvent> SHOOT = register("entity.shoot");
    public static final Supplier<SoundEvent> STRONG = register("entity.strong");
    public static final Supplier<SoundEvent> SANTA_PLACE = register("block.santa_place");
    public static final Supplier<SoundEvent> SANTA_BREAK = register("block.santa_break");
    public static final Supplier<SoundEvent> ZIP = register("inventory.zip");



    private static DeferredHolder<SoundEvent, SoundEvent> register(String name){
        return REGISTER.register(name, () -> SoundEvent.createVariableRangeEvent(MinestuckExtended.id(name)));
    }
}
