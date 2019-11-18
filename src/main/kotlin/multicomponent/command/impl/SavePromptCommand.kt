package multicomponent.command.impl

import multicomponent.command.PromptCommand
import multicomponent.context.AppContext

/**
 * Implementation for the PromptCommand which saves a data into the repository
 */
class SavePromptCommand : PromptCommand() {

  override val name: String
    get() = "save"

  override val help: String
    get() = "Usage: save <key> <value>"

  var currentCommand: String? = null

  override fun execute() {
    val tokens = currentCommand?.split(" ")
    if (tokens?.size == 3) {
      AppContext.appComponent?.repository()?.run {
        save(tokens[1], tokens[2])
      }
    } else {
      println("Wrong parameters")
      println(help)
    }
  }

  override fun accept(command: String): Boolean {
    val accepted = command.startsWith(name, ignoreCase = true)
    if (accepted) {
      currentCommand = command
    }
    return accepted
  }
}