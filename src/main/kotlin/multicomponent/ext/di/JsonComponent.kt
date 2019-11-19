package multicomponent.ext.di

import dagger.BindsInstance
import dagger.Subcomponent
import multicomponent.di.CommandScope
import multicomponent.ext.JsonPromptCommand
import javax.inject.Named

@Subcomponent(
  modules = arrayOf(JsonModule::class)
)
@CommandScope
interface JsonComponent {

  fun inject(command: JsonPromptCommand)

  @Subcomponent.Factory
  interface Factory {
    
    fun create(@BindsInstance @Named("filePath") filePath: String): JsonComponent
  }
}