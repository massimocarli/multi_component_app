package multicomponent.command

/**
 * Interface which defines commands we can run into the app. Each command
 * can access the AppContext
 */
abstract class PromptCommand {

  /**
   * The name for the command
   */
  abstract val name: String
    get

  /**
   * Instruction about the command
   */
  abstract val help: String
    get

  /**
   * Returns true for the specific implementation
   */
  abstract fun accept(command: String): Boolean

  /**
   * Run the operation
   */
  abstract fun execute()
}