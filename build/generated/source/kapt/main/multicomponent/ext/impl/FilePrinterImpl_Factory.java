package multicomponent.ext.impl;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FilePrinterImpl_Factory implements Factory<FilePrinterImpl> {
  @Override
  public FilePrinterImpl get() {
    return newInstance();
  }

  public static FilePrinterImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FilePrinterImpl newInstance() {
    return new FilePrinterImpl();
  }

  private static final class InstanceHolder {
    private static final FilePrinterImpl_Factory INSTANCE = new FilePrinterImpl_Factory();
  }
}
