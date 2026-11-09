package com.hoyi.recordport;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RecordPort.MOD_ID);

    public static final RegistryObject<Item> CREATOR =
            disc("creator", 12, 176, Rarity.RARE, ModSounds.CREATOR);
    public static final RegistryObject<Item> CREATOR_MUSIC_BOX =
            disc("creator_music_box", 11, 73, Rarity.UNCOMMON, ModSounds.CREATOR_MUSIC_BOX);
    public static final RegistryObject<Item> PRECIPICE =
            disc("precipice", 13, 299, Rarity.UNCOMMON, ModSounds.PRECIPICE);
    public static final RegistryObject<Item> TEARS =
            disc("tears", 10, 175, Rarity.UNCOMMON, ModSounds.TEARS);
    public static final RegistryObject<Item> LAVA_CHICKEN =
            disc("lava_chicken", 9, 135, Rarity.RARE, ModSounds.LAVA_CHICKEN);
    public static final RegistryObject<Item> BOUNCE =
            disc("bounce", 8, 234, Rarity.UNCOMMON, ModSounds.BOUNCE);
    public static final RegistryObject<Item> FLURRY =
            disc("flurry", 7, 155, Rarity.UNCOMMON, ModSounds.FLURRY);

    private ModItems() {
    }

    private static RegistryObject<Item> disc(String name, int comparatorOutput, int lengthInSeconds,
                                             Rarity rarity, RegistryObject<SoundEvent> sound) {
        return ITEMS.register("music_disc_" + name, () -> new RecordItem(
                comparatorOutput,
                sound.get(),
                new Item.Properties().stacksTo(1).rarity(rarity),
                lengthInSeconds
        ));
    }
}
