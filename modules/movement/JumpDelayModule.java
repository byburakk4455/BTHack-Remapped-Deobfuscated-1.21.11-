/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="Jump Delay", category="movement")
public class JumpDelayModule
extends Module {
 public final NumberSetting delay;

 public JumpDelayModule() {
 this.delay = ((NumberSetting.builder().name("Delay")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(10.0f)).precision(0).build();
 }
}

