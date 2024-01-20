import org.gradle.api.initialization.resolve.RepositoriesMode

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}


        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
            repositories {
                google()
                mavenCentral()
                jcenter() // Warning: this repository is going to shut down soon
                maven(url = uri("https://maven.google.com"))
            }
        }

rootProject.name = "ActividadAPI"
include(":app")
