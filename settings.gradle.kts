dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}
pluginManagement {
    plugins {
        kotlin("jvm") version "2.3.20"
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "multi-projects"

includeBuild("my-app")
// tag::inc[]
includeBuild("my-utils")
// end::inc[]
