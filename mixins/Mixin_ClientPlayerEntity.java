/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_746
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_746.class})
public class Mixin_ClientPlayerEntity {
 @Shadow
 public float field_44912;
 @Shadow
 public float field_44911;
}

