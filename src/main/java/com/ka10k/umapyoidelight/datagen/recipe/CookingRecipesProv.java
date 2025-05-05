package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.tag.ForgeTagsUD;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.function.Consumer;
import java.util.stream.Stream;

import static vectorwing.farmersdelight.data.recipe.CookingRecipes.*;

public class CookingRecipesProv {
    public static void register(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_HAMBURG.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(ForgeTags.VEGETABLES_CARROT)
                .addIngredient(ForgeTags.SALAD_INGREDIENTS)
                .addIngredient(ModItems.TOMATO_SAUCE.get())
                .addIngredient(ItemRegistration.HAMBURG.get())
                .addIngredient(ForgeTags.CROPS_TOMATO)
                .unlockedByAnyIngredient(ItemRegistration.HAMBURG.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_HAMBURG_DELUXE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
                .addIngredient(ModItems.MIXED_SALAD.get())
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.ItemValue(new ItemStack(ModItems.PASTA_WITH_MEATBALLS.get())),
                        new Ingredient.ItemValue(new ItemStack(ModItems.PASTA_WITH_MUTTON_CHOP.get()))
                )))
                .addIngredient(ItemRegistration.HAMBURG.get(),3)
                .unlockedByAnyIngredient(ItemRegistration.HAMBURG.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_POTATO_POTAUFEU.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(Ingredient.of(ForgeTags.VEGETABLES_CARROT),2)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(ForgeTags.SALAD_INGREDIENTS)
                .addIngredient(Items.BONE)
                .unlockedByAnyIngredient(Items.CARROT)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(ForgeTags.VEGETABLES_CARROT)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(ForgeTags.SALAD_INGREDIENTS)
                .addIngredient(Items.BONE)
                .addIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
                .unlockedByAnyIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GARLIC_RAMEN.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(ForgeTags.PASTA_RAW_PASTA)
                .addIngredient(ForgeTags.RAW_PORK)
                .addIngredient(ForgeTags.EGGS)
                .addIngredient(Items.DRIED_KELP)
                .addIngredient(ForgeTagsUD.VEGETABLES_GARLIC)
                .addIngredient(ForgeTagsUD.VEGETABLES_CHILI)
                .unlockedByAnyIngredient(ItemRegistration.GARLIC_ITEM.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GARLIC_RAMEN_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(ForgeTags.PASTA_RAW_PASTA)
                .addIngredient(ForgeTags.RAW_PORK)
                .addIngredient(ForgeTags.EGGS)
                .addIngredient(Items.DRIED_KELP)
                .addIngredient(ItemRegistration.GARLIC_ITEM_RARE.get())
                .addIngredient(ForgeTagsUD.VEGETABLES_CHILI)
                .unlockedByAnyIngredient(ItemRegistration.GARLIC_ITEM_RARE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.MAPO_CARROT_POTATO.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(ForgeTags.VEGETABLES_CARROT)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(Ingredient.of(ForgeTagsUD.VEGETABLES_CHILI),2)
                .addIngredient(ForgeTags.RAW_PORK)
                .unlockedByAnyIngredient(ItemRegistration.CHILI_ITEM.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.MAPO_CARROT_POTATO_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(ForgeTags.VEGETABLES_CARROT)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(ForgeTagsUD.VEGETABLES_CHILI)
                .addIngredient(ItemRegistration.CHILI_ITEM_RARE.get())
                .addIngredient(ForgeTags.RAW_PORK)
                .unlockedByAnyIngredient(ItemRegistration.CHILI_ITEM_RARE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GI_PLATE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(ItemRegistration.CHOICE_VEGETABLES.get(),3)
                .addIngredient(ForgeTags.PASTA)
                .addIngredient(ItemRegistration.RAW_HAMBURG.get())
                .addIngredient(ForgeTags.GRAIN_WHEAT)
                .unlockedByAnyIngredient(ItemRegistration.CHOICE_VEGETABLES.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.STRAWBERRY_JAM.get(), 2, FAST_COOKING, SMALL_EXP)
                .addIngredient(Ingredient.of(ForgeTagsUD.CROPS_STRAWBERRY),2)
                .addIngredient(Items.SUGAR,3)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

    }

}
