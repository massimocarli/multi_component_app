package multicomponent

import multicomponent.command.PromptCommand
import multicomponent.io.Printer
import multicomponent.io.PromptReader
import javax.inject.Inject
import javax.inject.Named

class CommandExecutor @Inject constructor(
  @Named("Std") private val printer: Printer,
  private val promptReader: PromptReader,
  private val commands: @JvmSuppressWildcards(true) Set<PromptCommand>
) {

  fun execute() {
    while (true) {
      val promptCommand = promptReader.readCommand()
      if ("help".equals(promptCommand, ignoreCase = true)) {
        commands.forEach { printer.print("Command: ${it.name}: ${it.help} \n") }
        continue
      }
      val commandToExecute = commands.filter { it.accept(promptCommand) }
        .firstOrNull()
      if (commandToExecute != null) {
        commandToExecute.execute()
      } else {
        printer.print("Unknown command! \n")
      }
    }
  }
}