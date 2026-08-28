//package com.ka10k.umapyoidelight.datagen;
//
//import com.ka10k.umapyoidelight.Umapyoidelight;
//import com.ka10k.umapyoidelight.datagen.loot.BlockLootTables;
//import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.DataGenerator;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.loot.LootTableProvider;
//import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//
//public class DataGenerators implements DataGeneratorEntrypoint {
//    @SubscribeEvent
//    public static void GatherData(GatherDataEvent event) {
//        FabricDataGenerator.Pack pack = generator.createPack();
//
//        pack.addProvider(Recipes::new);
//        BlockTagsProv blockTags = new BlockTagsProv(packOutput, lookupProvider, existingFileHelper);
//        generator.addProvider(event.includeServer(), blockTags);
//        generator.addProvider(event.includeServer(), new ItemTagsProv(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));
//        generator.addProvider(event.includeServer(), new AdvancementProv(packOutput, lookupProvider, existingFileHelper));
//        generator.addProvider(event.includeServer(), new CompostableRegistration(packOutput, lookupProvider));
//        generator.addProvider(event.includeClient(), new BlockStatesProv(packOutput,existingFileHelper));
//        generator.addProvider(event.includeClient(), new ItemModelsProv(packOutput,existingFileHelper));
//
//
//    }
//
//}
