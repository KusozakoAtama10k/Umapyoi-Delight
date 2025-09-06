package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.datagen.recipe.CookingRecipesProv;
import com.ka10k.umapyoidelight.datagen.recipe.CraftingRecipesProv;
import com.ka10k.umapyoidelight.datagen.recipe.SmeltingRecipesProv;
import com.ka10k.umapyoidelight.datagen.recipe.CuttingRecipesProv;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;

public class Recipes extends RecipeProvider {
    public Recipes(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(pOutput, registries);
        }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        CookingRecipesProv.register(output);
        CraftingRecipesProv.register(output);
        SmeltingRecipesProv.register(output);
        CuttingRecipesProv.register(output);
    }
}

