/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1657
 * net.minecraft.class_1713
 * net.minecraft.class_2338
 * net.minecraft.class_636
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 * org.spongepowered.asm.mixin.Unique
 */
package com.ferra13671.bthack.mixins;

import com.ferra13671.bthack.IClientPlayerInteractionManager;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_2338;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_636.class})
public abstract class Mixin_ClientPlayerInteractionManager
implements IClientPlayerInteractionManager {
 @Shadow
 private class_2338 field_3714;
 @Unique
 private boolean aodLxomeeH_mOHhVVzsTLnSuNgdcWily;

 public Mixin_ClientPlayerInteractionManager() {
 this.aodLxomeeH_mOHhVVzsTLnSuNgdcWily = false;
 }

 @Shadow
 public abstract void method_2906(int var1, int var2, int var3, class_1713 var4, class_1657 var5);
}

