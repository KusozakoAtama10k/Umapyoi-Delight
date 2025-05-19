package com.ka10k.umapyoidelight.item;

import cn.mcmod_mmf.mmlib.item.ItemDrinkBase;
import cn.mcmod_mmf.mmlib.item.info.FoodInfo;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedItemDrinkBase extends ItemDrinkBase {
    public EnchantedItemDrinkBase(Item.Properties prop, FoodInfo info) {super(prop, info);}

    public boolean isFoil(ItemStack p_41172_) {
        return true;
    }
}
