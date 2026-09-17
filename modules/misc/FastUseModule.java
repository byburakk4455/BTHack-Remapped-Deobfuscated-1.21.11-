/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="Fast Use", category="misc")
public class FastUseModule
extends Module {
 public final NumberSetting delay;
 public final BooleanSetting all;
 public final BooleanSetting blocks;
 public final BooleanSetting projectiles;
 public final BooleanSetting fishingRod;
 public final BooleanSetting endCrystals;
 public final BooleanSetting scissors;

 public FastUseModule() {
 this.delay = ((NumberSetting.builder().name("Delay")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(4.0f)).precision(0).build();
 this.all = ((BooleanSetting.builder().name("All")).defaultValue(false)).build();
 this.blocks = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Blocks")).defaultValue(false)).visible(() -> (Boolean)this.all.getValue() == false)).build();
 this.projectiles = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Projectiles")).defaultValue(false)).visible(() -> (Boolean)this.all.getValue() == false)).build();
 this.fishingRod = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Fishing rod")).defaultValue(false)).visible(() -> (Boolean)this.all.getValue() == false)).build();
 this.endCrystals = ((((BooleanSetting.Builder)BooleanSetting.builder().name("End crystals")).defaultValue(false)).visible(() -> (Boolean)this.all.getValue() == false)).build();
 this.scissors = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Scissors")).defaultValue(false)).visible(() -> (Boolean)this.all.getValue() == false)).build();
 }
}

