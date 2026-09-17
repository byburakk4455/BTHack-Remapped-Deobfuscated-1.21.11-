/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_743
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.ActionTimer;
import com.ferra13671.bthack.ResetTimer;
import net.minecraft.class_743;

@ModuleInfo(name="Elytra Recast", category="movement")
public class ElytraRecastModule
extends Module {
 public final BooleanSetting legitRecast;
 public final BooleanSetting blink;
 public final NumberSetting blinkTicks;
 public final BooleanSetting changePitch;
 public final NumberSetting pitch;
 private boolean recasting;
 private int recastTicks;
 private final ActionTimer actionTimer;
 private final ResetTimer resetTimer;

 public ElytraRecastModule() {
 this.legitRecast = ((BooleanSetting.builder().name("Legit Recast")).defaultValue(false)).build();
 this.blink = ((BooleanSetting.builder().name("Blink")).defaultValue(true)).build();
 this.blinkTicks = ((((NumberSetting.Builder)NumberSetting.builder().name("Blink Ticks")).defaultValue(Float.valueOf(3.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(10.0f)).precision(0).visible(this.blink::getValue)).build();
 this.changePitch = ((BooleanSetting.builder().name("Change pitch")).defaultValue(false)).build();
 this.pitch = ((((NumberSetting.Builder)NumberSetting.builder().name("Pitch")).defaultValue(Float.valueOf(74.4f))).min(Float.valueOf(0.0f)).max(Float.valueOf(90.0f)).visible(this.changePitch::getValue)).build();
 this.recasting = false;
 this.recastTicks = 0;
 this.actionTimer = new ActionTimer(0, () -> new float[]{ElytraRecastModule.mc.field_1724.field_3913 instanceof class_743 ? ElytraRecastModule.mc.field_1773.method_19418().method_19330() : ElytraRecastModule.mc.field_1724.method_36454(), ((Float)this.pitch.getValue()).floatValue()}, () -> true, () -> !this.isEnabled() || (Boolean)this.changePitch.getValue() == false);
 this.resetTimer = new ResetTimer(100, () -> false);
 }
}

