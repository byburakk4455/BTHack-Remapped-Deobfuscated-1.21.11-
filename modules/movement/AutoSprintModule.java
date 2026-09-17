/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="Auto Sprint", category="movement")
public class AutoSprintModule
extends Module {
 public final BooleanSetting inWater;

 public AutoSprintModule() {
 this.inWater = ((BooleanSetting.builder().name("In water")).defaultValue(true)).build();
 }
}

