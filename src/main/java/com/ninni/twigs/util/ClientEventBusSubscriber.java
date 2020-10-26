package com.ninni.twigs.util;

import com.ninni.twigs.Twigs;
import com.ninni.twigs.registry.BlockRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Twigs.MOD_ID)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockRegistry.oak_bark_trapdoor, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockRegistry.oak_bark_door, RenderType.getCutout());
    }
}
