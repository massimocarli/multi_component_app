package multicomponent;

import dagger.internal.Factory;
import daggersingleton.Printer;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import multicomponent.command.PromptCommand;
import multicomponent.io.PromptReader;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommandExecutor_Factory implements Factory<CommandExecutor> {
  private final Provider<Printer> printerProvider;

  private final Provider<PromptReader> promptReaderProvider;

  private final Provider<List<PromptCommand>> commandsProvider;

  public CommandExecutor_Factory(Provider<Printer> printerProvider,
      Provider<PromptReader> promptReaderProvider, Provider<List<PromptCommand>> commandsProvider) {
    this.printerProvider = printerProvider;
    this.promptReaderProvider = promptReaderProvider;
    this.commandsProvider = commandsProvider;
  }

  @Override
  public CommandExecutor get() {
    return newInstance(printerProvider.get(), promptReaderProvider.get(), commandsProvider.get());
  }

  public static CommandExecutor_Factory create(Provider<Printer> printerProvider,
      Provider<PromptReader> promptReaderProvider, Provider<List<PromptCommand>> commandsProvider) {
    return new CommandExecutor_Factory(printerProvider, promptReaderProvider, commandsProvider);
  }

  public static CommandExecutor newInstance(Printer printer, PromptReader promptReader,
      List<PromptCommand> commands) {
    return new CommandExecutor(printer, promptReader, commands);
  }
}
