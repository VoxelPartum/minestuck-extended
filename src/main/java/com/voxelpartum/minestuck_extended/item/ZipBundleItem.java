package com.voxelpartum.minestuck_extended.item;

import com.voxelpartum.minestuck_extended.MinestuckExtendedConfig;
import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.component.BundleContents;
import net.minecraft.world.level.Level;
import org.apache.commons.lang3.math.Fraction;

public class ZipBundleItem extends Item {

    public ZipBundleItem(Properties properties) {
        super(properties);
    }

    private static final int BAR_COLOR = 0xba204e;

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemstack = player.getItemInHand(usedHand);
        if (dropContents(itemstack, player)) {
            player.awardStat(Stats.ITEM_USED.get(this));
            return InteractionResultHolder.sidedSuccess(ItemStack.EMPTY, level.isClientSide());
        } else {
            return InteractionResultHolder.fail(itemstack);
        }
    }

    private static boolean dropContents(ItemStack stack, Player player) {
        BundleContents zipBundlecontents = stack.get(DataComponents.BUNDLE_CONTENTS);
        if (zipBundlecontents != null) {
            stack.set(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
            if (player instanceof ServerPlayer) {
                if(player.isShiftKeyDown())
                    zipBundlecontents.itemsCopy().forEach(itemStack -> player.drop(itemStack, true));
                else zipBundlecontents.itemsCopy().forEach(itemStack -> player.getInventory().placeItemBackInInventory(itemStack.copy()));
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean overrideOtherStackedOnMe(
            ItemStack stack, ItemStack other, Slot slot, ClickAction action, Player player, SlotAccess access
    ) {
        if (stack.getCount() != 1) return false;
        if (action == ClickAction.SECONDARY && slot.allowModification(player)) {
            BundleContents bundlecontents = stack.get(DataComponents.BUNDLE_CONTENTS);
            if (bundlecontents == null) {
                return false;
            } else {
                BundleContents.Mutable bundlecontents$mutable = new BundleContents.Mutable(bundlecontents);
                if (other.isEmpty() && MinestuckExtendedConfig.SERVER.pullSingleItemZipBundle.get()) {
                    ItemStack itemstack = bundlecontents$mutable.removeOne();
                    if (itemstack != null) {
                        this.playRemoveOneSound(player);
                        access.set(itemstack);
                    }
                }
                stack.set(DataComponents.BUNDLE_CONTENTS, bundlecontents$mutable.toImmutable());
                return true;
            }
        } else {
            return false;
        }
    }

    private void playRemoveOneSound(Entity entity) {
        entity.playSound(SoundEvents.BUNDLE_REMOVE_ONE, 0.8F, 0.8F + entity.level().getRandom().nextFloat() * 0.4F);
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        BundleContents bundlecontents = stack.getOrDefault(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
        return bundlecontents.weight().compareTo(Fraction.ZERO) > 0;
    }

    @Override
    public int getBarWidth(ItemStack stack) {
        BundleContents bundlecontents = stack.getOrDefault(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
        return Math.min(1 + Mth.mulAndTruncate(bundlecontents.weight(), 12), 13);
    }

    @Override
    public int getBarColor(ItemStack stack) {
        return BAR_COLOR;
    }

    @Override
    public void onDestroyed(ItemEntity itemEntity) {
        BundleContents zipBundlecontents = itemEntity.getItem().get(DataComponents.BUNDLE_CONTENTS);
        if (zipBundlecontents != null) {
            itemEntity.getItem().set(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
            ItemUtils.onContainerDestroyed(itemEntity, zipBundlecontents.itemsCopy());
        }
    }
}
