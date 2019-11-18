package multicomponent.command.impl

import multicomponent.command.PromptCommand
import multicomponent.context.AppContext

/**
 * Implementation for the PromptCommand which loads a data into the repository
 */
class LoadPromptCommand : PromptCommand() {

  override val name: String
    get() = "load"

  override val help: String
    get() = "Usage: load <key>"

  var currentCommand: String? = null

  override fun execute() {
    val tokens = currentCommand?.split(" ")
    if (tokens?.size == 2) {
      AppContext.appComponent?.repository()?.run {
        println(load(tokens[1]))
        println("In $name -> Repo: $this")
      }
    } else {
      println("Wrong parameters for $name command. $help")
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