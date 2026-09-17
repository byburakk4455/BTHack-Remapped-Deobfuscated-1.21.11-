/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.CometRenderer
 * com.ferra13671.cometrenderer.minecraft.batch.impl.BasicRectBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedTextureBatch
 * com.ferra13671.gltextureutils.GlTex
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV;
import com.ferra13671.bthack.BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$PYDojnoGSvVvvHYlZ_FfXSKVXqUxYUhjQoRzqMtQznoSwYctAhPfz_KDTkLQYjPR;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG;
import com.ferra13671.bthack.ColorSetting;
import com.ferra13671.bthack.BTHACK$$$gcnITKiAAs_YkERRcPwFLDGkxkLnarLEldtiOYdwkbjUQMGclssofMnssSHCqRCx;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.BTHACK$$$zLaLsVngc_kDreJhyDrTdaisIthYmObnoeFWfDvlSCjYAkUQWoLpHZNPZtfaB_KR;
import com.ferra13671.cometrenderer.CometRenderer;
import com.ferra13671.cometrenderer.minecraft.batch.impl.BasicRectBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedTextureBatch;
import com.ferra13671.gltextureutils.GlTex;

public class BTHACK$$$StKfVzTvupqZWhAtRhfzVQvXELRSkoGtluKeG_NqicZKgQWG_wUnQxQfOampSuil
extends BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm {
 private final ColorSetting OSGdUZbjGepMGUpPcp_hJHiTWAdovGky;
 private final BTHACK$$$gcnITKiAAs_YkERRcPwFLDGkxkLnarLEldtiOYdwkbjUQMGclssofMnssSHCqRCx HhXwCQCabjNhhxmwghEveiXNBymTDPkL;
 private final BTHACK$$$zLaLsVngc_kDreJhyDrTdaisIthYmObnoeFWfDvlSCjYAkUQWoLpHZNPZtfaB_KR BUQhobGsPGfVXRFnbGTNeRxSeYrjZipQ;
 private final BTHACK$$$PYDojnoGSvVvvHYlZ_FfXSKVXqUxYUhjQoRzqMtQznoSwYctAhPfz_KDTkLQYjPR VvqpvDhiEQlELmNMVBrbfrRSkySJRZoi;
 private final BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG tooltipRenderer;

 public BTHACK$$$StKfVzTvupqZWhAtRhfzVQvXELRSkoGtluKeG_NqicZKgQWG_wUnQxQfOampSuil(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, ColorSetting UpOZKpbymUWTuKAqDPmViiOtNofnhiyZ, BTHACK$$$gcnITKiAAs_YkERRcPwFLDGkxkLnarLEldtiOYdwkbjUQMGclssofMnssSHCqRCx szc_ucwnmHiDJwCyWVDLfTLtjYAZfypk, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, ItemUtils.IacBrX_STLBSdJjeiNmVttPaPvzFpyfR.x, ItemUtils.IacBrX_STLBSdJjeiNmVttPaPvzFpyfR.y);
 this.OSGdUZbjGepMGUpPcp_hJHiTWAdovGky = UpOZKpbymUWTuKAqDPmViiOtNofnhiyZ;
 this.HhXwCQCabjNhhxmwghEveiXNBymTDPkL = szc_ucwnmHiDJwCyWVDLfTLtjYAZfypk;
 this.BUQhobGsPGfVXRFnbGTNeRxSeYrjZipQ = new BTHACK$$$zLaLsVngc_kDreJhyDrTdaisIthYmObnoeFWfDvlSCjYAkUQWoLpHZNPZtfaB_KR(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, this, 0.0f, 0.0f);
 this.VvqpvDhiEQlELmNMVBrbfrRSkySJRZoi = new BTHACK$$$PYDojnoGSvVvvHYlZ_FfXSKVXqUxYUhjQoRzqMtQznoSwYctAhPfz_KDTkLQYjPR(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, this, 0.0f, 0.0f + this.BUQhobGsPGfVXRFnbGTNeRxSeYrjZipQ.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() + 2.0f);
 this.tooltipRenderer = new BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG(new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new BasicRectBatch(() -> CometRenderer.getShaderColor().setColor(ItemUtils.zmVUyjYbuHQxDLnBwb_hxxL_kvTnlMma.toVector4f())).rectSized(this.VvqpvDhiEQlELmNMVBrbfrRSkySJRZoi.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft(), this.VvqpvDhiEQlELmNMVBrbfrRSkySJRZoi.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() - 2.0f, this.hwxmyMVYyeEFgtjdNFukisssZgHNYqSm, 2.0f)), new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 RoundedTextureBatch VYIXPSuQYideyxhwXANoTonANBRlYYOv = new RoundedTextureBatch().setTexture((GlTex)BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.YAxWDkwCOdwaxrDJ_LfdXXoMqBADadKF.lMEXzgAexFIkuOEHaZftWCJiaLcLCXrZ);
 this.BUQhobGsPGfVXRFnbGTNeRxSeYrjZipQ.pmjlIquCPpRlEiHOuWuPptMmDbNFsuuf(VYIXPSuQYideyxhwXANoTonANBRlYYOv);
 this.VvqpvDhiEQlELmNMVBrbfrRSkySJRZoi.pmjlIquCPpRlEiHOuWuPptMmDbNFsuuf(VYIXPSuQYideyxhwXANoTonANBRlYYOv);
 return VYIXPSuQYideyxhwXANoTonANBRlYYOv;
 }), new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 RoundedRectBatch VYIXPSuQYideyxhwXANoTonANBRlYYOv = new RoundedRectBatch();
 this.BUQhobGsPGfVXRFnbGTNeRxSeYrjZipQ._PqkWM_rTrTqGLP_lpfcWuzIhSvAcMjb(VYIXPSuQYideyxhwXANoTonANBRlYYOv);
 this.VvqpvDhiEQlELmNMVBrbfrRSkySJRZoi._PqkWM_rTrTqGLP_lpfcWuzIhSvAcMjb(VYIXPSuQYideyxhwXANoTonANBRlYYOv);
 return VYIXPSuQYideyxhwXANoTonANBRlYYOv;
 }));
 }
}

