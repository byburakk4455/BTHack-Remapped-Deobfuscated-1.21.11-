/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.Module;
import java.awt.Color;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ModuleInfo(name="Breadcrumbs", category="render")
public class BreadcrumbsModule
extends Module {
 public final NumberSetting maxVertices;
 public final NumberSetting updateDelay;
 public final ColorSetting color;
 public final NumberSetting height;
 public final BooleanSetting depthTest;
 private String crumbId;
 private final List crumbList;
 private int wFDhbWqCvgpjmYQhMMKVjFzlQDUNKoHq;

 public BreadcrumbsModule() {
 this.maxVertices = ((NumberSetting.builder().name("Max vertices")).defaultValue(Float.valueOf(1000.0f))).min(Float.valueOf(200.0f)).max(Float.valueOf(15000.0f)).precision(0).build();
 this.updateDelay = ((NumberSetting.builder().name("Update delay")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(20.0f)).build();
 this.color = ((ColorSetting.builder().name("Color")).defaultValue(new Color(1.0f, 1.0f, 1.0f, 1.0f))).build();
 this.height = ((NumberSetting.builder().name("Height")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(2.0f)).build();
 this.depthTest = ((BooleanSetting.builder().name("Depth test")).defaultValue(true)).build();
 this.crumbId = "";
 this.crumbList = new CopyOnWriteArrayList();
 this.wFDhbWqCvgpjmYQhMMKVjFzlQDUNKoHq = 0;
 }
}

