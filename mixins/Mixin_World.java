/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1937
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_1937;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_1937.class})
public class Mixin_World {
 @Shadow
 @Final
 private boolean field_9236;
}

