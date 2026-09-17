/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.PlayerESPUtils;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import java.awt.Color;
import java.util.function.BiFunction;

public enum ColorMode {
 Default((PpeTwYbGcResNFQGTvwsfSctWLPdBk_T, trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO) -> RenderColor.of((PpeTwYbGcResNFQGTvwsfSctWLPdBk_T.dMOqEKyDiekpHAh_ELftQSByCMozzuUV.getValue()))),
 Teams((PpeTwYbGcResNFQGTvwsfSctWLPdBk_T, trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO) -> RenderColor.of((Color)new Color(trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO.method_22861()))),
 Gradient((PpeTwYbGcResNFQGTvwsfSctWLPdBk_T, trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO) -> {
 float swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV = 0.5f + (float)(Math.sin(Math.toRadians(360.0f * ((float)PpeTwYbGcResNFQGTvwsfSctWLPdBk_T.HTQXsmnGuXWxPjpJhtimBcfnmogyVI_v.HsYZloKKVeKExS_lqwrzJLkXHaDpAXHF() / 4000.0f) * ((Float)PpeTwYbGcResNFQGTvwsfSctWLPdBk_T.dofepeWlwERVkizOrXTGgGGLqirxjRNN.getValue()).floatValue())) / 2.0);
 return PlayerESPUtils.aHKjVHsJbTPMGDPDHDXahiNHzcCWsUhR(RenderColor.of((PpeTwYbGcResNFQGTvwsfSctWLPdBk_T.MiSqjjLCnFOKtsfuLyNVXaktpwVoNYDh.getValue())), RenderColor.of((PpeTwYbGcResNFQGTvwsfSctWLPdBk_T.KHExnyKXIghXddiMgEpHPBlVqWSGOWgH.getValue())), swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV);
 });

 public final BiFunction colorFunction;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private ColorMode() {
 void P_ylE_iodQrpU_xUJDfDHDq_egrDeqVu;
 this.colorFunction = P_ylE_iodQrpU_xUJDfDHDq_egrDeqVu;
 }
}

