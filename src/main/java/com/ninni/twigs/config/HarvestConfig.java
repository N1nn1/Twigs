package com.ninni.twigs.config;

import net.minecraft.block.Blocks;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HarvestConfig {

        public static ForgeConfigSpec.ConfigValue<List<? extends String>> sickle_block_breaking;

        public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
        {
   }
    }