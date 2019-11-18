package multicomponent.di

import dagger.BindsInstance
import dagger.Component
import multicomponent.CommandExecutor
import multicomponent.repository.ValueRepository
import java.util.*
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

  fun app(): CommandExecutor

  fun repository(): ValueRepository

  @Component.Factory
  interface Builder {
    fun create(
      @BindsInstance scanner: Scanner
    ): AppComponent
  }
}