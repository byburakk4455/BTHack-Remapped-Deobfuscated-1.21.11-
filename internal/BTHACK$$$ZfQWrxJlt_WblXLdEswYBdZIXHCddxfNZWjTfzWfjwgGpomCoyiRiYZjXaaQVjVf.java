/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1799
 * net.minecraft.class_1802
 * net.minecraft.class_9304
 * net.minecraft.class_9334
 */
package com.ferra13671.bthack;

import java.util.function.Function;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

public enum BTHACK$$$ZfQWrxJlt_WblXLdEswYBdZIXHCddxfNZWjTfzWfjwgGpomCoyiRiYZjXaaQVjVf {
 Default(PcojoyPawsbtVjSYDDyJWkSmOITDnusR -> PcojoyPawsbtVjSYDDyJWkSmOITDnusR.tkQvfUgJhBEBcVxaDNIMRpqDEdxRsyMs().method_58657().method_57539()),
 Book(PcojoyPawsbtVjSYDDyJWkSmOITDnusR -> ((class_9304)PcojoyPawsbtVjSYDDyJWkSmOITDnusR.tkQvfUgJhBEBcVxaDNIMRpqDEdxRsyMs().method_58695(class_9334.field_49643, (Object)class_9304.field_49385)).method_57539());

 public final Function getEnchantmentsFunction;

 public static BTHACK$$$ZfQWrxJlt_WblXLdEswYBdZIXHCddxfNZWjTfzWfjwgGpomCoyiRiYZjXaaQVjVf getFromItem(class_1799 frPbEyUaqrmcgVgzdsZGSfXKl_LuHxeH) {
 return frPbEyUaqrmcgVgzdsZGSfXKl_LuHxeH.method_7909() == class_1802.field_8598 ? Book : Default;
 }

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private BTHACK$$$ZfQWrxJlt_WblXLdEswYBdZIXHCddxfNZWjTfzWfjwgGpomCoyiRiYZjXaaQVjVf() {
 void ohSTvNrJPNVJtfhiwlLKqbeOObvHVqPw;
 this.getEnchantmentsFunction = ohSTvNrJPNVJtfhiwlLKqbeOObvHVqPw;
 }
}

