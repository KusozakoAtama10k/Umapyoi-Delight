package com.ka10k.umapyoidelight.datagen.loot;

import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.block.PotatoGarlicPizzaBlock;
import com.ka10k.umapyoidelight.block.crop.ChiliCrop;
import com.ka10k.umapyoidelight.block.crop.GarlicCrop;
import com.ka10k.umapyoidelight.block.crop.StrawberryCrop;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

import java.util.HashSet;
import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {

    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(BlockRegistration.CHILI_CRATE.get());
        this.dropSelf(BlockRegistration.GARLIC_CRATE.get());
        this.dropSelf(BlockRegistration.STRAWBERRY_CRATE.get());
        this.dropSelf(BlockRegistration.CHILI_CRATE_RARE.get());
        this.dropSelf(BlockRegistration.GARLIC_CRATE_RARE.get());
        this.dropSelf(BlockRegistration.STRAWBERRY_CRATE_RARE.get());
        this.dropSelf(BlockRegistration.CARROT_CRATE_RARE.get());
        this.dropSelf(BlockRegistration.POTATO_CRATE_RARE.get());
        this.dropSelf(BlockRegistration.WOODCHIP_BLOCK.get());


        LootItemCondition.Builder Chili_Mature = LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.CHILI_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ChiliCrop.AGE, 7));
        LootItemCondition.Builder Garlic_Mature = LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.GARLIC_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GarlicCrop.AGE, 7));
        LootItemCondition.Builder Strawberry_Mature = LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.STRAWBERRY_CROP.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCrop.AGE, 7));
        this.add(BlockRegistration.CHILI_CROP.get(), this.applyExplosionDecay(BlockRegistration.CHILI_CROP.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.CHILI_ITEM.get()))).withPool(LootPool.lootPool().when(Chili_Mature).add(LootItem.lootTableItem(ItemRegistration.CHILI_ITEM.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
        this.add(BlockRegistration.GARLIC_CROP.get(), this.applyExplosionDecay(BlockRegistration.CHILI_CROP.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.GARLIC_ITEM.get()))).withPool(LootPool.lootPool().when(Garlic_Mature).add(LootItem.lootTableItem(ItemRegistration.GARLIC_ITEM.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
        this.add(BlockRegistration.STRAWBERRY_CROP.get(), this.applyExplosionDecay(BlockRegistration.STRAWBERRY_CROP.get(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(ItemRegistration.STRAWBERRY_ITEM.get()))).withPool(LootPool.lootPool().when(Strawberry_Mature).add(LootItem.lootTableItem(ItemRegistration.STRAWBERRY_ITEM.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));

        LootItemCondition.Builder Pizza_Full = LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.POTATO_GARLIC_PIZZA.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PotatoGarlicPizzaBlock.SERVINGS, 6));
        LootItemCondition.Builder Pizza_Rare_Full = LootItemBlockStatePropertyCondition.hasBlockStateProperties(BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PotatoGarlicPizzaBlock.SERVINGS, 6));
        this.add(BlockRegistration.POTATO_GARLIC_PIZZA.get(), this.applyExplosionDecay(BlockRegistration.POTATO_GARLIC_PIZZA.get(), LootTable.lootTable().withPool(LootPool.lootPool().when(Pizza_Full).add(LootItem.lootTableItem(BlockRegistration.POTATO_GARLIC_PIZZA.get()))).withPool(LootPool.lootPool().when(Pizza_Full.invert()).add(LootItem.lootTableItem(Items.BOWL)))));
        this.add(BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get(), this.applyExplosionDecay(BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get(), LootTable.lootTable().withPool(LootPool.lootPool().when(Pizza_Rare_Full).add(LootItem.lootTableItem(BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get()))).withPool(LootPool.lootPool().when(Pizza_Full.invert()).add(LootItem.lootTableItem(Items.BOWL)))));

    }

    @Override
    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return generatedLootTables;
    }
    private final Set<Block> generatedLootTables = new HashSet<>();
}
