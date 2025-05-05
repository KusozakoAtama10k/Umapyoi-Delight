package com.ka10k.umapyoidelight.datagen.advancements;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.function.Consumer;

public class AdvancementGen implements ForgeAdvancementProvider.AdvancementGenerator
{
	@Override
	public void generate(HolderLookup.Provider registries, Consumer<Advancement> consumer, ExistingFileHelper existingFileHelper) {
		Advancement root = Advancement.Builder.advancement()
				.display(ItemRegistration.CARROT_CRATE_RARE.get(),
						Component.translatable("umapyoidelight.advancement.root"),
						Component.translatable("umapyoidelight.advancement.root.desc"),
						new ResourceLocation("minecraft:textures/block/oak_planks.png"),
						FrameType.TASK, false, false, false)
				.addCriterion("garlic", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM.get()))
				.addCriterion("chili_pepper", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM.get()))
				.addCriterion("strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
				.requirements(RequirementsStrategy.OR)
				.save(consumer, getNameId("main/root"));

		// Main Branch
		Advancement getCrops = getAdvancement(root, Items.GOLDEN_HOE, "get_crops", FrameType.TASK, true, true, false)
				.addCriterion("garlic", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM.get()))
				.addCriterion("chili_pepper", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM.get()))
				.addCriterion("strawberry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM.get()))
				.requirements(RequirementsStrategy.OR)
				.save(consumer, getNameId("main/get_crops"));

		Advancement cookNormalMeal = getAdvancement(getCrops, ItemRegistration.CARROT_HAMBURG.get(), "cook_normal_meal", FrameType.TASK, true, true, false)
				.addCriterion("carrot_hamburg", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG.get()))
				.addCriterion("carrot_potato_potaufeu", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_POTATO_POTAUFEU.get()))
				.addCriterion("garlic_ramen", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_RAMEN.get()))
				.addCriterion("potato_garlic_pizza", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_GARLIC_PIZZA.get()))
				.addCriterion("mapo_carrot_potato", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.MAPO_CARROT_POTATO.get()))
				.addCriterion("carrot_strawberry_icecream", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_STRAWBERRY_ICECREAM.get()))
				.addCriterion("carrot_hamburg_deluxe", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DELUXE.get()))
				.addCriterion("carrot_potato_potaufeu_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get()))
				.addCriterion("garlic_ramen_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_RAMEN_RARE.get()))
				.addCriterion("potato_garlic_pizza_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_GARLIC_PIZZA_RARE.get()))
				.addCriterion("mapo_carrot_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.MAPO_CARROT_POTATO_RARE.get()))
				.addCriterion("carrot_strawberry_icecream_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get()))
				.requirements(RequirementsStrategy.OR)
				.save(consumer, getNameId("main/cook_normal_meal"));

		Advancement cookGoodMeal = getAdvancement(cookNormalMeal, ItemRegistration.CARROT_HAMBURG_DELUXE.get(), "cook_good_meal", FrameType.TASK, true, true, false)
				.addCriterion("carrot_hamburg_deluxe", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_HAMBURG_DELUXE.get()))
				.addCriterion("carrot_potato_potaufeu_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get()))
				.addCriterion("garlic_ramen_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_RAMEN_RARE.get()))
				.addCriterion("potato_garlic_pizza_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_GARLIC_PIZZA_RARE.get()))
				.addCriterion("mapo_carrot_potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.MAPO_CARROT_POTATO_RARE.get()))
				.addCriterion("carrot_strawberry_icecream_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get()))
				.requirements(RequirementsStrategy.OR)
				.save(consumer, getNameId("main/cook_good_meal"));

		Advancement cookGIPlate = getAdvancement(cookGoodMeal, ItemRegistration.GI_PLATE.get(), "cook_g1_plate", FrameType.GOAL, true, true, false)
				.addCriterion("g1_plate", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GI_PLATE.get()))
				.save(consumer, getNameId("main/cook_g1_plate"));

		Advancement getRareCrops = getAdvancement(getCrops, ItemRegistration.CARROT_ITEM_RARE.get(), "get_rare_crops", FrameType.TASK, true, true, false)
				.addCriterion("carrot_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CARROT_ITEM_RARE.get()))
				.addCriterion("garlic_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.GARLIC_ITEM_RARE.get()))
				.addCriterion("potato_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.POTATO_ITEM_RARE.get()))
				.addCriterion("chili_pepper_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHILI_ITEM_RARE.get()))
				.addCriterion("strawberry_rare", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.STRAWBERRY_ITEM_RARE.get()))
				.requirements(RequirementsStrategy.OR)
				.save(consumer, getNameId("main/get_rare_crops"));

		Advancement craftChoiceVegetables = getAdvancement(getRareCrops, ItemRegistration.CHOICE_VEGETABLES.get(), "craft_choice_vegetables", FrameType.GOAL, true, true, false)
				.addCriterion("choice_vegetables", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.CHOICE_VEGETABLES.get()))
				.save(consumer, getNameId("main/craft_choice_vegetables"));

		Advancement eatAllMeals = getAdvancement(cookGIPlate, ItemRegistration.GI_PLATE.get(), "consume_all_cookable_foods", FrameType.CHALLENGE, true, true, false)
				.addCriterion("eat_hamburg", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.HAMBURG.get()))
				.addCriterion("eat_carrot_hamburg", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.CARROT_HAMBURG.get()))
				.addCriterion("eat_carrot_hamburg_deluxe", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.CARROT_HAMBURG_DELUXE.get()))
				.addCriterion("eat_carrot_potato_potaufeu", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.CARROT_POTATO_POTAUFEU.get()))
				.addCriterion("eat_carrot_potato_potaufeu_rare", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.CARROT_POTATO_POTAUFEU_RARE.get()))
				.addCriterion("eat_garlic_ramen_rare", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.GARLIC_RAMEN.get()))
				.addCriterion("eat_garlic_ramen_rare_rare", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.GARLIC_RAMEN_RARE.get()))
				.addCriterion("eat_potato_garlic_pizza", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE.get()))
				.addCriterion("eat_potato_garlic_pizza_rare", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.POTATO_GARLIC_PIZZA_SLICE_RARE.get()))
				.addCriterion("eat_mapo_carrot_potato", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.MAPO_CARROT_POTATO.get()))
				.addCriterion("eat_mapo_carrot_potato_rare", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.MAPO_CARROT_POTATO_RARE.get()))
				.addCriterion("eat_carrot_strawberry_icecream", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.CARROT_STRAWBERRY_ICECREAM.get()))
				.addCriterion("eat_carrot_strawberry_icecream_rare", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.CARROT_STRAWBERRY_ICECREAM_RARE.get()))
				.addCriterion("eat_g1_plate", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.GI_PLATE.get()))
				.addCriterion("eat_white_bread", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.WHITE_BREAD.get()))
				.addCriterion("eat_toast", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.TOAST.get()))
				.addCriterion("eat_toast_strawberry_jam", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.TOAST_STRAWBERRY_JAM.get()))
				.addCriterion("drink_carrot_juice", ConsumeItemTrigger.TriggerInstance.usedItem(ItemRegistration.CARROT_JUICE.get()))
				.rewards(AdvancementRewards.Builder.experience(150))
				.save(consumer, getNameId("main/consume_all_cookable_foods"));

		Advancement tradeSpecialItems = getAdvancement(getCrops, ItemRegistration.COFFEE.get(), "trade_special_items", FrameType.TASK, true, true, false)
				.addCriterion("manhattan_cafe_coffee", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.COFFEE.get()))
				.addCriterion("gold_ship_yakisoba", InventoryChangeTrigger.TriggerInstance.hasItems(ItemRegistration.YAKISOBA.get()))
				.save(consumer, getNameId("main/trade_special_items"));

	}

	protected static Advancement.Builder getAdvancement(Advancement parent, ItemLike display, String name, FrameType frame, boolean showToast, boolean announceToChat, boolean hidden) {
		return Advancement.Builder.advancement().parent(parent).display(display,
				Component.translatable("umapyoidelight.advancement." + name),
				Component.translatable("umapyoidelight.advancement." + name + ".desc"),
				null, frame, showToast, announceToChat, hidden);
	}

	private String getNameId(String id) {
		return Umapyoidelight.MOD_ID + ":" + id;
	}
}
