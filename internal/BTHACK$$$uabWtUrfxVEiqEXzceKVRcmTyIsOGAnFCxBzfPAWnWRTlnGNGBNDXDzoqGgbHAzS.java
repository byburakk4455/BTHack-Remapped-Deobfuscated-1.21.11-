/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.CometRenderer
 * com.ferra13671.cometrenderer.minecraft.batch.impl.BasicRectBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.BasicTextureBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.gltextureutils.GlTex
 * com.ferra13671.gltextureutils.atlas.TextureBorder
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV;
import com.ferra13671.bthack.BTHACK$$$EbDrpAIBJjgUJmuSeHuUSVtfwdShFVfVAOxZBzCkjlppgyGGev_FfKejGSnk_WWD;
import com.ferra13671.bthack.BTHACK$$$IccEdICtkMQiOFlRzGfMnfsTcjfcoTTxTyOyUMvkNofUswdiIckPwPEHzrlkGXrt;
import com.ferra13671.bthack.BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$RMkRxIsNnbbuQmK_nJgAxVgWIdaJnSdAWHRCRZiwOrCTBNJMOn_dxNHwqOTEEpdZ;
import com.ferra13671.bthack.BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.BTHACK$$$fHXakHyfYLRGgHohlWwLCnAOAcGvZcAqBubGgiqgUVunZduCB_LkdIQDSByNqlXN;
import com.ferra13671.bthack.BTHACK$$$gcnITKiAAs_YkERRcPwFLDGkxkLnarLEldtiOYdwkbjUQMGclssofMnssSHCqRCx;
import com.ferra13671.bthack.ListSetting;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.cometrenderer.CometRenderer;
import com.ferra13671.cometrenderer.minecraft.batch.impl.BasicRectBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.BasicTextureBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.gltextureutils.GlTex;
import com.ferra13671.gltextureutils.atlas.TextureBorder;

