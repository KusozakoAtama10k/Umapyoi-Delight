//package com.ka10k.umapyoidelight.datagen.recipe;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.ka10k.umapyoidelight.item.ItemRegistration;
//import com.ka10k.umapyoidelight.tag.CommonTagsUD;
//import com.mojang.serialization.JsonOps;
//import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
//import net.minecraft.advancements.critereon.InventoryChangeTrigger;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.data.recipes.*;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.tags.ItemTags;
//import net.minecraft.tags.TagKey;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.level.ItemLike;
//import vectorwing.farmersdelight.common.registry.ModItems;
//import vectorwing.farmersdelight.common.tag.CommonTags;
//
//public class CraftingRecipesProv {
//
//    public static Ingredient fromValues(Object... values) {
//        JsonArray array = new JsonArray();
//        for (Object value : values) {
//            JsonObject entry = new JsonObject();
//
//            if (value instanceof ItemLike item) {
//                ResourceLocation id = BuiltInRegistries.ITEM.getKey(item.asItem());
//                entry.addProperty("item", id.toString());
//
//            } else if (value instanceof TagKey<?> tag && tag.registry().equals(Registries.ITEM)) {
//                entry.addProperty("tag", tag.location().toString());
//
//            } else {
//                throw new IllegalArgumentException("Unsupported ingredient value: " + value);
//            }
//
//            array.add(entry);
//        }
//
//        return Ingredient.CODEC.parse(JsonOps.INSTANCE, array).getOrThrow(error ->
//                        new IllegalStateException("Failed to create ingredient: " + error)
//        );
//    }
//
//
//    public static void register(RecipeOutput output) {
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.CHILI_CRATE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("##I")
//                .define('#', Ingredient.of(CommonTagsUD.CROPS_CHILI))
//                .define('I', ItemRegistration.CHILI_ITEM.get())
//                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.GARLIC_CRATE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("##I")
//                .define('#', Ingredient.of(CommonTagsUD.CROPS_GARLIC))
//                .define('I', ItemRegistration.GARLIC_ITEM.get())
//                .unlockedBy("has_garlic", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.STRAWBERRY_CRATE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("##I")
//                .define('#', Ingredient.of(CommonTagsUD.CROPS_STRAWBERRY))
//                .define('I', ItemRegistration.STRAWBERRY_ITEM.get())
//                .unlockedBy("has_strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.CHILI_CRATE_RARE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', ItemRegistration.CHILI_ITEM_RARE.get())
//                .unlockedBy("has_chili_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM_RARE.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.GARLIC_CRATE_RARE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', ItemRegistration.GARLIC_ITEM_RARE.get())
//                .unlockedBy("has_garlic_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM_RARE.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.STRAWBERRY_CRATE_RARE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', ItemRegistration.STRAWBERRY_ITEM_RARE.get())
//                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.CARROT_CRATE_RARE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', ItemRegistration.CARROT_ITEM_RARE.get())
//                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistration.POTATO_CRATE_RARE.get(), 1)
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', ItemRegistration.POTATO_ITEM_RARE.get())
//                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CHILI_ITEM.get(), 9)
//                .requires(ItemRegistration.CHILI_CRATE.get())
//                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.GARLIC_ITEM.get(), 9)
//                .requires(ItemRegistration.GARLIC_CRATE.get())
//                .unlockedBy("has_garlic", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.STRAWBERRY_ITEM.get(), 9)
//                .requires(ItemRegistration.STRAWBERRY_CRATE.get())
//                .unlockedBy("has_strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CHILI_ITEM_RARE.get(), 9)
//                .requires(ItemRegistration.CHILI_CRATE_RARE.get())
//                .unlockedBy("has_chili_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM_RARE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.GARLIC_ITEM_RARE.get(), 9)
//                .requires(ItemRegistration.GARLIC_CRATE_RARE.get())
//                .unlockedBy("has_garlic_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM_RARE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_ITEM_RARE.get(), 9)
//                .requires(ItemRegistration.CARROT_CRATE_RARE.get())
//                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.POTATO_ITEM_RARE.get(), 9)
//                .requires(ItemRegistration.POTATO_CRATE_RARE.get())
//                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.STRAWBERRY_ITEM_RARE.get(), 9)
//                .requires(ItemRegistration.STRAWBERRY_CRATE_RARE.get())
//                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
//                .save(output);
//
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.RAW_HAMBURG.get(), 3)
//                .requires(Ingredient.of(CommonTags.Items.CROPS_ONION))
//                .requires(Ingredient.of(CommonTags.Items.FOODS_RAW_BEEF),2)
//                .requires(Ingredient.of(CommonTags.Items.FOODS_RAW_PORK))
//                .requires(Ingredient.of(ConventionalItemTags.WHEAT_CROPS))
//                .unlockedBy("has_raw_beef", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BEEF))
//                .unlockedBy("has_raw_porkchop", InventoryChangeTrigger.TriggerInstance.hasItems(Items.PORKCHOP))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_STRAWBERRY_ICECREAM.get(), 1)
//                .requires(Ingredient.of(CommonTagsUD.CROPS_STRAWBERRY))
//                .requires(Ingredient.of(CommonTagsUD.CROPS_STRAWBERRY))
//                .requires(fromValues(ItemRegistration.GRATED_CARROT.get(), ConventionalItemTags.CARROT_CROPS))
//                .requires(Ingredient.of(ConventionalItemTags.MILK_DRINKS))
//                .requires(Ingredient.of(ConventionalItemTags.WHEAT_CROPS))
//                .requires(Items.SNOWBALL)
//                .unlockedBy("has_strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get(), 1)
//                .requires(Ingredient.of(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
//                .requires(Ingredient.of(CommonTagsUD.CROPS_STRAWBERRY))
//                .requires(fromValues(ItemRegistration.GRATED_CARROT.get(), ConventionalItemTags.CARROT_CROPS))
//                .requires(Ingredient.of(ConventionalItemTags.MILK_DRINKS))
//                .requires(Ingredient.of(ConventionalItemTags.CARROT_CROPS))
//                .requires(Items.SNOWBALL)
//                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CHOICE_VEGETABLES.get(), 1)
//                .requires(ItemRegistration.CARROT_ITEM_RARE.get())
//                .requires(ItemRegistration.GARLIC_ITEM_RARE.get())
//                .requires(ItemRegistration.POTATO_ITEM_RARE.get())
//                .requires(ItemRegistration.CHILI_ITEM_RARE.get())
//                .requires(ItemRegistration.STRAWBERRY_ITEM_RARE.get())
//                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
//                .unlockedBy("has_garlic_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM_RARE.get()))
//                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
//                .unlockedBy("has_chili_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM_RARE.get()))
//                .unlockedBy("has_strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.RAW_POTATO_GARLIC_PIZZA.get(), 1)
//                .pattern(" M ")
//                .pattern("PGP")
//                .pattern("DBD")
//                .define('D', Ingredient.of(CommonTags.Items.FOODS_DOUGH))
//                .define('B', Items.BOWL)
//                .define('P', Ingredient.of(ConventionalItemTags.POTATO_CROPS))
//                .define('G', Ingredient.of(CommonTagsUD.CROPS_GARLIC))
//                .define('M', fromValues(ConventionalItemTags.MILK_DRINKS, CommonTagsUD.CHEESES))
//                .unlockedBy("has_potato", InventoryChangeTrigger.TriggerInstance.hasItems(Items.POTATO))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.RAW_POTATO_GARLIC_PIZZA_RARE.get(), 1)
//                .pattern(" M ")
//                .pattern("RGP")
//                .pattern("DBD")
//                .define('D', Ingredient.of(CommonTags.Items.FOODS_DOUGH))
//                .define('B', Items.BOWL)
//                .define('P', Ingredient.of(ConventionalItemTags.POTATO_CROPS))
//                .define('R', ItemRegistration.POTATO_ITEM_RARE.get())
//                .define('G', Ingredient.of(CommonTagsUD.CROPS_GARLIC))
//                .define('M', fromValues(ConventionalItemTags.MILK_DRINKS,CommonTagsUD.CHEESES))
//                .unlockedBy("has_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.POTATO_GARLIC_PIZZA.get(), 1)
//                .requires(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE.get(), 6)
//                .requires(Items.BOWL)
//                .unlockedBy("has_pizza_slice", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE.get()))
//                .save(output,"umapyoidelight:potato_garlic_pizza_from_slice");
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.POTATO_GARLIC_PIZZA_RARE.get(), 1)
//                .requires(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get(), 6)
//                .requires(Items.BOWL)
//                .unlockedBy("has_pizza_slice_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get()))
//                .save(output,"umapyoidelight:potato_garlic_pizza_rare_from_slice");
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_JUICE.get(), 1)
//                .requires(Ingredient.of(ConventionalItemTags.CARROT_CROPS), 2)
//                .requires(Ingredient.of(Items.GLASS_BOTTLE))
//                .unlockedBy("has_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CARROT))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_JUICE.get(), 4)
//                .requires(Ingredient.of(ItemRegistration.CARROT_ITEM_RARE.get()))
//                .requires(Ingredient.of(Items.GLASS_BOTTLE),4)
//                .unlockedBy("has_carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
//                .save(output, "umapyoidelight:carrot_juice_rare_carrot");
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.TOAST_STRAWBERRY_JAM.get(), 1)
//                .requires(Ingredient.of(ItemRegistration.TOAST.get()))
//                .requires(Ingredient.of(ItemRegistration.STRAWBERRY_JAM.get()))
//                .unlockedBy("has_strawberry_jam", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_JAM.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_BURGER.get())
//                .requires(fromValues(ConventionalItemTags.BREAD_FOODS, ItemRegistration.CARROT_BREAD.get()))
//                .requires(ModItems.BEEF_PATTY.get())
//                .requires(CommonTags.Items.FOODS_LEAFY_GREEN)
//                .requires(ConventionalItemTags.CARROT_CROPS)
//                .requires(CommonTags.Items.CROPS_ONION)
//                .unlockedBy("has_beef_patty", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BEEF_PATTY.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.STRAWBERRY_SANDWICH.get())
//                .requires(ItemRegistration.TRIANGLE_BREAD.get(),2)
//                .requires(ConventionalItemTags.MILK_DRINKS)
//                .requires(CommonTagsUD.CROPS_STRAWBERRY)
//                .unlockedBy("has_triangular_bread", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.TRIANGLE_BREAD.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.VEGETABLE_SANDWICH.get())
//                .requires(ItemRegistration.TRIANGLE_BREAD.get(),2)
//                .requires(CommonTags.Items.FOODS_LEAFY_GREEN)
//                .requires(fromValues(ItemRegistration.CUT_CARROT.get(), ConventionalItemTags.CARROT_CROPS))
//                .unlockedBy("has_triangular_bread", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.TRIANGLE_BREAD.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.WOODCHIP_BLOCK.get(),4)
//                .requires(ModItems.TREE_BARK.get(),3)
//                .requires(ItemTags.DIRT)
//                .unlockedBy("has_tree_bark", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TREE_BARK.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.WOODCHIP_ROAD.get(),8)
//                .requires(ItemRegistration.WOODCHIP_BLOCK.get())
//                .unlockedBy("has_woodchip_block", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.WOODCHIP_BLOCK.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.WOODCHIP_BLOCK.get())
//                .requires(ItemRegistration.WOODCHIP_ROAD.get(),8)
//                .unlockedBy("has_woodchip_road", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.WOODCHIP_ROAD.get()))
//                .save(output, "umapyoidelight:woodchip_block_from_road");
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.RAW_STICK_CARROT.get())
//                .requires(Items.STICK)
//                .requires(ConventionalItemTags.CARROT_CROPS)
//                .unlockedBy("has_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CARROT))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_DOUGH.get(),3)
//                .requires(fromValues(Items.WATER_BUCKET, ConventionalItemTags.EGGS))
//                .requires(Ingredient.of(ConventionalItemTags.WHEAT_CROPS),2)
//                .requires(Ingredient.of(ItemRegistration.GRATED_CARROT.get()),2)
//                .unlockedBy("has_grated_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GRATED_CARROT.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_BATTER.get(),3)
//                .requires(ConventionalItemTags.MILK_DRINKS)
//                .requires(ConventionalItemTags.WHEAT_CROPS)
//                .requires(Ingredient.of(ConventionalItemTags.WHEAT_CROPS),2)
//                .requires(Ingredient.of(ItemRegistration.GRATED_CARROT.get()),2)
//                .requires(Ingredient.of(CommonTagsUD.SUGAR),2)
//                .unlockedBy("has_grated_carrot", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GRATED_CARROT.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.CARROT_CAKE.get(), 1)
//                .pattern(" C ")
//                .pattern("MMM")
//                .pattern("BBB")
//                .define('C', ItemRegistration.CUT_CARROT.get())
//                .define('B', ItemRegistration.CARROT_BATTER.get())
//                .define('M', Ingredient.of(ConventionalItemTags.MILK_DRINKS))
//                .unlockedBy("has_carrot_batter", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_BATTER.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_CAKE.get())
//                .requires(Ingredient.of(ItemRegistration.CARROT_CAKE_SLICE.get()),7)
//                .unlockedBy("has_carrot_cake_slice", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_CAKE_SLICE.get()))
//                .save(output,"umapyoidelight:carrot_cake_from_slice");
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.CARROT_PIE.get(), 1)
//                .pattern("WWW")
//                .pattern("CCC")
//                .pattern("SPS")
//                .define('W', Ingredient.of(ConventionalItemTags.WHEAT_CROPS))
//                .define('C', ConventionalItemTags.CARROT_CROPS)
//                .define('P', ModItems.PIE_CRUST.get())
//                .define('S', Ingredient.of(CommonTagsUD.SUGAR))
//                .unlockedBy("has_pie_crust", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.PIE_CRUST.get()))
//                .save(output);
//
//        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ItemRegistration.CARROT_PIE.get(), 1)
//                .pattern("CC ")
//                .pattern("CC ")
//                .pattern("   ")
//                .define('C', ItemRegistration.CARROT_PIE_SLICE.get())
//                .unlockedBy("has_pie_slice", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_PIE_SLICE.get()))
//                .save(output,"umapyoidelight:carrot_pie_from_slice");
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.YAKISOBA_PILE.get())
//                .requires(fromValues(ItemRegistration.YAKISOBA.get(),ItemRegistration.YAKISOBA_DECO.get()),8)
//                .unlockedBy("has_yakisoba", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.YAKISOBA.get(),8)
//                .requires(Ingredient.of(ItemRegistration.YAKISOBA_PILE.get()),1)
//                .unlockedBy("has_yakisoba_pile", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA_PILE.get()))
//                .save(output,"umapyoidelight:yakisoba_from_block");
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.YAKISOBA_DECO.get())
//                .requires(ItemRegistration.YAKISOBA.get())
//                .unlockedBy("has_yakisoba", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.YAKISOBA.get())
//                .requires(ItemRegistration.YAKISOBA_DECO.get())
//                .unlockedBy("has_yakisoba_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA_DECO.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.COFFEE_DECO.get())
//                .requires(ItemRegistration.COFFEE.get())
//                .unlockedBy("has_coffee", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COFFEE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.COFFEE.get())
//                .requires(ItemRegistration.COFFEE_DECO.get())
//                .unlockedBy("has_coffee_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COFFEE_DECO.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.CARROT_HAMBURG_DECO.get())
//                .requires(ItemRegistration.CARROT_HAMBURG.get())
//                .unlockedBy("has_carrot_hamburg", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_HAMBURG.get())
//                .requires(ItemRegistration.CARROT_HAMBURG_DECO.get())
//                .requires(Items.BOWL)
//                .unlockedBy("has_carrot_hamburg_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DECO.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemRegistration.CARROT_HAMBURG_DELUXE_DECO.get())
//                .requires(ItemRegistration.CARROT_HAMBURG_DELUXE.get())
//                .unlockedBy("has_carrot_hamburg_deluxe", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DELUXE.get()))
//                .save(output);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ItemRegistration.CARROT_HAMBURG_DELUXE.get())
//                .requires(ItemRegistration.CARROT_HAMBURG_DELUXE_DECO.get())
//                .requires(Items.BOWL)
//                .unlockedBy("has_carrot_hamburg_deluxe_deco", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DELUXE_DECO.get()))
//                .save(output);
//    }
//}
