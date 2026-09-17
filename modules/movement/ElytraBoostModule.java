/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="Elytra Boost", category="movement")
public class ElytraBoostModule
extends Module {
 public final NumberSetting maxSpeed;
 public final NumberSetting boostStrength;
 public final BooleanSetting yMotionAlso;
 public final NumberSetting startBoostPitch;
 public final BooleanSetting pauseIfBlink;

 public ElytraBoostModule() {
 this.maxSpeed = ((((NumberSetting.Builder)NumberSetting.builder().name("Max Speed")).configName("max-speed")).defaultValue(Float.valueOf(50.0f))).min(Float.valueOf(20.0f)).max(Float.valueOf(200.0f)).precision(1).build();
 this.boostStrength = ((((NumberSetting.Builder)NumberSetting.builder().name("Boost Strength")).configName("boost-strength")).defaultValue(Float.valueOf(0.07f))).min(Float.valueOf(0.02f)).max(Float.valueOf(0.14f)).precision(3).build();
 this.yMotionAlso = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Y Motion Also")).configName("y-motion-also")).defaultValue(false)).build();
 this.startBoostPitch = ((((NumberSetting.Builder)NumberSetting.builder().name("Start Boost Pitch")).configName("start-boost-pitch")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(80.0f)).max(Float.valueOf(0.0f)).precision(1).build();
 this.pauseIfBlink = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Pause If Blink")).configName("pause-if-blink")).defaultValue(true)).build();
 }
}

