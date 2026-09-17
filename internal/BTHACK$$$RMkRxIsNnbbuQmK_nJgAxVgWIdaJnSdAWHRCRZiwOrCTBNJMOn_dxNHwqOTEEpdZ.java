/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RectColors
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.cometrenderer.minecraft.font.TTFFont
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA;
import com.ferra13671.bthack.ShulkerRenderer;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.TooltipRenderer;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.Timer;
import com.ferra13671.cometrenderer.minecraft.RectColors;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.cometrenderer.minecraft.font.TTFFont;
import java.util.function.Consumer;

public class BTHACK$$$RMkRxIsNnbbuQmK_nJgAxVgWIdaJnSdAWHRCRZiwOrCTBNJMOn_dxNHwqOTEEpdZ
extends BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA
implements IMinecraft {
 private boolean TXThCDvZJTAWm_QUNHwwukahvimykQYP;
 private final Timer ALvlHPfqCewKTsHlZiFGZ_NhHYINqwYr;
 private boolean oTfqNgaoOKDQKTersbDFykfgiStaMedZ;
 private boolean FGkkKzQXzoapyjMyuRpuwbcfWHgftaCY;
 private final Consumer vsMiAaiDhqNolkAzTgVHwQtoLoqiGfpt;
 private final StringBuilder qHJiKAjApclwSPsVLy_EXmfLkpYBjDZi;
 private final TooltipRenderer ewrwMAhADyBlGKHlqqAqViAziCXMcufs;

 public BTHACK$$$RMkRxIsNnbbuQmK_nJgAxVgWIdaJnSdAWHRCRZiwOrCTBNJMOn_dxNHwqOTEEpdZ(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, float mUFjcogkZFo_XHliQeDydfAYjRBSfzcP, float OoJEdFFjWHJXtOaafbOFyVTgFTWiPxvL, String PbwMmqNuhnlJS_vzx_hhiAnnZdCLDYZV, int ZEXiJcibvrvLGLVPOBjCQYdGiVQUP_mp, Consumer PtQrxAFNsOTAUgPQmkEsnyZsKTFBzCDU) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, mUFjcogkZFo_XHliQeDydfAYjRBSfzcP, OoJEdFFjWHJXtOaafbOFyVTgFTWiPxvL);
 this.TXThCDvZJTAWm_QUNHwwukahvimykQYP = false;
 this.ALvlHPfqCewKTsHlZiFGZ_NhHYINqwYr = new Timer();
 this.oTfqNgaoOKDQKTersbDFykfgiStaMedZ = false;
 this.FGkkKzQXzoapyjMyuRpuwbcfWHgftaCY = false;
 this.qHJiKAjApclwSPsVLy_EXmfLkpYBjDZi = new StringBuilder();
 this.vsMiAaiDhqNolkAzTgVHwQtoLoqiGfpt = PtQrxAFNsOTAUgPQmkEsnyZsKTFBzCDU;
 this.ewrwMAhADyBlGKHlqqAqViAziCXMcufs = new TooltipRenderer(gGdmQgDVWjgbGJu_OqawjduRVktW_eKJ -> {
 TTFFont yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt = TooltipMode.REGULAR.getOrLoad(ZEXiJcibvrvLGLVPOBjCQYdGiVQUP_mp);
 Object rcHGfmJoizDEadijHaBbcqldIM_lZxVZ = this.qHJiKAjApclwSPsVLy_EXmfLkpYBjDZi.toString().isEmpty() && !this.TXThCDvZJTAWm_QUNHwwukahvimykQYP ? PbwMmqNuhnlJS_vzx_hhiAnnZdCLDYZV : this.qHJiKAjApclwSPsVLy_EXmfLkpYBjDZi.toString();
 float cVbZOTPLlyymSsXhrATThAtE_ABJwt_Z = this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + this.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() / 2.0f - yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextHeight((String)rcHGfmJoizDEadijHaBbcqldIM_lZxVZ) / 2.0f;
 float gYSuVtkPcaOLOzmcVcqpY_WNCiTMJhrJ = yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextWidth((String)rcHGfmJoizDEadijHaBbcqldIM_lZxVZ);
 float uBrlhfCJAoxBbdBhBwCnfWCqJRETsYDY = this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() - Math.max(0.0f, gYSuVtkPcaOLOzmcVcqpY_WNCiTMJhrJ - this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() + 10.0f);
 rcHGfmJoizDEadijHaBbcqldIM_lZxVZ = (String)rcHGfmJoizDEadijHaBbcqldIM_lZxVZ + (this.TXThCDvZJTAWm_QUNHwwukahvimykQYP && this.oTfqNgaoOKDQKTersbDFykfgiStaMedZ ? "|" : "");
 if (this.FGkkKzQXzoapyjMyuRpuwbcfWHgftaCY) {
 ((ColoredRectBatch)gGdmQgDVWjgbGJu_OqawjduRVktW_eKJ.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.fEdbuvpfSEvCSaATsUylPKqofVILTzNB)).rectSized(this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft(), cVbZOTPLlyymSsXhrATThAtE_ABJwt_Z, Math.min(gYSuVtkPcaOLOzmcVcqpY_WNCiTMJhrJ, this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM()), yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextHeight(), RectColors.oneColor((RenderColor)ItemUtils.smszVFxEZOOXQXrzgreXNVQHOKuXoGDI));
 }
 ((TextBatch)gGdmQgDVWjgbGJu_OqawjduRVktW_eKJ.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.AsRLTZ_tulUtS_EjmQImJUv_tBgnlhCG)).text(new RenderText((String)rcHGfmJoizDEadijHaBbcqldIM_lZxVZ, uBrlhfCJAoxBbdBhBwCnfWCqJRETsYDY, cVbZOTPLlyymSsXhrATThAtE_ABJwt_Z).withColor(this.qHJiKAjApclwSPsVLy_EXmfLkpYBjDZi.toString().isEmpty() ? ItemUtils.kUeBudAektqsoWQaBmyIysBZrmaXRpRf : ItemUtils.FoDFGMKsINYoeIDPZYrCXxCwrIuuKtWj).withFont(yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt));
 });
 }
}

