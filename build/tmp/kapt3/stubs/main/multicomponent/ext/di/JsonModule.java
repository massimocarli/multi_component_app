package multicomponent.ext.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lmulticomponent/ext/di/JsonModule;", "", "()V", "jsonSerializer", "Lmulticomponent/ext/JsonSerializer;", "printer", "Lmulticomponent/ext/impl/JsonSerializerImpl;", "providePrinter", "Lmulticomponent/io/Printer;", "Lmulticomponent/ext/impl/FilePrinterImpl;", "MultiComponentApp"})
@dagger.Module()
public abstract class JsonModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "File")
    @dagger.Binds()
    public abstract multicomponent.io.Printer providePrinter(@org.jetbrains.annotations.NotNull()
    multicomponent.ext.impl.FilePrinterImpl printer);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract multicomponent.ext.JsonSerializer jsonSerializer(@org.jetbrains.annotations.NotNull()
    multicomponent.ext.impl.JsonSerializerImpl printer);
    
    public JsonModule() {
        super();
    }
}