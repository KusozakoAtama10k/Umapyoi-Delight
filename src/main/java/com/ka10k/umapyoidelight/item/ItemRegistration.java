package com.ka10k.umapyoidelight.item;

import cn.mcmod_mmf.mmlib.item.ItemFoodBase;
import cn.mcmod_mmf.mmlib.item.ItemFoodSeeds;
import cn.mcmod_mmf.mmlib.item.info.FoodInfo;
import com.google.common.collect.Sets;
import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.block.BlockRegistration;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tracen.umapyoi.effect.MobEffectRegistry;
import net.tracen.umapyoi.item.food.UmaDrinkItem;
import net.tracen.umapyoi.item.food.UmaFoodItem;
import net.tracen.umapyoi.utils.UmaSoulUtils;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

import static com.ka10k.umapyoidelight.UDConfig.*;


public class ItemRegistration {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Umapyoidelight.MOD_ID);
    public static LinkedHashSet<DeferredItem<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static DeferredItem<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        DeferredItem<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static Item.Properties bowlFood() {
        return new Item.Properties().craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties bottleFood() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    public static Item.Properties bottleDrink() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    public static void APRecover(ItemStack soul, double ratio) {
        UmaSoulUtils.addActionPoint(soul, (int)((double)UmaSoulUtils.getMaxActionPoint(soul) * ratio));
    }

    //blocks
    public static final DeferredItem<Item> CHILI_CRATE = registerWithTab("chili_pepper_crate",
            () -> new BlockItem(BlockRegistration.CHILI_CRATE.get(),basicItem()));

    public static final DeferredItem<Item> CHILI_CRATE_RARE = registerWithTab("chili_pepper_crate_rare",
            () -> new BlockItem(BlockRegistration.CHILI_CRATE_RARE.get(),basicItem()));

    public static final DeferredItem<Item> GARLIC_CRATE = registerWithTab("garlic_crate",
            () -> new BlockItem(BlockRegistration.GARLIC_CRATE.get(),basicItem()));

    public static final DeferredItem<Item> GARLIC_CRATE_RARE = registerWithTab("garlic_crate_rare",
            () -> new BlockItem(BlockRegistration.GARLIC_CRATE_RARE.get(),basicItem()));

    public static final DeferredItem<Item> STRAWBERRY_CRATE = registerWithTab("strawberry_crate",
            () -> new BlockItem(BlockRegistration.STRAWBERRY_CRATE.get(),basicItem()));

    public static final DeferredItem<Item> STRAWBERRY_CRATE_RARE = registerWithTab("strawberry_crate_rare",
            () -> new BlockItem(BlockRegistration.STRAWBERRY_CRATE_RARE.get(),basicItem()));

    public static final DeferredItem<Item> CARROT_CRATE_RARE = registerWithTab("carrot_crate_rare",
            () -> new BlockItem(BlockRegistration.CARROT_CRATE_RARE.get(),basicItem()));

    public static final DeferredItem<Item> POTATO_CRATE_RARE = registerWithTab("potato_crate_rare",
            () -> new BlockItem(BlockRegistration.POTATO_CRATE_RARE.get(),basicItem()));

    public static final DeferredItem<Item> WOODCHIP_BLOCK = registerWithTab("woodchip_block",
            () -> new BlockItem(BlockRegistration.WOODCHIP_BLOCK.get(),basicItem()));
    
    public static final DeferredItem<Item> WOODCHIP_ROAD = registerWithTab("woodchip_road",
            () -> new BlockItem(BlockRegistration.WOODCHIP_ROAD.get(),basicItem()));

    public static final DeferredItem<Item> YAKISOBA_DECO = registerWithTab("gold_ship_yakisoba_deco",
            () -> new BlockItem(BlockRegistration.YAKISOBA_DECO.get(),basicItem()));

    public static final DeferredItem<Item> COFFEE_DECO = registerWithTab("manhattan_cafe_coffee_deco",
            () -> new BlockItem(BlockRegistration.COFFEE_DECO.get(),basicItem()));

    public static final DeferredItem<Item> CARROT_HAMBURG_DECO = registerWithTab("carrot_hamburg_deco",
            () -> new BlockItem(BlockRegistration.CARROT_HAMBURG_DECO.get(),basicItem().stacksTo(16)));

    public static final DeferredItem<Item> CARROT_HAMBURG_DELUXE_DECO = registerWithTab("carrot_hamburg_deluxe_deco",
            () -> new BlockItem(BlockRegistration.CARROT_HAMBURG_DELUXE_DECO.get(),basicItem().stacksTo(16)));
    
    public static final DeferredItem<Item> WILD_CHILIS = registerWithTab("wild_chili_peppers",
            () -> new BlockItem(BlockRegistration.WILD_CHILIS.get(),basicItem()));

    public static final DeferredItem<Item> WILD_GARLIC = registerWithTab("wild_garlic",
            () -> new BlockItem(BlockRegistration.WILD_GARLIC.get(),basicItem()));

    public static final DeferredItem<Item> WILD_STRAWBERRIES = registerWithTab("wild_strawberries",
            () -> new BlockItem(BlockRegistration.WILD_STRAWBERRIES.get(),basicItem()));

    //placeable meals
    public static final DeferredItem<Item> RAW_POTATO_GARLIC_PIZZA = registerWithTab("raw_potato_garlic_pizza",
            () -> new Item(basicItem().stacksTo(1)));

    public static final DeferredItem<Item> POTATO_GARLIC_PIZZA = registerWithTab("potato_garlic_pizza",
            () -> new BlockItem(BlockRegistration.POTATO_GARLIC_PIZZA.get(),basicItem().stacksTo(1)));

    public static final DeferredItem<Item> RAW_POTATO_GARLIC_PIZZA_RARE = registerWithTab("raw_potato_garlic_pizza_rare",
            () -> new Item(basicItem().stacksTo(1)));

    public static final DeferredItem<Item> POTATO_GARLIC_PIZZA_RARE = registerWithTab("potato_garlic_pizza_rare",
            () -> new BlockItem(BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get(),basicItem().stacksTo(1)));

    public static final DeferredItem<Item> CARROT_CAKE = registerWithTab("carrot_cake",
            () -> new BlockItem(BlockRegistration.CARROT_CAKE.get(),basicItem().stacksTo(1)));

    public static final DeferredItem<Item> CARROT_PIE = registerWithTab("carrot_pie",
            () -> new BlockItem(BlockRegistration.CARROT_PIE.get(),basicItem()));

    public static final DeferredItem<Item> YAKISOBA_PILE = registerWithTab("pile_of_yakisoba",
            () -> new BlockItem(BlockRegistration.YAKISOBA_PILE.get(),basicItem()));

    //crops
    /*
    public static final DeferredItem<Item> CHILI_ITEM =
            registerWithTab("chili_pepper", () -> new ItemFoodSeeds(BlockRegistration.CHILI_CROP.get(),basicItem(),FoodInfo.builder()
                    .amountAndCalories(2, 0.25F).build()));
    */

    public static final DeferredItem<Item> CHILI_ITEM =
            registerWithTab("chili_pepper", () -> new ItemNameBlockItem(BlockRegistration.CHILI_CROP.get(),
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).build())));

    public static final DeferredItem<Item> CHILI_ITEM_RARE =
            registerWithTab("chili_pepper_rare", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(4, 0.5F).build()));

    /*
    public static final DeferredItem<Item> GARLIC_ITEM =
            registerWithTab("garlic", () -> new ItemFoodSeeds(BlockRegistration.GARLIC_CROP.get(),basicItem(),FoodInfo.builder()
                    .amountAndCalories(2, 0.25F).build()));
    */

    public static final DeferredItem<Item> GARLIC_ITEM =
            registerWithTab("garlic", () -> new ItemNameBlockItem(BlockRegistration.GARLIC_CROP.get(),
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).build())));

    public static final DeferredItem<Item> GARLIC_ITEM_RARE =
            registerWithTab("garlic_rare", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(4, 0.5F).build()));

    /*
    public static final DeferredItem<Item> STRAWBERRY_ITEM =
            registerWithTab("strawberry", () -> new ItemFoodSeeds(BlockRegistration.STRAWBERRY_CROP.get(),basicItem(),FoodInfo.builder()
                    .amountAndCalories(2, 0.25F).build()));
     */

    public static final DeferredItem<Item> STRAWBERRY_ITEM =
            registerWithTab("strawberry", () -> new ItemNameBlockItem(BlockRegistration.STRAWBERRY_CROP.get(),
                    new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).build())));

    public static final DeferredItem<Item> STRAWBERRY_ITEM_RARE =
            registerWithTab("strawberry_rare", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(4, 0.5F).build()));

    public static final DeferredItem<Item> CARROT_ITEM_RARE =
            registerWithTab("carrot_rare", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(4, 0.5F).build()));

    public static final DeferredItem<Item> POTATO_ITEM_RARE =
            registerWithTab("potato_rare", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(4, 0.5F).build()));

    //ingredients
    public static final DeferredItem<Item> CHOICE_VEGETABLES =
            registerWithTab("choice_vegetables", () -> new Item(basicItem()));

    //meals

    public static final DeferredItem<Item> CUT_CARROT =
            registerWithTab("cut_carrot", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(1, 0.6F)
                    .build()));

    public static final DeferredItem<Item> GRATED_CARROT =
            registerWithTab("grated_carrot", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(1, 0.3F)
                    .build()));

    public static final DeferredItem<Item> CARROT_BATTER =
            registerWithTab("carrot_batter", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(2, 0.3F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F)
                    .build()));

    public static final DeferredItem<Item> CARROT_DOUGH =
            registerWithTab("carrot_dough", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(2, 0.3F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F)
                    .build()));

    public static final DeferredItem<Item> CARROT_BREAD =
            registerWithTab("carrot_bread", () -> new UmaFoodItem(status -> {},
                    FoodInfo.builder().amountAndCalories(4, 0.6F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.SATURATION, 2, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_CAKE_SLICE =
            registerWithTab("carrot_cake_slice", () -> new UmaFoodItem(status -> {},
                    FoodInfo.builder().amountAndCalories(3, 0.3F).eatTime(16)
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.BRIEF_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_PIE_SLICE =
            registerWithTab("carrot_pie_slice", () -> new ItemFoodBase(basicItem(),
                    FoodInfo.builder().amountAndCalories(3, 0.3F).eatTime(16)
                            .addEffect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1.0F)
                            .build()));

    public static final DeferredItem<Item> RAW_STICK_CARROT =
            registerWithTab("raw_stick_carrot", () -> new StickUmaFood(status -> {}, FoodInfo.builder()
                    .amountAndCalories(3, 0.6F)
                    .build()));

    public static final DeferredItem<Item> GRILLED_STICK_CARROT =
            registerWithTab("grilled_stick_carrot", () -> new StickUmaFood(status -> {},
                    FoodInfo.builder().amountAndCalories(4, 0.75F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CHOCOLATE_STICK_CARROT =
            registerWithTab("chocolate_stick_carrot", () -> new StickUmaFood(status -> {},
                    FoodInfo.builder().amountAndCalories(5, 0.6F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.MEDIUM_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_BURGER =
            registerWithTab("carrot_burger", () -> new UmaFoodItem(status -> {
                APRecover(status, AP_RECOVER_CARROT_BURGER.get());},
                    FoodInfo.builder().amountAndCalories(11, 0.8F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_JUICE =
            registerWithTab("carrot_juice", () -> new BottleUmaDrink(status -> {
                APRecover(status, AP_RECOVER_CARROT_JUICE.get());},
                    FoodInfo.builder().alwaysEat()
                            .addEffect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_PUDDING =
            registerWithTab("carrot_pudding", () -> new BottleUmaFood(status -> {
                APRecover(status, AP_RECOVER_CARROT_PUDDING.get());},
                    FoodInfo.builder().amountAndCalories(7, 0.4F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(MobEffects.LUCK, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> RAW_HAMBURG =
            registerWithTab("raw_hamburg", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(3, 0.3F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.HUNGER, FoodValues.BRIEF_DURATION, 0), 0.3F)
                    .build()));

    public static final DeferredItem<Item> HAMBURG =
            registerWithTab("hamburg", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(7, 0.8F)
                    .build()));

    public static final DeferredItem<Item> WHITE_BREAD =
            registerWithTab("white_bread", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(4, 0.6F).build()));

    public static final DeferredItem<Item> TOAST =
            registerWithTab("toast", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(6, 0.55F).build()));

    public static final DeferredItem<Item> TOAST_STRAWBERRY_JAM =
            registerWithTab("toast_strawberry_jam", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(7, 0.75F)
                    .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.MEDIUM_DURATION, 0), 1.0F)
                    .build()));

    public static final DeferredItem<Item> STRAWBERRY_JAM =
            registerWithTab("strawberry_jam", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(3, 0.3F).build()));

    public static final DeferredItem<Item> TRIANGLE_BREAD =
            registerWithTab("triangular_bread", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(2, 0.55F).build()));

    public static final DeferredItem<Item> BREAD_CRUST =
            registerWithTab("bread_crust", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(1, 0.5F).eatTime(16).build()));

    public static final DeferredItem<Item> CARROT_HAMBURG =
            registerWithTab("carrot_hamburg", () -> new BowlUmaFood(status -> {},
                    FoodInfo.builder().amountAndCalories(10, 0.4F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.MEDIUM_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_HAMBURG_DELUXE =
            registerWithTab("carrot_hamburg_deluxe", () -> new BowlUmaFood(status -> {},
                    FoodInfo.builder().amountAndCalories(18, 0.5F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> VEGETABLE_SANDWICH =
            registerWithTab("vegetable_sandwich", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(7, 0.75F)
                    .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.MEDIUM_DURATION, 0), 1.0F)
                    .build()));

    public static final DeferredItem<Item> STRAWBERRY_SANDWICH =
            registerWithTab("strawberry_sandwich", () -> new ItemFoodBase(basicItem(),FoodInfo.builder()
                    .amountAndCalories(7, 0.75F)
                    .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.MEDIUM_DURATION, 0), 1.0F)
                    .build()));

    public static final DeferredItem<Item> CARROT_POTATO_POTAUFEU =
            registerWithTab("carrot_potato_potaufeu", () -> new BowlUmaFood(status -> {
                APRecover(status, AP_RECOVER_POTAUFEU.get());},
                    FoodInfo.builder().amountAndCalories(9, 0.6F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_POTATO_POTAUFEU_RARE =
            registerWithTab("carrot_potato_potaufeu_rare", () -> new BowlUmaFood(status -> {
                APRecover(status, AP_RECOVER_POTAUFEU_RARE.get());},
                    FoodInfo.builder().amountAndCalories(17, 0.65F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, FoodValues.LONG_DURATION, 3), 1.0F)
                            .build()));

    public static final DeferredItem<Item> GARLIC_RAMEN =
            registerWithTab("garlic_ramen", () -> new BowlUmaFoodNoodle(status -> {
                APRecover(status, AP_RECOVER_RAMEN.get());},
                    FoodInfo.builder().amountAndCalories(9, 0.6F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.ABSORPTION, FoodValues.SHORT_DURATION, 1), 1.0F)
                            .build()));

    public static final DeferredItem<Item> GARLIC_RAMEN_RARE =
            registerWithTab("garlic_ramen_rare", () -> new BowlUmaFoodNoodle(status -> {
                APRecover(status, AP_RECOVER_RAMEN_RARE.get());},
                    FoodInfo.builder().amountAndCalories(17, 0.65F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, FoodValues.LONG_DURATION, 1), 1.0F)
                            .build()));

    public static final DeferredItem<Item> POTATO_GARLIC_PIZZA_SLICE =
            registerWithTab("potato_garlic_pizza_slice", () -> new UmaFoodItem(status -> {
                APRecover(status, AP_RECOVER_PIZZASLICE.get());},
                    FoodInfo.builder().amountAndCalories(2, 0.6F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 200, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> POTATO_GARLIC_PIZZA_SLICE_RARE =
            registerWithTab("potato_garlic_pizza_slice_rare", () -> new UmaFoodItem(status -> {
                APRecover(status, AP_RECOVER_PIZZASLICE_RARE.get());},
                    FoodInfo.builder().amountAndCalories(4, 0.65F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 1500, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 2), 1.0F)
                            .build()));

    public static final DeferredItem<Item> MAPO_CARROT_POTATO =
            registerWithTab("mapo_carrot_potato", () -> new BowlUmaFood(status -> {
                APRecover(status, AP_RECOVER_MAPO.get());},
                    FoodInfo.builder().amountAndCalories(8, 0.6F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> MAPO_CARROT_POTATO_RARE =
            registerWithTab("mapo_carrot_potato_rare", () -> new BowlUmaFood(status -> {
                APRecover(status, AP_RECOVER_MAPO_RARE.get());},
                    FoodInfo.builder().amountAndCalories(16, 0.65F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, FoodValues.LONG_DURATION, 1), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_STRAWBERRY_ICECREAM =
            registerWithTab("carrot_strawberry_icecream", () -> new UmaFoodItem(status -> {
                APRecover(status, AP_RECOVER_ICECREAM.get());},
                    FoodInfo.builder().amountAndCalories(6, 0.25F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> CARROT_STRAWBERRY_ICECREAM_RARE =
            registerWithTab("carrot_strawberry_icecream_rare", () -> new UmaFoodItem(status -> {
                APRecover(status, AP_RECOVER_ICECREAM_RARE.get());},
                    FoodInfo.builder().amountAndCalories(10, 0.35F).alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0F)
                            .build()));

    public static final DeferredItem<Item> GI_PLATE =
            registerWithTab("g1_plate", () -> new BowlUmaFood(status -> {
                APRecover(status, AP_RECOVER_GI_PLATE.get());},
                    FoodInfo.builder().amountAndCalories(50, 0.5F).alwaysEat()
                            .eatTime(120)
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, FoodValues.LONG_DURATION, 4), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, FoodValues.LONG_DURATION, 2), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, FoodValues.LONG_DURATION, 3), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, FoodValues.LONG_DURATION, 2), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.LUCK, FoodValues.LONG_DURATION, 1), 1.0F)
                            .build()));


    //misc
    public static final DeferredItem<Item> COFFEE =
            registerWithTab("manhattan_cafe_coffee", () -> new UmaDrinkItem(status -> {
                APRecover(status, AP_RECOVER_COFFEE.get());},
                    FoodInfo.builder().alwaysEat()
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, FoodValues.LONG_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> SAKURAMOCHI =
            registerWithTab("victory_club_rice_cake", () -> new UmaFoodItem(status -> {
                APRecover(status, AP_RECOVER_SAKURAMOCHI.get());},
                    FoodInfo.builder().alwaysEat()
                            .amountAndCalories(6, 1.4F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.REGENERATION, FoodValues.LONG_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> YAKISOBA =
            registerWithTab("gold_ship_yakisoba", () -> new UmaDrinkItem(status -> {
                APRecover(status, AP_RECOVER_YAKISOBA.get());},
                    FoodInfo.builder().alwaysEat()
                            .amountAndCalories(12, 0.75F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)
                            .addEffect(() -> new MobEffectInstance(MobEffects.JUMP, FoodValues.LONG_DURATION, 0), 1.0F)
                            .build()));

    public static final DeferredItem<Item> POTION =
            registerWithTab("agnes_tachyon_potion", () -> new EnchantedItemDrinkBase(basicItem(),FoodInfo.builder()
                    .addEffect(() -> new MobEffectInstance(MobEffects.GLOWING, FoodValues.LONG_DURATION, 0), 1.0F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, FoodValues.LONG_DURATION, 4), 0.5F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.JUMP, FoodValues.LONG_DURATION, 4), 0.5F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.ABSORPTION, FoodValues.LONG_DURATION, 4), 0.25F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.SATURATION, FoodValues.LONG_DURATION, 4), 0.1F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.HEAL, FoodValues.LONG_DURATION, 4), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, FoodValues.LONG_DURATION, 4), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, FoodValues.LONG_DURATION, 0), 0.35F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.LEVITATION, FoodValues.BRIEF_DURATION, 0), 0.1F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.HUNGER, FoodValues.LONG_DURATION, 1), 0.1F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.POISON, FoodValues.LONG_DURATION, 1), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.CONFUSION, FoodValues.BRIEF_DURATION, 0), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, FoodValues.LONG_DURATION, 3), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffectRegistry.PANICKING, FoodValues.LONG_DURATION, 0), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffectRegistry.NIGHT_OWL, FoodValues.LONG_DURATION, 0), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffectRegistry.SLOW_METABOLISM, FoodValues.LONG_DURATION, 0), 0.05F)
                    .addEffect(() -> new MobEffectInstance(MobEffectRegistry.MOOD_BONUS, FoodValues.LONG_DURATION, 9), 0.05F)


                    .build()));
}
