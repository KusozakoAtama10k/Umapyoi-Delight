package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.world.level.ItemLike;

public class CompostableRegistration {

    public static void register() {
        add(ItemRegistration.WOODCHIP_BLOCK.get(), 0.3F);
        add(ItemRegistration.CUT_CARROT.get(), 0.3F);
        add(ItemRegistration.GRATED_CARROT.get(), 0.3F);
        add(ItemRegistration.GARLIC_ITEM.get(), 0.65F);
        add(ItemRegistration.CHILI_ITEM.get(), 0.65F);
        add(ItemRegistration.STRAWBERRY_ITEM.get(), 0.65F);
        add(ItemRegistration.WHITE_BREAD.get(), 0.65F);
        add(ItemRegistration.WILD_CHILIS.get(), 0.65F);
        add(ItemRegistration.WILD_GARLIC.get(), 0.65F);
        add(ItemRegistration.WILD_STRAWBERRIES.get(), 0.65F);
        add(ItemRegistration.GARLIC_ITEM_RARE.get(), 0.85F);
        add(ItemRegistration.CHILI_ITEM_RARE.get(), 0.85F);
        add(ItemRegistration.STRAWBERRY_ITEM_RARE.get(), 0.85F);
        add(ItemRegistration.CARROT_BREAD.get(), 0.85F);
        add(ItemRegistration.CARROT_CAKE_SLICE.get(), 0.85F);
        add(ItemRegistration.CARROT_CAKE.get(), 1.0F);
        add(ItemRegistration.CARROT_PIE_SLICE.get(), 0.85F);
        add(ItemRegistration.CARROT_PIE.get(), 1.0F);

        add(ItemRegistration.GARLIC_ITEM_RARE.get(), 0.85F);
        add(ItemRegistration.CHILI_ITEM_RARE.get(), 0.85F);
        add(ItemRegistration.STRAWBERRY_ITEM_RARE.get(), 0.85F);
        add(ItemRegistration.CARROT_ITEM_RARE.get(), 0.85F);
        add(ItemRegistration.POTATO_ITEM_RARE.get(), 0.85F);
        ;
    }

    private static void add(ItemLike item, float chance) {
        CompostingChanceRegistry.INSTANCE.add(item.asItem(), chance);
    }
}
