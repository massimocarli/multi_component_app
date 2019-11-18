package multicomponent.command;

import java.lang.System;

/**
 * Interface which defines commands we can run into the app. Each command
 * can access the AppContext
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\rH&R\u0014\u0010\u0003\u001a\u00020\u00048fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lmulticomponent/command/PromptCommand;", "", "()V", "help", "", "getHelp", "()Ljava/lang/String;", "name", "getName", "accept", "", "command", "execute", "", "MultiComponentApp"})
public abstract class PromptCommand {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getHelp();
    
    /**
     * Returns true for the specific implementation
     */
    public abstract boolean accept(@org.jetbrains.annotations.NotNull()
    java.lang.String command);
    
    /**
     * Run the operation
     */
    public abstract void execute();
    
    public PromptCommand() {
        super();
    }
}