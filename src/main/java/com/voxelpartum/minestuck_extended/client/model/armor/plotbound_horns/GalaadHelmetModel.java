package com.voxelpartum.minestuck_extended.client.model.armor.plotbound_horns;


import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public abstract class GalaadHelmetModel<T extends Entity> extends EntityModel<T> {

	public static LayerDefinition createBodyLayer() {
		MeshDefinition mesh = HumanoidModel.createMesh(LayerDefinitions.OUTER_ARMOR_DEFORMATION, 0);
		PartDefinition root = mesh.getRoot();

		PartDefinition hat = root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = hat.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 26).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F))
		.texOffs(0, 0).addBox(-9.0F, -41.0F, 5.0F, 16.0F, 26.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 29).addBox(2.5F, -48.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 29).addBox(-3.5F, -48.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 15).addBox(-1.0F, -3.0F, -1.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -29.0F, -7.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 0).addBox(-7.0F, -7.0F, -8.0F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -29.0F, 10.0F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(mesh, 64, 64);
	}
}