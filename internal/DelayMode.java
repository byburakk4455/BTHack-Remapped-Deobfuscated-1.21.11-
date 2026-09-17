/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.IMinecraft;
import java.util.function.Function;

public enum DelayMode implements IMinecraft
{
 Cooldown(sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ -> Float.valueOf(DelayMode.mc.field_1724.method_7261((Boolean)sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ.kGqwBRbUNEkmjACLADEzmscOdQPGQHRx.getValue() != false ? 1.0f : 0.0f))),
 Timer(sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ -> Float.valueOf((float)sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ.oUWGlxPrLoZYZFugMYOwDOSmHapCqpBy.HsYZloKKVeKExS_lqwrzJLkXHaDpAXHF() / (((Float)sxMtWNoAqzUjJLUvjObedNnPdEjrbfqZ.wFDhbWqCvgpjmYQhMMKVjFzlQDUNKoHq.getValue()).floatValue() * 1000.0f)));

 public final Function delayFunction;

 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private DelayMode() {
 void IrRIQoxGXFooAtPvOVEEWGfSguKohIFx;
 this.delayFunction = IrRIQoxGXFooAtPvOVEEWGfSguKohIFx;
 }
}

