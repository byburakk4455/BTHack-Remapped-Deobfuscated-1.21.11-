/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.FreeCameraModule;
import com.ferra13671.bthack.ClickUIModule;
import com.ferra13671.bthack.FastUseModule;
import com.ferra13671.bthack.XCarryModule;
import com.ferra13671.bthack.IModule;
import com.ferra13671.bthack.AutoSignModule;
import com.ferra13671.bthack.XrayModule;
import com.ferra13671.bthack.FreezeModule;
import com.ferra13671.bthack.BlockOutlineModule;
import com.ferra13671.bthack.AutoAuthModule;
import com.ferra13671.bthack.GuiMoveModule;
import com.ferra13671.bthack.AmbienceModule;
import com.ferra13671.bthack.TimerModule;
import com.ferra13671.bthack.BTHACK$$$Y_MMpMgdgZtdAoMfAxVsoJmUUVJqvLpvKCHBXhvhzNxVz_ddZLubBXWWxTpxGBnF;
import com.ferra13671.bthack.JumpDelayModule;
import com.ferra13671.bthack.ElytraSwapModule;
import com.ferra13671.bthack.AuraModule;
import com.ferra13671.bthack.AutoOffhandModule;
import com.ferra13671.bthack.NoRenderModule;
import com.ferra13671.bthack.NametagsModule;
import com.ferra13671.bthack.InventoryTweaksModule;
import com.ferra13671.bthack.ZoomModule;
import com.ferra13671.bthack.AutoSprintModule;
import com.ferra13671.bthack.BlinkModule;
import com.ferra13671.bthack.MultiTaskModule;
import com.ferra13671.bthack.NoFriendDamageModule;
import com.ferra13671.bthack.TracersModule;
import com.ferra13671.bthack.ArrowsModule;
import com.ferra13671.bthack.ElytraRecastModule;
import com.ferra13671.bthack.HandViewModule;
import com.ferra13671.bthack.TooltipsModule;
import com.ferra13671.bthack.FullBrightModule;
import com.ferra13671.bthack.ContainerESPModule;
import com.ferra13671.bthack.PlayerESPModule;
import com.ferra13671.bthack.AutoArmorModule;
import com.ferra13671.bthack.ElytraBoostModule;
import com.ferra13671.bthack.BreadcrumbsModule;
import com.ferra13671.bthack.SafeWalkModule;
import com.ferra13671.bthack.AutoSaveModule;
import com.ferra13671.bthack.Auto2FAModule;
import java.util.ArrayList;
import java.util.List;

public final class ModuleManager {
 private static final List modules;
 public static final ClickUIModule clickUI;
 public static final AutoSaveModule autoSave;
 public static final AuraModule aura;
 public static final AutoArmorModule autoArmor;
 public static final AutoOffhandModule autoOffhand;
 public static final NoFriendDamageModule noFriendDamage;
 public static final Auto2FAModule auto2FA;
 public static final AutoAuthModule autoAuth;
 public static final AutoSignModule autoSign;
 public static final ElytraSwapModule elytraSwap;
 public static final FastUseModule fastUse;
 public static final FreeCameraModule freeCamera;
 public static final InventoryTweaksModule inventoryTweaks;
 public static final MultiTaskModule multiTask;
 public static final XCarryModule xCarry;
 public static final AutoSprintModule autoSprint;
 public static final BlinkModule blink;
 public static final ElytraBoostModule elytraBoost;
 public static final ElytraRecastModule elytraRecast;
 public static final FreezeModule freeze;
 public static final GuiMoveModule guiMove;
 public static final JumpDelayModule jumpDelay;
 public static final SafeWalkModule safeWalk;
 public static final TimerModule timer;
 public static final AmbienceModule ambience;
 public static final ArrowsModule arrows;
 public static final BlockOutlineModule blockOutline;
 public static final BreadcrumbsModule breadcrumbs;
 public static final ContainerESPModule containerESP;
 public static final FullBrightModule fullBright;
 public static final HandViewModule handView;
 public static final NametagsModule nametags;
 public static final NoRenderModule noRender;
 public static final PlayerESPModule playerESP;
 public static final TooltipsModule tooltips;
 public static final TracersModule tracers;
 public static final XrayModule xray;
 public static final ZoomModule zoom;

 public static List HfOFnIzSWQVySBTmgtukVVRoJ_nNMbJ_() {
 return modules;
 }

 private ModuleManager() {
 throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
 }

 static {
 modules = new ArrayList();
 clickUI = (ClickUIModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new ClickUIModule());
 autoSave = (AutoSaveModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AutoSaveModule());
 aura = (AuraModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AuraModule());
 autoArmor = (AutoArmorModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AutoArmorModule());
 autoOffhand = (AutoOffhandModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AutoOffhandModule());
 noFriendDamage = (NoFriendDamageModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new NoFriendDamageModule());
 auto2FA = (Auto2FAModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new Auto2FAModule());
 autoAuth = (AutoAuthModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AutoAuthModule());
 autoSign = (AutoSignModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AutoSignModule());
 elytraSwap = (ElytraSwapModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new ElytraSwapModule());
 fastUse = (FastUseModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new FastUseModule());
 freeCamera = (FreeCameraModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new FreeCameraModule());
 inventoryTweaks = (InventoryTweaksModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new InventoryTweaksModule());
 multiTask = (MultiTaskModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new MultiTaskModule());
 xCarry = (XCarryModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new XCarryModule());
 autoSprint = (AutoSprintModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AutoSprintModule());
 blink = (BlinkModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new BlinkModule());
 elytraBoost = (ElytraBoostModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new ElytraBoostModule());
 elytraRecast = (ElytraRecastModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new ElytraRecastModule());
 freeze = (FreezeModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new FreezeModule());
 guiMove = (GuiMoveModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new GuiMoveModule());
 jumpDelay = (JumpDelayModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new JumpDelayModule());
 safeWalk = (SafeWalkModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new SafeWalkModule());
 timer = (TimerModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new TimerModule());
 ambience = (AmbienceModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new AmbienceModule());
 arrows = (ArrowsModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new ArrowsModule());
 blockOutline = (BlockOutlineModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new BlockOutlineModule());
 breadcrumbs = (BreadcrumbsModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new BreadcrumbsModule());
 containerESP = (ContainerESPModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new ContainerESPModule());
 fullBright = (FullBrightModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new FullBrightModule());
 handView = (HandViewModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new HandViewModule());
 nametags = (NametagsModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new NametagsModule());
 noRender = (NoRenderModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new NoRenderModule());
 playerESP = (PlayerESPModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new PlayerESPModule());
 tooltips = (TooltipsModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new TooltipsModule());
 tracers = (TracersModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new TracersModule());
 xray = (XrayModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new XrayModule());
 zoom = (ZoomModule)ModuleManager.oToQpNYpLObIsQTuDatjrbRcixmHRAN_(new ZoomModule());
 modules.forEach(BTHACK$$$Y_MMpMgdgZtdAoMfAxVsoJmUUVJqvLpvKCHBXhvhzNxVz_ddZLubBXWWxTpxGBnF::UtBqXntbqxwriUAwYTdZZiyRTzZwAVgt);
 }

 private static IModule oToQpNYpLObIsQTuDatjrbRcixmHRAN_(IModule dPwMSmfyz_qIFCJRVraJMeQAtRORuHUd) {
 modules.addLast(dPwMSmfyz_qIFCJRVraJMeQAtRORuHUd);
 return dPwMSmfyz_qIFCJRVraJMeQAtRORuHUd;
 }
}

