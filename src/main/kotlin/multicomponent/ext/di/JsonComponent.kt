package multicomponent.ext.di

import dagger.Subcomponent
import multicomponent.di.CommandScope
import multicomponent.ext.JsonPromptCommand

@Subcomponent(
  modules = arrayOf(JsonModule::class)
)
@CommandScope
interface JsonComponent {

  fun inject(command: JsonPromptCommand)
}