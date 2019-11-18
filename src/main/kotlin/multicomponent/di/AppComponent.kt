package multicomponent.di

import dagger.BindsInstance
import dagger.Component
import multicomponent.CommandExecutor
import multicomponent.ext.di.JsonComponent
import multicomponent.repository.ValueRepository
import java.util.*
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

  fun app(): CommandExecutor

  fun repository(): ValueRepository

  fun jsonComponent(): JsonComponent

  @Component.Factory
  interface Factory {
    fun create(
      @BindsInstance scanner: Scanner
    ): AppComponent
  }
}