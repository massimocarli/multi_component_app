package multicomponent

import daggersingleton.Printer
import multicomponent.command.PromptCommand
import multicomponent.io.PromptReader
import javax.inject.Inject

class CommandExecutor @Inject constructor(
  private val printer: Printer,
  private val promptReader: PromptReader,
  private val commands: @JvmSuppressWildcards(true) List<PromptCommand>
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