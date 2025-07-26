package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelsProv extends ItemModelProvider {
    public ItemModelsProv(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Umapyoidelight.MOD_ID, exFileHelper);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Umapyoidelight.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Umapyoidelight.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder flatBlockItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Umapyoidelight.MOD_ID, "block/" + item.getId().getPath()));
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemRegistration.CHILI_ITEM);
        simpleItem(ItemRegistration.CHILI_ITEM_RARE);
        simpleItem(ItemRegistration.GARLIC_ITEM);
        simpleItem(ItemRegistration.GARLIC_ITEM_RARE);
        simpleItem(ItemRegistration.STRAWBERRY_ITEM);
        simpleItem(ItemRegistration.STRAWBERRY_ITEM_RARE);
        simpleItem(ItemRegistration.CARROT_ITEM_RARE);
        simpleItem(ItemRegistration.POTATO_ITEM_RARE);
        simpleItem(ItemRegistration.CARROT_HAMBURG);
        simpleItem(ItemRegistration.CARROT_HAMBURG_DELUXE);
        simpleItem(ItemRegistration.RAW_HAMBURG);
        simpleItem(ItemRegistration.HAMBURG);
        simpleItem(ItemRegistration.POTATO_GARLIC_PIZZA);
        simpleItem(ItemRegistration.POTATO_GARLIC_PIZZA_RARE);
        simpleItem(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE);
        simpleItem(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE);
        simpleItem(ItemRegistration.CARROT_POTATO_POTAUFEU);
        simpleItem(ItemRegistration.CARROT_POTATO_POTAUFEU_RARE);
        simpleItem(ItemRegistration.GARLIC_RAMEN);
        simpleItem(ItemRegistration.GARLIC_RAMEN_RARE);
        simpleItem(ItemRegistration.MAPO_CARROT_POTATO);
        simpleItem(ItemRegistration.MAPO_CARROT_POTATO_RARE);
        simpleItem(ItemRegistration.GI_PLATE);
        simpleItem(ItemRegistration.RAW_POTATO_GARLIC_PIZZA);
        simpleItem(ItemRegistration.RAW_POTATO_GARLIC_PIZZA_RARE);
        simpleItem(ItemRegistration.CHOICE_VEGETABLES);
        simpleItem(ItemRegistration.CARROT_JUICE);
        simpleItem(ItemRegistration.STRAWBERRY_JAM);
        simpleItem(ItemRegistration.WHITE_BREAD);
        simpleItem(ItemRegistration.TOAST);
        simpleItem(ItemRegistration.TOAST_STRAWBERRY_JAM);
        simpleItem(ItemRegistration.BREAD_CRUST);
        simpleItem(ItemRegistration.TRIANGLE_BREAD);
        simpleItem(ItemRegistration.STRAWBERRY_SANDWICH);
        simpleItem(ItemRegistration.VEGETABLE_SANDWICH);
        simpleItem(ItemRegistration.VEGETABLE_SANDWICH);
        simpleItem(ItemRegistration.SAKURAMOCHI);
        simpleItem(ItemRegistration.POTION);
        simpleItem(ItemRegistration.CARROT_BATTER);
        simpleItem(ItemRegistration.CARROT_DOUGH);
        simpleItem(ItemRegistration.CUT_CARROT);
        simpleItem(ItemRegistration.GRATED_CARROT);
        simpleItem(ItemRegistration.CARROT_BREAD);
        simpleItem(ItemRegistration.CARROT_PUDDING);
        simpleItem(ItemRegistration.CARROT_CAKE);
        simpleItem(ItemRegistration.CARROT_CAKE_SLICE);

        handheldItem(ItemRegistration.CARROT_STRAWBERRY_ICECREAM);
        handheldItem(ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE);
        handheldItem(ItemRegistration.RAW_STICK_CARROT);
        handheldItem(ItemRegistration.GRILLED_STICK_CARROT);
        handheldItem(ItemRegistration.CHOCOLATE_STICK_CARROT);

        flatBlockItem(ItemRegistration.WILD_CHILIS);
        flatBlockItem(ItemRegistration.WILD_GARLIC);
        flatBlockItem(ItemRegistration.WILD_STRAWBERRIES);
    }
}
