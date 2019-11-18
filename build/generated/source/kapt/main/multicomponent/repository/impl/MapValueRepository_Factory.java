package multicomponent.repository.impl;

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
public final class MapValueRepository_Factory implements Factory<MapValueRepository> {
  @Override
  public MapValueRepository get() {
    return newInstance();
  }

  public static MapValueRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MapValueRepository newInstance() {
    return new MapValueRepository();
  }

  private static final class InstanceHolder {
    private static final MapValueRepository_Factory INSTANCE = new MapValueRepository_Factory();
  }
}
