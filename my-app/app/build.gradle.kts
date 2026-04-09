// tag::app_dependencies[]
// tag::plugin_dependencies[]
plugins {
    id("application")
    kotlin("jvm") version "2.3.20"
    id("com.example.hello") // from the Included Build in pluginManagement
}
// end::plugin_dependencies[]

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}

application {
    mainClass = "org.sample.myapp.Main"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

tasks.withType<Jar>() {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

val mockitoAgent = configurations.create("mockitoAgent")


dependencies {
    implementation(kotlin("stdlib"))

    // Substituted by the included build "my-utils"
    implementation("org.sample:number-utils:1.0")
    implementation("org.sample:string-utils:1.0")

    testImplementation(libs.mockito.core)

    mockitoAgent("org.mockito:mockito-core:5.23.0") { isTransitive = false }

    testImplementation(libs.assertj)

    testImplementation(libs.junit.api)
    testRuntimeOnly(libs.junit.engine)
    testRuntimeOnly(libs.junit.launcher)
}
// end::app_dependencies[]


tasks.withType<Test> {
    useJUnitPlatform()
    jvmArgs.add("-javaagent:${mockitoAgent.asPath}")
}



println("propertiesFileMessage = ${findProperty("propertiesFileMessage")}")
println("systemMessage = ${System.getProperty("systemMessage")}")
println("propertiesMessage = ${findProperty("propertiesMessage")}")
