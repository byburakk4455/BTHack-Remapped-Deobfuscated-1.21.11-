/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.XrayManager;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.XrayBlockList;
import com.ferra13671.bthack.XrayBlock;
import java.util.ArrayList;

@ModuleInfo(name="Xray", category="render")
public class XrayModule
extends Module {
 public final XrayBlockList blocks;
 public final XrayBlock fluids;

 public XrayModule() {
 this.blocks = XrayBlockList.builder().name("Blocks").build();
 this.fluids = XrayBlock.builder().name("Fluids").defaultValue(new ArrayList(XrayManager.XSFDRmJ_xSQ_LAZGcridivchOEkkvQmG.keySet().stream().toList())).build();
 }
}

