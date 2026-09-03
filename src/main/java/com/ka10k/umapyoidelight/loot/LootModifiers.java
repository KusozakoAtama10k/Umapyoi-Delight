package com.ka10k.umapyoidelight.loot;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.mojang.serialization.Codec;
import io.github.fabricators_of_create.porting_lib.loot.IGlobalLootModifier;
import io.github.fabricators_of_create.porting_lib.loot.PortingLibLoot;
import io.github.fabricators_of_create.porting_lib.util.LazyRegistrar;
import io.github.fabricators_of_create.porting_lib.util.RegistryObject;

public class LootModifiers {
    public static final LazyRegistrar<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = LazyRegistrar.create(PortingLibLoot.GLOBAL_LOOT_MODIFIER_SERIALIZERS_KEY, Umapyoidelight.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_LOOT_TABLE = LOOT_MODIFIERS.register("add_loot_table", LootTableModifier.CODEC);
}