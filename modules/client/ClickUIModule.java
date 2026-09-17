/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.ModuleInfo;
import com.ferra13671.bthack.InputDevice;
import com.ferra13671.bthack.Module;
import com.ferra13671.bthack.Keybind;

@ModuleInfo(name="Click UI", category="client", quitKeybindToggling=true)
public class ClickUIModule
extends Module {
 public boolean isOpen;

 public ClickUIModule() {
 this.isOpen = false;
 this.getKeybind().setKeybind(new Keybind(344, InputDevice.Keyboard));
 }
}

