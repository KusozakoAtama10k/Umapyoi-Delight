package com.ka10k.umapyoidelight.loot;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.block.CarrotCakeBlock;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import vectorwing.farmersdelight.common.block.PieBlock;

import static vectorwing.farmersdelight.refabricated.LootModificationEvents.pastrySlicing;

public class LootModifiers {

    public static final ResourceKey<LootTable> UD_VILLAGE_BUTCHER = key("chests/village_butcher");
    public static final ResourceKey<LootTable> UD_VILLAGE_HOUSE = key("chests/village_house");

    public static void register() {
        LootTableEvents.MODIFY.register(LootModifiers::modifyTable);
    }

    private static ResourceKey<LootTable> key(String path) {
        return ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("umapyoidelight", path));
    }

    private static void modifyTable(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, HolderLookup.Provider registries) {
        chestLoot(key, tableBuilder, source, registries);
        blockLoot(key, tableBuilder, source, registries);
        slicingLoot(key, tableBuilder, source, registries);
    }

    private static void blockLoot(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, HolderLookup.Provider registries) {

        if (key.equals(Blocks.CARROTS.getLootTable())) {
            tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.CARROT_ITEM_RARE.get())
                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CARROTS)
                            .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.AGE_7, 7))
                            .and(LootItemRandomChanceCondition.randomChance(0.05F)))));
        }

        if (key.equals(Blocks.POTATOES.getLootTable())) {
            tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.POTATO_ITEM_RARE.get())
                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.POTATOES)
                            .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.AGE_7, 7))
                            .and(LootItemRandomChanceCondition.randomChance(0.05F)))));
        }

        if (key.equals(BlockRegistration.CHILI_CROP.get().getLootTable())) {
            tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.CHILI_ITEM_RARE.get())
                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.CHILI_CROP.get())
                            .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.AGE_7, 7))
                            .and(LootItemRandomChanceCondition.randomChance(0.05F)))));
        }

        if (key.equals(BlockRegistration.GARLIC_CROP.get().getLootTable())) {
            tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.GARLIC_ITEM_RARE.get())
                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.GARLIC_CROP.get())
                            .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.AGE_7, 7))
                            .and(LootItemRandomChanceCondition.randomChance(0.05F)))));
        }

        if (key.equals(BlockRegistration.STRAWBERRY_CROP.get().getLootTable())) {
            tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.STRAWBERRY_ITEM_RARE.get())
                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.STRAWBERRY_CROP.get())
                            .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlockStateProperties.AGE_7, 7))
                            .and(LootItemRandomChanceCondition.randomChance(0.05F)))));
        }
    }

    private static void chestLoot(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, HolderLookup.Provider registries) {
        if (!Umapyoidelight.CONFIG.GENERATE_UD_LOOT)
            return;

        if (key == BuiltInLootTables.VILLAGE_BUTCHER)
            tableBuilder.withPool(LootPool.lootPool().add(NestedLootTable.lootTableReference(UD_VILLAGE_BUTCHER)));

        if (key.equals(BuiltInLootTables.VILLAGE_PLAINS_HOUSE)
                || key.equals(BuiltInLootTables.VILLAGE_DESERT_HOUSE)
                || key.equals(BuiltInLootTables.VILLAGE_TAIGA_HOUSE)
                || key.equals(BuiltInLootTables.VILLAGE_SNOWY_HOUSE)
                || key.equals(BuiltInLootTables.VILLAGE_SAVANNA_HOUSE))
            tableBuilder.withPool(LootPool.lootPool().add(NestedLootTable.lootTableReference(UD_VILLAGE_HOUSE)));
    }

    private static void slicingLoot(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, HolderLookup.Provider registries) {

        if (key.equals(BlockRegistration.CARROT_CAKE.get().getLootTable()))
            pastrySlicing(tableBuilder, Blocks.CAKE, ItemRegistration.CARROT_CAKE_SLICE.get(), CarrotCakeBlock.BITES, 7);

//        if (key.location().getPath().startsWith("blocks/")) {
//            HolderLookup<Block> lookup = registries.lookupOrThrow(Registries.BLOCK);
//            var block = lookup.get(ResourceKey.create(Registries.BLOCK, key.location().withPath(s -> s.substring(7))));
//            if (block.isPresent() && TagUtils.isCandleDropsCakeSliceTag(block.get(), lookup)) {
//                tableBuilder.withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.CARROT_CAKE_SLICE.get()).apply(SetItemCountFunction.setCount(ConstantValue.exactly(7.0F)))
//                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModTags.Items.KNIVES)))));
//            }
//        }

        if (key.equals(BlockRegistration.CARROT_PIE.get().getLootTable()))
            pastrySlicing(tableBuilder, BlockRegistration.CARROT_PIE.get(), ItemRegistration.CARROT_PIE_SLICE.get(), PieBlock.BITES, 4);
    }
}