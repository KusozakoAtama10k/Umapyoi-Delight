package com.ka10k.umapyoidelight.block;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.block.crop.ChiliCrop;
import com.ka10k.umapyoidelight.block.crop.GarlicCrop;
import com.ka10k.umapyoidelight.block.crop.StrawberryCrop;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.WildCropBlock;


public class BlockRegistration {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Umapyoidelight.MOD_ID);

    public static final RegistryObject<Block> CHILI_CROP = BLOCKS.register("chili_pepper_crop",
            () -> new ChiliCrop(Block.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> GARLIC_CROP = BLOCKS.register("garlic_crop",
            () -> new GarlicCrop(Block.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop",
            () -> new StrawberryCrop(Block.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> WILD_CHILIS = BLOCKS.register("wild_chili_peppers",
            () -> new WildCropBlock(MobEffects.JUMP, 6, Block.Properties.copy(Blocks.TALL_GRASS)));

    public static final RegistryObject<Block> WILD_GARLIC = BLOCKS.register("wild_garlic",
            () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6, Block.Properties.copy(Blocks.TALL_GRASS)));

    public static final RegistryObject<Block> WILD_STRAWBERRIES = BLOCKS.register("wild_strawberries",
            () -> new WildCropBlock(MobEffects.REGENERATION, 6, Block.Properties.copy(Blocks.TALL_GRASS)));

    public static final RegistryObject<Block> CHILI_CRATE = BLOCKS.register("chili_pepper_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CHILI_CRATE_RARE = BLOCKS.register("chili_pepper_crate_rare",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GARLIC_CRATE = BLOCKS.register("garlic_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GARLIC_CRATE_RARE = BLOCKS.register("garlic_crate_rare",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRAWBERRY_CRATE = BLOCKS.register("strawberry_crate",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRAWBERRY_CRATE_RARE = BLOCKS.register("strawberry_crate_rare",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CARROT_CRATE_RARE = BLOCKS.register("carrot_crate_rare",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> POTATO_CRATE_RARE = BLOCKS.register("potato_crate_rare",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> POTATO_GARLIC_PIZZA = BLOCKS.register("potato_garlic_pizza",
            () -> new PotatoGarlicPizzaBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));

    public static final RegistryObject<Block> POTATO_GARLIC_PIZZA_RARE = BLOCKS.register("potato_garlic_pizza_rare",
            () -> new PotatoGarlicPizzaBlockRare(BlockBehaviour.Properties.copy(Blocks.CAKE)));
}
