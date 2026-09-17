/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.Timer;

@ModuleInfo(name="Auto Save", category="client", enabled=true)
public class AutoSaveModule
extends Module {
 public final NumberSetting delay;
 private final Timer timer;

 public AutoSaveModule() {
 this.delay = ((NumberSetting.builder().name("Delay")).defaultValue(Float.valueOf(60.0f))).min(Float.valueOf(5.0f)).max(Float.valueOf(600.0f)).build();
 this.timer = new Timer();
 }
}

