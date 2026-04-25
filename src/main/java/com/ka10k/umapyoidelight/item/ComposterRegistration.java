package com.ka10k.umapyoidelight.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.ComposterBlock;

import java.util.function.Supplier;

public class ComposterRegistration {
    public static void registerCompost() {
        register(ItemRegistration.WOODCHIP_BLOCK, 0.3F);
        register(ItemRegistration.CUT_CARROT, 0.3F);
        register(ItemRegistration.GRATED_CARROT, 0.3F);
        register(ItemRegistration.GARLIC_ITEM, 0.65F);
        register(ItemRegistration.CHILI_ITEM, 0.65F);
        register(ItemRegistration.STRAWBERRY_ITEM, 0.65F);
        register(ItemRegistration.WHITE_BREAD, 0.65F);
        register(ItemRegistration.WILD_CHILIS, 0.65F);
        register(ItemRegistration.WILD_GARLIC, 0.65F);
        register(ItemRegistration.WILD_STRAWBERRIES, 0.65F);
        register(ItemRegistration.GARLIC_ITEM_RARE, 0.85F);
        register(ItemRegistration.CHILI_ITEM_RARE, 0.85F);
        register(ItemRegistration.STRAWBERRY_ITEM_RARE, 0.85F);
        register(ItemRegistration.CARROT_BREAD, 0.85F);
        register(ItemRegistration.CARROT_CAKE_SLICE, 0.85F);
        register(ItemRegistration.CARROT_CAKE, 1.0F);
        register(ItemRegistration.CARROT_PIE_SLICE, 0.85F);
        register(ItemRegistration.CARROT_PIE, 1.0F);
        
        register(ItemRegistration.GARLIC_ITEM_RARE, 0.85F);
        register(ItemRegistration.CHILI_ITEM_RARE, 0.85F);
        register(ItemRegistration.STRAWBERRY_ITEM_RARE, 0.85F);
        register(ItemRegistration.CARROT_ITEM_RARE, 0.85F);
        register(ItemRegistration.POTATO_ITEM_RARE, 0.85F);

    }
    private static void register(Supplier<? extends Item> item, float chance) {
        ComposterBlock.COMPOSTABLES.put(item.get(), chance);
    }
}
