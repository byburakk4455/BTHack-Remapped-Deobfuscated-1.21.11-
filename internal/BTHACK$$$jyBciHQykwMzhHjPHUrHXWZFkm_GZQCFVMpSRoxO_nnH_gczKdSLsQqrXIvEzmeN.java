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
public @interface BTHACK$$$jyBciHQykwMzhHjPHUrHXWZFkm_GZQCFVMpSRoxO_nnH_gczKdSLsQqrXIvEzmeN {
 public boolean enabled() default false;

 public float y() default 10.0f;

 public float x() default 10.0f;

 public float height() default 0.0f;

 public String name();

 public float width() default 0.0f;
}

