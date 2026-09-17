/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.ResetTimer;
import com.ferra13671.bthack.Timer;

@ModuleInfo(name="Blink", category="movement")
public class BlinkModule
extends Module {
 public final BooleanSetting onlyMovement;
 public final BooleanSetting reset;
 public final NumberSetting resetDelay;
 private final Timer timer;
 private final ResetTimer resetTimer;

 public BlinkModule() {
 this.onlyMovement = ((BooleanSetting.builder().name("Only Movement")).defaultValue(false)).build();
 this.reset = ((BooleanSetting.builder().name("Reset")).defaultValue(false)).build();
 this.resetDelay = ((((NumberSetting.Builder)NumberSetting.builder().name("Reset Delay")).defaultValue(Float.valueOf(2.0f))).min(Float.valueOf(0.5f)).max(Float.valueOf(15.0f)).visible(this.reset::getValue)).build();
 this.timer = new Timer();
 this.resetTimer = new ResetTimer(1000, this.onlyMovement::getValue);
 }
}

