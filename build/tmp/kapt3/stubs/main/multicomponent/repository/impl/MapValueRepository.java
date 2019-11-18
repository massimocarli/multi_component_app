package multicomponent.repository.impl;

import java.lang.System;

/**
 * Simple implementation for the ValueRepository using a Map
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lmulticomponent/repository/impl/MapValueRepository;", "Lmulticomponent/repository/ValueRepository;", "()V", "map", "", "", "contains", "", "key", "keys", "Ljava/util/stream/Stream;", "load", "save", "", "value", "MultiComponentApp"})
public final class MapValueRepository implements multicomponent.repository.ValueRepository {
    private final java.util.Map<java.lang.String, java.lang.String> map = null;
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String load(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override()
    public boolean contains(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.stream.Stream<java.lang.String> keys() {
        return null;
    }
    
    public MapValueRepository() {
        super();
    }
}