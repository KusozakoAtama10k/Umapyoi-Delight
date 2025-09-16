package com.ka10k.umapyoidelight;

import com.agricraft.agricraft.api.config.CoreConfig;
import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.item.ComposterRegistration;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.ka10k.umapyoidelight.loot.LootModifiers;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Function;

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
        modEventBus.addListener(Umapyoidelight::onAddPackFinders);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, UDConfig.COMMON_CONFIG);
    }

	public static Logger getLogger() {
		return LOGGER;
	}

    private void setup(final FMLCommonSetupEvent event){
        event.enqueueWork(ComposterRegistration::registerCompost);
    }

    public static void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.SERVER_DATA) {
            addPack("datapacks", PackType.SERVER_DATA, event);
        }
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            addPack("resourcepacks", PackType.CLIENT_RESOURCES, event);
        }
    }

    public static void addPack(String type, PackType packType, AddPackFindersEvent event) {
        Path resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource(type, MOD_ID);
        String id = "builtin/agricraft_" + type + "_" + MOD_ID;
        Function<String, PackResources> onName = path -> new PathPackResources(path, resourcePath, true);
        Pack.ResourcesSupplier resources = new Pack.ResourcesSupplier() {
            @Override
            public PackResources open(String string) {
                return onName.apply(id);
            }
        };
        try (PackResources packresources = resources.open(id)) {
            PackMetadataSection packmetadatasection = packresources.getMetadataSection(PackMetadataSection.TYPE);
            if (packmetadatasection == null) {
                return;
            }
        } catch (IOException ignored) {
        }
        Pack pack = Pack.readMetaAndCreate(id, Component.translatable("agricraft." + type + "." + MOD_ID), CoreConfig.enablePacksByDefault, resources, packType, Pack.Position.TOP, PackSource.BUILT_IN);
        if (pack != null) {
            event.addRepositorySource(packConsumer -> packConsumer.accept(pack));
        }
    }
}