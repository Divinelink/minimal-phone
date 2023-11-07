package com.andreolas.di

import org.koin.core.qualifier.named

/**
 * Registry of [org.koin.core.qualifier.Qualifier]s.
 *
 * Values that are separated with dot mean that it depends from another module. The left part of it
 * is the name of the module.
 * The right most value with : is the actual object.
 *
 * e.g.
 *
 * 'app:deserializer
 *
 * should be under app module and provides an object with value 'deserializer'
 *
 */
object DepsQualifiers {

  val androidContext = named("app.android.context")

  val NOW_LONG = named("app.now")

  object Template {
    val ENDPOINT = named("app.template:endpoint")
    val ENDPOINT_URL = named("app.template:endpoint:url")
    val KTOR = named("app.template:ktor")
  }
}
