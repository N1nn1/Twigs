package com.ninni.twigs.registry;

import com.ninni.twigs.Twigs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class FeatureRegistry {

    public static <V extends R, R extends IForgeRegistryEntry<R>> V register(IForgeRegistry<R> registry, V feature, String name) {
        ResourceLocation id = new ResourceLocation(Twigs.MOD_ID, name);
        feature.setRegistryName(id);
        registry.register(feature);
        return feature;
    }

    public static void spawnFeatures() {
    }

    // Vanilla / Multi biome features.
    public static void addElderTrees() {

    }
}