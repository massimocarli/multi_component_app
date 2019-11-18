package multicomponent.command.impl

import multicomponent.command.PromptCommand

/**
 * Implementation for the PromptCommand which exits from the application
 */
class ExitPromptCommand() : PromptCommand() {

  override val name: String
    get() = "exit"

  override val help: String
    get() = "Usage: exit"

  override fun execute() {
    println("Bye bye!")
    System.exit(0)
  }

  override fun accept(command: String): Boolean = command.startsWith(name, ignoreCase = true)
}