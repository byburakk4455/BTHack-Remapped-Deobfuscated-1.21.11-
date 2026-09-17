/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BThackClient;
import com.ferra13671.bthack.Setting;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class BTHACK$$$HSrsXsyqdWmgRrbCgycEewcRoxKcSffZZsMDsTWelmhBILPUSVwrcMRdJydwAzFl {
 public static List UiQdtGrGwLeLnuGQFUQppYUxGHxzZCiT(Class EspqxgrjJYExqDZLPacAFETIseblUPwq, Object miWzVthnfgiogMgNVeUNlBFNPAG_FWet) {
 return BTHACK$$$HSrsXsyqdWmgRrbCgycEewcRoxKcSffZZsMDsTWelmhBILPUSVwrcMRdJydwAzFl.UiQdtGrGwLeLnuGQFUQppYUxGHxzZCiT(EspqxgrjJYExqDZLPacAFETIseblUPwq, miWzVthnfgiogMgNVeUNlBFNPAG_FWet, new ArrayList());
 }

 public static Enum Yxro_QdAbnIRgLbSz_EgNlbmUDnRleZf(Class EspqxgrjJYExqDZLPacAFETIseblUPwq, String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae) {
 Enum[] GZVisbWAZQdxk_RAVgsynhUZofXxVzpv;
 for (Enum qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ : GZVisbWAZQdxk_RAVgsynhUZofXxVzpv = (Enum[])EspqxgrjJYExqDZLPacAFETIseblUPwq.getEnumConstants()) {
 if (!qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ.name().equals(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae)) continue;
 return qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ;
 }
 return null;
 }

 private BTHACK$$$HSrsXsyqdWmgRrbCgycEewcRoxKcSffZZsMDsTWelmhBILPUSVwrcMRdJydwAzFl() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static List UiQdtGrGwLeLnuGQFUQppYUxGHxzZCiT(Class EspqxgrjJYExqDZLPacAFETIseblUPwq, Object miWzVthnfgiogMgNVeUNlBFNPAG_FWet, List iobbcPpjUlWffginkftsiUsAOWDPfXiJ) {
 for (Field LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG : EspqxgrjJYExqDZLPacAFETIseblUPwq.getDeclaredFields()) {
 try {
 LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG.setAccessible(true);
 Object object = LhjcDiAPgKKuVTSYGmwqhQSlySWNumTG.get(miWzVthnfgiogMgNVeUNlBFNPAG_FWet);
 if (!(object instanceof Setting)) continue;
 Setting biPCJJnrdcbmIdoskAIZilsnxasFSbNH = (Setting)object;
 if (!biPCJJnrdcbmIdoskAIZilsnxasFSbNH.xrEaVjmJimUWRdPzegcIunTLsMrkTZqZ()) {
 iobbcPpjUlWffginkftsiUsAOWDPfXiJ.add(biPCJJnrdcbmIdoskAIZilsnxasFSbNH);
 continue;
 }
 ((List)biPCJJnrdcbmIdoskAIZilsnxasFSbNH.VsmxHZnlAUbNQaQVbCIoCtVbFMvncu_z().getValue()).add(biPCJJnrdcbmIdoskAIZilsnxasFSbNH);
 }
 catch (Exception qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ) {
 qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ.printStackTrace(BThackClient.getInstance().XWsSTTJ_kErStBbyZfbjdwdWYYkHyEMl().getExceptionWriter());
 }
 }
 Class VzsEZpSEenzFGimfMkVawtBBwPDOhaXe = EspqxgrjJYExqDZLPacAFETIseblUPwq.getSuperclass();
 if (!VzsEZpSEenzFGimfMkVawtBBwPDOhaXe.equals(Object.class)) {
 BTHACK$$$HSrsXsyqdWmgRrbCgycEewcRoxKcSffZZsMDsTWelmhBILPUSVwrcMRdJydwAzFl.UiQdtGrGwLeLnuGQFUQppYUxGHxzZCiT(VzsEZpSEenzFGimfMkVawtBBwPDOhaXe, miWzVthnfgiogMgNVeUNlBFNPAG_FWet, iobbcPpjUlWffginkftsiUsAOWDPfXiJ);
 }
 return iobbcPpjUlWffginkftsiUsAOWDPfXiJ;
 }
}

