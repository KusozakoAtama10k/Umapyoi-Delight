package com.ka10k.umapyoidelight.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ForgeTagsUD
{
	// Blocks that are efficiently mined with a Knife.
	public static final TagKey<Block> STORAGE_BLOCKS_GARLIC = forgeBlockTag("storage_blocks/garlic");
	public static final TagKey<Block> STORAGE_BLOCKS_CHILI = forgeBlockTag("storage_blocks/chilipepper");
	public static final TagKey<Block> STORAGE_BLOCKS_STRAWBERRY = forgeBlockTag("storage_blocks/strawberry");

	public static final TagKey<Item> BERRIES_STRAWBERRY = forgeItemTag("berries/strawberry");

	public static final TagKey<Item> CROPS_CHILI = forgeItemTag("crops/chilipepper");
	public static final TagKey<Item> CROPS_GARLIC = forgeItemTag("crops/garlic");
	public static final TagKey<Item> CROPS_STRAWBERRY = forgeItemTag("crops/strawberry");

	public static final TagKey<Item> VEGETABLES_CHILI = forgeItemTag("vegetables/chilipepper");
	public static final TagKey<Item> VEGETABLES_GARLIC = forgeItemTag("vegetables/garlic");

	public static final TagKey<Item> FRUITS = forgeItemTag("fruits");
	public static final TagKey<Item> FRUITS_STRAWBERRY = forgeItemTag("fruits/strawberry");

	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_CHILI = forgeItemTag("storage_blocks/chilipepper");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_GARLIC = forgeItemTag("storage_blocks/garlic");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_STRAWBERRY = forgeItemTag("storage_blocks/strawberry");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_CABBAGE = forgeItemTag("storage_blocks/cabbage");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_TOMATO = forgeItemTag("storage_blocks/tomato");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_ONION = forgeItemTag("storage_blocks/onion");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_RICE = forgeItemTag("storage_blocks/rice");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_RICE_PANICLE = forgeItemTag("storage_blocks/rice_panicle");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_STRAW = forgeItemTag("storage_blocks/straw");

	private static TagKey<Block> forgeBlockTag(String path) {
		return BlockTags.create(new ResourceLocation("forge", path));
	}

	private static TagKey<Item> forgeItemTag(String path) {
		return ItemTags.create(new ResourceLocation("forge", path));
	}

}
