package com.voxelpartum.minestuck_extended.trim;

import com.mraof.minestuck.item.MSItems;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class MSEArmorTrimMaterials {

    public static final ResourceKey<TrimMaterial> CRUXITE = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "cruxite"));
    public static final ResourceKey<TrimMaterial> URANIUM = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "uranium"));
    public static final ResourceKey<TrimMaterial> BI_DYE = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "bi_dye"));

    public static void bootstrap(BootstrapContext<TrimMaterial> context){
        register(context, URANIUM, MSItems.RAW_URANIUM.get(), Style.EMPTY.withColor(TextColor.parseColor("#77ff77").getOrThrow()),0.71f);
        register(context, CRUXITE, MSItems.RAW_CRUXITE.get(), Style.EMPTY.withColor(TextColor.parseColor("#77ffff").getOrThrow()),0.81f);
        register(context, BI_DYE, MSItems.BI_DYE.get(), Style.EMPTY.withColor(TextColor.parseColor("#B00B69").getOrThrow()),0.91f);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex){
        TrimMaterial trimMaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimMaterial);
    }

}
