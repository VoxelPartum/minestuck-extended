package com.voxelpartum.minestuck_extended.effects;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class BrainFog extends MobEffect {

    public BrainFog() {
        super(MobEffectCategory.HARMFUL, 0x828282);
        this.addAttributeModifier(Attributes.ENTITY_INTERACTION_RANGE,
                ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "effect.unreach_entity"), -0.25, AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE,
                ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "effect.unreach_block"), -0.5, AttributeModifier.Operation.ADD_VALUE);
    }

}
