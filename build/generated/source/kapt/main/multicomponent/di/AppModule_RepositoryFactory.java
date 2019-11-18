package multicomponent.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import multicomponent.repository.ValueRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_RepositoryFactory implements Factory<ValueRepository> {
  private final AppModule module;

  public AppModule_RepositoryFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ValueRepository get() {
    return repository(module);
  }

  public static AppModule_RepositoryFactory create(AppModule module) {
    return new AppModule_RepositoryFactory(module);
  }

  public static ValueRepository repository(AppModule instance) {
    return Preconditions.checkNotNull(instance.repository(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