public class BTHACK$$$uabWtUrfxVEiqEXzceKVRcmTyIsOGAnFCxBzfPAWnWRTlnGNGBNDXDzoqGgbHAzS
extends BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm {
 private final BTHACK$$$gcnITKiAAs_YkERRcPwFLDGkxkLnarLEldtiOYdwkbjUQMGclssofMnssSHCqRCx HhXwCQCabjNhhxmwghEveiXNBymTDPkL;
 private final ListSetting woLpUCYdMBldkDESbhoXUdllazvoAlxK;
 private final BTHACK$$$IccEdICtkMQiOFlRzGfMnfsTcjfcoTTxTyOyUMvkNofUswdiIckPwPEHzrlkGXrt faaWbOWgFyHoOgynHEhgglYoUyfrsCwQ;
 private final BTHACK$$$RMkRxIsNnbbuQmK_nJgAxVgWIdaJnSdAWHRCRZiwOrCTBNJMOn_dxNHwqOTEEpdZ UucNhsIGKWqRgPCxuRAzzLlXIrcWHBnQ;
 private final BTHACK$$$EbDrpAIBJjgUJmuSeHuUSVtfwdShFVfVAOxZBzCkjlppgyGGev_FfKejGSnk_WWD mMFurprahwaDolPcwsVUbPaAgXafIVqq;
 private final BTHACK$$$EbDrpAIBJjgUJmuSeHuUSVtfwdShFVfVAOxZBzCkjlppgyGGev_FfKejGSnk_WWD yRiFJVaHnuCFSElfvyXjhXYtIJHunLBC;
 private final BTHACK$$$fHXakHyfYLRGgHohlWwLCnAOAcGvZcAqBubGgiqgUVunZduCB_LkdIQDSByNqlXN JDRXcr_AroAspsDyaSITgTJIBtPCHRNa;
 private final BTHACK$$$fHXakHyfYLRGgHohlWwLCnAOAcGvZcAqBubGgiqgUVunZduCB_LkdIQDSByNqlXN zWguUldLXHwHfOFhOrOzbKVnoMdEHXZb;
 private BTHACK$$$EbDrpAIBJjgUJmuSeHuUSVtfwdShFVfVAOxZBzCkjlppgyGGev_FfKejGSnk_WWD yOAPryFcyIPKPYGYhdgvccC_aVRCXHit;
 private final BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG tooltipRenderer;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF KODdBHyaPqoEarJCFvrkoNRyknejMUaR;

 public BTHACK$$$uabWtUrfxVEiqEXzceKVRcmTyIsOGAnFCxBzfPAWnWRTlnGNGBNDXDzoqGgbHAzS(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, ListSetting biPCJJnrdcbmIdoskAIZilsnxasFSbNH, BTHACK$$$gcnITKiAAs_YkERRcPwFLDGkxkLnarLEldtiOYdwkbjUQMGclssofMnssSHCqRCx szc_ucwnmHiDJwCyWVDLfTLtjYAZfypk, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, ItemUtils.ETPPuzZGofsUbmTeCDGlZvlrpULyHnjS.x, ItemUtils.ETPPuzZGofsUbmTeCDGlZvlrpULyHnjS.y);
 this.faaWbOWgFyHoOgynHEhgglYoUyfrsCwQ = new BTHACK$$$IccEdICtkMQiOFlRzGfMnfsTcjfcoTTxTyOyUMvkNofUswdiIckPwPEHzrlkGXrt(this.uIEEf_drndGuTPTmoKLDVFYxYPpjPyBt);
 this.HhXwCQCabjNhhxmwghEveiXNBymTDPkL = szc_ucwnmHiDJwCyWVDLfTLtjYAZfypk;
 this.woLpUCYdMBldkDESbhoXUdllazvoAlxK = biPCJJnrdcbmIdoskAIZilsnxasFSbNH;
 float gumgtvmkVPsrRUXDIBUBxOCqojyzojBJ = 55.0f;
 this.UucNhsIGKWqRgPCxuRAzzLlXIrcWHBnQ = new BTHACK$$$RMkRxIsNnbbuQmK_nJgAxVgWIdaJnSdAWHRCRZiwOrCTBNJMOn_dxNHwqOTEEpdZ(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, gumgtvmkVPsrRUXDIBUBxOCqojyzojBJ, 10.0f, this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() - gumgtvmkVPsrRUXDIBUBxOCqojyzojBJ - 10.0f, 41.0f, "Search...", 34, xmwnilhAnfgVLOwNQbWAAmxrhgWzQVzy -> {
 if (this.yOAPryFcyIPKPYGYhdgvccC_aVRCXHit != null) {
 this.yOAPryFcyIPKPYGYhdgvccC_aVRCXHit.KZKZ_FXfMbrKkrYisq_cudZpHHpdqwbC((BTHACK$$$RMkRxIsNnbbuQmK_nJgAxVgWIdaJnSdAWHRCRZiwOrCTBNJMOn_dxNHwqOTEEpdZ)xmwnilhAnfgVLOwNQbWAAmxrhgWzQVzy);
 }
 });
 this.mMFurprahwaDolPcwsVUbPaAgXafIVqq = new BTHACK$$$EbDrpAIBJjgUJmuSeHuUSVtfwdShFVfVAOxZBzCkjlppgyGGev_FfKejGSnk_WWD(this, this.uIEEf_drndGuTPTmoKLDVFYxYPpjPyBt, 0.0f, 58.0f, this){
 final BTHACK$$$uabWtUrfxVEiqEXzceKVRcmTyIsOGAnFCxBzfPAWnWRTlnGNGBNDXDzoqGgbHAzS iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb;
 {
 this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb = BrFrQfPicyduKvaOIZfSbSnd_cCLxhwC;
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, PbFwUpzdItSLWU_zIIdTbGguElwKZNEA);
 }
 };
 this.yRiFJVaHnuCFSElfvyXjhXYtIJHunLBC = new BTHACK$$$EbDrpAIBJjgUJmuSeHuUSVtfwdShFVfVAOxZBzCkjlppgyGGev_FfKejGSnk_WWD(this, this.uIEEf_drndGuTPTmoKLDVFYxYPpjPyBt, 0.0f, 58.0f, this){
 final BTHACK$$$uabWtUrfxVEiqEXzceKVRcmTyIsOGAnFCxBzfPAWnWRTlnGNGBNDXDzoqGgbHAzS iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb;
 {
 this.iTFnVKlGcGkHloHKGcfPUMQjFRlrGIpb = BrFrQfPicyduKvaOIZfSbSnd_cCLxhwC;
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, PbFwUpzdItSLWU_zIIdTbGguElwKZNEA);
 }
 };
 this.JDRXcr_AroAspsDyaSITgTJIBtPCHRNa = new BTHACK$$$fHXakHyfYLRGgHohlWwLCnAOAcGvZcAqBubGgiqgUVunZduCB_LkdIQDSByNqlXN(this.uIEEf_drndGuTPTmoKLDVFYxYPpjPyBt, 0.0f, this.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() - 46.0f, "Add", this.mMFurprahwaDolPcwsVUbPaAgXafIVqq);
 this.zWguUldLXHwHfOFhOrOzbKVnoMdEHXZb = new BTHACK$$$fHXakHyfYLRGgHohlWwLCnAOAcGvZcAqBubGgiqgUVunZduCB_LkdIQDSByNqlXN(this.uIEEf_drndGuTPTmoKLDVFYxYPpjPyBt, this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() / 2.0f, this.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() - 46.0f, "Remove", this.yRiFJVaHnuCFSElfvyXjhXYtIJHunLBC);
 this.yOAPryFcyIPKPYGYhdgvccC_aVRCXHit = this.mMFurprahwaDolPcwsVUbPaAgXafIVqq;
 this.tooltipRenderer = new BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG(new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new BasicRectBatch(() -> CometRenderer.getShaderColor().setColor(ItemUtils.zmVUyjYbuHQxDLnBwb_hxxL_kvTnlMma.toVector4f())).rectSized(1.0f, 56.0f, this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() - 2.0f, 2.0f).rectSized(1.0f, this.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() - 46.0f - 1.0f, this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() - 2.0f, 2.0f).rectSized(this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() / 2.0f - 1.0f, this.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() - 46.0f + 1.0f, 2.0f, 45.0f)), new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new BasicTextureBatch().setTexture((GlTex)BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.YAxWDkwCOdwaxrDJ_LfdXXoMqBADadKF.JoKQCRX_jVddfdmKgghHRMRujiLXCjYe).rectSized(10.0f, 10.0f, 35.0f, 35.0f, new TextureBorder(0.0f, 0.0f, 1.0f, 1.0f))));
 this.KODdBHyaPqoEarJCFvrkoNRyknejMUaR = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 TextBatch l_lZhaTsmqGzCY_favmTjOuGTsOmBGCN = new TextBatch(TooltipMode.REGULAR.getOrLoad(29));
 this.JDRXcr_AroAspsDyaSITgTJIBtPCHRNa.zERpJUQhk_iNHLQDgPQGEtkpRTBziyZI(l_lZhaTsmqGzCY_favmTjOuGTsOmBGCN);
 this.zWguUldLXHwHfOFhOrOzbKVnoMdEHXZb.zERpJUQhk_iNHLQDgPQGEtkpRTBziyZI(l_lZhaTsmqGzCY_favmTjOuGTsOmBGCN);
 return l_lZhaTsmqGzCY_favmTjOuGTsOmBGCN;
 });
 this.yOAPryFcyIPKPYGYhdgvccC_aVRCXHit.hishFORgTzHaahtsoZztl_oDgaKgnObk();
 }
}

