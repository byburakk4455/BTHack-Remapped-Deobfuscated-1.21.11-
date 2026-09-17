/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.google.gson.JsonObject
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$ZHLYfGxUgyEZnbo_c_pcDpDAKwrj_jWMyUqfnKbmRmBBPfrISXxJMwaznkBctOvl;
import com.google.gson.JsonObject;
import java.nio.ByteBuffer;
import java.util.UUID;

public interface BTHACK$$$Z_jOxv_DhKkmqaOoFSDlRWXMnodFRVXcXIeNVPxwEqSVJcLkudXSugOUaTIlbaZd
extends BTHACK$$$ZHLYfGxUgyEZnbo_c_pcDpDAKwrj_jWMyUqfnKbmRmBBPfrISXxJMwaznkBctOvl {
 public JsonObject ZNTVRxhLkbITLFB_vJYkHkTwDUGndIir();

 public static ByteBuffer CdwrDgrZBFgyslwcCLragStdyEJyndMt(BTHACK$$$Z_jOxv_DhKkmqaOoFSDlRWXMnodFRVXcXIeNVPxwEqSVJcLkudXSugOUaTIlbaZd qyydiLaqIuoEzdPUvZosepBgRwhyPSJy) {
 JsonObject jLjxfhQcFnlTOtsESTMFTVuyaoTnWTZJ = qyydiLaqIuoEzdPUvZosepBgRwhyPSJy.ZNTVRxhLkbITLFB_vJYkHkTwDUGndIir();
 jLjxfhQcFnlTOtsESTMFTVuyaoTnWTZJ.addProperty("nonce", UUID.randomUUID().toString());
 byte[] bdyIC_vOFcIwGncjlssdzHBmYCxbSfJa = jLjxfhQcFnlTOtsESTMFTVuyaoTnWTZJ.toString().getBytes();
 ByteBuffer BjhhVdbOOYxrGQOTbzNIemamQafBxXGD = ByteBuffer.allocate(bdyIC_vOFcIwGncjlssdzHBmYCxbSfJa.length + 8);
 BjhhVdbOOYxrGQOTbzNIemamQafBxXGD.putInt(Integer.reverseBytes(qyydiLaqIuoEzdPUvZosepBgRwhyPSJy.anZUrHbbIwadGXwEUZCDtvPyuZwGCjWw().ordinal()));
 BjhhVdbOOYxrGQOTbzNIemamQafBxXGD.putInt(Integer.reverseBytes(bdyIC_vOFcIwGncjlssdzHBmYCxbSfJa.length));
 BjhhVdbOOYxrGQOTbzNIemamQafBxXGD.put(bdyIC_vOFcIwGncjlssdzHBmYCxbSfJa);
 BjhhVdbOOYxrGQOTbzNIemamQafBxXGD.rewind();
 return BjhhVdbOOYxrGQOTbzNIemamQafBxXGD;
 }
}

