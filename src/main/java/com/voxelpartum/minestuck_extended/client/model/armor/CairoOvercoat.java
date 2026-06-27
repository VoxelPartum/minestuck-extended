package com.voxelpartum.minestuck_extended.client.model.armor;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public abstract class CairoOvercoat<T extends Entity> extends EntityModel<T> {

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
		PartDefinition root = mesh.getRoot();

		PartDefinition coat = root.addOrReplaceChild("body", CubeListBuilder.create()
						.texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.ZERO);

		coat.addOrReplaceChild("trail", CubeListBuilder.create().texOffs(0, 18).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.501F)),
				PartPose.offsetAndRotation(0.0F, 12.6F, 3.5F, 0.4363F, 0.0F, 0.0F));

		root.addOrReplaceChild("right_arm", CubeListBuilder.create()
						.texOffs(24, 0).addBox(-3F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		root.addOrReplaceChild("left_arm", CubeListBuilder.create()
						.texOffs(26, 16).addBox(-1F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(mesh, 64, 64);
	}

}