/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_2248
 * net.minecraft.class_2350
 * net.minecraft.class_2680
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.injection.At
 * org.spongepowered.asm.mixin.injection.Inject
 * org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.ferra13671.bthack.mixins;

import com.ferra13671.bthack.BlockRenderHook;
import net.minecraft.class_2248;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2248.class})
public class Mixin_Block {
 @Inject(method={"method_9607"}, at={@At(value="HEAD")}, cancellable=true)
 private static void LtbfmRJOIbvUSLnOTDCqZxNtiwHrSXDD(class_2680 BrJZVBxTZTBHPeLfwxd_GgIQiSTjFVCx, class_2680 erWYyXfcbyEUtTbaxhxbVZa_NgyyVzHo, class_2350 FRgJFFpDGTBUWZWkQsNyymkpkMEYXhiK, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 BlockRenderHook.hRdvnJdhBUiqjGIeZwJFMkIwRWDqIClO(BrJZVBxTZTBHPeLfwxd_GgIQiSTjFVCx, erWYyXfcbyEUtTbaxhxbVZa_NgyyVzHo, aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad);
 }
}

