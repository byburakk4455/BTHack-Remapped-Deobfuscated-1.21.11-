/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RectColors
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedBlurBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * net.minecraft.class_1799
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.ShulkerRenderer;
import com.ferra13671.bthack.MapRenderer;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.TooltipRenderer;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.TooltipUtils;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.ArmorTooltipRenderer;
import com.ferra13671.cometrenderer.minecraft.RectColors;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedBlurBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.RenderText;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import net.minecraft.class_1799;

@ModuleInfo(name="Tooltips", category="render")
public class TooltipsModule
extends Module {
 private ArmorTooltipRenderer armorTooltipRenderer;
 private final TooltipRenderer tooltipRenderer;

 public TooltipsModule() {
 this.tooltipRenderer = new TooltipRenderer(uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl -> {
 if (this.armorTooltipRenderer != null) {
 ((RoundedBlurBatch)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.uYbf_FxQJeFSZavFTKkeQAqafPBIctHl)).rectSized(0.0f, 0.0f, (float)ItemUtils.pdbAhfDeCEkbGvSwOIDJVPCTBtBMrLgM.x, (float)ItemUtils.pdbAhfDeCEkbGvSwOIDJVPCTBtBMrLgM.y, 20.0f);
 ((RoundedRectBatch)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.bza_pRmJeWuELTNunoeVbnvtfnYaLHhw)).rectSized(0.0f, 0.0f, (float)ItemUtils.pdbAhfDeCEkbGvSwOIDJVPCTBtBMrLgM.x, (float)ItemUtils.pdbAhfDeCEkbGvSwOIDJVPCTBtBMrLgM.y, 20.0f, RectColors.oneColor((RenderColor)ItemUtils.qLGiNZguIVWuYgukYQCVPuudbcUtMGCl));
 ((TooltipUtils)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.ffAOIvLLysFecopCRwQFAfKTKScZjNcv)).wdCaGHihRRzxarsk_VMqVNXIeaZpllJZ(0.0f, 0.0f, ItemUtils.pdbAhfDeCEkbGvSwOIDJVPCTBtBMrLgM.x, ItemUtils.pdbAhfDeCEkbGvSwOIDJVPCTBtBMrLgM.y, 20.0f, 2.0f, RectColors.oneColor((RenderColor)RenderColor.TRANSLUCENT), RectColors.oneColor((RenderColor)ItemUtils.zmVUyjYbuHQxDLnBwb_hxxL_kvTnlMma));
 ((TextBatch)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.AsRLTZ_tulUtS_EjmQImJUv_tBgnlhCG)).text(new RenderText(this.armorTooltipRenderer.haMDKcFhtgKqqobYqZbhOvFQfegtxCLk().method_7964().getString(), (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.x, (float)ItemUtils.VKDNnmlObzdpciqBzWomdBsnJtCgFaoB.y).withFont(TooltipMode.REGULAR.getOrLoad(20)));
 RoundedRectBatch PIzGjFbKaRYdHmXSRlEILQuPnmXSRBVy = (RoundedRectBatch)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.bza_pRmJeWuELTNunoeVbnvtfnYaLHhw);
 MapRenderer PDfYhvcAYvOTogABaiFFvxRcTqyTyXDM = (MapRenderer)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl.InBZZcCQAXPsBPDXmpNgtkzCExDPllgk(ShulkerRenderer.VmmkciSGXxtCyLyKlbyYgtHzQHFTzrYk);
 for (int HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO = 9; HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO < 36; ++HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO) {
 int mXGTxoPODWtToVUWirfQQOiavaPCcrHK = HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO % 9;
 int BUAszgTSkABEKmXYkCtdMFWbydtRCbQB = 4 - HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO / 9;
 float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD = 8 + mXGTxoPODWtToVUWirfQQOiavaPCcrHK * 38 + mXGTxoPODWtToVUWirfQQOiavaPCcrHK * 3;
 float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT = ItemUtils.pdbAhfDeCEkbGvSwOIDJVPCTBtBMrLgM.y - 8 - BUAszgTSkABEKmXYkCtdMFWbydtRCbQB * 38 - (BUAszgTSkABEKmXYkCtdMFWbydtRCbQB - 1) * 3;
 PIzGjFbKaRYdHmXSRlEILQuPnmXSRBVy.rectSized(CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, 38.0f, 38.0f, 10.0f, RectColors.oneColor((RenderColor)ItemUtils.LfVdinOqqkrAWUBndMqNvTYDBBVQj_Cu));
 if (HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO - 9 >= this.armorTooltipRenderer.ATgAwRUTbZQsr_ZJCYuWhbdVbBBDwxeJ().size()) continue;
 PDfYhvcAYvOTogABaiFFvxRcTqyTyXDM.pFtCSwjiCh_sraVpYOYZsLMWFhGAoMvD((class_1799)this.armorTooltipRenderer.ATgAwRUTbZQsr_ZJCYuWhbdVbBBDwxeJ().get(HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO - 9), CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD + 3.0f, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT + 3.0f, true);
 }
 this.armorTooltipRenderer = null;
 }
 });
 }
}

