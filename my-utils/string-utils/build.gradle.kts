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

tasks.withType<Jar>() {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(libs.commons.lang3)

    testImplementation(kotlin("test"))
}
