package com.voxelpartum.minestuck_extended.network;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import java.util.Optional;

public interface MSEPacket {
    static <T> Optional<T> getAccessibleBlockEntity(ServerPlayer player, BlockPos pos, Class<T> castClass) {
        if (player.level().isAreaLoaded(pos, 0) && !(player.distanceToSqr(Vec3.atCenterOf(pos)) > (double)64.0F)) {
            BlockEntity blockEntity = player.level().getBlockEntity(pos);
            return !castClass.isInstance(blockEntity) ? Optional.empty() : Optional.of(castClass.cast(blockEntity));
        } else {
            return Optional.empty();
        }
    }

    public interface PlayToClient extends CustomPacketPayload {
        void execute(IPayloadContext var1);
    }

    public interface PlayToServer extends CustomPacketPayload {
        void execute(IPayloadContext var1, ServerPlayer var2);
    }
}
