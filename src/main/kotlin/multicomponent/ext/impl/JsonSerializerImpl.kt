package multicomponent.ext.impl

import multicomponent.ext.JsonSerializer
import multicomponent.repository.ValueRepository
import javax.inject.Inject
import kotlin.streams.asSequence

class JsonSerializerImpl @Inject constructor() : JsonSerializer {
  override fun serialize(repo: ValueRepository): String {
    return repo.keys().asSequence()
      .joinToString(prefix = "[", postfix = "]") { key ->
        "{\"${key}\" : \"${repo.load(key)}\"}"
      }.also {
        println("Saved: $it")
      }
  }
}