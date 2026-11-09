package com.hoyi.recordport;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(Registries.SOUND_EVENT, RecordPort.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> TEARS = register("music_disc.tears");
    public static final DeferredHolder<SoundEvent, SoundEvent> LAVA_CHICKEN = register("music_disc.lava_chicken");
    public static final DeferredHolder<SoundEvent, SoundEvent> BOUNCE = register("music_disc.bounce");
    public static final DeferredHolder<SoundEvent, SoundEvent> FLURRY = register("music_disc.flurry");

    private ModSounds() {
    }

    private static DeferredHolder<SoundEvent, SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(
                ResourceLocation.fromNamespaceAndPath(RecordPort.MOD_ID, name)));
    }
}
