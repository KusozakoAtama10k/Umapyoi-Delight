package com.ka10k.umapyoidelight;

import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.item.ComposterRegistration;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.loot.LootModifiers;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(Umapyoidelight.MOD_ID)
public class Umapyoidelight {

    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "umapyoidelight";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Umapyoidelight(IEventBus modEventBus, ModContainer modContainer) {
        BlockRegistration.BLOCKS.register(modEventBus);
        ItemRegistration.ITEMS.register(modEventBus);
        CreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        LootModifiers.LOOT_MODIFIERS.register(modEventBus);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, UDConfig.COMMON_CONFIG);
    }

	public static Logger getLogger() {
		return LOGGER;
	}

    private void setup(final FMLCommonSetupEvent event){
        event.enqueueWork(ComposterRegistration::registerCompost);
    }

}