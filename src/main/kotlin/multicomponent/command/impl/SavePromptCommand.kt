package multicomponent.command.impl

import multicomponent.command.PromptCommand
import multicomponent.context.AppContext
import multicomponent.repository.ValueRepository
import javax.inject.Inject

/**
 * Implementation for the PromptCommand which saves a data into the repository
 */
class SavePromptCommand : PromptCommand() {

  @Inject
  lateinit var repository: ValueRepository

  override val name: String
    get() = "save"

  override val help: String
    get() = "Usage: save <key> <value>"

  var currentCommand: String? = null

  override fun execute() {
    val tokens = currentCommand?.split(" ")
    if (tokens?.size == 3) {
      AppContext.appComponent?.inject(this)
      repository.run {
        save(tokens[1], tokens[2])
        println("In $name -> Repo: $this")
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