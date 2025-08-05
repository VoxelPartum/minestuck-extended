package com.voxelpartum.minestuck_extended.compat;


import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.weapon.ItemRightClickEffect;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.simibubi.create.AllSoundEvents;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreateCompat {

    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(MinestuckExtended.MOD_ID);

    //So this is where I'd add the items and stuff for the create mod compat.
    public static final DeferredItem<Item> RENCH = REGISTER.register("rench", ()->new RenchItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DEADRINGER = REGISTER.register("deadringer",
            ()->new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 8, -3.2F).efficiency(2f)
                    .set(MSItemTypes.HAMMER_TOOL).add(OnHitEffect.playSound(AllSoundEvents.HAUNTED_BELL_USE::getMainEvent, 1F, 1F)), new Item.Properties()));
    public static final DeferredItem<Item> MECHANICAL_CHAINSAW = REGISTER.register("mechanical_chainsaw", ()->new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 2, -1.5F).efficiency(10f).set(MSItemTypes.CHAINSAW_TOOL).set(ItemRightClickEffect.switchTo(CreateCompat.MECHANICAL_CHAINSAW_LIPSTICK)), new Item.Properties().durability(250)));
    public static final DeferredItem<Item> MECHANICAL_CHAINSAW_LIPSTICK = REGISTER.register("mechanical_chainsaw_lipstick", () -> new WeaponItem((new WeaponItem.Builder(Tiers.WOOD, -1, -0.5F)).efficiency(10.0F).set(ItemRightClickEffect.switchTo(CreateCompat.MECHANICAL_CHAINSAW)), (new Item.Properties()).durability(250)));
}
