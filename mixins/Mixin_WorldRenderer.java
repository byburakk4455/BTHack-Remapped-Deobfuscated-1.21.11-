/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_11658
 * net.minecraft.class_761
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_11658;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_761.class})
public class Mixin_WorldRenderer {
 @Shadow
 @Final
 private class_11658 field_61737;
}

