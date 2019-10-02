plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("http://repo.maven.apache.org/maven2")
    }
}

dependencies {
    "implementation" ("com.fasterxml.jackson.core:jackson-annotations:2.9.10")
    "implementation" ("com.fasterxml.jackson.core:jackson-databind:2.9.10")
    "implementation" ("org.jetbrains:annotations:16.0.1")

    "compileOnly" ("org.immutables:value:2.8.0")
    "compileOnly" ("org.projectlombok:lombok:1.18.10")

    "annotationProcessor" ("org.immutables:value:2.8.0")
    "annotationProcessor" ("org.projectlombok:lombok:1.18.10")

    "testCompile" ("org.junit.jupiter:junit-jupiter:5.5.1")
    "testCompile" ("org.assertj:assertj-core:3.13.2")
    "testCompile"("commons-io:commons-io:2.6")
}

group = "org.motometer"
version = "0.0.3-SNAPSHOT"

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(sourceSets.main.get().allSource)
}

publishing {
    publications {
        register("maven", MavenPublication::class.java) {
            from(components["java"])
            artifact(sourcesJar.get())
        }
    }
}
