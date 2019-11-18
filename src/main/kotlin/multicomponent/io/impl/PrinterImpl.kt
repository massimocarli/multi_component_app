package multicomponent.io.impl

import multicomponent.io.Printer

/**
 * Simple Printer implementation
 */
class PrinterImpl : Printer {
  override fun print(msg: String) {
    kotlin.io.print(msg)
  }
}