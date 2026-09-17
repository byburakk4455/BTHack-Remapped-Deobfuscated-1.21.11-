/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.BTHACK$$$hjvVqLAGswpJTBwMYwPHAnVgytxgmoxxEhxmjHRhkeKpCjIjBaSfGKztcSsKlhoM;
import java.io.IOException;
import java.net.UnixDomainSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.function.Consumer;

public class BTHACK$$$Oy_ePIqlcJKHygzmohD_KDhSwlFvgzTgMmJTAfxSzDuLivPiUxc_vIpVfouLVQHo
extends BTHACK$$$hjvVqLAGswpJTBwMYwPHAnVgytxgmoxxEhxmjHRhkeKpCjIjBaSfGKztcSsKlhoM {
 private final Selector NoUt_ynSPIpGbgIcmBgYDEROLqNSCHhE;
 private final SocketChannel AYJIaN_hLMwqyLUAxxykDvxPtbAhwpCZ;

 public BTHACK$$$Oy_ePIqlcJKHygzmohD_KDhSwlFvgzTgMmJTAfxSzDuLivPiUxc_vIpVfouLVQHo(String bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae, Consumer SvJQspgUzxICnUfNUDcYNSiFTiFPPGPE) throws IOException {
 super(SvJQspgUzxICnUfNUDcYNSiFTiFPPGPE);
 this.NoUt_ynSPIpGbgIcmBgYDEROLqNSCHhE = Selector.open();
 this.AYJIaN_hLMwqyLUAxxykDvxPtbAhwpCZ = SocketChannel.open(UnixDomainSocketAddress.of(bONwBEsAdnaSNe_TKTZJpIfyD_wCrYae));
 this.AYJIaN_hLMwqyLUAxxykDvxPtbAhwpCZ.configureBlocking(false);
 this.AYJIaN_hLMwqyLUAxxykDvxPtbAhwpCZ.register(this.NoUt_ynSPIpGbgIcmBgYDEROLqNSCHhE, 1);
 Thread wJHwGOsqnQDGMHiywqIOBouE_VxFujgO = new Thread(this::naNlKcDXaByXPtlpOGuLxqvOgwMPuBMh);
 wJHwGOsqnQDGMHiywqIOBouE_VxFujgO.setName("Discord IPC - Read thread");
 wJHwGOsqnQDGMHiywqIOBouE_VxFujgO.start();
 }
}

