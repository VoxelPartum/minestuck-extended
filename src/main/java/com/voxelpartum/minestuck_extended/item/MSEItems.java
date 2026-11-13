package com.voxelpartum.minestuck_extended.item;

import com.mraof.minestuck.item.MSItemProperties;
import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.armor.MSArmorItem;
import com.mraof.minestuck.item.weapon.*;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.effects.MSEEffects;
import com.voxelpartum.minestuck_extended.item.projectile.MSEConsumableProjectile;
import com.voxelpartum.minestuck_extended.item.weapon.*;
import com.voxelpartum.minestuck_extended.item.weapon.projectile.ThrowableBrainforkItem;
import com.voxelpartum.minestuck_extended.item.weapon.projectile.ThrowablePearlescentSixantItem;
import com.voxelpartum.minestuck_extended.item.weapon.projectile.ThrowablePsidonEntenteItem;
import com.voxelpartum.minestuck_extended.util.MSESoundEvents;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.BundleContents;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class MSEItems {

    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(MinestuckExtended.MOD_ID);

    public static final DeferredItem<Item> ROULETTE_CARD = REGISTER.register("roulette_modus_card", ()-> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ZIP_CARD = REGISTER.register("zip_modus_card", ()-> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ZIP_BUNDLE = REGISTER.register("zip_bundle", () -> new ZipBundleItem(new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY)));

    //#region Glovekind
    public static final DeferredItem<Item> OVEN_MITT = REGISTER.register("oven_mitt", () -> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -2.2f).efficiency(1.0F).set(MSEItemTypes.GLOVE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> METAL_GAUNTLET = REGISTER.register("metal_gauntlet", () -> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 3, -2.2f).efficiency(1.0F).set(MSEItemTypes.GLOVE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> PRISMARINE_GAUNTLET = REGISTER.register("prismarine_gauntlet", () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.PRISMARINE_TIER, 3, -2.2f).efficiency(1.0F).set(ItemRightClickEffect.playerPotionEffect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER, 120, 0), 1, 120)).set(MSEItemTypes.GLOVE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> STRONG_GLOVES = REGISTER.register("strong_glove", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -2.2f).efficiency(1.0F).add(OnHitEffect.playSound(MSESoundEvents.STRONG)).set(MSEItemTypes.GLOVE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> MANTISBLADE = REGISTER.register("mantisblade", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -2.2f).efficiency(1.0F).set(MSEItemTypes.GLOVE_TOOL), new Item.Properties()));
    //#endregion Glovekind

    //#region Bladekind
    public static final DeferredItem<Item> SHADOW_SWORD = REGISTER.register("shadow_sword", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.2f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));
    public static final DeferredItem<Item> SHOVEL_BLADE = REGISTER.register("shovel_blade", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL, MSItemTypes.SHOVEL_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));
    public static final DeferredItem<Item> ENERGY_SWORD = REGISTER.register("energy_sword", () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.URANIUM_TIER, 4, -2.8f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));
    public static final DeferredItem<Item> MEMORY_ALLOCATOR = REGISTER.register("memory_allocator", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 5, -2.2f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.enemyPotionEffect(() -> new MobEffectInstance(MSEEffects.BRAIN_FOG, 15, 2))), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_SHARD = REGISTER.register("black_shard", () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.HORRORTERROR_TIER, 5, -3.4f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP).add(OnHitEffect.onCrit(OnHitEffect.potionAOE(() -> new MobEffectInstance(MobEffects.BLINDNESS, 5, 0), MSESoundEvents.SWOON, 1.4f))), new Item.Properties()));
    public static final DeferredItem<Item> HOPEYGLASSSWORD = REGISTER.register("hopeyglass_shadowhook", () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 3, -2.4f).efficiency(1.0f).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));
    public static final DeferredItem<Item> HOLYMOONLIGHTSWORD = REGISTER.register("holy_moonlight_sword", () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 5, -1.2f).efficiency(1.0f).set(MSItemTypes.SWORD_TOOL).set(MSEMagicRangedRightClickEffect.MOONSWORD_MAGIC), new Item.Properties()));
    public static final DeferredItem<Item> SMUTSWORD = REGISTER.register("smut_sword", () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.PAPER_TIER, 1, -2.5f).efficiency(1.0f).set(MSItemTypes.SWORD_TOOL), new Item.Properties()));
    //#endregion Bladekind

    //#region Axekind
    public static final DeferredItem<Item> RUDE_AXE = REGISTER.register("rude_axe", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 5, -3f).efficiency(6.0f).disableShield().set(MSItemTypes.AXE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> ROCKSTARS_GUITAR = REGISTER.register("rockstars_guitar", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 4, -3.2f).efficiency(4.0f).disableShield().set(MSItemTypes.AXE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SOULSPLITTER = REGISTER.register("soulsplitter", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 6, -3.2f).efficiency(6.0f).disableShield().set(MSItemTypes.AXE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE_LABRYS = REGISTER.register("sapphire_labrys", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 6, -3.2f).efficiency(6.0f).disableShield().set(MSEItemTypes.BATTLEAXE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIC_LABRYS = REGISTER.register("sapphic_labrys", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 7, -2.8f).efficiency(6.0f).disableShield().set(MSEItemTypes.BATTLEAXE_TOOL), new Item.Properties()));
    //#endregion Axekind

    //#region Clubkind
    public static final DeferredItem<Item> WHIFFLEBAT = REGISTER.register("whifflebat", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -2.5f).efficiency(1.5f).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> METAL_PAN = REGISTER.register("metal_pan", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 5, -2.8f).efficiency(2f).set(MSItemTypes.CLUB_TOOL).add(OnHitEffect.playSound(MSESoundEvents.PAN_HIT)), new Item.Properties()));
    public static final DeferredItem<Item> HOMERUN_BAT = REGISTER.register("home_run_bat", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 1, -3.5f).efficiency(2f).set(MSItemTypes.CLUB_TOOL).add(OnHitEffect.playSound(MSESoundEvents.BAT_HIT), OnHitEffect.enemyKnockback(8f)), new Item.Properties()));
    public static final DeferredItem<Item> CLUB_SPIKED = REGISTER.register("club_spiked", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -2.4f).efficiency(2f).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SPRING_MACE = REGISTER.register("spring_mace", ()-> new MaceWeaponItem(new WeaponItem.Builder(MSItemTypes.POGO_TIER, 3, -3.4f).efficiency(2f).set(MSItemTypes.CLUB_TOOL).set(PogoEffect.EFFECT_07), new Item.Properties()));
    public static final DeferredItem<Item> MAGNIFIED_GLASS = REGISTER.register("magnified_glass", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 1, -2.1f).efficiency(2f).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> EXTENDO_BAT = REGISTER.register("extendo_bat", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -2.6f).efficiency(2f).set(MSItemTypes.CLUB_TOOL).add(OnHitEffect.enemyKnockback(2f).and(OnHitEffect.playSound(() -> SoundEvents.PISTON_EXTEND))), new Item.Properties()));
    //#endregion Clubkind

    //#region Spoonkind
    public static final DeferredItem<Item> MARKET_GARDENER = REGISTER.register("market_gardener", ()-> new MaceWeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.4f).efficiency(1f).set(MSItemTypes.SPOON_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> BIT_MUNCHER = REGISTER.register("bit_muncher", ()-> new WeaponItem(new WeaponItem.Builder(MSItemTypes.PRISMARINE_TIER, 3, -2.8f).efficiency(2f).set(MSItemTypes.SPOON_TOOL), new Item.Properties()));
    //#endregion Spoonkind

    //#region Forkkind
    public static final DeferredItem<Item> BRAIN_FORK = REGISTER.register("brain_fork", ()-> new ThrowableBrainforkItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.8f).efficiency(1f).set(MSItemTypes.FORK_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> PSIDON_ENTENTE = REGISTER.register("psidon_entente", ()-> new ThrowablePsidonEntenteItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3f).efficiency(1f).set(MSItemTypes.FORK_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> PEARLESCENT_SIXANT = REGISTER.register("pearlescent_sixant", ()-> new ThrowablePearlescentSixantItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -2.9f).efficiency(1f).set(MSItemTypes.FORK_TOOL), new Item.Properties()));

    //#endregion Forkkind

    //Lancekind
    public static final DeferredItem<Item> LANCER = REGISTER.register("lancer", ()-> new WeaponItem(new WeaponItem.Builder(MSItemTypes.PRISMARINE_TIER, 3, -2.8f).efficiency(2f).set(MSItemTypes.LANCE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> GLAIVE = REGISTER.register("glaive", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 3, -2.9f).efficiency(6.0f).disableShield().set(MSItemTypes.LANCE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SHADOWGLAIVE = REGISTER.register("shadow_glaive", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 6, -3f).efficiency(6.0f).disableShield().set(MSItemTypes.LANCE_TOOL), new Item.Properties()));

    //#region Scythekind
    public static final DeferredItem<Item> DEVILS_KNIFE = REGISTER.register("devilsknife", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 4, -2.6f).efficiency(1.5f).set(MSItemTypes.SCYTHE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SEAGRIFT_SCYTHE = REGISTER.register("seagrift_scythe", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 4, -2.6f).efficiency(1.5f).set(MSItemTypes.SCYTHE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> GUNSCYTHE = REGISTER.register("gunscythe", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 4, -2.6f).efficiency(1.5f).set(MSItemTypes.SCYTHE_TOOL).set(MSEMagicRangedRightClickEffect.GUN_MAGIC), new Item.Properties()));
    //#endregion Scythekind

    //Wandkind
    public static final DeferredItem<Item> PRINCESS_WAND = REGISTER.register("princess_wand", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 0, -1f).efficiency(1f).set(MSItemTypes.WAND_TOOL).set(MagicRangedRightClickEffect.STANDARD_MAGIC), new Item.Properties()));
    public static final DeferredItem<Item> UNICORN_GUN = REGISTER.register("unicorns_hunting_wand", ()-> new MSEWeaponItem(new MSEWeaponItem.Builder(Tiers.DIAMOND, 0, -3f).efficiency(1f).set(MSEMagicRangedRightClickEffect.GUN_MAGIC).setCrouch(ItemRightClickEffect.switchTo(MSEItems.UNICORN_KNIFE)), new Item.Properties()));
    public static final DeferredItem<Item> ICE_STAFF = REGISTER.register("ice_staff", () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.EMERALD_TIER, 2, -2.8F).efficiency(4.0F).set(MSItemTypes.CLUB_TOOL).set(MSEMagicAOERightClickEffect.ICE_MAGIC), new MSItemProperties().durability(1250)));

    //#region Misc
    public static final DeferredItem<Item> UNICORN_KNIFE = REGISTER.register("unicorns_hunting_knife", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -1.5F).efficiency(1.0F).set(MSItemTypes.KNIFE_TOOL).set(ItemRightClickEffect.switchTo(MSEItems.UNICORN_GUN)), new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE_ICOSAHEDRON = REGISTER.register("fluorite_icosahedron", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 6, -3.0F).efficiency(1.0F).add(OnHitEffect.RANDOM_DAMAGE), new MSItemProperties().durability(4096).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> DELTA_TWENTY = REGISTER.register("delta_twenty", () -> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 0, -3.0F).efficiency(1.0F).add(OnHitEffect.RANDOM_DAMAGE), new MSItemProperties().durability(512)));
    public static final DeferredItem<Item> SHEELD = REGISTER.registerItem("sheeld", p -> new MSEShieldItem(p.durability(59)));
    public static final DeferredItem<Item> POGO_SHIELD = REGISTER.registerItem("pogo_shield", p -> new MSEShieldItem(p.durability(512)));
    public static final DeferredItem<Item> MAGNET_SHIELD = REGISTER.registerItem("magnet_shield", p -> new MSEShieldItem(p.durability(512)));
    //#endregion Misc

    //#region Wearables
    public static final DeferredItem<MSArmorItem> BEAGLEPUSS = REGISTER.register("beaglepuss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> DISGUISE = REGISTER.register("disguise", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> TESTIFIPUSS = REGISTER.register("testifipuss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> BEAGLEPISS = REGISTER.register("beaglepiss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> SCARLET_SUNGLASSES = REGISTER.register("scarlet_sunglasses", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<MSArmorItem> ITCHY_HAT = REGISTER.register("itchy_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> DOZE_HAT = REGISTER.register("doze_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> TRACE_HAT = REGISTER.register("trace_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> CLOVER_HAT = REGISTER.register("clover_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> FIN_HAT = REGISTER.register("fin_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> DIE_HAT = REGISTER.register("die_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> CROWBAR_HAT = REGISTER.register("crowbar_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> SNOWMAN_HAT = REGISTER.register("snowman_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> STITCH_HAT = REGISTER.register("stitch_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> SAWBUCK_HAT = REGISTER.register("sawbuck_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> MATCHSTICKS_HAT = REGISTER.register("matchsticks_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> EGGS_HAT = REGISTER.register("eggs_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> BISCUITS_HAT = REGISTER.register("biscuits_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> QUARTERS_HAT = REGISTER.register("quarters_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> CANS_HAT = REGISTER.register("cans_hat", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIAL_REGISTRY = DeferredRegister.create(Registries.ARMOR_MATERIAL, MinestuckExtended.MOD_ID);

    public static final Holder<ArmorMaterial> OVERCOAT_MATERIAL = ARMOR_MATERIAL_REGISTRY.register("cario_overcoat", () -> new ArmorMaterial(Map.of(ArmorItem.Type.CHESTPLATE, 12),
            15, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.EMPTY, List.of(new ArmorMaterial.Layer(MinestuckExtended.id("cario_overcoat"))), 5F, 0.8f));
    public static final DeferredItem<CarioOvercoatItem> CAIRO_OVERCOAT = REGISTER.register("cairo_overcoat", ()-> new CarioOvercoatItem(OVERCOAT_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));

    public static final Holder<ArmorMaterial> CLOAK_MATERIAL = ARMOR_MATERIAL_REGISTRY.register("cloak", () -> new ArmorMaterial(Map.of(ArmorItem.Type.CHESTPLATE, 7),
            15, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.EMPTY, List.of(new ArmorMaterial.Layer(MinestuckExtended.id("cario_overcoat"))), 5F, 0.8f));
    public static final DeferredItem<InvisCloakItem> INVIS_CLOAK = REGISTER.register("invisibility_cloak", ()-> new InvisCloakItem(CLOAK_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));


    public static final DeferredItem<MSArmorItem> HEADBAND = REGISTER.register("headband", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<MSArmorItem> ARADIA_HORNS = REGISTER.register("aradia_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> TAVROS_HORNS = REGISTER.register("tavros_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> SOLLUX_HORNS = REGISTER.register("sollux_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> KARKAT_HORNS = REGISTER.register("karkat_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> NEPETA_HORNS = REGISTER.register("nepeta_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> KANAYA_HORNS = REGISTER.register("kanaya_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> TEREZI_HORNS = REGISTER.register("terezi_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> VRISKA_HORNS = REGISTER.register("vriska_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> EQUIUS_HORNS = REGISTER.register("equius_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> GAMZEE_HORNS = REGISTER.register("gamzee_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> ERIDAN_HORNS = REGISTER.register("eridan_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> FEFERI_HORNS = REGISTER.register("feferi_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> HORUSS_HORNS = REGISTER.register("horuss_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final Holder<ArmorMaterial> GALAAD_MATERIAL = ARMOR_MATERIAL_REGISTRY.register("galaad_helmet", () -> new ArmorMaterial(Map.of(ArmorItem.Type.HELMET, 2),
            9, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.EMPTY, List.of(new ArmorMaterial.Layer(MinestuckExtended.id("galaad_helmet"))), 0F, 0f));

    public static final DeferredItem<MSArmorItem> ARAMIA_HORNS = REGISTER.register("aramia_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> AVRIIL_HORNS = REGISTER.register("avriil_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> DRAYTH_HORNS = REGISTER.register("drayth_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> GALAAD_HELMET = REGISTER.register("galaad_helmet", ()-> new MSArmorItem(GALAAD_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> HERESA_HORNS = REGISTER.register("heresa_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> LORKES_HORNS = REGISTER.register("lorkes_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> METTAX_HORNS = REGISTER.register("mettax_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> MIRALA_HORNS = REGISTER.register("mirala_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> NELUMI_HORNS = REGISTER.register("nelumi_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> PISCAL_HORNS = REGISTER.register("piscal_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> VETHES_HORNS = REGISTER.register("vethes_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<MSArmorItem> AZONYP_HORNS = REGISTER.register("azonyp_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> FRELSI_HORNS = REGISTER.register("frelsi_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> ACHLYS_HORNS = REGISTER.register("achlys_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> RENARD_HORNS = REGISTER.register("renard_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> INANIS_HORNS = REGISTER.register("inanis_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> DEVROS_HORNS = REGISTER.register("devros_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> FAHRAD_HORNS = REGISTER.register("fahrad_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> NEYHIL_HORNS = REGISTER.register("neyhil_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> VERISI_HORNS = REGISTER.register("verisi_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> CASYLA_HORNS = REGISTER.register("casyla_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<MSArmorItem> NERIUS_HORNS = REGISTER.register("nerius_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> STYBOL_HORNS = REGISTER.register("stybol_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> JENSIS_HORNS = REGISTER.register("jensis_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> PHANES_HORNS = REGISTER.register("phanes_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> MAGNEA_HORNS = REGISTER.register("magnea_horns", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    //#endregion Wearables

    //#region Armor Trims
    public static final DeferredItem<Item> SPIROGRAPH_ARMOR_TRIM = armorTrim("spirograph");
    public static final DeferredItem<Item> BREATH_ARMOR_TRIM = armorTrim("breath");
    public static final DeferredItem<Item> LIFE_ARMOR_TRIM = armorTrim("life");
    public static final DeferredItem<Item> LIGHT_ARMOR_TRIM = armorTrim("light");
    public static final DeferredItem<Item> TIME_ARMOR_TRIM = armorTrim("time");
    public static final DeferredItem<Item> HEART_ARMOR_TRIM = armorTrim("heart");
    public static final DeferredItem<Item> RAGE_ARMOR_TRIM = armorTrim("rage");
    public static final DeferredItem<Item> BLOOD_ARMOR_TRIM = armorTrim("blood");
    public static final DeferredItem<Item> DOOM_ARMOR_TRIM = armorTrim("doom");
    public static final DeferredItem<Item> VOID_ARMOR_TRIM = armorTrim("void");
    public static final DeferredItem<Item> SPACE_ARMOR_TRIM = armorTrim("space");
    public static final DeferredItem<Item> MIND_ARMOR_TRIM = armorTrim("mind");
    public static final DeferredItem<Item> HOPE_ARMOR_TRIM = armorTrim("hope");
    //#endregion Armor Trims

    //Everything else.
    public static final DeferredItem<Item> SHADOW_CRYSTAL = REGISTER.register("shadow_crystal", ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> CINDERBLOCK = REGISTER.register("cinderblock", ()->new MSEConsumableProjectile(new Item.Properties().stacksTo(24),0.5f,0.85f,8, SoundEvents.SNOWBALL_THROW));
    public static final DeferredItem<Item> ACABRICK = REGISTER.register("acabrick", ()->new MSEConsumableProjectile(new Item.Properties().stacksTo(32),0.6f,0.95f,9, SoundEvents.SNOWBALL_THROW));
    public static final DeferredItem<Item> WATER_BALLOON = REGISTER.register("durable_water_balloon", ()->new MSEConsumableProjectile(new Item.Properties().stacksTo(16),0.75f,1f,0, SoundEvents.AMBIENT_UNDERWATER_EXIT));
    public static final DeferredItem<Item> LANCER_COOKIE = REGISTER.register("lancer_cookie", ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build())));
    public static final DeferredItem<Item> ORANGE_CREAMSICLE = REGISTER.register("orange_creamsicle", ()->new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.0F).alwaysEdible().build())));
    public static final DeferredItem<Item> DELTA_RUNE = REGISTER.register("delta_rune", ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> NORMAL_BROWNIE = REGISTER.register("normal_brownie", ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).alwaysEdible().effect(() -> new MobEffectInstance(MSEEffects.CREATIVE_INSPIRATION, 1200,0), 1f).build())));
    public static final DeferredItem<Item> NORMALER_BROWNIE = REGISTER.register("normaler_brownie", ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).alwaysEdible().effect(() -> new MobEffectInstance(MSEEffects.CREATIVE_INSPIRATION, 3600,1), 1f).build())));

    //BlockItems
    public static final DeferredItem<BlockItem> CHESS_TILE = registerBlockItem(MSEBlocks.CHESS_TILE);
//    public static final DeferredItem<BlockItem> SKAIA_PC = registerBlockItem(MSEBlocks.SKAIA_PC);
    public static final DeferredItem<BlockItem> HOPEYGLASS = registerBlockItem(MSEBlocks.HOPEYGLASS);
    public static final DeferredItem<BlockItem> HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> HOPEYGLASS_PILLAR = registerBlockItem(MSEBlocks.HOPEYGLASS_PILLAR);

    public static final DeferredItem<BlockItem> DEPTHS_HOPEYGLASS = registerBlockItem(MSEBlocks.DEPTHS_HOPEYGLASS);
    public static final DeferredItem<BlockItem> DEPTHS_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.DEPTHS_HOPEYGLASS_PANE);

    public static final DeferredItem<BlockItem> RED_HOPEYGLASS = registerBlockItem(MSEBlocks.RED_HOPEYGLASS);
    public static final DeferredItem<BlockItem> RED_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.RED_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> ORANGE_HOPEYGLASS = registerBlockItem(MSEBlocks.ORANGE_HOPEYGLASS);
    public static final DeferredItem<BlockItem> ORANGE_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.ORANGE_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> YELLOW_HOPEYGLASS = registerBlockItem(MSEBlocks.YELLOW_HOPEYGLASS);
    public static final DeferredItem<BlockItem> YELLOW_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.YELLOW_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> LIME_HOPEYGLASS = registerBlockItem(MSEBlocks.LIME_HOPEYGLASS);
    public static final DeferredItem<BlockItem> LIME_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.LIME_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> GREEN_HOPEYGLASS = registerBlockItem(MSEBlocks.GREEN_HOPEYGLASS);
    public static final DeferredItem<BlockItem> GREEN_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.GREEN_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> CYAN_HOPEYGLASS = registerBlockItem(MSEBlocks.CYAN_HOPEYGLASS);
    public static final DeferredItem<BlockItem> CYAN_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.CYAN_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_HOPEYGLASS = registerBlockItem(MSEBlocks.LIGHT_BLUE_HOPEYGLASS);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.LIGHT_BLUE_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> BLUE_HOPEYGLASS = registerBlockItem(MSEBlocks.BLUE_HOPEYGLASS);
    public static final DeferredItem<BlockItem> BLUE_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.BLUE_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> PURPLE_HOPEYGLASS = registerBlockItem(MSEBlocks.PURPLE_HOPEYGLASS);
    public static final DeferredItem<BlockItem> PURPLE_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.PURPLE_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> MAGENTA_HOPEYGLASS = registerBlockItem(MSEBlocks.MAGENTA_HOPEYGLASS);
    public static final DeferredItem<BlockItem> MAGENTA_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.MAGENTA_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> PINK_HOPEYGLASS = registerBlockItem(MSEBlocks.PINK_HOPEYGLASS);
    public static final DeferredItem<BlockItem> PINK_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.PINK_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> WHITE_HOPEYGLASS = registerBlockItem(MSEBlocks.WHITE_HOPEYGLASS);
    public static final DeferredItem<BlockItem> WHITE_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.WHITE_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_HOPEYGLASS = registerBlockItem(MSEBlocks.LIGHT_GRAY_HOPEYGLASS);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.LIGHT_GRAY_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> GRAY_HOPEYGLASS = registerBlockItem(MSEBlocks.GRAY_HOPEYGLASS);
    public static final DeferredItem<BlockItem> GRAY_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.GRAY_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> BLACK_HOPEYGLASS = registerBlockItem(MSEBlocks.BLACK_HOPEYGLASS);
    public static final DeferredItem<BlockItem> BLACK_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.BLACK_HOPEYGLASS_PANE);
    public static final DeferredItem<BlockItem> BROWN_HOPEYGLASS = registerBlockItem(MSEBlocks.BROWN_HOPEYGLASS);
    public static final DeferredItem<BlockItem> BROWN_HOPEYGLASS_PANE = registerBlockItem(MSEBlocks.BROWN_HOPEYGLASS_PANE);


    public static final DeferredItem<BlockItem> DIAMOND_LICHEN = registerBlockItem(MSEBlocks.DIAMOND_LICHEN);
    public static final DeferredItem<BlockItem> CRUXITE_LICHEN = registerBlockItem(MSEBlocks.CRUXITE_LICHEN);
    public static final DeferredItem<BlockItem> URANIUM_LICHEN = registerBlockItem(MSEBlocks.URANIUM_LICHEN);
    public static final DeferredItem<BlockItem> PLUSH_VRISKA = registerBlockItem(MSEBlocks.PLUSH_VRISKA);
    public static final DeferredItem<BlockItem> PLUSH_NEPETA = registerBlockItem(MSEBlocks.PLUSH_NEPETA);
    public static final DeferredItem<BlockItem> PLUSH_GENESIS_FROG = registerBlockItem(MSEBlocks.PLUSH_GENESIS_FROG);
    public static final DeferredItem<BlockItem> PLUSH_SPADES_SLICK = registerBlockItem(MSEBlocks.PLUSH_SPADES_SLICK);
    public static final DeferredItem<BlockItem> PLUSH_HEARTS_BOXCARS = registerBlockItem(MSEBlocks.PLUSH_HEARTS_BOXCARS);
    public static final DeferredItem<BlockItem> PLUSH_DIAMONDS_DROOG = registerBlockItem(MSEBlocks.PLUSH_DIAMONDS_DROOG);
    public static final DeferredItem<BlockItem> PLUSH_CLUBS_DEUCE = registerBlockItem(MSEBlocks.PLUSH_CLUBS_DEUCE);

    public static final DeferredItem<BlockItem> PLUSH_SALAMANDER = registerBlockItem(MSEBlocks.PLUSH_SALAMANDER);
    public static final DeferredItem<BlockItem> PLUSH_NAKAGATOR = registerBlockItem(MSEBlocks.PLUSH_NAKAGATOR);
    public static final DeferredItem<BlockItem> PLUSH_IGUANA = registerBlockItem(MSEBlocks.PLUSH_IGUANA);
    public static final DeferredItem<BlockItem> PLUSH_TURTLE = registerBlockItem(MSEBlocks.PLUSH_TURTLE);
    public static final DeferredItem<BlockItem> PLUSH_MUTATED_CAT = registerBlockItem(MSEBlocks.PLUSH_MUTATED_CAT);
    public static final DeferredItem<BlockItem> SCALEMATE_APPLESCAB = registerBlockItem(MSEBlocks.SCALEMATE_APPLESCAB);
    public static final DeferredItem<BlockItem> SCALEMATE_BERRYBREATH = registerBlockItem(MSEBlocks.SCALEMATE_BERRYBREATH);
    public static final DeferredItem<BlockItem> SCALEMATE_CINNAMONWHIFF = registerBlockItem(MSEBlocks.SCALEMATE_CINNAMONWHIFF);
    public static final DeferredItem<BlockItem> SCALEMATE_HONEYTONGUE = registerBlockItem(MSEBlocks.SCALEMATE_HONEYTONGUE);
    public static final DeferredItem<BlockItem> SCALEMATE_LEMONSNOUT = registerBlockItem(MSEBlocks.SCALEMATE_LEMONSNOUT);
    public static final DeferredItem<BlockItem> SCALEMATE_PINESNORT = registerBlockItem(MSEBlocks.SCALEMATE_PINESNORT);
    public static final DeferredItem<BlockItem> SCALEMATE_PUCEFOOT = registerBlockItem(MSEBlocks.SCALEMATE_PUCEFOOT);
    public static final DeferredItem<BlockItem> SCALEMATE_PUMPKINSNUFFLE = registerBlockItem(MSEBlocks.SCALEMATE_PUMPKINSNUFFLE);
    public static final DeferredItem<BlockItem> SCALEMATE_PYRALSPITE = registerBlockItem(MSEBlocks.SCALEMATE_PYRALSPITE);
    public static final DeferredItem<BlockItem> SCALEMATE_WITNESS = registerBlockItem(MSEBlocks.SCALEMATE_WITNESS);

    public static final DeferredItem<BlockItem> FANCYSANTA = registerBlockItem(MSEBlocks.FANCYSANTA);
    public static final DeferredItem<BlockItem> ZILLYSANTA = registerBlockItem(MSEBlocks.ZILLYSANTA);


    public static DeferredItem<Item> armorTrim(String name){
        return REGISTER.register(name+"_armor_trim_smithing_template",
                ()->SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, name)));
    }

    public static DeferredItem<BlockItem> registerBlockItem(DeferredBlock<?> block) {
        return registerBlockItem(block, block1 -> new BlockItem(block1, new Item.Properties()));
    }

    public static DeferredItem<BlockItem> registerBlockItem(DeferredBlock<?> block, Function<Block, ? extends BlockItem> function) {
        return REGISTER.register(block.getId().getPath(), () -> function.apply(block.get()));
    }

}
