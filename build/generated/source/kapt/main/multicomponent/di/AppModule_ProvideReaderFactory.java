package multicomponent.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Scanner;
import javax.annotation.Generated;
import javax.inject.Provider;
import multicomponent.io.PromptReader;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideReaderFactory implements Factory<PromptReader> {
  private final AppModule module;

  private final Provider<Scanner> scannerProvider;

  public AppModule_ProvideReaderFactory(AppModule module, Provider<Scanner> scannerProvider) {
    this.module = module;
    this.scannerProvider = scannerProvider;
  }

  @Override
  public PromptReader get() {
    return provideReader(module, scannerProvider.get());
  }

  public static AppModule_ProvideReaderFactory create(AppModule module,
      Provider<Scanner> scannerProvider) {
    return new AppModule_ProvideReaderFactory(module, scannerProvider);
  }

  public static PromptReader provideReader(AppModule instance, Scanner scanner) {
    return Preconditions.checkNotNull(instance.provideReader(scanner), "Cannot return null from a non-@Nullable @Provides method");
  }
}
