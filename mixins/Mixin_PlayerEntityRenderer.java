/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_241
 * net.minecraft.class_744
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.gen.Accessor
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_241;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_744.class})
public interface Mixin_PlayerEntityRenderer {
 @Accessor(value="field_55868")
 public void aMsDgQ_uJamvSrepVEwhEJ_jRKVySfOP(class_241 var1);
}

