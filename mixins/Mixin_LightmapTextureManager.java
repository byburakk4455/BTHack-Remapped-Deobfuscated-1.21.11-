/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_11285
 * net.minecraft.class_7285
 * net.minecraft.class_758
 * org.joml.Vector4f
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 * org.spongepowered.asm.mixin.Unique
 */
package com.ferra13671.bthack.mixins;

import java.nio.ByteBuffer;
import net.minecraft.class_11285;
import net.minecraft.class_7285;
import net.minecraft.class_758;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_758.class})
public abstract class Mixin_LightmapTextureManager {
 @Shadow
 @Final
 private class_11285 field_60098;
 @Unique
 private class_7285 sDRJXlomnnOqNaiQPmkFwYIrMJiQjnRB;

 @Shadow
 protected abstract void method_71110(ByteBuffer var1, int var2, Vector4f var3, float var4, float var5, float var6, float var7, float var8, float var9);
}

