package com.voxelpartum.minestuck_extended.data.loot_modifiers;

import com.mojang.serialization.MapCodec;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class MSELootModifiers {

    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> REGISTER = DeferredRegister
            .create(NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS, MinestuckExtended.MOD_ID);

    public static final Supplier<MapCodec<MSELootModifier>> MEDIUM_LOOT_MODIFIER = REGISTER
            .register("medium_loot_modifier", () -> MSELootModifier.CODEC);

}
