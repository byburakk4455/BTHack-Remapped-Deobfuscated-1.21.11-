/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.CometRenderer
 * com.ferra13671.cometrenderer.ShaderColor
 * com.ferra13671.cometrenderer.minecraft.RectColors
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch
 * com.ferra13671.cometrenderer.minecraft.font.FormattedText
 * com.ferra13671.gltextureutils.GLTexture
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA;
import com.ferra13671.bthack.BTHACK$$$DlBINQCIOZdTytGxXxKfVcpqPmaWMoVEAmosjtZkfJrXERMHSnBDBHWwyGAfArJs;
import com.ferra13671.bthack.BTHACK$$$EeLsIFMVkbiTlNRyEXykxCLQVvFDqXaGDNicnjFPjngHyolkgooPjReZSqKambyh;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.BTHACK$$$wO_YEgjTrFWViIPNbIJpThtqWHvqtzwrLaKVsCrZqRUQtcfZuINbZrvhefrOylch;
import com.ferra13671.cometrenderer.CometRenderer;
import com.ferra13671.cometrenderer.ShaderColor;
import com.ferra13671.cometrenderer.minecraft.RectColors;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch;
import com.ferra13671.cometrenderer.minecraft.font.FormattedText;
import com.ferra13671.gltextureutils.GLTexture;

public abstract class BTHACK$$$zZIfoTHdfoydz_laqrjcbDRPTyJQNuZdCHmutFOpCP_ugrfNoozXQGICldVCtePo
extends BTHACK$$$BLMYzGwAkHrgCQUEXfpMYeotCXLwwLGDseLugUZpZoLQPgqsphaxrZrDKXxNEOwA
implements BTHACK$$$EeLsIFMVkbiTlNRyEXykxCLQVvFDqXaGDNicnjFPjngHyolkgooPjReZSqKambyh {
 protected final BTHACK$$$wO_YEgjTrFWViIPNbIJpThtqWHvqtzwrLaKVsCrZqRUQtcfZuINbZrvhefrOylch RuBk_AvNJzjKNkIhOxKkrkhvPZKzkHJg;
 protected final FormattedText cWNcmAtOdUvUQIvQykVkYOJKfAVywKVM;
 protected final int bSSWDPFbpJOoOQMRYoHAtoSwsnMVgQXB;
 protected final GLTexture oDhXalt_wayRUUKYfYoxWIPdTfmwGaXr;
 protected final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF XykRsdjtEwBoharMsDjccQfsALwRZm_e;

 @Override
 public abstract void KedKlyovVWXJheGudfdzvDubtGoKtnDJ(BTHACK$$$DlBINQCIOZdTytGxXxKfVcpqPmaWMoVEAmosjtZkfJrXERMHSnBDBHWwyGAfArJs var1);

 public BTHACK$$$zZIfoTHdfoydz_laqrjcbDRPTyJQNuZdCHmutFOpCP_ugrfNoozXQGICldVCtePo(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, BTHACK$$$wO_YEgjTrFWViIPNbIJpThtqWHvqtzwrLaKVsCrZqRUQtcfZuINbZrvhefrOylch oTrdImipcItrsjlOIWPRbRDjHHQMCylD, String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, GLTexture PlkDUBgIbAqiwZQKDyaYKUpGcdnGrztu, int mvUhxHpbSBHIhDhIDVAUlorIBPwWgh_i) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, 0.0f, 0.0f, ItemUtils.rxZZQRHkdidtnGaqjbqODdGhBlJIQpNZ.x - ItemUtils.TlqtoNNKbxBkzVvoNoaZUpYppoJpOlaX.x, ItemUtils.xdAkggrqt_LXsmGOYIajCAYEaOZesRtP.y);
 this.XykRsdjtEwBoharMsDjccQfsALwRZm_e = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> new ColoredRectBatch(() -> ((ShaderColor)CometRenderer.getShaderColor()).resetColor()).rectSized(this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft(), this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + this.FAWSkVepqWPcvAQeBzf_kxAzJHfVA_zT, 50.0f, 2.0f, RectColors.horizontalGradient((RenderColor)RenderColor.TRANSLUCENT, (RenderColor)RenderColor.WHITE)).rectSized(this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + 50.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + this.FAWSkVepqWPcvAQeBzf_kxAzJHfVA_zT, 70.0f, 2.0f, RectColors.oneColor((RenderColor)RenderColor.WHITE)).rectSized(this.JzdSkloGYkbJ_TB_TDOgfCFdqhtUssft() + 50.0f + 70.0f, this.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + this.FAWSkVepqWPcvAQeBzf_kxAzJHfVA_zT, 50.0f, 2.0f, RectColors.horizontalGradient((RenderColor)RenderColor.WHITE, (RenderColor)RenderColor.TRANSLUCENT)));
 this.RuBk_AvNJzjKNkIhOxKkrkhvPZKzkHJg = oTrdImipcItrsjlOIWPRbRDjHHQMCylD;
 this.cWNcmAtOdUvUQIvQykVkYOJKfAVywKVM = new FormattedText(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae);
 this.oDhXalt_wayRUUKYfYoxWIPdTfmwGaXr = PlkDUBgIbAqiwZQKDyaYKUpGcdnGrztu;
 this.bSSWDPFbpJOoOQMRYoHAtoSwsnMVgQXB = mvUhxHpbSBHIhDhIDVAUlorIBPwWgh_i;
 }
}

