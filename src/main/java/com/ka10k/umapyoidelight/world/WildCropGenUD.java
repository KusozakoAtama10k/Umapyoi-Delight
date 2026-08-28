package com.ka10k.umapyoidelight.world;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.block.BlockRegistration;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import vectorwing.farmersdelight.common.registry.ModBiomeFeatures;
import vectorwing.farmersdelight.common.world.configuration.WildCropConfiguration;
import vectorwing.farmersdelight.common.world.filter.BiomeTagFilter;

import java.util.List;

public class WildCropGenUD {


    public static ResourceKey<ConfiguredFeature<?, ?>> FEATURE_PATCH_WILD_CHILIS = registerConfiguredFeatureKey("patch_wild_chili_peppers");
    public static ResourceKey<ConfiguredFeature<?, ?>> FEATURE_PATCH_WILD_GARLICS = registerConfiguredFeatureKey("patch_wild_garlics");
    public static ResourceKey<ConfiguredFeature<?, ?>> FEATURE_PATCH_WILD_STRAWBERRIES = registerConfiguredFeatureKey("patch_wild_strawberries");

    public static ResourceKey<PlacedFeature> PATCH_WILD_CHILIS = registerPlacedFeatureKey("patch_wild_chili_peppers");
    public static ResourceKey<PlacedFeature> PATCH_WILD_GARLICS = registerPlacedFeatureKey("patch_wild_garlics");
    public static ResourceKey<PlacedFeature> PATCH_WILD_STRAWBERRIES = registerPlacedFeatureKey("patch_wild_strawberries");

    private static ResourceKey<ConfiguredFeature<?, ?>> registerConfiguredFeatureKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Umapyoidelight.MOD_ID, name));
    }

    private static ResourceKey<PlacedFeature> registerPlacedFeatureKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Umapyoidelight.MOD_ID, name));
    }

    public static void bootstrapConfiguredFeatures(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        context.register(FEATURE_PATCH_WILD_CHILIS, wildCropConfiguredFeature(
                BlockRegistration.WILD_CHILIS.get(),
                Blocks.SHORT_GRASS,
                Blocks.COARSE_DIRT,
                BlockTags.DIRT
        ));

        context.register(FEATURE_PATCH_WILD_GARLICS, wildCropConfiguredFeature(
                BlockRegistration.WILD_GARLIC.get(),
                Blocks.ALLIUM,
                BlockTags.DIRT
        ));

        context.register(FEATURE_PATCH_WILD_STRAWBERRIES, wildCropConfiguredFeature(
                BlockRegistration.WILD_STRAWBERRIES.get(),
                Blocks.SHORT_GRASS,
                Blocks.COARSE_DIRT,
                BlockTags.DIRT
        ));

    }

    public static void bootstrapPlacedFeatures(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureLookup = context.lookup(Registries.CONFIGURED_FEATURE);
        context.register(PATCH_WILD_CHILIS, createPlacedFeature(configuredFeatureLookup, FEATURE_PATCH_WILD_CHILIS, 120));
        context.register(PATCH_WILD_GARLICS, createPlacedFeature(configuredFeatureLookup, FEATURE_PATCH_WILD_GARLICS, 120));
        context.register(PATCH_WILD_STRAWBERRIES, createPlacedFeature(configuredFeatureLookup, FEATURE_PATCH_WILD_STRAWBERRIES, 120));
    }


    private static ConfiguredFeature<?, ?> wildCropConfiguredFeature(Block primaryBlock, Block secondaryBlock, TagKey<Block> blocksToTarget) {
        return defaultWildCropConfiguredFeature(
                plantPlacedFeature(primaryBlock, blocksToTarget),
                plantPlacedFeature(secondaryBlock, blocksToTarget),
                null
        );
    }

    private static ConfiguredFeature<?, ?> wildCropConfiguredFeature(Block primaryBlock, Block secondaryBlock, Block floorBlock, TagKey<Block> blocksToTarget) {
        return defaultWildCropConfiguredFeature(
                plantPlacedFeature(primaryBlock, blocksToTarget),
                plantPlacedFeature(secondaryBlock, blocksToTarget),
                floorPlacedFeature(floorBlock, blocksToTarget)
        );
    }


    private static ConfiguredFeature<?, ?> defaultWildCropConfiguredFeature(Holder<PlacedFeature> primaryFeature, Holder<PlacedFeature> secondaryFeature, @Nullable Holder<PlacedFeature> floorFeature) {
        return new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(48, 6, 3, primaryFeature, secondaryFeature, floorFeature)
        );
    }

    private static Holder<PlacedFeature> plantPlacedFeature(Block block, Block blocksToPlaceOn) {
        return Holder.direct(new PlacedFeature(
                Holder.direct(new ConfiguredFeature<>(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(SimpleStateProvider.simple(block))
                )),
                placeOnTopOfModifier(blocksToPlaceOn)
        ));
    }

    private static Holder<PlacedFeature> plantPlacedFeature(Block block, TagKey<Block> blocksToPlaceOn) {
        return Holder.direct(new PlacedFeature(
                Holder.direct(new ConfiguredFeature<>(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(SimpleStateProvider.simple(block))
                )),
                placeOnTopOfModifier(blocksToPlaceOn)
        ));
    }

    private static Holder<PlacedFeature> floorPlacedFeature(Block block, TagKey<Block> blocksToReplace) {
        return Holder.direct(new PlacedFeature(
                Holder.direct(new ConfiguredFeature<>(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(SimpleStateProvider.simple(block))
                )),
                replaceBlockModifier(blocksToReplace)
        ));
    }

    private static List<PlacementModifier> placeOnTopOfModifier(Block blockToPlaceOn) {
        return List.of(BlockPredicateFilter.forPredicate(BlockPredicate.allOf(
                BlockPredicate.matchesBlocks(Blocks.AIR),
                BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), blockToPlaceOn)
        )));
    }

    private static List<PlacementModifier> placeOnTopOfModifier(TagKey<Block> blocksToPlaceOn) {
        return List.of(BlockPredicateFilter.forPredicate(BlockPredicate.allOf(
                BlockPredicate.matchesBlocks(Blocks.AIR),
                BlockPredicate.matchesTag(new Vec3i(0, -1, 0), blocksToPlaceOn)
        )));
    }

    private static List<PlacementModifier> replaceBlockModifier(TagKey<Block> blocksToReplace) {
        return List.of(BlockPredicateFilter.forPredicate(BlockPredicate.allOf(
                BlockPredicate.replaceable(new Vec3i(0, 1, 0)),
                BlockPredicate.matchesTag(blocksToReplace)
        )));
    }

    private static PlacedFeature createPlacedFeature(HolderGetter<ConfiguredFeature<?, ?>> featureGetter, ResourceKey<ConfiguredFeature<?, ?>> feature, int rarity) {
        return new PlacedFeature(featureGetter.getOrThrow(feature), List.of(
                RarityFilter.onAverageOnceEvery(rarity),
                InSquarePlacement.spread(),
                HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING),
                BiomeFilter.biome(),
                BiomeTagFilter.biomeIsInTag(BiomeTags.IS_OVERWORLD)
        ));
    }
}
