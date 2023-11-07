plugins {
  alias(libs.plugins.com.android.library)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "com.andreolas.di"
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.koin)
}
