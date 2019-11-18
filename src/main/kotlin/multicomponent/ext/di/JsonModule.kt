package multicomponent.ext.di

import dagger.Module
import dagger.Provides
import multicomponent.ext.JsonSerializer
import multicomponent.ext.impl.FilePrinterImpl
import multicomponent.ext.impl.JsonSerializerImpl
import multicomponent.io.Printer
import javax.inject.Named

@Module
class JsonModule {

  @Provides
  @Named("File")
  fun providePrinter(@Named("filePath") fileName: String): Printer = FilePrinterImpl(fileName)

  @Provides
  fun jsonSerializer(): JsonSerializer = JsonSerializerImpl()
}