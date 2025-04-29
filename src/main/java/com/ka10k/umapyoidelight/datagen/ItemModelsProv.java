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

        handheldItem(ItemRegistration.CARROT_STRAWBERRY_ICECREAM);
        handheldItem(ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE);

        flatBlockItem(ItemRegistration.WILD_CHILIS);
        flatBlockItem(ItemRegistration.WILD_GARLIC);
        flatBlockItem(ItemRegistration.WILD_STRAWBERRIES);
    }
}
