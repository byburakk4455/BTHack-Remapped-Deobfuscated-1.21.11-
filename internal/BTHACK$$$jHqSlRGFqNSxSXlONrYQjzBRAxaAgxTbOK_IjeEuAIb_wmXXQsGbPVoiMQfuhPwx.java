/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1297
 * net.minecraft.class_243
 * net.minecraft.class_3532
 * org.joml.Matrix4f
 * org.joml.Vector2f
 * org.joml.Vector3f
 * org.joml.Vector3fc
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$DlBINQCIOZdTytGxXxKfVcpqPmaWMoVEAmosjtZkfJrXERMHSnBDBHWwyGAfArJs;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BTHACK$$$nv_FwGRnLmtCDilwpOTbdAyXgqlRpLAukalp_HJmCASZYvlCwcxjyCQzEKLxUytg;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx
implements IMinecraft {
 private BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static float MmiZzKjvFJIpPbUkih_pYZmjNLt_VbWo(float qvskhUzpAOnhxoWvaBdUtmiEyyzIZPmS, float dVWflvCJZOhCfKecEWxmqsahFnHbjpvP) {
 return (float)Math.ceil(qvskhUzpAOnhxoWvaBdUtmiEyyzIZPmS / dVWflvCJZOhCfKecEWxmqsahFnHbjpvP) * dVWflvCJZOhCfKecEWxmqsahFnHbjpvP;
 }

 public static class_243 rbXvoOMeqlRfLVhmn_zDaduLZuhBaHJI(class_1297 eNals_MGmWoGhLiNZurJKvyWdcERMxIZ) {
 return eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.field_5992 ? eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_18798().method_18805(1.0, 0.0, 1.0) : eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_18798();
 }

 public static Float precision(Float nKpq_pOwMKAaagGyQCuCebvGSaWsRSBC, int oahmgcRgUhkeClnvwLQYquHvjAPwJcLU) {
 return Float.valueOf(new BigDecimal(nKpq_pOwMKAaagGyQCuCebvGSaWsRSBC.floatValue()).setScale(oahmgcRgUhkeClnvwLQYquHvjAPwJcLU, RoundingMode.HALF_UP).floatValue());
 }

 public static class_243 XxJbfRoZKhyTPORIcOdZspiYKZJSzWtS(Matrix4f hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, float _SaiTxgKYFVxuOc_KsEWqrpsRamJUCOl) {
 Vector3f kTeGXmgjvGNRvVpFvNdmJrMcZhlLiIgd = BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx.yzVUUrEpmerOoRIsAWLLJZUnPAKlFSVE(hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, _SaiTxgKYFVxuOc_KsEWqrpsRamJUCOl);
 return new class_243((double)kTeGXmgjvGNRvVpFvNdmJrMcZhlLiIgd.x(), (double)kTeGXmgjvGNRvVpFvNdmJrMcZhlLiIgd.y(), (double)kTeGXmgjvGNRvVpFvNdmJrMcZhlLiIgd.z());
 }

 public static class_243 aFQkBBaiboKEPGTxJffEpSGPcQKTnnQn(class_1297 eNals_MGmWoGhLiNZurJKvyWdcERMxIZ) {
 float dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC = mc.method_61966().method_60637(false);
 double CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD = eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.field_6038 + (eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_23317() - eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.field_6038) * (double)dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC;
 double wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT = eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.field_5971 + (eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_23318() - eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.field_5971) * (double)dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC;
 double _SaiTxgKYFVxuOc_KsEWqrpsRamJUCOl = eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.field_5989 + (eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_23321() - eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.field_5989) * (double)dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC;
 return new class_243(CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, _SaiTxgKYFVxuOc_KsEWqrpsRamJUCOl);
 }

 public static float OFFMBOuapRCxHMxJlsLhWNOGJZdfKLHS(Vector3f gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu, float[] WbmBQTskfTZbkRtEJPNEqnZdvXgZceql, Vector3f M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl) {
 float[] ugRuPenKZMAXyhyiHzDBRjT_vvCEBpwz = BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx.yylaCGbVQfkCfVtXdBidKGVV_QhCUaeG(gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu, WbmBQTskfTZbkRtEJPNEqnZdvXgZceql, M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl);
 float Pfqj_dIpydWnVnqrWLGbloHrqEWds_ss = new Vector2f(class_3532.method_15393((float)(ugRuPenKZMAXyhyiHzDBRjT_vvCEBpwz[0] - WbmBQTskfTZbkRtEJPNEqnZdvXgZceql[0])), ugRuPenKZMAXyhyiHzDBRjT_vvCEBpwz[1] - WbmBQTskfTZbkRtEJPNEqnZdvXgZceql[1]).length();
 return Pfqj_dIpydWnVnqrWLGbloHrqEWds_ss;
 }

 public static float JwiqQeYlATijyRdjZwFgBMarFqSTzZGH(class_1297 eNals_MGmWoGhLiNZurJKvyWdcERMxIZ, Vector3f M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl) {
 return eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_33571().method_46409().distance((Vector3fc)M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl);
 }

 public static Float oTEiJDRXIoHOmgGIV_RbVWOqHdDimozf(Float TzOXArETZZJVJQNvZyjsawkjnPoecwTp, float tjbnigTk_cuStnduikwwTfRVZClB_wac, float OoJEdFFjWHJXtOaafbOFyVTgFTWiPxvL) {
 float dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC = -(tjbnigTk_cuStnduikwwTfRVZClB_wac - OoJEdFFjWHJXtOaafbOFyVTgFTWiPxvL);
 TzOXArETZZJVJQNvZyjsawkjnPoecwTp = dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC > 0.0f ? Float.valueOf(0.0f) : Float.valueOf(Math.clamp(TzOXArETZZJVJQNvZyjsawkjnPoecwTp.floatValue(), dEaBUHmQfMMzxaZooPmxyIRUAcHeYbAC, 0.0f));
 return TzOXArETZZJVJQNvZyjsawkjnPoecwTp;
 }

 public static Float GfPlNxLuYblxlUgMCvkzakWmRThxOkzR(Float nKpq_pOwMKAaagGyQCuCebvGSaWsRSBC) {
 return Float.valueOf(nKpq_pOwMKAaagGyQCuCebvGSaWsRSBC.isInfinite() || nKpq_pOwMKAaagGyQCuCebvGSaWsRSBC.isNaN() ? 0.0f : nKpq_pOwMKAaagGyQCuCebvGSaWsRSBC.floatValue());
 }

 public static float[] yylaCGbVQfkCfVtXdBidKGVV_QhCUaeG(class_1297 eNals_MGmWoGhLiNZurJKvyWdcERMxIZ, Vector3f M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl) {
 return BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx.yylaCGbVQfkCfVtXdBidKGVV_QhCUaeG(eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_33571().method_46409(), new float[]{eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_36454(), eNals_MGmWoGhLiNZurJKvyWdcERMxIZ.method_36455()}, M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl);
 }

 public static Vector3f yzVUUrEpmerOoRIsAWLLJZUnPAKlFSVE(Matrix4f hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, float _SaiTxgKYFVxuOc_KsEWqrpsRamJUCOl) {
 return hEYUMdDeeEfELSdPNoOMUWzaAQtVIRsL.transformPosition(CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, _SaiTxgKYFVxuOc_KsEWqrpsRamJUCOl, new Vector3f());
 }

 public static BTHACK$$$DlBINQCIOZdTytGxXxKfVcpqPmaWMoVEAmosjtZkfJrXERMHSnBDBHWwyGAfArJs pmQUa_oRjHFxQxhBNuTuCzSjFQKeIXfP(BTHACK$$$DlBINQCIOZdTytGxXxKfVcpqPmaWMoVEAmosjtZkfJrXERMHSnBDBHWwyGAfArJs feFAWFyPcvXHPSqioJmAzwXQqSyoVVuJ, int SdGKOvvIOnqdfmPKoJwCxLSqyrhJIpke, int HodCRjAWuzOlAaFqovJWnYtdT_uYiJZS) {
 return new BTHACK$$$DlBINQCIOZdTytGxXxKfVcpqPmaWMoVEAmosjtZkfJrXERMHSnBDBHWwyGAfArJs(feFAWFyPcvXHPSqioJmAzwXQqSyoVVuJ.fpBoRZatnkZxRypPcMvRNGUwFgLdTELf() - SdGKOvvIOnqdfmPKoJwCxLSqyrhJIpke, feFAWFyPcvXHPSqioJmAzwXQqSyoVVuJ.JwjQyTHoHbWnaRowRuKvOyYuSOiJWayp() - HodCRjAWuzOlAaFqovJWnYtdT_uYiJZS, feFAWFyPcvXHPSqioJmAzwXQqSyoVVuJ.qCuM_OxYktcJtLBKIZJavJyaJVUtOvrg());
 }

 public static float[] yylaCGbVQfkCfVtXdBidKGVV_QhCUaeG(Vector3f gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu, float[] WbmBQTskfTZbkRtEJPNEqnZdvXgZceql, Vector3f M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl) {
 double PcVejaHymVFTsCAKySTQ_QntMp_FNRTQ = M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl.x - gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.x;
 double N_GHRrZShcfDeRPUIscKPLnYOopUBzGI = M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl.y - gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.y;
 double jIbpgSpZBsrA_uQOlbirqdUarjszIAdf = M_lTMleekwxLYRsJIEa_kMwDWeJVeIjl.z - gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.z;
 double ZqWHUXwsiMnFg_vnhVQGTAUgvzHuchMp = Math.sqrt(PcVejaHymVFTsCAKySTQ_QntMp_FNRTQ * PcVejaHymVFTsCAKySTQ_QntMp_FNRTQ + jIbpgSpZBsrA_uQOlbirqdUarjszIAdf * jIbpgSpZBsrA_uQOlbirqdUarjszIAdf);
 float nDbNQvipFetgepHeaAIjhmhgkpycjPFv = WbmBQTskfTZbkRtEJPNEqnZdvXgZceql[1] + class_3532.method_15393(((-Math.toDegrees(Math.atan2(N_GHRrZShcfDeRPUIscKPLnYOopUBzGI, ZqWHUXwsiMnFg_vnhVQGTAUgvzHuchMp))) - WbmBQTskfTZbkRtEJPNEqnZdvXgZceql[1]));
 float XZRFRvvZqtKekCEvdWkzHRVwshIxA_wD = WbmBQTskfTZbkRtEJPNEqnZdvXgZceql[0] + class_3532.method_15393((Math.toDegrees(Math.atan2(jIbpgSpZBsrA_uQOlbirqdUarjszIAdf, PcVejaHymVFTsCAKySTQ_QntMp_FNRTQ)) - 90.0f - WbmBQTskfTZbkRtEJPNEqnZdvXgZceql[0]));
 return new float[]{XZRFRvvZqtKekCEvdWkzHRVwshIxA_wD, nDbNQvipFetgepHeaAIjhmhgkpycjPFv};
 }

 public static BTHACK$$$nv_FwGRnLmtCDilwpOTbdAyXgqlRpLAukalp_HJmCASZYvlCwcxjyCQzEKLxUytg iHhXrxfyWHCoVvAKkyf_EzcgyQDQsMxD(BTHACK$$$nv_FwGRnLmtCDilwpOTbdAyXgqlRpLAukalp_HJmCASZYvlCwcxjyCQzEKLxUytg TzOXArETZZJVJQNvZyjsawkjnPoecwTp, int SdGKOvvIOnqdfmPKoJwCxLSqyrhJIpke, int HodCRjAWuzOlAaFqovJWnYtdT_uYiJZS) {
 return new BTHACK$$$nv_FwGRnLmtCDilwpOTbdAyXgqlRpLAukalp_HJmCASZYvlCwcxjyCQzEKLxUytg(TzOXArETZZJVJQNvZyjsawkjnPoecwTp.fpBoRZatnkZxRypPcMvRNGUwFgLdTELf() - SdGKOvvIOnqdfmPKoJwCxLSqyrhJIpke, TzOXArETZZJVJQNvZyjsawkjnPoecwTp.JwjQyTHoHbWnaRowRuKvOyYuSOiJWayp() - HodCRjAWuzOlAaFqovJWnYtdT_uYiJZS, TzOXArETZZJVJQNvZyjsawkjnPoecwTp.InePkEIBrOtxRDDx_oIPSWoabuyxXhUn());
 }
}

