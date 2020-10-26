package com.ninni.twigs.registry;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.item.AxeItem;

public class VanillaIntegrationRegistry {

    public static void setup() {
        // STRIPPED LOGS
        addStrippable(BlockRegistry.oak_branch, BlockRegistry.stripped_oak_branch);
        addStrippable(BlockRegistry.oak_beam, BlockRegistry.stripped_oak_beam);

        // COMPOSTER ITEMS

        // FLAMMABLES
        addFlammables(BlockRegistry.oak_bark_planks, 5, 20);
        addFlammables(BlockRegistry.oak_bark_slab, 5, 20);
        addFlammables(BlockRegistry.oak_bark_stairs, 5, 20);
        addFlammables(BlockRegistry.oak_bark_door, 5, 20);
        addFlammables(BlockRegistry.oak_bark_trapdoor, 5, 20);
        addFlammables(BlockRegistry.oak_bark_button, 5, 20);
        addFlammables(BlockRegistry.oak_bark_pressure_plate, 5, 20);
        addFlammables(BlockRegistry.carved_oak, 5, 20);
        addFlammables(BlockRegistry.oak_branch, 5, 5);
        addFlammables(BlockRegistry.stripped_oak_branch, 5, 5);
        addFlammables(BlockRegistry.stripped_oak_beam, 5, 5);
        addFlammables(BlockRegistry.oak_beam, 5, 5);

    }

    public static void addFlammables(Block blockIn, int encouragement, int flammability)
    {
        FireBlock fireblock = (FireBlock) Blocks.FIRE;
        fireblock.setFireInfo(blockIn, encouragement, flammability);
    }

    private static void addStrippable(Block unstrippedBlock, Block strippedBlock) {
        AxeItem.BLOCK_STRIPPING_MAP = Maps.newHashMap(AxeItem.BLOCK_STRIPPING_MAP);
        AxeItem.BLOCK_STRIPPING_MAP.put(unstrippedBlock, strippedBlock);
    }
}