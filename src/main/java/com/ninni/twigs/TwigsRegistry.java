package com.ninni.twigs;

import com.ninni.twigs.blocks.BoulderBlock;
import com.ninni.twigs.blocks.BranchBlock;
import com.ninni.twigs.blocks.PebblesBlock;
import com.ninni.twigs.registry.*;
import net.minecraft.block.*;
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

                        // True items:

                        //Tools & Armour:

                        // Item-blocks:

                        //OAK

                        //MISC OAK
                        ItemRegistry.carved_oak = new BlockItem(BlockRegistry.carved_oak, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.carved_oak.getRegistryName()),
                        ItemRegistry.oak_branch = new BlockItem(BlockRegistry.oak_branch, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.oak_branch.getRegistryName()),
                        ItemRegistry.stripped_oak_branch = new BlockItem(BlockRegistry.stripped_oak_branch, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.stripped_oak_branch.getRegistryName()),

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

                        //GLAZED BRICKS
                        ItemRegistry.black_glazed_bricks = new BlockItem(BlockRegistry.black_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.black_glazed_bricks.getRegistryName()),
                        ItemRegistry.blue_glazed_bricks = new BlockItem(BlockRegistry.blue_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.blue_glazed_bricks.getRegistryName()),
                        ItemRegistry.brown_glazed_bricks = new BlockItem(BlockRegistry.brown_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.brown_glazed_bricks.getRegistryName()),
                        ItemRegistry.cyan_glazed_bricks = new BlockItem(BlockRegistry.cyan_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.cyan_glazed_bricks.getRegistryName()),
                        ItemRegistry.gray_glazed_bricks = new BlockItem(BlockRegistry.gray_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.gray_glazed_bricks.getRegistryName()),
                        ItemRegistry.green_glazed_bricks = new BlockItem(BlockRegistry.green_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.green_glazed_bricks.getRegistryName()),
                        ItemRegistry.light_blue_glazed_bricks = new BlockItem(BlockRegistry.light_blue_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.light_blue_glazed_bricks.getRegistryName()),
                        ItemRegistry.light_gray_glazed_bricks = new BlockItem(BlockRegistry.light_gray_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.light_gray_glazed_bricks.getRegistryName()),
                        ItemRegistry.magenta_glazed_bricks = new BlockItem(BlockRegistry.magenta_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.magenta_glazed_bricks.getRegistryName()),
                        ItemRegistry.orange_glazed_bricks = new BlockItem(BlockRegistry.orange_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.orange_glazed_bricks.getRegistryName()),
                        ItemRegistry.pink_glazed_bricks = new BlockItem(BlockRegistry.pink_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.pink_glazed_bricks.getRegistryName()),
                        ItemRegistry.purple_glazed_bricks = new BlockItem(BlockRegistry.purple_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.purple_glazed_bricks.getRegistryName()),
                        ItemRegistry.red_glazed_bricks = new BlockItem(BlockRegistry.red_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.red_glazed_bricks.getRegistryName()),
                        ItemRegistry.white_glazed_bricks = new BlockItem(BlockRegistry.white_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.white_glazed_bricks.getRegistryName()),
                        ItemRegistry.yellow_glazed_bricks = new BlockItem(BlockRegistry.yellow_glazed_bricks, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.yellow_glazed_bricks.getRegistryName()),

                        //ROCKS
                        ItemRegistry.pebbles = new BlockItem(BlockRegistry.pebbles, new Item.Properties().group(TWIGS)).setRegistryName(BlockRegistry.pebbles.getRegistryName()),
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

                        //REINFORCED OAK SET
                        BlockRegistry.reinforced_oak_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("reinforced_oak_planks")),
                        BlockRegistry.reinforced_oak_stairs = new net.minecraft.block.StairsBlock(BlockRegistry.reinforced_oak_planks.getDefaultState(), StairsBlock.Properties.from(BlockRegistry.reinforced_oak_planks)).setRegistryName(location("reinforced_oak_stairs")),
                        BlockRegistry.reinforced_oak_slab = new SlabBlock(SlabBlock.Properties.from(BlockRegistry.reinforced_oak_planks)).setRegistryName(location("reinforced_oak_slab")),

                        //OAK BARK SET
                        BlockRegistry.oak_bark_planks = new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(location("oak_bark_planks")),
                        BlockRegistry.oak_bark_stairs = new net.minecraft.block.StairsBlock(BlockRegistry.oak_bark_planks.getDefaultState(), StairsBlock.Properties.from(BlockRegistry.oak_bark_planks)).setRegistryName(location("oak_bark_stairs")),
                        BlockRegistry.oak_bark_slab = new SlabBlock(SlabBlock.Properties.from(BlockRegistry.oak_bark_planks)).setRegistryName(location("oak_bark_slab")),
                        BlockRegistry.oak_bark_trapdoor = new net.minecraft.block.TrapDoorBlock(TrapDoorBlock.Properties.from(Blocks.ACACIA_TRAPDOOR)).setRegistryName(location("oak_bark_trapdoor")),
                        BlockRegistry.oak_bark_door = new net.minecraft.block.DoorBlock(DoorBlock.Properties.from(Blocks.OAK_DOOR)).setRegistryName(location("oak_bark_door")),
                        BlockRegistry.oak_bark_pressure_plate = new net.minecraft.block.PressurePlateBlock(net.minecraft.block.PressurePlateBlock.Sensitivity.EVERYTHING, PressurePlateBlock.Properties.from(Blocks.OAK_PRESSURE_PLATE)).setRegistryName(location("oak_bark_pressure_plate")),
                        BlockRegistry.oak_bark_button = new net.minecraft.block.WoodButtonBlock(WoodButtonBlock.Properties.from(Blocks.OAK_BUTTON)).setRegistryName(location("oak_bark_button")),

                        //GLAZED BRICKS
                        BlockRegistry.black_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("black_glazed_bricks")),
                        BlockRegistry.blue_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("blue_glazed_bricks")),
                        BlockRegistry.brown_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("brown_glazed_bricks")),
                        BlockRegistry.cyan_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("cyan_glazed_bricks")),
                        BlockRegistry.gray_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("gray_glazed_bricks")),
                        BlockRegistry.green_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("green_glazed_bricks")),
                        BlockRegistry.light_blue_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("light_blue_glazed_bricks")),
                        BlockRegistry.light_gray_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("light_gray_glazed_bricks")),
                        BlockRegistry.lime_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("lime_glazed_bricks")),
                        BlockRegistry.magenta_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("magenta_glazed_bricks")),
                        BlockRegistry.orange_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("orange_glazed_bricks")),
                        BlockRegistry.pink_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("pink_glazed_bricks")),
                        BlockRegistry.purple_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("purple_glazed_bricks")),
                        BlockRegistry.red_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("red_glazed_bricks")),
                        BlockRegistry.white_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("white_glazed_bricks")),
                        BlockRegistry.yellow_glazed_bricks = new Block(Block.Properties.from(Blocks.BRICKS)).setRegistryName(location("yellow_glazed_bricks")),

                        //ROCKS
                        BlockRegistry.pebbles = new PebblesBlock(Block.Properties.from(Blocks.COBBLESTONE)).setRegistryName(location("pebbles")),
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
