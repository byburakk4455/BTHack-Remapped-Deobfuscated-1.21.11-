/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * lombok.NonNull
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.CommandAction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import lombok.NonNull;

public class LiteralArgument {
 @NonNull
 private final String name;
 private final CommandAction xTEFxVUKgMthcyjEgUIEESmuMazYLdcK;
 private final List eAqzrClLJoMFSHSRRiTKFRGkSW_JwWqm;
 private Consumer yyePUKTRvAhQibWUzvmwuQDaIzd_AuRB;

 public LiteralArgument(@NonNull String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae) {
 this(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, null);
 if (bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae == null) {
 throw new NullPointerException("name is marked non-null but is null");
 }
 }

 public LiteralArgument(@NonNull String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, CommandAction LUNLUleagtWflXTeBUHhnbRmtlizdYNy) {
 this.eAqzrClLJoMFSHSRRiTKFRGkSW_JwWqm = new ArrayList();
 this.yyePUKTRvAhQibWUzvmwuQDaIzd_AuRB = null;
 if (bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae == null) {
 throw new NullPointerException("name is marked non-null but is null");
 }
 this.name = bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae;
 this.xTEFxVUKgMthcyjEgUIEESmuMazYLdcK = LUNLUleagtWflXTeBUHhnbRmtlizdYNy;
 }
}

