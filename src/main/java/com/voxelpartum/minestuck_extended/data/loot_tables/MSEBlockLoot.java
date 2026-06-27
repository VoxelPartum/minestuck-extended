package com.voxelpartum.minestuck_extended.data.loot_tables;

import com.mraof.minestuck.item.MSItems;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class MSEBlockLoot extends BlockLootSubProvider {

    public MSEBlockLoot(HolderLookup.Provider holder) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), holder);
    }

    @Override
    protected void generate() {

        dropSelf(MSEBlocks.CHESS_TILE.get());
        dropSelf(MSEBlocks.SKAIA_PC.get());
        dropWhenSilkTouch(MSEBlocks.HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.DEPTHS_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.DEPTHS_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.HOPEYGLASS_PILLAR.get());
        dropWhenSilkTouch(MSEBlocks.RED_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.ORANGE_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.YELLOW_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.LIME_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.GREEN_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.CYAN_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.LIGHT_BLUE_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.BLUE_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.PURPLE_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.MAGENTA_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.PINK_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.WHITE_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.LIGHT_GRAY_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.GRAY_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.BLACK_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.BROWN_HOPEYGLASS.get());
        dropWhenSilkTouch(MSEBlocks.RED_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.ORANGE_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.YELLOW_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.LIME_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.GREEN_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.CYAN_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.LIGHT_BLUE_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.BLUE_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.PURPLE_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.MAGENTA_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.PINK_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.WHITE_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.LIGHT_GRAY_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.GRAY_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.BLACK_HOPEYGLASS_PANE.get());
        dropWhenSilkTouch(MSEBlocks.BROWN_HOPEYGLASS_PANE.get());
        dropSelf(MSEBlocks.PLUSH_VRISKA.get());
        dropSelf(MSEBlocks.PLUSH_NEPETA.get());
        dropSelf(MSEBlocks.PLUSH_GENESIS_FROG.get());
        dropSelf(MSEBlocks.PLUSH_SPADES_SLICK.get());
        dropSelf(MSEBlocks.PLUSH_HEARTS_BOXCARS.get());
        dropSelf(MSEBlocks.PLUSH_DIAMONDS_DROOG.get());
        dropSelf(MSEBlocks.PLUSH_CLUBS_DEUCE.get());
        dropSelf(MSEBlocks.DIAMOND_LICHEN.get());
        dropSelf(MSEBlocks.CRUXITE_LICHEN.get());
        dropSelf(MSEBlocks.URANIUM_LICHEN.get());

        dropSelf(MSEBlocks.PLUSH_SALAMANDER.get());
        dropSelf(MSEBlocks.PLUSH_NAKAGATOR.get());
        dropSelf(MSEBlocks.PLUSH_IGUANA.get());
        dropSelf(MSEBlocks.PLUSH_TURTLE.get());
        dropSelf(MSEBlocks.PLUSH_MUTATED_CAT.get());

        dropSelf(MSEBlocks.SCALEMATE_APPLESCAB.get());
        dropSelf(MSEBlocks.SCALEMATE_BERRYBREATH.get());
        dropSelf(MSEBlocks.SCALEMATE_CINNAMONWHIFF.get());
        dropSelf(MSEBlocks.SCALEMATE_HONEYTONGUE.get());
        dropSelf(MSEBlocks.SCALEMATE_LEMONSNOUT.get());
        dropSelf(MSEBlocks.SCALEMATE_PINESNORT.get());
        dropSelf(MSEBlocks.SCALEMATE_PUCEFOOT.get());
        dropSelf(MSEBlocks.SCALEMATE_PUMPKINSNUFFLE.get());
        dropSelf(MSEBlocks.SCALEMATE_PYRALSPITE.get());
        dropSelf(MSEBlocks.SCALEMATE_WITNESS.get());

        dropSelf(MSEBlocks.FANCYSANTA.get());
        dropSelf(MSEBlocks.ZILLYSANTA.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MSEBlocks.REGISTER.getEntries().stream().map(e -> (Block) e.value()).toList();
    }

    public LootTable.Builder cruxiteOreDrop(Block block)
    {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return createSilkTouchDispatchTable(block, applyExplosionDecay(block,
                LootItem.lootTableItem(MSItems.RAW_CRUXITE.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

}
