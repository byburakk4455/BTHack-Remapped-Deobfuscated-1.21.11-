/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RectColors
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA;
import com.ferra13671.bthack.BTHACK$$$EeLsIFMVkbiTlNRyEXykxCLQVvFDqXaGDNicnjFPjngHyolkgooPjReZSqKambyh;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$PYDojnoGSvVvvHYlZ_FfXSKVXqUxYUhjQoRzqMtQznoSwYctAhPfz_KDTkLQYjPR;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.cometrenderer.minecraft.RectColors;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch;
import java.awt.Color;

public class BTHACK$$$FcptQZb_uQrFzonUFxlAsBrLkvZ_B_mJkmCfOqwukmBsxoTAGjVFhwabTTIthxvs
extends BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA
implements BTHACK$$$EeLsIFMVkbiTlNRyEXykxCLQVvFDqXaGDNicnjFPjngHyolkgooPjReZSqKambyh {
 private final BTHACK$$$PYDojnoGSvVvvHYlZ_FfXSKVXqUxYUhjQoRzqMtQznoSwYctAhPfz_KDTkLQYjPR aJPEYIHHJEWyXVtPZZtDYmxRWLU_dnNF;
 private final BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG tooltipRenderer;
 private float RZnAOfcLcRDTRcPZpipbBifzHrKpADAf;
 private boolean GMUnMpgcxSR_peOGiuHhbJLWPknQdgoi;

 public BTHACK$$$FcptQZb_uQrFzonUFxlAsBrLkvZ_B_mJkmCfOqwukmBsxoTAGjVFhwabTTIthxvs(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, BTHACK$$$PYDojnoGSvVvvHYlZ_FfXSKVXqUxYUhjQoRzqMtQznoSwYctAhPfz_KDTkLQYjPR tXInxWTtZrBiMbhtnhDdej_wSKHOZmhx, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, ItemUtils.bezQThwjfLfVylpfGOX_psdMmfIBGXda.x, ItemUtils.bezQThwjfLfVylpfGOX_psdMmfIBGXda.y);
 this.GMUnMpgcxSR_peOGiuHhbJLWPknQdgoi = false;
 this.aJPEYIHHJEWyXVtPZZtDYmxRWLU_dnNF = tXInxWTtZrBiMbhtnhDdej_wSKHOZmhx;
 this.tooltipRenderer = new BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG(new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new RoundedRectBatch().rectSized(this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() - 2.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + this.RZnAOfcLcRDTRcPZpipbBifzHrKpADAf - 1.0f - 2.0f, this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() + 4.0f, 7.0f, 3.0f, RectColors.oneColor((RenderColor)RenderColor.WHITE)).rectSized(this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft(), this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + this.RZnAOfcLcRDTRcPZpipbBifzHrKpADAf - 1.0f, this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM(), 3.0f, 1.0f, RectColors.oneColor((RenderColor)RenderColor.of((this.aJPEYIHHJEWyXVtPZZtDYmxRWLU_dnNF.Xjqs_TnPd_kfkd_OKIxaVxnBbLaSclIT().hQOwdEZMgQceyDOFyMpcjJTgrzOGTwTi().getValue()))))));
 this.RZnAOfcLcRDTRcPZpipbBifzHrKpADAf = (1.0f - (float)((Color)tXInxWTtZrBiMbhtnhDdej_wSKHOZmhx.Xjqs_TnPd_kfkd_OKIxaVxnBbLaSclIT().hQOwdEZMgQceyDOFyMpcjJTgrzOGTwTi().getValue()).getAlpha() / 255.0f) * this.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM();
 }
}

