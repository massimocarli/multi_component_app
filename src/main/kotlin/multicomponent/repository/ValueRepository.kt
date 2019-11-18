package multicomponent.repository

import java.util.stream.Stream

/**
 * Simple Repository abstraction for key values
 */
interface ValueRepository {
  /**
   * Saves the given value for the provided key
   */
  fun save(key: String, value: String)

  /**
   * Loads the value for a given key if present
   */
  fun load(key: String): String?

  /**
   * Checks if the key is present
   */
  fun contains(key: String): Boolean

  /**
   * The keys as Stream
   */
  fun keys(): Stream<String>
}