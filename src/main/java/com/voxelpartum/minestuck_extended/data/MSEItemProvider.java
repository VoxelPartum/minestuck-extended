package com.voxelpartum.minestuck_extended.data;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatBlocks;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.compat.CreateCompat;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.function.Supplier;

public class MSEItemProvider extends ItemModelProvider{

    public MSEItemProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MinestuckExtended.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Weapons
        handheldItem(MSEItems.SHADOW_SWORD.get());
        handheldItem(MSEItems.SHOVEL_BLADE.get());
        handheldItem(MSEItems.ENERGY_SWORD.get());
        largeWeapon(MSEItems.RUDE_AXE);
        handheldItem(MSEItems.ROCKSTARS_GUITAR.get());
        largeWeapon(MSEItems.SOULSPLITTER);
        handheldItem(MSEItems.WHIFFLEBAT.get());
        handheldItem(MSEItems.METAL_PAN.get());
        handheldItem(MSEItems.HOMERUN_BAT.get());
        handheldItem(MSEItems.CLUB_SPIKED.get());
        handheldItem(MSEItems.SPRING_MACE.get());
        handheldItem(MSEItems.MARKET_GARDENER.get());
        largeLongWeapon(MSEItems.LANCER);
        largeWeapon(MSEItems.DEVILS_KNIFE);
        handheldItem(MSEItems.PRINCESS_WAND.get());

        shieldModel(MSEItems.SHEELD, "base_shield");
        shieldModel(MSEItems.POGO_SHIELD, "base_shield");
        shieldModel(MSEItems.MAGNET_SHIELD, "base_shield");

        //Regular Items
        basicItem(MSEItems.DIAMOND_LICHEN.get());
        basicItem(MSEItems.PLUSH_VRISKA.get());
        basicItem(MSEItems.BEAGLEPUSS.get());
        basicItem(MSEItems.DISGUISE.get());
        basicItem(MSEItems.BEAGLEPISS.get());
        basicItem(MSEItems.TESTIFIPUSS.get());
        basicItem(MSEItems.SHADOW_CRYSTAL.get());
        basicItem(MSEItems.DELTA_RUNE.get());
        basicItem(MSEItems.ORANGE_CREAMSICLE.get());
        basicItem(MSEItems.NORMAL_BROWNIE.get());
        basicItem(MSEItems.NORMALER_BROWNIE.get());
        basicItem(MSEItems.LANCER_COOKIE.get());
        basicItem(MSEItems.CINDERBLOCK.get());
        basicItem(MSEItems.ACABRICK.get());
        basicItem(MSEItems.ROULETTE_CARD.get());
        basicItem(MSEItems.SPIROGRAPH_ARMOR_TRIM.get());
        basicItem(MSEItems.BREATH_ARMOR_TRIM.get());
        basicItem(MSEItems.LIFE_ARMOR_TRIM.get());
        basicItem(MSEItems.LIGHT_ARMOR_TRIM.get());
        basicItem(MSEItems.TIME_ARMOR_TRIM.get());
        basicItem(MSEItems.HEART_ARMOR_TRIM.get());
        basicItem(MSEItems.RAGE_ARMOR_TRIM.get());
        basicItem(MSEItems.BLOOD_ARMOR_TRIM.get());
        basicItem(MSEItems.DOOM_ARMOR_TRIM.get());
        basicItem(MSEItems.VOID_ARMOR_TRIM.get());
        basicItem(MSEItems.SPACE_ARMOR_TRIM.get());
        basicItem(MSEItems.MIND_ARMOR_TRIM.get());
        basicItem(MSEItems.HOPE_ARMOR_TRIM.get());


