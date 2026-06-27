package com.voxelpartum.minestuck_extended.entity.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.client.model.MSEModelLayers;
import com.voxelpartum.minestuck_extended.client.model.weapon.Thrown2x3dentModel;
import com.voxelpartum.minestuck_extended.entity.ThrownPsidonEntente;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class ThrownPsidonRenderer extends EntityRenderer<ThrownPsidonEntente> {

    public static final ResourceLocation TEXTURE_LOCATION = ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "textures/models/item/psidon_entente.png");
    private final Thrown2x3dentModel model;

    public ThrownPsidonRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new Thrown2x3dentModel(context.bakeLayer(MSEModelLayers.SIXANT), "psidon_entente.png");
    }

    public void render(ThrownPsidonEntente entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entity.yRotO, entity.getYRot()) - 90.0F));
        poseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(partialTicks, entity.xRotO, entity.getXRot()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(
                buffer, this.model.renderType(this.getTextureLocation(entity)), false, entity.isFoil()
        );
        this.model.renderToBuffer(poseStack, vertexconsumer, packedLight, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(ThrownPsidonEntente entity) {
        return TEXTURE_LOCATION;
    }

}
