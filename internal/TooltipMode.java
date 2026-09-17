/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.bthack.loader.api.ClientLoader
 * com.ferra13671.bthack.loader.api.resource.Resource
 * com.ferra13671.cometrenderer.minecraft.font.FontInfo
 * com.ferra13671.cometrenderer.minecraft.font.FontType
 * com.ferra13671.cometrenderer.minecraft.font.TTFFont
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.loader.api.ClientLoader;
import com.ferra13671.bthack.loader.api.resource.Resource;
import com.ferra13671.cometrenderer.minecraft.font.FontInfo;
import com.ferra13671.cometrenderer.minecraft.font.FontType;
import com.ferra13671.cometrenderer.minecraft.font.TTFFont;
import java.awt.Font;
import java.io.InputStream;
import java.util.HashMap;

public enum TooltipMode {
 LIGHT(ClientLoader.getInstance().getResourceManager().getResource(new Resource("bthack-client", "SF-Pro-Rounded-Light.otf"))),
 REGULAR(ClientLoader.getInstance().getResourceManager().getResource(new Resource("bthack-client", "SF-Pro-Rounded-Regular.otf"))),
 SEMIBOLD(ClientLoader.getInstance().getResourceManager().getResource(new Resource("bthack-client", "SF-Pro-Rounded-Semibold.otf")));

 public final Font font;
 private final HashMap fonts = new HashMap();

 public TTFFont getOrLoad(int _TW_TAi_BSmRLgjdqjXeBkmT_enSZiPU) {
 return this.fonts.computeIfAbsent(_TW_TAi_BSmRLgjdqjXeBkmT_enSZiPU, mdAiKKiTeoMBYGpEgKoHLtIBgCWENfcN -> new TTFFont(FontInfo.builder().font(this.font).fontSize(mdAiKKiTeoMBYGpEgKoHLtIBgCWENfcN.intValue()).fontType(FontType.Plain).build()));
 }

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private TooltipMode() {
 void ujc_bGMr_pxSnHbvDocuOcjHNyydQFBh;
 this.font = Font.createFont(0, (InputStream)ujc_bGMr_pxSnHbvDocuOcjHNyydQFBh);
 }
}

