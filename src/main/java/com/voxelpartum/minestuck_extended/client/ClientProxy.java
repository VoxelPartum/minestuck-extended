package com.voxelpartum.minestuck_extended.client;

import com.mraof.minestuck.client.model.armor.ArmorModels;
import com.mraof.minestuck.item.armor.MSArmorItem;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.client.model.armor.*;
import com.voxelpartum.minestuck_extended.client.model.armor.plotbound_horns.*;
import com.voxelpartum.minestuck_extended.entity.MSEEntities;
import com.voxelpartum.minestuck_extended.entity.renderer.entity.ThrownBrainForkRenderer;
import com.voxelpartum.minestuck_extended.entity.renderer.entity.ThrownPearlescentRenderer;
import com.voxelpartum.minestuck_extended.entity.renderer.entity.ThrownPsidonRenderer;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.EntityRenderers;
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
@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD, modid = MinestuckExtended.MOD_ID)
public class ClientProxy {

    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event){

        EntityRenderers.register(MSEEntities.THROWN_BRAINFORK.get(), ThrownBrainForkRenderer::new);
        EntityRenderers.register(MSEEntities.THROWN_PSIDON.get(), ThrownPsidonRenderer::new);
        EntityRenderers.register(MSEEntities.THROWN_PEARLESCENT.get(), ThrownPearlescentRenderer::new);

        ArmorModels.register(MSEItems.BEAGLEPUSS.get(), new HumanoidModel<>(BeaglepussModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.DISGUISE.get(), new HumanoidModel<>(DisguiseModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.BEAGLEPISS.get(), new HumanoidModel<>(BeaglepissModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.TESTIFIPUSS.get(), new HumanoidModel<>(TestifipussModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.SCARLET_SUNGLASSES.get(), new HumanoidModel<>(ScarletSunglasses.createBodyLayer().bakeRoot()));

        ArmorModels.register(MSEItems.ITCHY_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.DOZE_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.TRACE_HAT.get(), new HumanoidModel<>(FeltTallHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.CLOVER_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.FIN_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.DIE_HAT.get(), new HumanoidModel<>(FeltTallHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.CROWBAR_HAT.get(), new HumanoidModel<>(FeltDiagonalHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.SNOWMAN_HAT.get(), new HumanoidModel<>(SnowmanHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.STITCH_HAT.get(), new HumanoidModel<>(FeltDiagonalHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.SAWBUCK_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.MATCHSTICKS_HAT.get(), new HumanoidModel<>(FeltDiagonalHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.EGGS_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.BISCUITS_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.QUARTERS_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.CANS_HAT.get(), new HumanoidModel<>(FeltBowlerHat.createBodyLayer().bakeRoot()));

        ArmorModels.register(MSEItems.HEADBAND.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));

        ArmorModels.register(MSEItems.ARADIA_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.TAVROS_HORNS.get(), new HumanoidModel<>(TavrosHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.SOLLUX_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.KARKAT_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.NEPETA_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.KANAYA_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.TEREZI_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.VRISKA_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.EQUIUS_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.GAMZEE_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.ERIDAN_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.FEFERI_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.HORUSS_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));


        ArmorModels.register(MSEItems.VETHES_HORNS.get(), new HumanoidModel<>(VethesHornsModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.HERESA_HORNS.get(), new HumanoidModel<>(HeresaHornsModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.METTAX_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.NELUMI_HORNS.get(), new HumanoidModel<>(NelumiHornsModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.DRAYTH_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.LORKES_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.ARAMIA_HORNS.get(), new HumanoidModel<>(AramiaHornsModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.MIRALA_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.AVRIIL_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.PISCAL_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.GALAAD_HELMET.get(), new HumanoidModel<>(GalaadHelmetModel.createBodyLayer().bakeRoot()));

        ArmorModels.register(MSEItems.ACHLYS_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.AZONYP_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.DEVROS_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.FAHRAD_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.FRELSI_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.INANIS_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.JENSIS_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.MAGNEA_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.NERIUS_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.NEYHIL_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.PHANES_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.RENARD_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.STYBOL_HORNS.get(), new HumanoidModel<>(GenericHornModel.createBodyLayer().bakeRoot()));
        ArmorModels.register(MSEItems.VERISI_HORNS.get(), new HumanoidModel<>(AsymHorns.createBodyLayer().bakeRoot()));
    }

    @SubscribeEvent
    private static void registerExtensions(RegisterClientExtensionsEvent event){
        for(DeferredItem<MSArmorItem> armorItem: Arrays.asList(
                MSEItems.BEAGLEPUSS,
                MSEItems.DISGUISE,
                MSEItems.BEAGLEPISS,
                MSEItems.TESTIFIPUSS,
                MSEItems.SCARLET_SUNGLASSES,

                MSEItems.ITCHY_HAT,
                MSEItems.DOZE_HAT,
                MSEItems.TRACE_HAT,
                MSEItems.CLOVER_HAT,
                MSEItems.FIN_HAT,
                MSEItems.DIE_HAT,
                MSEItems.CROWBAR_HAT,
                MSEItems.SNOWMAN_HAT,
                MSEItems.STITCH_HAT,
                MSEItems.SAWBUCK_HAT,
                MSEItems.MATCHSTICKS_HAT,
                MSEItems.EGGS_HAT,
                MSEItems.BISCUITS_HAT,
                MSEItems.QUARTERS_HAT,
                MSEItems.CANS_HAT,

                MSEItems.HEADBAND,

                MSEItems.ARADIA_HORNS,
                MSEItems.TAVROS_HORNS,
                MSEItems.SOLLUX_HORNS,
                MSEItems.KARKAT_HORNS,
                MSEItems.NEPETA_HORNS,
                MSEItems.KANAYA_HORNS,
                MSEItems.TEREZI_HORNS,
                MSEItems.VRISKA_HORNS,
                MSEItems.EQUIUS_HORNS,
                MSEItems.GAMZEE_HORNS,
                MSEItems.ERIDAN_HORNS,
                MSEItems.FEFERI_HORNS,
                MSEItems.HORUSS_HORNS,

                MSEItems.ARAMIA_HORNS,
                MSEItems.AVRIIL_HORNS,
                MSEItems.DRAYTH_HORNS,
                MSEItems.GALAAD_HELMET,
                MSEItems.HERESA_HORNS,
                MSEItems.LORKES_HORNS,
                MSEItems.METTAX_HORNS,
                MSEItems.MIRALA_HORNS,
                MSEItems.NELUMI_HORNS,
                MSEItems.PISCAL_HORNS,
                MSEItems.VETHES_HORNS,

                MSEItems.ACHLYS_HORNS,
                MSEItems.AZONYP_HORNS,
                MSEItems.DEVROS_HORNS,
                MSEItems.FAHRAD_HORNS,
                MSEItems.FRELSI_HORNS,
                MSEItems.INANIS_HORNS,
                MSEItems.JENSIS_HORNS,
                MSEItems.MAGNEA_HORNS,
                MSEItems.NERIUS_HORNS,
                MSEItems.NEYHIL_HORNS,
                MSEItems.PHANES_HORNS,
                MSEItems.RENARD_HORNS,
                MSEItems.STYBOL_HORNS,
                MSEItems.VERISI_HORNS
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
