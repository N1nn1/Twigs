package me.ninni.twigs;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Twigs implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "twigs";
    public static final String MOD_NAME = "Twigs";

    // public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
    //     new Identifier(MOD_ID, "item_group"),
    //     () -> new ItemStack(ICON)
    // );

    @Override
    public void onInitialize() {
        log("Initializing");

        //

        log("Initialized");
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
    public static void log(String message) {
        log(Level.INFO, message);
    }

    public static Identifier texture(String path) {
        return new Identifier(MOD_ID, "textures/" + path + ".png");
    }
}
