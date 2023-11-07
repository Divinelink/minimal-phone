package modules

import org.gradle.api.Project
import java.io.File
import java.io.FileInputStream
import java.util.Properties

private const val CONFIG_PROPERTIES_FILENAME = "config.properties"

fun Project.getConfigsFor(variantName: String): Properties {
  val rootDir = "$rootDir/app/src/$variantName"
  val configProps = File(rootDir, CONFIG_PROPERTIES_FILENAME)
  val props = Properties()

  if (configProps.exists()) {
    props.load(FileInputStream(configProps))
  } else {
    println("Warning: $variantName build type does have a config.properties specified")
    println("We fill its properties with empty.")
  }

  return props
}

fun Properties.propOrDef(propertyName: String) = this.getOrElse(propertyName) { "\"\"" }

fun Project.gitSha(): String {
  val gitOutput = StringBuilder()
  val hasGit: Boolean = project.rootProject.file(".git").exists() ||
    project.file(".git").exists()

  if (hasGit) {
    val command = Runtime.getRuntime().exec("git rev-parse --short HEAD")
    command.inputStream.bufferedReader().use {
      gitOutput.append(it.readText())
    }
  }
  return gitOutput.toString().trim()
}
