package com.ka10k.umapyoidelight.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.tracen.umapyoi.api.UmapyoiAPI;
import net.tracen.umapyoi.item.ItemFoodBase;
import net.tracen.umapyoi.item.info.FoodInfo;

import java.util.function.Consumer;

import static com.ka10k.umapyoidelight.item.ItemRegistration.basicItem;


public class StickUmaFood extends ItemFoodBase {
    private final Consumer<ItemStack> consumer;

    public StickUmaFood(Consumer<ItemStack> consumer, FoodInfo info) {
        super(basicItem(), info);
        this.consumer = consumer;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack itemstack = this.isEdible() ? this.eatAsUma(stack, level, entity) : stack;
        if (stack.getCount() > 0) {
            if (entity instanceof Player) {
                Player entityplayer = (Player) entity;
                if (entityplayer.getAbilities().instabuild)
                    return itemstack;
                if (!entityplayer.addItem(Items.STICK.getDefaultInstance()))
                    entityplayer.drop(Items.STICK.getDefaultInstance(), true);
            }
            return itemstack;
        }
        return entity instanceof Player && ((Player) entity).getAbilities().instabuild ? itemstack
                : Items.STICK.getDefaultInstance();
    }

    private ItemStack eatAsUma(ItemStack stack, Level level, LivingEntity entity) {
        if (entity instanceof Player player) {
            if (UmapyoiAPI.getUmaSoul(player).isEmpty()) {
                FoodInfo info = this.getFoodInfo();
                player.getFoodData().eat(info.getAmount(), info.getCalories());
                if (!player.getAbilities().instabuild)
                    stack.shrink(1);
                return stack;
            } else {
                this.consumer.accept(UmapyoiAPI.getUmaSoul(player));
            }
        }
        return entity.eat(level, stack);
    }

}
