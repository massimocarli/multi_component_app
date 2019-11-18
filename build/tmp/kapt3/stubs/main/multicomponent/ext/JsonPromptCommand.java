package multicomponent.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020$H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R$\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006%"}, d2 = {"Lmulticomponent/ext/JsonPromptCommand;", "Lmulticomponent/command/PromptCommand;", "()V", "currentCommand", "", "getCurrentCommand", "()Ljava/lang/String;", "setCurrentCommand", "(Ljava/lang/String;)V", "help", "getHelp", "name", "getName", "printer", "Lmulticomponent/io/Printer;", "printer$annotations", "getPrinter", "()Lmulticomponent/io/Printer;", "setPrinter", "(Lmulticomponent/io/Printer;)V", "repository", "Lmulticomponent/repository/ValueRepository;", "getRepository", "()Lmulticomponent/repository/ValueRepository;", "setRepository", "(Lmulticomponent/repository/ValueRepository;)V", "serializer", "Lmulticomponent/ext/JsonSerializer;", "getSerializer", "()Lmulticomponent/ext/JsonSerializer;", "setSerializer", "(Lmulticomponent/ext/JsonSerializer;)V", "accept", "", "command", "execute", "", "MultiComponentApp"})
public final class JsonPromptCommand extends multicomponent.command.PromptCommand {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public multicomponent.io.Printer printer;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public multicomponent.repository.ValueRepository repository;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public multicomponent.ext.JsonSerializer serializer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentCommand;
    
    @javax.inject.Named(value = "File")
    public static void printer$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final multicomponent.io.Printer getPrinter() {
        return null;
    }
    
    public final void setPrinter(@org.jetbrains.annotations.NotNull()
    multicomponent.io.Printer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final multicomponent.repository.ValueRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    multicomponent.repository.ValueRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final multicomponent.ext.JsonSerializer getSerializer() {
        return null;
    }
    
    public final void setSerializer(@org.jetbrains.annotations.NotNull()
    multicomponent.ext.JsonSerializer p0) {
    }
    
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