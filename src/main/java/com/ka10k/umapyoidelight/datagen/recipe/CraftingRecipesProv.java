package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.tag.ForgeTagsUD;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.tag.ForgeTags;

import java.util.function.Consumer;

public class CraftingRecipesProv {
    public static void register(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.CHILI_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("##I")
                .define('#', Ingredient.of(ForgeTagsUD.CROPS_CHILI))
                .define('I', ItemRegistration.CHILI_ITEM.get())
                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.GARLIC_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("##I")
                .define('#', Ingredient.of(ForgeTagsUD.CROPS_GARLIC))
                .define('I', ItemRegistration.GARLIC_ITEM.get())
                .unlockedBy("has_garlic", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.STRAWBERRY_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("##I")
                .define('#', Ingredient.of(ForgeTagsUD.CROPS_STRAWBERRY))
                .define('I', ItemRegistration.STRAWBERRY_ITEM.get())
                .unlockedBy("has_strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.CHILI_CRATE_RARE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ItemRegistration.CHILI_ITEM_RARE.get())
                .unlockedBy("has_chili_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM_RARE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.GARLIC_CRATE_RARE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ItemRegistration.GARLIC_ITEM_RARE.get())
                .unlockedBy("has_garlic_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM_RARE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.STRAWBERRY_CRATE_RARE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ItemRegistration.STRAWBERRY_ITEM_RARE.get())
                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.CARROT_CRATE_RARE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ItemRegistration.CARROT_ITEM_RARE.get())
                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.POTATO_CRATE_RARE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ItemRegistration.POTATO_ITEM_RARE.get())
                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CHILI_ITEM.get(), 9)
                .requires(ItemRegistration.CHILI_CRATE.get())
                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.GARLIC_ITEM.get(), 9)
                .requires(ItemRegistration.GARLIC_CRATE.get())
                .unlockedBy("has_garlic", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.STRAWBERRY_ITEM.get(), 9)
                .requires(ItemRegistration.STRAWBERRY_CRATE.get())
                .unlockedBy("has_strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CHILI_ITEM_RARE.get(), 9)
                .requires(ItemRegistration.CHILI_CRATE_RARE.get())
                .unlockedBy("has_chili_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM_RARE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.GARLIC_ITEM_RARE.get(), 9)
                .requires(ItemRegistration.GARLIC_CRATE_RARE.get())
                .unlockedBy("has_garlic_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM_RARE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_ITEM_RARE.get(), 9)
                .requires(ItemRegistration.CARROT_CRATE_RARE.get())
                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.POTATO_ITEM_RARE.get(), 9)
                .requires(ItemRegistration.POTATO_CRATE_RARE.get())
                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.RAW_HAMBURG.get(), 3)
                .requires(Ingredient.of(ForgeTags.VEGETABLES_ONION))
                .requires(Ingredient.of(ForgeTags.RAW_BEEF))
                .requires(Ingredient.of(ForgeTags.RAW_BEEF))
                .requires(Ingredient.of(ForgeTags.RAW_PORK))
                .requires(Ingredient.of(ForgeTags.EGGS))
                .unlockedBy("has_raw_beef", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BEEF))
                .unlockedBy("has_raw_porkchop", InventoryChangeTrigger.TriggerInstance.hasItems(Items.PORKCHOP))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_STRAWBERRY_ICECREAM.get(), 1)
                .requires(Ingredient.of(ForgeTagsUD.FRUITS_STRAWBERRY))
                .requires(Ingredient.of(ForgeTagsUD.FRUITS_STRAWBERRY))
                .requires(Ingredient.of(ForgeTags.VEGETABLES_CARROT))
                .requires(Ingredient.of(ForgeTags.MILK))
                .requires(Ingredient.of(ForgeTags.GRAIN_WHEAT))
                .requires(Items.SNOWBALL)
                .unlockedBy("has_strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get(), 1)
                .requires(Ingredient.of(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
                .requires(Ingredient.of(ForgeTagsUD.FRUITS_STRAWBERRY))
                .requires(Ingredient.of(ForgeTags.VEGETABLES_CARROT))
                .requires(Ingredient.of(ForgeTags.MILK))
                .requires(Ingredient.of(ForgeTags.VEGETABLES_CARROT))
                .requires(Items.SNOWBALL)
                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
                .save(consumer);
    }
}
