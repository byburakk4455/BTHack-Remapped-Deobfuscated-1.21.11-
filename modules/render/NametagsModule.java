/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="Nametags", category="render")
public class NametagsModule
extends Module {
 public final NumberSetting height;
 public final BooleanSetting blur;
 public final BooleanSetting displayHealth;
 public final BooleanSetting displayPing;
 public final BooleanSetting teamColor;

 public NametagsModule() {
 this.height = ((NumberSetting.builder().name("Height")).defaultValue(Float.valueOf(0.3f))).min(Float.valueOf(0.0f)).max(Float.valueOf(1.0f)).precision(1).build();
 this.blur = ((BooleanSetting.builder().name("Blur")).defaultValue(false)).build();
 this.displayHealth = ((BooleanSetting.builder().name("Display Health")).defaultValue(false)).build();
 this.displayPing = ((BooleanSetting.builder().name("Display Ping")).defaultValue(false)).build();
 this.teamColor = ((BooleanSetting.builder().name("Team Color")).defaultValue(true)).build();
 }
}

