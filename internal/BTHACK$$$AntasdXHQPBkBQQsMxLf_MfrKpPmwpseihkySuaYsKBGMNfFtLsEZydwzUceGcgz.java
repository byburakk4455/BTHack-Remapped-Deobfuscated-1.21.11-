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

@BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN(name="Ping", y=221.0f, width=124.0f, height=34.0f)
public class BTHACK$$$AntasdXHQPBkBQQsMxLf_MfrKpPmwpseihkySuaYsKBGMNfFtLsEZydwzUceGcgz
extends BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx
implements IMinecraft {
 private float IBMRDUbEByvTAekkke_cIihUTBAwbWfV;
 private String YHJYXfEfzaaXOWNJDHcDporqwq_oKWkk;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF XIPNpircU_rpKXEQPIykMrdskuFUjLaw;

 public BTHACK$$$AntasdXHQPBkBQQsMxLf_MfrKpPmwpseihkySuaYsKBGMNfFtLsEZydwzUceGcgz() {
 this.YHJYXfEfzaaXOWNJDHcDporqwq_oKWkk = "-";
 this.XIPNpircU_rpKXEQPIykMrdskuFUjLaw = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 TTFFont yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt = TooltipMode.REGULAR.getOrLoad(20);
 return new TextBatch().text(new RenderText(this.YHJYXfEfzaaXOWNJDHcDporqwq_oKWkk, this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + this.IBMRDUbEByvTAekkke_cIihUTBAwbWfV - yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextWidth(this.YHJYXfEfzaaXOWNJDHcDporqwq_oKWkk) / 2.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.y).withFont(yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt));
 });
 }
}

