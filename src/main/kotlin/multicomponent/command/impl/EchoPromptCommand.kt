package multicomponent.command.impl

import multicomponent.command.PromptCommand

/**
 * Implementation for the PromptCommand which implements an echo
 */
class EchoPromptCommand : PromptCommand() {

  override val name: String
    get() = "echo"

  override val help: String
    get() = "Usage: echo <something to be printed>"

  var currentCommand: String? = null

  override fun execute() {
    currentCommand?.substring(name.length + 1)?.let { println(it) }
  }

  override fun accept(command: String): Boolean {
    val accepted = command.startsWith(name, ignoreCase = true)
    if (accepted) {
      currentCommand = command
    }
    return accepted
  }
}