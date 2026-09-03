//package com.ka10k.umapyoidelight.datagen;
//
//import com.ka10k.umapyoidelight.Umapyoidelight;
//import com.ka10k.umapyoidelight.block.BlockRegistration;
//import com.ka10k.umapyoidelight.block.crop.ChiliCrop;
//import com.ka10k.umapyoidelight.block.crop.GarlicCrop;
//import com.ka10k.umapyoidelight.block.crop.StrawberryCrop;
//import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
//import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.data.models.BlockModelGenerators;
//import net.minecraft.data.models.ItemModelGenerators;
//import net.minecraft.data.models.model.ModelTemplate;
//import net.minecraft.data.models.model.ModelTemplates;
//import net.minecraft.data.models.model.TextureMapping;
//import net.minecraft.data.models.model.TextureSlot;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.state.properties.IntegerProperty;
//import net.minecraft.world.level.block.state.properties.Property;
//import vectorwing.farmersdelight.FarmersDelight;
//import vectorwing.farmersdelight.common.block.FeastBlock;
//
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//public class BlockStatesProv extends FabricModelProvider {
//    public BlockStatesProv(FabricDataOutput output) {
//        super(output);
//    }
//
//    private String blockName(Block block) {
//        return BuiltInRegistries.BLOCK.getKey(block).getPath();
//    }
//
//    public String blockTextureName(String path) {
//        return Umapyoidelight.MOD_ID + "block/" + path;
//    }
//
//    public ResourceLocation resourceBlock(String path) {
//        return new ResourceLocation(Umapyoidelight.MOD_ID, "block/" + path);
//    }
//
//    public ResourceLocation FDresource(String path) {
//        return new ResourceLocation(FarmersDelight.MODID, "block/" + path);
//    }
//
//    private void CrateBlock(BlockModelGenerators generator, Block block, String cropName) {
//        ResourceLocation blockModel = resourceBlock(BuiltInRegistries.BLOCK.getKey(block).getPath());
//
//        TextureMapping textures = new TextureMapping()
//                .put(TextureSlot.SIDE, resourceBlock(cropName + "_crate_side"))
//                .put(TextureSlot.BOTTOM, FDresource("crate_bottom"))
//                .put(TextureSlot.TOP, resourceBlock(cropName + "_crate_top"));
//        ModelTemplates.CUBE_BOTTOM_TOP.create(blockModel, textures, generator.modelOutput);
//        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, blockModel));
//    }
//
//    private void CrateBlockRare(BlockModelGenerators generator, Block block, String cropName) {
//        ResourceLocation blockModel = resourceBlock(BuiltInRegistries.BLOCK.getKey(block).getPath());
//
//        TextureMapping textures = new TextureMapping()
//                .put(TextureSlot.SIDE, resourceBlock(cropName + "_crate_rare_side"))
//                .put(TextureSlot.BOTTOM, FDresource("crate_bottom"))
//                .put(TextureSlot.TOP, resourceBlock(cropName + "_crate_top"));
//        ModelTemplates.CUBE_BOTTOM_TOP.create(blockModel, textures, generator.modelOutput);
//        generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, blockModel));
//    }
//
//    public void customStageBlock(BlockModelGenerators generator, Block block, @Nullable ResourceLocation parent, String textureKey, IntegerProperty ageProperty, List<Integer> suffixes, Property<?>... ignored) {
//        for (int age : ageProperty.getPossibleValues()) {
//            int ageSuffix = suffixes.isEmpty() ? age : suffixes.get(Math.min(suffixes.size() - 1, age));
//            String stageName = blockName(block) + "_stage" + ageSuffix;
//            ResourceLocation modelId = resourceBlock(stageName);
//            if (parent == null) {
//                ModelTemplates.CROSS.create(modelId, TextureMapping.cross(resourceBlock(stageName)), generator.modelOutput);
//            } else {
//                TextureSlot slot = textureKey.equals("cross") ? TextureSlot.CROSS : TextureSlot.TEXTURE;
//                new ModelTemplate(Optional.of(parent), Optional.empty(), slot).create(modelId, TextureMapping.singleSlot(slot, resourceBlock(stageName)),
//                        generator.modelOutput
//                );
//            }
//        }
//    }
//
//    public void feastBlock(FeastBlock block) {
//        getVariantBuilder(block)
//                .forAllStates(state -> {
//                    IntegerProperty servingsProperty = block.getServingsProperty();
//                    int servings = state.getValue(servingsProperty);
//
//                    String suffix = "_stage" + (block.getMaxServings() - servings);
//
//                    if (servings == 0) {
//                        suffix = block.hasLeftovers ? "_leftover" : "_stage" + (servingsProperty.getPossibleValues().toArray().length - 2);
//                    }
//
//                    return ConfiguredModel.builder()
//                            .modelFile(existingModel(blockName(block) + suffix))
//                            .rotationY(((int) state.getValue(FeastBlock.FACING).toYRot() + 180) % 360)
//                            .build();
//                });
//    }
//
//    public void wildCropBlock(Block block, boolean isBushCrop) {
//        if (isBushCrop) {
//            this.simpleBlock(block, models().singleTexture(blockName(block), resourceBlock("bush_crop"), "crop", resourceBlock(blockName(block))).renderType("cutout"));
//        } else {
//            this.simpleBlock(block, models().cross(blockName(block), resourceBlock(blockName(block))).renderType("cutout"));
//        }
//    }
//
//
//    @Override
//    public void generateBlockStateModels(BlockModelGenerators generator) {
//        CrateBlock(generator, BlockRegistration.CHILI_CRATE.get(),"chili_pepper");
//        CrateBlock(generator, BlockRegistration.GARLIC_CRATE.get(),"garlic");
//        CrateBlock(generator, BlockRegistration.STRAWBERRY_CRATE.get(),"strawberry");
//        CrateBlockRare(generator, BlockRegistration.CHILI_CRATE_RARE.get(),"chili_pepper");
//        CrateBlockRare(generator, BlockRegistration.GARLIC_CRATE_RARE.get(),"garlic");
//        CrateBlockRare(generator, BlockRegistration.STRAWBERRY_CRATE_RARE.get(),"strawberry");
//        CrateBlockRare(generator, BlockRegistration.CARROT_CRATE_RARE.get(), "carrot");
//        CrateBlockRare(generator, BlockRegistration.POTATO_CRATE_RARE.get(), "potato");
//        customStageBlock(BlockRegistration.CHILI_CROP.get(), FDresource("template_crop_cross"), "cross", ChiliCrop.AGE, Arrays.asList(0, 0, 1, 1, 2, 2, 3, 4));
//        customStageBlock(BlockRegistration.GARLIC_CROP.get(), mcLoc("crop"), "crop", GarlicCrop.AGE, Arrays.asList(0, 0, 1, 1, 2, 2, 2, 3));
//        customStageBlock(BlockRegistration.STRAWBERRY_CROP.get(), mcLoc("crop"), "crop", StrawberryCrop.AGE, Arrays.asList(0, 1, 1, 1, 2, 2, 3, 4));
//        feastBlock((FeastBlock) BlockRegistration.POTATO_GARLIC_PIZZA.get());
//        feastBlock((FeastBlock) BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get());
//        wildCropBlock(BlockRegistration.WILD_CHILIS.get(), false);
//        wildCropBlock(BlockRegistration.WILD_GARLIC.get(), false);
//        wildCropBlock(BlockRegistration.WILD_STRAWBERRIES.get(), false);
//        simpleBlockWithItem(BlockRegistration.WOODCHIP_BLOCK.get(),models().cubeAll("woodchip_block",resourceBlock("woodchip")));
//        feastBlock((FeastBlock) BlockRegistration.YAKISOBA_PILE.get());
//    }
//
//    @Override
//    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
//
//    }
//}
