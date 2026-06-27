package com.voxelpartum.minestuck_extended.data;

import com.google.gson.JsonObject;
import com.mraof.minestuck.item.weapon.MSToolType;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.voxelpartum.minestuck_extended.MinestuckExtended;
import com.voxelpartum.minestuck_extended.compat.create.CreateCompat;
import com.voxelpartum.minestuck_extended.item.MSEItems;
import net.minecraft.core.Holder;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.mraof.minestuck.item.MSItemTypes.*;
import static com.voxelpartum.minestuck_extended.item.weapon.MSEItemTypes.BATTLEAXE_TOOL;
import static com.voxelpartum.minestuck_extended.item.weapon.MSEItemTypes.GLOVE_TOOL;

public class BetterCombatCompats implements DataProvider {

    private static final String SICKLE = "bettercombat:sickle";
    private static final String SCYTHE = "bettercombat:scythe";
    private static final String CLAW = "bettercombat:claw";
    private static final String PICKAXE = "bettercombat:pickaxe";
    private static final String HAMMER = "bettercombat:hammer";
    private static final String AXE = "bettercombat:axe";
    private static final String CHAINSAW = "minestuck:chainsaw_base";
    private static final String MACE = "bettercombat:mace";
    private static final String SWORD = "bettercombat:sword";
    private static final String DAGGER = "bettercombat:dagger";
    private static final String LANCE = "bettercombat:lance";
    private static final String STAFF = "bettercombat:battlestaff";
    private static final String CANE = "minestuck:cane_base";
    private static final String FORK = "minestuck:fork_base";
    private static final String TRIDENT = "bettercombat:trident";
    private static final String WAND = "bettercombat:wand";

    private static final String GLOVE = "bettercombat:fist";
    private static final String BATTLEAXE = "bettercombat:double_axe";

    private final PackOutput output;

    private final Map<ResourceKey<Item>, String> weaponWithParent = new HashMap<>();

    public BetterCombatCompats(PackOutput output){
        this.output = output;
    }

    public void addWeapons(){

        addWeaponDefaults();

        getWeapon(MSEItems.BLACK_SHARD, SWORD);
        getWeapon(MSEItems.MEMORY_ALLOCATOR, SWORD);
        getWeapon(MSEItems.ROCKSTARS_GUITAR, AXE);
        getWeapon(MSEItems.SOULSPLITTER, AXE);
        getWeapon(MSEItems.WHIFFLEBAT, MACE);
        getWeapon(MSEItems.METAL_PAN, MACE);
        getWeapon(MSEItems.CLUB_SPIKED, MACE);
        getWeapon(MSEItems.MARKET_GARDENER, MACE);


        getWeapon(MSEItems.BRAIN_FORK, TRIDENT);
        getWeapon(MSEItems.PSIDON_ENTENTE, TRIDENT);
        getWeapon(MSEItems.PEARLESCENT_SIXANT, TRIDENT);
        getWeapon(MSEItems.OVEN_MITT, GLOVE);
        getWeapon(MSEItems.METAL_GAUNTLET, GLOVE);
        getWeapon(MSEItems.PRISMARINE_GAUNTLET, GLOVE);
        getWeapon(MSEItems.MANTISBLADE, GLOVE);

        getWeapon(MSEItems.HOPEYGLASSSWORD, SWORD);
        getWeapon(MSEItems.STRONG_GLOVES, GLOVE);
        getWeapon(MSEItems.SAPPHIRE_LABRYS, BATTLEAXE);
        getWeapon(MSEItems.SAPPHIC_LABRYS, BATTLEAXE);
        getWeapon(MSEItems.UNICORN_KNIFE, DAGGER);
        getWeapon(MSEItems.MAGNIFIED_GLASS, MACE);
        getWeapon(MSEItems.GUNSCYTHE, SCYTHE);
        getWeapon(MSEItems.ICE_STAFF, STAFF);
        getWeapon(MSEItems.EXTENDO_BAT, MACE);
        getWeapon(MSEItems.GLAIVE, STAFF);
        getWeapon(MSEItems.SHADOWGLAIVE, STAFF);

    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {

        List<CompletableFuture<?>> futures = new ArrayList<>();
        Path basePath = this.output.getOutputFolder(PackOutput.Target.DATA_PACK).resolve(MinestuckExtended.MOD_ID).resolve("weapon_attributes");

        addWeapons();

        for(Map.Entry<ResourceKey<Item>, String> entry : weaponWithParent.entrySet())
        {
            JsonObject object = new JsonObject();

            object.addProperty("parent", entry.getValue());

            futures.add(DataProvider.saveStable(cache, object, basePath.resolve(entry.getKey().location().getPath() + ".json")));
        }

        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
    }

    public String getWeapon(Holder<Item> item, String type){
        return weaponWithParent.put(item.getKey(), type);
    }

    @Override
    public String getName() {
        return "MSE Better Combat Weapon Files";
    }

    private void addWeaponDefaults()
    {
        CreateCompat.REGISTER.getEntries().forEach(weaponHolder ->
        {
            if(weaponHolder.get() instanceof WeaponItem weaponItem && weaponItem.getToolTypes() != null)
            {
                for(MSToolType toolType : weaponItem.getToolTypes())
                {
                    String parent = getWeaponParent(toolType);

                    if(!parent.isEmpty())
                        weaponWithParent.put(weaponHolder.getKey(), parent);
                }
            }
        });
    }

    public String getWeaponParent(MSToolType toolType)
    {
        if(toolType == SICKLE_TOOL)
            return SICKLE;
        else if(toolType == SCYTHE_TOOL)
            return SCYTHE;
        else if(toolType == CLAWS_TOOL)
            return CLAW;
        else if(toolType == PICKAXE_TOOL)
            return PICKAXE;
        else if(toolType == HAMMER_TOOL)
            return HAMMER;
        else if(toolType == AXE_TOOL)
            return AXE;
        else if(toolType == CHAINSAW_TOOL)
            return CHAINSAW;
        else if(toolType == CLUB_TOOL || toolType == SHOVEL_TOOL)
            return MACE;
        else if(toolType == SWORD_TOOL || toolType == KEY_TOOL || toolType == BATON_TOOL)
            return SWORD;
        else if(toolType == KNIFE_TOOL || toolType == FAN_TOOL)
            return DAGGER;
        else if(toolType == LANCE_TOOL)
            return LANCE;
        else if(toolType == STAFF_TOOL)
            return STAFF;
        else if(toolType == CANE_TOOL)
            return CANE;
        else if(toolType == FORK_TOOL)
            return FORK;
        else if(toolType == WAND_TOOL)
            return WAND;
        else if(toolType == GLOVE_TOOL)
            return GLOVE;
        else if(toolType == BATTLEAXE_TOOL)
            return BATTLEAXE;
        return "";
    }

}
