// tag::app_dependencies[]
// tag::plugin_dependencies[]
plugins {
    java
    kotlin("jvm") version "2.3.20"
    kotlin("plugin.spring") version "2.3.20"
    id("org.springframework.boot") version "4.0.5"
//    id("io.spring.dependency-management") version "1.1.7"
//    kotlin("plugin.spring")
}
// end::plugin_dependencies[]

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}


java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

val mockitoAgent = configurations.create("mockitoAgent")


dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.sample:number-utils:1.0")
    implementation("org.sample:string-utils:1.0")

    implementation(libs.spring.boot.starter.webmvc)

    developmentOnly(libs.spring.boot.devtools)

    testImplementation(libs.spring.boot.starter.webmvc.test)

    testImplementation(libs.mockito.core)

    mockitoAgent("org.mockito:mockito-core:5.23.0") { isTransitive = false }

    testImplementation(libs.assertj)

    testImplementation(libs.junit.api)
    testRuntimeOnly(libs.junit.engine)
    testRuntimeOnly(libs.junit.launcher)
    implementation(kotlin("stdlib"))
}
// end::app_dependencies[]


tasks.withType<Test> {
    useJUnitPlatform()
    jvmArgs.add("-javaagent:${mockitoAgent.asPath}")
}



println("propertiesFileMessage = ${findProperty("propertiesFileMessage")}")
println("systemMessage = ${System.getProperty("systemMessage")}")
println("propertiesMessage = ${findProperty("propertiesMessage")}")
