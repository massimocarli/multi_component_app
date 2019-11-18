package multicomponent.ext.impl

import multicomponent.io.Printer
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.PrintWriter
import javax.inject.Inject

/**
 * Printer implementation on file
 */
class FilePrinterImpl @Inject constructor() : Printer {
  override fun print(msg: String) {
    val file = File("/tmp/output.json")
    try {
      PrintWriter(FileOutputStream(file)).also {
        it.println(msg)
        it.close()
      }
    } catch (ex: IOException) {
      println("Error $ex")
    }
  }
}