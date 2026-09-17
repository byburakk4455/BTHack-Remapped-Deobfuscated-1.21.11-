/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.google.gson.JsonElement
 * com.google.gson.JsonPrimitive
 */
package com.ferra13671.bthack;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.function.Function;

public final class BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM
extends Record {
 private final Function crQbzLLDhsQmC_ZScYrkbzmQOqVVruEd;
 private final Function CfmQJMZzoaIWunBjQOjAcsJiy_jwaBpU;
 private final Function Ir_tPYIgvEjwZRnPTSfHfMdXhPslkLfu;
 public static final BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM yDKkcsBAOIBHaSmGczdAuWunZFGiRJoB;
 public static final BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM aURLhTPeUwiVlXzPEmOHHWNzhMxhRtMC;
 public static final BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM YPgKkjlxXlqLaaotRHAEPEZKGqOAmYua;
 public static final BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM E_fUsLAlWyzOROULRUAVHfxPFnJCreIt;
 public static final BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM MqKofQVyApiPfOBxjYartAUFrcEUWhYF;

 static {
 yDKkcsBAOIBHaSmGczdAuWunZFGiRJoB = new BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM(JsonElement::isJsonObject, JsonElement::getAsJsonObject, sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal -> sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal);
 aURLhTPeUwiVlXzPEmOHHWNzhMxhRtMC = new BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM(JsonElement::isJsonArray, JsonElement::getAsJsonArray, sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal -> sOZYqqXlxKMEanlWuqKCnOEdTDwDZfal);
 YPgKkjlxXlqLaaotRHAEPEZKGqOAmYua = new BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM(qhYa_bgNOypjcekMneRmOqxYClBLfAwA -> {
 if (qhYa_bgNOypjcekMneRmOqxYClBLfAwA instanceof JsonPrimitive) {
 JsonPrimitive ZxYUujBylkewyzgXcBNoUudgZsONluh_ = (JsonPrimitive)qhYa_bgNOypjcekMneRmOqxYClBLfAwA;
 return ZxYUujBylkewyzgXcBNoUudgZsONluh_.isBoolean();
 }
 return false;
 }, qhYa_bgNOypjcekMneRmOqxYClBLfAwA -> qhYa_bgNOypjcekMneRmOqxYClBLfAwA.getAsJsonPrimitive().getAsBoolean(), JsonPrimitive::new);
 E_fUsLAlWyzOROULRUAVHfxPFnJCreIt = new BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM(qhYa_bgNOypjcekMneRmOqxYClBLfAwA -> {
 if (qhYa_bgNOypjcekMneRmOqxYClBLfAwA instanceof JsonPrimitive) {
 JsonPrimitive ZxYUujBylkewyzgXcBNoUudgZsONluh_ = (JsonPrimitive)qhYa_bgNOypjcekMneRmOqxYClBLfAwA;
 return ZxYUujBylkewyzgXcBNoUudgZsONluh_.isString();
 }
 return false;
 }, qhYa_bgNOypjcekMneRmOqxYClBLfAwA -> qhYa_bgNOypjcekMneRmOqxYClBLfAwA.getAsJsonPrimitive().getAsString(), JsonPrimitive::new);
 MqKofQVyApiPfOBxjYartAUFrcEUWhYF = new BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM(qhYa_bgNOypjcekMneRmOqxYClBLfAwA -> {
 if (qhYa_bgNOypjcekMneRmOqxYClBLfAwA instanceof JsonPrimitive) {
 JsonPrimitive ZxYUujBylkewyzgXcBNoUudgZsONluh_ = (JsonPrimitive)qhYa_bgNOypjcekMneRmOqxYClBLfAwA;
 return ZxYUujBylkewyzgXcBNoUudgZsONluh_.isNumber();
 }
 return false;
 }, qhYa_bgNOypjcekMneRmOqxYClBLfAwA -> qhYa_bgNOypjcekMneRmOqxYClBLfAwA.getAsJsonPrimitive().getAsNumber(), JsonPrimitive::new);
 }

 public BTHACK$$$XlsWjvAFpzIZDVi_nqvamSgCOnzMCyqyUgyWyIErykLasuInwbqLtkafqJSppVuM(Function QaMwqIfioXrqwuWGrHmEpOjBOhsOFldi, Function kuGcejtFkLkUYf_WEU_XDJRzCgWrRdxc, Function BUFAvObOnDfQ_NvhliOTVHBGlmXtpdlD) {
 this.crQbzLLDhsQmC_ZScYrkbzmQOqVVruEd = QaMwqIfioXrqwuWGrHmEpOjBOhsOFldi;
 this.CfmQJMZzoaIWunBjQOjAcsJiy_jwaBpU = kuGcejtFkLkUYf_WEU_XDJRzCgWrRdxc;
 this.Ir_tPYIgvEjwZRnPTSfHfMdXhPslkLfu = BUFAvObOnDfQ_NvhliOTVHBGlmXtpdlD;
 }
}

