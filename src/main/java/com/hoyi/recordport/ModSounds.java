package com.hoyi.recordport;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RecordPort.MOD_ID);

    public static final RegistryObject<SoundEvent> CREATOR = register("music_disc.creator");
    public static final RegistryObject<SoundEvent> CREATOR_MUSIC_BOX = register("music_disc.creator_music_box");
    public static final RegistryObject<SoundEvent> PRECIPICE = register("music_disc.precipice");
    public static final RegistryObject<SoundEvent> TEARS = register("music_disc.tears");
    public static final RegistryObject<SoundEvent> LAVA_CHICKEN = register("music_disc.lava_chicken");
    public static final RegistryObject<SoundEvent> BOUNCE = register("music_disc.bounce");
    public static final RegistryObject<SoundEvent> FLURRY = register("music_disc.flurry");

    private ModSounds() {
    }

    private static RegistryObject<SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(
                new ResourceLocation(RecordPort.MOD_ID, name)));
    }
}
