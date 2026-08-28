package com.ka10k.umapyoidelight.util;

import com.ka10k.umapyoidelight.Umapyoidelight;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public class regUtilsUD {

    private static class DeferredEntry<T> implements Supplier<T> {

        private final String name;
        private final Supplier<T> supplier;
        private T value;

        private DeferredEntry(String name, Supplier<T> supplier) {
            this.name = name;
            this.supplier = supplier;
        }

        private void register(Registry<T> registry) {
            if (value != null) {
                return;
            }

            value = Registry.register(registry, ResourceLocation.fromNamespaceAndPath(Umapyoidelight.MOD_ID, name), supplier.get());
        }

        @Override
        public T get() {
            if (value == null) {
                throw new IllegalStateException("Registry object has not been registered yet: " + name);
            }
            return value;
        }
    }

    private static final Map<Registry<?>, Map<String, DeferredEntry<?>>> REGISTRATIONS = new LinkedHashMap<>();

    public static <R, T extends R> Supplier<T> register(String name, Supplier<T> supplier, Registry<R> registry) {
        DeferredEntry<T> entry = new DeferredEntry<>(name, supplier);
        REGISTRATIONS.computeIfAbsent(registry, key -> new LinkedHashMap<>()).put(name, entry);
        return entry;
    }

    private static <R> void registerAll(Registry<R> registry) {
        Map<String, DeferredEntry<?>> entries = REGISTRATIONS.get(registry);

        if (entries == null) {
            return;
        }

        for (DeferredEntry<?> rawEntry : entries.values()) {
            @SuppressWarnings("unchecked")
            DeferredEntry<R> entry = (DeferredEntry<R>) rawEntry;
            entry.register(registry);
        }
    }

    public static <B extends Block> Supplier<B> regBlock(String name, Supplier<B> supplier) {
        return register(name, supplier, BuiltInRegistries.BLOCK);
    }

    public static <B extends Item> Supplier<B> regItem(String name, Supplier<B> supplier) {
        return register(name, supplier, BuiltInRegistries.ITEM);
    }

    public static void registerBlocks() {
        registerAll(net.minecraft.core.registries.BuiltInRegistries.BLOCK);
    }

    public static void registerItems() {
        registerAll(net.minecraft.core.registries.BuiltInRegistries.ITEM);
    }
}