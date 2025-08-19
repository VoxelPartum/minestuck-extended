package com.voxelpartum.minestuck_extended.data.tag;

import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.item.weapon.MSToolType;
import com.mraof.minestuck.item.weapon.MagicRangedRightClickEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import com.simibubi.create.AllTags;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.compat.farmers_delight.FDCompatItems;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.mraof.minestuck.item.MSItemTypes.*;
import static net.minecraft.tags.ItemTags.*;
import static com.mraof.minestuck.util.MSTags.Items.*;
import static com.voxelpartum.minestuck_extended.item.MSEItems.*;
import static net.neoforged.neoforge.common.Tags.Items.*;

public class MSEItemTagsProvider extends ItemTagsProvider {

    public MSEItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTagProvider, MinestuckExtended.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider){

        List<MSToolType> minestuckextendedMiningToolTypes = List.of(SICKLE_TOOL, SCYTHE_TOOL, CLAWS_TOOL, HAMMER_TOOL, FORK_TOOL);
        List<MSToolType> minestuckMeleeExtendedToolTypes = List.of(LANCE_TOOL, CLUB_TOOL, KNIFE_TOOL, KEY_TOOL, FAN_TOOL, BATON_TOOL, STAFF_TOOL, CANE_TOOL, WAND_TOOL);
        List<MSToolType> minestuckExtendedToolTypes = Stream.concat(minestuckextendedMiningToolTypes.stream(), minestuckMeleeExtendedToolTypes.stream()).toList();

        tag(BOOKSHELF_BOOKS).add(MSItems.CAPTCHA_CARD.get());

        tag(MODUS_CARD).add(ROULETTE_CARD.get()).add(ZIP_CARD.get()).add(ARRAY_CARD.get());
        tag(SWORDS).add(relevantWeapons(item -> hasToolType(item, List.of(SWORD_TOOL))));
        tag(AXES).add(relevantWeapons(item -> hasToolType(item, List.of(AXE_TOOL))));
        tag(SHOVELS).add(relevantWeapons(item -> hasToolType(item, List.of(SHOVEL_TOOL))));

        tag(BREAKS_DECORATED_POTS).add(relevantWeapons(item -> hasToolType(item, minestuckExtendedToolTypes)));

        tag(MELEE_WEAPON_TOOLS).add(relevantWeapons(item -> item instanceof WeaponItem));
        tag(TOOLS_SPEAR).add(relevantWeapons(item -> hasToolType(item, List.of(LANCE_TOOL))));
        tag(RANGED_WEAPON_TOOLS).add(relevantWeapons(item -> item instanceof ConsumableProjectileWeaponItem || (item instanceof WeaponItem weapon && (weapon.getItemRightClickEffect() instanceof MagicRangedRightClickEffect))));

        tag(DURABILITY_ENCHANTABLE).add(relevantWeapons(item -> item instanceof WeaponItem && item.isDamageable(item.getDefaultInstance())));
        tag(MINING_ENCHANTABLE).add(relevantWeapons(item -> hasToolType(item, minestuckextendedMiningToolTypes)));
        tag(MINING_LOOT_ENCHANTABLE).add(relevantWeapons(item -> hasToolType(item, minestuckextendedMiningToolTypes)));
        tag(SWORD_ENCHANTABLE).add(relevantWeapons(item -> item instanceof WeaponItem));
        tag(VANISHING_ENCHANTABLE).add(relevantWeapons(item -> item instanceof WeaponItem));

        this.tag(TRIM_MATERIALS)
                .add(MSItems.RAW_CRUXITE.get())
                .add(MSItems.RAW_URANIUM.get())
                .add(MSItems.BI_DYE.get());

        this.tag(TRIM_TEMPLATES)
                .add(SPIROGRAPH_ARMOR_TRIM.get())
                .add(BREATH_ARMOR_TRIM.get())
                .add(LIFE_ARMOR_TRIM.get())
                .add(LIGHT_ARMOR_TRIM.get())
                .add(TIME_ARMOR_TRIM.get())
                .add(HEART_ARMOR_TRIM.get())
                .add(RAGE_ARMOR_TRIM.get())
                .add(BLOOD_ARMOR_TRIM.get())
                .add(DOOM_ARMOR_TRIM.get())
                .add(VOID_ARMOR_TRIM.get())
                .add(SPACE_ARMOR_TRIM.get())
                .add(MIND_ARMOR_TRIM.get())
                .add(HOPE_ARMOR_TRIM.get());

            this.tag(CommonTags.TOOLS_KNIFE)
                    .add(MSItems.DAGGER.get())
                    .add(MSItems.DIAMOND_DAGGER.get())
                    .add(MSItems.PIGLINS_PRIDE.get())
                    .add(MSItems.BASILISK_BREATH_DRAGONSLAYER.get())
                    .add(MSItems.HALLOWED_SKEWER.get())
                    .add(MSItems.GENESIS_GODSTABBER.get())
                    .add(MSItems.LIGHT_OF_MY_KNIFE.get())
                    .add(MSItems.THOUSAND_DEGREE_KNIFE.get())
                    .add(MSItems.STARSHARD_TRI_BLADE.get())
                    .add(MSItems.TOOTHRIPPER.get())
                    .add(MSItems.SHADOWRAZOR.get())
                    .add(MSItems.PRINCESS_PERIL.get());

            tag(AllTags.AllItemTags.CHAIN_RIDEABLE.tag)
                    .add(MSItems.SCYTHE.get())
                    .add(MSItems.MARASCHINO_CHERRY_SCYTHE.get())
                    .add(MSItems.KISSY_CUTIE_HEART_SPLITTER.get())
                    .add(MSItems.MUTANT_CUTIE_CELL_CUTTER.get())
                    .add(MSItems.PROSPECTING_PICKSCYTHE.get())
                    .add(MSItems.EIGHTBALL_SCYTHE.get())
                    .add(MSItems.TIME_FLAYER.get())
                    .add(MSItems.DESTINY_DECIMATOR.get())
                    .add(MSItems.SUNRAY_HARVESTER.get())
                    .add(MSItems.GREEN_SUN_RAYREAPER.get())
                    .add(MSItems.SKAITHE.get())
                    .add(MSItems.HELLBRINGERS_HOE_ACTIVE.get())
                    .add(MSItems.HELLBRINGERS_HOE_INACTIVE.get())
                    .add(SEAGRIFT_SCYTHE.get());

            tag(ModTags.CABINETS)
                    .add(FDCompatItems.BREATH_CABINET.get())
                    .add(FDCompatItems.LIFE_CABINET.get())
                    .add(FDCompatItems.LIGHT_CABINET.get())
                    .add(FDCompatItems.TIME_CABINET.get())
                    .add(FDCompatItems.HEART_CABINET.get())
                    .add(FDCompatItems.RAGE_CABINET.get())
                    .add(FDCompatItems.BLOOD_CABINET.get())
                    .add(FDCompatItems.DOOM_CABINET.get())
                    .add(FDCompatItems.VOID_CABINET.get())
                    .add(FDCompatItems.SPACE_CABINET.get())
                    .add(FDCompatItems.MIND_CABINET.get())
                    .add(FDCompatItems.HOPE_CABINET.get())
                    .add(FDCompatItems.CARVED_CABINET.get())
                    .add(FDCompatItems.TREATED_CABINET.get())
                    .add(FDCompatItems.LACQUERED_CABINET.get())
                    .add(FDCompatItems.GLOWING_CABINET.get())
                    .add(FDCompatItems.FROST_CABINET.get())
                    .add(FDCompatItems.RAINBOW_CABINET.get())
                    .add(FDCompatItems.END_CABINET.get())
                    .add(FDCompatItems.DEAD_CABINET.get())
                    .add(FDCompatItems.CINDERED_CABINET.get())
                    .add(FDCompatItems.SHADEWOOD_CABINET.get())
            ;

    }

    private static Item[] relevantWeapons(Predicate<Item> predicate)
    {
        return MSEItems.REGISTER.getEntries().stream().map(Supplier::get).filter(predicate).toArray(Item[]::new);
    }

    private static boolean hasToolType(Item item, List<MSToolType> toolTypes)
    {
        if(!(item instanceof WeaponItem weaponItem) || weaponItem.getToolTypes() == null)
            return false;

        List<MSToolType> weaponTypes = weaponItem.getToolTypes();

        for(MSToolType toolType : toolTypes)
            if(weaponTypes.contains(toolType))
                return true;

        return false;
    }

}
