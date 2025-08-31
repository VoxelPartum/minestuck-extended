package com.voxelpartum.minestuck_extended;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class MinestuckExtendedConfig {

    public static class Server {
        public final ModConfigSpec.BooleanValue useFullRoulette;
        public final ModConfigSpec.IntValue zipSize;
        public final ModConfigSpec.BooleanValue pullSingleItemZipBundle;

        private Server(ModConfigSpec.Builder builder){
            builder.push("sylladex");
            useFullRoulette = builder.comment("If this set to true, the roulette modus can select from every card in the sylladex, not just the ones containing items.")
                    .define("useFullRoulette", false);
            zipSize = builder.comment("How many adjacent items get fetched when using the Zip modus.")
                    .defineInRange("zipSize", 1, 0,Integer.MAX_VALUE);
            pullSingleItemZipBundle = builder.comment("If this is set to false, the zip bundle can only grab items by interacting with the item itself.\n NOTE: the zip bundle item will still need to be deleted by interacting with it.")
                    .define("pullSingleItemZipBundle", true);

        }
    }

    static final ModConfigSpec serverSpec;
    public static final Server SERVER;
    static
    {
        Pair<Server, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(Server::new);
        SERVER = pair.getLeft();
        serverSpec = pair.getRight();
    }
}
