package multicomponent.ext;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import multicomponent.io.Printer;
import multicomponent.repository.ValueRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class JsonPromptCommand_MembersInjector implements MembersInjector<JsonPromptCommand> {
  private final Provider<Printer> printerProvider;

  private final Provider<ValueRepository> repositoryProvider;

  private final Provider<JsonSerializer> serializerProvider;

  public JsonPromptCommand_MembersInjector(Provider<Printer> printerProvider,
      Provider<ValueRepository> repositoryProvider, Provider<JsonSerializer> serializerProvider) {
    this.printerProvider = printerProvider;
    this.repositoryProvider = repositoryProvider;
    this.serializerProvider = serializerProvider;
  }

  public static MembersInjector<JsonPromptCommand> create(Provider<Printer> printerProvider,
      Provider<ValueRepository> repositoryProvider, Provider<JsonSerializer> serializerProvider) {
    return new JsonPromptCommand_MembersInjector(printerProvider, repositoryProvider, serializerProvider);}

  @Override
  public void injectMembers(JsonPromptCommand instance) {
    injectPrinter(instance, printerProvider.get());
    injectRepository(instance, repositoryProvider.get());
    injectSerializer(instance, serializerProvider.get());
  }

  public static void injectPrinter(JsonPromptCommand instance, Printer printer) {
    instance.printer = printer;
  }

  public static void injectRepository(JsonPromptCommand instance, ValueRepository repository) {
    instance.repository = repository;
  }

  public static void injectSerializer(JsonPromptCommand instance, JsonSerializer serializer) {
    instance.serializer = serializer;
  }
}
