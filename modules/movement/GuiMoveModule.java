/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_304
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import net.minecraft.class_304;

@ModuleInfo(name="Gui Move", category="movement")
public class GuiMoveModule
extends Module {
 public final BooleanSetting grim;
 public final BooleanSetting all;
 public final BooleanSetting chat;
 public final BooleanSetting ui;
 public final BooleanSetting settings;
 private final class_304[] oJokTKOqCrNkineUKug_UZeOtcL_zdHU;
 private int delayTicks;
 private boolean sneaking;

 public GuiMoveModule() {
 this.grim = ((BooleanSetting.builder().name("Grim")).defaultValue(true)).build();
 this.all = ((BooleanSetting.builder().name("All")).defaultValue(false)).build();
 this.chat = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Chat")).defaultValue(false)).visible(() -> (Boolean)this.all.getValue() == false)).build();
 this.ui = ((((BooleanSetting.Builder)BooleanSetting.builder().name("UI")).defaultValue(false)).visible(() -> (Boolean)this.all.getValue() == false)).build();
 this.settings = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Settings")).visible(() -> (Boolean)this.all.getValue() == false)).defaultValue(false)).build();
 this.oJokTKOqCrNkineUKug_UZeOtcL_zdHU = new class_304[]{GuiMoveModule.mc.field_1690.field_1832, GuiMoveModule.mc.field_1690.field_1894, GuiMoveModule.mc.field_1690.field_1881, GuiMoveModule.mc.field_1690.field_1913, GuiMoveModule.mc.field_1690.field_1849, GuiMoveModule.mc.field_1690.field_1903};
 this.delayTicks = 0;
 this.sneaking = false;
 }
}

