/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$Oy_ePIqlcJKHygzmohD_KDhSwlFvgzTgMmJTAfxSzDuLivPiUxc_vIpVfouLVQHo;
import com.ferra13671.bthack.BTHACK$$$WMrIKpFP_pyWyvVTbdABMTipbVAHIpd_QaTiptNMTsMjywIsfdQbwsUyYHkLbmlK;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.function.Consumer;

public abstract class BTHACK$$$hjvVqLAGswpJTBwMYwPHAnVgytxgmoxxEhxmjHRhkeKpCjIjBaSfGKztcSsKlhoM {
 private static final String[] WufbhSLfGgsdJjUddGcMboLUXAbUWoFs;
 protected final Consumer vkboEbKpcuPfabydSLpirEk_FXzTkEHZ;

 public static BTHACK$$$hjvVqLAGswpJTBwMYwPHAnVgytxgmoxxEhxmjHRhkeKpCjIjBaSfGKztcSsKlhoM SdiZyaIvKYojGk_SfwCmDzGtUcwleETi(Consumer SvJQspgUzxICnUfNUDcYNSiFTiFPPGPE) {
 String oZpRkCiNirPbJxdpMf_DptyCCIncYWUZ = System.getProperty("os.name").toLowerCase();
 if (oZpRkCiNirPbJxdpMf_DptyCCIncYWUZ.contains("win")) {
 for (int HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO = 0; HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO < 10; ++HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO) {
 try {
 return new BTHACK$$$WMrIKpFP_pyWyvVTbdABMTipbVAHIpd_QaTiptNMTsMjywIsfdQbwsUyYHkLbmlK("\\\\.\\pipe\\discord-ipc-" + HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO, SvJQspgUzxICnUfNUDcYNSiFTiFPPGPE);
 }
 catch (Exception qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ) {
 qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ.printStackTrace();
 continue;
 }
 }
 } else {
 String QRRZugwPMklIUSORbaqKCRfsggXpfbMv;
 Object bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae = null;
 String[] qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ = WufbhSLfGgsdJjUddGcMboLUXAbUWoFs;
 int n = qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ.length;
 for (int i = 0; i < n && (bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae = System.getenv(QRRZugwPMklIUSORbaqKCRfsggXpfbMv = qqNSJGEtoGIeRwwGLsfywvIafQGPEDEZ[i])) == null; ++i) {
 }
 if (bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae == null) {
 bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae = "/tmp";
 }
 bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae = (String)bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae + "/discord-ipc-";
 for (int HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO = 0; HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO < 10; ++HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO) {
 try {
 return new BTHACK$$$Oy_ePIqlcJKHygzmohD_KDhSwlFvgzTgMmJTAfxSzDuLivPiUxc_vIpVfouLVQHo((String)bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae + HxUGRSSYV_lTWnZdGwwUZLKiClOCRdRO, SvJQspgUzxICnUfNUDcYNSiFTiFPPGPE);
 }
 catch (IOException iOException) {
 continue;
 }
 }
 }
 return null;
 }

 public abstract void VRoP_NYRzgDZnF_MOYPLTKpHFVsAnliu();

 static {
 WufbhSLfGgsdJjUddGcMboLUXAbUWoFs = new String[]{"XDG_RUNTIME_DIR", "TMPDIR", "TMP", "TEMP"};
 }

 protected abstract void nFuCdjkhoQPHtWpuQSzkGyAaBhSXWoSU(ByteBuffer var1);

 public BTHACK$$$hjvVqLAGswpJTBwMYwPHAnVgytxgmoxxEhxmjHRhkeKpCjIjBaSfGKztcSsKlhoM(Consumer vksIChpXxRIwrsgaoNyluClYNqxbSOyd) {
 this.vkboEbKpcuPfabydSLpirEk_FXzTkEHZ = vksIChpXxRIwrsgaoNyluClYNqxbSOyd;
 }
}

