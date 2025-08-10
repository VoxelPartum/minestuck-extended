package com.voxelpartum.minestuck_extended.client.model.armor;// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ScarletSunglasses{

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
		PartDefinition root = mesh.getRoot();

		PartDefinition hat = root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition glasses = head.addOrReplaceChild("glasses", CubeListBuilder.create()
				.texOffs(0, 6).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 1.0F, 1.0F)
				.texOffs(0, 0).addBox(0.6F, -3.0F, -7.5F, 5.0F, 3.0F, 0.0F, new CubeDeformation(-0.4f,-0.2f,0f))
				.texOffs(0, 3).addBox(-5.6F, -3.0F, -7.5F, 5.0F, 3.0F, 0.0F, new CubeDeformation(-0.4f,-0.2f,0f)),
				PartPose.offsetAndRotation(0.0F, -2F, 3.0F,0f,0f,0f));

		return LayerDefinition.create(mesh, 16, 16);
	}
}