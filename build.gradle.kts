plugins {
    kotlin("jvm") version "2.1.0"
    `maven-publish`
}

group = "com.biblecontentmedia.dailyverse.proto"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    api("com.google.protobuf:protobuf-kotlin:3.25.5")
    api("io.grpc:grpc-kotlin-stub:1.4.1")
    api("io.grpc:grpc-protobuf:1.69.0")
    api("javax.annotation:javax.annotation-api:1.3.2")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}

kotlin {
    jvmToolchain(21)
}

java {
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifactId = "daily-verse-proto"
        }
    }
}