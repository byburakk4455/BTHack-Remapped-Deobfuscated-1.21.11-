/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * net.minecraft.class_3532
 */
package com.ferra13671.bthack;

import com.ferra13671.cometrenderer.minecraft.RenderColor;
import java.awt.Color;
import net.minecraft.class_3532;

public final class PlayerESPUtils {
 public static RenderColor aHKjVHsJbTPMGDPDHDXahiNHzcCWsUhR(RenderColor oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS, RenderColor MttHQNQSpPoavJdRResTnCQPROcHZrdo, float swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV) {
 return RenderColor.of((float)class_3532.method_16439((float)swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV, (float)oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS.getColor()[0], (float)MttHQNQSpPoavJdRResTnCQPROcHZrdo.getColor()[0]), (float)class_3532.method_16439((float)swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV, (float)oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS.getColor()[1], (float)MttHQNQSpPoavJdRResTnCQPROcHZrdo.getColor()[1]), (float)class_3532.method_16439((float)swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV, (float)oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS.getColor()[2], (float)MttHQNQSpPoavJdRResTnCQPROcHZrdo.getColor()[2]), (float)class_3532.method_16439((float)swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV, (float)oMStnEdOhqkruP_pCRNEqhOOOPrfyMuS.getColor()[3], (float)MttHQNQSpPoavJdRResTnCQPROcHZrdo.getColor()[3]));
 }

 private PlayerESPUtils() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static Color GLifcentqhtVzROPWrDBvWoMqUloWgwI(RenderColor DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO) {
 return new Color(DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO.getColor()[0], DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO.getColor()[1], DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO.getColor()[2], DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO.getColor()[3]);
 }

 public static int GFPUVQZPritvWhIDGwmNnVdZYixAheFx(RenderColor DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO) {
 return PlayerESPUtils.GLifcentqhtVzROPWrDBvWoMqUloWgwI(DhVYLRlnifuhsZbUPCgdBhKZDNxswwgO).getRGB();
 }

 public static RenderColor ddoQulOfuvCxTWyDqpbmmqbpDsQyThma(float swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV) {
 return RenderColor.of((Color)new Color(class_3532.method_15369((float)(swDXOIgCpLEmSSgwNvUWrgNVKgHayhMV / 3.0f), (float)1.0f, (float)1.0f)));
 }
}

