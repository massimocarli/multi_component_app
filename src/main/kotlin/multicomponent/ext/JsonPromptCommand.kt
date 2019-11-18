package multicomponent.ext

import multicomponent.command.PromptCommand
import multicomponent.context.AppContext
import multicomponent.io.Printer
import multicomponent.repository.ValueRepository
import javax.inject.Inject
import javax.inject.Named

class JsonPromptCommand : PromptCommand() {

  @Inject
  @Named("File")
  lateinit var printer: Printer

  @Inject
  lateinit var repository: ValueRepository

  @Inject
  lateinit var serializer: JsonSerializer

  override val name: String
    get() = "toJson"

  override val help: String
    get() = "Usage: toJson"

  var currentCommand: String? = null

  override fun execute() {
    val tokens = currentCommand?.split(" ")
    if (tokens?.size == 1) {
      AppContext.appComponent?.jsonComponent()?.inject(this)
      val json = serializer.serialize(repository)
      printer.print(json)
      println("In $name -> Repo: $repository, Serializer: $serializer and Printer: $printer")
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