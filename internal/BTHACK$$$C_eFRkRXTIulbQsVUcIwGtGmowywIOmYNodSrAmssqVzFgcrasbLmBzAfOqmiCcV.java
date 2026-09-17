/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.CometLoader
 * com.ferra13671.cometrenderer.CometRenderer
 * com.ferra13671.cometrenderer.State
 * com.ferra13671.cometrenderer.State$BooleanState
 * com.ferra13671.cometrenderer.State$TextureState
 * com.ferra13671.cometrenderer.minecraft.CRMInstance
 * com.ferra13671.cometrenderer.minecraft.CustomDrawMode
 * com.ferra13671.cometrenderer.minecraft.blur.BlurConfig
 * com.ferra13671.cometrenderer.minecraft.blur.BlurProvider
 * com.ferra13671.cometrenderer.minecraft.event.RenderHudCallback
 * com.ferra13671.cometrenderer.minecraft.event.RenderWorldCallback
 * com.ferra13671.cometrenderer.scissor.ScissorRect
 * com.ferra13671.cometrenderer.vertex.DrawMode
 * com.ferra13671.cometrenderer.vertex.format.VertexFormat
 * com.ferra13671.cometrenderer.vertex.mesh.Mesh
 * com.ferra13671.cometrenderer.vertex.mesh.MeshBuilder
 * com.ferra13671.gltextureutils.loader.TextureLoader
 * net.minecraft.class_11228
 * net.minecraft.class_11246
 * net.minecraft.class_238
 * net.minecraft.class_243
 * net.minecraft.class_276
 * net.minecraft.class_4184
 * org.joml.Matrix4f
 * org.joml.Matrix4fc
 * org.joml.Vector3f
 * org.joml.Vector4f
 * org.lwjgl.opengl.GL11
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW;
import com.ferra13671.bthack.BTHACK$$$MwHZUJQkyyQBWccolaoEoAfIHDqEBUNVftHYXeTfZaKuDtyiyRsndvoqqxDUYoLK;
import com.ferra13671.bthack.BTHACK$$$OfVIhFUZTgBEhWvzXtTPPlNoNuZqswFaBqIWrzcVNMiAbJOvwajBZspUjsmdNnqb;
import com.ferra13671.bthack.BTHACK$$$PsuZpsYwmpMflsSBMJHJuBRyigrctWjFk_ZG_vLCXTVhuiJxuGZnoslyOflMWmBr;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.BTHACK$$$kkBYQfAVtjbkd_TTAGRgVKGg_NMUyKgOKbMYlMyL_BgrGLDbLdWKbWZAvLRQCSoT;
import com.ferra13671.bthack.BThackClient;
import com.ferra13671.bthack.BTHACK$$$ufFgLMnBQeogPPwyxZyOMbEVlXRqTtmWQmuUeVunXUqvHRsMbbhwCxANfUIRstoC;
import com.ferra13671.cometrenderer.CometLoader;
import com.ferra13671.cometrenderer.CometRenderer;
import com.ferra13671.cometrenderer.State;
import com.ferra13671.cometrenderer.minecraft.CRMInstance;
import com.ferra13671.cometrenderer.minecraft.CustomDrawMode;
import com.ferra13671.cometrenderer.minecraft.blur.BlurConfig;
import com.ferra13671.cometrenderer.minecraft.blur.BlurProvider;
import com.ferra13671.cometrenderer.minecraft.event.RenderHudCallback;
import com.ferra13671.cometrenderer.minecraft.event.RenderWorldCallback;
import com.ferra13671.cometrenderer.scissor.ScissorRect;
import com.ferra13671.cometrenderer.vertex.DrawMode;
import com.ferra13671.cometrenderer.vertex.format.VertexFormat;
import com.ferra13671.cometrenderer.vertex.mesh.Mesh;
import com.ferra13671.cometrenderer.vertex.mesh.MeshBuilder;
import com.ferra13671.gltextureutils.loader.TextureLoader;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_11228;
import net.minecraft.class_11246;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public final class BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV
implements IMinecraft {
 private static final List nYACFMRvnkEEvRfmsTXjVbvhybGzEdVt;
 public static final CometLoader pYascbeHlOQuWtQWDEksyAyYyhwZfnsD;
 public static final TextureLoader OvkNdDKkRrA_zyMkCUNVvJhYuyaSbUPC;
 public static CRMInstance hbYujWCKULCVdxaTzauWxnzFgjhMDDAM;
 public static BTHACK$$$OfVIhFUZTgBEhWvzXtTPPlNoNuZqswFaBqIWrzcVNMiAbJOvwajBZspUjsmdNnqb __zZCiEKyctXP_PjNCWinhhCiLSFuBBT;
 public static BTHACK$$$PsuZpsYwmpMflsSBMJHJuBRyigrctWjFk_ZG_vLCXTVhuiJxuGZnoslyOflMWmBr wGpXIMyjIeAfiAIrAzPpWxj_aSMLafCB;
 public static BTHACK$$$ufFgLMnBQeogPPwyxZyOMbEVlXRqTtmWQmuUeVunXUqvHRsMbbhwCxANfUIRstoC YAxWDkwCOdwaxrDJ_LfdXXoMqBADadKF;
 public static BlurProvider sibpsJBQw_KSJozCASCtGMBrQtysbidl;
 public static class_11246 xPjsRnbYLIpaTgGlGlVeWPTJwDEfIGSF;
 public static class_11228 twHriGShsCStzXyjKzpDEqLQzNaYXZdo;
 public static Matrix4f hvWgQRFL_ZB_bfhzIZHYLifOHWQJmKVL;
 public static Matrix4f MIvOmudeqeKNolnUxHskrpdIUwqlbhKj;
 public static Matrix4f CYLDODkOxJOGzyDuXXXRjCBIfVzlzSBo;
 public static class_276 lmZYfEJTSpaVRdxdtVaEuKjGHcauZPbB;
 public static boolean HMIMVzPuwjJFqHmMKbYvLHPSSADBYAnI;

 private BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static void VkJYaTIHuKSrwhYmUlHZIHFztWeZmODr(int CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, int wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, int mUFjcogkZFo_XHliQeDydfAYjRBSfzcP, int OoJEdFFjWHJXtOaafbOFyVTgFTWiPxvL) {
 hbYujWCKULCVdxaTzauWxnzFgjhMDDAM.pushScissor(new ScissorRect(CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, mUFjcogkZFo_XHliQeDydfAYjRBSfzcP, OoJEdFFjWHJXtOaafbOFyVTgFTWiPxvL));
 }

 static {
 nYACFMRvnkEEvRfmsTXjVbvhybGzEdVt = new CopyOnWriteArrayList();
 pYascbeHlOQuWtQWDEksyAyYyhwZfnsD = new CometLoader(){};
 OvkNdDKkRrA_zyMkCUNVvJhYuyaSbUPC = new TextureLoader(){};
 HMIMVzPuwjJFqHmMKbYvLHPSSADBYAnI = false;
 }

 public static Mesh GBaaGIpHJRjFSTOngBeWsYcZBNBfBkDg(List rJCPPoNpQRaBnUqueaGQiWMEIHHKuSwI, class_243 mOFCfF_Y_CatSSGmBoHKGWByYQeasDQl) {
 MeshBuilder n_BJT_ragnjQoYoUbXZM_zUssSfMeaiY = Mesh.builder((DrawMode)CustomDrawMode.CUBE, (VertexFormat)VertexFormat.POSITION);
 for (class_238 qTYbIiyLKBxylQctdKdVTpgAQtyEZwlu : rJCPPoNpQRaBnUqueaGQiWMEIHHKuSwI) {
 class_238 ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx = qTYbIiyLKBxylQctdKdVTpgAQtyEZwlu.method_997(mOFCfF_Y_CatSSGmBoHKGWByYQeasDQl.method_18805(-1.0, -1.0, -1.0));
 n_BJT_ragnjQoYoUbXZM_zUssSfMeaiY.vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1320, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1322, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1321).vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1320, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1322, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1324).vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1323, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1322, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1324).vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1323, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1322, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1321).vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1323, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1325, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1321).vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1323, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1325, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1324).vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1320, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1325, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1324).vertex((float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1320, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1325, (float)ucvQBHrjIfiRpQMAEOiYpvqcXYqtMWHx.field_1321);
 }
 return n_BJT_ragnjQoYoUbXZM_zUssSfMeaiY.buildNullable();
 }

 public static BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW rhbUqeVmCprcnNKazQhqzmxUUaIETpEz() {
 BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW EaSkzQCvalzzlZiDAlmgUHVhkWPDLvId = BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW.HXqQgKHtwtiHRsxIIVOpjrnPQs_OTuah("Init Renderer", () -> {
 hbYujWCKULCVdxaTzauWxnzFgjhMDDAM = new CRMInstance(() -> 1);
 State.BLEND = new State.BooleanState(){};
 State.SCISSOR = new State.BooleanState(){};
 State.TEXTURE = new State.TextureState(){};
 });
 EaSkzQCvalzzlZiDAlmgUHVhkWPDLvId.ghoPOWrIfHcfEI_UcnQGsQEDezhyZDju(BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW.HXqQgKHtwtiHRsxIIVOpjrnPQs_OTuah("Compile shaders", () -> {
 __zZCiEKyctXP_PjNCWinhhCiLSFuBBT = new BTHACK$$$OfVIhFUZTgBEhWvzXtTPPlNoNuZqswFaBqIWrzcVNMiAbJOvwajBZspUjsmdNnqb();
 }));
 EaSkzQCvalzzlZiDAlmgUHVhkWPDLvId.ghoPOWrIfHcfEI_UcnQGsQEDezhyZDju(BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW.HXqQgKHtwtiHRsxIIVOpjrnPQs_OTuah("Compile programs", () -> {
 wGpXIMyjIeAfiAIrAzPpWxj_aSMLafCB = new BTHACK$$$PsuZpsYwmpMflsSBMJHJuBRyigrctWjFk_ZG_vLCXTVhuiJxuGZnoslyOflMWmBr();
 }));
 EaSkzQCvalzzlZiDAlmgUHVhkWPDLvId.ghoPOWrIfHcfEI_UcnQGsQEDezhyZDju(BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW.HXqQgKHtwtiHRsxIIVOpjrnPQs_OTuah("Load textures", () -> {
 YAxWDkwCOdwaxrDJ_LfdXXoMqBADadKF = new BTHACK$$$ufFgLMnBQeogPPwyxZyOMbEVlXRqTtmWQmuUeVunXUqvHRsMbbhwCxANfUIRstoC();
 }));
 EaSkzQCvalzzlZiDAlmgUHVhkWPDLvId.ghoPOWrIfHcfEI_UcnQGsQEDezhyZDju(BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW.HXqQgKHtwtiHRsxIIVOpjrnPQs_OTuah("Load blur provider", () -> {
 sibpsJBQw_KSJozCASCtGMBrQtysbidl = new BlurProvider(BlurConfig.DEFAULT);
 }));
 EaSkzQCvalzzlZiDAlmgUHVhkWPDLvId.ghoPOWrIfHcfEI_UcnQGsQEDezhyZDju(BTHACK$$$LxPplMCOvUXqzMgBOXqlULOTworudSVmbQRotMVmkJLOujfBQXKHehLadUNB__JW.HXqQgKHtwtiHRsxIIVOpjrnPQs_OTuah("Register render callbacks", () -> {
 RenderHudCallback.EVENT.register(() -> {
 HMIMVzPuwjJFqHmMKbYvLHPSSADBYAnI = false;
 hbYujWCKULCVdxaTzauWxnzFgjhMDDAM.setupUIMatrix();
 sibpsJBQw_KSJozCASCtGMBrQtysbidl.blurFrame();
 BThackClient.getInstance().JtuXqcavQcMYIxchmRYmYVeYuPnoLtXg().RYwwwWNWDGHUoroeMGsUSEwguzByGEOU(new BTHACK$$$kkBYQfAVtjbkd_TTAGRgVKGg_NMUyKgOKbMYlMyL_BgrGLDbLdWKbWZAvLRQCSoT());
 });
 RenderWorldCallback.EVENT.register(() -> {
 GL11.glEnable((int)2848);
 BThackClient.getInstance().JtuXqcavQcMYIxchmRYmYVeYuPnoLtXg().RYwwwWNWDGHUoroeMGsUSEwguzByGEOU(new BTHACK$$$MwHZUJQkyyQBWccolaoEoAfIHDqEBUNVftHYXeTfZaKuDtyiyRsndvoqqxDUYoLK());
 });
 }));
 return EaSkzQCvalzzlZiDAlmgUHVhkWPDLvId;
 }

 public static void EziOWGsTPRiWZANrkNewXAALGhFfoANA(Runnable yrXKuWgskxpGnfNUqHJSvjJiGNHgVUoz) {
 nYACFMRvnkEEvRfmsTXjVbvhybGzEdVt.add(yrXKuWgskxpGnfNUqHJSvjJiGNHgVUoz);
 }

 /*
 * WARNING - Removed try catching itself - possible behaviour change.
 */
 public static void oIyLHfQmmmZlWFKqvpFkYvPAqTZsYsMC() {
 List list = nYACFMRvnkEEvRfmsTXjVbvhybGzEdVt;
 synchronized (list) {
 if (nYACFMRvnkEEvRfmsTXjVbvhybGzEdVt.isEmpty()) {
 return;
 }
 List<Runnable> bxnYJxIgIpTlINMkgRgSJKPFinwTHITW = List.copyOf(nYACFMRvnkEEvRfmsTXjVbvhybGzEdVt);
 nYACFMRvnkEEvRfmsTXjVbvhybGzEdVt.clear();
 for (Runnable yrXKuWgskxpGnfNUqHJSvjJiGNHgVUoz : bxnYJxIgIpTlINMkgRgSJKPFinwTHITW) {
 yrXKuWgskxpGnfNUqHJSvjJiGNHgVUoz.run();
 }
 }
 }

 public static float[] RbzAGUNWUQJGGSGzJTtYGVlDrhxTJpev(class_243 gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu, boolean jBOHGupmTTmtSHkcUbkfopBiKdNXiUph) {
 class_243 KphqtoJyVKmjZuWyCfDpSydInGyoJrpp = BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.RbzAGUNWUQJGGSGzJTtYGVlDrhxTJpev(gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu);
 if (!jBOHGupmTTmtSHkcUbkfopBiKdNXiUph && BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.HNCnvODdvGKCdFKPbYyIsxLWYxVpSca_(KphqtoJyVKmjZuWyCfDpSydInGyoJrpp)) {
 return null;
 }
 return new float[]{(float)KphqtoJyVKmjZuWyCfDpSydInGyoJrpp.field_1352, (float)KphqtoJyVKmjZuWyCfDpSydInGyoJrpp.field_1351};
 }

 public static void HwhtjMiQzfBQjqnfhDRFikOzGnpkKVNo() {
 CometRenderer.getScissorStack().pop();
 }

 public static boolean HNCnvODdvGKCdFKPbYyIsxLWYxVpSca_(class_243 HRafX_KPCImsC_bcwvvaFxOczmJwbpvw) {
 return !(HRafX_KPCImsC_bcwvvaFxOczmJwbpvw.field_1350 > 0.0) || !(HRafX_KPCImsC_bcwvvaFxOczmJwbpvw.field_1350 < 1.0);
 }

 private static class_243 RbzAGUNWUQJGGSGzJTtYGVlDrhxTJpev(class_243 gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu) {
 class_4184 GPBoEiVIVPsyjipuOjXrX_UAQYKUDZOR = BTHACK$$$C_eFRkRXTIulbQsVUcIwGtGmowywIOmYNodSrAmssqVzFgcrasbLmBzAfOqmiCcV.mc.method_1561().field_4686;
 int KuTxoESxlF_CdqFUoqnhKjcSBKif_aDD = mc.method_22683().method_4506();
 int[] binDNeBzHTCvEuFNtGZqqAMLQcwSFIUw = new int[4];
 GL11.glGetIntegerv((int)2978, (int[])binDNeBzHTCvEuFNtGZqqAMLQcwSFIUw);
 Vector3f trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO = new Vector3f();
 double SohWZwREjyQTXFGgLfY_dOciazhYRCvA = gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.field_1352 - GPBoEiVIVPsyjipuOjXrX_UAQYKUDZOR.method_71156().field_1352;
 double RiuNbCxDynpNCpNKWlfNeUNpCzVrTPBC = gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.field_1351 - GPBoEiVIVPsyjipuOjXrX_UAQYKUDZOR.method_71156().field_1351;
 double WzbKrcikHgIxYUhKPhliBDfLUsWyGqnN = gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.field_1350 - GPBoEiVIVPsyjipuOjXrX_UAQYKUDZOR.method_71156().field_1350;
 while (Math.abs(SohWZwREjyQTXFGgLfY_dOciazhYRCvA) > 600.0 || Math.abs(RiuNbCxDynpNCpNKWlfNeUNpCzVrTPBC) > 600.0 || Math.abs(WzbKrcikHgIxYUhKPhliBDfLUsWyGqnN) > 600.0) {
 SohWZwREjyQTXFGgLfY_dOciazhYRCvA /= 1.5;
 RiuNbCxDynpNCpNKWlfNeUNpCzVrTPBC /= 1.5;
 WzbKrcikHgIxYUhKPhliBDfLUsWyGqnN /= 1.5;
 }
 Vector4f qUqTAEqNVGughNrHllzDacUYaUzPeQjo = new Vector4f((float)SohWZwREjyQTXFGgLfY_dOciazhYRCvA, (float)RiuNbCxDynpNCpNKWlfNeUNpCzVrTPBC, (float)WzbKrcikHgIxYUhKPhliBDfLUsWyGqnN, 1.0f).mul((Matrix4fc)hvWgQRFL_ZB_bfhzIZHYLifOHWQJmKVL);
 Matrix4f dvFAeFVsYYDoDmfbZjJSpDIexhaKgDsN = new Matrix4f((Matrix4fc)MIvOmudeqeKNolnUxHskrpdIUwqlbhKj);
 Matrix4f lPuhpzJKkzdahrHJmmTIWNzWMhwqMFtw = new Matrix4f((Matrix4fc)CYLDODkOxJOGzyDuXXXRjCBIfVzlzSBo);
 dvFAeFVsYYDoDmfbZjJSpDIexhaKgDsN.mul((Matrix4fc)lPuhpzJKkzdahrHJmmTIWNzWMhwqMFtw).project(qUqTAEqNVGughNrHllzDacUYaUzPeQjo.x(), qUqTAEqNVGughNrHllzDacUYaUzPeQjo.y(), qUqTAEqNVGughNrHllzDacUYaUzPeQjo.z(), binDNeBzHTCvEuFNtGZqqAMLQcwSFIUw, trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO);
 return new class_243((double)trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO.x, (double)((float)KuTxoESxlF_CdqFUoqnhKjcSBKif_aDD - trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO.y), (double)trSO_OYsLTNfbmX_PqPDSoMKfnXtgOfO.z);
 }
}

