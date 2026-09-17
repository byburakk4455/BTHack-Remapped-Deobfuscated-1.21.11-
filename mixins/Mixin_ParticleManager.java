/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_2350
 * net.minecraft.class_2680
 * net.minecraft.class_775
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.injection.At
 * org.spongepowered.asm.mixin.injection.Inject
 * org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.ferra13671.bthack.mixins;

import com.ferra13671.bthack.BlockRenderHook;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_775;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_775.class})
public class Mixin_ParticleManager {
 @Inject(method={"method_29710"}, at={@At(value="HEAD")}, cancellable=true)
 private static void OIcrYv_irMpQqTNiCLCQSBtWvuaAmaXv(class_2350 FRgJFFpDGTBUWZWkQsNyymkpkMEYXhiK, float dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC, class_2680 BrJZVBxTZTBHPeLfwxd_GgIQiSTjFVCx, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 BlockRenderHook.Z_NtyGXyHiTmk_PHxfRxusHNUMsLaDcn(aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad);
 }
}

