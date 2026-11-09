package com.hoyi.recordport;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(RecordPort.MOD_ID)
public class RecordPort {
    public static final String MOD_ID = "record_port";

    public RecordPort(IEventBus modEventBus, ModContainer modContainer) {
        ModSounds.SOUNDS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);
    }
}
