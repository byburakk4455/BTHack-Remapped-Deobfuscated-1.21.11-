/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1893
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.CategorySetting;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import java.util.HashMap;
import net.minecraft.class_1893;

@ModuleInfo(name="Auto Armor", category="combat")
public class AutoArmorModule
extends Module {
 public final CategorySetting score;
 public final NumberSetting armor;
 public final NumberSetting armorToughness;
 public final NumberSetting knockbackResistance;
 public final NumberSetting protection;
 public final NumberSetting blastProtection;
 public final NumberSetting thorns;
 public final NumberSetting unbreaking;
 public final NumberSetting mending;
 public final NumberSetting depthStrider;
 public final NumberSetting respiration;
 public final NumberSetting featherFalling;
 public final NumberSetting bindingCurse;
 public final NumberSetting vanishingCurse;
 public final BooleanSetting antiBindingCurse;
 public final BooleanSetting keepElytra;
 private final HashMap armorMap;

 public AutoArmorModule() {
 this.score = ((CategorySetting.builder().name("Score")).configName("score-category")).build();
 this.armor = ((((NumberSetting.Builder)NumberSetting.builder().name("Armor")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.armorToughness = ((((NumberSetting.Builder)NumberSetting.builder().name("Armor Toughness")).defaultValue(Float.valueOf(0.5f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.knockbackResistance = ((((NumberSetting.Builder)NumberSetting.builder().name("Knockback Resistance")).defaultValue(Float.valueOf(0.5f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.protection = ((((NumberSetting.Builder)NumberSetting.builder().name("Protection")).defaultValue(Float.valueOf(3.0f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.blastProtection = ((((NumberSetting.Builder)NumberSetting.builder().name("Blast Protection")).defaultValue(Float.valueOf(2.0f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.thorns = ((((NumberSetting.Builder)NumberSetting.builder().name("Thorns")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.unbreaking = ((((NumberSetting.Builder)NumberSetting.builder().name("Unbreaking")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.mending = ((((NumberSetting.Builder)NumberSetting.builder().name("Mending")).defaultValue(Float.valueOf(4.0f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.depthStrider = ((((NumberSetting.Builder)NumberSetting.builder().name("Depth Strider")).defaultValue(Float.valueOf(0.5f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.respiration = ((((NumberSetting.Builder)NumberSetting.builder().name("Respiration")).defaultValue(Float.valueOf(0.5f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.featherFalling = ((((NumberSetting.Builder)NumberSetting.builder().name("Feather Falling")).defaultValue(Float.valueOf(1.0f))).min(Float.valueOf(-10.0f)).max(Float.valueOf(10.0f)).precision(1).parentCategory(this.score)).build();
 this.bindingCurse = ((((NumberSetting.Builder)NumberSetting.builder().name("Binding Curse")).defaultValue(Float.valueOf(-50.0f))).min(Float.valueOf(-200.0f)).max(Float.valueOf(10.0f)).precision(0).parentCategory(this.score)).build();
 this.vanishingCurse = ((((NumberSetting.Builder)NumberSetting.builder().name("Vanishing Curse")).defaultValue(Float.valueOf(-1.0f))).min(Float.valueOf(-200.0f)).max(Float.valueOf(10.0f)).precision(0).parentCategory(this.score)).build();
 this.antiBindingCurse = ((BooleanSetting.builder().name("Anti Binding Curse")).defaultValue(true)).build();
 this.keepElytra = ((BooleanSetting.builder().name("Keep Elytra")).defaultValue(true)).build();
 this.armorMap = new HashMap(this){
 final AutoArmorModule iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb;
 {
 this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb = BrFrQfPicyduKvaOIZfSbSnd_cCLxhwC;
 this.put(class_1893.field_9111, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.protection::getValue);
 this.put(class_1893.field_9107, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.blastProtection::getValue);
 this.put(class_1893.field_9097, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.thorns::getValue);
 this.put(class_1893.field_9119, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.unbreaking::getValue);
 this.put(class_1893.field_9101, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.mending::getValue);
 this.put(class_1893.field_9128, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.depthStrider::getValue);
 this.put(class_1893.field_9127, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.respiration::getValue);
 this.put(class_1893.field_9129, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.featherFalling::getValue);
 this.put(class_1893.field_9113, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.bindingCurse::getValue);
 this.put(class_1893.field_9109, this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb.vanishingCurse::getValue);
 }
 };
 }
}

