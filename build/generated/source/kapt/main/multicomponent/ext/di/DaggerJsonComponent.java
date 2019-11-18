package multicomponent.ext.di;

import dagger.internal.Preconditions;
import javax.annotation.Generated;
import multicomponent.di.AppComponent;
import multicomponent.ext.JsonPromptCommand;
import multicomponent.ext.JsonPromptCommand_MembersInjector;
import multicomponent.ext.impl.FilePrinterImpl;
import multicomponent.ext.impl.JsonSerializerImpl;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerJsonComponent implements JsonComponent {
  private final AppComponent appComponent;

  private DaggerJsonComponent(AppComponent appComponentParam) {
    this.appComponent = appComponentParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public void inject(JsonPromptCommand command) {
    injectJsonPromptCommand(command);}

  private JsonPromptCommand injectJsonPromptCommand(JsonPromptCommand instance) {
    JsonPromptCommand_MembersInjector.injectPrinter(instance, new FilePrinterImpl());
    JsonPromptCommand_MembersInjector.injectRepository(instance, Preconditions.checkNotNull(appComponent.repository(), "Cannot return null from a non-@Nullable component method"));
    JsonPromptCommand_MembersInjector.injectSerializer(instance, new JsonSerializerImpl());
    return instance;
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public JsonComponent build() {
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new DaggerJsonComponent(appComponent);
    }
  }
}
