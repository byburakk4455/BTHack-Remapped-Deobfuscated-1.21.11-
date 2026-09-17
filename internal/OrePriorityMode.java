/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1893
 * net.minecraft.class_5321
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$exkk_pjrIUGTxdaEbXjCMojLasEDMZGEKVVBdkeNTDOdBKDvdugBvEUbpZVjBopZ;
import net.minecraft.class_1893;
import net.minecraft.class_5321;

public enum OrePriorityMode {
 None(null),
 Fortune(class_1893.field_9130),
 SilkTouch(class_1893.field_9099);

 public final class_5321 enchantment;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private OrePriorityMode() {
 void olBpkkiDMOpdhSlqkyndnnvflqLnVTRI;
 this.enchantment = olBpkkiDMOpdhSlqkyndnnvflqLnVTRI;
 }

 public double getExtraPriority(BTHACK$$$exkk_pjrIUGTxdaEbXjCMojLasEDMZGEKVVBdkeNTDOdBKDvdugBvEUbpZVjBopZ DvJGruMDviksxazkwfJKoGWVjPQeKFPJ) {
 if (this.enchantment == null) {
 return 0.0;
 }
 return DvJGruMDviksxazkwfJKoGWVjPQeKFPJ.VfARWCmaoIrkIitwOfK_TSEufOWOxmst(this.enchantment) ? (double)(10000 * DvJGruMDviksxazkwfJKoGWVjPQeKFPJ.eJHqTd_VHSASFyqrbSzfriXtmZnkzTn_(this.enchantment)) : 0.0;
 }
}

