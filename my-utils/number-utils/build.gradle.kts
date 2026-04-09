plugins {
    kotlin("jvm") version "2.3.20"
    `java-library`
}

group = "org.sample"
version = "1.0"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test")) // The Kotlin test library
}

tasks.withType<Jar>() {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

println("propertiesFileMessage = ${findProperty("propertiesFileMessage")}")
println("systemMessage = ${System.getProperty("systemMessage")}")
println("propertiesMessage = ${findProperty("propertiesMessage")}")
