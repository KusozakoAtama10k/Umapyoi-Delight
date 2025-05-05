package com.ka10k.umapyoidelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.ComposterBlock;

import java.util.function.Supplier;

public class ComposterRegistration {
    public static void registerCompost() {
        register(ItemRegistration.GARLIC_ITEM, 0.65F);
        register(ItemRegistration.CHILI_ITEM, 0.65F);
        register(ItemRegistration.STRAWBERRY_ITEM, 0.65F);
        register(ItemRegistration.WHITE_BREAD, 0.65F);
        register(ItemRegistration.GARLIC_ITEM_RARE, 0.85F);
        register(ItemRegistration.CHILI_ITEM_RARE, 0.85F);
        register(ItemRegistration.STRAWBERRY_ITEM_RARE, 0.85F);

    }
    private static void register(Supplier<? extends Item> item, float chance) {
        ComposterBlock.COMPOSTABLES.put(item.get(), chance);
    }
}
