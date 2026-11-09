package com.hoyi.recordport;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxPlayable;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(RecordPort.MOD_ID);

    public static final DeferredItem<Item> TEARS = disc("tears", Rarity.UNCOMMON);
    public static final DeferredItem<Item> LAVA_CHICKEN = disc("lava_chicken", Rarity.RARE);
    public static final DeferredItem<Item> BOUNCE = disc("bounce", Rarity.UNCOMMON);
    public static final DeferredItem<Item> FLURRY = disc("flurry", Rarity.UNCOMMON);

    private ModItems() {
    }

    private static DeferredItem<Item> disc(String name, Rarity rarity) {
        ResourceKey<JukeboxSong> song = ResourceKey.create(
                Registries.JUKEBOX_SONG,
                ResourceLocation.fromNamespaceAndPath(RecordPort.MOD_ID, name));
        return ITEMS.register("music_disc_" + name, () -> new Item(
                new Item.Properties()
                        .stacksTo(1)
                        .rarity(rarity)
                        .component(DataComponents.JUKEBOX_PLAYABLE, new JukeboxPlayable(new EitherHolder<>(song), true))
        ));
    }
}
