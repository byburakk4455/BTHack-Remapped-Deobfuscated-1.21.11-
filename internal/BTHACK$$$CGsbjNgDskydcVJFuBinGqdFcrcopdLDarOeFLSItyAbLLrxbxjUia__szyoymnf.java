/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.cometrenderer.minecraft.font.TTFFont
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx;
import com.ferra13671.bthack.BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx;
import com.ferra13671.bthack.BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.cometrenderer.minecraft.font.TTFFont;

@BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN(name="TPS", x=138.0f, y=180.0f, width=124.0f, height=34.0f)
public class BTHACK$$$CGsbjNgDskydcVJFuBinGqdFcrcopdLDarOeFLSItyAbLLrxbxjUia__szyoymnf
extends BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx {
 private float NC_e_OCQIErBRpNkDvYPLeFFydxUhEmW;
 private float XgFWFYfOGlJdREdmiKqqDUJHDfohuqOG;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF _qLGnodRdNGepUSBCTyAUAqVALTwvtvN;

 public BTHACK$$$CGsbjNgDskydcVJFuBinGqdFcrcopdLDarOeFLSItyAbLLrxbxjUia__szyoymnf() {
 this.XgFWFYfOGlJdREdmiKqqDUJHDfohuqOG = 0.0f;
 this._qLGnodRdNGepUSBCTyAUAqVALTwvtvN = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 TTFFont yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt = TooltipMode.REGULAR.getOrLoad(20);
 String rcHGfmJoizDEadijHaBbcqldIM_lZxVZ = String.valueOf(BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx.precision(BTHACK$$$jHqSlRGFqNSxSXlONrYQjzBRAxaAgxTbOK_IjeEuAIb_wmXXQsGbPVoiMQfuhPwx.GfPlNxLuYblxlUgMCvkzakWmRThxOkzR(Float.valueOf(this.XgFWFYfOGlJdREdmiKqqDUJHDfohuqOG)), 1));
 return new TextBatch().text(new RenderText(rcHGfmJoizDEadijHaBbcqldIM_lZxVZ, this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + this.NC_e_OCQIErBRpNkDvYPLeFFydxUhEmW - yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextWidth(rcHGfmJoizDEadijHaBbcqldIM_lZxVZ) / 2.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.y).withFont(yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt));
 });
 }
}

