/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.batch.impl.BasicTextureBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.gltextureutils.GlTex
 * com.ferra13671.gltextureutils.atlas.TextureBorder
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.BTHACK$$$hVhHeBseRG_vNMUSHqmMjHAdWzlNEVfRxILCdYnXXLDorPgeJazagokBAubsVEvj;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.BTHACK$$$ucUCRVPyGbDhMRvRwaCvdYROwNKNcSddWRvgyURLEqNCOONMrvyxWSnnbSboKGzb;
import com.ferra13671.cometrenderer.minecraft.batch.impl.BasicTextureBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.gltextureutils.GlTex;
import com.ferra13671.gltextureutils.atlas.TextureBorder;

public class BTHACK$$$iQRJeRQEMysbdvWnXyZdeadWANgdEPpWBI_YnkekUjhtsgoihmNMoilbzxGHNVPV
extends BTHACK$$$hVhHeBseRG_vNMUSHqmMjHAdWzlNEVfRxILCdYnXXLDorPgeJazagokBAubsVEvj {
 private final BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG tooltipRenderer;

 public BTHACK$$$iQRJeRQEMysbdvWnXyZdeadWANgdEPpWBI_YnkekUjhtsgoihmNMoilbzxGHNVPV(BTHACK$$$ucUCRVPyGbDhMRvRwaCvdYROwNKNcSddWRvgyURLEqNCOONMrvyxWSnnbSboKGzb IbyjlnSrkkgNdJSBfXCkgAwEvtfMfRqD, BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi) {
 super(IbyjlnSrkkgNdJSBfXCkgAwEvtfMfRqD, uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, ItemUtils.PEcipTQIPeHhSmsSg_xLyxeFqiLLKVko.x, ItemUtils.PEcipTQIPeHhSmsSg_xLyxeFqiLLKVko.y);
 this.tooltipRenderer = new BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG(new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new BasicTextureBatch().setTexture((GlTex)BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.YAxWDkwCOdwaxrDJ_LfdXXoMqBADadKF.dvBYNrnBSqCMsvUJDOToLQBQZFVyMZXT).rectSized(25.0f, 15.0f, 35.0f, 35.0f, new TextureBorder(0.0f, 0.0f, 1.0f, 1.0f))), new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new TextBatch(TooltipMode.SEMIBOLD.getOrLoad(34)).text(new RenderText("BThack", 71.0f, 32.5f - TooltipMode.SEMIBOLD.getOrLoad(34).getTextHeight() / 2.0f))));
 }
}

