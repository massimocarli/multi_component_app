package multicomponent.command

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import multicomponent.command.impl.ExitPromptCommand

@Module
class GeneralCommandModule {

  @Provides
  @IntoSet
  fun command(): PromptCommand = ExitPromptCommand()
}