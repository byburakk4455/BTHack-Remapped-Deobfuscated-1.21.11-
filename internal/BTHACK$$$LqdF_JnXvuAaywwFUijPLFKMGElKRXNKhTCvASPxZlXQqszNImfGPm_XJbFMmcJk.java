/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.RectColors
 * com.ferra13671.cometrenderer.minecraft.RenderColor
 * com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm;
import com.ferra13671.bthack.ItemUtils;
import com.ferra13671.bthack.IModule;
import com.ferra13671.bthack.BTHACK$$$NuNNPjOPqcbXUEJZLNXtOPRESrn_GJvkmYBlruAaXPnAALIfvWBqGOxoCybUGYUU;
import com.ferra13671.bthack.TooltipRenderer;
import com.ferra13671.bthack.BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc;
import com.ferra13671.bthack.BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF;
import com.ferra13671.bthack.BTHACK$$$yPKxmDjcqXAxucYDrcTyyoSqyOUEPklXfyzuCDKYKvyiGHZVzDDpCUVSYFuhTtEt;
import com.ferra13671.cometrenderer.minecraft.RectColors;
import com.ferra13671.cometrenderer.minecraft.RenderColor;
import com.ferra13671.cometrenderer.minecraft.batch.impl.ColoredRectBatch;
import java.util.ArrayList;
import java.util.List;

