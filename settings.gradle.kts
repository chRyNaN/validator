pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        maven("https://repo.repsy.io/mvn/chrynan/public")
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        maven("https://repo.repsy.io/mvn/chrynan/public")
    }
}

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"

    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.3"
}

rootProject.name = "validator"

include(":validator-core")
include(":validator-field")
include(":validator-email")
include(":validator-web")
include(":validator-phone")
include(":validator-mac")
include(":validator-dynamic-string")
