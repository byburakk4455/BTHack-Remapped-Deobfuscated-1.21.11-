/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.mojang.blaze3d.buffers.GpuBuffer
 * net.minecraft.class_9975
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Mutable
 * org.spongepowered.asm.mixin.gen.Accessor
 * org.spongepowered.asm.mixin.gen.Invoker
 */
package com.ferra13671.bthack.mixins;

import com.mojang.blaze3d.buffers.GpuBuffer;
import net.minecraft.class_9975;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_9975.class})
public interface Mixin_RenderLayer_2 {
 @Mutable
 @Accessor(value="field_58198")
 public void yQxemeXwvSbxiBCurbuyZfghRAzYlzhK(int var1);

 @Invoker(value="method_65233")
 public GpuBuffer bJwN_jl_nQhbggKTYKVFBLKdyjNvIbMc();

 @Mutable
 @Accessor(value="field_53145")
 public void VCHOaqfKxLemKgJNCOJEDYfg_AieyDHn(GpuBuffer var1);

 @Accessor(value="field_53145")
 public GpuBuffer nASpRMTErYCbsoXiAQnCrLuEKvFEGfKY();
}

