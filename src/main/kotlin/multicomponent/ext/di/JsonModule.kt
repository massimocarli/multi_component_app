package multicomponent.ext.di

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import multicomponent.command.PromptCommand
import multicomponent.ext.JsonPromptCommand
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

  @Provides
  @IntoSet
  fun command(): PromptCommand = JsonPromptCommand()
}