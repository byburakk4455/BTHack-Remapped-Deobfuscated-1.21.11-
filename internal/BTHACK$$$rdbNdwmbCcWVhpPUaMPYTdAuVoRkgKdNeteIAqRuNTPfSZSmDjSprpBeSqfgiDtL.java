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
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx;
import com.ferra13671.bthack.BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.cometrenderer.minecraft.font.TTFFont;

@BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN(name="Rotation", y=262.0f, width=222.0f, height=34.0f)
public class BTHACK$$$rdbNdwmbCcWVhpPUaMPYTdAuVoRkgKdNeteIAqRuNTPfSZSmDjSprpBeSqfgiDtL
extends BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx
implements IMinecraft {
 private int jSbraMhyA_IyJqeIMqdvbCutoTTjkBWv;
 private int avHqOsOjlKFsLaaIOjBRd_DCvbkcCSai;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF yQCEpFlfLbMiDBCBlXaTLNJsLEhou_PC;

 public BTHACK$$$rdbNdwmbCcWVhpPUaMPYTdAuVoRkgKdNeteIAqRuNTPfSZSmDjSprpBeSqfgiDtL() {
 this.jSbraMhyA_IyJqeIMqdvbCutoTTjkBWv = 0;
 this.avHqOsOjlKFsLaaIOjBRd_DCvbkcCSai = 0;
 this.yQCEpFlfLbMiDBCBlXaTLNJsLEhou_PC = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 TTFFont yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt = TooltipMode.REGULAR.getOrLoad(20);
 String XZRFRvvZqtKekCEvdWkzHRVwshIxA_wD = String.valueOf(this.jSbraMhyA_IyJqeIMqdvbCutoTTjkBWv % 360);
 String nDbNQvipFetgepHeaAIjhmhgkpycjPFv = String.valueOf(this.avHqOsOjlKFsLaaIOjBRd_DCvbkcCSai);
 return new TextBatch(yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt).text(new RenderText(XZRFRvvZqtKekCEvdWkzHRVwshIxA_wD, this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + 105.0f - yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextWidth(XZRFRvvZqtKekCEvdWkzHRVwshIxA_wD) / 2.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.y)).text(new RenderText(nDbNQvipFetgepHeaAIjhmhgkpycjPFv, this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + 195.0f - yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextWidth(nDbNQvipFetgepHeaAIjhmhgkpycjPFv) / 2.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.y));
 });
 }
}

