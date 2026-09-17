/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModeSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.FullbrightMode;
import com.ferra13671.bthack.Module;
import java.awt.Color;

@ModuleInfo(name="Full Bright", category="render")
public class FullBrightModule
extends Module {
 public final ModeSetting mode;
 public final ColorSetting gammaColor;
 public final NumberSetting blockLight;

 public FullBrightModule() {
 this.mode = ((ModeSetting.builder(FullbrightMode.class).name("Mode")).defaultValue((Object)FullbrightMode.Gamma)).build();
 this.gammaColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Gamma Color")).defaultValue(Color.WHITE)).visible(() -> this.mode.getValue() == FullbrightMode.Gamma)).build();
 this.blockLight = ((((NumberSetting.Builder)NumberSetting.builder().name("Block Light")).defaultValue(Float.valueOf(15.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(15.0f)).precision(0).visible(() -> this.mode.getValue() == FullbrightMode.BlockLight)).build();
 }
}

