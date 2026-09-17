/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.mojang.brigadier.ParseResults
 * net.minecraft.class_342
 * net.minecraft.class_4717
 * net.minecraft.class_4717$class_464
 * org.jspecify.annotations.Nullable
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import com.mojang.brigadier.ParseResults;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_342;
import net.minecraft.class_4717;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_4717.class})
public abstract class Mixin_VertexBuffer {
 @Shadow
 private @Nullable ParseResults field_21610;
 @Shadow
 @Final
 private class_342 field_21599;
 @Shadow
 private class_4717.class_464 field_21612;
 @Shadow
 private boolean field_21614;
 @Shadow
 private @Nullable CompletableFuture field_21611;

 @Shadow
 protected abstract void method_23937();
}

