package com.voxelpartum.minestuck_extended.client.model.armor;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public abstract class TavrosHornModel<T extends Entity> extends EntityModel<T> {

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
		PartDefinition root = mesh.getRoot();

		PartDefinition hat = root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition group = head.addOrReplaceChild("group", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-4.6F, 0.0F, -1.0F, 0.6F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).mirror().addBox(4.0F, 0.0F, -1.0F, 0.6F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 8).addBox(3.9F, -5.2F, 0.0F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).mirror().addBox(-13.9F, -5.2F, 0.0F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -5.0F, 0.0F));

		return LayerDefinition.create(mesh, 20, 24);
	}

}