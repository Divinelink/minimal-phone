plugins {
  alias(libs.plugins.com.android.library)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.andreolas.shared.resources"

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.extesion.get()
  }
}

dependencies {
  implementation(platform(libs.compose.bom))
  implementation(libs.compose.activity)
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.graphics)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.ui.foundation)
  implementation(libs.compose.material3)
}
