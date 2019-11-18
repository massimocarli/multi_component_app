package multicomponent.context;

import java.lang.System;

/**
 * This just contains a reference to the AppComponent if present
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lmulticomponent/context/AppContext;", "", "()V", "appComponent", "Lmulticomponent/di/AppComponent;", "getAppComponent", "()Lmulticomponent/di/AppComponent;", "setAppComponent", "(Lmulticomponent/di/AppComponent;)V", "MultiComponentApp"})
public final class AppContext {
    @org.jetbrains.annotations.Nullable()
    private static multicomponent.di.AppComponent appComponent;
    public static final multicomponent.context.AppContext INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final multicomponent.di.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.Nullable()
    multicomponent.di.AppComponent p0) {
    }
    
    private AppContext() {
        super();
    }
}