package com.ka10k.umapyoidelight.tag;

import com.ka10k.umapyoidelight.Umapyoidelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CommonTagsUD
{
	// Blocks that are efficiently mined with a Knife.
	public static final TagKey<Block> STORAGE_BLOCKS_GARLIC = commonBlockTag("storage_blocks/garlic");
	public static final TagKey<Block> STORAGE_BLOCKS_CHILI = commonBlockTag("storage_blocks/chilipepper");
	public static final TagKey<Block> STORAGE_BLOCKS_STRAWBERRY = commonBlockTag("storage_blocks/strawberry");

	public static final TagKey<Item> BERRIES_STRAWBERRY = commonItemTag("berry/strawberry");

	public static final TagKey<Item> CROPS_CHILI = commonItemTag("crops/chilipepper");
	public static final TagKey<Item> CROPS_GARLIC = commonItemTag("crops/garlic");
	public static final TagKey<Item> CROPS_STRAWBERRY = commonItemTag("crops/strawberry");

	public static final TagKey<Item> SUGAR = commonItemTag("sugar");
	public static final TagKey<Item> CHOCOLATES = commonItemTag("chocolates");
	public static final TagKey<Item> CHEESES = commonItemTag("cheeses");


	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_CHILI = commonItemTag("storage_blocks/chilipepper");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_GARLIC = commonItemTag("storage_blocks/garlic");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_STRAWBERRY = commonItemTag("storage_blocks/strawberry");
	
	// Add original tag for other mod's compatibility, like Sakura.
	public static final TagKey<Item> FOODS_BURGER_MEAT = externalItemTag(Umapyoidelight.MOD_ID, "foods/burger_meat");

	private static TagKey<Item> externalItemTag(String modId, String path) {
		return ItemTags.create(ResourceLocation.fromNamespaceAndPath(modId, path));
	}
	
	private static TagKey<Block> commonBlockTag(String path) {
		return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
	}

	private static TagKey<Item> commonItemTag(String path) {
		return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
	}

}
