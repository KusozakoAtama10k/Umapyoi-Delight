package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.tag.ForgeTagsUD;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagsProv extends BlockTagsProvider {

    public BlockTagsProv(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Umapyoidelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.registerBlockMineables();
        this.registerMinecraftTags();
        this.registerForgeTags();
        this.registerCompatibilityTags();

    }

    protected void registerBlockMineables() {
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE).add(
                BlockRegistration.CARROT_CRATE_RARE.get(),
                BlockRegistration.POTATO_CRATE_RARE.get(),
                BlockRegistration.CHILI_CRATE.get(),
                BlockRegistration.CHILI_CRATE_RARE.get(),
                BlockRegistration.GARLIC_CRATE.get(),
                BlockRegistration.GARLIC_CRATE_RARE.get(),
                BlockRegistration.STRAWBERRY_CRATE.get(),
                BlockRegistration.STRAWBERRY_CRATE_RARE.get()
        );
        /*tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_HOE).add(
                BlockRegistration.WOODCHIP_ROAD.get()
        );*/
        tag(ModTags.MINEABLE_WITH_KNIFE).add(
                        BlockRegistration.POTATO_GARLIC_PIZZA.get(),
                        BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get());
    }

    protected void registerMinecraftTags() {
        tag(net.minecraft.tags.BlockTags.CLIMBABLE).add(
                ModBlocks.ROPE.get(),
                ModBlocks.TOMATO_CROP.get());
        tag(net.minecraft.tags.BlockTags.CROPS).add(
                BlockRegistration.CHILI_CROP.get(),
                BlockRegistration.GARLIC_CROP.get(),
                BlockRegistration.STRAWBERRY_CROP.get()
        /*tag(net.minecraft.tags.BlockTags.SMALL_FLOWERS).add(
                ModBlocks.WILD_CARROTS.get(),
                ModBlocks.WILD_POTATOES.get(),
                ModBlocks.WILD_BEETROOTS.get(),
                ModBlocks.WILD_CABBAGES.get(),
                ModBlocks.WILD_TOMATOES.get(),
                ModBlocks.WILD_ONIONS.get()*/
        );
    }

    protected void registerForgeTags() {
        tag(ForgeTagsUD.STORAGE_BLOCKS_CHILI).add(ModBlocks.CARROT_CRATE.get());
        tag(ForgeTagsUD.STORAGE_BLOCKS_GARLIC).add(ModBlocks.POTATO_CRATE.get());
        tag(ForgeTagsUD.STORAGE_BLOCKS_STRAWBERRY).add(ModBlocks.BEETROOT_CRATE.get());
    }

    private void registerCompatibilityTags() {
        tag(CompatibilityTags.SERENE_SEASONS_AUTUMN_CROPS_BLOCK).add(
                BlockRegistration.CHILI_CROP.get(),
                BlockRegistration.GARLIC_CROP.get()
        );
        tag(CompatibilityTags.SERENE_SEASONS_SPRING_CROPS_BLOCK).add(
                BlockRegistration.STRAWBERRY_CROP.get()
        );
        tag(CompatibilityTags.SERENE_SEASONS_SUMMER_CROPS_BLOCK).add(
                BlockRegistration.CHILI_CROP.get(),
                BlockRegistration.GARLIC_CROP.get()
        );
        tag(CompatibilityTags.SERENE_SEASONS_WINTER_CROPS_BLOCK).add(
                BlockRegistration.STRAWBERRY_CROP.get()
        );
        tag(CompatibilityTags.SERENE_SEASONS_UNBREAKABLE_FERTILE_CROPS).add(
                BlockRegistration.GARLIC_CROP.get()
        );
    }
}
