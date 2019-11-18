package multicomponent.ext.di

import dagger.Component
import multicomponent.ext.JsonSerializer
import multicomponent.io.Printer

@Component(modules = arrayOf(JsonModule::class))
interface JsonComponent {

  fun serializer(): JsonSerializer

  fun printer(): Printer
}