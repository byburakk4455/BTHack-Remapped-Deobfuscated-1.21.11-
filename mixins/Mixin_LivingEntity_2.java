/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1309
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Unique
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_1309.class})
public class Mixin_LivingEntity_2 {
 @Unique
 private boolean GlTzyvUQXRAJWLjRqIHJMTmaffY_dvSz;

 public Mixin_LivingEntity_2() {
 this.GlTzyvUQXRAJWLjRqIHJMTmaffY_dvSz = false;
 }
}

