package com.voxelpartum.minestuck_extended.client.model.weapon;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class Thrown2x3dentModel extends Model {

	public ResourceLocation TEXTURE;
	private final ModelPart root;

	public Thrown2x3dentModel(ModelPart root, String textureName) {
		super(RenderType::entitySolid);
		this.root = root;
		this.TEXTURE = ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "textures/models/"+textureName);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 0).addBox(-2.5F, 26.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(1.5F, 26.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(1.5F, -5.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(-2.5F, -5.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 37.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-1.5F, 25.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int color) {
		this.root.render(poseStack, buffer, packedLight, packedOverlay, color);
	}
}