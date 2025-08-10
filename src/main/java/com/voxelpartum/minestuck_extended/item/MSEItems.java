package com.voxelpartum.minestuck_extended.item;

import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.armor.MSArmorItem;
import com.mraof.minestuck.item.weapon.MagicRangedRightClickEffect;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.PogoEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.effects.MSEEffects;
import com.voxelpartum.minestuck_extended.item.projectile.MSEConsumableProjectile;
import com.voxelpartum.minestuck_extended.item.weapon.MSEShieldItem;
import com.voxelpartum.minestuck_extended.item.weapon.MaceWeaponItem;
import com.voxelpartum.minestuck_extended.util.MSESoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class MSEItems {


    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(MinestuckExtended.MOD_ID);

    public static final DeferredItem<Item> ROULETTE_CARD = REGISTER.register("roulette_modus_card", ()-> new Item(new Item.Properties().stacksTo(1)));

    //Do something with the books.

    //Weapons

    //Bladekind
    public static final DeferredItem<Item> SHADOW_SWORD = REGISTER.register("shadow_sword", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.2f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));
    public static final DeferredItem<Item> SHOVEL_BLADE = REGISTER.register("shovel_blade", () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL, MSItemTypes.SHOVEL_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));
    public static final DeferredItem<Item> ENERGY_SWORD = REGISTER.register("energy_sword", () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.URANIUM_TIER, 4, -2.8f).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP), new Item.Properties()));

    //Axekind
    public static final DeferredItem<Item> RUDE_AXE = REGISTER.register("rude_axe", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 5, -3f).efficiency(6.0f).disableShield().set(MSItemTypes.AXE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> ROCKSTARS_GUITAR = REGISTER.register("rockstars_guitar", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 4, -3.2f).efficiency(4.0f).disableShield().set(MSItemTypes.AXE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SOULSPLITTER = REGISTER.register("soulsplitter", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 6, -3.2f).efficiency(6.0f).disableShield().set(MSItemTypes.AXE_TOOL), new Item.Properties()));

    //Clubkind
    public static final DeferredItem<Item> WHIFFLEBAT = REGISTER.register("whifflebat", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -2.5f).efficiency(1.5f).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> METAL_PAN = REGISTER.register("metal_pan", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 5, -2.8f).efficiency(2f).set(MSItemTypes.CLUB_TOOL).add(OnHitEffect.playSound(MSESoundEvents.PAN_HIT)), new Item.Properties()));
    public static final DeferredItem<Item> HOMERUN_BAT = REGISTER.register("home_run_bat", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 1, -3.5f).efficiency(2f).set(MSItemTypes.CLUB_TOOL).add(OnHitEffect.playSound(MSESoundEvents.BAT_HIT), OnHitEffect.enemyKnockback(8f)), new Item.Properties()));
    public static final DeferredItem<Item> CLUB_SPIKED = REGISTER.register("club_spiked", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.WOOD, 2, -2.4f).efficiency(2f).set(MSItemTypes.CLUB_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SPRING_MACE = REGISTER.register("spring_mace", ()-> new MaceWeaponItem(new WeaponItem.Builder(MSItemTypes.POGO_TIER, 3, -3.4f).efficiency(2f).set(MSItemTypes.CLUB_TOOL).set(PogoEffect.EFFECT_07), new Item.Properties()));

    //Spoonkind
    public static final DeferredItem<Item> MARKET_GARDENER = REGISTER.register("market_gardener", ()-> new MaceWeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -2.4f).efficiency(1f).set(MSItemTypes.SPOON_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> BIT_MUNCHER = REGISTER.register("bit_muncher", ()-> new WeaponItem(new WeaponItem.Builder(MSItemTypes.PRISMARINE_TIER, 3, -2.8f).efficiency(2f).set(MSItemTypes.SPOON_TOOL), new Item.Properties()));

    //Lancekind
    public static final DeferredItem<Item> LANCER = REGISTER.register("lancer", ()-> new WeaponItem(new WeaponItem.Builder(MSItemTypes.PRISMARINE_TIER, 3, -2.8f).efficiency(2f).set(MSItemTypes.LANCE_TOOL), new Item.Properties()));

    //Scythekind
    public static final DeferredItem<Item> DEVILS_KNIFE = REGISTER.register("devilsknife", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 4, -2.6f).efficiency(1.5f).set(MSItemTypes.SCYTHE_TOOL), new Item.Properties()));
    public static final DeferredItem<Item> SEAGRIFT_SCYTHE = REGISTER.register("seagrift_scythe", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 4, -2.6f).efficiency(1.5f).set(MSItemTypes.SCYTHE_TOOL), new Item.Properties()));

    //Wandkind
    public static final DeferredItem<Item> PRINCESS_WAND = REGISTER.register("princess_wand", ()-> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 0, -1f).efficiency(1f).set(MSItemTypes.WAND_TOOL).set(MagicRangedRightClickEffect.STANDARD_MAGIC), new Item.Properties()));

    //Misc
    public static final DeferredItem<Item> SHEELD = REGISTER.registerItem("sheeld", p -> new MSEShieldItem(p.durability(59)));
    public static final DeferredItem<Item> POGO_SHIELD = REGISTER.registerItem("pogo_shield", p -> new MSEShieldItem(p.durability(512)));
    public static final DeferredItem<Item> MAGNET_SHIELD = REGISTER.registerItem("magnet_shield", p -> new MSEShieldItem(p.durability(512)));

    //""Armor""
    public static final DeferredItem<MSArmorItem> BEAGLEPUSS = REGISTER.register("beaglepuss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> DISGUISE = REGISTER.register("disguise", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> TESTIFIPUSS = REGISTER.register("testifipuss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> BEAGLEPISS = REGISTER.register("beaglepiss", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));
    public static final DeferredItem<MSArmorItem> SCARLET_SUNGLASSES = REGISTER.register("scarlet_sunglasses", ()-> new MSArmorItem(MSItemTypes.CLOTH_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    //Armor Trims
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

    //Everything else.
    public static final DeferredItem<Item> SHADOW_CRYSTAL = REGISTER.register("shadow_crystal", ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> CINDERBLOCK = REGISTER.register("cinderblock", ()->new MSEConsumableProjectile(new Item.Properties().stacksTo(24),0.5f,0.85f,8, SoundEvents.SNOWBALL_THROW));
    public static final DeferredItem<Item> ACABRICK = REGISTER.register("acabrick", ()->new MSEConsumableProjectile(new Item.Properties().stacksTo(32),0.6f,0.95f,9, SoundEvents.SNOWBALL_THROW));
    public static final DeferredItem<Item> LANCER_COOKIE = REGISTER.register("lancer_cookie", ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F).build())));
    public static final DeferredItem<Item> ORANGE_CREAMSICLE = REGISTER.register("orange_creamsicle", ()->new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.0F).alwaysEdible().build())));
    public static final DeferredItem<Item> DELTA_RUNE = REGISTER.register("delta_rune", ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> NORMAL_BROWNIE = REGISTER.register("normal_brownie", ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).alwaysEdible().effect(() -> new MobEffectInstance(MSEEffects.CREATIVE_INSPIRATION, 1200,0), 1f).build())));
    public static final DeferredItem<Item> NORMALER_BROWNIE = REGISTER.register("normaler_brownie", ()->new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).alwaysEdible().effect(() -> new MobEffectInstance(MSEEffects.CREATIVE_INSPIRATION, 3600,0), 1f).build())));

    //BlockItems


    public static final DeferredItem<BlockItem> DIAMOND_LICHEN = registerBlockItem(MSEBlocks.DIAMOND_LICHEN);
    public static final DeferredItem<BlockItem> PLUSH_VRISKA = registerBlockItem(MSEBlocks.PLUSH_VRISKA);
    public static final DeferredItem<BlockItem> CHESS_TILE = registerBlockItem(MSEBlocks.CHESS_TILE);

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
