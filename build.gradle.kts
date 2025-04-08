plugins {
    id("maven-publish")
    id("signing")
    kotlin("jvm") version "2.1.20"
}

group = "dev.junsung"
version = "0.0.3"

java {
    withJavadocJar()
    withSourcesJar()
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.tomcat.embed:tomcat-embed-core:11.0.5")
    implementation("org.springframework:spring-web:6.2.5")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
            from(components["java"])
            pom {
                name.set("Exception")
                description.set("A Kotlin library for handling HTTP exceptions in Spring applications.")
                url.set("https://github.com/junsung-cho/exception")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://github.com/junsung-cho/exception/blob/main/LICENSE")
                    }
                }
                scm {
                    url.set("https://github.com/junsung-cho/exception.git")
                }
                developers {
                    developer {
                        id.set("junsung")
                        name.set("Junsung Cho")
                        email.set("junsung.dev@gmail.com")
                    }
                }
            }
        }
    }
    repositories {
        mavenLocal()
    }
}

signing {
    sign(publishing.publications)
}
