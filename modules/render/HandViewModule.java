/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.CategorySetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="Hand View", category="render")
public class HandViewModule
extends Module {
 public final CategorySetting mainHand;
 public final NumberSetting posX;
 public final NumberSetting posY;
 public final NumberSetting posZ;
 public final NumberSetting rotX;
 public final NumberSetting rotY;
 public final NumberSetting rotZ;
 public final NumberSetting scaleX;
 public final NumberSetting scaleY;
 public final NumberSetting scaleZ;
 public final CategorySetting offHand;
 public final NumberSetting posX_JoqP;
 public final NumberSetting posY_BXa_;
 public final NumberSetting posZ_ZmmO;
 public final NumberSetting rotX_gbJE;
 public final NumberSetting rotY_odPr;
 public final NumberSetting rotZ_dBlP;
 public final NumberSetting scaleX_FjQN;
 public final NumberSetting scaleY_gZrR;
 public final NumberSetting scaleZ_hnue;
 public final BooleanSetting customFov;
 public final NumberSetting fov;

 public HandViewModule() {
 this.mainHand = ((CategorySetting.builder().name("Main Hand")).configName("main-hand-category")).build();
 this.posX = ((((NumberSetting.Builder)NumberSetting.builder().name("Pos X")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-2.0f)).max(Float.valueOf(2.0f)).parentCategory(this.mainHand)).build();
 this.posY = ((((NumberSetting.Builder)NumberSetting.builder().name("Pos y")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-2.0f)).max(Float.valueOf(2.0f)).parentCategory(this.mainHand)).build();
 this.posZ = ((((NumberSetting.Builder)NumberSetting.builder().name("Pos Z")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-2.0f)).max(Float.valueOf(2.0f)).parentCategory(this.mainHand)).build();
 this.rotX = ((((NumberSetting.Builder)NumberSetting.builder().name("Rot X")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-360.0f)).max(Float.valueOf(360.0f)).precision(0).parentCategory(this.mainHand)).build();
 this.rotY = ((((NumberSetting.Builder)NumberSetting.builder().name("Rot Y")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-360.0f)).max(Float.valueOf(360.0f)).precision(0).parentCategory(this.mainHand)).build();
 this.rotZ = ((((NumberSetting.Builder)NumberSetting.builder().name("Rot Z")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-360.0f)).max(Float.valueOf(360.0f)).precision(0).parentCategory(this.mainHand)).build();
 this.scaleX = ((((NumberSetting.Builder)NumberSetting.builder().name("Scale X")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(4.0f)).parentCategory(this.mainHand)).build();
 this.scaleY = ((((NumberSetting.Builder)NumberSetting.builder().name("Scale Y")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(4.0f)).parentCategory(this.mainHand)).build();
 this.scaleZ = ((((NumberSetting.Builder)NumberSetting.builder().name("Scale Z")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(4.0f)).parentCategory(this.mainHand)).build();
 this.offHand = ((CategorySetting.builder().name("Off Hand")).configName("off-hand-category")).build();
 this.posX_JoqP = ((((NumberSetting.Builder)NumberSetting.builder().name("Pos X")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-2.0f)).max(Float.valueOf(2.0f)).parentCategory(this.offHand)).build();
 this.posY_BXa_ = ((((NumberSetting.Builder)NumberSetting.builder().name("Pos y")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-2.0f)).max(Float.valueOf(2.0f)).parentCategory(this.offHand)).build();
 this.posZ_ZmmO = ((((NumberSetting.Builder)NumberSetting.builder().name("Pos Z")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-2.0f)).max(Float.valueOf(2.0f)).parentCategory(this.offHand)).build();
 this.rotX_gbJE = ((((NumberSetting.Builder)NumberSetting.builder().name("Rot X")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-360.0f)).max(Float.valueOf(360.0f)).precision(0).parentCategory(this.offHand)).build();
 this.rotY_odPr = ((((NumberSetting.Builder)NumberSetting.builder().name("Rot Y")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-360.0f)).max(Float.valueOf(360.0f)).precision(0).parentCategory(this.offHand)).build();
 this.rotZ_dBlP = ((((NumberSetting.Builder)NumberSetting.builder().name("Rot Z")).defaultValue(Float.valueOf(0.0f))).min(Float.valueOf(-360.0f)).max(Float.valueOf(360.0f)).precision(0).parentCategory(this.offHand)).build();
 this.scaleX_FjQN = ((((NumberSetting.Builder)NumberSetting.builder().name("Scale X")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(4.0f)).parentCategory(this.offHand)).build();
 this.scaleY_gZrR = ((((NumberSetting.Builder)NumberSetting.builder().name("Scale Y")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(4.0f)).parentCategory(this.offHand)).build();
 this.scaleZ_hnue = ((((NumberSetting.Builder)NumberSetting.builder().name("Scale Z")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(4.0f)).parentCategory(this.offHand)).build();
 this.customFov = ((BooleanSetting.builder().name("Custom Fov")).defaultValue(false)).build();
 this.fov = ((((NumberSetting.Builder)NumberSetting.builder().name("Fov")).defaultValue(Float.valueOf(90.0f))).min(Float.valueOf(10.0f)).max(Float.valueOf(180.0f)).precision(1).visible(this.customFov::getValue)).build();
 }
}

