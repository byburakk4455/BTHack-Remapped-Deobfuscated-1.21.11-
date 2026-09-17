/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.mojang.brigadier.exceptions.CommandSyntaxException
 * net.minecraft.class_1087
 * net.minecraft.class_11954
 * net.minecraft.class_124
 * net.minecraft.class_1920
 * net.minecraft.class_2338
 * net.minecraft.class_2350
 * net.minecraft.class_2596
 * net.minecraft.class_2680
 * net.minecraft.class_2960
 * net.minecraft.class_3610
 * net.minecraft.class_5912
 * org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 * org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.ChatUtils;
import com.ferra13671.bthack.ModuleManager;
import com.ferra13671.bthack.BTHACK$$$UYyRCJqcHmomSn_DXbgNVGfjCb_MCeoUFGHNbLfYricDESYdKsKvHmAgVVYeishs;
import com.ferra13671.bthack.BTHACK$$$XvaJhVeMaoBQzykRrWwUNSpCfZlMoXeASMgXB_LcyWdYDuIuYLYYGkNMtrbJfkob;
import com.ferra13671.bthack.BThackClient;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import net.minecraft.class_1087;
import net.minecraft.class_11954;
import net.minecraft.class_124;
import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_3610;
import net.minecraft.class_5912;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class BlockRenderHook {
 private static ShaderData mNZfuDSDrowJzsVWqeYcimhybAmFIEGk;
 private static ShaderConfig duogbODLbFtOQEBUPOfwmPufOLPnkUJm;

 public static void KfKw_HvIhOCoADmlIaVOWiSkQZOpHdJi(class_2680 VWpBEiIbYWxGugCOPxWmeaEHZhIVDUDO, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled()) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((ModuleManager.xray.AkEEXEIUbdx_eZEksRwPMAkWywYpRQjQ.getValue()).contains(VWpBEiIbYWxGugCOPxWmeaEHZhIVDUDO.method_26227().method_15772()));
 }
 }

 public static void zwjxIKHqlrpJ_bvmkYWVXUfwLHYBHnLI(class_2680 VWpBEiIbYWxGugCOPxWmeaEHZhIVDUDO, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled() && !((List)ModuleManager.xray.MYdbsYJVTFWbLoUVWuqJteCKLcgNrhhb.getValue()).contains(VWpBEiIbYWxGugCOPxWmeaEHZhIVDUDO.method_26204())) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue(List.of());
 }
 }

 public static void at_rpq_YSNErBduRNWHvZJbZTrsADosy(class_3610 ZNtducLDEmLeSGJBl_xqpZEsuopSZTTx, class_3610 dGFdwClLPTaywVGQsvSUUItOWodvuFUY, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled()) {
 if (((List)ModuleManager.xray.AkEEXEIUbdx_eZEksRwPMAkWywYpRQjQ.getValue()).contains(ZNtducLDEmLeSGJBl_xqpZEsuopSZTTx.method_15772())) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)(!((List)ModuleManager.xray.AkEEXEIUbdx_eZEksRwPMAkWywYpRQjQ.getValue()).contains(dGFdwClLPTaywVGQsvSUUItOWodvuFUY.method_15772()) ? 1 : 0));
 } else {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)true);
 }
 }
 }

 public static int BKPCvaRyLhdMkwxLEK_XleIpU_djDdtx(int UxMDzcHSLJAqAMvaPiFREnD_bTxYHzpU) {
 BTHACK$$$XvaJhVeMaoBQzykRrWwUNSpCfZlMoXeASMgXB_LcyWdYDuIuYLYYGkNMtrbJfkob kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd = new BTHACK$$$XvaJhVeMaoBQzykRrWwUNSpCfZlMoXeASMgXB_LcyWdYDuIuYLYYGkNMtrbJfkob(UxMDzcHSLJAqAMvaPiFREnD_bTxYHzpU);
 BThackClient.getInstance().JtuXqcavQcMYIxchmRYmYVeYuPnoLtXg().RYwwwWNWDGHUoroeMGsUSEwguzByGEOU(kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd);
 return kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd.XnPdxhucHCvtuLDboIff_XvIeYeDBigM;
 }

 public static void ItHveOLPzTZIkSgfOdQaBPugGUlOtOaH(String DioNuNMrVKRCuKULYuoHtObuybJNYLuf, CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 String bfoEqeTNmW_HjwbHiXuwsIDXxuzyUuzW = (String)BThackClient.getInstance().fyoRZbbIGWipjepaRqILpPgovpunUpno().getValue();
 if (DioNuNMrVKRCuKULYuoHtObuybJNYLuf.startsWith(bfoEqeTNmW_HjwbHiXuwsIDXxuzyUuzW)) {
 try {
 BThackClient.getInstance()._JBZpSkZPRoOfmUXHeVIFngvAPlfAMGd().afrbAPqUNWgDA_qRyBtQVIAAJastgJla().execute(DioNuNMrVKRCuKULYuoHtObuybJNYLuf.substring(bfoEqeTNmW_HjwbHiXuwsIDXxuzyUuzW.length()), (Object)BThackClient.getInstance()._JBZpSkZPRoOfmUXHeVIFngvAPlfAMGd().wEbgptP_MGgZMAeAyxKTxcXIqMoRRTTn());
 }
 catch (CommandSyntaxException qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ) {
 ChatUtils._VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(String.valueOf(class_124.field_1061) + qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ.getMessage());
 }
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }

 public static InputStream mnKryf_KpIQlXwUrTdvMXN_rjWftZtdj(class_2960 vblqFjWyWLeJiVpRvNHRzNgjmquXNYxQ, class_5912 T_CZRPeOBJCrhhIFurENKauXemHAlTJl) throws IOException {
 if (vblqFjWyWLeJiVpRvNHRzNgjmquXNYxQ.method_12836().equals("bthack") && vblqFjWyWLeJiVpRvNHRzNgjmquXNYxQ.method_12832().startsWith("sounds/sound-manager/sounds/")) {
 class_2960 RaUFBzylhvqMPXueRTCCByQtzYfXqHIe = class_2960.method_60655((String)vblqFjWyWLeJiVpRvNHRzNgjmquXNYxQ.method_12836(), (String)vblqFjWyWLeJiVpRvNHRzNgjmquXNYxQ.method_12832().substring(7, vblqFjWyWLeJiVpRvNHRzNgjmquXNYxQ.method_12832().length() - 4));
 return new ByteArrayInputStream(BThackClient.getInstance().TWzjCsmVVlSimJraosUpFzZCxUcSmFkC().rktAbawPcaIYqqzHweIwKGGiLnzZspHQ(RaUFBzylhvqMPXueRTCCByQtzYfXqHIe));
 }
 return T_CZRPeOBJCrhhIFurENKauXemHAlTJl.open(vblqFjWyWLeJiVpRvNHRzNgjmquXNYxQ);
 }

 public static void EoyOGzuVDILlyIPruHFgfBSgBypDNgAe(CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 if (duogbODLbFtOQEBUPOfwmPufOLPnkUJm != null && duogbODLbFtOQEBUPOfwmPufOLPnkUJm.bbfzkQojVX_uSpSvRD_kTuYpwlU_rHAT()) {
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }

 public static void tCBy_PyHDbcDzArlrNARLLqmnNExPAuY(class_3610 _q_Trt_TmgspdDUSnXbePPBwmnv_QIil, CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 if (ModuleManager.xray.isEnabled() && !((List)ModuleManager.xray.AkEEXEIUbdx_eZEksRwPMAkWywYpRQjQ.getValue()).contains(_q_Trt_TmgspdDUSnXbePPBwmnv_QIil.method_15772())) {
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }

 public static void SDuIrFvJOteCTGp_BtwgyIhVHzuqYdmv(class_2680 BrJZVBxTZTBHPeLfwxd_GgIQiSTjFVCx, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled() && ((List)ModuleManager.xray.AkEEXEIUbdx_eZEksRwPMAkWywYpRQjQ.getValue()).contains(BrJZVBxTZTBHPeLfwxd_GgIQiSTjFVCx.method_26227().method_15772())) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)true);
 }
 }

 public static void Z_NtyGXyHiTmk_PHxfRxusHNUMsLaDcn(CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled()) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)false);
 }
 }

 private BlockRenderHook() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 public static void TMqgwMyjxbUiskbdcKoXhjKAOONPnPqw(class_11954 RLCwWpEfXUWScwLAlJXkGfikBqSnWzML, CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 if (ModuleManager.xray.isEnabled() && !((List)ModuleManager.xray.MYdbsYJVTFWbLoUVWuqJteCKLcgNrhhb.getValue()).contains(RLCwWpEfXUWScwLAlJXkGfikBqSnWzML.field_62674.method_26204())) {
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }

 public static void pOdDeVAOMUzREDaYPVNZZMC_SmePjnP_() {
 BThackClient.getInstance().JtuXqcavQcMYIxchmRYmYVeYuPnoLtXg().RYwwwWNWDGHUoroeMGsUSEwguzByGEOU(new BTHACK$$$UYyRCJqcHmomSn_DXbgNVGfjCb_MCeoUFGHNbLfYricDESYdKsKvHmAgVVYeishs());
 }

 public static void oMGMTVeYkxEPRqpYyQERHUqNepgqrKiP(class_2680 VWpBEiIbYWxGugCOPxWmeaEHZhIVDUDO, class_1920 dMcWAqCnORXZAEEZENjjXqYhHYpaiKFd, class_2338 gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu, class_2350 ZWQMBWzbtiFHQpCjuOmphnUTDNLaEMqX, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled()) {
 if (((List)ModuleManager.xray.MYdbsYJVTFWbLoUVWuqJteCKLcgNrhhb.getValue()).contains(VWpBEiIbYWxGugCOPxWmeaEHZhIVDUDO.method_26204())) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)(!((List)ModuleManager.xray.MYdbsYJVTFWbLoUVWuqJteCKLcgNrhhb.getValue()).contains(dMcWAqCnORXZAEEZENjjXqYhHYpaiKFd.method_8320(gxkWBnDJofTWDRYFiUNGTWnPehnnEtxu.method_10093(ZWQMBWzbtiFHQpCjuOmphnUTDNLaEMqX)).method_26204()) ? 1 : 0));
 } else {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)false);
 }
 }
 }

 public static void hRdvnJdhBUiqjGIeZwJFMkIwRWDqIClO(class_2680 TyLwK_otob_mRdrdKHPbz_lMZzASNBjR, class_2680 qOryqghKxXtxHuLh_FNYtadhwafanfuU, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled()) {
 if (((List)ModuleManager.xray.MYdbsYJVTFWbLoUVWuqJteCKLcgNrhhb.getValue()).contains(TyLwK_otob_mRdrdKHPbz_lMZzASNBjR.method_26204())) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)(!((List)ModuleManager.xray.MYdbsYJVTFWbLoUVWuqJteCKLcgNrhhb.getValue()).contains(qOryqghKxXtxHuLh_FNYtadhwafanfuU.method_26204()) ? 1 : 0));
 } else {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)false);
 }
 }
 }

 public static void swkIuNkUXJpAOGDskBZRMVyGHKitqEAM(CallbackInfo qkbppjLExQEgStaElsUeKQcysgeoYuDY) {
 if (mNZfuDSDrowJzsVWqeYcimhybAmFIEGk != null && mNZfuDSDrowJzsVWqeYcimhybAmFIEGk.bbfzkQojVX_uSpSvRD_kTuYpwlU_rHAT()) {
 qkbppjLExQEgStaElsUeKQcysgeoYuDY.cancel();
 }
 }

 public static class_2596 snJxneEbwQMg_ekBBoLiUFqVqyqebHYT(class_2596 qyydiLaqIuoEzdPUvZosepBgRwhyPSJy) {
 ShaderConfig kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd = new ShaderConfig(qyydiLaqIuoEzdPUvZosepBgRwhyPSJy);
 BThackClient.getInstance().JtuXqcavQcMYIxchmRYmYVeYuPnoLtXg().RYwwwWNWDGHUoroeMGsUSEwguzByGEOU(kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd);
 duogbODLbFtOQEBUPOfwmPufOLPnkUJm = kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd;
 return kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd.ijlNVwAJRh_AYoQWhzTeikNLoudVssnr();
 }

 public static class_2596 xaD_KndaIloGVIpHyPsoWabDWjQdQTHt(class_2596 qyydiLaqIuoEzdPUvZosepBgRwhyPSJy) {
 ShaderData kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd = new ShaderData(qyydiLaqIuoEzdPUvZosepBgRwhyPSJy);
 BThackClient.getInstance().JtuXqcavQcMYIxchmRYmYVeYuPnoLtXg().RYwwwWNWDGHUoroeMGsUSEwguzByGEOU(kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd);
 mNZfuDSDrowJzsVWqeYcimhybAmFIEGk = kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd;
 return kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd.ijlNVwAJRh_AYoQWhzTeikNLoudVssnr();
 }

 public static void tsudtzhljVcFeRxyTWOKqfVcosxNMEZD(class_2680 BrJZVBxTZTBHPeLfwxd_GgIQiSTjFVCx, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled() && !((List)ModuleManager.xray.MYdbsYJVTFWbLoUVWuqJteCKLcgNrhhb.getValue()).contains(BrJZVBxTZTBHPeLfwxd_GgIQiSTjFVCx.method_26204())) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)new class_1087(){});
 }
 }

 public static void TzdIpXN_cEPApiWbacYYfxFAHMNtUXfc(class_3610 _q_Trt_TmgspdDUSnXbePPBwmnv_QIil, CallbackInfoReturnable aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad) {
 if (ModuleManager.xray.isEnabled()) {
 aWVuNfTdyNfdRKkwQuHVfYZkI_NNjdad.setReturnValue((Object)(((List)ModuleManager.xray.AkEEXEIUbdx_eZEksRwPMAkWywYpRQjQ.getValue()).contains(_q_Trt_TmgspdDUSnXbePPBwmnv_QIil.method_15772()) ? 1 : 0));
 }
 }
}

