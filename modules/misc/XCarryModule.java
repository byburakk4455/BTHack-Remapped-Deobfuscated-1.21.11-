/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="XCarry", category="misc")
public class XCarryModule
extends Module {
 public final BooleanSetting onlyInventory;

 public XCarryModule() {
 this.onlyInventory = ((BooleanSetting.builder().name("Only inventory")).defaultValue(true)).build();
 }
}

