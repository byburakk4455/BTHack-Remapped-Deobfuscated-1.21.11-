/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import java.util.function.Function;

public enum WorldTimeMode {
 Day(atomnEVsFXUWQheC_MmuPazaNhrWWBfa -> 5000L),
 Night(atomnEVsFXUWQheC_MmuPazaNhrWWBfa -> 17000L),
 Morning(atomnEVsFXUWQheC_MmuPazaNhrWWBfa -> 0L),
 Sunset(atomnEVsFXUWQheC_MmuPazaNhrWWBfa -> 13000L),
 Custom(atomnEVsFXUWQheC_MmuPazaNhrWWBfa -> ((Float)atomnEVsFXUWQheC_MmuPazaNhrWWBfa.yTYhjkIMpbkLgJqzfpDcpZtJaeJVaKih.getValue()).longValue()),
 Spin(atomnEVsFXUWQheC_MmuPazaNhrWWBfa -> (long)((float)atomnEVsFXUWQheC_MmuPazaNhrWWBfa.qKaZnBubYiFhTFfAAmwcaxiIHmHwdzAr.HsYZloKKVeKExS_lqwrzJLkXHaDpAXHF() * ((Float)atomnEVsFXUWQheC_MmuPazaNhrWWBfa.rbfY_mMocsLbRKdSGHDPGDqSkTirzvwf.getValue()).floatValue() % 10000.0f / 10000.0f * 24000.0f));

 public final Function timeSupplier;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private WorldTimeMode() {
 void ekGjkBQkpzNfkEvsGzybDQbzXwRiXWyG;
 this.timeSupplier = ekGjkBQkpzNfkEvsGzybDQbzXwRiXWyG;
 }
}

