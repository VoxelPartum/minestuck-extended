package com.voxelpartum.minestuck_extended.client.model.armor.plotbound_horns;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.model.geom.builders.LayerDefinition;

public abstract class VethesHornsModel<T extends Entity> extends EntityModel<T> {

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
		PartDefinition root = mesh.getRoot();

		PartDefinition hat = root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition group = head.addOrReplaceChild("group", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 0.0F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-5.6F, 0.0F, 0.0F, 0.6F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).mirror().addBox(3.0F, 0.0F, 0.0F, 0.6F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, -9.0F, -1.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, -9.0F, -1.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, -6.0F, 0.0F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7F, 6.25F, 4.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 8).addBox(-6.0F, -6.0F, 0.0F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 6.25F, 4.5F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(mesh, 20, 24);
	}

}