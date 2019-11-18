package multicomponent.ext.di

import dagger.Component
import multicomponent.di.AppComponent
import multicomponent.di.CommandScope
import multicomponent.ext.JsonPromptCommand

@Component(
  modules = arrayOf(JsonModule::class),
  dependencies = arrayOf(AppComponent::class)
)
@CommandScope
interface JsonComponent {

  fun inject(command: JsonPromptCommand)
}