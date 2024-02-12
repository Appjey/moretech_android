pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://artifactory.2gis.dev/sdk-maven-release") }
//        maven { url = uri("http://maven.google.com/") }
    }
}

rootProject.name = "moretech_android"
include(":app")