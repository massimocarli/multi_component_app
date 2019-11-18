package multicomponent.io.impl

import multicomponent.io.PromptReader
import java.util.*

/**
 * Implementation for the PromptReader which uses a Scanner
 */
class PromptReaderImpl constructor(private val scanner: Scanner) : PromptReader {
  override fun readCommand(): String = scanner.nextLine()
}