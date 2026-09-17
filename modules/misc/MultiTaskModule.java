/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="Multi Task", category="misc")
public class MultiTaskModule
extends Module {
 public final BooleanSetting attacking;

 public MultiTaskModule() {
 this.attacking = ((BooleanSetting.builder().name("Attacking")).defaultValue(true)).build();
 }
}

