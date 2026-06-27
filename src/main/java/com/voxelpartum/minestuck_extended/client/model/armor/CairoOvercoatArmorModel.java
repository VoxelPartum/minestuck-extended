package com.voxelpartum.minestuck_extended.client.model.armor;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.item.CarioOvercoatItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CairoOvercoatArmorModel extends GeoModel<CarioOvercoatItem> {

    @Override
    public ResourceLocation getModelResource(CarioOvercoatItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "geo/cairo_overcoat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CarioOvercoatItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "textures/models/armor/cairo_overcoat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CarioOvercoatItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "animations/cairo_overcoat.animation.json");
    }
}
