/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.CometRenderer
 * com.ferra13671.cometrenderer.minecraft.batch.impl.BasicRectBatch
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.Category;
import com.ferra13671.bthack.BTHACK$$$GwpeaeHwbPzKyusqSwTmSMuSryEpKKGRgdZDfvtCrijvrJCIRYdvgliLXfbNycHw;
import com.ferra13671.bthack.BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BTHACK$$$atHNiKZyZWsmdkHepyeQQOfahuomQDEDZfQVzdrtvGulfjdkGVVLjMzITucmhUFJ;
import com.ferra13671.bthack.BTHACK$$$iQRJeRQEMysbdvWnXyZdeadWANgdEPpWBI_YnkekUjhtsgoihmNMoilbzxGHNVPV;
import com.ferra13671.bthack.BThackClient;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.BTHACK$$$wO_YEgjTrFWViIPNbIJpThtqWHvqtzwrLaKVsCrZqRUQtcfZuINbZrvhefrOylch;
import com.ferra13671.bthack.BTHACK$$$wXwkGxKXVbiFoVYzUqPhd_bhkgjqVEEISzE_PYZjokxvudNtEASGwaACLxuxQkcD;
import com.ferra13671.cometrenderer.CometRenderer;
import com.ferra13671.cometrenderer.minecraft.batch.impl.BasicRectBatch;
import java.util.ArrayList;
import java.util.List;

public class BTHACK$$$ucUCRVPyGbDhMRvRwaCvdYROwNKNcSddWRvgyURLEqNCOONMrvyxWSnnbSboKGzb
extends BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm
implements IMinecraft {
 private final BTHACK$$$atHNiKZyZWsmdkHepyeQQOfahuomQDEDZfQVzdrtvGulfjdkGVVLjMzITucmhUFJ mDUuhsvggiyTiaFkFzOIORNODiaORJyQ;
 private BTHACK$$$iQRJeRQEMysbdvWnXyZdeadWANgdEPpWBI_YnkekUjhtsgoihmNMoilbzxGHNVPV OeDvLpqqToSLVvWRryqWRYggCKAxPwuR;
 private final BTHACK$$$wO_YEgjTrFWViIPNbIJpThtqWHvqtzwrLaKVsCrZqRUQtcfZuINbZrvhefrOylch RuBk_AvNJzjKNkIhOxKkrkhvPZKzkHJg;
 private final List JVcoUWRSgcMMJnEUOgNkuenVdr_YTszT;
 private BTHACK$$$wXwkGxKXVbiFoVYzUqPhd_bhkgjqVEEISzE_PYZjokxvudNtEASGwaACLxuxQkcD oVqDK_xKiXafaWqdMZhiSmrrTmZSGcNN;
 private BTHACK$$$GwpeaeHwbPzKyusqSwTmSMuSryEpKKGRgdZDfvtCrijvrJCIRYdvgliLXfbNycHw XgduVdgcYjVYIKvGMGmUTFNNdqzQUjkg;
 private final BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG gqrvZoj_rfJWXEoapZIhypsSNsIYjTQf;

 public BTHACK$$$ucUCRVPyGbDhMRvRwaCvdYROwNKNcSddWRvgyURLEqNCOONMrvyxWSnnbSboKGzb(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, BTHACK$$$atHNiKZyZWsmdkHepyeQQOfahuomQDEDZfQVzdrtvGulfjdkGVVLjMzITucmhUFJ dGlzbQfMRgYPvEMkSeFaTQPWNzaztbuf) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, 0.0f, 0.0f, ItemUtils.NzqAeWuhxaEZfyWgCRKAyEUisjcGiStq.x, ItemUtils.NzqAeWuhxaEZfyWgCRKAyEUisjcGiStq.y);
 this.JVcoUWRSgcMMJnEUOgNkuenVdr_YTszT = new ArrayList();
 this.gqrvZoj_rfJWXEoapZIhypsSNsIYjTQf = new BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG(new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new BasicRectBatch(() -> CometRenderer.getShaderColor().setColor(ItemUtils.zmVUyjYbuHQxDLnBwb_hxxL_kvTnlMma.toVector4f())).rectSized(this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM(), this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk(), 2.0f, this.FAWSkVepqWPcvAQeBzf_kxAzJHfVA_zT - 2.0f).rectSized(this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft(), this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM(), this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM(), 2.0f).rectSized(211.0f, 65.0f, 640.0f, 2.0f).rectSized(1.0f, this.oVqDK_xKiXafaWqdMZhiSmrrTmZSGcNN.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() - 2.0f, 208.0f, 2.0f)));
 this.mDUuhsvggiyTiaFkFzOIORNODiaORJyQ = dGlzbQfMRgYPvEMkSeFaTQPWNzaztbuf;
 this.OeDvLpqqToSLVvWRryqWRYggCKAxPwuR = new BTHACK$$$iQRJeRQEMysbdvWnXyZdeadWANgdEPpWBI_YnkekUjhtsgoihmNMoilbzxGHNVPV(this, uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi);
 this.RuBk_AvNJzjKNkIhOxKkrkhvPZKzkHJg = new BTHACK$$$wO_YEgjTrFWViIPNbIJpThtqWHvqtzwrLaKVsCrZqRUQtcfZuINbZrvhefrOylch(this, uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi);
 for (Category ocIuAnHDKdHuW_GPwmRcqIZKMXjZrlyw : BThackClient.getInstance().afcGnGcBNDATfrBcRisCLaKJhfNQgrRH().WRLoABsWMeEyYQrHnTFAPyvHrvTimLPW()) {
 this.JVcoUWRSgcMMJnEUOgNkuenVdr_YTszT.add(new BTHACK$$$GwpeaeHwbPzKyusqSwTmSMuSryEpKKGRgdZDfvtCrijvrJCIRYdvgliLXfbNycHw(this, uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, ocIuAnHDKdHuW_GPwmRcqIZKMXjZrlyw));
 }
 this.oVqDK_xKiXafaWqdMZhiSmrrTmZSGcNN = new BTHACK$$$wXwkGxKXVbiFoVYzUqPhd_bhkgjqVEEISzE_PYZjokxvudNtEASGwaACLxuxQkcD(this, uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi);
 }
}

