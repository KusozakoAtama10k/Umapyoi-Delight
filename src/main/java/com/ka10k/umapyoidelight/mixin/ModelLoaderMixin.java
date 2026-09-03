package com.ka10k.umapyoidelight.mixin;


import com.ka10k.umapyoidelight.Umapyoidelight;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelBakery.class)
public abstract class ModelLoaderMixin {

    @Shadow
    protected abstract void loadTopLevel(ModelResourceLocation modelResourceLocation);

    @Inject(
            method = "<init>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/resources/model/ModelBakery;loadTopLevel(Lnet/minecraft/client/resources/model/ModelResourceLocation;)V",
                    ordinal = 1,
                    shift = At.Shift.AFTER
            )
    )
    private void onInit(CallbackInfo ci) throws Exception {
        this.loadTopLevel(new ModelResourceLocation(new ResourceLocation(Umapyoidelight.MOD_ID, "carrot_burger_in_gui"), "inventory"));
        this.loadTopLevel(new ModelResourceLocation(new ResourceLocation(Umapyoidelight.MOD_ID, "carrot_burger_in_world"), "inventory"));
    }
}
