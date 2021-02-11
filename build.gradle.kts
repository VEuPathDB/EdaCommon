import com.jfrog.bintray.gradle.BintrayExtension

plugins {
  `java-library`
  `maven-publish`
  id("com.jfrog.bintray") version "1.8.5"
}

apply(from = "${projectDir.absolutePath}/dependencies.gradle.kts")
apply(from = "${projectDir.absolutePath}/test-summary.gradle")

java {
  targetCompatibility = JavaVersion.VERSION_15
  sourceCompatibility = JavaVersion.VERSION_15
}

// Project settings
group   = "org.veupathdb.service.eda"
version = "1.0.0"

repositories {
  jcenter()
  mavenCentral()
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
      commandLine("${projectDir.absolutePath}/bin/install-fgputil.sh",
        rootProject.projectDir.absolutePath)
    }
  }
}

val test by tasks.getting(Test::class) {
  // Use junit platform for unit tests
  useJUnitPlatform()
}

publishing {
  publications {
    create<MavenPublication>("gpr") {
      from(components["java"])
      pom {
        name.set("EDA Common Library")
        description.set("Provides common schema and utilities for use in containerized VEuPathDB EDA services.")
        url.set("https://github.com/VEuPathDB/EdaCommon")
        developers {
          developer {
            id.set("ryanrdoherty")
            name.set("Ryan Doherty")
            email.set("epharper@upenn.edu")
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

bintray {
  user = project.findProperty("bintray.user") as String? ?: ""
  key  = project.findProperty("bintray.pass") as String? ?: ""
  publish = true
  setPublications("gpr")
  pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
    repo = "maven"
    name = "eda-common"
    userOrg = "veupathdb"
    setVersion(rootProject.version)
  })
}
