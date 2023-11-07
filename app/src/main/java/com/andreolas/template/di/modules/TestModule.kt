package com.andreolas.template.di.modules

import com.andreolas.di.DepsQualifiers
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val diModules = module {

  single(DepsQualifiers.androidContext) {
    androidContext()
  }

  factory(DepsQualifiers.NOW_LONG) {
    System.currentTimeMillis()
  }
}
