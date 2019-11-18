package multicomponent.di

import dagger.BindsInstance
import dagger.Component
import multicomponent.CommandExecutor
import multicomponent.command.impl.ContainsPromptCommand
import multicomponent.command.impl.LoadPromptCommand
import multicomponent.command.impl.SavePromptCommand
import multicomponent.ext.di.JsonComponent
import multicomponent.ext.di.JsonModule
import java.util.*
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

  fun app(): CommandExecutor

  fun inject(command: ContainsPromptCommand)
  fun inject(command: LoadPromptCommand)
  fun inject(command: SavePromptCommand)

  fun jsonComponent(module: JsonModule): JsonComponent

  @Component.Factory
  interface Factory {
    fun create(
      @BindsInstance scanner: Scanner
    ): AppComponent
  }
}