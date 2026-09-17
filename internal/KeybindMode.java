/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import java.util.function.Function;

public enum KeybindMode {
 Toggle(btCMqnHmHjrLJxrnRgVOp_IUkiLFdcTx -> btCMqnHmHjrLJxrnRgVOp_IUkiLFdcTx == false, false, false),
 Hold(btCMqnHmHjrLJxrnRgVOp_IUkiLFdcTx -> true, true, false),
 HoldReversed(btCMqnHmHjrLJxrnRgVOp_IUkiLFdcTx -> false, true, true);

 public final Function pressStateFunction;
 public final boolean useRelease;
 public final boolean releaseState;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private KeybindMode(boolean WdJOkVRIjgAhuQwQdKMLahQFKtCPhIIi) {
 void OrwtdVmrxPhIztcsvvfHafgvuWYolRln;
 void ktPOuAvnHdnOoMdQdmBFUzgKOIwAIvGk;
 this.pressStateFunction = (Function)WdJOkVRIjgAhuQwQdKMLahQFKtCPhIIi;
 this.useRelease = ktPOuAvnHdnOoMdQdmBFUzgKOIwAIvGk;
 this.releaseState = OrwtdVmrxPhIztcsvvfHafgvuWYolRln;
 }
}

