package com.ka10k.umapyoidelight.mixin;

import com.ka10k.umapyoidelight.Umapyoidelight;
import com.ka10k.umapyoidelight.item.ItemRegistration;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.renderer.ItemModelShaper;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

    @Shadow
    @Final
    private ItemModelShaper itemModelShaper;

    @Unique
    private BakedModel umapyoidelight$getModel(String name) {
        ModelManager modelManager = this.itemModelShaper.getModelManager();
        ModelResourceLocation modelLocation = new ModelResourceLocation(new ResourceLocation(Umapyoidelight.MOD_ID, name), "inventory");

        return modelManager.getModel(modelLocation);
    }

    @ModifyVariable(
            method = "render(Lnet/minecraft/world/item/ItemStack;" + "Lnet/minecraft/world/item/ItemDisplayContext;" + "Z" + "Lcom/mojang/blaze3d/vertex/PoseStack;" + "Lnet/minecraft/client/renderer/MultiBufferSource;" + "II" + "Lnet/minecraft/client/resources/model/BakedModel;)V",
            at = @At("HEAD"),
            argsOnly = true
    )
    private BakedModel umapyoidelight$renderItem(BakedModel bakedModel, @Local(argsOnly = true) ItemStack stack, @Local(argsOnly = true) ItemDisplayContext renderMode) {
        if (stack.is(ItemRegistration.CARROT_BURGER.get()) && renderMode == ItemDisplayContext.GUI) {
            return umapyoidelight$getModel("carrot_burger_in_gui");
        }

        return bakedModel;
    }

    @ModifyVariable(
            method = "getModel",
            at = @At("STORE"),
            ordinal = 0
    )
    private BakedModel umapyoidelight$getHeldItemModel(BakedModel bakedModel, @Local(argsOnly = true) ItemStack stack) {
        if (stack.is(ItemRegistration.CARROT_BURGER.get())) {
            return umapyoidelight$getModel("carrot_burger_in_world");
        }
        return bakedModel;
    }
}