/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.gltextureutils.Pair
 * org.lwjgl.glfw.GLFW
 */
package com.ferra13671.bthack;

import com.ferra13671.gltextureutils.Pair;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.glfw.GLFW;

public enum InputDevice {
 Keyboard((List)new ArrayList(){
 {
 this.add(new Pair((Object)0, (Object)"NONE"));
 for (Field LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG : GLFW.class.getDeclaredFields()) {
 String avvNQfxZbtAVmYCrwXVqxwTMteFiioMx = LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG.getName();
 if (!avvNQfxZbtAVmYCrwXVqxwTMteFiioMx.startsWith("GLFW_KEY_") || !Modifier.isStatic(LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG.getModifiers()) || !Modifier.isFinal(LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG.getModifiers()) || !Modifier.isPublic(LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG.getModifiers())) continue;
 try {
 int WAZniouTJPa_MPgSIOzRLvbbOBYTUeAx = (Integer)LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG.get(null);
 this.add(new Pair((Object)WAZniouTJPa_MPgSIOzRLvbbOBYTUeAx, (Object)avvNQfxZbtAVmYCrwXVqxwTMteFiioMx.substring("GLFW_KEY_".length())));
 }
 catch (IllegalAccessException illegalAccessException) {
 // empty catch block
 }
 }
 }
 }),
 Mouse((List)new ArrayList(){
 {
 this.add(new Pair((Object)0, (Object)"LMB"));
 this.add(new Pair((Object)1, (Object)"RMB"));
 this.add(new Pair((Object)2, (Object)"MMB"));
 this.add(new Pair((Object)3, (Object)"MOUSE_4"));
 this.add(new Pair((Object)4, (Object)"MOUSE_5"));
 this.add(new Pair((Object)5, (Object)"MOUSE_6"));
 this.add(new Pair((Object)6, (Object)"MOUSE_7"));
 this.add(new Pair((Object)7, (Object)"MOUSE_8"));
 }
 });

 private final HashMap keyNames = new HashMap();
 private final HashMap keyValues = new HashMap();

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private InputDevice() {
 void TDEirkgAPIxJZaSWOpXDHKriHzbVAGnU;
 TDEirkgAPIxJZaSWOpXDHKriHzbVAGnU.forEach(kVdiHsbeHtGiFqyfBIIRXpAGTepfcNRF -> {
 this.keyNames.put((Integer)kVdiHsbeHtGiFqyfBIIRXpAGTepfcNRF.getLeft(), (String)kVdiHsbeHtGiFqyfBIIRXpAGTepfcNRF.getRight());
 this.keyValues.put((String)kVdiHsbeHtGiFqyfBIIRXpAGTepfcNRF.getRight(), (Integer)kVdiHsbeHtGiFqyfBIIRXpAGTepfcNRF.getLeft());
 });
 }

 public Map getKeyValues() {
 return Collections.unmodifiableMap(this.keyValues);
 }

 public String getKeyName(int WAZniouTJPa_MPgSIOzRLvbbOBYTUeAx) {
 String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae = (String)this.keyNames.get(WAZniouTJPa_MPgSIOzRLvbbOBYTUeAx);
 if (bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae == null) {
 bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae = "UNKNOWN";
 }
 return bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae;
 }

 public int getKeyValue(String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae) {
 Integer WAZniouTJPa_MPgSIOzRLvbbOBYTUeAx = (Integer)this.keyValues.get(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae);
 if (WAZniouTJPa_MPgSIOzRLvbbOBYTUeAx == null) {
 return -1;
 }
 return WAZniouTJPa_MPgSIOzRLvbbOBYTUeAx;
 }

 public Map getKeyNames() {
 return Collections.unmodifiableMap(this.keyNames);
 }
}

