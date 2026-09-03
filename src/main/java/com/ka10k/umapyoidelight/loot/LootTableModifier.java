package com.ka10k.umapyoidelight.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.github.fabricators_of_create.porting_lib.loot.IGlobalLootModifier;
import io.github.fabricators_of_create.porting_lib.loot.LootModifier;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.mixin.accessor.LootContextAccessor;

import java.util.function.Supplier;

import static com.ka10k.umapyoidelight.Umapyoidelight.CONFIG;

public class LootTableModifier extends LootModifier {
    public static final Supplier<Codec<LootTableModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create(inst -> LootModifier.codecStart(inst)
                    .and(ResourceLocation.CODEC.fieldOf("lootTable").forGetter((m) -> m.lootTable))
                    .apply(inst, LootTableModifier::new)));

    private final ResourceLocation lootTable;

    protected LootTableModifier(LootItemCondition[] conditions, ResourceLocation lootTable) {
        super(conditions);
        this.lootTable = lootTable;
    }

    @NotNull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        if (CONFIG.GENERATE_UD_LOOT) {
            LootTable extraTable = context.getResolver().getLootTable(this.lootTable);
            LootContext newContext = new LootContext.Builder(((LootContextAccessor) context).getParams()).create(this.lootTable);
            extraTable.getRandomItemsRaw(newContext, LootTable.createStackSplitter(context.getLevel(), generatedLoot::add));
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
