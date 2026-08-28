package com.ka10k.umapyoidelight;

import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.config.UDConfig;
import com.ka10k.umapyoidelight.datagen.CompostableRegistration;
import com.ka10k.umapyoidelight.event.Trades;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.loot.LootModifiers;
import com.ka10k.umapyoidelight.util.regUtilsUD;
import com.ka10k.umapyoidelight.world.BiomeModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Umapyoidelight implements ModInitializer {
    public static String MOD_ID = "umapyoidelight";
    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static UDConfig CONFIG;

    @Override
    public void onInitialize() {

        UDConfig.load();
        CONFIG = UDConfig.HANDLER.instance();
        //touch with empty method
        BlockRegistration.register();
        ItemRegistration.register();

        //actual registration
        regUtilsUD.registerBlocks();
        regUtilsUD.registerItems();

        CommonSetup.register();
        CreativeTab.register();
        CompostableRegistration.register();
        BiomeModifiers.register();
        LootModifiers.register();
        Trades.register();
    }
}
