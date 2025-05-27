package com.voxelpartum.minestuck_plus.effects;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MSPEffects {

    public static final DeferredRegister<MobEffect> REGISTER = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, MinestuckPlus.MOD_ID);

    public static final DeferredHolder<MobEffect, CreativeInspiration> CREATIVE_INSPIRATION = REGISTER.register("creative_inspiration", CreativeInspiration::new);

}
