// The settings file is the entry point of every Gradle build.
// Its primary purpose is to define the subprojects.
// It is also used for some aspects of project-wide configuration, like managing plugins, dependencies, etc.
// https://docs.gradle.org/current/userguide/settings_file_basics.html

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

plugins {
    // Automatically downloads JDKs required by subprojects.
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

// https://docs.gradle.org/8.7/userguide/multi_project_builds.html
include(":utils")
include(":user-service")
include(":order-listener")

rootProject.name = "spring-microservices-template"