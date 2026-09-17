/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_640
 * net.minecraft.class_742
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.gen.Accessor
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_640;
import net.minecraft.class_742;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_742.class})
public interface Mixin_AbstractClientPlayerEntity {
 @Accessor(value="field_3901")
 public void BrTOFzTzPoSnfIYkrEhhDgYmwMT_ZmvI(class_640 var1);
}

