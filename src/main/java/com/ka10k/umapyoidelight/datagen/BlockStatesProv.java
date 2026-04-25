package com.ka10k.umapyoidelight.datagen;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.block.BlockRegistration;
import com.ka10k.umapyoidelight.block.crop.ChiliCrop;
import com.ka10k.umapyoidelight.block.crop.GarlicCrop;
import com.ka10k.umapyoidelight.block.crop.StrawberryCrop;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.block.FeastBlock;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class BlockStatesProv extends BlockStateProvider {
    public BlockStatesProv(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Umapyoidelight.MOD_ID, exFileHelper);
    }

    private String blockName(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    public String blockTextureName(String path) {
        return Umapyoidelight.MOD_ID + "block/" + path;
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(Umapyoidelight.MOD_ID, "block/" + path);
    }

    public ResourceLocation FDresource(String path) {
        return new ResourceLocation(FarmersDelight.MODID, "block/" + path);
    }

    private void CrateBlock(Block block, String cropName) {
        simpleBlockWithItem(block, models().cubeBottomTop(blockName(block), resourceBlock(cropName + "_crate_side"), FDresource("crate_bottom"), resourceBlock(cropName + "_crate_top")));
    }

    private void CrateBlockRare(Block block, String cropName) {
        simpleBlockWithItem(block, models().cubeBottomTop(blockName(block), resourceBlock(cropName + "_crate_rare_side"), FDresource("crate_bottom"), resourceBlock(cropName + "_crate_top")));
    }

    public ModelFile existingModel(String path) {
        return new ModelFile.ExistingModelFile(resourceBlock(path), models().existingFileHelper);
    }

    public void customStageBlock(Block block, @Nullable ResourceLocation parent, String textureKey, IntegerProperty ageProperty, List<Integer> suffixes, Property<?>... ignored) {
        getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    int ageSuffix = state.getValue(ageProperty);
                    String stageName = blockName(block) + "_stage";
                    stageName += suffixes.isEmpty() ? ageSuffix : suffixes.get(Math.min(suffixes.size(), ageSuffix));
                    if (parent == null) {
                        return ConfiguredModel.builder()
                                .modelFile(models().cross(stageName, resourceBlock(stageName)).renderType("cutout")).build();
                    }
                    return ConfiguredModel.builder()
                            .modelFile(models().singleTexture(stageName, parent, textureKey, resourceBlock(stageName)).renderType("cutout")).build();
                }, ignored);
    }

    public void feastBlock(FeastBlock block) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    IntegerProperty servingsProperty = block.getServingsProperty();
                    int servings = state.getValue(servingsProperty);

                    String suffix = "_stage" + (block.getMaxServings() - servings);

                    if (servings == 0) {
                        suffix = block.hasLeftovers ? "_leftover" : "_stage" + (servingsProperty.getPossibleValues().toArray().length - 2);
                    }

                    return ConfiguredModel.builder()
                            .modelFile(existingModel(blockName(block) + suffix))
                            .rotationY(((int) state.getValue(FeastBlock.FACING).toYRot() + 180) % 360)
                            .build();
                });
    }

    public void wildCropBlock(Block block, boolean isBushCrop) {
        if (isBushCrop) {
            this.simpleBlock(block, models().singleTexture(blockName(block), resourceBlock("bush_crop"), "crop", resourceBlock(blockName(block))).renderType("cutout"));
        } else {
            this.simpleBlock(block, models().cross(blockName(block), resourceBlock(blockName(block))).renderType("cutout"));
        }
    }


    @Override
    protected void registerStatesAndModels() {
        CrateBlock(BlockRegistration.CHILI_CRATE.get(),"chili_pepper");
        CrateBlock(BlockRegistration.GARLIC_CRATE.get(),"garlic");
        CrateBlock(BlockRegistration.STRAWBERRY_CRATE.get(),"strawberry");
        CrateBlockRare(BlockRegistration.CHILI_CRATE_RARE.get(),"chili_pepper");
        CrateBlockRare(BlockRegistration.GARLIC_CRATE_RARE.get(),"garlic");
        CrateBlockRare(BlockRegistration.STRAWBERRY_CRATE_RARE.get(),"strawberry");
        simpleBlockWithItem(BlockRegistration.CARROT_CRATE_RARE.get(), models().cubeBottomTop(blockName(BlockRegistration.CARROT_CRATE_RARE.get()), resourceBlock( "carrot_crate_rare_side"), FDresource("crate_bottom"), FDresource("carrot_crate_top")));
        simpleBlockWithItem(BlockRegistration.POTATO_CRATE_RARE.get(), models().cubeBottomTop(blockName(BlockRegistration.POTATO_CRATE_RARE.get()), resourceBlock( "potato_crate_rare_side"), FDresource("crate_bottom"), FDresource("potato_crate_top")));
        customStageBlock(BlockRegistration.CHILI_CROP.get(), FDresource("crop_cross"), "cross", ChiliCrop.AGE, Arrays.asList(0, 0, 1, 1, 2, 2, 3, 4));
        customStageBlock(BlockRegistration.GARLIC_CROP.get(), mcLoc("crop"), "crop", GarlicCrop.AGE, Arrays.asList(0, 0, 1, 1, 2, 2, 2, 3));
        customStageBlock(BlockRegistration.STRAWBERRY_CROP.get(), mcLoc("crop"), "crop", StrawberryCrop.AGE, Arrays.asList(0, 1, 1, 1, 2, 2, 3, 4));
        feastBlock((FeastBlock) BlockRegistration.POTATO_GARLIC_PIZZA.get());
        feastBlock((FeastBlock) BlockRegistration.POTATO_GARLIC_PIZZA_RARE.get());
        wildCropBlock(BlockRegistration.WILD_CHILIS.get(), false);
        wildCropBlock(BlockRegistration.WILD_GARLIC.get(), false);
        wildCropBlock(BlockRegistration.WILD_STRAWBERRIES.get(), false);
        simpleBlockWithItem(BlockRegistration.WOODCHIP_BLOCK.get(),models().cubeAll("woodchip_block",resourceBlock("woodchip")));
        feastBlock((FeastBlock) BlockRegistration.YAKISOBA_PILE.get());

    }
}
