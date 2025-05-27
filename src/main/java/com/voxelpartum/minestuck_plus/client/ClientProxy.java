package com.voxelpartum.minestuck_plus.client;

import com.mraof.minestuck.client.model.armor.ArmorModels;
import com.mraof.minestuck.item.armor.MSArmorItem;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.client.model.armor.BeaglepissModel;
import com.voxelpartum.minestuck_plus.client.model.armor.BeaglepussModel;
import com.voxelpartum.minestuck_plus.client.model.armor.DisguiseModel;
import com.voxelpartum.minestuck_plus.client.model.armor.TestifipussModel;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Arrays;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD, modid = MinestuckPlus.MOD_ID)
public class ClientProxy {

    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event){
        ArmorModels.register(MSPItems.BEAGLEPUSS.get(), new HumanoidModel<>(BeaglepussModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSPItems.DISGUISE.get(), new HumanoidModel<>(DisguiseModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSPItems.BEAGLEPISS.get(), new HumanoidModel<>(BeaglepissModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSPItems.TESTIFIPUSS.get(), new HumanoidModel<>(TestifipussModel.createBodyLayer().bakeRoot()));
    }

    @SubscribeEvent
    private static void registerExtensions(RegisterClientExtensionsEvent event){
        for(DeferredItem<MSArmorItem> armorItem: Arrays.asList(
                MSPItems.BEAGLEPUSS,
                MSPItems.DISGUISE,
                MSPItems.BEAGLEPISS,
                MSPItems.TESTIFIPUSS
                        //DONT FORGET THE OTHER THINGS.
                )
        ){
            event.registerItem(new IClientItemExtensions()
            {
                @Override
                public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original)
                {
                    ArmorItem.Type type = armorItem.get().getType();
                    if(equipmentSlot != type.getSlot())
                        return original;
                    HumanoidModel<?> model = ArmorModels.get(armorItem.get());
                    if(model == null)
                        return original;

                    model.rightLeg.visible = type == ArmorItem.Type.LEGGINGS || type == ArmorItem.Type.BOOTS;
                    model.leftLeg.visible = type == ArmorItem.Type.LEGGINGS || type == ArmorItem.Type.BOOTS;

                    model.body.visible = type == ArmorItem.Type.CHESTPLATE;
                    model.leftArm.visible = type == ArmorItem.Type.CHESTPLATE;
                    model.rightArm.visible = type == ArmorItem.Type.CHESTPLATE;

                    model.head.visible = type == ArmorItem.Type.HELMET;
                    model.hat.visible = type == ArmorItem.Type.HELMET;


                    model.crouching = original.crouching;
                    model.riding = original.riding;
                    model.young = original.young;

                    model.rightArmPose = original.rightArmPose;
                    model.leftArmPose = original.leftArmPose;

                    return model;

                }
            }, armorItem);
        }
    }

}
