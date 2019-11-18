package multicomponent.di;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Scanner;
import javax.annotation.Generated;
import javax.inject.Provider;
import multicomponent.CommandExecutor;
import multicomponent.io.PromptReader;
import multicomponent.repository.ValueRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final AppModule appModule;

  private final Scanner scanner;

  private Provider<ValueRepository> repositoryProvider;

  private DaggerAppComponent(AppModule appModuleParam, Scanner scannerParam) {
    this.appModule = appModuleParam;
    this.scanner = scannerParam;
    initialize(appModuleParam, scannerParam);
  }

  public static AppComponent.Builder factory() {
    return new Factory();
  }

  private PromptReader getPromptReader() {
    return AppModule_ProvideReaderFactory.provideReader(appModule, scanner);}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final Scanner scannerParam) {
    this.repositoryProvider = DoubleCheck.provider(AppModule_RepositoryFactory.create(appModuleParam));
  }

  @Override
  public CommandExecutor app() {
    return new CommandExecutor(AppModule_PrinterFactory.printer(appModule), getPromptReader(), AppModule_CommandsFactory.commands(appModule));}

  @Override
  public ValueRepository repository() {
    return repositoryProvider.get();}

  private static final class Factory implements AppComponent.Builder {
    @Override
    public AppComponent create(Scanner scanner) {
      Preconditions.checkNotNull(scanner);
      return new DaggerAppComponent(new AppModule(), scanner);
    }
  }
}
