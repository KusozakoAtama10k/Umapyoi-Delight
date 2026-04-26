package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class DataMapProv extends DataMapProvider {
    protected DataMapProv(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    public void gather(HolderLookup.Provider provider) {
        this.builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ItemRegistration.WOODCHIP_BLOCK, new Compostable(0.3F), false)
                .add(ItemRegistration.CUT_CARROT, new Compostable(0.3F), false)
                .add(ItemRegistration.GRATED_CARROT, new Compostable(0.3F), false)
                .add(ItemRegistration.GARLIC_ITEM, new Compostable(0.65F), false)
                .add(ItemRegistration.CHILI_ITEM, new Compostable(0.65F), false)
                .add(ItemRegistration.STRAWBERRY_ITEM, new Compostable(0.65F), false)
                .add(ItemRegistration.WHITE_BREAD, new Compostable(0.65F), false)
                .add(ItemRegistration.WILD_CHILIS, new Compostable(0.65F), false)
                .add(ItemRegistration.WILD_GARLIC, new Compostable(0.65F), false)
                .add(ItemRegistration.WILD_STRAWBERRIES, new Compostable(0.65F), false)
                .add(ItemRegistration.GARLIC_ITEM_RARE, new Compostable(0.85F), false)
                .add(ItemRegistration.CHILI_ITEM_RARE, new Compostable(0.85F), false)
                .add(ItemRegistration.STRAWBERRY_ITEM_RARE, new Compostable(0.85F), false)
                .add(ItemRegistration.CARROT_BREAD, new Compostable(0.85F), false)
                .add(ItemRegistration.CARROT_CAKE_SLICE, new Compostable(0.85F), false)
                .add(ItemRegistration.CARROT_CAKE, new Compostable(1.0F), false)
                .add(ItemRegistration.CARROT_PIE_SLICE, new Compostable(0.85F), false)
                .add(ItemRegistration.CARROT_PIE, new Compostable(1.0F), false)

                .add(ItemRegistration.GARLIC_ITEM_RARE, new Compostable(0.85F), false)
                .add(ItemRegistration.CHILI_ITEM_RARE, new Compostable(0.85F), false)
                .add(ItemRegistration.STRAWBERRY_ITEM_RARE, new Compostable(0.85F), false)
                .add(ItemRegistration.CARROT_ITEM_RARE, new Compostable(0.85F), false)
                .add(ItemRegistration.POTATO_ITEM_RARE, new Compostable(0.85F), false);
    }
}
