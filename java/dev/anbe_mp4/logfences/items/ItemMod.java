package dev.anbe_mp4.logfences.items;

import dev.anbe_mp4.logfences.LogFences;
import dev.anbe_mp4.logfences.blocks.FenceBlockMod;
import dev.anbe_mp4.logfences.blocks.FenceGateBlockMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemMod {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LogFences.MOD_ID);

    //FENCE
    public static final RegistryObject<BlockItem> OAK_LOG_FENCE = ITEMS.register("oak_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.OAK_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> SPRUCE_LOG_FENCE = ITEMS.register("spruce_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.SPRUCE_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> BIRCH_LOG_FENCE = ITEMS.register("birch_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.BIRCH_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> JUNGLE_LOG_FENCE = ITEMS.register("jungle_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.JUNGLE_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> ACACIA_LOG_FENCE = ITEMS.register("acacia_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.ACACIA_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> DARK_OAK_LOG_FENCE = ITEMS.register("dark_oak_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.DARK_OAK_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> MANGROVE_LOG_FENCE = ITEMS.register("mangrove_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.MANGROVE_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> CRIMSON_STEM_FENCE = ITEMS.register("crimson_stem_fence",
            () -> new BlockItem(FenceBlockMod.CRIMSON_STEM_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<BlockItem> WARPED_STEM_FENCE = ITEMS.register("warped_stem_fence",
            () -> new BlockItem(FenceBlockMod.WARPED_STEM_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<BlockItem> STRIPPED_OAK_LOG_FENCE = ITEMS.register("stripped_oak_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.STRIPPED_OAK_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOG_FENCE = ITEMS.register("stripped_spruce_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.STRIPPED_SPRUCE_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOG_FENCE = ITEMS.register("stripped_birch_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.STRIPPED_BIRCH_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOG_FENCE = ITEMS.register("stripped_jungle_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.STRIPPED_JUNGLE_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOG_FENCE = ITEMS.register("stripped_acacia_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.STRIPPED_ACACIA_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOG_FENCE = ITEMS.register("stripped_dark_oak_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.STRIPPED_DARK_OAK_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_LOG_FENCE = ITEMS.register("stripped_mangrove_log_fence",
            () -> new FuelBlockItem(FenceBlockMod.STRIPPED_MANGROVE_LOG_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEM_FENCE = ITEMS.register("stripped_crimson_stem_fence",
            () -> new BlockItem(FenceBlockMod.STRIPPED_CRIMSON_STEM_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEM_FENCE = ITEMS.register("stripped_warped_stem_fence",
            () -> new BlockItem(FenceBlockMod.STRIPPED_WARPED_STEM_FENCE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    //FENCE GATE
    public static final RegistryObject<BlockItem> OAK_LOG_FENCE_GATE = ITEMS.register("oak_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> SPRUCE_LOG_FENCE_GATE = ITEMS.register("spruce_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.SPRUCE_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> BIRCH_LOG_FENCE_GATE = ITEMS.register("birch_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.BIRCH_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> JUNGLE_LOG_FENCE_GATE = ITEMS.register("jungle_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.JUNGLE_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> ACACIA_LOG_FENCE_GATE = ITEMS.register("acacia_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.ACACIA_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> DARK_OAK_LOG_FENCE_GATE = ITEMS.register("dark_oak_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.DARK_OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> MANGROVE_LOG_FENCE_GATE = ITEMS.register("mangrove_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.MANGROVE_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> CRIMSON_STEM_FENCE_GATE = ITEMS.register("crimson_stem_fence_gate",
            () -> new BlockItem(FenceGateBlockMod.CRIMSON_STEM_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> WARPED_STEM_FENCE_GATE = ITEMS.register("warped_stem_fence_gate",
            () -> new BlockItem(FenceGateBlockMod.WARPED_STEM_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> STRIPPED_OAK_LOG_FENCE_GATE = ITEMS.register("stripped_oak_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.STRIPPED_OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOG_FENCE_GATE = ITEMS.register("stripped_spruce_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.STRIPPED_SPRUCE_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOG_FENCE_GATE = ITEMS.register("stripped_birch_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.STRIPPED_BIRCH_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOG_FENCE_GATE = ITEMS.register("stripped_jungle_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.STRIPPED_JUNGLE_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOG_FENCE_GATE = ITEMS.register("stripped_acacia_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.STRIPPED_ACACIA_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOG_FENCE_GATE = ITEMS.register("stripped_dark_oak_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.STRIPPED_DARK_OAK_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_LOG_FENCE_GATE = ITEMS.register("stripped_mangrove_log_fence_gate",
            () -> new FuelBlockItem(FenceGateBlockMod.STRIPPED_MANGROVE_LOG_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEM_FENCE_GATE = ITEMS.register("stripped_crimson_stem_fence_gate",
            () -> new BlockItem(FenceGateBlockMod.STRIPPED_CRIMSON_STEM_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEM_FENCE_GATE = ITEMS.register("stripped_warped_stem_fence_gate",
            () -> new BlockItem(FenceGateBlockMod.STRIPPED_WARPED_STEM_FENCE_GATE.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
}
