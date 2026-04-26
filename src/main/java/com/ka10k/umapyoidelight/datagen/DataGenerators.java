package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.datagen.loot.BlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Umapyoidelight.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void GatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK)
        ), lookupProvider));
        generator.addProvider(event.includeServer(), new Recipes(packOutput, lookupProvider));
        BlockTagsProv blockTags = new BlockTagsProv(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ItemTagsProv(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new AdvancementProv(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new DataMapProv(packOutput, lookupProvider));
        generator.addProvider(event.includeClient(), new BlockStatesProv(packOutput,existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModelsProv(packOutput,existingFileHelper));


    }

}
