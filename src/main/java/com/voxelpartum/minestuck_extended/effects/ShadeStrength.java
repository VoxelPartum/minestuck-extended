package com.voxelpartum.minestuck_extended.effects;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.LightLayer;

public class ShadeStrength extends MobEffect {

    public ShadeStrength() {
        super(MobEffectCategory.BENEFICIAL, 0x104ea2);
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier){
        double strengthIncrease = getAttackDamageScale(entity.level().getBrightness(LightLayer.BLOCK, entity.blockPosition()), (amplifier+1));
        AttributeInstance instance = entity.getAttribute(Attributes.ATTACK_DAMAGE);

        if(instance != null){
            instance.removeModifier(MinestuckExtended.id("shade_strength"));
            instance.addTransientModifier(new AttributeModifier(ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "shade_strength"), strengthIncrease, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
        }

        return true;
    }

    @Override
    public void removeAttributeModifiers(AttributeMap attributeMap) {
        AttributeInstance instance = attributeMap.getInstance(Attributes.MOVEMENT_SPEED);
        if (instance != null) {
            instance.removeModifier(ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "shade_strength"));
        }
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

    double getAttackDamageScale(int lightLevel, int amplifier){
        return (15-lightLevel)*(0.05f * amplifier);
    }

}
