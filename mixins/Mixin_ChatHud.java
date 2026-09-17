/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_338
 * org.spongepowered.asm.mixin.Final
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import com.ferra13671.bthack.IChatHud;
import java.util.List;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_338.class})
public class Mixin_ChatHud
implements IChatHud {
 @Shadow
 @Final
 private List field_2064;
}

