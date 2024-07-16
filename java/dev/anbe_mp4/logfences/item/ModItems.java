package dev.anbe_mp4.logfences.item;

import dev.anbe_mp4.logfences.LogFences;
import dev.anbe_mp4.logfences.block.ModBlocks;
import dev.anbe_mp4.logfences.item.custom.FuelBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LogFences.MOD_ID);

    //LOG & STEM FENCES
    public static final RegistryObject<BlockItem> OAK_LOG_FENCE = ITEMS.register("oak_log_fence",
            () -> new FuelBlockItem(ModBlocks.OAK_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> SPRUCE_LOG_FENCE = ITEMS.register("spruce_log_fence",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> BIRCH_LOG_FENCE = ITEMS.register("birch_log_fence",
            () -> new FuelBlockItem(ModBlocks.BIRCH_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> JUNGLE_LOG_FENCE = ITEMS.register("jungle_log_fence",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> ACACIA_LOG_FENCE = ITEMS.register("acacia_log_fence",
            () -> new FuelBlockItem(ModBlocks.ACACIA_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> CHERRY_LOG_FENCE = ITEMS.register("cherry_log_fence",
            () -> new FuelBlockItem(ModBlocks.CHERRY_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> DARK_OAK_LOG_FENCE = ITEMS.register("dark_oak_log_fence",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> MANGROVE_LOG_FENCE = ITEMS.register("mangrove_log_fence",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> BAMBOO_BLOCK_FENCE = ITEMS.register("bamboo_block_fence",
            () -> new FuelBlockItem(ModBlocks.BAMBOO_BLOCK_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> CRIMSON_STEM_FENCE = ITEMS.register("crimson_stem_fence",
            () -> new BlockItem(ModBlocks.CRIMSON_STEM_FENCE.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> WARPED_STEM_FENCE = ITEMS.register("warped_stem_fence",
            () -> new BlockItem(ModBlocks.WARPED_STEM_FENCE.get(),
                    new Item.Properties()));

    //STRIPPED FENCES
    public static final RegistryObject<BlockItem> STRIPPED_OAK_LOG_FENCE = ITEMS.register("stripped_oak_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_OAK_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOG_FENCE = ITEMS.register("stripped_spruce_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_SPRUCE_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOG_FENCE = ITEMS.register("stripped_birch_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_BIRCH_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOG_FENCE = ITEMS.register("stripped_jungle_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_JUNGLE_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOG_FENCE = ITEMS.register("stripped_acacia_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_ACACIA_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CHERRY_LOG_FENCE = ITEMS.register("stripped_cherry_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_CHERRY_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOG_FENCE = ITEMS.register("stripped_dark_oak_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_DARK_OAK_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_LOG_FENCE = ITEMS.register("stripped_mangrove_log_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_MANGROVE_LOG_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BAMBOO_BLOCK_FENCE = ITEMS.register("stripped_bamboo_block_fence",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEM_FENCE = ITEMS.register("stripped_crimson_stem_fence",
            () -> new BlockItem(ModBlocks.STRIPPED_CRIMSON_STEM_FENCE.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEM_FENCE = ITEMS.register("stripped_warped_stem_fence",
            () -> new BlockItem(ModBlocks.STRIPPED_WARPED_STEM_FENCE.get(),
                    new Item.Properties()));

    //LOG & STEM FENCE GATES
    public static final RegistryObject<BlockItem> OAK_LOG_FENCE_GATE = ITEMS.register("oak_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> SPRUCE_LOG_FENCE_GATE = ITEMS.register("spruce_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> BIRCH_LOG_FENCE_GATE = ITEMS.register("birch_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.BIRCH_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> JUNGLE_LOG_FENCE_GATE = ITEMS.register("jungle_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> ACACIA_LOG_FENCE_GATE = ITEMS.register("acacia_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.ACACIA_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> CHERRY_LOG_FENCE_GATE = ITEMS.register("cherry_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.CHERRY_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> DARK_OAK_LOG_FENCE_GATE = ITEMS.register("dark_oak_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> MANGROVE_LOG_FENCE_GATE = ITEMS.register("mangrove_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> BAMBOO_BLOCK_FENCE_GATE = ITEMS.register("bamboo_block_fence_gate",
            () -> new FuelBlockItem(ModBlocks.BAMBOO_BLOCK_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> CRIMSON_STEM_FENCE_GATE = ITEMS.register("crimson_stem_fence_gate",
            () -> new BlockItem(ModBlocks.CRIMSON_STEM_FENCE_GATE.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> WARPED_STEM_FENCE_GATE = ITEMS.register("warped_stem_fence_gate",
            () -> new BlockItem(ModBlocks.WARPED_STEM_FENCE_GATE.get(),
                    new Item.Properties()));

    //STRIPPED FENCE GATES
    public static final RegistryObject<BlockItem> STRIPPED_OAK_LOG_FENCE_GATE = ITEMS.register("stripped_oak_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOG_FENCE_GATE = ITEMS.register("stripped_spruce_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_SPRUCE_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOG_FENCE_GATE = ITEMS.register("stripped_birch_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_BIRCH_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOG_FENCE_GATE = ITEMS.register("stripped_jungle_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_JUNGLE_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOG_FENCE_GATE = ITEMS.register("stripped_acacia_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_ACACIA_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CHERRY_LOG_FENCE_GATE = ITEMS.register("stripped_cherry_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_CHERRY_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOG_FENCE_GATE = ITEMS.register("stripped_dark_oak_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_DARK_OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_LOG_FENCE_GATE = ITEMS.register("stripped_mangrove_log_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_MANGROVE_LOG_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = ITEMS.register("stripped_bamboo_block_fence_gate",
            () -> new FuelBlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get(),
                    new Item.Properties(), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEM_FENCE_GATE = ITEMS.register("stripped_crimson_stem_fence_gate",
            () -> new BlockItem(ModBlocks.STRIPPED_CRIMSON_STEM_FENCE_GATE.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEM_FENCE_GATE = ITEMS.register("stripped_warped_stem_fence_gate",
            () -> new BlockItem(ModBlocks.STRIPPED_WARPED_STEM_FENCE_GATE.get(),
                    new Item.Properties()));
}
