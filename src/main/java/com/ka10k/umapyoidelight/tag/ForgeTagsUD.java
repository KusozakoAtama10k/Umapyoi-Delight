package com.ka10k.umapyoidelight.tag;

import com.ka10k.umapyoidelight.Umapyoidelight;

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
	public static final TagKey<Item> CROPS_COCOA_BEANS = forgeItemTag("crops/cocoabeans");

	public static final TagKey<Item> VEGETABLES_CHILI = forgeItemTag("vegetables/chilipepper");
	public static final TagKey<Item> VEGETABLES_GARLIC = forgeItemTag("vegetables/garlic");

	public static final TagKey<Item> FRUITS = forgeItemTag("fruits");
	public static final TagKey<Item> FRUITS_STRAWBERRY = forgeItemTag("fruits/strawberry");

	public static final TagKey<Item> CHOCOLATES = forgeItemTag("chocolates");

	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_CHILI = forgeItemTag("storage_blocks/chilipepper");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_GARLIC = forgeItemTag("storage_blocks/garlic");
	public static final TagKey<Item> STORAGE_BLOCKS_ITEM_STRAWBERRY = forgeItemTag("storage_blocks/strawberry");
	
	// Add original tag for other mod's compatibility, like Sakura.
	public static final TagKey<Item> BURGER_MEAT = externalItemTag(Umapyoidelight.MOD_ID, "burger_meat");

	private static TagKey<Item> externalItemTag(String modId, String path) {
		return ItemTags.create(new ResourceLocation(modId, path));
	}
	
	private static TagKey<Block> forgeBlockTag(String path) {
		return BlockTags.create(new ResourceLocation("forge", path));
	}

	private static TagKey<Item> forgeItemTag(String path) {
		return ItemTags.create(new ResourceLocation("forge", path));
	}

}
