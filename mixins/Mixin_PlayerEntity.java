/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * com.mojang.authlib.GameProfile
 * net.minecraft.class_1657
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.Mutable
 * org.spongepowered.asm.mixin.gen.Accessor
 */
package com.ferra13671.bthack.mixins;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1657.class})
public interface Mixin_PlayerEntity {
 @Accessor(value="field_7507")
 @Mutable
 public void GtsLfiHcNwmjz_sUEeQONNXkRgrKfKgY(GameProfile var1);
}

