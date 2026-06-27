package com.voxelpartum.minestuck_extended.network;

import com.mraof.minestuck.network.MSPayloads;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.item.weapon.MSEMagicEffect;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.codec.NeoForgeStreamCodecs;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public record MSEMagicRangedEffectPacket(MSEMagicEffect.MSERangedType rangedType, Vec3 pos, Vec3 lookVec, int length, boolean collides) implements MSEPacket.PlayToClient {

    public static final Type<MSEMagicRangedEffectPacket> ID = new Type<>(MinestuckExtended.id("magic_ranged_effect"));

    public static final StreamCodec<FriendlyByteBuf, MSEMagicRangedEffectPacket> STREAM_CODEC = StreamCodec.composite(
            NeoForgeStreamCodecs.enumCodec(MSEMagicEffect.MSERangedType.class),
            MSEMagicRangedEffectPacket::rangedType,
            MSPayloads.VEC3_STREAM_CODEC,
            MSEMagicRangedEffectPacket::pos,
            MSPayloads.VEC3_STREAM_CODEC,
            MSEMagicRangedEffectPacket::lookVec,
            ByteBufCodecs.INT,
            MSEMagicRangedEffectPacket::length,
            ByteBufCodecs.BOOL,
            MSEMagicRangedEffectPacket::collides,
            MSEMagicRangedEffectPacket::new
    );
    @Override
    public Type<? extends CustomPacketPayload> type()
    {
        return ID;
    }

    @Override
    public void execute(IPayloadContext context)
    {
        MSEMagicEffect.rangedParticleEffect(rangedType, Minecraft.getInstance().level, pos, lookVec, length, collides);
    }
}
