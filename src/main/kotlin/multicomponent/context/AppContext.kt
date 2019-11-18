package multicomponent.context

import multicomponent.di.AppComponent

/**
 * This just contains a reference to the AppComponent if present
 */
object AppContext {
  var appComponent: AppComponent? = null
}
