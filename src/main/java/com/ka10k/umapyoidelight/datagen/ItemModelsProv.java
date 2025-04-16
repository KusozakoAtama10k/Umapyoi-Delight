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

    }
}
