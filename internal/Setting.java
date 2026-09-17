/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.google.gson.JsonElement
 * lombok.NonNull
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$NuNNPjOPqcbXUEJZLNXtOPRESrn_GJvkmYBlruAaXPnAALIfvWBqGOxoCybUGYUU;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.CategorySetting;
import com.ferra13671.bthack.BTHACK$$$YleohjWjvtFTJyNZNEJQronb_ZrGycamJqQENUNiaHCEouBsTBvhRsRqiMbtqgRo;
import com.ferra13671.bthack.BTHACK$$$yPKxmDjcqXAxucYDrcTyyoSqyOUEPklXfyzuCDKYKvyiGHZVzDDpCUVSYFuhTtEt;
import com.google.gson.JsonElement;
import java.util.function.Supplier;
import lombok.NonNull;

public abstract class Setting {
 @NonNull
 protected final String name;
 protected String description;
 @NonNull
 protected Object value;
 @NonNull
 protected Supplier visibleSupplier;
 protected CategorySetting parentCategory;
 protected String sound;

 public abstract void setValue(SettingChangeCallback var1);

 private static Supplier AoQNXhIgWEGOVbfggsEviOtFhqbvzGX_() {
 return () -> true;
 }

 public abstract JsonElement toJson();

 private static String zOINMQNKHOJCAkSMKHaNRbhkscAESGuK() {
 return "";
 }

 private static String NeyxNcpMcXQQixxuOiCahqxfpsxEDGWr() {
 return null;
 }

 protected Setting(Setting.Builder dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj) {
 this.name = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.name;
 if (this.name == null) {
 throw new NullPointerException("name is marked non-null but is null");
 }
 this.description = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.swXbJ_CayYhiLWxIEElKcSLdLGxrP_JQ ? dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.RvxmGEkrrZsxAlMOaJdKvaCHlYQhLvpo : Setting.NeyxNcpMcXQQixxuOiCahqxfpsxEDGWr();
 this.value = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.value;
 if (this.value == null) {
 throw new NullPointerException("value is marked non-null but is null");
 }
 this.visibleSupplier = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.kYeuVYlPxARclljkFeqJR_WpSzjaAkU_ ? dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.bZXqlyCwVrYCtbuYkwOfRsUXoWeeTEjm : Setting.AoQNXhIgWEGOVbfggsEviOtFhqbvzGX_();
 if (this.visibleSupplier == null) {
 throw new NullPointerException("visibleSupplier is marked non-null but is null");
 }
 this.parentCategory = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.UXcPuUVsFdDcuoMSQlcoEhtBqFsBhmIJ ? dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.mdnlakms_HvaqdkuADtpDLChVzQaGZKD : Setting.yxocDIHsfnftzdrMZofchxtfFSEPenwE();
 this.sound = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.ZUmDmaGffZiVrxK_OKmTGiheTeBlxYFD ? dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.UUEdHCMtJbJfaQInDzkbpbDTUHGPEhYn : Setting.zOINMQNKHOJCAkSMKHaNRbhkscAESGuK();
 }

 private static CategorySetting yxocDIHsfnftzdrMZofchxtfFSEPenwE() {
 return null;
 }

 public abstract SettingComponent fNyMMMgAvZJvjXWJEzkLTeDWZzNntrhH(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc var1, BTHACK$$$yPKxmDjcqXAxucYDrcTyyoSqyOUEPklXfyzuCDKYKvyiGHZVzDDpCUVSYFuhTtEt var2, float var3, float var4, float var5);
}

