package com.voxelpartum.minestuck_extended.client.model.armor;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.item.InvisCloakItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class InvisCloakArmorModel extends GeoModel<InvisCloakItem> {

    @Override
    public ResourceLocation getModelResource(InvisCloakItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "geo/invisibility_cloak.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(InvisCloakItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "textures/models/armor/invisibility_cloak.png");
    }

    @Override
    public ResourceLocation getAnimationResource(InvisCloakItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "animations/invisibility_cloak.animation.json");
    }
}
