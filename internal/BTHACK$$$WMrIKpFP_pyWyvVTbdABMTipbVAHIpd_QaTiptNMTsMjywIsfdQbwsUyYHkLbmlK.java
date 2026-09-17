/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$hjvVqLAGswpJTBwMYwPHAnVgytxgmoxxEhxmjHRhkeKpCjIjBaSfGKztcSsKlhoM;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.function.Consumer;

public class BTHACK$$$WMrIKpFP_pyWyvVTbdABMTipbVAHIpd_QaTiptNMTsMjywIsfdQbwsUyYHkLbmlK
extends BTHACK$$$hjvVqLAGswpJTBwMYwPHAnVgytxgmoxxEhxmjHRhkeKpCjIjBaSfGKztcSsKlhoM {
 private final RandomAccessFile ZrAOPFKSKCFUDYxemRyJZiLJSxVYUFnQ;

 public BTHACK$$$WMrIKpFP_pyWyvVTbdABMTipbVAHIpd_QaTiptNMTsMjywIsfdQbwsUyYHkLbmlK(String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, Consumer SvJQspgUzxICnUfNUDcYNSiFTiFPPGPE) throws IOException {
 super(SvJQspgUzxICnUfNUDcYNSiFTiFPPGPE);
 this.ZrAOPFKSKCFUDYxemRyJZiLJSxVYUFnQ = new RandomAccessFile(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, "rw");
 Thread wJHwGOsqnQDGMHiywqIOBouE_VxFujgO = new Thread(this::naNlKcDXaByXPtlpOGuLxqvOgwMPuBMh);
 wJHwGOsqnQDGMHiywqIOBouE_VxFujgO.setName("Discord IPC - Read thread");
 wJHwGOsqnQDGMHiywqIOBouE_VxFujgO.start();
 }
}

