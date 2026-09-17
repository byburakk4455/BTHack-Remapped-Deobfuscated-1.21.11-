/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.minecraft.CustomVertexFormats
 * com.ferra13671.cometrenderer.minecraft.batch.AbstractPrimitiveBatch
 * com.ferra13671.cometrenderer.vertex.DrawMode
 * com.ferra13671.cometrenderer.vertex.format.VertexFormat
 * com.ferra13671.cometrenderer.vertex.mesh.Mesh
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.cometrenderer.minecraft.CustomVertexFormats;
import com.ferra13671.cometrenderer.minecraft.batch.AbstractPrimitiveBatch;
import com.ferra13671.cometrenderer.vertex.DrawMode;
import com.ferra13671.cometrenderer.vertex.format.VertexFormat;
import com.ferra13671.cometrenderer.vertex.mesh.Mesh;

public class BTHACK$$$vOQOIybHLNAbRryfRCGAthoeaXKdDatPfCFocClu_VuOrrwpXRxIJPyxRmRqNNWM
extends AbstractPrimitiveBatch
implements IMinecraft {
 public BTHACK$$$vOQOIybHLNAbRryfRCGAthoeaXKdDatPfCFocClu_VuOrrwpXRxIJPyxRmRqNNWM(Runnable qUIMoZMMGXlIinpBbIqJcmMfqyxCleVi) {
 this();
 this.preDrawRunnable = qUIMoZMMGXlIinpBbIqJcmMfqyxCleVi;
 }

 public BTHACK$$$vOQOIybHLNAbRryfRCGAthoeaXKdDatPfCFocClu_VuOrrwpXRxIJPyxRmRqNNWM() {
 super(Mesh.builder((DrawMode)DrawMode.QUADS, (VertexFormat)CustomVertexFormats.ROUNDED_RECT));
 }
}

