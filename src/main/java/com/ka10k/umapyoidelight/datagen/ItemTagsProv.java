package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.tag.ForgeTagsUD;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ForgeTags;
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
        tag(net.minecraft.tags.ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(ItemRegistration.CHILI_ITEM.get())
                .add(ItemRegistration.GARLIC_ITEM.get())
                .add(ItemRegistration.STRAWBERRY_ITEM.get());
    }

    private void registerForgeTags() {
        tag(ForgeTags.BERRIES).add(ItemRegistration.STRAWBERRY_ITEM.get());
        tag(ForgeTagsUD.BERRIES_STRAWBERRY).add(ItemRegistration.STRAWBERRY_ITEM.get());

        tag(ForgeTags.CROPS).addTags(ForgeTagsUD.CROPS_CHILI, ForgeTagsUD.CROPS_GARLIC, ForgeTagsUD.CROPS_STRAWBERRY);
        tag(ForgeTagsUD.CROPS_CHILI).add(ItemRegistration.CHILI_ITEM.get());
        tag(ForgeTagsUD.CROPS_GARLIC).add(ItemRegistration.GARLIC_ITEM.get());
        tag(ForgeTagsUD.CROPS_STRAWBERRY).add(ItemRegistration.STRAWBERRY_ITEM.get());

        tag(ForgeTagsUD.FRUITS).addTag(ForgeTagsUD.FRUITS_STRAWBERRY);
        tag(ForgeTagsUD.FRUITS_STRAWBERRY).add(ItemRegistration.STRAWBERRY_ITEM.get());

        tag(ForgeTagsUD.STORAGE_BLOCKS_ITEM_CHILI).add(ItemRegistration.CHILI_CRATE.get());
        tag(ForgeTagsUD.STORAGE_BLOCKS_ITEM_GARLIC).add(ItemRegistration.GARLIC_CRATE.get());
        tag(ForgeTagsUD.STORAGE_BLOCKS_ITEM_STRAWBERRY).add(ItemRegistration.STRAWBERRY_CRATE.get());

        tag(ForgeTags.VEGETABLES).addTags(ForgeTagsUD.VEGETABLES_CHILI, ForgeTagsUD.VEGETABLES_GARLIC);
        tag(ForgeTagsUD.VEGETABLES_CHILI).add(ItemRegistration.CHILI_ITEM.get());
        tag(ForgeTagsUD.VEGETABLES_GARLIC).add(ItemRegistration.GARLIC_ITEM.get());

        tag(ForgeTags.BREAD).add(ItemRegistration.WHITE_BREAD.get());
        tag(ForgeTags.BREAD_WHEAT).add(ItemRegistration.WHITE_BREAD.get());
    }

    private void registerModTags() {
        tag(ModTags.WILD_CROPS_ITEM).add(
                ItemRegistration.WILD_CHILIS.get(),
                ItemRegistration.WILD_GARLIC.get(),
                ItemRegistration.WILD_STRAWBERRIES.get()
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
    }
}

