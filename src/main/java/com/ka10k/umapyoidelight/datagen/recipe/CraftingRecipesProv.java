package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.tag.ForgeTagsUD;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import vectorwing.farmersdelight.common.registry.ModItems;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CHOICE_VEGETABLES.get(), 1)
                .requires(ItemRegistration.CARROT_ITEM_RARE.get())
                .requires(ItemRegistration.GARLIC_ITEM_RARE.get())
                .requires(ItemRegistration.POTATO_ITEM_RARE.get())
                .requires(ItemRegistration.CHILI_ITEM_RARE.get())
                .requires(ItemRegistration.STRAWBERRY_ITEM_RARE.get())
                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
                .unlockedBy("has_garlic_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM_RARE.get()))
                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
                .unlockedBy("has_chili_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM_RARE.get()))
                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.RAW_POTATO_GARLIC_PIZZA.get(), 1)
                .pattern(" M ")
                .pattern("PGP")
                .pattern("DBD")
                .define('D', Ingredient.of(ForgeTags.DOUGH))
                .define('B', Items.BOWL)
                .define('P', Ingredient.of(ForgeTags.VEGETABLES_POTATO))
                .define('G', Ingredient.of(ForgeTagsUD.VEGETABLES_GARLIC))
                .define('M', Ingredient.of(ForgeTags.MILK))
                .unlockedBy("has_potato", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POTATO))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.RAW_POTATO_GARLIC_PIZZA_RARE.get(), 1)
                .pattern(" M ")
                .pattern("RGP")
                .pattern("DBD")
                .define('D', Ingredient.of(ForgeTags.DOUGH))
                .define('B', Items.BOWL)
                .define('P', Ingredient.of(ForgeTags.VEGETABLES_POTATO))
                .define('R', ItemRegistration.POTATO_ITEM_RARE.get())
                .define('G', Ingredient.of(ForgeTagsUD.VEGETABLES_GARLIC))
                .define('M', Ingredient.of(ForgeTags.MILK))
                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.POTATO_GARLIC_PIZZA.get(), 1)
                .requires(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE.get(), 6)
                .requires(Items.BOWL)
                .unlockedBy("has_pizza_slice", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE.get()))
                .save(consumer,"umapyoidelight:potato_garlic_pizza_from_slice");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.POTATO_GARLIC_PIZZA_RARE.get(), 1)
                .requires(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get(), 6)
                .requires(Items.BOWL)
                .unlockedBy("has_pizza_slice_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get()))
                .save(consumer,"umapyoidelight:potato_garlic_pizza_rare_from_slice");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_JUICE.get(), 1)
                .requires(Ingredient.of(ForgeTags.VEGETABLES_CARROT), 2)
                .requires(Ingredient.of(Items.GLASS_BOTTLE))
                .unlockedBy("has_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CARROT))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_JUICE.get(), 4)
                .requires(Ingredient.of(ItemRegistration.CARROT_ITEM_RARE.get()))
                .requires(Ingredient.of(Items.GLASS_BOTTLE),4)
                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
                .save(consumer, "umapyoidelight:carrot_juice_rare_carrot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.TOAST_STRAWBERRY_JAM.get(), 1)
                .requires(Ingredient.of(ItemRegistration.TOAST.get()))
                .requires(Ingredient.of(ItemRegistration.STRAWBERRY_JAM.get()))
                .unlockedBy("has_strawberry_jam", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_JAM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_BURGER.get())
                .requires(ForgeTags.BREAD)
                .requires(ModItems.BEEF_PATTY.get())
                .requires(ForgeTags.SALAD_INGREDIENTS)
                .requires(ForgeTags.VEGETABLES_CARROT)
                .requires(ForgeTags.CROPS_ONION)
                .unlockedBy("has_beef_patty", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BEEF_PATTY.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.STRAWBERRY_SANDWICH.get())
                .requires(ItemRegistration.TRIANGLE_BREAD.get(),2)
                .requires(ForgeTags.MILK)
                .requires(ForgeTagsUD.CROPS_STRAWBERRY)
                .unlockedBy("has_triangular_bread", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.TRIANGLE_BREAD.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.VEGETABLE_SANDWICH.get())
                .requires(ItemRegistration.TRIANGLE_BREAD.get(),2)
                .requires(ForgeTags.SALAD_INGREDIENTS)
                .requires(ForgeTags.VEGETABLES_CARROT)
                .unlockedBy("has_triangular_bread", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.TRIANGLE_BREAD.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.WOODCHIP_BLOCK.get(),4)
                .requires(ModItems.TREE_BARK.get(),3)
                .requires(ItemTags.DIRT)
                .unlockedBy("has_tree_bark", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TREE_BARK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.WOODCHIP_ROAD.get(),8)
                .requires(ItemRegistration.WOODCHIP_BLOCK.get())
                .unlockedBy("has_woodchip_block", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.WOODCHIP_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.WOODCHIP_BLOCK.get())
                .requires(ItemRegistration.WOODCHIP_ROAD.get(),8)
                .unlockedBy("has_woodchip_road", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.WOODCHIP_ROAD.get()))
                .save(consumer, "umapyoidelight:woodchip_block_from_road");

    }
}
