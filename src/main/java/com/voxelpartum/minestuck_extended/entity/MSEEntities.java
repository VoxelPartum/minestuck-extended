package com.voxelpartum.minestuck_extended.entity;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MSEEntities {

    public static final DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MinestuckExtended.MOD_ID);

    //This has got to be the least efficient way I have ever seen this done but damnit if it doesn't work
    public static final Supplier<EntityType<ThrownBrainfork>> THROWN_BRAINFORK = REGISTER.register("thrown_brainfork",
            () -> EntityType.Builder.<ThrownBrainfork>of(ThrownBrainfork::new, MobCategory.MISC)
                    .sized(0.5F,0.5F).build(MinestuckExtended.id("thrown_brainfork").toString()));

    public static final Supplier<EntityType<ThrownPsidonEntente>> THROWN_PSIDON = REGISTER.register("thrown_psidon",
            () -> EntityType.Builder.<ThrownPsidonEntente>of(ThrownPsidonEntente::new, MobCategory.MISC)
                    .sized(0.5F,0.5F).build(MinestuckExtended.id("thrown_psidon").toString()));

    public static final Supplier<EntityType<ThrownPearlescentSixant>> THROWN_PEARLESCENT = REGISTER.register("thrown_pearlescent",
            () -> EntityType.Builder.<ThrownPearlescentSixant>of(ThrownPearlescentSixant::new, MobCategory.MISC)
                    .sized(0.5F,0.5F).build(MinestuckExtended.id("thrown_pearlescent").toString()));

}
