package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.tag.ForgeTagsUD;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.tracen.umapyoi.data.tag.UmapyoiBlockTags;
import org.jetbrains.annotations.Nullable;
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
        this.registerModTags();
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
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_HOE).add(
                BlockRegistration.WOODCHIP_ROAD.get(),
                BlockRegistration.WOODCHIP_BLOCK.get()
        );
        tag(ModTags.MINEABLE_WITH_KNIFE).add(
                BlockRegistration.POTATO_GARLIC_PIZZA.get(),
                BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get(),
                BlockRegistration.CARROT_CAKE.get(),
                BlockRegistration.CARROT_PIE.get());
    }

    protected void registerMinecraftTags() {
        tag(BlockTags.CROPS).add(
                BlockRegistration.CHILI_CROP.get(),
                BlockRegistration.GARLIC_CROP.get(),
                BlockRegistration.STRAWBERRY_CROP.get());
        tag(BlockTags.SMALL_FLOWERS).add(
                BlockRegistration.WILD_CHILIS.get(),
                BlockRegistration.WILD_GARLIC.get(),
                BlockRegistration.WILD_STRAWBERRIES.get()
        );
    }

    protected void registerForgeTags() {
        tag(ForgeTagsUD.STORAGE_BLOCKS_CHILI).add(BlockRegistration.CHILI_CRATE.get());
        tag(ForgeTagsUD.STORAGE_BLOCKS_GARLIC).add(BlockRegistration.GARLIC_CRATE.get());
        tag(ForgeTagsUD.STORAGE_BLOCKS_STRAWBERRY).add(BlockRegistration.STRAWBERRY_CRATE.get());
    }

    private void registerModTags() {
        tag(ModTags.WILD_CROPS).add(
                BlockRegistration.WILD_CHILIS.get(),
                BlockRegistration.WILD_GARLIC.get(),
                BlockRegistration.WILD_STRAWBERRIES.get()
        );
        tag(UmapyoiBlockTags.TRACK_DIRT).add(
                BlockRegistration.WOODCHIP_ROAD.get(),
                BlockRegistration.WOODCHIP_BLOCK.get()
                );
        tag(UmapyoiBlockTags.TRACK_TURF).add(
                BlockRegistration.WOODCHIP_ROAD.get(),
                BlockRegistration.WOODCHIP_BLOCK.get()
        );
        tag(UmapyoiBlockTags.TRACK_SNOW).add(
                BlockRegistration.WOODCHIP_ROAD.get(),
                BlockRegistration.WOODCHIP_BLOCK.get()
        );
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
