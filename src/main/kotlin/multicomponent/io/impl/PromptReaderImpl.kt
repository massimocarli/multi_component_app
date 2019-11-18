package multicomponent.io.impl

import multicomponent.io.PromptReader
import java.util.*
import javax.inject.Inject

/**
 * Implementation for the PromptReader which uses a Scanner
 */
class PromptReaderImpl @Inject constructor(private val scanner: Scanner) : PromptReader {
  override fun readCommand(): String = scanner.nextLine()
}