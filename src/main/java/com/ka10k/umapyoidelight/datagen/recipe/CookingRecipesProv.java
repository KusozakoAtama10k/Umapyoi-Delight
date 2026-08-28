//package com.ka10k.umapyoidelight.datagen.recipe;
//
//import com.ka10k.umapyoidelight.item.ItemRegistration;
//import com.ka10k.umapyoidelight.tag.CommonTagsUD;
//import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
//import net.minecraft.data.recipes.RecipeOutput;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.crafting.Ingredient;
//import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
//import vectorwing.farmersdelight.common.registry.ModItems;
//import vectorwing.farmersdelight.common.tag.CommonTags;
//import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
//
//import static com.ka10k.umapyoidelight.datagen.recipe.CraftingRecipesProv.fromValues;
//import static vectorwing.farmersdelight.data.recipe.CookingRecipes.*;
//
//public class CookingRecipesProv {
//    public static void register(RecipeOutput output) {
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_HAMBURG.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
//                .addIngredient(ConventionalItemTags.CARROT_CROPS)
//                .addIngredient(CommonTags.Items.FOODS_LEAFY_GREEN)
//                .addIngredient(ModItems.TOMATO_SAUCE.get())
//                .addIngredient(CommonTagsUD.FOODS_BURGER_MEAT)
//                .addIngredient(CommonTags.Items.CROPS_TOMATO)
//                .unlockedByAnyIngredient(ItemRegistration.HAMBURG.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_HAMBURG_DELUXE.get(), 1, SLOW_COOKING, LARGE_EXP)
//                .addIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
//                .addIngredient(ModItems.MIXED_SALAD.get())
//                .addIngredient(fromValues(ModItems.PASTA_WITH_MEATBALLS.get(), ModItems.PASTA_WITH_MUTTON_CHOP.get()))
//                .addIngredient(Ingredient.of(CommonTagsUD.FOODS_BURGER_MEAT),3)
//                .unlockedByAnyIngredient(ItemRegistration.HAMBURG.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_POTATO_POTAUFEU.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
//                .addIngredient(Ingredient.of(ConventionalItemTags.CARROT_CROPS),2)
//                .addIngredient(ConventionalItemTags.POTATO_CROPS)
//                .addIngredient(CommonTags.Items.FOODS_LEAFY_GREEN)
//                .addIngredient(Items.BONE)
//                .unlockedByAnyIngredient(Items.CARROT)
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
//                .addIngredient(ConventionalItemTags.CARROT_CROPS)
//                .addIngredient(ConventionalItemTags.POTATO_CROPS)
//                .addIngredient(CommonTags.Items.FOODS_LEAFY_GREEN)
//                .addIngredient(Items.BONE)
//                .addIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
//                .unlockedByAnyIngredient(ItemRegistration.CARROT_ITEM_RARE.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GARLIC_RAMEN.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
//                .addIngredient(CommonTags.Items.FOODS_PASTA)
//                .addIngredient(CommonTags.Items.FOODS_RAW_PORK)
//                .addIngredient(ConventionalItemTags.EGGS)
//                .addIngredient(Items.DRIED_KELP)
//                .addIngredient(CommonTagsUD.CROPS_CHILI)
//                .addIngredient(CommonTagsUD.CROPS_CHILI)
//                .unlockedByAnyIngredient(ItemRegistration.GARLIC_ITEM.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GARLIC_RAMEN_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
//                .addIngredient(CommonTags.Items.FOODS_PASTA)
//                .addIngredient(CommonTags.Items.FOODS_RAW_PORK)
//                .addIngredient(ConventionalItemTags.EGGS)
//                .addIngredient(Items.DRIED_KELP)
//                .addIngredient(ItemRegistration.GARLIC_ITEM_RARE.get())
//                .addIngredient(CommonTagsUD.CROPS_CHILI)
//                .unlockedByAnyIngredient(ItemRegistration.GARLIC_ITEM_RARE.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.MAPO_CARROT_POTATO.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
//                .addIngredient(ConventionalItemTags.CARROT_CROPS)
//                .addIngredient(ConventionalItemTags.POTATO_CROPS)
//                .addIngredient(Ingredient.of(CommonTagsUD.CROPS_CHILI),2)
//                .addIngredient(CommonTags.Items.FOODS_RAW_PORK)
//                .unlockedByAnyIngredient(ItemRegistration.CHILI_ITEM.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.MAPO_CARROT_POTATO_RARE.get(), 1, SLOW_COOKING, LARGE_EXP)
//                .addIngredient(ConventionalItemTags.CARROT_CROPS)
//                .addIngredient(ConventionalItemTags.POTATO_CROPS)
//                .addIngredient(CommonTagsUD.CROPS_CHILI)
//                .addIngredient(ItemRegistration.CHILI_ITEM_RARE.get())
//                .addIngredient(CommonTags.Items.FOODS_RAW_PORK)
//                .unlockedByAnyIngredient(ItemRegistration.CHILI_ITEM_RARE.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.GI_PLATE.get(), 1, SLOW_COOKING, LARGE_EXP)
//                .addIngredient(ItemRegistration.CHOICE_VEGETABLES.get(),3)
//                .addIngredient(CommonTags.Items.FOODS_PASTA)
//                .addIngredient(ItemRegistration.RAW_HAMBURG.get())
//                .addIngredient(ConventionalItemTags.WHEAT_CROPS)
//                .unlockedByAnyIngredient(ItemRegistration.CHOICE_VEGETABLES.get())
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.STRAWBERRY_JAM.get(), 2, FAST_COOKING, SMALL_EXP)
//                .addIngredient(Ingredient.of(CommonTagsUD.CROPS_STRAWBERRY),2)
//                .addIngredient(Items.SUGAR,3)
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CHOCOLATE_STICK_CARROT.get(), 1, FAST_COOKING, SMALL_EXP)
//                .addIngredient(ItemRegistration.RAW_STICK_CARROT.get())
//                .addIngredient(Items.SUGAR)
//                .addIngredient(ConventionalItemTags.COCOA_BEAN_CROPS)
//                .addIngredient(ConventionalItemTags.MILK_DRINKS)
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CHOCOLATE_STICK_CARROT.get(), 1, FAST_COOKING, SMALL_EXP)
//                .addIngredient(ItemRegistration.RAW_STICK_CARROT.get())
//                .addIngredient(CommonTagsUD.CHOCOLATES)
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output,"umapyoidelight:cooking/chocolate_stick_carrot_using_chocolates");
//
//        CookingPotRecipeBuilder.cookingPotRecipe(ItemRegistration.CARROT_PUDDING.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
//                .addIngredient(ConventionalItemTags.EGGS)
//                .addIngredient(Items.SUGAR)
//                .addIngredient(ItemRegistration.GRATED_CARROT.get())
//                .addIngredient(ConventionalItemTags.MILK_DRINKS)
//                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
//                .save(output);
//    }
//
//}
