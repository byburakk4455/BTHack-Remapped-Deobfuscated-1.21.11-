/*
 * Decompiled with CFR 0.152.
 */
package com.ferra13671.bthack;

import com.ferra13671.bthack.PrefixCommand;
import com.ferra13671.bthack.FakeplayerCommand;
import com.ferra13671.bthack.ModuleCommand;
import com.ferra13671.bthack.ICommand;
import com.ferra13671.bthack.ConfigCommand;
import com.ferra13671.bthack.OpendirectoryCommand;
import com.ferra13671.bthack.RotateCommand;
import com.ferra13671.bthack.AutoauthCommand;
import com.ferra13671.bthack.Auto2faCommand;
import com.ferra13671.bthack.ClearchatCommand;
import com.ferra13671.bthack.SocialsCommand;
import java.util.ArrayList;
import java.util.List;

public final class CommandManager {
    private static final List<ICommand> commands;

    static {
        commands = new ArrayList<>();
        CommandManager.register(new Auto2faCommand(), new AutoauthCommand(), new ClearchatCommand(), new ConfigCommand(), new FakeplayerCommand(), new ModuleCommand(), new OpendirectoryCommand(), new PrefixCommand(), new RotateCommand(), new SocialsCommand());
    }

    public static List<ICommand> getCommands() {
        return commands;
    }

    public static void register(ICommand ... newCommands) {
        commands.addAll(List.of(newCommands));
    }

    public CommandManager() {
    }
}
