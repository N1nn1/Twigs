package com.ninni.twigs;

import com.ninni.twigs.blocks.BoulderBlock;
import com.ninni.twigs.blocks.RockBlock;
import com.ninni.twigs.blocks.BranchBlock;
import com.ninni.twigs.blocks.PebblesBlock;
import com.ninni.twigs.registry.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.particles.ParticleType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class TwigsRegistry {

    public static final String MODID = "twigs";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static final ItemGroup TWIGS = new TwigsItemGroup();

    // ITEM REGISTRATION
    @SuppressWarnings("ConstantConditions")
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent)
    {
        itemRegistryEvent.getRegistry().registerAll
                (

                        //items:

                        //Tools & Armour:

                        //Block items:

                        //MISC OAK
                        ItemRegistry.carved_oak = new BlockItem(BlockRegistry.carved_oak, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.carved_oak.getRegistryName()),
                        ItemRegistry.oak_branch = new BlockItem(BlockRegistry.oak_branch, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_branch.getRegistryName()),
                        ItemRegistry.stripped_oak_branch = new BlockItem(BlockRegistry.stripped_oak_branch, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.stripped_oak_branch.getRegistryName()),
                        ItemRegistry.oak_beam = new BlockItem(BlockRegistry.oak_beam, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_beam.getRegistryName()),
                        ItemRegistry.stripped_oak_beam = new BlockItem(BlockRegistry.stripped_oak_beam, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.stripped_oak_beam.getRegistryName()),

                        //REINFORCED OAK SET
                        ItemRegistry.reinforced_oak_planks = new BlockItem(BlockRegistry.reinforced_oak_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.reinforced_oak_planks.getRegistryName()),
                        ItemRegistry.reinforced_oak_stairs = new BlockItem(BlockRegistry.reinforced_oak_stairs, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.reinforced_oak_stairs.getRegistryName()),
                        ItemRegistry.reinforced_oak_slab = new BlockItem(BlockRegistry.reinforced_oak_slab, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.reinforced_oak_slab.getRegistryName()),

                        //OAK BARK SET
                        ItemRegistry.oak_bark_planks = new BlockItem(BlockRegistry.oak_bark_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_bark_planks.getRegistryName()),
                        ItemRegistry.oak_bark_stairs = new BlockItem(BlockRegistry.oak_bark_stairs, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_bark_stairs.getRegistryName()),
                        ItemRegistry.oak_bark_slab = new BlockItem(BlockRegistry.oak_bark_slab, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_bark_slab.getRegistryName()),
                        ItemRegistry.oak_bark_trapdoor = new BlockItem(BlockRegistry.oak_bark_trapdoor, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_bark_trapdoor.getRegistryName()),
                        ItemRegistry.oak_bark_door = new BlockItem(BlockRegistry.oak_bark_door, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_bark_door.getRegistryName()),
                        ItemRegistry.oak_bark_pressure_plate = new BlockItem(BlockRegistry.oak_bark_pressure_plate, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_bark_pressure_plate.getRegistryName()),
                        ItemRegistry.oak_bark_button = new BlockItem(BlockRegistry.oak_bark_button, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_bark_button.getRegistryName()),

                        //DARK OAK BARK SET
                        ItemRegistry.dark_oak_bark_planks = new BlockItem(BlockRegistry.dark_oak_bark_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.dark_oak_bark_planks.getRegistryName()),

                        //BIRCH BARK SET
                        ItemRegistry.birch_bark_planks = new BlockItem(BlockRegistry.birch_bark_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.birch_bark_planks.getRegistryName()),

                        //MISC ACACIA
                        ItemRegistry.carved_acacia = new BlockItem(BlockRegistry.carved_acacia, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.carved_acacia.getRegistryName()),
                        ItemRegistry.acacia_branch = new BlockItem(BlockRegistry.acacia_branch, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_branch.getRegistryName()),
                        ItemRegistry.stripped_acacia_branch = new BlockItem(BlockRegistry.stripped_acacia_branch, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.stripped_acacia_branch.getRegistryName()),
                        ItemRegistry.acacia_beam = new BlockItem(BlockRegistry.acacia_beam, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_beam.getRegistryName()),
                        ItemRegistry.stripped_acacia_beam = new BlockItem(BlockRegistry.stripped_acacia_beam, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.stripped_acacia_beam.getRegistryName()),

                        //REINFORCED ACACIA SET
                        ItemRegistry.reinforced_acacia_planks = new BlockItem(BlockRegistry.reinforced_acacia_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.reinforced_acacia_planks.getRegistryName()),
                        ItemRegistry.reinforced_acacia_stairs = new BlockItem(BlockRegistry.reinforced_acacia_stairs, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.reinforced_acacia_stairs.getRegistryName()),
                        ItemRegistry.reinforced_acacia_slab = new BlockItem(BlockRegistry.reinforced_acacia_slab, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.reinforced_acacia_slab.getRegistryName()),

                        //ACACIA BARK SET
                        ItemRegistry.acacia_bark_planks = new BlockItem(BlockRegistry.acacia_bark_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_bark_planks.getRegistryName()),
                        ItemRegistry.acacia_bark_stairs = new BlockItem(BlockRegistry.acacia_bark_stairs, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_bark_stairs.getRegistryName()),
                        ItemRegistry.acacia_bark_slab = new BlockItem(BlockRegistry.acacia_bark_slab, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_bark_slab.getRegistryName()),
                        ItemRegistry.acacia_bark_trapdoor = new BlockItem(BlockRegistry.acacia_bark_trapdoor, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_bark_trapdoor.getRegistryName()),
                        ItemRegistry.acacia_bark_door = new BlockItem(BlockRegistry.acacia_bark_door, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_bark_door.getRegistryName()),
                        ItemRegistry.acacia_bark_pressure_plate = new BlockItem(BlockRegistry.acacia_bark_pressure_plate, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_bark_pressure_plate.getRegistryName()),
                        ItemRegistry.acacia_bark_button = new BlockItem(BlockRegistry.acacia_bark_button, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.acacia_bark_button.getRegistryName()),

                        //JUNGLE BARK SET
                        ItemRegistry.jungle_bark_planks = new BlockItem(BlockRegistry.jungle_bark_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.jungle_bark_planks.getRegistryName()),

                        //SPRUCE BARK SET
                        ItemRegistry.spruce_bark_planks = new BlockItem(BlockRegistry.spruce_bark_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.spruce_bark_planks.getRegistryName()),

                        //CRIMSON STEM SET
                        ItemRegistry.crimson_stem_planks = new BlockItem(BlockRegistry.crimson_stem_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.crimson_stem_planks.getRegistryName()),

                        //WARPED STEM SET
                        ItemRegistry.warped_stem_planks = new BlockItem(BlockRegistry.warped_stem_planks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.warped_stem_planks.getRegistryName()),

                        //STONES
                        ItemRegistry.stone_brick_pillar = new BlockItem(BlockRegistry.stone_brick_pillar, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.stone_brick_pillar.getRegistryName()),
                        ItemRegistry.mossy_stone_brick_pillar = new BlockItem(BlockRegistry.mossy_stone_brick_pillar, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.mossy_stone_brick_pillar.getRegistryName()),
                        ItemRegistry.cracked_stone_brick_pillar = new BlockItem(BlockRegistry.cracked_stone_brick_pillar, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.cracked_stone_brick_pillar.getRegistryName()),
                        ItemRegistry.stone_pillar = new BlockItem(BlockRegistry.stone_pillar, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.stone_pillar.getRegistryName()),

                        //ANDESITE
                        ItemRegistry.polished_andesite_bricks = new BlockItem(BlockRegistry.polished_andesite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_andesite_bricks.getRegistryName()),
                        ItemRegistry.cracked_polished_andesite_bricks = new BlockItem(BlockRegistry.cracked_polished_andesite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.cracked_polished_andesite_bricks.getRegistryName()),
                        ItemRegistry.mossy_polished_andesite_bricks = new BlockItem(BlockRegistry.mossy_polished_andesite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.mossy_polished_andesite_bricks.getRegistryName()),
                        ItemRegistry.chiseled_polished_andesite_bricks = new BlockItem(BlockRegistry.chiseled_polished_andesite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.chiseled_polished_andesite_bricks.getRegistryName()),
                        ItemRegistry.polished_andesite_pillar = new BlockItem(BlockRegistry.polished_andesite_pillar, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_andesite_pillar.getRegistryName()),
                        ItemRegistry.polished_andesite_brick_slab = new BlockItem(BlockRegistry.polished_andesite_brick_slab, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_andesite_brick_slab.getRegistryName()),
                        ItemRegistry.polished_andesite_brick_stairs = new BlockItem(BlockRegistry.polished_andesite_brick_stairs, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_andesite_brick_stairs.getRegistryName()),
                        ItemRegistry.polished_andesite_brick_wall = new BlockItem(BlockRegistry.polished_andesite_brick_wall, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_andesite_brick_wall.getRegistryName()),

                        //DIORITE
                        ItemRegistry.polished_diorite_bricks = new BlockItem(BlockRegistry.polished_diorite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_diorite_bricks.getRegistryName()),
                        ItemRegistry.cracked_polished_diorite_bricks = new BlockItem(BlockRegistry.cracked_polished_diorite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.cracked_polished_diorite_bricks.getRegistryName()),
                        ItemRegistry.mossy_polished_diorite_bricks = new BlockItem(BlockRegistry.mossy_polished_diorite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.mossy_polished_diorite_bricks.getRegistryName()),
                        ItemRegistry.chiseled_polished_diorite_bricks = new BlockItem(BlockRegistry.chiseled_polished_diorite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.chiseled_polished_diorite_bricks.getRegistryName()),
                        ItemRegistry.polished_diorite_pillar = new BlockItem(BlockRegistry.polished_diorite_pillar, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_diorite_pillar.getRegistryName()),

                        //GRANITE
                        ItemRegistry.polished_granite_bricks = new BlockItem(BlockRegistry.polished_granite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_granite_bricks.getRegistryName()),
                        ItemRegistry.cracked_polished_granite_bricks = new BlockItem(BlockRegistry.cracked_polished_granite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.cracked_polished_granite_bricks.getRegistryName()),
                        ItemRegistry.mossy_polished_granite_bricks = new BlockItem(BlockRegistry.mossy_polished_granite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.mossy_polished_granite_bricks.getRegistryName()),
                        ItemRegistry.chiseled_polished_granite_bricks = new BlockItem(BlockRegistry.chiseled_polished_granite_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.chiseled_polished_granite_bricks.getRegistryName()),
                        ItemRegistry.polished_granite_pillar = new BlockItem(BlockRegistry.polished_granite_pillar, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.polished_granite_pillar.getRegistryName()),

                        //BLACKSTONE

                        //ROCKS
                        ItemRegistry.pebbles = new BlockItem(BlockRegistry.pebbles, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.pebbles.getRegistryName()),
                        ItemRegistry.rock = new BlockItem(BlockRegistry.rock, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.rock.getRegistryName()),
                        ItemRegistry.boulder = new BlockItem(BlockRegistry.boulder, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.boulder.getRegistryName())

                        );

        EntityRegistry.registerEntitySpawnEggs(itemRegistryEvent);
        LOGGER.info("Items registered.");
    }

    // BLOCK REGISTRATION
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> BlockRegistryEvent)
    {
        BlockRegistryEvent.getRegistry().registerAll
                (
                        //OAK

                        //MISC OAK
                        BlockRegistry.carved_oak = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("carved_oak")),
                        BlockRegistry.oak_branch = new BranchBlock(Block.Properties.from(Blocks.OAK_LOG)).setRegistryName(location("oak_branch")),
                        BlockRegistry.stripped_oak_branch = new BranchBlock(Block.Properties.from(Blocks.OAK_LOG)).setRegistryName(location("stripped_oak_branch")),
                        BlockRegistry.oak_beam = new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)).setRegistryName(location("oak_beam")),
                        BlockRegistry.stripped_oak_beam = new RotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG)).setRegistryName(location("stripped_oak_beam")),

                        //REINFORCED OAK SET
                        BlockRegistry.reinforced_oak_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F, 10.0f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("reinforced_oak_planks")),
                        BlockRegistry.reinforced_oak_stairs = new net.minecraft.block.StairsBlock(BlockRegistry.reinforced_oak_planks.getDefaultState(), StairsBlock.Properties.from(BlockRegistry.reinforced_oak_planks)).setRegistryName(location("reinforced_oak_stairs")),
                        BlockRegistry.reinforced_oak_slab = new SlabBlock(SlabBlock.Properties.from(BlockRegistry.reinforced_oak_planks)).setRegistryName(location("reinforced_oak_slab")),

                        //OAK BARK SET
                        BlockRegistry.oak_bark_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("oak_bark_planks")),
                        BlockRegistry.oak_bark_stairs = new net.minecraft.block.StairsBlock(BlockRegistry.oak_bark_planks.getDefaultState(), StairsBlock.Properties.from(BlockRegistry.oak_bark_planks)).setRegistryName(location("oak_bark_stairs")),
                        BlockRegistry.oak_bark_slab = new SlabBlock(SlabBlock.Properties.from(BlockRegistry.oak_bark_planks)).setRegistryName(location("oak_bark_slab")),
                        BlockRegistry.oak_bark_trapdoor = new com.ninni.twigs.blocks.TrapDoorBlock(TrapDoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("oak_bark_trapdoor")),
                        BlockRegistry.oak_bark_door = new com.ninni.twigs.blocks.DoorBlock(DoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f, 5.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("oak_bark_door")),
                        BlockRegistry.oak_bark_pressure_plate = new com.ninni.twigs.blocks.PressurePlateBlock(net.minecraft.block.PressurePlateBlock.Sensitivity.EVERYTHING, PressurePlateBlock.Properties.from(Blocks.OAK_PRESSURE_PLATE)).setRegistryName(location("oak_bark_pressure_plate")),
                        BlockRegistry.oak_bark_button = new com.ninni.twigs.blocks.WoodButtonBlock(WoodButtonBlock.Properties.from(Blocks.OAK_BUTTON)).setRegistryName(location("oak_bark_button")),

                        //DARK OAK BARK SET
                        BlockRegistry.dark_oak_bark_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("dark_oak_bark_planks")),

                        //BIRCH BARK SET
                        BlockRegistry.birch_bark_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("birch_bark_planks")),

                        //MISC ACACIA
                        BlockRegistry.carved_acacia = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("carved_acacia")),
                        BlockRegistry.acacia_branch = new BranchBlock(Block.Properties.from(Blocks.OAK_LOG)).setRegistryName(location("acacia_branch")),
                        BlockRegistry.stripped_acacia_branch = new BranchBlock(Block.Properties.from(Blocks.OAK_LOG)).setRegistryName(location("stripped_acacia_branch")),
                        BlockRegistry.acacia_beam = new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)).setRegistryName(location("acacia_beam")),
                        BlockRegistry.stripped_acacia_beam = new RotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG)).setRegistryName(location("stripped_acacia_beam")),

                        //REINFORCED ACACIA SET
                        BlockRegistry.reinforced_acacia_planks = new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(4.0F, 10.0f).harvestTool(ToolType.AXE).sound(SoundType.WOOD)).setRegistryName(location("reinforced_acacia_planks")),
                        BlockRegistry.reinforced_acacia_stairs = new net.minecraft.block.StairsBlock(BlockRegistry.reinforced_acacia_planks.getDefaultState(), StairsBlock.Properties.from(BlockRegistry.reinforced_acacia_planks)).setRegistryName(location("reinforced_acacia_stairs")),
                        BlockRegistry.reinforced_acacia_slab = new SlabBlock(SlabBlock.Properties.from(BlockRegistry.reinforced_acacia_planks)).setRegistryName(location("reinforced_acacia_slab")),

                        //ACACIA BARK SET
                        BlockRegistry.acacia_bark_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("acacia_bark_planks")),
                        BlockRegistry.acacia_bark_stairs = new net.minecraft.block.StairsBlock(BlockRegistry.acacia_bark_planks.getDefaultState(), StairsBlock.Properties.from(BlockRegistry.acacia_bark_planks)).setRegistryName(location("acacia_bark_stairs")),
                        BlockRegistry.acacia_bark_slab = new SlabBlock(SlabBlock.Properties.from(BlockRegistry.acacia_bark_planks)).setRegistryName(location("acacia_bark_slab")),
                        BlockRegistry.acacia_bark_trapdoor = new com.ninni.twigs.blocks.TrapDoorBlock(TrapDoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("acacia_bark_trapdoor")),
                        BlockRegistry.acacia_bark_door = new com.ninni.twigs.blocks.DoorBlock(DoorBlock.Properties.create(Material.WOOD).hardnessAndResistance(3.0f, 5.0f).harvestTool(ToolType.AXE).notSolid().sound(SoundType.WOOD)).setRegistryName(location("acacia_bark_door")),
                        BlockRegistry.acacia_bark_pressure_plate = new com.ninni.twigs.blocks.PressurePlateBlock(net.minecraft.block.PressurePlateBlock.Sensitivity.EVERYTHING, PressurePlateBlock.Properties.from(Blocks.OAK_PRESSURE_PLATE)).setRegistryName(location("acacia_bark_pressure_plate")),
                        BlockRegistry.acacia_bark_button = new com.ninni.twigs.blocks.WoodButtonBlock(WoodButtonBlock.Properties.from(Blocks.OAK_BUTTON)).setRegistryName(location("acacia_bark_button")),

                        //JUNGLE BARK SET
                        BlockRegistry.jungle_bark_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("jungle_bark_planks")),

                        //SPRUCE BARK SET
                        BlockRegistry.spruce_bark_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("spruce_bark_planks")),

                        //CRIMSON STEM SET
                        BlockRegistry.crimson_stem_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("crimson_stem_planks")),

                        //WARPED STEM SET
                        BlockRegistry.warped_stem_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("warped_stem_planks")),

                        //STONES
                        BlockRegistry.stone_brick_pillar = new RotatedPillarBlock(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("stone_brick_pillar")),
                        BlockRegistry.mossy_stone_brick_pillar = new RotatedPillarBlock(Block.Properties.from(Blocks.MOSSY_STONE_BRICKS)).setRegistryName(location("mossy_stone_brick_pillar")),
                        BlockRegistry.cracked_stone_brick_pillar = new RotatedPillarBlock(Block.Properties.from(Blocks.CRACKED_STONE_BRICKS)).setRegistryName(location("cracked_stone_brick_pillar")),
                        BlockRegistry.stone_pillar = new RotatedPillarBlock(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("stone_pillar")),

                        //ANDESITE
                        BlockRegistry.polished_andesite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("polished_andesite_bricks")),
                        BlockRegistry.cracked_polished_andesite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("cracked_polished_andesite_bricks")),
                        BlockRegistry.mossy_polished_andesite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("mossy_polished_andesite_bricks")),
                        BlockRegistry.chiseled_polished_andesite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("chiseled_polished_andesite_bricks")),
                        BlockRegistry.polished_andesite_pillar = new RotatedPillarBlock(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("polished_andesite_pillar")),
                        BlockRegistry.polished_andesite_brick_slab = new SlabBlock(SlabBlock.Properties.from(BlockRegistry.polished_andesite_bricks)).setRegistryName(location("polished_andesite_brick_slab")),
                        BlockRegistry.polished_andesite_brick_stairs = new net.minecraft.block.StairsBlock(BlockRegistry.polished_andesite_bricks.getDefaultState(), StairsBlock.Properties.from(BlockRegistry.polished_andesite_bricks)).setRegistryName(location("polished_andesite_brick_stairs")),
                        BlockRegistry.polished_andesite_brick_wall = new WallBlock(Block.Properties.from(Blocks.STONE_BRICK_WALL)).setRegistryName(location("polished_andesite_brick_wall")),

                        //DIORITE
                        BlockRegistry.polished_diorite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("polished_diorite_bricks")),
                        BlockRegistry.cracked_polished_diorite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("cracked_polished_diorite_bricks")),
                        BlockRegistry.mossy_polished_diorite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("mossy_polished_diorite_bricks")),
                        BlockRegistry.chiseled_polished_diorite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("chiseled_polished_diorite_bricks")),
                        BlockRegistry.polished_diorite_pillar = new RotatedPillarBlock(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("polished_diorite_pillar")),

                        //GRANITE
                        BlockRegistry.polished_granite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("polished_granite_bricks")),
                        BlockRegistry.cracked_polished_granite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("cracked_polished_granite_bricks")),
                        BlockRegistry.mossy_polished_granite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("mossy_polished_granite_bricks")),
                        BlockRegistry.chiseled_polished_granite_bricks = new Block(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("chiseled_polished_granite_bricks")),
                        BlockRegistry.polished_granite_pillar = new RotatedPillarBlock(Block.Properties.from(Blocks.STONE_BRICKS)).setRegistryName(location("polished_granite_pillar")),

                        //BLACKSTONE

                        //ROCKS
                        BlockRegistry.pebbles = new PebblesBlock(Block.Properties.from(Blocks.COBBLESTONE)).setRegistryName(location("pebbles")),
                        BlockRegistry.rock = new RockBlock(Block.Properties.from(Blocks.COBBLESTONE)).setRegistryName(location("rock")),
                        BlockRegistry.boulder = new BoulderBlock(Block.Properties.from(Blocks.COBBLESTONE)).setRegistryName(location("boulder"))

                        );

        LOGGER.info("Blocks registered.");
    }

    // SOUND REGISTRATION
    @SubscribeEvent
    public static void onSoundRegistry(final RegistryEvent.Register<SoundEvent> SoundRegistryEvent)
    {
        SoundRegistryEvent.getRegistry().registerAll
                (
                );

        LOGGER.info("Sound events registered.");
    }

    // ENTITY REGISTRATION
    @SubscribeEvent
    public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> EntityRegistryEvent)
    {
        EntityRegistryEvent.getRegistry().registerAll
                (
                );

        EntityRegistry.registerEntityWorldSpawns();
        LOGGER.info("Entities registered.");
    }

    // PARTICLE REGISTRATION
    @SubscribeEvent
    public static void onParticleRegistry(final RegistryEvent.Register<ParticleType<?>> ParticleRegistryEvent)
    {
        ParticleRegistryEvent.getRegistry().registerAll
                (
                );

        LOGGER.info("Particles registered.");
    }

    // RECIPE REGISTRATION
    @SubscribeEvent
    public static void onRecipeRegistry(final RegistryEvent.Register<IRecipeSerializer<?>> RecipeRegistryEvent)
    {

        RecipeRegistry.register(RecipeRegistryEvent);
        LOGGER.info("Recipes registered.");
    }

    // GUI REGISTRATION
    @SubscribeEvent
    public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> ContainerRegistryEvent)
    {
        ContainerRegistryEvent.getRegistry().registerAll
                (
                );

        LOGGER.info("GUI registered.");
    }

    // TILE ENTITY REGISTRATION
    @SubscribeEvent
    public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> TileEntityRegistryEvent)
    {
        TileEntityRegistryEvent.getRegistry().registerAll
                (
                );

        LOGGER.info("Tile Entities registered.");
    }

    // BIOME REGISTRATION

    // FEATURE REGISTRATION
    @SubscribeEvent
    public static void onFeatureRegistry(final RegistryEvent.Register<Feature<?>> FeatureRegistryEvent)
    {
        IForgeRegistry<Feature<?>> registry = FeatureRegistryEvent.getRegistry();

        LOGGER.info("Features registered.");
    }

    // TEXTURE STITCHING
    @SuppressWarnings("deprecation")
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onTextureStitchEvent(TextureStitchEvent.Pre event) {
        if (event.getMap().getTextureLocation() == AtlasTexture.LOCATION_BLOCKS_TEXTURE) {
            LOGGER.info("Textures stitched.");
        }
    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MODID, name);
    }
}
