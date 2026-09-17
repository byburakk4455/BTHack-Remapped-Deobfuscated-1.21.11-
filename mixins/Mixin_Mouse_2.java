/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_312
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.gen.Accessor
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_312.class})
public interface Mixin_Mouse_2 {
 @Accessor(value="field_1795")
 public double oJWXAxTqXF_rlLnOUDMiuYHMojKFhAMr();

 @Accessor(value="field_1794")
 public double qOCpJtRLCWsoCmeZKLEEFRiCdXtKCfNy();
}

