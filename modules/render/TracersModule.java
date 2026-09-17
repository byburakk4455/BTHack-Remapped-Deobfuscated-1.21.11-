/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.CategorySetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.Module;
import java.awt.Color;

@ModuleInfo(name="Tracers", category="render")
public class TracersModule
extends Module {
 public final BooleanSetting players;
 public final ColorSetting playersColor;
 public final BooleanSetting items;
 public final ColorSetting itemsColor;
 public final CategorySetting mobs;
 public final BooleanSetting hostiles;
 public final ColorSetting hostilesColor;
 public final BooleanSetting passives;
 public final ColorSetting passivesColor;

 public TracersModule() {
 this.players = ((BooleanSetting.builder().name("Players")).defaultValue(true)).build();
 this.playersColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Players Color")).defaultValue(Color.WHITE)).visible(this.players::getValue)).build();
 this.items = ((BooleanSetting.builder().name("Items")).defaultValue(true)).build();
 this.itemsColor = ((((ColorSetting.Builder)ColorSetting.builder().name("Items Color")).defaultValue(new Color(150, 150, 255))).visible(this.items::getValue)).build();
 this.mobs = ((CategorySetting.builder().name("Mobs")).configName("mobs-category")).build();
 this.hostiles = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Hostiles")).defaultValue(true)).parentCategory(this.mobs)).build();
 this.hostilesColor = ((((ColorSetting.builder().name("Hostiles Color")).defaultValue(new Color(212, 235, 43))).visible(this.hostiles::getValue)).parentCategory(this.mobs)).build();
 this.passives = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Passives")).defaultValue(true)).parentCategory(this.mobs)).build();
 this.passivesColor = ((((ColorSetting.builder().name("Passives Color")).defaultValue(new Color(176, 255, 87))).visible(this.passives::getValue)).parentCategory(this.mobs)).build();
 }
}

