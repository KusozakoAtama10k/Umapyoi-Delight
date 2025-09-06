package com.ka10k.umapyoidelight;

import net.neoforged.neoforge.common.ModConfigSpec;

public class UDConfig {

    public static ModConfigSpec COMMON_CONFIG;

    public static ModConfigSpec.BooleanValue GENERATE_UD_LOOT;
    public static ModConfigSpec.BooleanValue FARMERS_TRADE_UD_CROPS;
    public static ModConfigSpec.BooleanValue FARMERS_TRADE_RARE_CROPS;
    public static ModConfigSpec.BooleanValue VILLAGERS_TRADE_OTHER_ITEMS;
    public static ModConfigSpec.BooleanValue TRAINERS_TRADE_ITEMS;
    public static ModConfigSpec.BooleanValue WANDERING_TRADER_TRADE_UD_CROPS;

    public static ModConfigSpec.DoubleValue AP_RECOVER_POTAUFEU;
    public static ModConfigSpec.DoubleValue AP_RECOVER_POTAUFEU_RARE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_RAMEN;
    public static ModConfigSpec.DoubleValue AP_RECOVER_RAMEN_RARE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_PIZZASLICE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_PIZZASLICE_RARE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_MAPO;
    public static ModConfigSpec.DoubleValue AP_RECOVER_MAPO_RARE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_ICECREAM;
    public static ModConfigSpec.DoubleValue AP_RECOVER_ICECREAM_RARE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_GI_PLATE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_CARROT_BURGER;
    public static ModConfigSpec.DoubleValue AP_RECOVER_COFFEE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_CARROT_JUICE;
    public static ModConfigSpec.DoubleValue AP_RECOVER_YAKISOBA;
    public static ModConfigSpec.DoubleValue AP_RECOVER_SAKURAMOCHI;
    public static ModConfigSpec.DoubleValue AP_RECOVER_CARROT_PUDDING;


    static{
        ModConfigSpec.Builder COMMON_BUILDER = new ModConfigSpec.Builder();
        COMMON_BUILDER.comment("General settings").push("general");
        GENERATE_UD_LOOT = COMMON_BUILDER
                .translation("config.umapyoidelight.generateudloot")
                .comment("Should this mod add some of its items as extra chest loot across Minecraft?")
                .define("generateUDLoot", true);
        FARMERS_TRADE_UD_CROPS = COMMON_BUILDER
                .translation("config.umapyoidelight.tradeudcrops")
                .comment("Should Farmers buy this mod's crops? (May reduce chances of other trades appearing)")
                .comment("If you disable vegetable trades in FD config, the trades will be disabled regardless of this field")
                .define("farmersTradeUDCrops", true);
        FARMERS_TRADE_RARE_CROPS = COMMON_BUILDER
                .translation("config.umapyoidelight.traderarecrops")
                .comment("Should Farmers buy this mod's rare crops? (May reduce chances of other trades appearing)")
                .comment("If you disable vegetable trades, the trades will be disabled regardless of this field")
                .define("farmersTradeRareCrops", true);
        VILLAGERS_TRADE_OTHER_ITEMS = COMMON_BUILDER
                .translation("config.umapyoidelight.tradeotheritems")
                .comment("Should Villagers trade some of this mod's items? (May reduce chances of other trades appearing)")
                .define("villagersTradeOtherItems", true);
        TRAINERS_TRADE_ITEMS = COMMON_BUILDER
                .translation("config.umapyoidelight.trainerstradeitems")
                .comment("Should Trainers trade some of this mod's items? (May reduce chances of other trades appearing)")
                .define("trainersTradeItems", true);
        WANDERING_TRADER_TRADE_UD_CROPS = COMMON_BUILDER
                .translation("config.umapyoidelight.wandererstradeudcrops")
                .comment("Should Farmers buy this mod's rare crops? (May reduce chances of other trades appearing)")
                .comment("If you disable vegetable trades, the trades will be disabled regardless of this field")
                .define("wanderersTradeUDCrops", true);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Foods").push("foods");
        AP_RECOVER_POTAUFEU = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_potaufeu")
                .comment("How much action points do meals recover?")
                .defineInRange("potaufeu",0.1,0.0,1.0);
        AP_RECOVER_POTAUFEU_RARE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_potaufeu_rare")
                .defineInRange("rarePotaufeu",0.2,0.0,1.0);
        AP_RECOVER_RAMEN = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_ramen")
                .defineInRange("ramen",0.1,0.0,1.0);
        AP_RECOVER_RAMEN_RARE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_ramen_rare")
                .defineInRange("rareRamen",0.2,0.0,1.0);
        AP_RECOVER_PIZZASLICE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_pizza_slice")
                .defineInRange("pizzaSlice",0.04,0.0,1.0);
        AP_RECOVER_PIZZASLICE_RARE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_pizza_slice_rare")
                .defineInRange("rarePizzaSlice",0.08,0.0,1.0);
        AP_RECOVER_MAPO = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_mapo")
                .defineInRange("mapo",0.1,0.0,1.0);
        AP_RECOVER_MAPO_RARE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_mapo_rare")
                .defineInRange("rareMapo",0.2,0.0,1.0);
        AP_RECOVER_ICECREAM = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_icecream")
                .defineInRange("iceCream",0.2,0.0,1.0);
        AP_RECOVER_ICECREAM_RARE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_icecream_rare")
                .defineInRange("rareIceCream",0.35,0.0,1.0);
        AP_RECOVER_GI_PLATE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_g1_plate")
                .defineInRange("GIPlate",0.65,0.0,1.0);

        AP_RECOVER_CARROT_BURGER = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_carrot_burger")
                .defineInRange("carrotBurger",0.075,0.0,1.0);
        AP_RECOVER_CARROT_JUICE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_carrot_juice")
                .defineInRange("carrotJuice",0.05,0.0,1.0);
        AP_RECOVER_CARROT_PUDDING = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_carrot_pudding")
                .defineInRange("carrotPudding",0.1,0.0,1.0);
        AP_RECOVER_COFFEE = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_coffee")
                .defineInRange("coffee",0.5,0.0,1.0);
        AP_RECOVER_SAKURAMOCHI = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_rice_cake")
                .defineInRange("sakuraMochi",0.5,0.0,1.0);
        AP_RECOVER_YAKISOBA = COMMON_BUILDER
                .translation("config.umapyoidelight.ap_recover_yakisoba")
                .defineInRange("yakisoba",0.3,0.0,1.0);

        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}