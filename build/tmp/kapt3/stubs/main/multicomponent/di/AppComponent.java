package multicomponent.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lmulticomponent/di/AppComponent;", "", "app", "Lmulticomponent/CommandExecutor;", "repository", "Lmulticomponent/repository/ValueRepository;", "Builder", "MultiComponentApp"})
@javax.inject.Singleton()
@dagger.Component(modules = {multicomponent.di.AppModule.class})
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract multicomponent.CommandExecutor app();
    
    @org.jetbrains.annotations.NotNull()
    public abstract multicomponent.repository.ValueRepository repository();
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmulticomponent/di/AppComponent$Builder;", "", "create", "Lmulticomponent/di/AppComponent;", "scanner", "Ljava/util/Scanner;", "MultiComponentApp"})
    @dagger.Component.Factory()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract multicomponent.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        java.util.Scanner scanner);
    }
}