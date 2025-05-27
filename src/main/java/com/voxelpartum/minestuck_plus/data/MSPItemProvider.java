package com.voxelpartum.minestuck_plus.data;

import com.mraof.minestuck.Minestuck;
import com.voxelpartum.minestuck_plus.MinestuckPlus;
import com.voxelpartum.minestuck_plus.item.MSPItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class MSPItemProvider extends ItemModelProvider {

    public MSPItemProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MinestuckPlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Weapons
        handheldItem(MSPItems.SHADOW_SWORD.get());
        largeWeapon(MSPItems.RUDE_AXE);

        //Beaglepusses... beaglepi?
        basicItem(MSPItems.BEAGLEPUSS.get());
        basicItem(MSPItems.DISGUISE.get());
        basicItem(MSPItems.BEAGLEPISS.get());
        basicItem(MSPItems.TESTIFIPUSS.get());

        basicItem(MSPItems.SHADOW_CRYSTAL.get());
        basicItem(MSPItems.CINDERBLOCK.get());
        basicItem(MSPItems.ACABRICK.get());

        basicItem(MSPItems.ROULETTE_CARD.get());
        basicItem(MSPItems.CHAT_CARD.get());
        basicItem(MSPItems.CATCHBALL_CARD.get());
        basicItem(MSPItems.CATCHBALL.get());

    }

    private ItemModelBuilder largeWeapon(Supplier<? extends Item> item)
    {
        String name = id(item).getPath();
        return withExistingParent(name,
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
