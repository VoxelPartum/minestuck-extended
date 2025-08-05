package com.voxelpartum.minestuck_extended.client.model.armor;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class DisguiseModel {

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
		PartDefinition root = mesh.getRoot();

		PartDefinition hat = root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition glasses = hat.addOrReplaceChild("glasses", CubeListBuilder.create()
				.texOffs(8, 0).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 1.0F, 1.0F)
				.texOffs(4, 7).addBox(0.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(8, 2).addBox(-3.0F, 1.0F, 0.0F, 3.0F, 1.0F, 1.0F)
				.texOffs(8, 2).mirror().addBox(4.0F, 1.0F, 0.0F, 3.0F, 1.0F, 1.0F)
				.texOffs(0, 14).mirror().addBox(1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F)
				.texOffs(0, 7).mirror().addBox(7.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(6, 11).mirror().addBox(7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(12, 12).mirror().addBox(7.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(4, 7).mirror().addBox(3.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(8, 0).mirror().addBox(4.0F, -3.0F, 0.0F, 3.0F, 1.0F, 1.0F)
				.texOffs(12, 12).addBox(-4.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(0, 7).addBox(-4.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(6, 11).addBox(-4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 4.0F),
				PartPose.offsetAndRotation(-2.0F, -4.0F, -5.0F,0f,0f,0f));

		PartDefinition nose = hat.addOrReplaceChild("nose", CubeListBuilder.create()
				.texOffs(0, 4).addBox(1.0F, -1.0F, -0.75F, 2.0F, 2.0F, 1.0F)
				.texOffs(8, 6).addBox(0.5F, 1.0F, -1.0F, 3.0F, 2.0F, 1.0F),
				PartPose.offsetAndRotation(-2.0F, -4.0F, -5.0F,0f,0f,0f));

		PartDefinition hair = hat.addOrReplaceChild("hair", CubeListBuilder.create()
				.texOffs(8, 4).addBox(-2.0F, -1.0F, -5.5F, 4.0F, 2.0F, 0.0F)
				.texOffs(0, 11).addBox(-6.0F, -9.0F, -4.5F, 5.0F, 3.0F, 0.0F)
				.texOffs(0, 11).addBox(1.0F, -9.0F, -4.5F, 5.0F, 3.0F, 0.0F),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition disguise = hat.addOrReplaceChild("disguise", CubeListBuilder.create()
				.texOffs(24, 48).addBox(-3.0F, -6.0F, 1.0F, 10.0F, 2.0F, 10.0F)
				.texOffs(0, 52).addBox(-2.0F, -10.0F, 2.0F, 8.0F, 4.0F, 8.0F),
				PartPose.offsetAndRotation(-2.0F, -4.0F, -5.0F,0f,0f,0f));

		return LayerDefinition.create(mesh, 64, 64);
	}
}