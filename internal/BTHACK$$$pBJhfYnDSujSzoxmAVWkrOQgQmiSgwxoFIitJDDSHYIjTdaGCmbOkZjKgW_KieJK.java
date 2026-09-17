/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.cometrenderer.minecraft.font.TTFFont
 * net.minecraft.class_243
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx;
import com.ferra13671.bthack.BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.Timer;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.cometrenderer.minecraft.font.TTFFont;
import net.minecraft.class_243;

@BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN(name="Speed", y=180.0f, width=124.0f, height=34.0f)
public class BTHACK$$$pBJhfYnDSujSzoxmAVWkrOQgQmiSgwxoFIitJDDSHYIjTdaGCmbOkZjKgW_KieJK
extends BTHACK$$$b_YgUcbzlXWacKRKoYeXPIQXmclfJjUYYFRkfrXGclBqAtHFIDLNxULoOL_XMhkx
implements IMinecraft {
 private static final String GolfLtuqjZPpTvlryWOTCKbWFSBbrQYi = "-";
 public final NumberSetting YsuZKqSFxTrZBadIjgTC_HWNTGWzRRbp;
 public final BooleanSetting vXNwncDWoqeQiEwiTNmaJfuxxJrkCEHL;
 private float sSWjVpypwZTioiuhPLfVWHjEKoFXxCVK;
 private String BqNYfe_rNwFJzKigZtDajbDzRSvBqoyb;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF _pZJHpvARqGUDgeTWnsAgnPvFGGVOCGK;
 private final Timer timer;
 private class_243 mNXWSuxoJzWNlwxfPhhDrNBQLvsleMlH;

 public BTHACK$$$pBJhfYnDSujSzoxmAVWkrOQgQmiSgwxoFIitJDDSHYIjTdaGCmbOkZjKgW_KieJK() {
 this.YsuZKqSFxTrZBadIjgTC_HWNTGWzRRbp = ((NumberSetting.builder().name("Update Delay")).defaultValue(Float.valueOf(250.0f))).min(Float.valueOf(100.0f)).max(Float.valueOf(2500.0f)).precision(0).build();
 this.vXNwncDWoqeQiEwiTNmaJfuxxJrkCEHL = ((BooleanSetting.builder().name("Consider Y")).defaultValue(true)).build();
 this.BqNYfe_rNwFJzKigZtDajbDzRSvBqoyb = GolfLtuqjZPpTvlryWOTCKbWFSBbrQYi;
 this._pZJHpvARqGUDgeTWnsAgnPvFGGVOCGK = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 TTFFont yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt = TooltipMode.REGULAR.getOrLoad(20);
 return new TextBatch().text(new RenderText(this.BqNYfe_rNwFJzKigZtDajbDzRSvBqoyb, this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + this.sSWjVpypwZTioiuhPLfVWHjEKoFXxCVK - yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt.getTextWidth(this.BqNYfe_rNwFJzKigZtDajbDzRSvBqoyb) / 2.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.y).withFont(yJWDwRFnwmScdYpdhRggVQFRDQXQ_sPt));
 });
 this.timer = new Timer();
 this.mNXWSuxoJzWNlwxfPhhDrNBQLvsleMlH = null;
 }
}

