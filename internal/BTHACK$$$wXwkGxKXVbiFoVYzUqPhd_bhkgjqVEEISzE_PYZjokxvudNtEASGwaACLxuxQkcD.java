/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RectColors
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedTextureBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.gltextureutils.atlas.TextureBorder
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.BTHACK$$$hVhHeBseRG_vNMUSHqmMjHAdWzlNEVfRxILCdYnXXLDorPgeJazagokBAubsVEvj;
import com.ferra13671.bthack.BThackClient;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.BTHACK$$$ucUCRVPyGbDhMRvRwaCvdYROwNKNcSddWRvgyURLEqNCOONMrvyxWSnnbSboKGzb;
import com.ferra13671.cometrenderer.minecraft.RectColors;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedTextureBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.gltextureutils.atlas.TextureBorder;

public class BTHACK$$$wXwkGxKXVbiFoVYzUqPhd_bhkgjqVEEISzE_PYZjokxvudNtEASGwaACLxuxQkcD
extends BTHACK$$$hVhHeBseRG_vNMUSHqmMjHAdWzlNEVfRxILCdYnXXLDorPgeJazagokBAubsVEvj {
 private final BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG tooltipRenderer;

 public BTHACK$$$wXwkGxKXVbiFoVYzUqPhd_bhkgjqVEEISzE_PYZjokxvudNtEASGwaACLxuxQkcD(BTHACK$$$ucUCRVPyGbDhMRvRwaCvdYROwNKNcSddWRvgyURLEqNCOONMrvyxWSnnbSboKGzb IbyjlnSrkkgNdJSBfXCkgAwEvtfMfRqD, BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi) {
 super(IbyjlnSrkkgNdJSBfXCkgAwEvtfMfRqD, uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, ItemUtils.PkPHVFTxUJSJGznztXZnwsOwwNenpqqd.x, ItemUtils.PkPHVFTxUJSJGznztXZnwsOwwNenpqqd.y);
 this.tooltipRenderer = new BTHACK$$$RrwAZhDZ_RttINMFtclcaGB_HxfYr_VXrh_vLaMXWqIRrREqyqvGJSeLxmmaKsaG(new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new RoundedTextureBatch().setTexture(BThackClient.getInstance().AAxrIoJQjynMZBPgxvyCWVrMqAyfClIY().CesBHASjKaTXcalDfGFvHQcJdwDnAFYj()).rectSized((float)(1 + ItemUtils.YABduFlJixJpotUrifhDg_NkctEHzeRg.x), (float)ItemUtils.YABduFlJixJpotUrifhDg_NkctEHzeRg.y, 56.0f, 56.0f, 10.0f, RectColors.oneColor((RenderColor)RenderColor.WHITE), new TextureBorder(0.0f, 0.0f, 1.0f, 1.0f))), new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new TextBatch(TooltipMode.LIGHT.getOrLoad(20)).text(new RenderText(BThackClient.getInstance().AAxrIoJQjynMZBPgxvyCWVrMqAyfClIY().kbCMoRnsRuQXQOaxrXacWdBAuJVPdhzX(), (float)(1 + ItemUtils.cVdJRJsfedRDvZcxZmFdBVQhyRwIHvLK.x), (float)ItemUtils.cVdJRJsfedRDvZcxZmFdBVQhyRwIHvLK.y))));
 }

 private static String GKScMJLjjrrIhpOFlYPwyKlgusGfsIKI(int HrSgEymPDgoKhSGTMyInTAHQdPcCCxJA) {
 return HrSgEymPDgoKhSGTMyInTAHQdPcCCxJA < 10 ? "0" + HrSgEymPDgoKhSGTMyInTAHQdPcCCxJA : "" + HrSgEymPDgoKhSGTMyInTAHQdPcCCxJA;
 }
}

