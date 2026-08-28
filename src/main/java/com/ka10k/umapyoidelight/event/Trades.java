package com.ka10k.umapyoidelight.event;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.ItemLike;
import net.tracen.umapyoi.item.ItemRegistry;
import net.tracen.umapyoi.villager.VillageRegistry;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.Configuration;

import java.util.function.Supplier;


public class Trades {

    public static VillagerTrades.ItemListing Item2Emerald(Supplier<? extends ItemLike> item, int count, int maxTrades, int xp, Supplier<Boolean> predicate) {
        return new UDItemListing(() -> new MerchantOffer(new ItemCost(item.get().asItem(), count), new ItemStack(Items.EMERALD, 1), maxTrades, xp, 0.05F), predicate);
    }

    public static VillagerTrades.ItemListing Item2Jewel(Supplier<? extends ItemLike> item, int count, int maxTrades, int xp, Supplier<Boolean> predicate) {
        return new UDItemListing(() -> new MerchantOffer(new ItemCost(item.get().asItem(), count), new ItemStack(ItemRegistry.JEWEL.get(), 1), maxTrades, xp, 0.05F), predicate);
    }

    public static VillagerTrades.ItemListing Emerald2Item(Supplier<? extends ItemLike> item, int maxTrades, int xp, Supplier<Boolean> predicate) {
        return new UDItemListing(() -> new MerchantOffer(new ItemCost(Items.EMERALD, 1), new ItemStack(item.get()), maxTrades, xp, 0.05F), predicate);
    }

    public static VillagerTrades.ItemListing Jewel2Item(Supplier<? extends ItemLike> item, int count, int maxTrades, int xp, Supplier<Boolean> predicate) {
        return new UDItemListing(() -> new MerchantOffer(new ItemCost(ItemRegistry.JEWEL.get(), 1), new ItemStack(item.get(), count), maxTrades, xp, 0.05F), predicate);
    }

    private record UDItemListing(
            Supplier<MerchantOffer> offer,
            Supplier<Boolean> predicate
    ) implements VillagerTrades.ItemListing {

        @Override
        public @Nullable MerchantOffer getOffer(
                Entity entity,
                RandomSource random
        ) {
            if (!predicate.get()) {
                return null;
            }

            return offer.get();
        }
    }


    public static Supplier<Boolean> enableFarmerTrades() {
        return () -> Umapyoidelight.CONFIG.FARMERS_TRADE_UD_CROPS && Configuration.ENABLE_FARMERS_BUY_FD_CROPS.get();
    }

    public static Supplier<Boolean> enableFarmerRareCropTrades() {
        return () -> enableFarmerTrades().get() && Umapyoidelight.CONFIG.FARMERS_TRADE_RARE_CROPS;
    }

    public static void register() {
        addVillagerTrades();
        addWanderingTraderTrades();
    }

    public static void addVillagerTrades() {

        //-----Farmer-----
        //Novice(Stone)
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, (trades) -> {
            trades.add(Item2Emerald(ItemRegistration.CHILI_ITEM, 26, 16, 2, enableFarmerTrades()));
            trades.add(Item2Emerald(ItemRegistration.GARLIC_ITEM, 26, 16, 2, enableFarmerTrades()));
            trades.add(Item2Emerald(ItemRegistration.STRAWBERRY_ITEM, 26, 16, 2, enableFarmerTrades()));
        });
        //Apprentice(Iron)
        //Journeyman(Gold)

        //Expert(Emerald)
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4, (trades) -> {
            trades.add(Item2Jewel(ItemRegistration.CHILI_ITEM_RARE, 2, 4, 15, enableFarmerRareCropTrades()));
            trades.add(Item2Jewel(ItemRegistration.GARLIC_ITEM_RARE, 2, 4, 15, enableFarmerRareCropTrades()));
            trades.add(Item2Jewel(ItemRegistration.STRAWBERRY_ITEM_RARE, 2, 4, 15, enableFarmerRareCropTrades()));
            trades.add(Item2Jewel(ItemRegistration.CARROT_ITEM_RARE, 2, 4, 15, enableFarmerRareCropTrades()));
            trades.add(Item2Jewel(ItemRegistration.POTATO_ITEM_RARE, 2, 4, 15, enableFarmerRareCropTrades()));
        });
        //Master(Diamond)

        //-----Butcher-----
        //Novice(Stone)
        //Apprentice(Iron)
        //Journeyman(Gold)

        //Expert(Emerald)
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4, (trades) -> {
            trades.add(Jewel2Item(ItemRegistration.CARROT_HAMBURG, 1, 2, 20, () -> Umapyoidelight.CONFIG.VILLAGERS_TRADE_OTHER_ITEMS));
        });

        //Master(Diamond)
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5, (trades) -> {
            trades.add(Jewel2Item(ItemRegistration.CARROT_HAMBURG_DELUXE, 1, 1, 30, () -> Umapyoidelight.CONFIG.VILLAGERS_TRADE_OTHER_ITEMS));
        });


        //-----Trainer-----
        //Novice(Stone)
        //Apprentice(Iron)
        //Journeyman(Gold)

        //Expert(Emerald)
        TradeOfferHelper.registerVillagerOffers(VillageRegistry.TRAINER.get(), 4, (trades) -> {
            trades.add(Jewel2Item(ItemRegistration.COFFEE, 8, 4, 20, () -> Umapyoidelight.CONFIG.TRAINERS_TRADE_ITEMS));
            trades.add(Jewel2Item(ItemRegistration.YAKISOBA, 4, 4, 20, () -> Umapyoidelight.CONFIG.TRAINERS_TRADE_ITEMS));
            trades.add(Jewel2Item(ItemRegistration.POTION, 1, 2, 20, () -> Umapyoidelight.CONFIG.TRAINERS_TRADE_ITEMS));
            trades.add(Jewel2Item(ItemRegistration.SAKURAMOCHI, 4, 4, 20, () -> Umapyoidelight.CONFIG.TRAINERS_TRADE_ITEMS));
        });
        //Master(Diamond)

    }

    public static void addWanderingTraderTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1, (trades) -> {
            trades.add(Emerald2Item(ItemRegistration.CHILI_ITEM, 1, 12, () -> Umapyoidelight.CONFIG.WANDERING_TRADER_TRADE_UD_CROPS));
            trades.add(Emerald2Item(ItemRegistration.GARLIC_ITEM, 1, 12, () -> Umapyoidelight.CONFIG.WANDERING_TRADER_TRADE_UD_CROPS));
            trades.add(Emerald2Item(ItemRegistration.STRAWBERRY_ITEM, 1, 12, () -> Umapyoidelight.CONFIG.WANDERING_TRADER_TRADE_UD_CROPS));
        });
    }
}
