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

@BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN(name="Players", x=126.0f, y=139.0f, width=94.0f, height=34.0f)
public class BTHACK$$$vDAJxRgkdDMjvogHBEcBXZxrhetIsqRcQLtMfmDGWWSzhpwZMyunoWUXjxUmFZCv
extends BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx
implements IMinecraft {
 private float kHLkVCSNCwmtVOIBfQgeudcBJaZKhJeD;
 private int OAFidtJEHjwYhlSLVahAISgIMrHUhjQN;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF bVuXNnHBrNUMcDpqBjgAmTrDsURzyVTG;

 public BTHACK$$$vDAJxRgkdDMjvogHBEcBXZxrhetIsqRcQLtMfmDGWWSzhpwZMyunoWUXjxUmFZCv() {
 this.bVuXNnHBrNUMcDpqBjgAmTrDsURzyVTG = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 TTFFont yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt = TooltipMode.REGULAR.getOrLoad(20);
 return new TextBatch().text(new RenderText(String.valueOf(this.OAFidtJEHjwYhlSLVahAISgIMrHUhjQN), this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + this.kHLkVCSNCwmtVOIBfQgeudcBJaZKhJeD - yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextWidth(String.valueOf(this.OAFidtJEHjwYhlSLVahAISgIMrHUhjQN)) / 2.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.y).withFont(yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt));
 });
 float HrSgEymPDgoKhSGTMyInTAHQdPcCCxJA = ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.x + 26;
 float dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj = this.ekjfyFLDjPPxg_KQlwPjGVwabktpgyaM() - HrSgEymPDgoKhSGTMyInTAHQdPcCCxJA - (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.x;
 this.kHLkVCSNCwmtVOIBfQgeudcBJaZKhJeD = HrSgEymPDgoKhSGTMyInTAHQdPcCCxJA + dkLjyCUQwPgTOTMrmZjOFFvmgkjfaoPj / 2.0f;
 }
}

