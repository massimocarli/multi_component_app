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

  @Subcomponent.Builder
  interface Builder {

    @BindsInstance
    fun filePath(@Named("filePath") filePath: String): Builder

    fun build(): JsonComponent
  }
}