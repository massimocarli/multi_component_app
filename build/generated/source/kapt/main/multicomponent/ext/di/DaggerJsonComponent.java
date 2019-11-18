package multicomponent.ext.di;

import javax.annotation.Generated;
import multicomponent.ext.JsonSerializer;
import multicomponent.ext.impl.FilePrinterImpl;
import multicomponent.ext.impl.JsonSerializerImpl;
import multicomponent.io.Printer;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerJsonComponent implements JsonComponent {
  private DaggerJsonComponent() {

  }

  public static Builder builder() {
    return new Builder();
  }

  public static JsonComponent create() {
    return new Builder().build();
  }

  @Override
  public JsonSerializer serializer() {
    return new JsonSerializerImpl();}

  @Override
  public Printer printer() {
    return new FilePrinterImpl();}

  public static final class Builder {
    private Builder() {
    }

    public JsonComponent build() {
      return new DaggerJsonComponent();
    }
  }
}
