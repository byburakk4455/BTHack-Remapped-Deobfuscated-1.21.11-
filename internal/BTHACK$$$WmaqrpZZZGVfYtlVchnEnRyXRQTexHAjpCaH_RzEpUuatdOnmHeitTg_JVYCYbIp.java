/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RectColors
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA;
import com.ferra13671.bthack.BTHACK$$$EeLsIFMVkbiTlNRyEXykxCLQVvFDqXaGDNicnjFPjngHyolkgooPjReZSqKambyh;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$NtIoungbbbBIfjzyZdZVbGwujyBkGjQrdRtOYRsRcRDpdUGgljdPxxhSLYSwXHjv;
import com.ferra13671.bthack.BTHACK$$$NuNNPjOPqcbXUEJZLNXtOPRESrn_GJvkmYBlruAaXPnAALIfvWBqGOxoCybUGYUU;
import com.ferra13671.bthack.TooltipRenderer;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG;
import com.ferra13671.bthack.BTHACK$$$WfLkNXvShCjZypGcs_RrZMVxRIOzdVEEVvQoxtgizJRwOkoUEJ_OvcEweWcjgTuQ;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.Setting;
import com.ferra13671.cometrenderer.minecraft.RectColors;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BTHACK$$$WmaqrpZZZGVfYtlVchnEnRyXRQTexHAjpCaH_RzEpUuatdOnmHeitTg_JVYCYbIp
extends BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA
implements BTHACK$$$EeLsIFMVkbiTlNRyEXykxCLQVvFDqXaGDNicnjFPjngHyolkgooPjReZSqKambyh,
Closeable {
 private final BTHACK$$$WfLkNXvShCjZypGcs_RrZMVxRIOzdVEEVvQoxtgizJRwOkoUEJ_OvcEweWcjgTuQ piNdsz_fEkCMRkTOVj_aRLCxNCQDZYnk;
 private final BTHACK$$$NtIoungbbbBIfjzyZdZVbGwujyBkGjQrdRtOYRsRcRDpdUGgljdPxxhSLYSwXHjv iztnxVKQALFcYQxjdBaOHkFF_srkNxSe;
 private final List dmpqqySgdKexWZMsVaTawsrpmbid_hHS;
 private final List uYFHjTeIR_utbmrbaOTVTV_vyGwpMLus;
 private final BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG qPlYByWcOiyjVyUbDQFNXeIlmihYhItQ;
 private final TooltipRenderer l_VPKRRucSyQcLlCeeKMZfZmWdMISLYB;
 private float ZbgLCikmhNILiGhIgAYnmunxreNkFOqa;
 private Float NqzdXqYiNLexFKGSO_oMuzSwrreUIMKu;

 public BTHACK$$$WmaqrpZZZGVfYtlVchnEnRyXRQTexHAjpCaH_RzEpUuatdOnmHeitTg_JVYCYbIp(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, BTHACK$$$WfLkNXvShCjZypGcs_RrZMVxRIOzdVEEVvQoxtgizJRwOkoUEJ_OvcEweWcjgTuQ FREjPCmyDgDVGMDrSTOkVzkjesrTyFAs, BTHACK$$$NtIoungbbbBIfjzyZdZVbGwujyBkGjQrdRtOYRsRcRDpdUGgljdPxxhSLYSwXHjv hlbAaEsxEFFBSlawKxjEntFzimVqHcIm) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, 0.0f, 0.0f, ItemUtils.qXtqlcYmhtwsvAObrFxvxLryXvsEqcUx.x, 0.0f);
 this.dmpqqySgdKexWZMsVaTawsrpmbid_hHS = new ArrayList();
 this.uYFHjTeIR_utbmrbaOTVTV_vyGwpMLus = new CopyOnWriteArrayList();
 this.ZbgLCikmhNILiGhIgAYnmunxreNkFOqa = 0.0f;
 this.NqzdXqYiNLexFKGSO_oMuzSwrreUIMKu = Float.valueOf(0.0f);
 this.piNdsz_fEkCMRkTOVj_aRLCxNCQDZYnk = FREjPCmyDgDVGMDrSTOkVzkjesrTyFAs;
 this.iztnxVKQALFcYQxjdBaOHkFF_srkNxSe = hlbAaEsxEFFBSlawKxjEntFzimVqHcIm;
 this.cReDskEfxjhqaABr_raXAGKDdaMSKmZV();
 float JUTEbhGGbicsonpYlByVCxLaLUIYEwGj = this.hwxmyMVYyeEFgtjdNFukisssZgHNYqSm - (float)(ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x * 2);
 List xVRTHLfRZYZuAlzCcmBnhWUrlzJiZZiy = FREjPCmyDgDVGMDrSTOkVzkjesrTyFAs.UiQdtGrGwLeLnuGQFUQppYUxGHxzZCiT();
 for (Setting biPCJJnrdcbmIdoskAIZilsnxasFSbNH : xVRTHLfRZYZuAlzCcmBnhWUrlzJiZZiy) {
 this.dmpqqySgdKexWZMsVaTawsrpmbid_hHS.add(biPCJJnrdcbmIdoskAIZilsnxasFSbNH.fNyMMMgAvZJvjXWJEzkLTeDWZzNntrhH(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, this.QlhYHVgRNeCSbXXgcoeCdCJBGZOppQSF(), 0.0f, 0.0f, JUTEbhGGbicsonpYlByVCxLaLUIYEwGj));
 }
 this.VTlktHOZCnJfVzZMgbgsdpyyVGEJyyVj();
 this.qPlYByWcOiyjVyUbDQFNXeIlmihYhItQ = new BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG(new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 ColoredRectBatch VYIXPSuQYideyxhwXANoTonANBRlYYOv = new ColoredRectBatch();
 for (int HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO = 0; HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO < this.uYFHjTeIR_utbmrbaOTVTV_vyGwpMLus.size() - 1; ++HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO) {
 BTHACK$$$NuNNPjOPqcbXUEJZLNXtOPRESrn_GJvkmYBlruAaXPnAALIfvWBqGOxoCybUGYUU HrIIEZJBmKOSSylQJvjtfjsEthJcrfPn = (BTHACK$$$NuNNPjOPqcbXUEJZLNXtOPRESrn_GJvkmYBlruAaXPnAALIfvWBqGOxoCybUGYUU)this.uYFHjTeIR_utbmrbaOTVTV_vyGwpMLus.get(HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO);
 float iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ = HrIIEZJBmKOSSylQJvjtfjsEthJcrfPn.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + HrIIEZJBmKOSSylQJvjtfjsEthJcrfPn.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() + (float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.y;
 VYIXPSuQYideyxhwXANoTonANBRlYYOv.rectSized((float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x, iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ, 80.0f, 2.0f, RectColors.horizontalGradient((RenderColor)RenderColor.TRANSLUCENT, (RenderColor)ItemUtils.PkGYXYgKAoQMqzMXfGszhEmlRBOwUdIe)).rectSized((float)(ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x + 80), iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ, 101.0f, 2.0f, RectColors.oneColor((RenderColor)ItemUtils.PkGYXYgKAoQMqzMXfGszhEmlRBOwUdIe)).rectSized((float)(ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x + 80 + 101), iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ, 80.0f, 2.0f, RectColors.horizontalGradient((RenderColor)ItemUtils.PkGYXYgKAoQMqzMXfGszhEmlRBOwUdIe, (RenderColor)RenderColor.TRANSLUCENT));
 }
 return VYIXPSuQYideyxhwXANoTonANBRlYYOv;
 }));
 this.l_VPKRRucSyQcLlCeeKMZfZmWdMISLYB = new TooltipRenderer(uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl -> this.uYFHjTeIR_utbmrbaOTVTV_vyGwpMLus.forEach(HrIIEZJBmKOSSylQJvjtfjsEthJcrfPn -> HrIIEZJBmKOSSylQJvjtfjsEthJcrfPn.hishFORgTzHaahtsoZztl_oDgaKgnObk((TooltipRenderer)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl)));
 }
}

