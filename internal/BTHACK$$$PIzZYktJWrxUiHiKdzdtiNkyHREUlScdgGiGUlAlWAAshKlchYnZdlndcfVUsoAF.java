/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * org.joml.Matrix4f
 * org.joml.Vector2f
 * org.joml.Vector3f
 */
package com.ferra13671.bthack;

import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;

public final class BTHACK$$$PIzZYktJWrxUiHiKdzdtiNkyHREUlScdgGiGUlAlWAAshKlchYnZdlndcfVUsoAF {
 private BTHACK$$$PIzZYktJWrxUiHiKdzdtiNkyHREUlScdgGiGUlAlWAAshKlchYnZdlndcfVUsoAF() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static Vector2f lFbCGRhjLuNfjBdtDQrskkVkDKhVblbL(Matrix4f hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL, Vector2f gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu) {
 Vector3f pSlghzdol_TFdtEREoLvomsZYFBizqtA = hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL.transformPosition(new Vector3f(gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.x, gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.y, 0.0f));
 return new Vector2f(pSlghzdol_TFdtEREoLvomsZYFBizqtA.x, pSlghzdol_TFdtEREoLvomsZYFBizqtA.y);
 }

 public static Vector2f lFbCGRhjLuNfjBdtDQrskkVkDKhVblbL(Matrix4f hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT) {
 return BTHACK$$$PIzZYktJWrxUiHiKdzdtiNkyHREUlScdgGiGUlAlWAAshKlchYnZdlndcfVUsoAF.lFbCGRhjLuNfjBdtDQrskkVkDKhVblbL(hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL, new Vector2f(CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT));
 }
}

