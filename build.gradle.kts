plugins {
    id("java")
}

group = "ru.netologia"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13")
}

tasks.test {
    useJUnit()
}