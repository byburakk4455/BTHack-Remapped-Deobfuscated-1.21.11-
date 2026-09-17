/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.cometrenderer.buffer.framebuffer.Framebuffer
 * com.ferra13671.cometrenderer.minecraft.batch.AbstractPrimitiveBatch
 * com.ferra13671.cometrenderer.vertex.DrawMode
 * com.ferra13671.cometrenderer.vertex.format.VertexFormat
 * com.ferra13671.cometrenderer.vertex.mesh.Mesh
 */
package com.ferra13671.bthack;

import com.ferra13671.cometrenderer.buffer.framebuffer.Framebuffer;
import com.ferra13671.cometrenderer.minecraft.batch.AbstractPrimitiveBatch;
import com.ferra13671.cometrenderer.vertex.DrawMode;
import com.ferra13671.cometrenderer.vertex.format.VertexFormat;
import com.ferra13671.cometrenderer.vertex.mesh.Mesh;

public class BTHACK$$$RNyFbvzUxhOiHCcJYHQJCnJYOZzMkQTrhQAfGCFlDQqLsAQOxfuneoLMiOsbmgNW
extends AbstractPrimitiveBatch {
 private final Framebuffer NDdFcgPbBYSCSRZJvyXInvkKHIkfxUlL;
 private final boolean fFECmfjiGrPkLUaXNkQRUGLChOvUwZnp;

 public BTHACK$$$RNyFbvzUxhOiHCcJYHQJCnJYOZzMkQTrhQAfGCFlDQqLsAQOxfuneoLMiOsbmgNW(Framebuffer xwPbmEAxIiCOK_CRXSAWDmiFlipSKnNz, boolean ncvwasbrDOFAtKgHgSLiGEzIScghvGEG, Runnable qUIMoZMMGXlIinpBbIqJcmMfqyxCleVi) {
 this(xwPbmEAxIiCOK_CRXSAWDmiFlipSKnNz, ncvwasbrDOFAtKgHgSLiGEzIScghvGEG);
 this.preDrawRunnable = qUIMoZMMGXlIinpBbIqJcmMfqyxCleVi;
 }

 public BTHACK$$$RNyFbvzUxhOiHCcJYHQJCnJYOZzMkQTrhQAfGCFlDQqLsAQOxfuneoLMiOsbmgNW(Framebuffer xwPbmEAxIiCOK_CRXSAWDmiFlipSKnNz, boolean ncvwasbrDOFAtKgHgSLiGEzIScghvGEG) {
 super(Mesh.builder((DrawMode)DrawMode.QUADS, (VertexFormat)VertexFormat.POSITION));
 this.NDdFcgPbBYSCSRZJvyXInvkKHIkfxUlL = xwPbmEAxIiCOK_CRXSAWDmiFlipSKnNz;
 this.fFECmfjiGrPkLUaXNkQRUGLChOvUwZnp = ncvwasbrDOFAtKgHgSLiGEzIScghvGEG;
 }
}

