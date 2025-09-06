package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.tag.CommonTagsUD;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.stream.Stream;

import static vectorwing.farmersdelight.data.recipe.CookingRecipes.*;

public class CookingRecipesProv {
    public static void register(RecipeOutput output) {
        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_HAMBURG.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(Tags.Items.CROPS_CARROT)
                .addIngredient(CommonTags.FOODS_LEAFY_GREEN)
                .addIngredient(ModItems.TOMATO_SAUCE.get())
                .addIngredient(CommonTagsUD.FOODS_BURGER_MEAT)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .unlockedByAnyIngredient(ItemRegistration.HAMBURG.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_HAMBURG_DELUXE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
                .addIngredient(ModItems.MIXED_SALAD.get())
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.ItemValue(new ItemStack(ModItems.PASTA_WITH_MEATBALLS.get())),
                        new Ingredient.ItemValue(new ItemStack(ModItems.PASTA_WITH_MUTTON_CHOP.get()))
                )))
                .addIngredient(Ingredient.of(CommonTagsUD.FOODS_BURGER_MEAT),3)
                .unlockedByAnyIngredient(ItemRegistration.HAMBURG.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_POTATO_POTAUFEU.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(Ingredient.of(Tags.Items.CROPS_CARROT),2)
                .addIngredient(Tags.Items.CROPS_POTATO)
                .addIngredient(CommonTags.FOODS_LEAFY_GREEN)
                .addIngredient(Items.BONE)
                .unlockedByAnyIngredient(Items.CARROT)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(Tags.Items.CROPS_CARROT)
                .addIngredient(Tags.Items.CROPS_POTATO)
                .addIngredient(CommonTags.FOODS_LEAFY_GREEN)
                .addIngredient(Items.BONE)
                .addIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
                .unlockedByAnyIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GARLIC_RAMEN.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(CommonTags.FOODS_PASTA)
                .addIngredient(CommonTags.FOODS_RAW_PORK)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(Items.DRIED_KELP)
                .addIngredient(CommonTagsUD.CROPS_CHILI)
                .addIngredient(CommonTagsUD.CROPS_CHILI)
                .unlockedByAnyIngredient(ItemRegistration.GARLIC_ITEM.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GARLIC_RAMEN_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(CommonTags.FOODS_PASTA)
                .addIngredient(CommonTags.FOODS_RAW_PORK)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(Items.DRIED_KELP)
                .addIngredient(ItemRegistration.GARLIC_ITEM_RARE.get())
                .addIngredient(CommonTagsUD.CROPS_CHILI)
                .unlockedByAnyIngredient(ItemRegistration.GARLIC_ITEM_RARE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.MAPO_CARROT_POTATO.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(Tags.Items.CROPS_CARROT)
                .addIngredient(Tags.Items.CROPS_POTATO)
                .addIngredient(Ingredient.of(CommonTagsUD.CROPS_CHILI),2)
                .addIngredient(CommonTags.FOODS_RAW_PORK)
                .unlockedByAnyIngredient(ItemRegistration.CHILI_ITEM.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.MAPO_CARROT_POTATO_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(Tags.Items.CROPS_CARROT)
                .addIngredient(Tags.Items.CROPS_POTATO)
                .addIngredient(CommonTagsUD.CROPS_CHILI)
                .addIngredient(ItemRegistration.CHILI_ITEM_RARE.get())
                .addIngredient(CommonTags.FOODS_RAW_PORK)
                .unlockedByAnyIngredient(ItemRegistration.CHILI_ITEM_RARE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GI_PLATE.get(), 1, SLOW_COOKING, LARGE_EXP)
                .addIngredient(ItemRegistration.CHOICE_VEGETABLES.get(),3)
                .addIngredient(CommonTags.FOODS_PASTA)
                .addIngredient(ItemRegistration.RAW_HAMBURG.get())
                .addIngredient(Tags.Items.CROPS_WHEAT)
                .unlockedByAnyIngredient(ItemRegistration.CHOICE_VEGETABLES.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.STRAWBERRY_JAM.get(), 2, FAST_COOKING, SMALL_EXP)
                .addIngredient(Ingredient.of(CommonTagsUD.CROPS_STRAWBERRY),2)
                .addIngredient(Items.SUGAR,3)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CHOCOLATE_STICK_CARROT.get(), 1, FAST_COOKING, SMALL_EXP)
                .addIngredient(ItemRegistration.RAW_STICK_CARROT.get())
                .addIngredient(Items.SUGAR)
                .addIngredient(Tags.Items.CROPS_COCOA_BEAN)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CHOCOLATE_STICK_CARROT.get(), 1, FAST_COOKING, SMALL_EXP)
                .addIngredient(ItemRegistration.RAW_STICK_CARROT.get())
                .addIngredient(CommonTagsUD.FOODS_CHOCOLATES)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,"farmersdelight:cooking/chocolate_stick_carrot_using_chocolates");

        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_PUDDING.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(Items.SUGAR)
                .addIngredient(ItemRegistration.GRATED_CARROT.get())
                .addIngredient(Tags.Items.DRINKS_MILK)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output);
    }

}
