/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.batch.AbstractPrimitiveBatch
 * com.ferra13671.cometrenderer.vertex.DrawMode
 * com.ferra13671.cometrenderer.vertex.format.VertexFormat
 * com.ferra13671.cometrenderer.vertex.mesh.Mesh
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$UUVBuFHvNoEwdnR_IsiLHtZctzvdPecvtJAZemopOfBfa_KtHHMfkYWhkgmvmAqS;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.cometrenderer.minecraft.batch.AbstractPrimitiveBatch;
import com.ferra13671.cometrenderer.vertex.DrawMode;
import com.ferra13671.cometrenderer.vertex.format.VertexFormat;
import com.ferra13671.cometrenderer.vertex.mesh.Mesh;

public class TooltipUtils
extends AbstractPrimitiveBatch
implements IMinecraft {
 public TooltipUtils(Runnable qUIMoZMMGXlIinpBbIqJcmMfqyxCleVi) {
 this();
 this.preDrawRunnable = qUIMoZMMGXlIinpBbIqJcmMfqyxCleVi;
 }

 public TooltipUtils() {
 super(Mesh.builder((DrawMode)DrawMode.QUADS, (VertexFormat)BTHACK$$$UUVBuFHvNoEwdnR_IsiLHtZctzvdPecvtJAZemopOfBfa_KtHHMfkYWhkgmvmAqS.uRayogSEcNsJXEDpKLHkz_zPZpZAtNkj));
 }
}

