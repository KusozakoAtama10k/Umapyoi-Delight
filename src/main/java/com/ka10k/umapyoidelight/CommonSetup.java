package com.ka10k.umapyoidelight;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Set;

public class CommonSetup {

    public static void register() {
        registerItemSetAdditions();
    }

    public static void registerItemSetAdditions() {
        Set<Item> newWantedItems = Sets.newHashSet(
                ItemRegistration.CHILI_ITEM.get(),
                ItemRegistration.GARLIC_ITEM.get(),
                ItemRegistration.STRAWBERRY_ITEM.get());
        newWantedItems.addAll(Villager.WANTED_ITEMS);
        Villager.WANTED_ITEMS = ImmutableSet.copyOf(newWantedItems);

        HashMap<Item, Integer> foodPoints = new HashMap<>(Villager.FOOD_POINTS);
        foodPoints.put(ItemRegistration.CHILI_ITEM.get(), 1);
        foodPoints.put(ItemRegistration.GARLIC_ITEM.get(), 1);
        foodPoints.put(ItemRegistration.STRAWBERRY_ITEM.get(), 1);
        Villager.FOOD_POINTS = foodPoints;
    }
}
