package daggersingleton;

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
public final class PrinterImpl_Factory implements Factory<PrinterImpl> {
  @Override
  public PrinterImpl get() {
    return newInstance();
  }

  public static PrinterImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PrinterImpl newInstance() {
    return new PrinterImpl();
  }

  private static final class InstanceHolder {
    private static final PrinterImpl_Factory INSTANCE = new PrinterImpl_Factory();
  }
}
