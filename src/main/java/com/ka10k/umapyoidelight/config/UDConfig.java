package com.ka10k.umapyoidelight.config;

import com.ka10k.umapyoidelight.Umapyoidelight;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.tracen.umapyoi.config.helper.Category;
import net.tracen.umapyoi.config.helper.DoubleSlider;

import static com.ka10k.umapyoidelight.Umapyoidelight.MOD_ID;

public class UDConfig {
    public static ConfigClassHandler<UDConfig> HANDLER = ConfigClassHandler.createBuilder(UDConfig.class)
            .id(ResourceLocation.fromNamespaceAndPath(MOD_ID, "config"))
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(FabricLoader.getInstance().getConfigDir().resolve("umapyoidelight.json5"))
                    .setJson5(true)
                    .build())
            .build();

    public static Component percentFormatter(Double value) {
        return Component.literal(String.format("%.1f%%", (value * 100.0D)));
    }

    public static Screen create(Screen parent) {
        return HANDLER.generateGui().generateScreen(parent);
    }

    public static void load() {
        HANDLER.load();
        Umapyoidelight.CONFIG = HANDLER.instance();
    }

    public static UDConfig get() {
        return HANDLER.instance();
    }

    @Category("general")


    @SerialEntry
    public boolean GENERATE_UD_LOOT = true;

    @SerialEntry
    public boolean FARMERS_TRADE_UD_CROPS = true;

    @SerialEntry
    public boolean FARMERS_TRADE_RARE_CROPS = true;

    @SerialEntry
    public boolean VILLAGERS_TRADE_OTHER_ITEMS = true;

    @SerialEntry
    public boolean TRAINERS_TRADE_ITEMS = true;

    @SerialEntry
    public boolean WANDERING_TRADER_TRADE_UD_CROPS = true;


    @Category("foods")

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_POTAUFEU = 0.1;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_POTAUFEU_RARE = 0.2;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_RAMEN = 0.1;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_RAMEN_RARE = 0.2;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_PIZZASLICE = 0.04;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_PIZZASLICE_RARE = 0.08;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_MAPO = 0.1;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_MAPO_RARE = 0.2;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_ICECREAM = 0.2;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_ICECREAM_RARE = 0.35;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_G1_PLATE = 0.65;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_CARROT_BURGER = 0.075;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_CARROT_JUICE = 0.05;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_CARROT_PUDDING = 0.1;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_COFFEE = 0.5;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_SAKURAMOCHI = 0.5;

    @SerialEntry
    @DoubleSlider(min = 0.0, max = 1.0, step = 0.005, valueFormatter = "percentFormatter")
    public double AP_RECOVER_YAKISOBA = 0.5;

    /*
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
        AP_RECOVER_G1_PLATE = COMMON_BUILDER
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
    */
}