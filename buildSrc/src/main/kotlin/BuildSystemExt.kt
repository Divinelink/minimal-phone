import org.gradle.api.Project
import java.io.File

fun Project.buildscripts(buildscriptsFile: String): File {
  val buildSystemDir = File("$rootDir/buildscripts")
  return File(buildSystemDir, buildscriptsFile)
}
