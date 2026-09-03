package com.ka10k.umapyoidelight.world;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.tag.BiomeTagsUD;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.registry.ModBiomeModifiers;

public class BiomeModifiers {

    private static final ResourceKey<PlacedFeature> WILD_CHILIS = modFeature("patch_wild_chili_peppers");
    private static final ResourceKey<PlacedFeature> WILD_GARLICS = modFeature("patch_wild_garlic");
    private static final ResourceKey<PlacedFeature> WILD_STRAWBERRIES = modFeature("patch_wild_strawberries");

    @NotNull
    private static ResourceKey<PlacedFeature> modFeature(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Umapyoidelight.MOD_ID, name));

    }

    public static void register() {

        BiomeModifications.addFeature(new ModBiomeModifiers.FDBiomeSelector(0.4f, 0.9f,
                        BiomeTagsUD.Biomes.WILD_CHILIS_WHITELIST, BiomeTagsUD.Biomes.WILD_CHILIS_BLACKLIST),
                GenerationStep.Decoration.VEGETAL_DECORATION, WILD_CHILIS);

        BiomeModifications.addFeature(new ModBiomeModifiers.FDBiomeSelector(0.4f, 0.9f,
                        BiomeTagsUD.Biomes.WILD_GARLICS_WHITELIST, BiomeTagsUD.Biomes.WILD_GARLICS_BLACKLIST),
                GenerationStep.Decoration.VEGETAL_DECORATION, WILD_GARLICS);

        BiomeModifications.addFeature(new ModBiomeModifiers.FDBiomeSelector(0.4f, 0.9f,
                        BiomeTagsUD.Biomes.WILD_STRAWBERRIES_WHITELIST, BiomeTagsUD.Biomes.WILD_STRAWBERRIES_BLACKLIST),
                GenerationStep.Decoration.VEGETAL_DECORATION, WILD_STRAWBERRIES);
    }
}
