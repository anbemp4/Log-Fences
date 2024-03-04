package dev.anbe_mp4.logfences.blocks;

import dev.anbe_mp4.logfences.LogFences;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FenceBlockMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LogFences.MOD_ID);

    //LOG & STEM
    public static final RegistryObject<Block> OAK_LOG_FENCE = BLOCKS.register("oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_LOG_FENCE = BLOCKS.register("spruce_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_LOG_FENCE = BLOCKS.register("birch_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_LOG_FENCE = BLOCKS.register("jungle_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_LOG_FENCE = BLOCKS.register("acacia_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_LOG_FENCE = BLOCKS.register("dark_oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_LOG_FENCE = BLOCKS.register("mangrove_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CRIMSON_STEM_FENCE = BLOCKS.register("crimson_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.CRIMSON_HYPHAE)
                    .strength(2.0F, 3.0F).sound(SoundType.STEM)));

    public static final RegistryObject<Block> WARPED_STEM_FENCE = BLOCKS.register("warped_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.WARPED_HYPHAE)
                    .strength(2.0F, 3.0F).sound(SoundType.STEM)));

    //STRIPPED
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_FENCE = BLOCKS.register("stripped_oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_FENCE = BLOCKS.register("stripped_spruce_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_FENCE = BLOCKS.register("stripped_birch_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_FENCE = BLOCKS.register("stripped_jungle_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_FENCE = BLOCKS.register("stripped_acacia_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_FENCE = BLOCKS.register("stripped_dark_oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_FENCE = BLOCKS.register("stripped_mangrove_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_FENCE = BLOCKS.register("stripped_crimson_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.CRIMSON_HYPHAE)
                    .strength(2.0F, 3.0F).sound(SoundType.STEM)));

    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_FENCE = BLOCKS.register("stripped_warped_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.WARPED_HYPHAE)
                    .strength(2.0F, 3.0F).sound(SoundType.STEM)));
}
