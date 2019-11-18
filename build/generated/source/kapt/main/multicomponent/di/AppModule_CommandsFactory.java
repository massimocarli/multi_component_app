package multicomponent.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import multicomponent.command.PromptCommand;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_CommandsFactory implements Factory<List<PromptCommand>> {
  private final AppModule module;

  public AppModule_CommandsFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public List<PromptCommand> get() {
    return commands(module);
  }

  public static AppModule_CommandsFactory create(AppModule module) {
    return new AppModule_CommandsFactory(module);
  }

  public static List<PromptCommand> commands(AppModule instance) {
    return Preconditions.checkNotNull(instance.commands(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
