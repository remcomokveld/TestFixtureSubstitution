plugins {
    kotlin("jvm")
    `maven-publish`
    `java-test-fixtures`
}

group = "com.library"
version = "1.0.0"

publishing {
    publications {
        register<MavenPublication>("release") { from(components["java"]) }
    }
}
