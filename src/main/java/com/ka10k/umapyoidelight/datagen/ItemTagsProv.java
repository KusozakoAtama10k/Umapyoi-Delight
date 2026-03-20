package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.tag.CommonTagsUD;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.Tags;
import net.tracen.umapyoi.data.tag.UmapyoiItemTags;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagsProv extends ItemTagsProvider {
    public ItemTagsProv(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Umapyoidelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.registerMinecraftTags();
        this.registerForgeTags();
        this.registerModTags();
        this.registerCompatibilityTags();
    }

    private void registerMinecraftTags() {
        tag(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(ItemRegistration.CHILI_ITEM.get())
                .add(ItemRegistration.GARLIC_ITEM.get())
                .add(ItemRegistration.STRAWBERRY_ITEM.get());
    }

    private void registerForgeTags() {
        tag(Tags.Items.FOODS_BERRY).add(ItemRegistration.STRAWBERRY_ITEM.get());
        tag(CommonTagsUD.BERRIES_STRAWBERRY).add(ItemRegistration.STRAWBERRY_ITEM.get());

        tag(Tags.Items.CROPS).addTags(CommonTagsUD.CROPS_CHILI, CommonTagsUD.CROPS_GARLIC, CommonTagsUD.CROPS_STRAWBERRY);
        tag(CommonTagsUD.CROPS_CHILI).add(ItemRegistration.CHILI_ITEM.get());
        tag(CommonTagsUD.CROPS_GARLIC).add(ItemRegistration.GARLIC_ITEM.get());
        tag(CommonTagsUD.CROPS_STRAWBERRY).add(ItemRegistration.STRAWBERRY_ITEM.get());


        tag(CommonTagsUD.STORAGE_BLOCKS_ITEM_CHILI).add(ItemRegistration.CHILI_CRATE.get());
        tag(CommonTagsUD.STORAGE_BLOCKS_ITEM_GARLIC).add(ItemRegistration.GARLIC_CRATE.get());
        tag(CommonTagsUD.STORAGE_BLOCKS_ITEM_STRAWBERRY).add(ItemRegistration.STRAWBERRY_CRATE.get());

        tag(Tags.Items.FOODS_BREAD).add(ItemRegistration.WHITE_BREAD.get());
        tag(CommonTags.FOODS_DOUGH).add(ItemRegistration.CARROT_DOUGH.get());

        tag(ItemTags.FLOWERS).add(
                ItemRegistration.WILD_CHILIS.get(),
                ItemRegistration.WILD_GARLIC.get(),
                ItemRegistration.WILD_STRAWBERRIES.get()
        );

        tag(ItemTags.SMALL_FLOWERS).add(
                ItemRegistration.WILD_CHILIS.get(),
                ItemRegistration.WILD_GARLIC.get(),
                ItemRegistration.WILD_STRAWBERRIES.get()
        );
    }

    private void registerModTags() {
        tag(ModTags.WILD_CROPS_ITEM).add(
                ItemRegistration.WILD_CHILIS.get(),
                ItemRegistration.WILD_GARLIC.get(),
                ItemRegistration.WILD_STRAWBERRIES.get()
        );

        tag(UmapyoiItemTags.getMotivationFoodTag(1)).add(
                ItemRegistration.CARROT_CAKE_SLICE.get(),
                ItemRegistration.CHOCOLATE_STICK_CARROT.get(),
                ItemRegistration.CARROT_PUDDING.get(),
                ItemRegistration.CARROT_HAMBURG.get(),
                ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get(),
                ItemRegistration.GARLIC_RAMEN_RARE.get(),
                ItemRegistration.MAPO_CARROT_POTATO_RARE.get(),
                ItemRegistration.GARLIC_RAMEN_RARE.get(),
                ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get(),
                ItemRegistration.COFFEE.get(),
                ItemRegistration.SAKURAMOCHI.get(),
                ItemRegistration.YAKISOBA.get()
        );

        tag(UmapyoiItemTags.getMotivationFoodTag(2)).add(
                ItemRegistration.CARROT_HAMBURG_DELUXE.get()
        );

        tag(UmapyoiItemTags.getMotivationFoodTag(3)).add(
                ItemRegistration.GI_PLATE.get()
        );
    }

    public void registerCompatibilityTags() {

        tag(CompatibilityTags.SERENE_SEASONS_AUTUMN_CROPS).add(
                ItemRegistration.CHILI_ITEM.get(),
                ItemRegistration.GARLIC_ITEM.get()
        );
        tag(CompatibilityTags.SERENE_SEASONS_SPRING_CROPS).add(
                ItemRegistration.STRAWBERRY_ITEM.get()
        );
        tag(CompatibilityTags.SERENE_SEASONS_SUMMER_CROPS).add(
                ItemRegistration.CHILI_ITEM.get(),
                ItemRegistration.GARLIC_ITEM.get()
        );
        tag(CompatibilityTags.SERENE_SEASONS_WINTER_CROPS).add(
                ItemRegistration.STRAWBERRY_ITEM.get()
        );
        
        tag(CommonTagsUD.FOODS_BURGER_MEAT).add(
                ItemRegistration.HAMBURG.get()
        ).addOptional(ResourceLocation.fromNamespaceAndPath("sakura", "burger"));
    }
}

