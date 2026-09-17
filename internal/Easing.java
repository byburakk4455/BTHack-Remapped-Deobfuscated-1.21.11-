/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

public enum Easing {
 LINEAR{}
 ,
 SINE_IN{}
 ,
 SINE_OUT{}
 ,
 SINE_IN_OUT{}
 ,
 QUAD_IN{}
 ,
 QUAD_OUT{}
 ,
 QUAD_IN_OUT{}
 ,
 CUBIC_IN{}
 ,
 CUBIC_OUT{}
 ,
 CUBIC_IN_OUT{}
 ,
 QUART_IN{}
 ,
 QUART_OUT{}
 ,
 QUART_IN_OUT{}
 ,
 QUINT_IN{}
 ,
 QUINT_OUT{}
 ,
 QUINT_IN_OUT{}
 ,
 CIRC_IN{}
 ,
 CIRC_OUT{}
 ,
 CIRC_IN_OUT{}
 ,
 EXPO_IN{}
 ,
 EXPO_OUT{}
 ,
 EXPO_IN_OUT{}
 ,
 ELASTIC_IN{}
 ,
 ELASTIC_OUT{}
 ,
 ELASTIC_IN_OUT{}
 ,
 BACK_IN{}
 ,
 BACK_OUT{}
 ,
 BACK_IN_OUT{}
 ,
 BOUNCE_IN{}
 ,
 BOUNCE_OUT{}
 ,
 BOUNCE_IN_OUT{};


 /*
 * WARNING - Possible parameter corruption
 * WARNING - void declaration
 */
 private Easing() {
 }

 private static float bounceOut(float ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA) {
 float yJIgrHNYKylvkzDuRAjwdFpVCeZxBpiN = 7.5625f;
 float NUHPbhDouqffUfFkYMDgOYGrnnAJQYZb = 2.75f;
 if (ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA < 1.0f / NUHPbhDouqffUfFkYMDgOYGrnnAJQYZb) {
 return yJIgrHNYKylvkzDuRAjwdFpVCeZxBpiN * ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA * ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA;
 }
 if (ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA < 2.0f / NUHPbhDouqffUfFkYMDgOYGrnnAJQYZb) {
 return yJIgrHNYKylvkzDuRAjwdFpVCeZxBpiN * (ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA -= 1.5f / NUHPbhDouqffUfFkYMDgOYGrnnAJQYZb) * ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA + 0.75f;
 }
 if ((double)ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA < 2.5 / (double)NUHPbhDouqffUfFkYMDgOYGrnnAJQYZb) {
 return yJIgrHNYKylvkzDuRAjwdFpVCeZxBpiN * (ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA -= 2.25f / NUHPbhDouqffUfFkYMDgOYGrnnAJQYZb) * ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA + 0.9375f;
 }
 return yJIgrHNYKylvkzDuRAjwdFpVCeZxBpiN * (ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA -= 2.625f / NUHPbhDouqffUfFkYMDgOYGrnnAJQYZb) * ONLtcY_XBgNvRXhcKYeZFbujGHLsVVcA + 0.984375f;
 }

 public abstract float ease(float var1);
}

