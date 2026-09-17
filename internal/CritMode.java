/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.AuraModule;
import java.util.function.Function;

public enum CritMode implements IMinecraft
{
 None(CWUQxvC_WcziGYtIYaCKNjxdPlfpOBhQ -> true),
 Only(AuraModule::lltfXyYDlKrwed_tBGaarwPYugpmIMfl),
 Smart(CWUQxvC_WcziGYtIYaCKNjxdPlfpOBhQ -> !CritMode.mc.field_1724.field_3913.field_54155.comp_3163() || (Boolean)CritMode.Only.canAttackFunction.apply(CWUQxvC_WcziGYtIYaCKNjxdPlfpOBhQ) != false);

 public final Function canAttackFunction;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private CritMode() {
 void FbNpdXZvE_NteyHgInCqBWXcgDOvSziZ;
 this.canAttackFunction = FbNpdXZvE_NteyHgInCqBWXcgDOvSziZ;
 }
}

