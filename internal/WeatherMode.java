/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1959$class_1963
 */
package com.ferra13671.bthack;

import net.minecraft.class_1959;

public enum WeatherMode {
 Clear(true, 0.0f, 0.0f, class_1959.class_1963.field_9384),
 Rain(false, 1.0f, 0.0f, class_1959.class_1963.field_9382),
 Thunder(false, 2.0f, 1.0f, class_1959.class_1963.field_9382),
 Snow(false, 1.0f, 0.0f, class_1959.class_1963.field_9383);

 public final boolean clear;
 public final float rainGradient;
 public final float thunderGradient;
 public final class_1959.class_1963 precipitation;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private WeatherMode(float MYXwgDJFdEqfpsKZbCboyfdknrbtyODi, class_1959.class_1963 UKUVVvvZixdiuISIezYSNlXWTaVsZiCr) {
 void OnOBbZxvrFqzqKfJphzfSwcfZVPHOrYm;
 void nrGCSTZpvkAHbLOZCMTlTMwPthccfelT;
 this.clear = MYXwgDJFdEqfpsKZbCboyfdknrbtyODi;
 this.rainGradient = (float)UKUVVvvZixdiuISIezYSNlXWTaVsZiCr;
 this.thunderGradient = nrGCSTZpvkAHbLOZCMTlTMwPthccfelT;
 this.precipitation = OnOBbZxvrFqzqKfJphzfSwcfZVPHOrYm;
 }
}

