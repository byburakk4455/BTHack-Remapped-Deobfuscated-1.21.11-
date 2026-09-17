/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.TimerSpeed;

@ModuleInfo(name="Timer", category="movement")
public class TimerModule
extends Module {
 public final NumberSetting speed;
 private final TimerSpeed timerSpeed;

 public TimerModule() {
 this.speed = ((NumberSetting.builder().name("Speed")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.05f)).max(Float.valueOf(12.0f)).build();
 this.timerSpeed = new TimerSpeed(0, this.speed::getValue);
 }
}

