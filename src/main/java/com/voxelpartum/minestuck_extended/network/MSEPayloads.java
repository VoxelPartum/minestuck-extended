package com.voxelpartum.minestuck_extended.network;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = MinestuckExtended.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class MSEPayloads {

    public static final StreamCodec<FriendlyByteBuf, Vec3> VEC3_STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.DOUBLE,
            Vec3::x,
            ByteBufCodecs.DOUBLE,
            Vec3::y,
            ByteBufCodecs.DOUBLE,
            Vec3::z,
            Vec3::new
    );

    @SubscribeEvent
    private static void register(RegisterPayloadHandlersEvent event){
        PayloadRegistrar registrar = event.registrar(MinestuckExtended.MOD_ID).versioned("2");

        registerPlayToClient(registrar, MSEMagicAOEEffectPacket.ID, MSEMagicAOEEffectPacket.STREAM_CODEC);
        registerPlayToClient(registrar, MSEMagicRangedEffectPacket.ID, MSEMagicRangedEffectPacket.STREAM_CODEC);
    }

    private static <T extends MSEPacket.PlayToClient> void registerPlayToClient(PayloadRegistrar registrar, CustomPacketPayload.Type<T> type, StreamCodec<? super RegistryFriendlyByteBuf, T> codec)
    {
        registrar.playToClient(type, codec, MSEPacket.PlayToClient::execute);
    }

}
