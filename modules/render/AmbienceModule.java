/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.WeatherMode;
import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModeSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.CategorySetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.WorldTimeMode;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.Timer;
import java.awt.Color;

@ModuleInfo(name="Ambience", category="render")
public class AmbienceModule
extends Module {
 public final CategorySetting fog;
 public final CategorySetting distance;
 public final BooleanSetting custom;
 public final NumberSetting start;
 public final NumberSetting end;
 public final CategorySetting color;
 public final BooleanSetting custom_Oiwa;
 public final ColorSetting color_NNLQ;
 public final CategorySetting sky;
 public final CategorySetting color_CtPD;
 public final BooleanSetting custom_LJpR;
 public final ColorSetting color_SLjC;
 public final CategorySetting stars;
 public final BooleanSetting custom_XqVe;
 public final CategorySetting color_JVFQ;
 public final BooleanSetting custom_kkLH;
 public final ColorSetting color_CPlv;
 public final CategorySetting amount;
 public final BooleanSetting custom_MqRk;
 public final NumberSetting amount_uajY;
 public final CategorySetting seed;
 public final BooleanSetting custom_HYuN;
 public final NumberSetting seed_aUIX;
 public final CategorySetting worldTime;
 public final BooleanSetting custom_wQBc;
 public final ModeSetting worldTime_lKtG;
 public final NumberSetting time;
 public final NumberSetting spinSpeed;
 public final CategorySetting weather;
 public final BooleanSetting custom_AAVU;
 public final ModeSetting weather_AJeY;
 protected final Timer timer;

 public AmbienceModule() {
 this.fog = ((CategorySetting.builder().name("Fog")).configName("fog-category")).build();
 this.distance = ((((CategorySetting.Builder)CategorySetting.builder().name("Distance")).configName("distance-category")).parentCategory(this.fog)).build();
 this.custom = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(true)).parentCategory(this.distance)).build();
 this.start = ((((NumberSetting.builder().name("Start")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(600.0f)).visible(this.custom::getValue)).precision(1).parentCategory(this.distance)).build();
 this.end = ((((NumberSetting.builder().name("End")).defaultValue(Float.valueOf(150.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(600.0f)).visible(this.custom::getValue)).precision(1).parentCategory(this.distance)).build();
 this.color = ((((CategorySetting.Builder)CategorySetting.builder().name("Color")).configName("color-category")).parentCategory(this.fog)).build();
 this.custom_Oiwa = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(true)).parentCategory(this.color)).build();
 this.color_NNLQ = ((((ColorSetting.builder().name("Color")).defaultValue(new Color(62, 62, 125))).visible(this.custom_Oiwa::getValue)).parentCategory(this.color)).build();
 this.sky = ((CategorySetting.builder().name("Sky")).configName("sky-category")).build();
 this.color_CtPD = ((((CategorySetting.Builder)CategorySetting.builder().name("Color")).configName("color-category")).parentCategory(this.sky)).build();
 this.custom_LJpR = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(true)).parentCategory(this.color_CtPD)).build();
 this.color_SLjC = ((((ColorSetting.builder().name("Color")).defaultValue(new Color(15, 15, 31))).visible(this.custom_LJpR::getValue)).parentCategory(this.color_CtPD)).build();
 this.stars = ((((CategorySetting.Builder)CategorySetting.builder().name("Stars")).configName("stars-category")).parentCategory(this.sky)).build();
 this.custom_XqVe = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(true)).parentCategory(this.stars)).build();
 this.color_JVFQ = ((((CategorySetting.builder().name("Color")).configName("color-category")).visible(this.custom_XqVe::getValue)).parentCategory(this.stars)).build();
 this.custom_kkLH = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(true)).parentCategory(this.color_JVFQ)).build();
 this.color_CPlv = ((((ColorSetting.builder().name("Color")).defaultValue(new Color(255, 255, 255, 36))).visible(this.custom_kkLH::getValue)).parentCategory(this.color_JVFQ)).build();
 this.amount = ((((CategorySetting.builder().name("Amount")).configName("amount-category")).visible(this.custom_XqVe::getValue)).parentCategory(this.stars)).build();
 this.custom_MqRk = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(true)).parentCategory(this.amount)).build();
 this.amount_uajY = ((((NumberSetting.builder().name("Amount")).defaultValue(Float.valueOf(20000.0f))).min(Float.valueOf(200.0f)).max(Float.valueOf(20000.0f)).visible(this.custom_MqRk::getValue)).precision(0).parentCategory(this.amount)).build();
 this.seed = ((((CategorySetting.builder().name("Seed")).configName("seed-category")).visible(this.custom_XqVe::getValue)).parentCategory(this.stars)).build();
 this.custom_HYuN = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(false)).parentCategory(this.seed)).build();
 this.seed_aUIX = ((((NumberSetting.builder().name("Seed")).defaultValue(Float.valueOf(10842.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(20000.0f)).visible(this.custom_HYuN::getValue)).precision(0).parentCategory(this.seed)).build();
 this.worldTime = ((CategorySetting.builder().name("World Time")).configName("world-time-category")).build();
 this.custom_wQBc = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(true)).parentCategory(this.worldTime)).build();
 this.worldTime_lKtG = ((((ModeSetting.builder(WorldTimeMode.class).name("World Time")).defaultValue((Object)WorldTimeMode.Night)).visible(this.custom_wQBc::getValue)).parentCategory(this.worldTime)).build();
 this.time = ((((NumberSetting.builder().name("Time")).defaultValue(Float.valueOf(10000.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(24000.0f)).visible(() -> (Boolean)this.custom_wQBc.getValue() != false && ((((Object)this.worldTime_lKtG.getValue()))).equals((Object)WorldTimeMode.Custom))).precision(0).parentCategory(this.worldTime)).build();
 this.spinSpeed = ((((NumberSetting.builder().name("Spin Speed")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.3f)).max(Float.valueOf(10.0f)).visible(() -> (Boolean)this.custom_wQBc.getValue() != false && ((((Object)this.worldTime_lKtG.getValue()))).equals((Object)WorldTimeMode.Spin))).parentCategory(this.worldTime)).build();
 this.weather = ((CategorySetting.builder().name("Weather")).configName("weather-category")).build();
 this.custom_AAVU = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Custom")).defaultValue(false)).parentCategory(this.weather)).build();
 this.weather_AJeY = ((((ModeSetting.builder(WeatherMode.class).name("Weather")).defaultValue((Object)WeatherMode.Clear)).visible(this.custom_AAVU::getValue)).parentCategory(this.weather)).build();
 this.timer = new Timer();
 }
}

