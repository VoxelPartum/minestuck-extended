package com.voxelpartum.minestuck_extended.compat.farmers_delight;

import com.google.common.collect.Sets;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.FuelBlockItem;
import vectorwing.farmersdelight.common.registry.ModEffects;


import java.util.LinkedHashSet;
import java.util.function.Supplier;

import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;
import static vectorwing.farmersdelight.common.registry.ModItems.bowlFoodItem;

public class FDCompatItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MinestuckExtended.MOD_ID);
    public static final LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static final Supplier<Item> BILESLAW = registerWithTab("bileslaw",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(14).saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 1200,0,false,false),1f)
                    .build()), true));

    public static final Supplier<Item> STRAWBERRY_MILKSHAKE = registerWithTab("strawberry_milkshake",
            () -> new HoneyBottleItem(new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.HONEY_BOTTLE).stacksTo(16)));

    public static final Supplier<Item> BREATH_CABINET = registerWithTab("breath_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.BREATH_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> LIFE_CABINET = registerWithTab("life_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.LIFE_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> LIGHT_CABINET = registerWithTab("light_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.LIGHT_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> TIME_CABINET = registerWithTab("time_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.TIME_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> HEART_CABINET = registerWithTab("heart_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.HEART_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> RAGE_CABINET = registerWithTab("rage_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.RAGE_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> BLOOD_CABINET = registerWithTab("blood_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.BLOOD_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> DOOM_CABINET = registerWithTab("doom_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.DOOM_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> VOID_CABINET = registerWithTab("void_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.VOID_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> SPACE_CABINET = registerWithTab("space_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.SPACE_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> MIND_CABINET = registerWithTab("mind_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.MIND_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> HOPE_CABINET = registerWithTab("hope_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.HOPE_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> CARVED_CABINET = registerWithTab("carved_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.CARVED_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> TREATED_CABINET = registerWithTab("treated_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.TREATED_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> LACQUERED_CABINET = registerWithTab("lacquered_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.LACQUERED_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> GLOWING_CABINET = registerWithTab("glowing_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.GLOWING_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> FROST_CABINET = registerWithTab("frost_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.FROST_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> RAINBOW_CABINET = registerWithTab("rainbow_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.RAINBOW_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> END_CABINET = registerWithTab("end_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.END_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> DEAD_CABINET = registerWithTab("dead_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.DEAD_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> CINDERED_CABINET = registerWithTab("cindered_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.CINDERED_CABINET.get(), basicItem(), 300));
    public static final Supplier<Item> SHADEWOOD_CABINET = registerWithTab("shadewood_cabinet",
            () -> new FuelBlockItem(FDCompatBlocks.SHADEWOOD_CABINET.get(), basicItem(), 300));


    public static Supplier<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        Supplier<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

}
