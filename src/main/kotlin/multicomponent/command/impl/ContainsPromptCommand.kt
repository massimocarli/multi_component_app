package multicomponent.command.impl

import multicomponent.command.PromptCommand
import multicomponent.context.AppContext
import multicomponent.repository.ValueRepository
import javax.inject.Inject


/**
 * Implementation for the PromptCommand which check a data into the repository
 */
class ContainsPromptCommand : PromptCommand() {

  @Inject
  lateinit var repository: ValueRepository

  override val name: String
    get() = "contains"

  override val help: String
    get() = "Usage: contains <key>"

  var currentCommand: String? = null

  override fun execute() {
    val tokens = currentCommand?.split(" ")
    if (tokens?.size == 2) {
      AppContext.appComponent?.inject(this)
      repository.run {
        println(contains(tokens[1]))
        println("In $name -> Repo: $this")
      }
    } else {
      println("Wrong parameters for $name command. ${help}")
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