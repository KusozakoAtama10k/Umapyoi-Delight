package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class SmeltingRecipesProv {
    private static void foodSmeltingRecipes(String name, ItemLike ingredient, ItemLike result, float experience, RecipeOutput output) {
        String namePrefix = ResourceLocation.fromNamespaceAndPath(Umapyoidelight.MOD_ID, name).toString();
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, 200)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(output);
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, 600)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(output, namePrefix + "_from_campfire_cooking");
    }

    private static void foodSmokingRecipes(String name, ItemLike ingredient, ItemLike result, float experience, RecipeOutput output) {
        String namePrefix = ResourceLocation.fromNamespaceAndPath(Umapyoidelight.MOD_ID, name).toString();
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ingredient), RecipeCategory.FOOD, result, experience, 100)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                .save(output, namePrefix + "_from_smoking");
    }

    public static void register(RecipeOutput output) {
        foodSmeltingRecipes("hamburg", ItemRegistration.RAW_HAMBURG.get(), ItemRegistration.HAMBURG.get(),0.35F, output);
        foodSmokingRecipes("hamburg", ItemRegistration.RAW_HAMBURG.get(), ItemRegistration.HAMBURG.get(),0.35F, output);
        foodSmeltingRecipes("potato_garlic_pizza", ItemRegistration.RAW_POTATO_GARLIC_PIZZA.get(), ItemRegistration.POTATO_GARLIC_PIZZA.get(),0.35F, output);
        foodSmeltingRecipes("potato_garlic_pizza_rare", ItemRegistration.RAW_POTATO_GARLIC_PIZZA_RARE.get(), ItemRegistration.POTATO_GARLIC_PIZZA_RARE.get(),0.35F, output);
        foodSmeltingRecipes("toast", ItemRegistration.WHITE_BREAD.get(), ItemRegistration.TOAST.get(),0.35F, output);
        foodSmokingRecipes("toast", ItemRegistration.WHITE_BREAD.get(), ItemRegistration.TOAST.get(),0.35F, output);
        foodSmeltingRecipes("grilled_stick_carrot", ItemRegistration.RAW_STICK_CARROT.get(), ItemRegistration.GRILLED_STICK_CARROT.get(),0.35F, output);
        foodSmokingRecipes("grilled_stick_carrot", ItemRegistration.RAW_STICK_CARROT.get(), ItemRegistration.GRILLED_STICK_CARROT.get(),0.35F, output);
        foodSmeltingRecipes("carrot_bread", ItemRegistration.CARROT_DOUGH.get(), ItemRegistration.CARROT_BREAD.get(),0.35F, output);
        foodSmokingRecipes("carrot_bread", ItemRegistration.CARROT_DOUGH.get(), ItemRegistration.CARROT_BREAD.get(),0.35F, output);


    }
}
