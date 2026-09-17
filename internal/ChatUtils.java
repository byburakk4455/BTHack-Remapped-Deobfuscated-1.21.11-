/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.mojang.blaze3d.systems.RenderSystem
 * net.minecraft.class_124
 * net.minecraft.class_2561
 * net.minecraft.class_2583
 * net.minecraft.class_5250
 * net.minecraft.class_5251
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BThackClient;
import com.ferra13671.bthack.PlayerESPUtils;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_5251;

public final class ChatUtils
implements IMinecraft {
 private static final RenderColor pirCqAukMovQfpHfPGKrxqe_GPkcQcBg;

 public static void _VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(String DioNuNMrVKRCuKULYuoHtObuybJNYLuf, boolean sCQxiVauWc_csEBRyGmKVzFyJZye_kkv) {
 ChatUtils._VMWacPmcJpdxLufPgNXyFKgtJIcvNyl("BThack", DioNuNMrVKRCuKULYuoHtObuybJNYLuf, ItemUtils.yQgyRbzvArWXVsfxUvs_YEpFdAefcNVK, pirCqAukMovQfpHfPGKrxqe_GPkcQcBg, sCQxiVauWc_csEBRyGmKVzFyJZye_kkv);
 }

 public static void MGqcPKXDiTzWagspeRHhUUjKnsblQYlL(String mdAiKKiTeoMBYGpEgKoHLtIBgCWENfcN) {
 if (BThackClient.nullCheck()) {
 return;
 }
 mc.method_1562().method_45730(mdAiKKiTeoMBYGpEgKoHLtIBgCWENfcN);
 }

 public static void _VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(class_2561 prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG, boolean sCQxiVauWc_csEBRyGmKVzFyJZye_kkv) {
 mc.method_44714().method_44736(prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG, sCQxiVauWc_csEBRyGmKVzFyJZye_kkv);
 }

 public static void _VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(String DioNuNMrVKRCuKULYuoHtObuybJNYLuf) {
 ChatUtils._VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(DioNuNMrVKRCuKULYuoHtObuybJNYLuf, false);
 }

 static {
 pirCqAukMovQfpHfPGKrxqe_GPkcQcBg = PlayerESPUtils.aHKjVHsJbTPMGDPDHDXahiNHzcCWsUhR(ItemUtils.yQgyRbzvArWXVsfxUvs_YEpFdAefcNVK, RenderColor.WHITE, 0.65f);
 }

 private ChatUtils() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static void _VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(String BedAheXACpgqgmvUQcrIlOrCtytFLWKl, String DioNuNMrVKRCuKULYuoHtObuybJNYLuf, RenderColor oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS, RenderColor MttHQNQSpPoavJdRResTnCQPROcHZrdo, boolean sCQxiVauWc_csEBRyGmKVzFyJZye_kkv) {
 if (BThackClient.nullCheck()) {
 return;
 }
 if (!RenderSystem.isOnRenderThread()) {
 BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.EziOWGsTPRiWZANrkNewXAALGhFfoANA(() -> ChatUtils._VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(BedAheXACpgqgmvUQcrIlOrCtytFLWKl, DioNuNMrVKRCuKULYuoHtObuybJNYLuf, oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS, MttHQNQSpPoavJdRResTnCQPROcHZrdo, sCQxiVauWc_csEBRyGmKVzFyJZye_kkv));
 return;
 }
 class_5250 prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG = class_2561.method_43470((String)"");
 prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG.method_27693(String.valueOf(class_124.field_1080) + "[");
 for (int HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO = 0; HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO < BedAheXACpgqgmvUQcrIlOrCtytFLWKl.length(); ++HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO) {
 float swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV = ((float)HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO + 1.0f) / (float)BedAheXACpgqgmvUQcrIlOrCtytFLWKl.length();
 class_5251 DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO = class_5251.method_27717((int)PlayerESPUtils.GFPUVQZPritvWhIDGwmNnVdZYixAheFx(PlayerESPUtils.aHKjVHsJbTPMGDPDHDXahiNHzcCWsUhR(oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS, MttHQNQSpPoavJdRResTnCQPROcHZrdo, swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV)));
 class_5250 yBvQnyeBljkglseUJFPBumVI_LeTResE = class_2561.method_43470((String)Character.toString(BedAheXACpgqgmvUQcrIlOrCtytFLWKl.charAt(HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO))).method_10862(class_2583.field_24360.method_10982(Boolean.valueOf(true)).method_27703(DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO));
 prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG.method_10852((class_2561)yBvQnyeBljkglseUJFPBumVI_LeTResE);
 }
 prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG.method_27693(String.valueOf(class_124.field_1080) + "] " + String.valueOf(class_124.field_1068) + DioNuNMrVKRCuKULYuoHtObuybJNYLuf);
 ChatUtils._VMWacPmcJpdxLufPgNXyFKgtJIcvNyl((class_2561)prZrIKghdkJvuNC_aNqbwdYsg_RSfsSG, sCQxiVauWc_csEBRyGmKVzFyJZye_kkv);
 }
}

