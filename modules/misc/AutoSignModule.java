/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.StringSetting;

@ModuleInfo(name="Auto Sign", category="misc")
public class AutoSignModule
extends Module {
 public final BooleanSetting closeScreen;
 public final BooleanSetting backSide;
 public final StringSetting line1;
 public final StringSetting line2;
 public final StringSetting line3;
 public final StringSetting line4;

 public AutoSignModule() {
 this.closeScreen = ((BooleanSetting.builder().name("Close Screen")).defaultValue(true)).build();
 this.backSide = ((BooleanSetting.builder().name("Back Side")).defaultValue(false)).build();
 this.line1 = ((StringSetting.Builder)StringSetting.builder().name("Line 1")).build();
 this.line2 = ((StringSetting.Builder)StringSetting.builder().name("Line 2")).build();
 this.line3 = ((StringSetting.Builder)StringSetting.builder().name("Line 3")).build();
 this.line4 = ((StringSetting.Builder)StringSetting.builder().name("Line 4")).build();
 }
}

