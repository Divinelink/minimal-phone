package modules

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

fun DependencyHandler.wModule(moduleNotation: String) = project(":modules:$moduleNotation")

fun DependencyHandler.sharedModule(moduleNotation: String) =
  project(":modules:shared-$moduleNotation")

fun DependencyHandler.featureModule(moduleNotation: String) =
  project(":modules:feature-$moduleNotation")

fun DependencyHandler.repoModule(moduleNotation: String) =
  project(":modules:repo-$moduleNotation")

fun DependencyHandler.apiModule(moduleNotation: String) =
  project(":modules:api-$moduleNotation")

fun DependencyHandler.domainModule(moduleNotation: String) =
  project(":modules:domain-$moduleNotation")

fun DependencyHandler.useCaseModule(moduleNotation: String) =
  project(":modules:usecase-$moduleNotation")
