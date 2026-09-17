/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.OffhandMode;
import com.ferra13671.bthack.InventoryUtils;

@ModuleInfo(name="Auto Offhand", category="combat")
public class AutoOffhandModule
extends Module {
 public final BooleanSetting replaceOther;
 public final InventoryUtils item;

 public AutoOffhandModule() {
 this.replaceOther = ((BooleanSetting.builder().name("Replace Other")).defaultValue(true)).build();
 this.item = InventoryUtils.builder().name("Item").LOoAiTsBurrYBnpqOuEEraREPpoybqFR(1).eomaIKSKMbcgKkL_fRXaDxYBwo_WsSmk(OffhandMode.ReplaceFirst).build();
 }
}

