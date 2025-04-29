package com.ka10k.umapyoidelight;

import net.minecraftforge.common.ForgeConfigSpec;

public class UDConfig {

    public static ForgeConfigSpec COMMON_CONFIG;

    public static ForgeConfigSpec.BooleanValue GENERATE_UD_LOOT;
    public static ForgeConfigSpec.BooleanValue FARMERS_TRADE_UD_CROPS;
    public static ForgeConfigSpec.BooleanValue FARMERS_TRADE_RARE_CROPS;
    public static ForgeConfigSpec.BooleanValue VILLAGERS_TRADE_OTHER_ITEMS;
    public static ForgeConfigSpec.BooleanValue TRAINERS_TRADE_ITEMS;
    public static ForgeConfigSpec.BooleanValue WANDERING_TRADER_TRADE_UD_CROPS;

    static{
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
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
        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}