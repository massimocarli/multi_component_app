package multicomponent.ext

import multicomponent.repository.ValueRepository

/**
 * Abstraction for the Json
 */
interface JsonSerializer {
  /**
   * Serialize the content of the ValueRepository
   */
  fun serialize(repo: ValueRepository): String
}