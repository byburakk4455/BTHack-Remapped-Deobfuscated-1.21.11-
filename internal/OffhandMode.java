/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import java.util.function.BiConsumer;

public enum OffhandMode {
 Ignore(false, (mdAiKKiTeoMBYGpEgKoHLtIBgCWENfcN, cykdSytonMCtRWgowJMAIBuiMjmcfPBo) -> {}),
 ReplaceFirst(true, (biPCJJnrdcbmIdoskAIZilsnxasFSbNH, ZAWiyLwdrNMdRLqnxJYeRnKSVFazhPJM) -> biPCJJnrdcbmIdoskAIZilsnxasFSbNH.set(0, ZAWiyLwdrNMdRLqnxJYeRnKSVFazhPJM)),
 ReplaceLast(true, (biPCJJnrdcbmIdoskAIZilsnxasFSbNH, ZAWiyLwdrNMdRLqnxJYeRnKSVFazhPJM) -> biPCJJnrdcbmIdoskAIZilsnxasFSbNH.set(biPCJJnrdcbmIdoskAIZilsnxasFSbNH.size() - 1, ZAWiyLwdrNMdRLqnxJYeRnKSVFazhPJM));

 public final boolean modify;
 public final BiConsumer onModifyConsumer;

 /*
 * WARNING - void declaration
 */
 private OffhandMode() {
 void YxbtxhUFQSpcwtLyHrLUJFghRkICExVV;
 void SjTjqSgXTOwpxpwGWZHmKSKuOPxTGbvc;
 this.modify = SjTjqSgXTOwpxpwGWZHmKSKuOPxTGbvc;
 this.onModifyConsumer = YxbtxhUFQSpcwtLyHrLUJFghRkICExVV;
 }
}

