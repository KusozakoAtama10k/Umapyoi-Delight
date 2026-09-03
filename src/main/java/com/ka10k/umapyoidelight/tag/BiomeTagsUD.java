package com.ka10k.umapyoidelight.tag;

import com.ka10k.umapyoidelight.Umapyoidelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class BiomeTagsUD {
    public static class Biomes {
        public static final TagKey<Biome> WILD_CHILIS_WHITELIST = BiomeTagUD("wild_chili_peppers_whitelist");
        public static final TagKey<Biome> WILD_CHILIS_BLACKLIST = BiomeTagUD("wild_chili_peppers_blacklist");
        public static final TagKey<Biome> WILD_GARLICS_WHITELIST = BiomeTagUD("wild_garlics_whitelist");
        public static final TagKey<Biome> WILD_GARLICS_BLACKLIST = BiomeTagUD("wild_garlics_blacklist");
        public static final TagKey<Biome> WILD_STRAWBERRIES_WHITELIST = BiomeTagUD("wild_strawberries_whitelist");
        public static final TagKey<Biome> WILD_STRAWBERRIES_BLACKLIST = BiomeTagUD("wild_strawberries_blacklist");
    }

    private static TagKey<Biome> BiomeTagUD(String path) {
        return TagKey.create(Registries.BIOME, new ResourceLocation(Umapyoidelight.MOD_ID, path));
    }
}
