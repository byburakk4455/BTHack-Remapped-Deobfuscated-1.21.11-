/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.Setting;

public class NumberSetting
extends Setting {
 private Float gYlqsbP_sXXNCqaz_YMobrabAxUbitLR;
 private Float DmAALRVoUCfSHPRrCRKsVRDAslKdPQaA;
 private Integer TMXHRwabHAAxUFmdFIuGtlCLWWTqtcnn;

 protected NumberSetting(NumberSetting.Builder dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj) {
 super(dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj);
 this.gYlqsbP_sXXNCqaz_YMobrabAxUbitLR = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.gYlqsbP_sXXNCqaz_YMobrabAxUbitLR;
 this.DmAALRVoUCfSHPRrCRKsVRDAslKdPQaA = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.DmAALRVoUCfSHPRrCRKsVRDAslKdPQaA;
 this.TMXHRwabHAAxUFmdFIuGtlCLWWTqtcnn = dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.eyAlUspEgyYxFAFODjzvagNSkmBzvLUk ? dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj.JfKLksWvvbRNrOjcgkEzirgesmldvpxh : NumberSetting.uGKtKRyCdnCUyIZgKGJ_oqsPXrKmZdQj();
 }

 private static Integer uGKtKRyCdnCUyIZgKGJ_oqsPXrKmZdQj() {
 return 2;
 }

 public static NumberSetting.Builder builder() {
 return new NumberSetting.Builder();
 }
}

