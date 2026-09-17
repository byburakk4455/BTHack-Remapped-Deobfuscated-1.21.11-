/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModeSetting;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.ColorMode;
import com.ferra13671.bthack.Timer;
import com.ferra13671.bthack.PlayerESPUtils;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import java.awt.Color;

@ModuleInfo(name="Player ESP", category="render")
public class PlayerESPModule
extends Module {
 public final ModeSetting colorMode;
 public final ColorSetting color;
 public final ColorSetting firstColor;
 public final ColorSetting secondColor;
 public final NumberSetting gradientSpeed;
 public final NumberSetting boxAlpha;
 public final BooleanSetting gradient;
 public final BooleanSetting depthTest;
 protected final Timer timer;

 public PlayerESPModule() {
 this.colorMode = ((ModeSetting.builder(ColorMode.class).name("Color Mode")).defaultValue((Object)ColorMode.Default)).build();
 this.color = ((((ColorSetting.Builder)ColorSetting.builder().name("Color")).defaultValue(Color.WHITE)).visible(() -> this.colorMode.getValue() == ColorMode.Default)).build();
 this.firstColor = ((((ColorSetting.Builder)ColorSetting.builder().name("First Color")).defaultValue(PlayerESPUtils.GLifcentqhtVzROPWrDBvWoMqUloWgwI(ItemUtils.yQgyRbzvArWXVsfxUvs_YEpFdAefcNVK))).visible(() -> this.colorMode.getValue() == ColorMode.Gradient)).build();
 this.secondColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Second Color")).defaultValue(PlayerESPUtils.GLifcentqhtVzROPWrDBvWoMqUloWgwI(ItemUtils.yQgyRbzvArWXVsfxUvs_YEpFdAefcNVK.multiply(RenderColor.of((float)0.7f, (float)0.7f, (float)0.7f, (float)1.0f))))).visible(() -> this.colorMode.getValue() == ColorMode.Gradient)).build();
 this.gradientSpeed = ((((NumberSetting.Builder)NumberSetting.builder().name("Gradient Speed")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.2f)).max(Float.valueOf(3.0f)).precision(1).visible(() -> this.colorMode.getValue() == ColorMode.Gradient)).build();
 this.boxAlpha = ((NumberSetting.builder().name("Box Alpha")).defaultValue(Float.valueOf(0.4f))).min(Float.valueOf(0.0f)).max(Float.valueOf(1.0f)).build();
 this.gradient = ((BooleanSetting.builder().name("Gradient")).defaultValue(true)).build();
 this.depthTest = ((BooleanSetting.builder().name("Depth Test")).defaultValue(false)).build();
 this.timer = new Timer();
 }
}

