package com.ka10k.umapyoidelight.block;

import com.ka10k.umapyoidelight.block.crop.ChiliCrop;
import com.ka10k.umapyoidelight.block.crop.GarlicCrop;
import com.ka10k.umapyoidelight.block.crop.StrawberryCrop;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

import static com.ka10k.umapyoidelight.util.regUtilsUD.regBlock;


public class BlockRegistration {

    public static final Supplier<Block> CHILI_CROP = regBlock("chili_pepper_crop",
            () -> new ChiliCrop(Block.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final Supplier<Block> GARLIC_CROP = regBlock("garlic_crop",
            () -> new GarlicCrop(Block.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final Supplier<Block> STRAWBERRY_CROP = regBlock("strawberry_crop",
            () -> new StrawberryCrop(Block.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final Supplier<Block> WILD_CHILIS = regBlock("wild_chili_peppers",
            () -> new WildCropBlock(MobEffects.JUMP, 6, Block.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> WILD_GARLIC = regBlock("wild_garlic",
            () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6, Block.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> WILD_STRAWBERRIES = regBlock("wild_strawberries",
            () -> new WildCropBlock(MobEffects.REGENERATION, 8, Block.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> CHILI_CRATE = regBlock("chili_pepper_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> CHILI_CRATE_RARE = regBlock("chili_pepper_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> GARLIC_CRATE = regBlock("garlic_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> GARLIC_CRATE_RARE = regBlock("garlic_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> STRAWBERRY_CRATE = regBlock("strawberry_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> STRAWBERRY_CRATE_RARE = regBlock("strawberry_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> CARROT_CRATE_RARE = regBlock("carrot_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> POTATO_CRATE_RARE = regBlock("potato_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final Supplier<Block> COFFEE_DECO = regBlock("manhattan_cafe_coffee_deco",
            () -> new MugcupBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FLOWER_POT).noTerrainParticles().destroyTime(0.1F)));

    public static final Supplier<Block> YAKISOBA_DECO = regBlock("gold_ship_yakisoba_deco",
            () -> new YakisobaDecoBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE).sound(SoundType.BAMBOO_SAPLING)));

    public static final Supplier<Block> CARROT_HAMBURG_DECO = regBlock("carrot_hamburg_deco",
            () -> new CarrotHamburgBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE).strength(0.5F, 0.5F)));

    public static final Supplier<Block> CARROT_HAMBURG_DELUXE_DECO = regBlock("carrot_hamburg_deluxe_deco",
            () -> new CarrotHamburgDeluxeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE).strength(0.5F, 0.5F)));

    public static final Supplier<Block> WOODCHIP_BLOCK = regBlock("woodchip_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.5F, 0.5F).sound(SoundType.AZALEA)));

    public static final Supplier<Block> WOODCHIP_ROAD = regBlock("woodchip_road",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.ofFullCopy(WOODCHIP_BLOCK.get())));


    public static final Supplier<Block> POTATO_GARLIC_PIZZA = regBlock("potato_garlic_pizza",
            () -> new PotatoGarlicPizzaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));

    public static final Supplier<Block> POTATO_GARLIC_PIZZA_RARE = regBlock("potato_garlic_pizza_rare",
            () -> new PotatoGarlicPizzaBlockRare(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));

    public static final Supplier<Block> CARROT_CAKE = regBlock("carrot_cake",
            () -> new CarrotCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemRegistration.CARROT_CAKE_SLICE));

    public static final Supplier<Block> CARROT_PIE = regBlock("carrot_pie",
            () -> new PieBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemRegistration.CARROT_PIE_SLICE));

    public static final Supplier<Block> YAKISOBA_PILE = regBlock("pile_of_yakisoba",
            () -> new YakisobaPileBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE).sound(SoundType.BAMBOO_SAPLING)));

    public static void register() {
    }

}
