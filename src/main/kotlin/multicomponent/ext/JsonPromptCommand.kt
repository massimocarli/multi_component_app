package multicomponent.ext

import multicomponent.command.PromptCommand
import multicomponent.context.AppContext
import multicomponent.ext.di.DaggerJsonComponent

class JsonPromptCommand : PromptCommand() {

  override val name: String
    get() = "toJson"

  override val help: String
    get() = "Usage: toJson"

  var currentCommand: String? = null

  override fun execute() {
    val tokens = currentCommand?.split(" ")
    if (tokens?.size == 1) {
      AppContext.appComponent?.repository()?.also { repository ->
        // Here we have the repository
        val jsonComp = DaggerJsonComponent.create()
        val serializer = jsonComp.serializer()
        val json = serializer.serialize(repository)
        val printer = jsonComp.printer()
        printer.print(json)
        println("In $name -> Repo: $repository, Serializer: $serializer and Printer: $printer")
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