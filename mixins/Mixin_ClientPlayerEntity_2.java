/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_746
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.gen.Invoker
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_746.class})
public interface Mixin_ClientPlayerEntity_2 {
 @Invoker(value="method_75409")
 public boolean JPByjktFZOZSQrdVWCzPkljyRqJgxjFN();
}

