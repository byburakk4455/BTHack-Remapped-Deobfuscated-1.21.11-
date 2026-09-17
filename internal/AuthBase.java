/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.NumberSetting;
import com.ferra13671.bthack.BooleanSetting;
import com.ferra13671.bthack.Module;
import java.util.List;

public abstract class AuthBase
extends Module {
 public final NumberSetting syAYfanaIftMATvkYjYVnuFNJzt_GYJf;
 public final BooleanSetting XvGRAbIJVpwFMPFqEDWGwBameOsRuCZY;
 private final List KihGYXYDdJxtK_EePe_wKeZnUwmIusdy;

 protected abstract List TEnMULCAqpUgeXJatgpkCPJaFZAlVtqF();

 public AuthBase() {
 this.syAYfanaIftMATvkYjYVnuFNJzt_GYJf = ((NumberSetting.builder().name("Delay")).defaultValue(Float.valueOf(3.0f))).min(Float.valueOf(0.0f)).max(Float.valueOf(10.0f)).build();
 this.XvGRAbIJVpwFMPFqEDWGwBameOsRuCZY = ((BooleanSetting.builder().name("Auto Disable")).defaultValue(false)).build();
 this.KihGYXYDdJxtK_EePe_wKeZnUwmIusdy = this.TEnMULCAqpUgeXJatgpkCPJaFZAlVtqF();
 }
}

