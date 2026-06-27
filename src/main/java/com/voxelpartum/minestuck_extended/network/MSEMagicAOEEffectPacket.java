package com.voxelpartum.minestuck_extended.network;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.item.weapon.MSEMagicEffect;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.codec.NeoForgeStreamCodecs;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record MSEMagicAOEEffectPacket(MSEMagicEffect.MSEAOEType aoeType, Vec3 minAOEBound, Vec3 maxAOEBound) implements MSEPacket.PlayToClient{

    public static final Type<MSEMagicAOEEffectPacket> ID = new Type<>(MinestuckExtended.id("magic_aoe_effect"));

    public static final StreamCodec<FriendlyByteBuf, MSEMagicAOEEffectPacket> STREAM_CODEC = StreamCodec.composite(
            NeoForgeStreamCodecs.enumCodec(MSEMagicEffect.MSEAOEType.class),
            MSEMagicAOEEffectPacket::aoeType,
            MSEPayloads.VEC3_STREAM_CODEC,
            MSEMagicAOEEffectPacket::minAOEBound,
            MSEPayloads.VEC3_STREAM_CODEC,
            MSEMagicAOEEffectPacket::maxAOEBound,
            MSEMagicAOEEffectPacket::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type()
    {
        return ID;
    }

    @Override
    public void execute(IPayloadContext context)
    {
        MSEMagicEffect.AOEParticleEffect(aoeType, Minecraft.getInstance().level, minAOEBound, maxAOEBound);
    }

}
