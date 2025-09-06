package com.ka10k.umapyoidelight.block;

import com.ka10k.umapyoidelight.Umapyoidelight;
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
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import vectorwing.farmersdelight.common.block.WildCropBlock;


public class BlockRegistration {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Umapyoidelight.MOD_ID);

    public static final DeferredBlock<Block> CHILI_CROP = BLOCKS.register("chili_pepper_crop",
            () -> new ChiliCrop(Block.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final DeferredBlock<Block> GARLIC_CROP = BLOCKS.register("garlic_crop",
            () -> new GarlicCrop(Block.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final DeferredBlock<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop",
            () -> new StrawberryCrop(Block.Properties.ofFullCopy(Blocks.WHEAT)));

    public static final DeferredBlock<Block> WILD_CHILIS = BLOCKS.register("wild_chili_peppers",
            () -> new WildCropBlock(MobEffects.JUMP, 6, Block.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final DeferredBlock<Block> WILD_GARLIC = BLOCKS.register("wild_garlic",
            () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6, Block.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final DeferredBlock<Block> WILD_STRAWBERRIES = BLOCKS.register("wild_strawberries",
            () -> new WildCropBlock(MobEffects.REGENERATION, 8, Block.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final DeferredBlock<Block> CHILI_CRATE = BLOCKS.register("chili_pepper_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CHILI_CRATE_RARE = BLOCKS.register("chili_pepper_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> GARLIC_CRATE = BLOCKS.register("garlic_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> GARLIC_CRATE_RARE = BLOCKS.register("garlic_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> STRAWBERRY_CRATE = BLOCKS.register("strawberry_crate",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> STRAWBERRY_CRATE_RARE = BLOCKS.register("strawberry_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CARROT_CRATE_RARE = BLOCKS.register("carrot_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> POTATO_CRATE_RARE = BLOCKS.register("potato_crate_rare",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> POTATO_GARLIC_PIZZA = BLOCKS.register("potato_garlic_pizza",
            () -> new PotatoGarlicPizzaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));

    public static final DeferredBlock<Block> POTATO_GARLIC_PIZZA_RARE = BLOCKS.register("potato_garlic_pizza_rare",
            () -> new PotatoGarlicPizzaBlockRare(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE)));

    public static final DeferredBlock<Block> CARROT_CAKE = BLOCKS.register("carrot_cake",
            () -> new CarrotCakeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), ItemRegistration.CARROT_CAKE_SLICE));

    public static final DeferredBlock<Block> WOODCHIP_BLOCK = BLOCKS.register("woodchip_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.5F, 0.5F).sound(SoundType.AZALEA)));

    public static final DeferredBlock<Block> WOODCHIP_ROAD = BLOCKS.register("woodchip_road",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.ofFullCopy(WOODCHIP_BLOCK.get())));

}
