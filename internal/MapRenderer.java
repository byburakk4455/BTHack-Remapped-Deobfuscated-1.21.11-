/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.buffer.framebuffer.Framebuffer
 * com.ferra13671.cometrenderer.minecraft.MinecraftFramebuffer
 * com.ferra13671.cometrenderer.minecraft.batch.IPrimitiveBatch
 * net.minecraft.class_276
 * net.minecraft.class_6367
 * net.minecraft.class_758
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.cometrenderer.buffer.framebuffer.Framebuffer;
import com.ferra13671.cometrenderer.minecraft.MinecraftFramebuffer;
import com.ferra13671.cometrenderer.minecraft.batch.IPrimitiveBatch;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_276;
import net.minecraft.class_6367;
import net.minecraft.class_758;

public class MapRenderer
implements IPrimitiveBatch,
IMinecraft {
 private static final class_758 ZjxpJusMEZDVrPftNCaoGeVBrbrFWbHi;
 public static final class_276 zehkyZdcDXYethMBOqcniFJZxqJdlTEB;
 public static final Framebuffer NDdFcgPbBYSCSRZJvyXInvkKHIkfxUlL;
 private final List BYNYALTIIpurjZTWugOuBpPlCDFh_tnm;
 private boolean XRlJvEVhlIMFLeUWsZzzCyVePhBwzEQa;

 static {
 ZjxpJusMEZDVrPftNCaoGeVBrbrFWbHi = new class_758();
 zehkyZdcDXYethMBOqcniFJZxqJdlTEB = new class_6367("A", 1, 1, true);
 NDdFcgPbBYSCSRZJvyXInvkKHIkfxUlL = new MinecraftFramebuffer(zehkyZdcDXYethMBOqcniFJZxqJdlTEB, new Color(255, 255, 255, 0), 0.0, 0);
 }

 public MapRenderer() {
 this.BYNYALTIIpurjZTWugOuBpPlCDFh_tnm = new ArrayList();
 this.XRlJvEVhlIMFLeUWsZzzCyVePhBwzEQa = false;
 }
}

