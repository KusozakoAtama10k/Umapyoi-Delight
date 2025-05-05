package com.ka10k.umapyoidelight;

import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.item.ComposterRegistration;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.loot.LootModifiers;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Umapyoidelight.MOD_ID)
public class Umapyoidelight {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "umapyoidelight";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Umapyoidelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        BlockRegistration.BLOCKS.register(modEventBus);
        ItemRegistration.ITEMS.register(modEventBus);
        CreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        LootModifiers.LOOT_MODIFIERS.register(modEventBus);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, UDConfig.COMMON_CONFIG);
    }

    private void setup(final FMLCommonSetupEvent event){
        event.enqueueWork(ComposterRegistration::registerCompost);
    }

}