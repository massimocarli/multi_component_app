package multicomponent.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lmulticomponent/di/AppModule;", "", "()V", "commands", "", "Lmulticomponent/command/PromptCommand;", "printer", "Lmulticomponent/io/Printer;", "provideReader", "Lmulticomponent/io/PromptReader;", "scanner", "Ljava/util/Scanner;", "repository", "Lmulticomponent/repository/ValueRepository;", "MultiComponentApp"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final multicomponent.io.PromptReader provideReader(@org.jetbrains.annotations.NotNull()
    java.util.Scanner scanner) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Std")
    @dagger.Provides()
    public final multicomponent.io.Printer printer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final multicomponent.repository.ValueRepository repository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.util.List<multicomponent.command.PromptCommand> commands() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}