/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.ferra13671.ferraguard.annotations.KeepAllFieldsName
 * net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext
 * net.minecraft.class_1920
 * net.minecraft.class_2338
 * net.minecraft.class_2680
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Pseudo
 * org.spongepowered.asm.mixin.Shadow
 */
package com.ferra13671.bthack.mixins;

import com.ferra13671.ferraguard.annotations.KeepAllFieldsName;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;

@KeepAllFieldsName
@Pseudo
@Mixin(value={AbstractBlockRenderContext.class})
public class Mixin_AbstractBlockRenderContext {
 @Shadow
 protected class_2680 state;
 @Shadow
 protected class_1920 level;
 @Shadow
 protected class_2338 pos;
}

