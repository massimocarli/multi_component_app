package multicomponent.di

import dagger.Module
import dagger.Provides
import multicomponent.io.Printer
import multicomponent.io.PromptReader
import multicomponent.io.impl.PrinterImpl
import multicomponent.io.impl.PromptReaderImpl
import multicomponent.repository.ValueRepository
import multicomponent.repository.impl.MapValueRepository
import java.util.*
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

  @Provides
  fun provideReader(scanner: Scanner): PromptReader = PromptReaderImpl(scanner)

  @Provides
  @Named("Std")
  fun printer(): Printer = PrinterImpl()

  @Provides
  @Singleton
  fun repository(): ValueRepository = MapValueRepository()
}