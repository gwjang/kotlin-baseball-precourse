plugins {
    kotlin("jvm") version "1.9.0"
}

group = "camp.nextstep.edu"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain(17)
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter", "5.10.2")
    testImplementation("org.assertj", "assertj-core", "3.25.3")
    testImplementation("io.kotest:kotest-runner-junit5:5.6.0")
    testImplementation("io.kotest:kotest-assertions-core:5.6.0")
    testImplementation("io.kotest:kotest-property:5.6.0")
    testImplementation("io.kotest:kotest-framework-datatest:5.6.0")
    testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.3")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
