
// Project settings
group   = "org.veupathdb.service.eda"
version = "9.0.0"

plugins {
  `java-library`
  `maven-publish`
}

apply(from = "${projectDir.absolutePath}/test-summary.gradle")

java {
  targetCompatibility = JavaVersion.VERSION_15
  sourceCompatibility = JavaVersion.VERSION_15
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

  // versions
  val jackson = "2.13.3"      // FasterXML Jackson version
  val jersey  = "3.0.4"       // Jersey/JaxRS version
  val log4j   = "2.17.2"      // Log4J version
  val fgputil = "2.5-jakarta" // FgpUtil version

  // FgpUtil
  implementation("org.gusdb:fgputil-core:${fgputil}")
  implementation("org.gusdb:fgputil-client:${fgputil}")

  // Jackson
  implementation("com.fasterxml.jackson.core:jackson-databind:${jackson}")
  implementation("com.fasterxml.jackson.core:jackson-annotations:${jackson}")

  // Log4J
  implementation("org.apache.logging.log4j:log4j-api:${log4j}")
  implementation("org.apache.logging.log4j:log4j-core:${log4j}")

  // Unit Testing
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
  testImplementation("org.mockito:mockito-core:2.+")
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

