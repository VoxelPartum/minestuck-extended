package com.voxelpartum.minestuck_plus.item;

import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.armor.MSArmorItem;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.item.projectile.MSPConsumableProjectile;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MSPItems {

    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(MinestuckPlus.MOD_ID);

    //Weapons
    //Blades
    public static final DeferredItem<Item> SHADOW_SWORD = REGISTER.register("shadow_sword", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.8f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));

    //Axes
    public static final DeferredItem<Item> RUDE_AXE = REGISTER.register("rude_axe", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2f).efficiency(6.0f).disableShield().set(MSItemTypes.AXE_TOOL), new Item.Properties()));

    //Silly Items

    public static final DeferredItem<MSArmorItem> BEAGLEPUSS = REGISTER.register("beaglepuss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> DISGUISE = REGISTER.register("disguise", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> BEAGLEPISS = REGISTER.register("beaglepiss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> TESTIFIPUSS = REGISTER.register("testifipuss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SHADOW_CRYSTAL = REGISTER.register("shadow_crystal", ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> CINDERBLOCK = REGISTER.register("cinderblock", ()->new MSPConsumableProjectile(new Item.Properties().stacksTo(24),0.5f,0.85f,8, SoundEvents.SNOWBALL_THROW));
    public static final DeferredItem<Item> ACABRICK = REGISTER.register("acabrick", ()->new MSPConsumableProjectile(new Item.Properties().stacksTo(32),0.6f,0.95f,9, SoundEvents.ENDER_PEARL_THROW));

    //Yknow that wasn't as bad as I first thought.
    public static final DeferredItem<Item> ROULETTE_CARD = REGISTER.register("roulette_modus_card", ()-> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CHAT_CARD = REGISTER.register("chat_modus_card", ()-> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CATCHBALL_CARD = REGISTER.register("catch_ball_modus_card", ()-> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CATCHBALL = REGISTER.register("catch_ball", ()-> new Item(new Item.Properties().stacksTo(1)));

}
