/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface ModuleInfo {
 public String category();

 public String name();

 public boolean enabled() default false;

 public boolean quitKeybindToggling() default false;
}

