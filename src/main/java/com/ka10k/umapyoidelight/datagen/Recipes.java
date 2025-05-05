package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.datagen.recipe.CookingRecipesProv;
import com.ka10k.umapyoidelight.datagen.recipe.CraftingRecipesProv;
import com.ka10k.umapyoidelight.datagen.recipe.SmeltingRecipesProv;
import com.ka10k.umapyoidelight.datagen.recipe.CuttingRecipesProv;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(PackOutput pOutput) {
            super(pOutput);
        }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        CookingRecipesProv.register(consumer);
        CraftingRecipesProv.register(consumer);
        SmeltingRecipesProv.register(consumer);
        CuttingRecipesProv.register(consumer);
    }
}

