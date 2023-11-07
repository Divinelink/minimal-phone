package com.andreolas.di

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.qualifier.Qualifier

inline fun <reified T> getKoinInstance(dep: Qualifier): T {
  return object : KoinComponent {
    val value: T by inject(dep)
  }.value
}
