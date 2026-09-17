/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_310
 * net.minecraft.class_315
 * net.minecraft.class_636
 * net.minecraft.class_746
 * org.jspecify.annotations.Nullable
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 * org.spongepowered.asm.mixin.Unique
 */
package com.ferra13671.bthack.mixins;

import com.ferra13671.bthack.ClientSession;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_310.class})
public class Mixin_MinecraftClient {
 @Shadow
 public @Nullable class_746 field_1724;
 @Shadow
 @Final
 public class_315 field_1690;
 @Shadow
 public @Nullable class_636 field_1761;
 @Unique
 private ClientSession fGPgiGXxnMkuNcibzQOueCPkNUTapuHZ;

 public Mixin_MinecraftClient() {
 this.fGPgiGXxnMkuNcibzQOueCPkNUTapuHZ = null;
 }
}

