/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.google.gson.JsonObject
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$h_D_aqaQQilLHSSadWhlDvgqkGMYRHgyBqWPn_KQxsDXnpNwYsQRvXGDClojRRNu;
import com.google.gson.JsonObject;

public final class BTHACK$$$YhSjiSLi_fclNADcyNgJIvHiAOSPanlbaEGDFJF_WtaPkOatVFVvBvAZkJGrNtEL
extends Record
implements BTHACK$$$h_D_aqaQQilLHSSadWhlDvgqkGMYRHgyBqWPn_KQxsDXnpNwYsQRvXGDClojRRNu {
 private final int xSCAYoA_ykpDIWxCDegBwGgacKcxmknq;
 private final String NJNAYoUwzuZjrrpQ_hJOUjlNZwfRiZcb;

 public BTHACK$$$YhSjiSLi_fclNADcyNgJIvHiAOSPanlbaEGDFJF_WtaPkOatVFVvBvAZkJGrNtEL(JsonObject zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg) {
 this(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg.getAsJsonObject("data").get("code").getAsInt(), zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg.getAsJsonObject("data").get("message").getAsString());
 }

 public BTHACK$$$YhSjiSLi_fclNADcyNgJIvHiAOSPanlbaEGDFJF_WtaPkOatVFVvBvAZkJGrNtEL(int BEYSXeLykMRlqRsskMUQCZYCYnKXUbPG, String DioNuNMrVKRCuKULYuoHtObuybJNYLuf) {
 this.xSCAYoA_ykpDIWxCDegBwGgacKcxmknq = BEYSXeLykMRlqRsskMUQCZYCYnKXUbPG;
 this.NJNAYoUwzuZjrrpQ_hJOUjlNZwfRiZcb = DioNuNMrVKRCuKULYuoHtObuybJNYLuf;
 }

 public static boolean TOhYOOSFniIorNkMAuweaRYdSfWHLvKV(JsonObject zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg) {
 return zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg.has("evt") && zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg.get("evt").getAsString().equals("ERROR");
 }
}

