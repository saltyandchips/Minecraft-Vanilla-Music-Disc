package com.hoyi.recordport;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RecordPort.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RECORD_PORT =
            TABS.register("record_port", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.record_port"))
                    .icon(() -> new ItemStack(ModItems.TEARS.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TEARS.get());
                        output.accept(ModItems.LAVA_CHICKEN.get());
                        output.accept(ModItems.BOUNCE.get());
                        output.accept(ModItems.FLURRY.get());
                    })
                    .build());

    private ModCreativeTabs() {
    }
}
