import modules.sharedModule
import modules.wModule

plugins {
  alias(libs.plugins.application)
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.ksp)
  alias(libs.plugins.detekt) version libs.versions.detekt
}

android {
  namespace = "com.andreolas.template"
  compileSdk = Versions.COMPILE_SDK_VERSION

  defaultConfig {
    applicationId = "com.andreolas.template"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }

    debug {
      applicationIdSuffix = ".debug"
      versionNameSuffix = " DEBUG"
    }
  }

  buildFeatures {
    buildConfig = true
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = libs.versions.compose.compiler.extesion.get()
  }

  packaging {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.lifecycle.runtime.ktx)
  implementation(libs.androidx.start.up)

  implementation(platform(libs.compose.bom))
  implementation(libs.compose.activity)
  implementation(libs.compose.ui)
  implementation(libs.compose.ui.graphics)
  implementation(libs.compose.ui.tooling.preview)
  implementation(libs.compose.material3)

  implementation(libs.timber)
  implementation(libs.koin)

  testImplementation(libs.junit)

  androidTestImplementation(libs.androidx.test.ext.junit)
  androidTestImplementation(libs.androidx.espresso.core)
  androidTestImplementation(platform(libs.compose.bom))
  androidTestImplementation(libs.compose.ui.test.junit4)
  debugImplementation(libs.compose.ui.tooling)
  debugImplementation(libs.compose.ui.test.manifest)

  // Custom modules
  implementation(wModule("di"))
  implementation(sharedModule("resources"))
}

koverReport {
  androidReports("debug") {
    filters {
      excludes {
        classes(
          "*Fragment",
          "*Activity",
          "*.BuildConfig",
          "*.BR",
          "*.databinding.*",
          "*Manifest*",
          "*androidx*",
        )
        annotatedBy(
          "*Composable*",
          "Preview",
        )
      }
    }

    html {
      setReportDir(layout.buildDirectory.dir("all-projects-reports"))
    }

    xml {
      setReportFile(layout.buildDirectory.file("all-projects-reports/kover.xml"))
    }
  }
}
