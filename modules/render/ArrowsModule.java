/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModeSetting;
import com.ferra13671.bthack.TextureMode;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.TeamsColorMode;
import com.ferra13671.bthack.Module;
import java.awt.Color;

@ModuleInfo(name="Arrows", category="render")
public class ArrowsModule
extends Module {
 public final ModeSetting texture;
 public final NumberSetting size;
 public final NumberSetting radius;
 public final BooleanSetting smoothMoving;
 public final NumberSetting smoothness;
 public final BooleanSetting 3d;
 public final NumberSetting maxAngle;
 public final ColorSetting color;
 public final ModeSetting teamsColor;
 private float prevPitch;
 private float prevYaw;

 public ArrowsModule() {
 this.texture = ((ModeSetting.builder(TextureMode.class).name("Texture")).defaultValue((Object)TextureMode.Arrow1)).build();
 this.size = ((NumberSetting.builder().name("Size")).defaultValue(Float.valueOf(20.0f))).min(Float.valueOf(10.0f)).max(Float.valueOf(100.0f)).precision(0).build();
 this.radius = ((NumberSetting.builder().name("Radius")).defaultValue(Float.valueOf(50.0f))).min(Float.valueOf(10.0f)).max(Float.valueOf(400.0f)).precision(0).build();
 this.smoothMoving = ((BooleanSetting.builder().name("Smooth Moving")).defaultValue(true)).build();
 this.smoothness = ((((NumberSetting.Builder)NumberSetting.builder().name("Smoothness")).defaultValue(Float.valueOf(0.6f))).min(Float.valueOf(0.1f)).max(Float.valueOf(1.0f)).precision(2).visible(this.smoothMoving::getValue)).build();
 this.3d = ((BooleanSetting.builder().name("3D")).defaultValue(true)).build();
 this.maxAngle = ((((NumberSetting.Builder)NumberSetting.builder().name("Max Angle")).defaultValue(Float.valueOf(60.0f))).min(Float.valueOf(10.0f)).max(Float.valueOf(80.0f)).precision(1).visible(this.3d::getValue)).build();
 this.color = ((ColorSetting.builder().name("Color")).defaultValue(Color.WHITE)).build();
 this.teamsColor = ((ModeSetting.builder(TeamsColorMode.class).name("Teams Color")).defaultValue(TeamsColorMode.None)).build();
 }
}

