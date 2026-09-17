/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * net.minecraft.class_1297
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import java.awt.Color;
import java.util.function.BiFunction;
import net.minecraft.class_1297;

public enum TeamsColorMode implements IMinecraft
{
 None((h_ElWWYgmEEnwebFsobRP_VtPalELnfJ, JazeHTsCs_lQpsjsuFmuKnluZlmLpHqO) -> JazeHTsCs_lQpsjsuFmuKnluZlmLpHqO),
 YourTeam((h_ElWWYgmEEnwebFsobRP_VtPalELnfJ, JazeHTsCs_lQpsjsuFmuKnluZlmLpHqO) -> TeamsColorMode.mc.field_1724.method_5722((class_1297)h_ElWWYgmEEnwebFsobRP_VtPalELnfJ) ? RenderColor.of((Color)new Color(h_ElWWYgmEEnwebFsobRP_VtPalELnfJ.method_22861())) : JazeHTsCs_lQpsjsuFmuKnluZlmLpHqO),
 AllTeams((h_ElWWYgmEEnwebFsobRP_VtPalELnfJ, JazeHTsCs_lQpsjsuFmuKnluZlmLpHqO) -> RenderColor.of((Color)new Color(h_ElWWYgmEEnwebFsobRP_VtPalELnfJ.method_22861())));

 public final BiFunction colorFunction;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private TeamsColorMode() {
 void P_ylE_iodQrpU_xUJDfDHDq_egrDeqVu;
 this.colorFunction = P_ylE_iodQrpU_xUJDfDHDq_egrDeqVu;
 }
}

