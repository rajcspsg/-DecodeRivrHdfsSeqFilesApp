plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation ( "org.apache.hadoop:hadoop-common:2.8.0")
    implementation("org.apache.avro:avro:1.8.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}