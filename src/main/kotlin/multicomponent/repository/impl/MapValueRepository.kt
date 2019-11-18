package multicomponent.repository.impl

import multicomponent.repository.ValueRepository
import java.util.stream.Stream

/**
 * Simple implementation for the ValueRepository using a Map
 */
class MapValueRepository : ValueRepository {

  private val map = mutableMapOf<String, String>()

  override fun save(key: String, value: String) {
    map.put(key, value)
  }

  override fun load(key: String): String? = map.get(key)

  override fun contains(key: String) = map.contains(key)

  override fun keys(): Stream<String> = map.keys.stream()
}