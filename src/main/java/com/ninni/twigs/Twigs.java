package com.ninni.twigs;

import com.ninni.twigs.events.EventHandler;
import com.ninni.twigs.network.PacketHandler;
import com.ninni.twigs.registry.*;
import com.ninni.twigs.world.OreGeneration;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("gluttony")
public class Twigs {
    public static final String MOD_ID = "twigs";
    public static Twigs INSTANCE;
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    private void setup(final FMLCommonSetupEvent event) {
        PacketHandler.init();

        OreGeneration.setupOreGeneration();
        VanillaIntegrationRegistry.setup();

        MinecraftForge.EVENT_BUS.register(new GUIRegistry());
        MinecraftForge.EVENT_BUS.register(new EventHandler());
        LOGGER.info("Setup method registered.");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderRegistry.registryRenders();
        LOGGER.info("Client registry method registered.");
    }

    private void doParticleStuff(final ParticleFactoryRegisterEvent event) {
        ParticleRegistry.registerFactories();
        LOGGER.info("Particle registry method registered.");
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
