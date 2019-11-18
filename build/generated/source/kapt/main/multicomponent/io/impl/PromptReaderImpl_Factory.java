package multicomponent.io.impl;

import dagger.internal.Factory;
import java.util.Scanner;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PromptReaderImpl_Factory implements Factory<PromptReaderImpl> {
  private final Provider<Scanner> scannerProvider;

  public PromptReaderImpl_Factory(Provider<Scanner> scannerProvider) {
    this.scannerProvider = scannerProvider;
  }

  @Override
  public PromptReaderImpl get() {
    return newInstance(scannerProvider.get());
  }

  public static PromptReaderImpl_Factory create(Provider<Scanner> scannerProvider) {
    return new PromptReaderImpl_Factory(scannerProvider);
  }

  public static PromptReaderImpl newInstance(Scanner scanner) {
    return new PromptReaderImpl(scanner);
  }
}
