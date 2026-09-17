/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.google.gson.Gson
 * com.google.gson.GsonBuilder
 */
package com.ferra13671.bthack;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Optional;

public abstract class BTHACK$$$HdonbHMGoMYOmzdlrWLgSvjaJcakCdOriekZNYVEJogNfwxprocACTqQfBLRFmdT {
 public static final Gson EOKclrtbsnNGAkiQkD_hRfEVkh_jScAb;
 protected Optional UwAXXNhgXHMVSdSWvIFvyDztNgtX_rRt;

 public BTHACK$$$HdonbHMGoMYOmzdlrWLgSvjaJcakCdOriekZNYVEJogNfwxprocACTqQfBLRFmdT(Path uIeKrXcdnjqSDiF_FBrBsa_tESvZgiCa) {
 this.UwAXXNhgXHMVSdSWvIFvyDztNgtX_rRt = Optional.empty();
 this.UwAXXNhgXHMVSdSWvIFvyDztNgtX_rRt = Optional.ofNullable(uIeKrXcdnjqSDiF_FBrBsa_tESvZgiCa);
 }

 static {
 EOKclrtbsnNGAkiQkD_hRfEVkh_jScAb = new GsonBuilder().setPrettyPrinting().create();
 }

 public BTHACK$$$HdonbHMGoMYOmzdlrWLgSvjaJcakCdOriekZNYVEJogNfwxprocACTqQfBLRFmdT() {
 this.UwAXXNhgXHMVSdSWvIFvyDztNgtX_rRt = Optional.empty();
 }

 public abstract void setValue(InputStream var1);

 public abstract void toJson(OutputStream var1);
}

