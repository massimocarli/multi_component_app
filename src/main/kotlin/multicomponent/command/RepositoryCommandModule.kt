package multicomponent.command

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import multicomponent.command.impl.ContainsPromptCommand
import multicomponent.command.impl.LoadPromptCommand
import multicomponent.command.impl.SavePromptCommand

@Module
class RepositoryCommandModule {

  @Provides
  @ElementsIntoSet
  fun commands(): Set<PromptCommand> = setOf(
    SavePromptCommand(),
    LoadPromptCommand(),
    ContainsPromptCommand()
  )
}