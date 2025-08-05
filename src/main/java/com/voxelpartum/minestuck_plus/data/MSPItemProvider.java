package com.voxelpartum.minestuck_plus.data;

import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.block.MSPBlocks;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatBlocks;
import com.voxelpartum.minestuck_plus.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import com.voxelpartum.minestuck_plus.compat.CreateCompat;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.function.Supplier;

public class MSPItemProvider extends ItemModelProvider{

    public MSPItemProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MinestuckPlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Weapons
        handheldItem(MSPItems.SHADOW_SWORD.get());
        handheldItem(MSPItems.SHOVEL_BLADE.get());
        handheldItem(MSPItems.ENERGY_SWORD.get());
        largeWeapon(MSPItems.RUDE_AXE);
        handheldItem(MSPItems.ROCKSTARS_GUITAR.get());
        largeWeapon(MSPItems.SOULSPLITTER);
        handheldItem(MSPItems.WHIFFLEBAT.get());
        handheldItem(MSPItems.METAL_PAN.get());
        handheldItem(MSPItems.HOMERUN_BAT.get());
        handheldItem(MSPItems.CLUB_SPIKED.get());
        handheldItem(MSPItems.SPRING_MACE.get());
        handheldItem(MSPItems.MARKET_GARDENER.get());
        largeLongWeapon(MSPItems.LANCER);
        largeWeapon(MSPItems.DEVILS_KNIFE);
        handheldItem(MSPItems.PRINCESS_WAND.get());

        shieldModel(MSPItems.SHEELD, "base_shield");
        shieldModel(MSPItems.POGO_SHIELD, "base_shield");
        shieldModel(MSPItems.MAGNET_SHIELD, "base_shield");

        //Regular Items
        basicItem(MSPItems.DIAMOND_LICHEN.get());
        basicItem(MSPItems.PLUSH_VRISKA.get());
        basicItem(MSPItems.BEAGLEPUSS.get());
        basicItem(MSPItems.DISGUISE.get());
        basicItem(MSPItems.BEAGLEPISS.get());
        basicItem(MSPItems.TESTIFIPUSS.get());
        basicItem(MSPItems.SHADOW_CRYSTAL.get());
        basicItem(MSPItems.DELTA_RUNE.get());
        basicItem(MSPItems.ORANGE_CREAMSICLE.get());
        basicItem(MSPItems.NORMAL_BROWNIE.get());
        basicItem(MSPItems.NORMALER_BROWNIE.get());
        basicItem(MSPItems.LANCER_COOKIE.get());
        basicItem(MSPItems.CINDERBLOCK.get());
        basicItem(MSPItems.ACABRICK.get());
        basicItem(MSPItems.ROULETTE_CARD.get());
        basicItem(MSPItems.SPIROGRAPH_ARMOR_TRIM.get());
        basicItem(MSPItems.BREATH_ARMOR_TRIM.get());
        basicItem(MSPItems.LIFE_ARMOR_TRIM.get());
        basicItem(MSPItems.LIGHT_ARMOR_TRIM.get());
        basicItem(MSPItems.TIME_ARMOR_TRIM.get());
        basicItem(MSPItems.HEART_ARMOR_TRIM.get());
        basicItem(MSPItems.RAGE_ARMOR_TRIM.get());
        basicItem(MSPItems.BLOOD_ARMOR_TRIM.get());
        basicItem(MSPItems.DOOM_ARMOR_TRIM.get());
        basicItem(MSPItems.VOID_ARMOR_TRIM.get());
        basicItem(MSPItems.SPACE_ARMOR_TRIM.get());
        basicItem(MSPItems.MIND_ARMOR_TRIM.get());
        basicItem(MSPItems.HOPE_ARMOR_TRIM.get());


        simpleBlockItem(MSPBlocks.CHESS_TILE.get());
        simpleBlockItem(MSPBlocks.PLUSH_SALAMANDER.get());
        simpleBlockItem(MSPBlocks.PLUSH_NAKAGATOR.get());
        simpleBlockItem(MSPBlocks.PLUSH_IGUANA.get());
        simpleBlockItem(MSPBlocks.PLUSH_TURTLE.get());
        simpleBlockItem(MSPBlocks.PLUSH_MUTATED_CAT.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_APPLESCAB.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_BERRYBREATH.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_CINNAMONWHIFF.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_HONEYTONGUE.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_LEMONSNOUT.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_PINESNORT.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_PUCEFOOT.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_PUMPKINSNUFFLE.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_PYRALSPITE.get());
        simpleBlockItem(MSPBlocks.SCALEMATE_WITNESS.get());

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
        return ResourceLocation.fromNamespaceAndPath(MinestuckPlus.MOD_ID, path);
    }

    private static ResourceLocation id(Supplier<? extends Item> item)
    {
        return BuiltInRegistries.ITEM.getKey(item.get());
    }

}
