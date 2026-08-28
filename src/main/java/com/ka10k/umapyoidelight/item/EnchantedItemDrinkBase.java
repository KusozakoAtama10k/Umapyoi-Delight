package com.ka10k.umapyoidelight.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.tracen.umapyoi.item.ItemDrinkBase;
import net.tracen.umapyoi.item.info.FoodInfo;

public class EnchantedItemDrinkBase extends ItemDrinkBase {
    public EnchantedItemDrinkBase(Item.Properties prop, FoodInfo info) {super(prop, info);}

    public boolean isFoil(ItemStack p_41172_) {
        return true;
    }
}
