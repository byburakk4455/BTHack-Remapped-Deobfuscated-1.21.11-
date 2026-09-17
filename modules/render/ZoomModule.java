/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Animation;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.Easing;

@ModuleInfo(name="Zoom", category="render")
public class ZoomModule
extends Module {
 public final NumberSetting startZoom;
 public final NumberSetting zoomStep;
 public final NumberSetting smoothness;
 private final Animation animation;
 public float zoom;
 public float targetZoom;
 private double lastFov;

 public ZoomModule() {
 this.startZoom = ((NumberSetting.builder().name("Start Zoom")).defaultValue(Float.valueOf(8.0f))).min(Float.valueOf(2.0f)).max(Float.valueOf(64.0f)).precision(0).build();
 this.zoomStep = ((NumberSetting.builder().name("Zoom Step")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.1f)).max(Float.valueOf(6.5f)).precision(1).build();
 this.smoothness = ((NumberSetting.builder().name("Smoothness")).defaultValue(Float.valueOf(0.6f))).min(Float.valueOf(0.0f)).max(Float.valueOf(0.9f)).build();
 this.animation = new Animation(Easing.CUBIC_OUT, 10000);
 this.zoom = 1.0f;
 this.targetZoom = 1.0f;
 this.lastFov = -1.0;
 }
}

