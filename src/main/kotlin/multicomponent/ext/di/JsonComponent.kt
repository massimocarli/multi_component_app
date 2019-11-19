package multicomponent.ext.di

import dagger.BindsInstance
import dagger.Component
import multicomponent.di.AppComponent
import multicomponent.di.CommandScope
import multicomponent.ext.JsonPromptCommand
import javax.inject.Named

@Component(
  modules = arrayOf(JsonModule::class),
  dependencies = arrayOf(AppComponent::class)
)
@CommandScope
interface JsonComponent {

  fun inject(command: JsonPromptCommand)

  @Component.Factory
  interface Factory {

    fun create(
      appComponent: AppComponent,
      @BindsInstance @Named("filePath") filePath: String
    ): JsonComponent
  }
}