public class BTHACK$$$LqdF_JnXvuAaywwFUijPLFKMGElKRXNKhTCvASPxZlXQqszNImfGPm_XJbFMmcJk
extends BTHACK$$$JqNYXfJsNESvUICSSt_KhwrsvXQaKprKzZAfiiXZPYSuDTwc_HTlCWcQhZcXWqqm
implements BTHACK$$$yPKxmDjcqXAxucYDrcTyyoSqyOUEPklXfyzuCDKYKvyiGHZVzDDpCUVSYFuhTtEt {
 private final List OIvVgRiPAvkxg_oMoQSgvsRsWfiIemYs;
 private final List dmpqqySgdKexWZMsVaTawsrpmbid_hHS;
 private final BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF xdXkQMhfAEiEpycvXuwsjIORTYaasnLg;
 private final TooltipRenderer l_VPKRRucSyQcLlCeeKMZfZmWdMISLYB;

 public BTHACK$$$LqdF_JnXvuAaywwFUijPLFKMGElKRXNKhTCvASPxZlXQqszNImfGPm_XJbFMmcJk(BTHACK$$$QKRBtGwUuWQNEYQJPUPpSnnPOOZeTuaGiLskKslaABKbqBLorkNBWsQZSnoBgDHc uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, IModule dPwMSmfyz_qIFCJRVraJMeQAtRORuHUd, float CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, float wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT) {
 super(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, CcBEPW_hgOCJDkYqINrDeNcNQsyxGNuD, wYCtjdQGvZQxOCJsbFZmJlcRlgsLvxZT, 305.0f, 0.0f);
 this.OIvVgRiPAvkxg_oMoQSgvsRsWfiIemYs = new ArrayList();
 this.dmpqqySgdKexWZMsVaTawsrpmbid_hHS = new ArrayList();
 float JUTEbhGGbicsonpYlByVCxLaLUIYEwGj = this.hwxmyMVYyeEFgtjdNFukisssZgHNYqSm - (float)(ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x * 2);
 float GkhQsNeCdFKsnNdyKcZwgfCzHTmqWaWY = 0.0f;
 BTHACK$$$NuNNPjOPqcbXUEJZLNXtOPRESrn_GJvkmYBlruAaXPnAALIfvWBqGOxoCybUGYUU NCHDKIObmLaSEhyYXHxY_VkmcMHYkfmM = dPwMSmfyz_qIFCJRVraJMeQAtRORuHUd.getKeybind().fNyMMMgAvZJvjXWJEzkLTeDWZzNntrhH(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, this, ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x, (float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.y + GkhQsNeCdFKsnNdyKcZwgfCzHTmqWaWY, JUTEbhGGbicsonpYlByVCxLaLUIYEwGj);
 this.dmpqqySgdKexWZMsVaTawsrpmbid_hHS.add(NCHDKIObmLaSEhyYXHxY_VkmcMHYkfmM);
 BTHACK$$$NuNNPjOPqcbXUEJZLNXtOPRESrn_GJvkmYBlruAaXPnAALIfvWBqGOxoCybUGYUU YYfXIY_nmRDgAOSsykSYITluWSlArjud = dPwMSmfyz_qIFCJRVraJMeQAtRORuHUd.dBxGxBnkZQGsOWVfjBZoxeTeGuHEjQxc().fNyMMMgAvZJvjXWJEzkLTeDWZzNntrhH(uIDDxrfgOK_lxPGKxdJBsVeOAOjeyIAi, this, ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x, (float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.y + (GkhQsNeCdFKsnNdyKcZwgfCzHTmqWaWY += NCHDKIObmLaSEhyYXHxY_VkmcMHYkfmM.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() + (float)(ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.y * 2) + 2.0f), JUTEbhGGbicsonpYlByVCxLaLUIYEwGj);
 this.dmpqqySgdKexWZMsVaTawsrpmbid_hHS.add(YYfXIY_nmRDgAOSsykSYITluWSlArjud);
 this.FAWSkVepqWPcvAQeBzf_kxAzJHfVA_zT = (float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.y + (GkhQsNeCdFKsnNdyKcZwgfCzHTmqWaWY += YYfXIY_nmRDgAOSsykSYITluWSlArjud.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() + (float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.y);
 this.xdXkQMhfAEiEpycvXuwsjIORTYaasnLg = new BTHACK$$$tUJYyYoeZteeXcWtzIlEWscErlZNBzrCcbHGjYhEXALomaPBA_dcfKwjFOrChPlF(() -> {
 float iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ = NCHDKIObmLaSEhyYXHxY_VkmcMHYkfmM.FYyrZdFTxQnwfKhkUNyMRpKACOlxEmfk() + NCHDKIObmLaSEhyYXHxY_VkmcMHYkfmM.UvGbsBNxQxHixxrgc_BDWIbKaGldKDbM() + (float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.y;
 return new ColoredRectBatch().rectSized((float)ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x, iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ, 80.0f, 2.0f, RectColors.horizontalGradient((RenderColor)RenderColor.TRANSLUCENT, (RenderColor)ItemUtils.PkGYXYgKAoQMqzMXfGszhEmlRBOwUdIe)).rectSized((float)(ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x + 80), iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ, 101.0f, 2.0f, RectColors.oneColor((RenderColor)ItemUtils.PkGYXYgKAoQMqzMXfGszhEmlRBOwUdIe)).rectSized((float)(ItemUtils.Lvu_PbUusFUzZSiOlvWPLmtEDSRldPwQ.x + 80 + 101), iOhPhkPTY_Iqauu_ZTSvkkOqHyiaPEQJ, 80.0f, 2.0f, RectColors.horizontalGradient((RenderColor)ItemUtils.PkGYXYgKAoQMqzMXfGszhEmlRBOwUdIe, (RenderColor)RenderColor.TRANSLUCENT));
 });
 this.l_VPKRRucSyQcLlCeeKMZfZmWdMISLYB = new TooltipRenderer(uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl -> this.dmpqqySgdKexWZMsVaTawsrpmbid_hHS.forEach(HrIIEZJBmKOSSylQJvjtfjsEthJcrfPn -> HrIIEZJBmKOSSylQJvjtfjsEthJcrfPn.hishFORgTzHaahtsoZztl_oDgaKgnObk((TooltipRenderer)uXTWKcgOulEvxrgXzbSMHKdmLASrZbwl)));
 this.hishFORgTzHaahtsoZztl_oDgaKgnObk();
 }
}

