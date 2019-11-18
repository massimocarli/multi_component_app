package daggersingleton

import javax.inject.Inject

/**
 * Simple Printer implementation
 */
class PrinterImpl @Inject constructor() : Printer {
  override fun print(msg: String) {
    kotlin.io.print(msg)
  }
}