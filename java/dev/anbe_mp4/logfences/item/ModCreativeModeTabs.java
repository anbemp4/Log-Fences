package dev.anbe_mp4.logfences.item;

import dev.anbe_mp4.logfences.LogFences;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LogFences.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LOGFENCES_TAB = TABS.register("logfences_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OAK_LOG_FENCE.get()))
                    .title(Component.translatable("creativetab.logfences_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OAK_LOG_FENCE.get());
                        pOutput.accept(ModItems.SPRUCE_LOG_FENCE.get());
                        pOutput.accept(ModItems.BIRCH_LOG_FENCE.get());
                        pOutput.accept(ModItems.JUNGLE_LOG_FENCE.get());
                        pOutput.accept(ModItems.ACACIA_LOG_FENCE.get());
                        pOutput.accept(ModItems.DARK_OAK_LOG_FENCE.get());
                        pOutput.accept(ModItems.MANGROVE_LOG_FENCE.get());
                        pOutput.accept(ModItems.CHERRY_LOG_FENCE.get());
                        pOutput.accept(ModItems.BAMBOO_BLOCK_FENCE.get());
                        pOutput.accept(ModItems.CRIMSON_STEM_FENCE.get());
                        pOutput.accept(ModItems.WARPED_STEM_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_OAK_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_SPRUCE_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_BIRCH_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_JUNGLE_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_ACACIA_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_DARK_OAK_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_MANGROVE_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_CHERRY_LOG_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_BAMBOO_BLOCK_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_CRIMSON_STEM_FENCE.get());
                        pOutput.accept(ModItems.STRIPPED_WARPED_STEM_FENCE.get());
                        pOutput.accept(ModItems.OAK_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.SPRUCE_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.BIRCH_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.JUNGLE_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.ACACIA_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.DARK_OAK_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.MANGROVE_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.CHERRY_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.BAMBOO_BLOCK_FENCE_GATE.get());
                        pOutput.accept(ModItems.CRIMSON_STEM_FENCE_GATE.get());
                        pOutput.accept(ModItems.WARPED_STEM_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_OAK_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_SPRUCE_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_BIRCH_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_JUNGLE_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_ACACIA_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_DARK_OAK_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_MANGROVE_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_CHERRY_LOG_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_CRIMSON_STEM_FENCE_GATE.get());
                        pOutput.accept(ModItems.STRIPPED_WARPED_STEM_FENCE_GATE.get());
                    }).build());
}
