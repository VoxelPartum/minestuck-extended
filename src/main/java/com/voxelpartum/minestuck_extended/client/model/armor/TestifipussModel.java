package com.voxelpartum.minestuck_extended.client.model.armor;


import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TestifipussModel{

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
		PartDefinition root = mesh.getRoot();

		root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hat = root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		hat.addOrReplaceChild("glasses", CubeListBuilder.create()
						.texOffs(0, 0).addBox(-4.0F, -3.0F, 0.0F, 12.0F, 1.0F, 1.0F)
		.texOffs(0, 16).addBox(-4.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F)
		.texOffs(0, 14).addBox(3.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F)
		.texOffs(4, 16).addBox(7.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F)
		.texOffs(8, 4).addBox(7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 4.0F)
		.texOffs(4, 11).addBox(7.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F)
		.texOffs(0, 11).addBox(-4.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F)
		.texOffs(8, 9).addBox(-4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 4.0F)
		.texOffs(10, 14).addBox(-3.0F, 0.0F, 0.0F, 4.0F, 1.0F, 1.0F),
				PartPose.offsetAndRotation(-2.0F, -3F, -5.0F,0,0,0));

		hat.addOrReplaceChild("nose", CubeListBuilder.create()
				.texOffs(0, 4).addBox(1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F),
				PartPose.offsetAndRotation(-2.0F, -3F, -5.0F,0,0,0));

		hat.addOrReplaceChild("hair", CubeListBuilder.create()
						.texOffs(0, 2).addBox(-6.0F, -9.0F, -4.5F, 12.0F, 2.0F, 0.0F),
				PartPose.offsetAndRotation(0.0F, 1F, 0.0F,0,0,0));

		return LayerDefinition.create(mesh, 32, 32);
	}
}