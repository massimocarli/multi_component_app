package multicomponent.ext.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmulticomponent/ext/di/JsonComponent;", "", "printer", "Lmulticomponent/io/Printer;", "serializer", "Lmulticomponent/ext/JsonSerializer;", "MultiComponentApp"})
@dagger.Component(modules = {multicomponent.ext.di.JsonModule.class})
public abstract interface JsonComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract multicomponent.ext.JsonSerializer serializer();
    
    @org.jetbrains.annotations.NotNull()
    public abstract multicomponent.io.Printer printer();
}