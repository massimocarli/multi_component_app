package multicomponent.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lmulticomponent/ext/JsonPromptCommand;", "Lmulticomponent/command/PromptCommand;", "()V", "currentCommand", "", "getCurrentCommand", "()Ljava/lang/String;", "setCurrentCommand", "(Ljava/lang/String;)V", "help", "getHelp", "name", "getName", "accept", "", "command", "execute", "", "MultiComponentApp"})
public final class JsonPromptCommand extends multicomponent.command.PromptCommand {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentCommand;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentCommand() {
        return null;
    }
    
    public final void setCurrentCommand(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void execute() {
    }
    
    @java.lang.Override()
    public boolean accept(@org.jetbrains.annotations.NotNull()
    java.lang.String command) {
        return false;
    }
    
    public JsonPromptCommand() {
        super();
    }
}