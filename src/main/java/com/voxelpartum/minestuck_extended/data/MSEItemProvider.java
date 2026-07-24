package com.voxelpartum.minestuck_extended.data;

import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.block.MSEBlocks;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import com.voxelpartum.minestuck_extended.compat.create.CreateCompat;
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
        handheldItem(MSEItems.SMUTSWORD.get());
        handheldItem(MSEItems.SHOVEL_BLADE.get());
        handheldItem(MSEItems.ENERGY_SWORD.get());
        handheldItem(MSEItems.MEMORY_ALLOCATOR.get());
        largeWeapon(MSEItems.BLACK_SHARD);
        handheldItem(MSEItems.ROCKSTARS_GUITAR.get());
        largeWeapon(MSEItems.SOULSPLITTER);
        handheldItem(MSEItems.WHIFFLEBAT.get());
        handheldItem(MSEItems.METAL_PAN.get());
        handheldItem(MSEItems.HOMERUN_BAT.get());
        handheldItem(MSEItems.CLUB_SPIKED.get());
        handheldItem(MSEItems.SPRING_MACE.get());
        handheldItem(MSEItems.MARKET_GARDENER.get());
        handheldItem(MSEItems.BIT_MUNCHER.get());
        largeLongWeapon(MSEItems.LANCER);
        largeWeapon(MSEItems.DEVILS_KNIFE);
        largeWeapon(MSEItems.SEAGRIFT_SCYTHE);
        handheldItem(MSEItems.PRINCESS_WAND.get());
        handheldItem(MSEItems.FLUORITE_ICOSAHEDRON.get());
        handheldItem(MSEItems.UNICORN_KNIFE.get());
        largeWeapon(MSEItems.MAGNIFIED_GLASS);
        handheldItem(MSEItems.DELTA_TWENTY.get());
        largeWeapon(MSEItems.ICE_STAFF);
        largeWeapon(MSEItems.EXTENDO_BAT);

        shieldModel(MSEItems.SHEELD);
        shieldModel(MSEItems.POGO_SHIELD);
        shieldModel(MSEItems.MAGNET_SHIELD);

        //Regular Items
        basicItem(MSEItems.DIAMOND_LICHEN.get());
        basicItem(MSEItems.CRUXITE_LICHEN.get());
        basicItem(MSEItems.URANIUM_LICHEN.get());

        basicItem(MSEItems.PLUSH_VRISKA.get());
        simpleBlockItem(MSEBlocks.PLUSH_NEPETA.get());

        basicItem(MSEItems.BEAGLEPUSS.get());
        basicItem(MSEItems.DISGUISE.get());
        basicItem(MSEItems.BEAGLEPISS.get());
        basicItem(MSEItems.TESTIFIPUSS.get());
        basicItem(MSEItems.SCARLET_SUNGLASSES.get());

        basicItem(MSEItems.ITCHY_HAT.get());
        basicItem(MSEItems.DOZE_HAT.get());
        basicItem(MSEItems.DIE_HAT.get());
        basicItem(MSEItems.TRACE_HAT.get());
        basicItem(MSEItems.CLOVER_HAT.get());
        basicItem(MSEItems.FIN_HAT.get());
        basicItem(MSEItems.DIE_HAT.get());
        basicItem(MSEItems.CROWBAR_HAT.get());
        basicItem(MSEItems.SNOWMAN_HAT.get());
        basicItem(MSEItems.STITCH_HAT.get());
        basicItem(MSEItems.SAWBUCK_HAT.get());
        basicItem(MSEItems.MATCHSTICKS_HAT.get());
        basicItem(MSEItems.EGGS_HAT.get());
        basicItem(MSEItems.BISCUITS_HAT.get());
        basicItem(MSEItems.QUARTERS_HAT.get());
        basicItem(MSEItems.CANS_HAT.get());
        basicItem(MSEItems.CAIRO_OVERCOAT.get());
        basicItem(MSEItems.INVIS_CLOAK.get());
        basicItem(MSEItems.SHADOW_CRYSTAL.get());
        basicItem(MSEItems.DELTA_RUNE.get());
        basicItem(MSEItems.ORANGE_CREAMSICLE.get());
        basicItem(MSEItems.NORMAL_BROWNIE.get());
        basicItem(MSEItems.NORMALER_BROWNIE.get());
        basicItem(MSEItems.LANCER_COOKIE.get());
        basicItem(MSEItems.CINDERBLOCK.get());
        basicItem(MSEItems.ACABRICK.get());
        basicItem(MSEItems.WATER_BALLOON.get());
        basicItem(MSEItems.ROULETTE_CARD.get());
        basicItem(MSEItems.ZIP_CARD.get());
        basicItem(MSEItems.ZIP_BUNDLE.get());
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

        basicItem(MSEItems.FANCYSANTA.get());
        basicItem(MSEItems.ZILLYSANTA.get());

        basicItem(MSEItems.HEADBAND.get());
        basicItem(MSEItems.ARADIA_HORNS.get());
        basicItem(MSEItems.TAVROS_HORNS.get());
        basicItem(MSEItems.SOLLUX_HORNS.get());
        basicItem(MSEItems.KARKAT_HORNS.get());
        basicItem(MSEItems.NEPETA_HORNS.get());
        basicItem(MSEItems.KANAYA_HORNS.get());
        basicItem(MSEItems.TEREZI_HORNS.get());
        basicItem(MSEItems.VRISKA_HORNS.get());
        basicItem(MSEItems.EQUIUS_HORNS.get());
        basicItem(MSEItems.GAMZEE_HORNS.get());
        basicItem(MSEItems.ERIDAN_HORNS.get());
        basicItem(MSEItems.FEFERI_HORNS.get());
        basicItem(MSEItems.HORUSS_HORNS.get());

        basicItem(MSEItems.VETHES_HORNS.get());
        basicItem(MSEItems.HERESA_HORNS.get());
        basicItem(MSEItems.METTAX_HORNS.get());
        basicItem(MSEItems.NELUMI_HORNS.get());
        basicItem(MSEItems.DRAYTH_HORNS.get());
        basicItem(MSEItems.LORKES_HORNS.get());
        basicItem(MSEItems.ARAMIA_HORNS.get());
        basicItem(MSEItems.MIRALA_HORNS.get());
        basicItem(MSEItems.AVRIIL_HORNS.get());
        basicItem(MSEItems.PISCAL_HORNS.get());
        basicItem(MSEItems.GALAAD_HELMET.get());

        basicItem(MSEItems.AZONYP_HORNS.get());
        basicItem(MSEItems.FRELSI_HORNS.get());
        basicItem(MSEItems.ACHLYS_HORNS.get());
        basicItem(MSEItems.RENARD_HORNS.get());
        basicItem(MSEItems.INANIS_HORNS.get());
        basicItem(MSEItems.DEVROS_HORNS.get());
        basicItem(MSEItems.NEYHIL_HORNS.get());
        basicItem(MSEItems.VERISI_HORNS.get());
        basicItem(MSEItems.NERIUS_HORNS.get());
        basicItem(MSEItems.JENSIS_HORNS.get());
        basicItem(MSEItems.PHANES_HORNS.get());
        basicItem(MSEItems.MAGNEA_HORNS.get());
        basicItem(MSEItems.STYBOL_HORNS.get());
        basicItem(MSEItems.FAHRAD_HORNS.get());



        simpleBlockItem(MSEBlocks.CHESS_TILE.get());
        basicItem(MSEItems.SKAIA_PC.get());
        simpleBlockItem(MSEBlocks.HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.HOPEYGLASS_PILLAR.get());
        glassPaneTexture(MSEItems.HOPEYGLASS_PANE.get(), MSEItems.HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.DEPTHS_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.DEPTHS_HOPEYGLASS_PANE.get(), MSEItems.DEPTHS_HOPEYGLASS.get());

        simpleBlockItem(MSEBlocks.RED_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.RED_HOPEYGLASS_PANE.get(), MSEItems.RED_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.ORANGE_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.ORANGE_HOPEYGLASS_PANE.get(), MSEItems.ORANGE_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.YELLOW_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.YELLOW_HOPEYGLASS_PANE.get(), MSEItems.YELLOW_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.LIME_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.LIME_HOPEYGLASS_PANE.get(), MSEItems.LIME_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.GREEN_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.GREEN_HOPEYGLASS_PANE.get(), MSEItems.GREEN_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.CYAN_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.CYAN_HOPEYGLASS_PANE.get(), MSEItems.CYAN_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.LIGHT_BLUE_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.LIGHT_BLUE_HOPEYGLASS_PANE.get(), MSEItems.LIGHT_BLUE_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.BLUE_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.BLUE_HOPEYGLASS_PANE.get(), MSEItems.BLUE_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.PURPLE_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.PURPLE_HOPEYGLASS_PANE.get(), MSEItems.PURPLE_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.MAGENTA_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.MAGENTA_HOPEYGLASS_PANE.get(), MSEItems.MAGENTA_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.PINK_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.PINK_HOPEYGLASS_PANE.get(), MSEItems.PINK_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.WHITE_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.WHITE_HOPEYGLASS_PANE.get(), MSEItems.WHITE_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.LIGHT_GRAY_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.LIGHT_GRAY_HOPEYGLASS_PANE.get(), MSEItems.LIGHT_GRAY_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.GRAY_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.GRAY_HOPEYGLASS_PANE.get(), MSEItems.GRAY_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.BLACK_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.BLACK_HOPEYGLASS_PANE.get(), MSEItems.BLACK_HOPEYGLASS.get());
        simpleBlockItem(MSEBlocks.BROWN_HOPEYGLASS.get());
        glassPaneTexture(MSEItems.BROWN_HOPEYGLASS_PANE.get(), MSEItems.BROWN_HOPEYGLASS.get());


        simpleBlockItem(MSEBlocks.PLUSH_GENESIS_FROG.get());
        simpleBlockItem(MSEBlocks.PLUSH_SPADES_SLICK.get());
        simpleBlockItem(MSEBlocks.PLUSH_HEARTS_BOXCARS.get());
        simpleBlockItem(MSEBlocks.PLUSH_DIAMONDS_DROOG.get());
        simpleBlockItem(MSEBlocks.PLUSH_CLUBS_DEUCE.get());
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

        handheldItem(CreateCompat.RENCH.get());
        handheldItem(CreateCompat.MECHANICAL_CHAINSAW.get());
        handheldItem(CreateCompat.MECHANICAL_CHAINSAW_LIPSTICK.get());

    }

    private void glassPaneTexture(Item paneItem, Item blockItem){
        withExistingParent(BuiltInRegistries.ITEM.getKey(paneItem).getPath(), "item/generated").texture("layer0", resourceBlock(itemName(blockItem)));
    }

    private String itemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return ResourceLocation.fromNamespaceAndPath(MinestuckExtended.MOD_ID, "block/" + path);
    }

    private void shieldModel(DeferredItem<Item> item){
        String name = id(item).getPath();
        String id = item.getId().toString();

        var blocking = withExistingParent(id +"_blocking", modLoc("base_shield" +"_blocking"))
                .texture("0", modLoc("item/"+name))
                .texture("particle", modLoc("item/"+name));
        withExistingParent(id, modLoc("base_shield"))
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
