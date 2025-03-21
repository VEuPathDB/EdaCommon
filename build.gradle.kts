import org.veupathdb.lib.gradle.container.util.Logger.Level

plugins {
  `java-library`
  `maven-publish`
  id("org.veupathdb.lib.gradle.container.container-utils") version "5.0.5"
}

// configure VEupathDB container plugin
containerBuild {

  // Change if debugging the build process is necessary.
  logLevel = Level.Info

  // General project level configuration.
  project {

    // Project Name
    name = "eda-common"

    // Project Group
    group = "org.veupathdb.service.eda"

    // Project Version
    version = "11.7.2"

    // Project Root Package
    projectPackage = "org.veupathdb.service.eda"

  }
}

java {
  sourceCompatibility = JavaVersion.VERSION_21
  targetCompatibility = JavaVersion.VERSION_21
  withSourcesJar()
  withJavadocJar()
}

tasks.register("print-version") { print(version) }

repositories {
  mavenCentral()
  maven {
    name = "GitHubPackages"
    url  = uri("https://maven.pkg.github.com/veupathdb/maven-packages")
    credentials {
      username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USERNAME")
      password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
    }
  }
}

// // // // // // // // // // // // // // // // // // // // // // // // // //
//
// Project Dependencies
//
// // // // // // // // // // // // // // // // // // // // // // // // // //

dependencies {

  implementation("org.junit.jupiter:junit-jupiter:5.8.1")
  // versions
  val fgputil = "2.12.18-jakarta" // FgpUtil version

  // FgpUtil
  implementation("org.gusdb:fgputil-core:${fgputil}")
  implementation("org.gusdb:fgputil-client:${fgputil}")

  // REngine Java client to RServe
  //implementation("org.rosuda.REngine:REngine:2.1.0")
  implementation("org.rosuda.REngine:Rserve:1.8.1")

  // Jackson
  implementation("com.fasterxml.jackson.core:jackson-databind:2.15.1")
  implementation("com.fasterxml.jackson.core:jackson-annotations:2.15.1")

  // Jersey
  implementation("org.glassfish.jersey.core:jersey-server:3.1.1")

  // Log4J
  implementation("org.apache.logging.log4j:log4j-api:2.20.0")
  implementation("org.apache.logging.log4j:log4j-core:2.20.0")

  // Unit Testing
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
  testImplementation("org.mockito:mockito-core:5.2.0")
}

tasks.jar {
  manifest {
    attributes["Implementation-Title"]   = project.name
    attributes["Implementation-Version"] = project.version
  }
  exclude("org/veupathdb/service/eda/generated/**")
}

val test by tasks.getting(Test::class) {
  // Use junit platform for unit tests
  useJUnitPlatform()
}

publishing {
  repositories {
    maven {
      name = "GitHub"
      url  = uri("https://maven.pkg.github.com/veupathdb/maven-packages")
      credentials {
        username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
        password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
      }
    }
  }
  publications {
    create<MavenPublication>("gpr") {
      from(components["java"])
      pom {
        name.set("EDA Common Library")
        description.set("Provides common schema and utilities for use in containerized VEuPathDB EDA services")
        url.set("https://github.com/VEuPathDB/EdaCommon")
        developers {
          developer {
            id.set("ryanrdoherty")
            name.set("Ryan Doherty")
            email.set("rdoherty@upenn.edu")
            url.set("https://github.com/ryanrdoherty")
            organization.set("VEuPathDB")
          }
        }
        scm {
          connection.set("scm:git:git://github.com/VEuPathDB/EdaCommon.git")
          developerConnection.set("scm:git:ssh://github.com/VEuPathDB/EdaCommon.git")
          url.set("https://github.com/VEuPathDB/EdaCommon")
        }
      }
    }
  }
}

