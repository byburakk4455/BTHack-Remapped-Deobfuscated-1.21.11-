/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.cometrenderer.minecraft.font.FormattedText
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.cometrenderer.minecraft.font.FormattedText;

public class BTHACK$$$IccEdICtkMQiOFlRzGfMnfsTcjfcoTTxTyOyUMvkNofUswdiIckPwPEHzrlkGXrt
extends BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm
implements IMinecraft {
 private String dokwSbVOxjRGMaMhoyxJbqPLyHbTVOpg;
 private FormattedText PMU_ulvIMdMjorRHEfZrvGudbVGaPgwM;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF HwuOQvRLckfesKaqvcUKjhPBMtlnAnuS;

 public BTHACK$$$IccEdICtkMQiOFlRzGfMnfsTcjfcoTTxTyOyUMvkNofUswdiIckPwPEHzrlkGXrt(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, 0.0f, 0.0f, 0.0f, 0.0f);
 this.HwuOQvRLckfesKaqvcUKjhPBMtlnAnuS = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 TextBatch VYIXPSuQYideyxhwXANoTonANBRlYYOv = new TextBatch(TooltipMode.REGULAR.getOrLoad(20));
 if (this.PMU_ulvIMdMjorRHEfZrvGudbVGaPgwM != null) {
 VYIXPSuQYideyxhwXANoTonANBRlYYOv.text(new RenderText(this.PMU_ulvIMdMjorRHEfZrvGudbVGaPgwM, 9.0f, 9.0f));
 }
 return VYIXPSuQYideyxhwXANoTonANBRlYYOv;
 });
 }
}

