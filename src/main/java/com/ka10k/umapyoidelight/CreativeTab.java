package com.ka10k.umapyoidelight;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final ResourceKey<CreativeModeTab> UD_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
            new ResourceLocation(Umapyoidelight.MOD_ID, "umapyoidelight_tab"));

    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, UD_TAB_KEY, UD_TAB);
    }

    public static final CreativeModeTab UD_TAB =
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ItemRegistration.CARROT_HAMBURG_DELUXE.get()))
                    .title(Component.translatable("creativetab.umapyoidelight_tab"))
                    .displayItems((displayContext, entries) -> ItemRegistration.CREATIVE_TAB_ITEMS.forEach(item -> entries.accept(item.get())))
                    .build();
}
