package multicomponent.ext.di

import dagger.Binds
import dagger.Module
import multicomponent.ext.JsonSerializer
import multicomponent.ext.impl.FilePrinterImpl
import multicomponent.ext.impl.JsonSerializerImpl
import multicomponent.io.Printer
import javax.inject.Named

@Module
abstract class JsonModule {

  @Binds
  @Named("File")
  abstract fun providePrinter(printer: FilePrinterImpl): Printer

  @Binds
  abstract fun jsonSerializer(printer: JsonSerializerImpl): JsonSerializer
}