package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;

public class CuttingRecipesProv {
    public static void register(Consumer<FinishedRecipe> consumer) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.BREAD),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ItemRegistration.WHITE_BREAD.get(), 2)
                .build(consumer);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.WILD_CHILIS.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ItemRegistration.CHILI_ITEM.get(), 1)
                .addResultWithChance(Items.RED_DYE, 0.5F, 2)
                .build(consumer);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.WILD_STRAWBERRIES.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ItemRegistration.STRAWBERRY_ITEM.get(), 1)
                .addResultWithChance(Items.PINK_DYE, 0.5F, 2)
                .build(consumer);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.WILD_GARLIC.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ItemRegistration.GARLIC_ITEM.get(), 1)
                .addResult(Items.MAGENTA_DYE, 2)
                .addResultWithChance(Items.LIME_DYE, 0.1F)
                .build(consumer);

    }
}
