/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.Module;
import java.awt.Color;

@ModuleInfo(name="Block Outline", category="render")
public class BlockOutlineModule
extends Module {
 public final BooleanSetting useShape;
 public final ColorSetting sideColor;
 public final ColorSetting outlineColor;
 public final BooleanSetting depthTest;

 public BlockOutlineModule() {
 this.useShape = ((BooleanSetting.builder().name("Use shape")).defaultValue(true)).build();
 this.sideColor = ((ColorSetting.builder().name("Side color")).defaultValue(new Color(1.0f, 1.0f, 1.0f, 0.3f))).build();
 this.outlineColor = ((ColorSetting.builder().name("Outline color")).defaultValue(new Color(1.0f, 1.0f, 1.0f, 1.0f))).build();
 this.depthTest = ((BooleanSetting.builder().name("Depth test")).defaultValue(true)).build();
 }
}

