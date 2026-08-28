//package com.ka10k.umapyoidelight.datagen;
//
//import com.ka10k.umapyoidelight.Umapyoidelight;
//import com.ka10k.umapyoidelight.item.ItemRegistration;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.data.models.ItemModelGenerators;
//import net.minecraft.data.models.model.ModelTemplates;
//import net.minecraft.data.models.model.TextureMapping;
//import net.minecraft.data.models.model.TextureSlot;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//
//
//public class ItemModelsProv extends FabricModelProvider {
//    public ItemModelsProv(FabricDataOutput output) {
//        super(output);
//    }
//
//    private void simpleItem(ItemModelGenerators generator, Item item) {
//        generator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
//    }
//
//    private void handheldItem(ItemModelGenerators generator, Item item) {
//        generator.generateFlatItem(item, ModelTemplates.FLAT_HANDHELD_ITEM);
//    }
//
//    private void flatBlockItem(ItemModelGenerators generator, Item item) {
//        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(item);
//        TextureMapping textureMapping =
//                new TextureMapping().put(TextureSlot.LAYER0, ResourceLocation.fromNamespaceAndPath(Umapyoidelight.MOD_ID, "block/" + itemId.getPath()));
//        ModelTemplates.FLAT_ITEM.create(itemId, textureMapping, generator.output);
//    }
//
//
//    @Override
//    public void generateItemModels(ItemModelGenerators generator) {
//        simpleItem(generator, ItemRegistration.CHILI_ITEM.get());
//        simpleItem(generator, ItemRegistration.CHILI_ITEM_RARE.get());
//        simpleItem(generator, ItemRegistration.GARLIC_ITEM.get());
//        simpleItem(generator, ItemRegistration.GARLIC_ITEM_RARE.get());
//        simpleItem(generator, ItemRegistration.STRAWBERRY_ITEM.get());
//        simpleItem(generator, ItemRegistration.STRAWBERRY_ITEM_RARE.get());
//        simpleItem(generator, ItemRegistration.CARROT_ITEM_RARE.get());
//        simpleItem(generator, ItemRegistration.POTATO_ITEM_RARE.get());
//        simpleItem(generator, ItemRegistration.CARROT_HAMBURG.get());
//        simpleItem(generator, ItemRegistration.CARROT_HAMBURG_DELUXE.get());
//        simpleItem(generator, ItemRegistration.RAW_HAMBURG.get());
//        simpleItem(generator, ItemRegistration.HAMBURG.get());
//        simpleItem(generator, ItemRegistration.POTATO_GARLIC_PIZZA.get());
//        simpleItem(generator, ItemRegistration.POTATO_GARLIC_PIZZA_RARE.get());
//        simpleItem(generator, ItemRegistration.POTATO_GARLIC_PIZZA_SLICE.get());
//        simpleItem(generator, ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get());
//        simpleItem(generator, ItemRegistration.CARROT_POTATO_POTAUFEU.get());
//        simpleItem(generator, ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get());
//        simpleItem(generator, ItemRegistration.GARLIC_RAMEN.get());
//        simpleItem(generator, ItemRegistration.GARLIC_RAMEN_RARE.get());
//        simpleItem(generator, ItemRegistration.MAPO_CARROT_POTATO.get());
//        simpleItem(generator, ItemRegistration.MAPO_CARROT_POTATO_RARE.get());
//        simpleItem(generator, ItemRegistration.GI_PLATE.get());
//        simpleItem(generator, ItemRegistration.RAW_POTATO_GARLIC_PIZZA.get());
//        simpleItem(generator, ItemRegistration.RAW_POTATO_GARLIC_PIZZA_RARE.get());
//        simpleItem(generator, ItemRegistration.CHOICE_VEGETABLES.get());
//        simpleItem(generator, ItemRegistration.CARROT_JUICE.get());
//        simpleItem(generator, ItemRegistration.STRAWBERRY_JAM.get());
//        simpleItem(generator, ItemRegistration.WHITE_BREAD.get());
//        simpleItem(generator, ItemRegistration.TOAST.get());
//        simpleItem(generator, ItemRegistration.TOAST_STRAWBERRY_JAM.get());
//        simpleItem(generator, ItemRegistration.BREAD_CRUST.get());
//        simpleItem(generator, ItemRegistration.TRIANGLE_BREAD.get());
//        simpleItem(generator, ItemRegistration.STRAWBERRY_SANDWICH.get());
//        simpleItem(generator, ItemRegistration.VEGETABLE_SANDWICH.get());
//        simpleItem(generator, ItemRegistration.SAKURAMOCHI.get());
//        simpleItem(generator, ItemRegistration.POTION.get());
//        simpleItem(generator, ItemRegistration.CARROT_BATTER.get());
//        simpleItem(generator, ItemRegistration.CARROT_DOUGH.get());
//        simpleItem(generator, ItemRegistration.CUT_CARROT.get());
//        simpleItem(generator, ItemRegistration.GRATED_CARROT.get());
//        simpleItem(generator, ItemRegistration.CARROT_BREAD.get());
//        simpleItem(generator, ItemRegistration.CARROT_PUDDING.get());
//        simpleItem(generator, ItemRegistration.CARROT_CAKE.get());
//        simpleItem(generator, ItemRegistration.CARROT_CAKE_SLICE.get());
//        simpleItem(generator, ItemRegistration.CARROT_PIE.get());
//        simpleItem(generator, ItemRegistration.CARROT_PIE_SLICE.get());
//        simpleItem(generator, ItemRegistration.COFFEE_DECO.get());
//        simpleItem(generator, ItemRegistration.YAKISOBA_DECO.get());
//
//        handheldItem(generator, ItemRegistration.CARROT_STRAWBERRY_ICECREAM.get());
//        handheldItem(generator, ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get());
//        handheldItem(generator, ItemRegistration.RAW_STICK_CARROT.get());
//        handheldItem(generator, ItemRegistration.GRILLED_STICK_CARROT.get());
//        handheldItem(generator, ItemRegistration.CHOCOLATE_STICK_CARROT.get());
//
//        flatBlockItem(generator, ItemRegistration.WILD_CHILIS.get());
//        flatBlockItem(generator, ItemRegistration.WILD_GARLIC.get());
//        flatBlockItem(generator, ItemRegistration.WILD_STRAWBERRIES.get());
//
//        blockItem(generator, ItemRegistration.CARROT_HAMBURG_DELUXE_DECO.get());
//    }
//}
