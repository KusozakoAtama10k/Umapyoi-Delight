package com.ka10k.umapyoidelight;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Umapyoidelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> UD_TAB =
            CREATIVE_MODE_TABS.register("umapyoidelight_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistration.CARROT_HAMBURG_DELUXE.get()))
                            .title(Component.translatable("creativetab.umapyoidelight_tab"))
                            .displayItems((parameters, pOutput) -> ItemRegistration.CREATIVE_TAB_ITEMS.forEach((item) -> pOutput.accept(item.get())))
                            .build());
}
