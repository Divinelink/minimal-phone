package com.andreolas.template.initializers

import android.content.Context
import androidx.startup.Initializer
import com.andreolas.template.di.modules.diModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
class KoinInitializer : Initializer<Unit> {

  override fun create(context: Context) {
    startKoin {
      androidLogger()
      androidContext(context)
      modules(
        diModules,
        )
    }
  }

  override fun dependencies(): List<Class<out Initializer<*>>> = listOf(
    TimberInitializer::class.java
  )
}
