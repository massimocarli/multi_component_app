package multicomponent.repository;

import java.lang.System;

/**
 * Simple Repository abstraction for key values
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lmulticomponent/repository/ValueRepository;", "", "contains", "", "key", "", "keys", "Ljava/util/stream/Stream;", "load", "save", "", "value", "MultiComponentApp"})
public abstract interface ValueRepository {
    
    /**
     * Saves the given value for the provided key
     */
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    /**
     * Loads the value for a given key if present
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String load(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Checks if the key is present
     */
    public abstract boolean contains(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * The keys as Stream
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.stream.Stream<java.lang.String> keys();
}