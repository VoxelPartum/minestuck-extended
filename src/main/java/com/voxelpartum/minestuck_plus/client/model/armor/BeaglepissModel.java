package com.voxelpartum.minestuck_plus.client.model.armor;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class BeaglepissModel{

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
				PartPose.offsetAndRotation(-2.0F, -4F, -5.0F,0f,0f,0f));

		PartDefinition nose = hat.addOrReplaceChild("nose", CubeListBuilder.create()
				.texOffs(0, 4).addBox(1.0F, -1.0F, -0.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 6).addBox(0.5F, 1.0F, -1.0F, 3.0F, 2.0F, 1.0F),
				PartPose.offsetAndRotation(-2.0F, -4F, -5.0F,0f,0f,0f));

		PartDefinition hair = hat.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.5F, -3.0F, -4.5F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(8, 9).mirror().addBox(-2.0F, -1.0F, -5.5F, 4.0F, 2.0F, 0.0F).mirror(false)
				.texOffs(0, 0).addBox(1.5F, -3.0F, -4.5F, 4.0F, 3.0F, 0.0F)
				.texOffs(0, 11).addBox(-6.0F, -9.0F, -4.5F, 5.0F, 3.0F, 0.0F)
				.texOffs(0, 11).addBox(1.0F, -9.0F, -4.5F, 5.0F, 3.0F, 0.0F),
				PartPose.offsetAndRotation(0.0F, 0F, 0.0F,0f,0f,0f));

		return LayerDefinition.create(mesh, 16, 16);
	}
}