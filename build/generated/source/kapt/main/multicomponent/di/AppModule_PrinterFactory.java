package multicomponent.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import daggersingleton.Printer;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_PrinterFactory implements Factory<Printer> {
  private final AppModule module;

  public AppModule_PrinterFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Printer get() {
    return printer(module);
  }

  public static AppModule_PrinterFactory create(AppModule module) {
    return new AppModule_PrinterFactory(module);
  }

  public static Printer printer(AppModule instance) {
    return Preconditions.checkNotNull(instance.printer(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
