package com.ka10k.umapyoidelight.client;

import com.ka10k.umapyoidelight.block.BlockRegistration;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class UDClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                BlockRegistration.CHILI_CROP.get(), BlockRegistration.GARLIC_CROP.get(), BlockRegistration.STRAWBERRY_CROP.get(),
                BlockRegistration.WILD_CHILIS.get(), BlockRegistration.WILD_GARLIC.get(), BlockRegistration.WILD_STRAWBERRIES.get(),
                BlockRegistration.YAKISOBA_DECO.get());
    }
}
