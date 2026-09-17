/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.Easing;

public class Animation
implements Cloneable {
    private Easing easing;
    private int duration;
    private long startTime;

    public Animation(Easing easing, int duration) {
        this.easing = easing;
        this.duration = duration;
        this.startTime = System.currentTimeMillis();
    }
}
