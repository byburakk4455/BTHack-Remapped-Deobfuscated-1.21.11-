/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.Category;
import com.ferra13671.bthack.ModeSetting;
import com.ferra13671.bthack.EventListener;
import com.ferra13671.bthack.SoundData;
import com.ferra13671.bthack.IModule;
import com.ferra13671.bthack.KeybindMode;
import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.KeybindSetting;
import com.ferra13671.bthack.IMinecraft;
import com.ferra13671.bthack.SettingChangeEvent;
import com.ferra13671.bthack.ModuleConfig;
import com.ferra13671.bthack.Keybind;
import com.ferra13671.bthack.KeyAction;
import com.ferra13671.bthack.BThackClient;
import java.util.List;

public class Module
implements IModule,
IMinecraft {
 private final ModuleInfo UzTBtUWiSCvegp_jsBFBXFaYOndRsxYn;
 private final String name;
 private final Category parentCategory;
 private final String description;
 private List GHRKbCMsrpkJtwMoEKbgMpHpCXVIvaQV;
 private boolean SHswihxjNDIvKllWUsUNbJnoMXDuapMB;
 protected boolean VMfbQdljICDoBaGESRlXxsRWzUWOslwr;
 private KeyAction ShszYwevEvwexqFDofDGLizbdnxVqQlw;
 private SoundData qUlDSRCxlCiENDwDnOuNXFuqDEDrIdQM;
 private final KeybindSetting RIJXqqgPKNHtpzZGqKtKUNnkzkwvmIuJ;
 private final ModeSetting kKDdSOsmQAXBdBkoMlSaNdqvvCGRaykt;
 private ModuleConfig YLvUiYwAcQRtRAmWVVfGOaqPSnecGctj;

 public Module() {
 this.UzTBtUWiSCvegp_jsBFBXFaYOndRsxYn = this.getClass().getAnnotation(ModuleInfo.class);
 this.name = this.UzTBtUWiSCvegp_jsBFBXFaYOndRsxYn.name();
 this.parentCategory = BThackClient.getInstance().afcGnGcBNDATfrBcRisCLaKJhfNQgrRH().VsmxHZnlAUbNQaQVbCIoCtVbFMvncu_z(this.UzTBtUWiSCvegp_jsBFBXFaYOndRsxYn.category());
 this.description = this.name.toLowerCase().replace(" ", "-");
 this.GHRKbCMsrpkJtwMoEKbgMpHpCXVIvaQV = null;
 this.SHswihxjNDIvKllWUsUNbJnoMXDuapMB = this.UzTBtUWiSCvegp_jsBFBXFaYOndRsxYn.enabled();
 this.VMfbQdljICDoBaGESRlXxsRWzUWOslwr = this.UzTBtUWiSCvegp_jsBFBXFaYOndRsxYn.quitKeybindToggling();
 this.ShszYwevEvwexqFDofDGLizbdnxVqQlw = KeyAction.XmIPMPCgyORNHYAkKRCVVmyeVgF_oIIf;
 this.qUlDSRCxlCiENDwDnOuNXFuqDEDrIdQM = null;
 this.RIJXqqgPKNHtpzZGqKtKUNnkzkwvmIuJ = ((KeybindSetting.builder().name("Keybind")).defaultValue(this.ShszYwevEvwexqFDofDGLizbdnxVqQlw.JwHmTXmxaLBadBtUODjHyagmQNhhQzXr())).tooltip("module.keybind")).build();
 this.kKDdSOsmQAXBdBkoMlSaNdqvvCGRaykt = ((((ModeSetting.Builder)ModeSetting.builder(KeybindMode.class).name("Bind type")).defaultValue((Object)this.ShszYwevEvwexqFDofDGLizbdnxVqQlw._dZuCOsiYvzfIrGRLhWQVSzyIaJXSADq())).tooltip("module.keybind")).build();
 BThackClient.getInstance().JtuXqcavQcMYIxchmRYmYVeYuPnoLtXg().oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new EventListener(SettingChangeEvent.class, kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd -> {
 if (kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd.woLpUCYdMBldkDESbhoXUdllazvoAlxK == this.RIJXqqgPKNHtpzZGqKtKUNnkzkwvmIuJ) {
 this.RvW_XHRCwiLURGnQenTPNdMZfcTnEUKA(this.ShszYwevEvwexqFDofDGLizbdnxVqQlw.WwXtgpVrloPyavLnVDdKvaWSorOTxaIc((Keybind)this.RIJXqqgPKNHtpzZGqKtKUNnkzkwvmIuJ.getValue()));
 }
 if (kgJaBEulfTFELgWuzRUPSFhmUFyPpwLd.woLpUCYdMBldkDESbhoXUdllazvoAlxK == this.kKDdSOsmQAXBdBkoMlSaNdqvvCGRaykt) {
 this.RvW_XHRCwiLURGnQenTPNdMZfcTnEUKA(this.ShszYwevEvwexqFDofDGLizbdnxVqQlw.WbChvOAUPVjqgrbJSNOMCzIknOWAzH_l((((Object)this.kKDdSOsmQAXBdBkoMlSaNdqvvCGRaykt.getValue()))));
 }
 }));
 }
}

