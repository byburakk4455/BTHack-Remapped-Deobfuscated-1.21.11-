/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 * net.minecraft.class_1282
 * net.minecraft.class_1309
 * org.spongepowered.asm.mixin.Mixin
 * org.spongepowered.asm.mixin.gen.Accessor
 * org.spongepowered.asm.mixin.gen.Invoker
 */
package com.ferra13671.bthack.mixins;

import net.minecraft.class_1282;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_1309.class})
public interface Mixin_LivingEntity {
 @Invoker(value="method_6095")
 public boolean jSGfgpQgyLeVHzXIOPBhOyjMCEcapKSi(class_1282 var1);

 @Accessor(value="field_6228")
 public void naOyKbJA_UJdQbNKEQwZlMLQdfgFBXTU(int var1);

 @Accessor(value="field_6228")
 public int ROIQGnTqcgOIJvdHazUTIlivnsztYOoL();
}

