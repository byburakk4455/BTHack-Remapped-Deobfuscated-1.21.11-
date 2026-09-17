/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.CategorySetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;

@ModuleInfo(name="No Render", category="render")
public class NoRenderModule
extends Module {
 public final CategorySetting overlay;
 public final BooleanSetting hurtCamera;
 public final BooleanSetting headOverlay;
 public final BooleanSetting powderSnow;
 public final BooleanSetting fire;
 public final BooleanSetting water;
 public final BooleanSetting inWallOverlay;
 public final BooleanSetting bossBar;
 public final BooleanSetting sleep;
 public final BooleanSetting portal;
 public final BooleanSetting vignette;
 public final BooleanSetting spyglass;
 public final BooleanSetting nausea;
 public final CategorySetting world;
 public final BooleanSetting explosions;
 public final BooleanSetting armor;
 public final BooleanSetting totemAnimation;
 public final BooleanSetting fallingBlocks;
 public final BooleanSetting armorStands;
 public final BooleanSetting textureRotation;

 public NoRenderModule() {
 this.overlay = ((CategorySetting.builder().name("Overlay")).configName("overlay-category")).build();
 this.hurtCamera = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Hurt Camera")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.headOverlay = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Head Overlay")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.powderSnow = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Powder Snow")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.fire = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Fire")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.water = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Water")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.inWallOverlay = ((((BooleanSetting.Builder)BooleanSetting.builder().name("In Wall Overlay")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.bossBar = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Boss Bar")).defaultValue(false)).parentCategory(this.overlay)).build();
 this.sleep = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Sleep")).defaultValue(false)).parentCategory(this.overlay)).build();
 this.portal = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Portal")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.vignette = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Vignette")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.spyglass = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Spyglass")).defaultValue(false)).parentCategory(this.overlay)).build();
 this.nausea = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Nausea")).defaultValue(true)).parentCategory(this.overlay)).build();
 this.world = ((CategorySetting.builder().name("World")).configName("world-category")).build();
 this.explosions = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Explosions")).defaultValue(false)).parentCategory(this.world)).build();
 this.armor = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Armor")).defaultValue(false)).parentCategory(this.world)).build();
 this.totemAnimation = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Totem Animation")).defaultValue(false)).parentCategory(this.world)).build();
 this.fallingBlocks = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Falling Blocks")).defaultValue(false)).parentCategory(this.world)).build();
 this.armorStands = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Armor Stands")).defaultValue(false)).parentCategory(this.world)).build();
 this.textureRotation = ((((BooleanSetting.Builder)BooleanSetting.builder().name("Texture Rotation")).defaultValue(false)).parentCategory(this.world)).build();
 }
}

