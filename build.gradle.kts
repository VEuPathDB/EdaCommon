
plugins {
  `java-library`
  `maven-publish`
}

apply(from = "${projectDir.absolutePath}/dependencies.gradle.kts")
apply(from = "${projectDir.absolutePath}/test-summary.gradle")

java {
  targetCompatibility = JavaVersion.VERSION_15
  sourceCompatibility = JavaVersion.VERSION_15
}

// Project settings
group   = "org.veupathdb.service.eda"
version = "8.1.0"

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

java {
  withSourcesJar()
  withJavadocJar()
}

tasks.jar {
  manifest {
    attributes["Implementation-Title"]   = project.name
    attributes["Implementation-Version"] = project.version
  }
  exclude("org/veupathdb/service/eda/generated/**")
}

tasks.compileJava {
  doFirst {
    exec {
      commandLine("${projectDir.absolutePath}/.tools/bin/install-fgputil.sh",
        rootProject.projectDir.absolutePath)
    }
  }
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

//tasks.register<JacocoReport>("codeCoverageReport") {
//  executionData(fileTree(project.rootDir.absolutePath).include("**/build/jacoco/*.exec"))
//
//  subprojects.onEach {
//    sourceSets(it.sourceSets["main"])
//  }
//
//  reports {
//    xml.isEnabled = true
//    xml.destination = File("${buildDir}/reports/jacoco/report.xml")
//    html.isEnabled = false
//    csv.isEnabled = false
//  }
//
//  dependsOn("test")
//}
