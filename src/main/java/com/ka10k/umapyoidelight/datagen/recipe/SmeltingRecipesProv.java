package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class SmeltingRecipesProv {
    private static void foodSmeltingRecipes(String name, ItemLike ingredient, ItemLike result, float experience, Consumer<FinishedRecipe> consumer) {
        String namePrefix = new ResourceLocation(Umapyoidelight.MOD_ID, name).toString();
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, 200)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(consumer);
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, 600)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(consumer, namePrefix + "_from_campfire_cooking");
    }

    public static void register(Consumer<FinishedRecipe> consumer) {
        foodSmeltingRecipes("hamburg", ItemRegistration.RAW_HAMBURG.get(), ItemRegistration.HAMBURG.get(),0.35F, consumer);
        foodSmeltingRecipes("potato_garlic_pizza", ItemRegistration.RAW_POTATO_GARLIC_PIZZA.get(), ItemRegistration.POTATO_GARLIC_PIZZA.get(),0.35F, consumer);
        foodSmeltingRecipes("potato_garlic_pizza_rare", ItemRegistration.RAW_POTATO_GARLIC_PIZZA_RARE.get(), ItemRegistration.POTATO_GARLIC_PIZZA_RARE.get(),0.35F, consumer);
        foodSmeltingRecipes("toast", ItemRegistration.WHITE_BREAD.get(), ItemRegistration.TOAST.get(),0.35F, consumer);

    }
}
