package multicomponent.di

import dagger.Module
import dagger.Provides
import daggersingleton.Printer
import daggersingleton.PrinterImpl
import multicomponent.command.PromptCommand
import multicomponent.command.impl.EchoPromptCommand
import multicomponent.command.impl.ExitPromptCommand
import multicomponent.command.impl.LoadPromptCommand
import multicomponent.command.impl.SavePromptCommand
import multicomponent.io.PromptReader
import multicomponent.io.impl.PromptReaderImpl
import multicomponent.repository.ValueRepository
import multicomponent.repository.impl.MapValueRepository
import java.util.*
import javax.inject.Singleton

@Module
class AppModule {

  @Provides
  fun provideReader(scanner: Scanner): PromptReader = PromptReaderImpl(scanner)

  @Provides
  fun printer(): Printer = PrinterImpl()

  @Provides
  @Singleton
  fun repository(): ValueRepository = MapValueRepository()

  @Provides
  fun commands(): List<PromptCommand> = listOf(
    EchoPromptCommand(),
    ExitPromptCommand(),
    SavePromptCommand(),
    LoadPromptCommand()
  )
}