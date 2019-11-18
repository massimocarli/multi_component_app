package multicomponent.io

/**
 * Reader for the command to execute
 */
interface PromptReader {

  /**
   * Read the current command
   */
  fun readCommand(): String
}