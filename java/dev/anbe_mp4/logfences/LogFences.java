package dev.anbe_mp4.logfences;

import dev.anbe_mp4.logfences.blocks.FenceBlockMod;
import dev.anbe_mp4.logfences.blocks.FenceGateBlockMod;
import dev.anbe_mp4.logfences.items.ItemMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LogFences.MOD_ID)
public class LogFences {
    public static final String MOD_ID = "logfences";

    public LogFences(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        FenceBlockMod.BLOCKS.register(bus);
        FenceGateBlockMod.BLOCKS.register(bus);
        ItemMod.ITEMS.register(bus);

    }
}
