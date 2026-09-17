/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_124
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.ChatUtils;
import com.ferra13671.bthack.CommandAction;
import com.ferra13671.bthack.LiteralArgument;
import com.ferra13671.bthack.ICommand;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.CommandInfo;
import net.minecraft.class_124;

public abstract class Command
implements ICommand,
IMinecraft {
 private final String[] qhcQzTEZJcUuoiFjnwUUIsj_EyOdcnzD;

 public static void YvdDohTqWnZhCMAjKBJGKxnmLmFWDCTr(String DioNuNMrVKRCuKULYuoHtObuybJNYLuf) {
 ChatUtils._VMWacPmcJpdxLufPgNXyFKgtJIcvNyl(DioNuNMrVKRCuKULYuoHtObuybJNYLuf);
 }

 public static LiteralArgument ZNOLjCSQupWLipmDhdEbUdHASUuDNJjF(String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae) {
 return new LiteralArgument(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae);
 }

    public static LiteralArgument nlxzlAmWgYeHidIHZKsw_qy_ZsBiTGQc(String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, CommandAction LUNLUleagtWflXTeBUHhnbRmtlizdYNy) {
        return new LiteralArgument(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, LUNLUleagtWflXTeBUHhnbRmtlizdYNy);
    }

 public Command() {
 this.qhcQzTEZJcUuoiFjnwUUIsj_EyOdcnzD = this.getClass().getAnnotation(CommandInfo.class).aliases();
 }

 public static void QKZPbukbMJAD_UVoVorOhSPoJKaMeZzt(String DioNuNMrVKRCuKULYuoHtObuybJNYLuf) {
 Command.YvdDohTqWnZhCMAjKBJGKxnmLmFWDCTr(String.valueOf(class_124.field_1061) + DioNuNMrVKRCuKULYuoHtObuybJNYLuf);
 }
}

