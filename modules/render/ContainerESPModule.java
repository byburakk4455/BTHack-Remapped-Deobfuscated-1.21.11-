/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.vertex.mesh.Mesh
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.Module;
import com.ferra13671.cometrenderer.vertex.mesh.Mesh;
import java.awt.Color;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ModuleInfo(name="Container ESP", category="render")
public class ContainerESPModule
extends Module {
 public final NumberSetting boxAlpha;
 public final BooleanSetting brightBlend;
 public final BooleanSetting chests;
 public final ColorSetting chestColor;
 public final BooleanSetting enderChests;
 public final ColorSetting enderChestColor;
 public final BooleanSetting shulkers;
 public final ColorSetting shulkerColor;
 public final BooleanSetting barrels;
 public final ColorSetting barrelColor;
 private final Map containerMap;
 private Mesh mesh;
 private boolean rendering;

 public ContainerESPModule() {
 this.boxAlpha = ((NumberSetting.builder().name("Box Alpha")).defaultValue(Float.valueOf(0.4f))).min(Float.valueOf(0.0f)).max(Float.valueOf(1.0f)).build();
 this.brightBlend = ((BooleanSetting.builder().name("Bright Blend")).defaultValue(false)).build();
 this.chests = ((BooleanSetting.builder().name("Chests")).defaultValue(true)).build();
 this.chestColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Chest Color")).defaultValue(new Color(255, 135, 0))).visible(this.chests::getValue)).build();
 this.enderChests = ((BooleanSetting.builder().name("Ender Chests")).defaultValue(true)).build();
 this.enderChestColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Ender Chest Color")).defaultValue(new Color(146, 0, 146))).visible(this.enderChests::getValue)).build();
 this.shulkers = ((BooleanSetting.builder().name("Shulkers")).defaultValue(true)).build();
 this.shulkerColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Shulker Color")).defaultValue(new Color(255, 76, 255))).visible(this.shulkers::getValue)).build();
 this.barrels = ((BooleanSetting.builder().name("Barrels")).defaultValue(false)).build();
 this.barrelColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Barrel Color")).defaultValue(new Color(165, 64, 0))).visible(this.barrels::getValue)).build();
 this.containerMap = new ConcurrentHashMap();
 this.rendering = false;
 }
}

