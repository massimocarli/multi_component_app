package multicomponent.command.impl;

import java.lang.System;

/**
 * Implementation for the PromptCommand which exits from the application
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lmulticomponent/command/impl/ExitPromptCommand;", "Lmulticomponent/command/PromptCommand;", "()V", "help", "", "getHelp", "()Ljava/lang/String;", "name", "getName", "accept", "", "command", "execute", "", "MultiComponentApp"})
public final class ExitPromptCommand extends multicomponent.command.PromptCommand {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getHelp() {
        return null;
    }
    
    @java.lang.Override()
    public void execute() {
    }
    
    @java.lang.Override()
    public boolean accept(@org.jetbrains.annotations.NotNull()
    java.lang.String command) {
        return false;
    }
    
    public ExitPromptCommand() {
        super();
    }
}