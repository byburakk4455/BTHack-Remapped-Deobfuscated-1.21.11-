/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1297
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx;
import java.util.function.BiFunction;
import net.minecraft.class_1297;

public enum PriorityMode implements IMinecraft
{
 Distance((eNals_MGmWoGhLiNZurJKvyWdcERMxIZ, sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ) -> (int)((((Float)sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ.YYdtociLMirdRfdpEUysiuCdZHJyDeeJ.getValue()).floatValue() - BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx.JwiqQeYlATijyRdjZwFgBMarFqSTzZGH((class_1297)PriorityMode.mc.field_1724, eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_5829().method_1005().method_46409())) * 1000.0f)),
 HealthMax((eNals_MGmWoGhLiNZurJKvyWdcERMxIZ, sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ) -> (int)(eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_6032() * 1000.0f)),
 HealthMin((eNals_MGmWoGhLiNZurJKvyWdcERMxIZ, sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ) -> 10000000 - (Integer)PriorityMode.HealthMax.priorityFunction.apply(eNals_MGmWoGhLiNZurJKvyWdcERMxIZ, sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ));

 public final BiFunction priorityFunction;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private PriorityMode() {
 void IaOC_qwXZnjdhgdwZvzgmcaHZzvNPmIU;
 this.priorityFunction = IaOC_qwXZnjdhgdwZvzgmcaHZzvNPmIU;
 }
}

