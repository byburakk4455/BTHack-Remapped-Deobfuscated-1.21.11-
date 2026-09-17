/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredTextureBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedBlurBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedTextureBatch
 * com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch
 * com.ferra13671.cometrenderer.minecraft.font.TTFFont
 * com.ferra13671.gltextureutils.GlTex
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV;
import com.ferra13671.bthack.MapRenderer;
import com.ferra13671.bthack.TooltipMode;
import com.ferra13671.bthack.TooltipUtils;
import com.ferra13671.bthack.BThackClient;
import com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredTextureBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedBlurBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedRectBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.RoundedTextureBatch;
import com.ferra13671.cometrenderer.minecraft.batch.impl.text.TextBatch;
import com.ferra13671.cometrenderer.minecraft.font.TTFFont;
import com.ferra13671.gltextureutils.GlTex;

public final class ShulkerRenderer {
 public static final TTFFont GuipjafrtAFTQVBdhadWRKumtgOZsQHY;
 public static final TTFFont HULJzNeinVMmzLiw_zFvWOaDmYnWyjCY;
 public static final ShulkerData uYbf_FxQJeFSZavFTKkeQAqafPBIctHl;
 public static final ShulkerData bza_pRmJeWuELTNunoeVbnvtfnYaLHhw;
 public static final ShulkerData ffAOIvLLysFecopCRwQFAfKTKScZjNcv;
 public static final ShulkerData AsRLTZ_tulUtS_EjmQImJUv_tBgnlhCG;
 public static final ShulkerData eNPIFkppprMPKvUHySausRQWBpoLVTGl;
 public static final ShulkerData VmmkciSGXxtCyLyKlbyYgtHzQHFTzrYk;
 public static final ShulkerData XCgrQcM_ZqXuslGGTdzbQWTyPCXjlxAv;
 public static final ShulkerData KDxCgfdDscQrzBKzPkF_QzAUDladEIQu;
 public static final ShulkerData gpXKHDSTMfrMLdSHFRRwOlFGevQWMfeo;
 public static final ShulkerData fEdbuvpfSEvCSaATsUylPKqofVILTzNB;

 static {
 GuipjafrtAFTQVBdhadWRKumtgOZsQHY = TooltipMode.REGULAR.getOrLoad(24);
 HULJzNeinVMmzLiw_zFvWOaDmYnWyjCY = TooltipMode.REGULAR.getOrLoad(12);
 uYbf_FxQJeFSZavFTKkeQAqafPBIctHl = new ShulkerData("plate.rounded-blur", () -> new RoundedBlurBatch(BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.sibpsJBQw_KSJozCASCtGMBrQtysbidl));
 bza_pRmJeWuELTNunoeVbnvtfnYaLHhw = new ShulkerData("plate.rounded-rect", RoundedRectBatch::new);
 ffAOIvLLysFecopCRwQFAfKTKScZjNcv = new ShulkerData("plate.rounded-outlined", TooltipUtils::new);
 AsRLTZ_tulUtS_EjmQImJUv_tBgnlhCG = new ShulkerData("text", TextBatch::new);
 eNPIFkppprMPKvUHySausRQWBpoLVTGl = new ShulkerData("icons-atlas", () -> new ColoredTextureBatch().setTexture((GlTex)BThackClient.getInstance().LWwQGEvn_mYVFBtevOrTRpQUBBk_solB().SgQlGuGXjSKJqiFjUkiaTRrjmbHOTLuV()));
 VmmkciSGXxtCyLyKlbyYgtHzQHFTzrYk = new ShulkerData("item", MapRenderer::new);
 XCgrQcM_ZqXuslGGTdzbQWTyPCXjlxAv = new ShulkerData("rounded-rect", RoundedRectBatch::new);
 KDxCgfdDscQrzBKzPkF_QzAUDladEIQu = new ShulkerData("color-alpha-background", () -> new RoundedTextureBatch().setTexture((GlTex)BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.YAxWDkwCOdwaxrDJ_LfdXXoMqBADadKF.lMEXzgAexFIkuOEHaZftWCJiaLcLCXrZ));
 gpXKHDSTMfrMLdSHFRRwOlFGevQWMfeo = new ShulkerData("color-alpha-rounded-rect", RoundedRectBatch::new);
 fEdbuvpfSEvCSaATsUylPKqofVILTzNB = new ShulkerData("colored-rect", ColoredRectBatch::new);
 }

 private ShulkerRenderer() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }
}

