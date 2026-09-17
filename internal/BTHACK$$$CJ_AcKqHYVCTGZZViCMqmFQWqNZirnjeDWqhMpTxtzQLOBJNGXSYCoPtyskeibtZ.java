/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * org.apache.commons.codec.binary.Base32
 */
package com.ferra13671.bthack;

import org.apache.commons.codec.binary.Base32;

public class BTHACK$$$CJ_AcKqHYVCTGZZViCMqmFQWqNZirnjeDWqhMpTxtzQLOBJNGXSYCoPtyskeibtZ {
 public final byte[] value;
 public final String ttXORnoOSHZlKCNmypVKShTrzxWpFPsW;

 public static BTHACK$$$CJ_AcKqHYVCTGZZViCMqmFQWqNZirnjeDWqhMpTxtzQLOBJNGXSYCoPtyskeibtZ _VSJygubYOwOsIRXZnKGEGDVNizyvuHj(String qvskhUzpAOnhxoWvaBdUtmiEyyzIZPmS) {
 return new BTHACK$$$CJ_AcKqHYVCTGZZViCMqmFQWqNZirnjeDWqhMpTxtzQLOBJNGXSYCoPtyskeibtZ(new Base32().decode(qvskhUzpAOnhxoWvaBdUtmiEyyzIZPmS));
 }

 public BTHACK$$$CJ_AcKqHYVCTGZZViCMqmFQWqNZirnjeDWqhMpTxtzQLOBJNGXSYCoPtyskeibtZ(byte[] qvskhUzpAOnhxoWvaBdUtmiEyyzIZPmS) {
 this.value = qvskhUzpAOnhxoWvaBdUtmiEyyzIZPmS;
 this.ttXORnoOSHZlKCNmypVKShTrzxWpFPsW = new Base32().encodeToString(qvskhUzpAOnhxoWvaBdUtmiEyyzIZPmS);
 }
}

