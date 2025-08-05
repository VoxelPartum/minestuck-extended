package com.voxelpartum.minestuck_plus.trim;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.neoforged.neoforge.registries.DeferredItem;

public class MSPArmorTrimPattern {

    public static final ResourceKey<TrimPattern> SPIROGRAPH = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "spirograph"));
    public static final ResourceKey<TrimPattern> BREATH = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "breath"));
    public static final ResourceKey<TrimPattern> LIFE = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "life"));
    public static final ResourceKey<TrimPattern> LIGHT = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "light"));
    public static final ResourceKey<TrimPattern> HEART = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "heart"));
    public static final ResourceKey<TrimPattern> TIME = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "time"));
    public static final ResourceKey<TrimPattern> RAGE = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "rage"));
    public static final ResourceKey<TrimPattern> BLOOD = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "blood"));
    public static final ResourceKey<TrimPattern> DOOM = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "doom"));
    public static final ResourceKey<TrimPattern> VOID = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "void"));
    public static final ResourceKey<TrimPattern> SPACE = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "space"));
    public static final ResourceKey<TrimPattern> MIND = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "mind"));
    public static final ResourceKey<TrimPattern> HOPE = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, "hope"));

    public static void bootstrap(BootstrapContext<TrimPattern> context){
        register(context, MSPItems.SPIROGRAPH_ARMOR_TRIM, SPIROGRAPH);
        register(context, MSPItems.BREATH_ARMOR_TRIM, BREATH);
        register(context, MSPItems.LIFE_ARMOR_TRIM, LIFE);
        register(context, MSPItems.LIGHT_ARMOR_TRIM, LIGHT);
        register(context, MSPItems.HEART_ARMOR_TRIM, HEART);
        register(context, MSPItems.TIME_ARMOR_TRIM, TIME);
        register(context, MSPItems.RAGE_ARMOR_TRIM, RAGE);
        register(context, MSPItems.BLOOD_ARMOR_TRIM, BLOOD);
        register(context, MSPItems.DOOM_ARMOR_TRIM, DOOM);
        register(context, MSPItems.VOID_ARMOR_TRIM, VOID);
        register(context, MSPItems.SPACE_ARMOR_TRIM, SPACE);
        register(context, MSPItems.MIND_ARMOR_TRIM, MIND);
        register(context, MSPItems.HOPE_ARMOR_TRIM, HOPE);
    }



    public static void register(BootstrapContext<TrimPattern> context, DeferredItem<Item> item, ResourceKey<TrimPattern> key){
        TrimPattern trimPattern = new TrimPattern(key.location(), item.getDelegate(),
                Component.translatable(Util.makeDescriptionId("trim_pattern", key.location())), false);
        context.register(key, trimPattern);
    }

}