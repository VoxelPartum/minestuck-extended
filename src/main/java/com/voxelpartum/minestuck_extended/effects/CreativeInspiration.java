package com.voxelpartum.minestuck_extended.effects;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class CreativeInspiration extends MobEffect {

    public CreativeInspiration() {
        super(MobEffectCategory.BENEFICIAL, 0x252525);
        this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE,
                ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "effect.reach"), 1.5, AttributeModifier.Operation.ADD_VALUE);
    }

}
