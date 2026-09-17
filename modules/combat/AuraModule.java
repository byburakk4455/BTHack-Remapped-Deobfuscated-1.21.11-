/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1309
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ModeSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.CategorySetting;
import com.ferra13671.bthack.CritMode;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.AuraTargetHandler;
import com.ferra13671.bthack.AuraRotationHandler;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.ActionTimer;
import com.ferra13671.bthack.PriorityMode;
import com.ferra13671.bthack.AuraAttackHandler;
import com.ferra13671.bthack.DelayMode;
import com.ferra13671.bthack.Timer;
import net.minecraft.class_1309;

@ModuleInfo(name="Aura", category="combat")
public class AuraModule
extends Module {
 public final NumberSetting targetRange;
 public final NumberSetting attackRange;
 public final NumberSetting fov;
 public final ModeSetting critMode;
 public final ModeSetting delayMode;
 public final NumberSetting delay;
 public final BooleanSetting sprintReset;
 public final CategorySetting rotation;
 public final BooleanSetting smartRotate;
 public final NumberSetting angleStep;
 public final BooleanSetting moveFix;
 public final CategorySetting targets;
 public final ModeSetting priority;
 public final BooleanSetting enemyPriority;
 public final BooleanSetting lockTarget;
 public final BooleanSetting players;
 public final BooleanSetting friends;
 public final BooleanSetting teammates;
 public final BooleanSetting invisibles;
 public final BooleanSetting mobs;
 public final BooleanSetting hostiles;
 public final BooleanSetting passives;
 public final BooleanSetting golems;
 public final CategorySetting pauseIf;
 public final BooleanSetting eating;
 public final BooleanSetting notWeaponInHand;
 protected class_1309 target;
 protected final Timer timer;
 private final AuraAttackHandler attackHandler;
 private final AuraRotationHandler rotationHandler;
 private final AuraTargetHandler targetHandler;
 protected final ActionTimer actionTimer;
 public boolean rotating;

 public AuraModule() {
 this.targetRange = ((NumberSetting.builder().name("Target Range")).defaultValue(Float.valueOf(3.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(7.0f)).precision(1).build();
 this.attackRange = ((NumberSetting.builder().name("Attack Range")).defaultValue(Float.valueOf(3.0f))).min(Float.valueOf(1.0f)).max(Float.valueOf(7.0f)).precision(1).build();
 this.fov = ((NumberSetting.builder().name("Fov")).defaultValue(Float.valueOf(360.0f))).min(Float.valueOf(5.0f)).max(Float.valueOf(360.0f)).precision(0).build();
 this.critMode = ((((ModeSetting.Builder)ModeSetting.builder(CritMode.class).name("Crit Mode")).configName("criticals-mode")).defaultValue(CritMode.None)).build();
 this.delayMode = ((ModeSetting.builder(DelayMode.class).name("Delay Mode")).defaultValue(DelayMode.Cooldown)).build();
 this.delay = ((((NumberSetting.Builder)NumberSetting.builder().name("Delay")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(0.01f)).max(Float.valueOf(5.0f)).visible(() -> this.delayMode.getValue() == DelayMode.Timer)).build();
 this.sprintReset = ((BooleanSetting.builder().name("Sprint Reset")).defaultValue(true)).build();
 this.rotation = ((CategorySetting.builder().name("Rotation")).configName("rotation-category")).build();
 this.smartRotate = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Smart Rotate")).defaultValue(true)).parentCategory(this.rotation)).build();
 this.angleStep = ((((NumberSetting.Builder)NumberSetting.builder().name("Angle Step")).defaultValue(Float.valueOf(20.0f))).min(Float.valueOf(0.1f)).max(Float.valueOf(90.0f)).precision(1).parentCategory(this.rotation)).build();
 this.moveFix = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Move Fix")).defaultValue(true)).parentCategory(this.rotation)).build();
 this.targets = ((CategorySetting.builder().name("Targets")).configName("targets-category")).build();
 this.priority = ((((ModeSetting.Builder)ModeSetting.builder(PriorityMode.class).name("Priority")).defaultValue(PriorityMode.Distance)).parentCategory(this.targets)).build();
 this.enemyPriority = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Enemy Priority")).defaultValue(true)).parentCategory(this.targets)).build();
 this.lockTarget = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Lock Target")).defaultValue(false)).parentCategory(this.targets)).build();
 this.players = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Players")).defaultValue(true)).parentCategory(this.targets)).build();
 this.friends = ((((BooleanSetting.builder().name("Friends")).defaultValue(false)).visible(this.players::getValue)).parentCategory(this.targets)).build();
 this.teammates = ((((BooleanSetting.builder().name("Teammates")).defaultValue(false)).visible(this.players::getValue)).parentCategory(this.targets)).build();
 this.invisibles = ((((BooleanSetting.builder().name("Invisibles")).defaultValue(true)).visible(this.players::getValue)).parentCategory(this.targets)).build();
 this.mobs = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Mobs")).defaultValue(false)).parentCategory(this.targets)).build();
 this.hostiles = ((((BooleanSetting.builder().name("Hostiles")).defaultValue(true)).visible(this.mobs::getValue)).parentCategory(this.targets)).build();
 this.passives = ((((BooleanSetting.builder().name("Passives")).defaultValue(false)).visible(this.mobs::getValue)).parentCategory(this.targets)).build();
 this.golems = ((((BooleanSetting.builder().name("Golems")).defaultValue(true)).visible(this.mobs::getValue)).parentCategory(this.targets)).build();
 this.pauseIf = ((CategorySetting.builder().name("Pause If")).configName("pause-if-category")).build();
 this.eating = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Eating")).defaultValue(true)).parentCategory(this.pauseIf)).build();
 this.notWeaponInHand = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Not Weapon In Hand")).defaultValue(false)).parentCategory(this.pauseIf)).build();
 this.target = null;
 this.timer = new Timer();
 this.attackHandler = new AuraAttackHandler(this);
 this.rotationHandler = new AuraRotationHandler(this);
 this.targetHandler = new AuraTargetHandler(this);
 this.actionTimer = new ActionTimer(1000, () -> this.rotationHandler.KXVgfOxUcmNzmgjDnWSnRXDKVAaWueHm, this.moveFix::getValue, () -> !this.isEnabled() || this.target == null);
 this.rotating = false;
 }
}

