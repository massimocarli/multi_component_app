package multicomponent.ext;

import java.lang.System;

/**
 * Abstraction for the Json
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmulticomponent/ext/JsonSerializer;", "", "serialize", "", "repo", "Lmulticomponent/repository/ValueRepository;", "MultiComponentApp"})
public abstract interface JsonSerializer {
    
    /**
     * Serialize the content of the ValueRepository
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String serialize(@org.jetbrains.annotations.NotNull()
    multicomponent.repository.ValueRepository repo);
}