/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_11279
 * net.minecraft.class_11661
 * net.minecraft.class_11684
 * net.minecraft.class_310
 * net.minecraft.class_757
 * org.joml.Matrix4f
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_11279;
import net.minecraft.class_11661;
import net.minecraft.class_11684;
import net.minecraft.class_310;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_757.class})
public abstract class Mixin_GameRenderer {
 @Shadow
 @Final
 private class_310 field_4015;
 @Shadow
 @Final
 private class_11279 field_60106;
 @Shadow
 @Final
 private class_11661 field_61733;
 @Shadow
 @Final
 private class_11684 field_61734;

 @Shadow
 protected abstract void method_3172(float var1, boolean var2, Matrix4f var3);
}

