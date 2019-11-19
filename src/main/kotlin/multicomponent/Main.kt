package multicomponent

import multicomponent.context.AppContext
import multicomponent.di.DaggerAppComponent
import java.util.*

fun main() {
  val comp = DaggerAppComponent
    .factory().create(Scanner(System.`in`))
  AppContext.appComponent = comp
  comp.app().execute()
}


