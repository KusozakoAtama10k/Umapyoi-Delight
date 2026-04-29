package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.tag.ForgeTagsUD;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;

import java.util.function.Consumer;
import java.util.stream.Stream;

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.STRAWBERRY_ITEM_RARE.get(), 9)
                .requires(ItemRegistration.STRAWBERRY_CRATE_RARE.get())
                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.RAW_HAMBURG.get(), 3)
                .requires(Ingredient.of(CommonTags.Items.VEGETABLES_ONION))
                .requires(Ingredient.of(CommonTags.Items.RAW_BEEF))
                .requires(Ingredient.of(CommonTags.Items.RAW_BEEF))
                .requires(Ingredient.of(CommonTags.Items.RAW_PORK))
                .requires(Ingredient.of(CommonTags.Items.EGGS))
                .unlockedBy("has_raw_beef", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BEEF))
                .unlockedBy("has_raw_porkchop", InventoryChangeTrigger.TriggerInstance.hasItems(Items.PORKCHOP))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_STRAWBERRY_ICECREAM.get(), 1)
                .requires(Ingredient.of(ForgeTagsUD.FRUITS_STRAWBERRY))
                .requires(Ingredient.of(ForgeTagsUD.FRUITS_STRAWBERRY))
                .requires(Ingredient.fromValues(Stream.of(new Ingredient.ItemValue(new ItemStack(ItemRegistration.GRATED_CARROT.get())),
                        new Ingredient.TagValue(CommonTags.Items.VEGETABLES_CARROT))))
                .requires(Ingredient.of(CommonTags.Items.MILK))
                .requires(Ingredient.of(CommonTags.Items.GRAIN_WHEAT))
                .requires(Items.SNOWBALL)
                .unlockedBy("has_strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get(), 1)
                .requires(Ingredient.of(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
                .requires(Ingredient.of(ForgeTagsUD.FRUITS_STRAWBERRY))
                .requires(Ingredient.fromValues(Stream.of(new Ingredient.ItemValue(new ItemStack(ItemRegistration.GRATED_CARROT.get())),
                        new Ingredient.TagValue(CommonTags.Items.VEGETABLES_CARROT))))
                .requires(Ingredient.of(CommonTags.Items.MILK))
                .requires(Ingredient.of(CommonTags.Items.VEGETABLES_CARROT))
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
                .define('D', Ingredient.of(CommonTags.Items.DOUGH))
                .define('B', Items.BOWL)
                .define('P', Ingredient.of(CommonTags.Items.VEGETABLES_POTATO))
                .define('G', Ingredient.of(ForgeTagsUD.VEGETABLES_GARLIC))
                .define('M', Ingredient.fromValues(Stream.of(new Ingredient.TagValue(CommonTags.Items.MILK),
                        new Ingredient.TagValue(ForgeTagsUD.CHEESE),new Ingredient.TagValue(ForgeTagsUD.CHEESES))))
                .unlockedBy("has_potato", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POTATO))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.RAW_POTATO_GARLIC_PIZZA_RARE.get(), 1)
                .pattern(" M ")
                .pattern("RGP")
                .pattern("DBD")
                .define('D', Ingredient.of(CommonTags.Items.DOUGH))
                .define('B', Items.BOWL)
                .define('P', Ingredient.of(CommonTags.Items.VEGETABLES_POTATO))
                .define('R', ItemRegistration.POTATO_ITEM_RARE.get())
                .define('G', Ingredient.of(ForgeTagsUD.VEGETABLES_GARLIC))
                .define('M', Ingredient.fromValues(Stream.of(new Ingredient.TagValue(CommonTags.Items.MILK),
                        new Ingredient.TagValue(ForgeTagsUD.CHEESE),new Ingredient.TagValue(ForgeTagsUD.CHEESES))))
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
                .requires(Ingredient.of(CommonTags.Items.VEGETABLES_CARROT), 2)
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
                .requires(Ingredient.fromValues(Stream.of(new Ingredient.TagValue(CommonTags.Items.BREAD),
                        new Ingredient.ItemValue(new ItemStack(ItemRegistration.CARROT_BREAD.get())))))
                .requires(ModItems.BEEF_PATTY.get())
                .requires(CommonTags.Items.SALAD_INGREDIENTS)
                .requires(CommonTags.Items.VEGETABLES_CARROT)
                .requires(CommonTags.Items.CROPS_ONION)
                .unlockedBy("has_beef_patty", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BEEF_PATTY.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.STRAWBERRY_SANDWICH.get())
                .requires(ItemRegistration.TRIANGLE_BREAD.get(),2)
                .requires(CommonTags.Items.MILK)
                .requires(ForgeTagsUD.CROPS_STRAWBERRY)
                .unlockedBy("has_triangular_bread", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.TRIANGLE_BREAD.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.VEGETABLE_SANDWICH.get())
                .requires(ItemRegistration.TRIANGLE_BREAD.get(),2)
                .requires(CommonTags.Items.SALAD_INGREDIENTS)
                .requires(Ingredient.fromValues(Stream.of(new Ingredient.ItemValue(new ItemStack(ItemRegistration.CUT_CARROT.get())),
                        new Ingredient.TagValue(CommonTags.Items.VEGETABLES_CARROT))))
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.RAW_STICK_CARROT.get())
                .requires(Items.STICK)
                .requires(CommonTags.Items.VEGETABLES_CARROT)
                .unlockedBy("has_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CARROT))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_DOUGH.get(),3)
                .requires(Ingredient.fromValues(Stream.of(new Ingredient.ItemValue(new ItemStack(Items.WATER_BUCKET)),
                        new Ingredient.TagValue(CommonTags.Items.EGGS))))
                .requires(Ingredient.of(CommonTags.Items.GRAIN_WHEAT),2)
                .requires(Ingredient.of(ItemRegistration.GRATED_CARROT.get()),2)
                .unlockedBy("has_grated_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GRATED_CARROT.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_BATTER.get(),3)
                .requires(CommonTags.Items.MILK)
                .requires(CommonTags.Items.EGGS)
                .requires(Ingredient.of(CommonTags.Items.GRAIN_WHEAT),2)
                .requires(Ingredient.of(ItemRegistration.GRATED_CARROT.get()),2)
                .requires(Ingredient.of(ForgeTagsUD.SUGAR),2)
                .unlockedBy("has_grated_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GRATED_CARROT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.CARROT_CAKE.get(), 1)
                .pattern(" C ")
                .pattern("MMM")
                .pattern("BBB")
                .define('C', ItemRegistration.CUT_CARROT.get())
                .define('B', ItemRegistration.CARROT_BATTER.get())
                .define('M', Ingredient.of(CommonTags.Items.MILK))
                .unlockedBy("has_carrot_batter", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_BATTER.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_CAKE.get())
                .requires(Ingredient.of(ItemRegistration.CARROT_CAKE_SLICE.get()),7)
                .unlockedBy("has_carrot_cake_slice", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_CAKE_SLICE.get()))
                .save(consumer,"umapyoidelight:carrot_cake_from_slice");

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.CARROT_PIE.get(), 1)
                .pattern("WWW")
                .pattern("CCC")
                .pattern("SPS")
                .define('W', Ingredient.of(CommonTags.Items.GRAIN_WHEAT))
                .define('C', CommonTags.Items.VEGETABLES_CARROT)
                .define('P', ModItems.PIE_CRUST.get())
                .define('S', Ingredient.of(ForgeTagsUD.SUGAR))
                .unlockedBy("has_pie_crust", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PIE_CRUST.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.CARROT_PIE.get(), 1)
                .pattern("CC ")
                .pattern("CC ")
                .pattern("   ")
                .define('C', ItemRegistration.CARROT_PIE_SLICE.get())
                .unlockedBy("has_pie_slice", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_PIE_SLICE.get()))
                .save(consumer,"umapyoidelight:carrot_pie_from_slice");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.YAKISOBA_PILE.get())
                .requires(Ingredient.fromValues(Stream.of(new Ingredient.ItemValue(new ItemStack(ItemRegistration.YAKISOBA.get())),
                        new Ingredient.ItemValue(new ItemStack(ItemRegistration.YAKISOBA_DECO.get())))),8)
                .unlockedBy("has_yakisoba", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.YAKISOBA.get(),8)
                .requires(Ingredient.of(ItemRegistration.YAKISOBA_PILE.get()),1)
                .unlockedBy("has_yakisoba_pile", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA_PILE.get()))
                .save(consumer,"umapyoidelight:yakisoba_from_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.YAKISOBA_DECO.get())
                .requires(ItemRegistration.YAKISOBA.get())
                .unlockedBy("has_yakisoba", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.YAKISOBA.get())
                .requires(ItemRegistration.YAKISOBA_DECO.get())
                .unlockedBy("has_yakisoba_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA_DECO.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.COFFEE_DECO.get())
                .requires(ItemRegistration.COFFEE.get())
                .unlockedBy("has_coffee", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COFFEE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.COFFEE.get())
                .requires(ItemRegistration.COFFEE_DECO.get())
                .unlockedBy("has_coffee_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COFFEE_DECO.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.CARROT_HAMBURG_DECO.get())
                .requires(ItemRegistration.CARROT_HAMBURG.get())
                .unlockedBy("has_carrot_hamburg", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_HAMBURG.get())
                .requires(ItemRegistration.CARROT_HAMBURG_DECO.get())
                .requires(Items.BOWL)
                .unlockedBy("has_carrot_hamburg_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DECO.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.CARROT_HAMBURG_DELUXE_DECO.get())
                .requires(ItemRegistration.CARROT_HAMBURG_DELUXE.get())
                .unlockedBy("has_carrot_hamburg_deluxe", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DELUXE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_HAMBURG_DELUXE.get())
                .requires(ItemRegistration.CARROT_HAMBURG_DELUXE_DECO.get())
                .requires(Items.BOWL)
                .unlockedBy("has_carrot_hamburg_deluxe_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DELUXE_DECO.get()))
                .save(consumer);
    }
}
