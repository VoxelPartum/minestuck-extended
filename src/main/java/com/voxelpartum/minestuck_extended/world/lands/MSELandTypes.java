package com.voxelpartum.minestuck_extended.world.lands;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.world.lands.LandTypes;
import com.mraof.minestuck.world.lands.terrain.TerrainLandType;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.world.lands.terrain.SculkLandType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.intellij.lang.annotations.Identifier;

import java.util.function.Supplier;


public class MSELandTypes {

    public static final ResourceKey<Registry<TerrainLandType>> TERRAIN_KEY = ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "terrain_land_type"));

    public static final DeferredRegister<TerrainLandType> TERRAIN_REGISTER = DeferredRegister.create(TERRAIN_KEY.location(), Minestuck.MOD_ID);

    public static final Supplier<TerrainLandType> SCULK = TERRAIN_REGISTER.register("sculk", SculkLandType::new);

    
}
