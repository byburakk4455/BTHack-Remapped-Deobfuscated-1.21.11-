/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1703
 * net.minecraft.class_1735
 * net.minecraft.class_2561
 * net.minecraft.class_3936
 * net.minecraft.class_437
 * net.minecraft.class_465
 * org.jspecify.annotations.Nullable
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_1703;
import net.minecraft.class_1735;
import net.minecraft.class_2561;
import net.minecraft.class_3936;
import net.minecraft.class_437;
import net.minecraft.class_465;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_465.class})
public abstract class Mixin_HandledScreen
extends class_437
implements class_3936 {
 @Shadow
 @Final
 protected class_1703 field_2797;
 @Shadow
 protected @Nullable class_1735 field_2787;

 @Shadow
 protected abstract @Nullable class_1735 method_64240(double var1, double var3);

 protected Mixin_HandledScreen(class_2561 prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG) {
 super(prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG);
 }
}

