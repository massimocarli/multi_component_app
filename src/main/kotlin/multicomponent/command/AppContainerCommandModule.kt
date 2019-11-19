package multicomponent.command

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import multicomponent.command.impl.EchoPromptCommand

@Module
class AppContainerCommandModule {

  @Provides
  @IntoSet
  fun command(): PromptCommand = EchoPromptCommand()
}