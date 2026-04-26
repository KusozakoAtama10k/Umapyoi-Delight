package com.ka10k.umapyoidelight;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.List;

@JeiPlugin
public class JEIIntegration implements IModPlugin {
    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(Umapyoidelight.MOD_ID, "jei_plugin");

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(ItemRegistration.POTION.get()), VanillaTypes.ITEM_STACK, Component.translatable("jei.info.umapyoidelight.agnes_tachyon_potion"));
        registration.addIngredientInfo(new ItemStack(ItemRegistration.YAKISOBA.get()), VanillaTypes.ITEM_STACK, Component.translatable("jei.info.umapyoidelight.gold_ship_yakisoba"));
        registration.addIngredientInfo(new ItemStack(ItemRegistration.COFFEE.get()), VanillaTypes.ITEM_STACK, Component.translatable("jei.info.umapyoidelight.manhattan_cafe_coffee"));
        registration.addIngredientInfo(new ItemStack(ItemRegistration.SAKURAMOCHI.get()), VanillaTypes.ITEM_STACK, Component.translatable("jei.info.umapyoidelight.victory_club_rice_cake"));

        registration.addIngredientInfo(List.of(new ItemStack(ItemRegistration.WILD_CHILIS.get()), new ItemStack(ItemRegistration.CHILI_ITEM.get()), new ItemStack(ItemRegistration.CHILI_ITEM_RARE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.info.umapyoidelight.wild_chili_peppers"));
        registration.addIngredientInfo(List.of(new ItemStack(ItemRegistration.WILD_GARLIC.get()), new ItemStack(ItemRegistration.GARLIC_ITEM.get()), new ItemStack(ItemRegistration.GARLIC_ITEM_RARE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.info.umapyoidelight.wild_garlic"));
        registration.addIngredientInfo(List.of(new ItemStack(ItemRegistration.WILD_STRAWBERRIES.get()), new ItemStack(ItemRegistration.STRAWBERRY_ITEM.get()), new ItemStack(ItemRegistration.STRAWBERRY_ITEM_RARE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.info.umapyoidelight.wild_strawberries"));
    }

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }
}
