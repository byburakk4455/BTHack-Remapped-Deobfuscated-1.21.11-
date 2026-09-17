/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1058
 * net.minecraft.class_310
 * net.minecraft.class_4587
 * net.minecraft.class_4597
 * net.minecraft.class_4603
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.injection.At
 * org.spongepowered.asm.mixin.injection.Inject
 * org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.ferra13671.bthack.mixins;

import com.ferra13671.bthack.ModuleManager;
import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4603.class})
public class Mixin_ItemRenderer {
 @Inject(method={"method_23070"}, at={@At(value="HEAD")}, cancellable=true)
 private static void anrFqVBvLEbLBXxMDWiWwepzpbAfZhOb(class_4587 meecsCGgqUEronSldNxbfrvdjHJcLySX, class_4597 _wpCR_AYlmamHzsmGdjvJmBeybgLcciT, class_1058 sgBPNubAnpRllKepFkNmkqnjvIOCzYMh, CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 if (ModuleManager.noRender.isEnabled() && ((Boolean)ModuleManager.noRender.CDLodcKkcpVWXnWeqXDCBugZkmrJsjzd.getValue()).booleanValue()) {
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }

 @Inject(method={"method_23069"}, at={@At(value="HEAD")}, cancellable=true)
 private static void WgNn_usbbQRJIIBKiUYkBibyAUjKhKGy(class_310 kPGOyUunuaULefUYVCSwmdNxDL_wEpvp, class_4587 meecsCGgqUEronSldNxbfrvdjHJcLySX, class_4597 _wpCR_AYlmamHzsmGdjvJmBeybgLcciT, CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 if (ModuleManager.noRender.isEnabled() && ((Boolean)ModuleManager.noRender.sicApIDUwQuLOBPqpUMNJNYtQwAhpEtu.getValue()).booleanValue()) {
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }

 @Inject(method={"method_23068"}, at={@At(value="HEAD")}, cancellable=true)
 private static void ZMloBDnruworNIkUuBFKAGYDMGaWrigi(class_1058 sgBPNubAnpRllKepFkNmkqnjvIOCzYMh, class_4587 meecsCGgqUEronSldNxbfrvdjHJcLySX, class_4597 _wpCR_AYlmamHzsmGdjvJmBeybgLcciT, CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 if (ModuleManager.noRender.isEnabled() && ((Boolean)ModuleManager.noRender.XKaBoNwPdIGkzpOQGrPbENXmDrP_IISi.getValue()).booleanValue()) {
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }
}

