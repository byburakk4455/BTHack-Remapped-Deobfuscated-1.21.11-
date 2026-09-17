/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_243
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.FreeCameraEntity;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import net.minecraft.class_243;

@ModuleInfo(name="Free Camera", category="misc")
public class FreeCameraModule
extends Module {
 public final NumberSetting verticalSpeed;
 public final NumberSetting horizontalSpeed;
 public final BooleanSetting playerMoveSync;
 public final BooleanSetting smoothMovement;
 public final NumberSetting smoothStrength;
 public final BooleanSetting raycast;
 public final BooleanSetting rotate;
 public final FreeCameraEntity cameraEntity;
 protected class_243 prevPos;
 protected class_243 cameraPos;
 protected class_243 playerPos;

 public FreeCameraModule() {
 this.verticalSpeed = ((NumberSetting.builder().name("Vertical Speed")).defaultValue(Float.valueOf(10.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(100.0f)).build();
 this.horizontalSpeed = ((NumberSetting.builder().name("Horizontal Speed")).defaultValue(Float.valueOf(10.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(100.0f)).build();
 this.playerMoveSync = ((BooleanSetting.builder().name("Player Move Sync")).defaultValue(false)).build();
 this.smoothMovement = ((BooleanSetting.builder().name("Smooth movement")).defaultValue(true)).build();
 this.smoothStrength = ((((NumberSetting.Builder)NumberSetting.builder().name("Smooth Strength")).defaultValue(Float.valueOf(0.35f))).min(Float.valueOf(0.1f)).max(Float.valueOf(1.0f)).visible(this.smoothMovement::getValue)).build();
 this.raycast = ((BooleanSetting.builder().name("Raycast")).defaultValue(true)).build();
 this.rotate = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Rotate")).defaultValue(false)).visible(this.raycast::getValue)).build();
 this.cameraEntity = new FreeCameraEntity();
 }
}

