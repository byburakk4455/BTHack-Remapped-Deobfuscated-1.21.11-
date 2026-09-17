/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.google.gson.JsonObject
 * com.google.gson.JsonParser
 * com.google.gson.JsonPrimitive
 * lombok.NonNull
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$ltfksbkKEWdzzPredJpKKMaXF_gnHstGLqQCFbLujGUolCidMbHKeIuMnzsqxDey;
import com.ferra13671.bthack.BTHACK$$$wkxvjb_VnKHisVKweLsANIGYQbbNgvnscaaXVyIjYWOwvOLxi_N_ilWwkxAa_wCq;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import lombok.NonNull;

public final class BTHACK$$$VjKvUyykWyRUFXlYHuhsgkzFUFrVWNbbc_sudZCDjpZFYFJfoBSloARXwPMsguGV {
 static Map bjtnXMgRSrjcKPtBvScdNoNhwvIKStCg(@NonNull JsonObject zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg, @NonNull Map QNNUAhXKhljBpIOYqhgnxvtnmhidKfJe, @NonNull BTHACK$$$wkxvjb_VnKHisVKweLsANIGYQbbNgvnscaaXVyIjYWOwvOLxi_N_ilWwkxAa_wCq BedAheXACpgqgmvUQcrIlOrCtytFLWKl) {
 if (zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg == null) {
 throw new NullPointerException("jsonObject is marked non-null but is null");
 }
 if (QNNUAhXKhljBpIOYqhgnxvtnmhidKfJe == null) {
 throw new NullPointerException("translations is marked non-null but is null");
 }
 if (BedAheXACpgqgmvUQcrIlOrCtytFLWKl == null) {
 throw new NullPointerException("prefix is marked non-null but is null");
 }
 zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg.asMap().forEach((bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal) -> {
 JsonPrimitive ZxYUujBylkewyzgXcBNoUudgZsONluh_;
 BTHACK$$$wkxvjb_VnKHisVKweLsANIGYQbbNgvnscaaXVyIjYWOwvOLxi_N_ilWwkxAa_wCq VbLEILenqmXQxdyaJFogVpnTwAqlkwMo = new BTHACK$$$wkxvjb_VnKHisVKweLsANIGYQbbNgvnscaaXVyIjYWOwvOLxi_N_ilWwkxAa_wCq(BedAheXACpgqgmvUQcrIlOrCtytFLWKl.configName().isEmpty() ? bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae : (bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae.isEmpty() ? BedAheXACpgqgmvUQcrIlOrCtytFLWKl.configName() : String.join((CharSequence)".", BedAheXACpgqgmvUQcrIlOrCtytFLWKl.configName(), bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae)));
 if (sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal instanceof JsonPrimitive && (ZxYUujBylkewyzgXcBNoUudgZsONluh_ = (JsonPrimitive)sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal).isString()) {
 QNNUAhXKhljBpIOYqhgnxvtnmhidKfJe.put(VbLEILenqmXQxdyaJFogVpnTwAqlkwMo, ZxYUujBylkewyzgXcBNoUudgZsONluh_.getAsString());
 }
 if (sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal instanceof JsonObject) {
 JsonObject ZAWiyLwdrNMdRLqnxJYeRnKSVFazhPJM = (JsonObject)sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal;
 BTHACK$$$VjKvUyykWyRUFXlYHuhsgkzFUFrVWNbbc_sudZCDjpZFYFJfoBSloARXwPMsguGV.bjtnXMgRSrjcKPtBvScdNoNhwvIKStCg(ZAWiyLwdrNMdRLqnxJYeRnKSVFazhPJM, QNNUAhXKhljBpIOYqhgnxvtnmhidKfJe, VbLEILenqmXQxdyaJFogVpnTwAqlkwMo);
 }
 });
 return QNNUAhXKhljBpIOYqhgnxvtnmhidKfJe;
 }

 public static Map ioBjOKUZOUEGORPAnMkfQUXZcqLRHeey(@NonNull InputStream fughtEQUGkLWkNePwOfzzSKiAuBXtOIQ) {
 Map map;
 if (fughtEQUGkLWkNePwOfzzSKiAuBXtOIQ == null) {
 throw new NullPointerException("inputStream is marked non-null but is null");
 }
 InputStreamReader fUPTIWuHP_BQGWLiZhunShANtXFPRrPK = new InputStreamReader(fughtEQUGkLWkNePwOfzzSKiAuBXtOIQ);
 try {
 map = BTHACK$$$ltfksbkKEWdzzPredJpKKMaXF_gnHstGLqQCFbLujGUolCidMbHKeIuMnzsqxDey.ebUfWpUAzwDZaScWKIHcljJsDpfRBTRS(BTHACK$$$VjKvUyykWyRUFXlYHuhsgkzFUFrVWNbbc_sudZCDjpZFYFJfoBSloARXwPMsguGV.bjtnXMgRSrjcKPtBvScdNoNhwvIKStCg(JsonParser.parseReader((Reader)fUPTIWuHP_BQGWLiZhunShANtXFPRrPK).getAsJsonObject(), new HashMap(), new BTHACK$$$wkxvjb_VnKHisVKweLsANIGYQbbNgvnscaaXVyIjYWOwvOLxi_N_ilWwkxAa_wCq("")));
 }
 catch (Throwable throwable) {
 try {
 try {
 fUPTIWuHP_BQGWLiZhunShANtXFPRrPK.close();
 }
 catch (Throwable throwable2) {
 throwable.addSuppressed(throwable2);
 }
 throw throwable;
 }
 catch (Exception qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ) {
 qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ.printStackTrace();
 return new HashMap();
 }
 }
 fUPTIWuHP_BQGWLiZhunShANtXFPRrPK.close();
 return map;
 }

 private BTHACK$$$VjKvUyykWyRUFXlYHuhsgkzFUFrVWNbbc_sudZCDjpZFYFJfoBSloARXwPMsguGV() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static Map ioBjOKUZOUEGORPAnMkfQUXZcqLRHeey(@NonNull JsonObject zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg) {
 if (zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg == null) {
 throw new NullPointerException("jsonObject is marked non-null but is null");
 }
 return BTHACK$$$ltfksbkKEWdzzPredJpKKMaXF_gnHstGLqQCFbLujGUolCidMbHKeIuMnzsqxDey.ebUfWpUAzwDZaScWKIHcljJsDpfRBTRS(BTHACK$$$VjKvUyykWyRUFXlYHuhsgkzFUFrVWNbbc_sudZCDjpZFYFJfoBSloARXwPMsguGV.bjtnXMgRSrjcKPtBvScdNoNhwvIKStCg(zIKjGOqPfihlQAWAjW_ZumqCRYDRfffg, new HashMap(), new BTHACK$$$wkxvjb_VnKHisVKweLsANIGYQbbNgvnscaaXVyIjYWOwvOLxi_N_ilWwkxAa_wCq("")));
 }
}

