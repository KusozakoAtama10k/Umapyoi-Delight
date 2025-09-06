package com.ka10k.umapyoidelight.event;

import com.ka10k.umapyoidelight.UDConfig;
import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.tracen.umapyoi.item.ItemRegistry;
import net.tracen.umapyoi.villager.VillageRegistry;
import vectorwing.farmersdelight.common.Configuration;

import java.util.List;



@EventBusSubscriber(modid = Umapyoidelight.MOD_ID)
public class Trades {

    public static BasicItemListing Item2Emerald(ItemLike item, int count, int maxTrades, int xp) {
        return new BasicItemListing(new ItemStack(item, count), new ItemStack(Items.EMERALD), maxTrades, xp, 0.05F);
    }

    public static BasicItemListing Item2Jewel(ItemLike item, int count, int maxTrades, int xp) {
        return new BasicItemListing(new ItemStack(item, count), new ItemStack(ItemRegistry.JEWEL.get()), maxTrades, xp, 0.05F);
    }

    public static BasicItemListing Emerald2Item(ItemLike item, int maxTrades, int xp) {
        return new BasicItemListing(1, new ItemStack(item), maxTrades, xp, 0.05F);
    }

    public static BasicItemListing Jewel2Item(ItemLike item, int count, int maxTrades, int xp) {
        return new BasicItemListing(new ItemStack(ItemRegistry.JEWEL.get()), new ItemStack(item, count), maxTrades, xp, 0.05F);
    }

    @SubscribeEvent
    public static void addVillagerTrades(VillagerTradesEvent event) {

        if(event.getType() == VillagerProfession.FARMER) {
            if(!UDConfig.FARMERS_TRADE_UD_CROPS.get() || !Configuration.FARMERS_BUY_FD_CROPS.get()) return;
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            //Novice(Stone)
            trades.get(1).add(Item2Emerald(ItemRegistration.CHILI_ITEM.get(),26,16,2));
            trades.get(1).add(Item2Emerald(ItemRegistration.GARLIC_ITEM.get(),26,16,2));
            trades.get(1).add(Item2Emerald(ItemRegistration.STRAWBERRY_ITEM.get(),26,16,2));
            //Apprentice(Iron)
            //Journeyman(Gold)
            //Expert(Emerald)
            if(UDConfig.FARMERS_TRADE_RARE_CROPS.get()) {
                trades.get(4).add(Item2Jewel(ItemRegistration.CHILI_ITEM_RARE.get(), 2, 4, 15));
                trades.get(4).add(Item2Jewel(ItemRegistration.GARLIC_ITEM_RARE.get(), 2, 4, 15));
                trades.get(4).add(Item2Jewel(ItemRegistration.STRAWBERRY_ITEM_RARE.get(), 2, 4, 15));
                trades.get(4).add(Item2Jewel(ItemRegistration.CARROT_ITEM_RARE.get(), 2, 4, 15));
                trades.get(4).add(Item2Jewel(ItemRegistration.POTATO_ITEM_RARE.get(), 2, 4, 15));
            }
            //Master(Diamond)

        }

        if(event.getType() == VillagerProfession.BUTCHER) {
            if(!UDConfig.VILLAGERS_TRADE_OTHER_ITEMS.get()) return;
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            //Novice(Stone)
            //Apprentice(Iron)
            //Journeyman(Gold)
            //Expert(Emerald)
            trades.get(4).add(Jewel2Item(ItemRegistration.CARROT_HAMBURG.get(), 1, 2, 20));
            //Master(Diamond)
            trades.get(5).add(Jewel2Item(ItemRegistration.CARROT_HAMBURG_DELUXE.get(), 1, 1, 30));

        }

        if(event.getType() == VillageRegistry.TRAINER.get()) {
            if(!UDConfig.TRAINERS_TRADE_ITEMS.get()) return;
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            //Novice(Stone)
            //Apprentice(Iron)
            //Journeyman(Gold)
            //Expert(Emerald)
            trades.get(4).add(Jewel2Item(ItemRegistration.COFFEE.get(), 6, 2, 20));
            trades.get(4).add(Jewel2Item(ItemRegistration.YAKISOBA.get(), 4, 2, 20));
            trades.get(4).add(Jewel2Item(ItemRegistration.POTION.get(), 1, 1, 20));
            trades.get(4).add(Jewel2Item(ItemRegistration.SAKURAMOCHI.get(), 8, 1, 20));
            //Master(Diamond)

        }
    }
    @SubscribeEvent
    public static void addWandererTrades(WandererTradesEvent event) {
        if(!UDConfig.WANDERING_TRADER_TRADE_UD_CROPS.get()) return;
        List<VillagerTrades.ItemListing> trades = event.getGenericTrades();
        trades.add(Emerald2Item(ItemRegistration.CHILI_ITEM.get(), 1, 12));
        trades.add(Emerald2Item(ItemRegistration.GARLIC_ITEM.get(), 1, 12));
        trades.add(Emerald2Item(ItemRegistration.STRAWBERRY_ITEM.get(), 1, 12));
    }
}
