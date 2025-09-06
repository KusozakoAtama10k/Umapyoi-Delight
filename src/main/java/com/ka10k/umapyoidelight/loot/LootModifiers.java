package com.ka10k.umapyoidelight.loot;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class LootModifiers
{
	public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Umapyoidelight.MOD_ID);

	public static final Supplier<MapCodec<? extends IGlobalLootModifier>> ADD_LOOT_TABLE = LOOT_MODIFIERS.register("add_loot_table", LootTableModifier.CODEC);
}
