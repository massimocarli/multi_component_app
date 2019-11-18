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
public final class JsonSerializerImpl_Factory implements Factory<JsonSerializerImpl> {
  @Override
  public JsonSerializerImpl get() {
    return newInstance();
  }

  public static JsonSerializerImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JsonSerializerImpl newInstance() {
    return new JsonSerializerImpl();
  }

  private static final class InstanceHolder {
    private static final JsonSerializerImpl_Factory INSTANCE = new JsonSerializerImpl_Factory();
  }
}
