package com.ka10k.umapyoidelight.datagen.recipe;

import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

public class CuttingRecipesProv {
    public static void register(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.BREAD),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.WHITE_BREAD.get(), 2)
                .build(output);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.WILD_CHILIS.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.CHILI_ITEM.get(), 1)
                .addResultWithChance(Items.RED_DYE, 0.5F, 2)
                .build(output);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.WILD_STRAWBERRIES.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.STRAWBERRY_ITEM.get(), 1)
                .addResultWithChance(Items.PINK_DYE, 0.5F, 2)
                .build(output);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.WILD_GARLIC.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.GARLIC_ITEM.get(), 1)
                .addResult(Items.MAGENTA_DYE, 2)
                .addResultWithChance(Items.LIME_DYE, 0.1F)
                .build(output);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.WHITE_BREAD.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.TRIANGLE_BREAD.get(), 2)
                .addResult(ItemRegistration.BREAD_CRUST.get())
                .addResultWithChance(ItemRegistration.BREAD_CRUST.get(), 0.5F)
                .build(output);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Tags.Items.CROPS_CARROT),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.CUT_CARROT.get(), 2)
                .addResultWithChance(ItemRegistration.CUT_CARROT.get(), 0.2F)
                .build(output,"farmersdelight:cutting/carrot");

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.CUT_CARROT.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.GRATED_CARROT.get(), 1)
                .addResultWithChance(ItemRegistration.GRATED_CARROT.get(), 0.1F)
                .build(output);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ItemRegistration.CARROT_CAKE.get()),
                        Ingredient.of(CommonTags.TOOLS_KNIFE), ItemRegistration.CARROT_CAKE_SLICE.get(), 7)
                .build(output);
    }
}
