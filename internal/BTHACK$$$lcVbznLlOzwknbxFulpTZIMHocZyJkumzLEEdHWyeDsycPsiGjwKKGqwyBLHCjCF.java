/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.google.gson.JsonObject
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$YhSjiSLi_fclNADcyNgJIvHiAOSPanlbaEGDFJF_WtaPkOatVFVvBvAZkJGrNtEL;
import com.ferra13671.bthack.BTHACK$$$lpNUuSlEMrrCNsXFytWQERbCIUktnCUCc_gmzJukfnhchhncmzkbjxOmaIikmjjt;
import com.ferra13671.bthack.BTHACK$$$uZIRvcszHCMHHcNzFISbcyFEnmBQWTlWsZd_hOFIIGxbcHO_WcTMizqJcCPztclL;
import com.ferra13671.bthack.BTHACK$$$vkStGdoAwR_CHbSFdHTJzMEKYuhuYWrgnpHnzkCQdaQXFczYvGxebRcZFEMCiuFi;
import com.google.gson.JsonObject;
import java.util.function.Function;

public enum BTHACK$$$lcVbznLlOzwknbxFulpTZIMHocZyJkumzLEEdHWyeDsycPsiGjwKKGqwyBLHCjCF {
 Handshake(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg -> {
 throw new UnsupportedOperationException("Cannot create C2S packet from json.");
 }),
 Frame(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg -> {
 if (BTHACK$$$lpNUuSlEMrrCNsXFytWQERbCIUktnCUCc_gmzJukfnhchhncmzkbjxOmaIikmjjt.TOhYOOSFniIorNkMAuweaRYdSfWHLvKV(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg)) {
 return new BTHACK$$$lpNUuSlEMrrCNsXFytWQERbCIUktnCUCc_gmzJukfnhchhncmzkbjxOmaIikmjjt((JsonObject)zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg);
 }
 if (BTHACK$$$YhSjiSLi_fclNADcyNgJIvHiAOSPanlbaEGDFJF_WtaPkOatVFVvBvAZkJGrNtEL.TOhYOOSFniIorNkMAuweaRYdSfWHLvKV(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg)) {
 return new BTHACK$$$YhSjiSLi_fclNADcyNgJIvHiAOSPanlbaEGDFJF_WtaPkOatVFVvBvAZkJGrNtEL((JsonObject)zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg);
 }
 throw new UnsupportedOperationException("Cannot create C2S packet from json.");
 }),
 Close(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg -> new BTHACK$$$uZIRvcszHCMHHcNzFISbcyFEnmBQWTlWsZd_hOFIIGxbcHO_WcTMizqJcCPztclL(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg.get("code").getAsInt(), zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg.get("message").getAsString())),
 Ping(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg -> new BTHACK$$$vkStGdoAwR_CHbSFdHTJzMEKYuhuYWrgnpHnzkCQdaQXFczYvGxebRcZFEMCiuFi()),
 Pong(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg -> new BTHACK$$$vkStGdoAwR_CHbSFdHTJzMEKYuhuYWrgnpHnzkCQdaQXFczYvGxebRcZFEMCiuFi());

 public final Function toPacketFunction;
 private static final BTHACK$$$lcVbznLlOzwknbxFulpTZIMHocZyJkumzLEEdHWyeDsycPsiGjwKKGqwyBLHCjCF[] VALUES;

 public static BTHACK$$$lcVbznLlOzwknbxFulpTZIMHocZyJkumzLEEdHWyeDsycPsiGjwKKGqwyBLHCjCF valueOf(String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae) {
 return Enum.valueOf(BTHACK$$$lcVbznLlOzwknbxFulpTZIMHocZyJkumzLEEdHWyeDsycPsiGjwKKGqwyBLHCjCF.class, bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae);
 }

 static {
 VALUES = BTHACK$$$lcVbznLlOzwknbxFulpTZIMHocZyJkumzLEEdHWyeDsycPsiGjwKKGqwyBLHCjCF.values();
 }

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private BTHACK$$$lcVbznLlOzwknbxFulpTZIMHocZyJkumzLEEdHWyeDsycPsiGjwKKGqwyBLHCjCF() {
 void jZIveFTmzRFZqXrYGkKVulnAHTUSNLiV;
 this.toPacketFunction = jZIveFTmzRFZqXrYGkKVulnAHTUSNLiV;
 }
}

