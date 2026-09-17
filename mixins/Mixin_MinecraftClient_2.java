/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_310
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.gen.Accessor
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_310.class})
public interface Mixin_MinecraftClient_2 {
 @Accessor(value="field_1752")
 public void LyZvNLDiLehtzYNbuXZPQWZNzhBuDZmk(int var1);

 @Accessor(value="field_1752")
 public int Quq_rREwXPjOosbqTFRVequdhFrDebrk();
}

