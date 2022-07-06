plugins {
    kotlin("jvm") version "1.7.0"
    `java-library`
}

group = "dev.nicolai"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://libraries.minecraft.net")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    api("com.mojang", "brigadier", "1.0.18")
}
