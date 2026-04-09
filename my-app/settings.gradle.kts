dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
// tag::mag[]
pluginManagement {
    includeBuild("my-plugin")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
// end::mag[]

rootProject.name = "my-app"

include("app")
include("rest-app")
