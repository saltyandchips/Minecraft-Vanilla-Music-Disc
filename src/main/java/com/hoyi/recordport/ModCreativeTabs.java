package com.hoyi.recordport;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RecordPort.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RECORD_PORT = TABS.register("record_port",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.record_port"))
                    .icon(() -> new ItemStack(ModItems.CREATOR.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.CREATOR.get());
                        output.accept(ModItems.CREATOR_MUSIC_BOX.get());
                        output.accept(ModItems.PRECIPICE.get());
                        output.accept(ModItems.TEARS.get());
                        output.accept(ModItems.LAVA_CHICKEN.get());
                        output.accept(ModItems.BOUNCE.get());
                        output.accept(ModItems.FLURRY.get());
                    })
                    .build());

    private ModCreativeTabs() {
    }
}