        simpleBlockItem(MSEBlocks.CHESS_TILE.get());
        simpleBlockItem(MSEBlocks.PLUSH_SALAMANDER.get());
        simpleBlockItem(MSEBlocks.PLUSH_NAKAGATOR.get());
        simpleBlockItem(MSEBlocks.PLUSH_IGUANA.get());
        simpleBlockItem(MSEBlocks.PLUSH_TURTLE.get());
        simpleBlockItem(MSEBlocks.PLUSH_MUTATED_CAT.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_APPLESCAB.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_BERRYBREATH.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_CINNAMONWHIFF.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_HONEYTONGUE.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_LEMONSNOUT.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_PINESNORT.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_PUCEFOOT.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_PUMPKINSNUFFLE.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_PYRALSPITE.get());
        simpleBlockItem(MSEBlocks.SCALEMATE_WITNESS.get());

        //Mod Compats
        handheldItem(CreateCompat.RENCH.get());
        handheldItem(CreateCompat.MECHANICAL_CHAINSAW.get());
        handheldItem(CreateCompat.MECHANICAL_CHAINSAW_LIPSTICK.get());

        basicItem(FDCompatItems.BILESLAW.get());
        basicItem(FDCompatItems.STRAWBERRY_MILKSHAKE.get());
        simpleBlockItem(FDCompatBlocks.BREATH_CABINET.get());
        simpleBlockItem(FDCompatBlocks.LIFE_CABINET.get());
        simpleBlockItem(FDCompatBlocks.LIGHT_CABINET.get());
        simpleBlockItem(FDCompatBlocks.TIME_CABINET.get());
        simpleBlockItem(FDCompatBlocks.HEART_CABINET.get());
        simpleBlockItem(FDCompatBlocks.RAGE_CABINET.get());
        simpleBlockItem(FDCompatBlocks.BLOOD_CABINET.get());
        simpleBlockItem(FDCompatBlocks.DOOM_CABINET.get());
        simpleBlockItem(FDCompatBlocks.VOID_CABINET.get());
        simpleBlockItem(FDCompatBlocks.SPACE_CABINET.get());
        simpleBlockItem(FDCompatBlocks.MIND_CABINET.get());
        simpleBlockItem(FDCompatBlocks.HOPE_CABINET.get());
        simpleBlockItem(FDCompatBlocks.CARVED_CABINET.get());
        simpleBlockItem(FDCompatBlocks.TREATED_CABINET.get());
        simpleBlockItem(FDCompatBlocks.LACQUERED_CABINET.get());
        simpleBlockItem(FDCompatBlocks.GLOWING_CABINET.get());
        simpleBlockItem(FDCompatBlocks.FROST_CABINET.get());
        simpleBlockItem(FDCompatBlocks.RAINBOW_CABINET.get());
        simpleBlockItem(FDCompatBlocks.END_CABINET.get());
        simpleBlockItem(FDCompatBlocks.DEAD_CABINET.get());
        simpleBlockItem(FDCompatBlocks.CINDERED_CABINET.get());
        simpleBlockItem(FDCompatBlocks.SHADEWOOD_CABINET.get());

    }

    private void shieldModel(DeferredItem<Item> item, String shieldType){
        String name = id(item).getPath();
        String id = item.getId().toString();

        var blocking = withExistingParent(id +"_blocking", modLoc(shieldType+"_blocking"))
                .texture("0", modLoc("item/"+name))
                .texture("particle", modLoc("item/"+name));
        withExistingParent(id, modLoc(shieldType))
                .texture("0", modLoc("item/"+name))
                .texture("particle", modLoc("item/"+name))
                .override().predicate(ResourceLocation.withDefaultNamespace("blocking"), 1).model(blocking);
    }

    private void largeLongWeapon(Supplier<? extends Item> item)
    {
        String name = id(item).getPath();
        withExistingParent(name,
                id("item/large_long_weapon"))
                .texture("layer0", texture(name));
    }

    private void largeWeapon(Supplier<? extends Item> item)
    {
        String name = id(item).getPath();
        withExistingParent(name,
                id("item/large_weapon"))
                .texture("layer0", texture(name));
    }

    private static ResourceLocation texture(String path)
    {
        return id(ModelProvider.ITEM_FOLDER + "/" + path);
    }

    private static ResourceLocation id(String path)
    {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, path);
    }

    private static ResourceLocation id(Supplier<? extends Item> item)
    {
        return BuiltInRegistries.ITEM.getKey(item.get());
    }

}
