/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.mojang.blaze3d.textures.GpuTexture
 * com.mojang.blaze3d.textures.GpuTextureView
 * net.minecraft.class_765
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Unique
 */
package com.ferra13671.bthack.mixins;

import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.awt.Color;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_765.class})
public class Mixin_CameraSubmersionType {
 @Unique
 private GpuTexture UOewzDZFhjmsevSujhYPuQNroWymUzkl;
 @Unique
 private GpuTextureView YGCgKjGGrKvZspSPwAF_DKYXWnFMsfMF;
 @Unique
 private Color u_CxIzvqKCPPQkWWfDimQEILACyyRIib;

 public Mixin_CameraSubmersionType() {
 this.u_CxIzvqKCPPQkWWfDimQEILACyyRIib = Color.WHITE;
 }
}

