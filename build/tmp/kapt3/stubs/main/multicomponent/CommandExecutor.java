package multicomponent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B4\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001b\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\u0007\u0010\u0002\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rR#\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\u0007\u0010\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lmulticomponent/CommandExecutor;", "", "printer", "Ldaggersingleton/Printer;", "promptReader", "Lmulticomponent/io/PromptReader;", "commands", "", "Lmulticomponent/command/PromptCommand;", "Lkotlin/jvm/JvmSuppressWildcards;", "suppress", "(Ldaggersingleton/Printer;Lmulticomponent/io/PromptReader;Ljava/util/List;)V", "execute", "", "MultiComponentApp"})
public final class CommandExecutor {
    private final daggersingleton.Printer printer = null;
    private final multicomponent.io.PromptReader promptReader = null;
    private final java.util.List<multicomponent.command.PromptCommand> commands = null;
    
    public final void execute() {
    }
    
    @javax.inject.Inject()
    public CommandExecutor(@org.jetbrains.annotations.NotNull()
    daggersingleton.Printer printer, @org.jetbrains.annotations.NotNull()
    multicomponent.io.PromptReader promptReader, @org.jetbrains.annotations.NotNull()
    java.util.List<multicomponent.command.PromptCommand> commands) {
        super();
    }
}