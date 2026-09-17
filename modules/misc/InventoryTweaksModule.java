/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModeSetting;
import com.ferra13671.bthack.InvTweaksHandler;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.OrePriorityMode;
import com.ferra13671.bthack.Timer;
import com.ferra13671.bthack.InventoryUtils;

@ModuleInfo(name="Inventory Tweaks", category="misc")
public class InventoryTweaksModule
extends Module {
 public final BooleanSetting shiftDrag;
 public final BooleanSetting groupMove;
 public final BooleanSetting autoTool;
 public final ModeSetting orePriority;
 public final BooleanSetting safeEnderChests;
 public final BooleanSetting hotbarReplenish;
 public final NumberSetting minItems;
 public final BooleanSetting inventoryCleaner;
 public final InventoryUtils trash;
 public final NumberSetting throwDelay;
 private InvTweaksHandler tweaksHandler;
 private final Timer timer;
 private final Timer timer;

 public InventoryTweaksModule() {
 this.shiftDrag = ((BooleanSetting.builder().name("Shift Drag")).defaultValue(true)).build();
 this.groupMove = ((BooleanSetting.builder().name("Group Move")).defaultValue(false)).build();
 this.autoTool = ((BooleanSetting.builder().name("Auto Tool")).defaultValue(false)).build();
 this.orePriority = ((((ModeSetting.Builder)ModeSetting.builder(OrePriorityMode.class).name("Ore Priority")).defaultValue((Object)OrePriorityMode.Fortune)).visible(this.autoTool::getValue)).build();
 this.safeEnderChests = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Safe Ender Chests")).defaultValue(false)).visible(this.autoTool::getValue)).build();
 this.hotbarReplenish = ((BooleanSetting.builder().name("Hotbar Replenish")).defaultValue(false)).build();
 this.minItems = ((((NumberSetting.Builder)NumberSetting.builder().name("Min Items")).defaultValue(Float.valueOf(10.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(63.0f)).precision(0).visible(this.hotbarReplenish::getValue)).build();
 this.inventoryCleaner = ((BooleanSetting.builder().name("Inventory Cleaner")).defaultValue(false)).build();
 this.trash = InventoryUtils.builder().name("Trash").visible(this.inventoryCleaner::getValue).build();
 this.throwDelay = ((((NumberSetting.Builder)NumberSetting.builder().name("Throw Delay")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(500.0f)).precision(0).visible(this.inventoryCleaner::getValue)).build();
 this.tweaksHandler = null;
 this.timer = new Timer();
 this.timer = new Timer();
 }
}

