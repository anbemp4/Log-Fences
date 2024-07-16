package dev.anbe_mp4.logfences.block;

import dev.anbe_mp4.logfences.LogFences;
import dev.anbe_mp4.logfences.block.custom.FlammableFenceBlock;
import dev.anbe_mp4.logfences.block.custom.FlammableFenceGateBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LogFences.MOD_ID);

    //LOG & STEM FENCES
    public static final RegistryObject<Block> OAK_LOG_FENCE = BLOCKS.register("oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_LOG_FENCE = BLOCKS.register("spruce_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_LOG_FENCE = BLOCKS.register("birch_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_LOG_FENCE = BLOCKS.register("jungle_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_LOG_FENCE = BLOCKS.register("acacia_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHERRY_LOG_FENCE = BLOCKS.register("cherry_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> DARK_OAK_LOG_FENCE = BLOCKS.register("dark_oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_LOG_FENCE = BLOCKS.register("mangrove_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BAMBOO_BLOCK_FENCE = BLOCKS.register("bamboo_block_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> CRIMSON_STEM_FENCE = BLOCKS.register("crimson_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> WARPED_STEM_FENCE = BLOCKS.register("warped_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    //STRIPPED FENCES
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_FENCE = BLOCKS.register("stripped_oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_FENCE = BLOCKS.register("stripped_spruce_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_FENCE = BLOCKS.register("stripped_birch_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_FENCE = BLOCKS.register("stripped_jungle_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_FENCE = BLOCKS.register("stripped_acacia_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_FENCE = BLOCKS.register("stripped_cherry_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.CHERRY_WOOD)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_FENCE = BLOCKS.register("stripped_dark_oak_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_FENCE = BLOCKS.register("stripped_mangrove_log_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_FENCE = BLOCKS.register("stripped_bamboo_block_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                    .strength(2.0F, 3.0F).sound(SoundType.BAMBOO_WOOD)));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_FENCE = BLOCKS.register("stripped_crimson_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_FENCE = BLOCKS.register("stripped_warped_stem_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD)));

    //LOG & STEM FENCE GATES
    public static final RegistryObject<Block> OAK_LOG_FENCE_GATE = BLOCKS.register("oak_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.OAK));

    public static final RegistryObject<Block> SPRUCE_LOG_FENCE_GATE = BLOCKS.register("spruce_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.SPRUCE));

    public static final RegistryObject<Block> BIRCH_LOG_FENCE_GATE = BLOCKS.register("birch_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.BIRCH));

    public static final RegistryObject<Block> JUNGLE_LOG_FENCE_GATE = BLOCKS.register("jungle_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.JUNGLE));

    public static final RegistryObject<Block> ACACIA_LOG_FENCE_GATE = BLOCKS.register("acacia_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.ACACIA));

    public static final RegistryObject<Block> CHERRY_LOG_FENCE_GATE = BLOCKS.register("cherry_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.CHERRY));

    public static final RegistryObject<Block> DARK_OAK_LOG_FENCE_GATE = BLOCKS.register("dark_oak_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.DARK_OAK));

    public static final RegistryObject<Block> MANGROVE_LOG_FENCE_GATE = BLOCKS.register("mangrove_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.MANGROVE));

    public static final RegistryObject<Block> BAMBOO_BLOCK_FENCE_GATE = BLOCKS.register("bamboo_block_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.BAMBOO));

    public static final RegistryObject<Block> CRIMSON_STEM_FENCE_GATE = BLOCKS.register("crimson_stem_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F), WoodType.CRIMSON));

    public static final RegistryObject<Block> WARPED_STEM_FENCE_GATE = BLOCKS.register("warped_stem_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F), WoodType.WARPED));

    //STRIPPED FENCE GATES
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_FENCE_GATE = BLOCKS.register("stripped_oak_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.OAK));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_FENCE_GATE = BLOCKS.register("stripped_spruce_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.SPRUCE));

    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_FENCE_GATE = BLOCKS.register("stripped_birch_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.BIRCH));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_FENCE_GATE = BLOCKS.register("stripped_jungle_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.JUNGLE));

    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_FENCE_GATE = BLOCKS.register("stripped_acacia_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.ACACIA));

    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_FENCE_GATE = BLOCKS.register("stripped_cherry_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.CHERRY));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_FENCE_GATE = BLOCKS.register("stripped_dark_oak_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.DARK_OAK));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_FENCE_GATE = BLOCKS.register("stripped_mangrove_log_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.MANGROVE));

    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = BLOCKS.register("stripped_bamboo_block_fence_gate",
            () -> new FlammableFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .ignitedByLava(), WoodType.BAMBOO));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_FENCE_GATE = BLOCKS.register("stripped_crimson_stem_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F), WoodType.CRIMSON));

    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_FENCE_GATE = BLOCKS.register("stripped_warped_stem_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_HYPHAE)
                    .instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F), WoodType.WARPED));
}
