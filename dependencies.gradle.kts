val jackson = "2.12.2" // FasterXML Jackson version
val jersey  = "3.0.4"  // Jersey/JaxRS version
val junit   = "5.7.1"  // JUnit version
val log4j   = "2.16.0" // Log4J version

val implementation      by configurations
val testImplementation  by configurations
val runtimeOnly         by configurations
val annotationProcessor by configurations
val testRuntimeOnly     by configurations

dependencies {

  // // // // // // // // // // // // // // // // // // // // // // // // // //
  //
  // FgpUtil & Compatibility Dependencies
  //
  // // // // // // // // // // // // // // // // // // // // // // // // // //

  // FgpUtil jars
  implementation(files(
    "${rootProject.projectDir.absolutePath}/vendor/fgputil-core-1.0.0.jar",
    "${rootProject.projectDir.absolutePath}/vendor/fgputil-client-1.0.0.jar",
    "${rootProject.projectDir.absolutePath}/vendor/fgputil-json-1.0.0.jar",
    "${rootProject.projectDir.absolutePath}/vendor/fgputil-web-1.0.0.jar"
  ))

  implementation("org.json:json:20190722")

  // Compatibility bridge to support the long dead log4j-1.X
  runtimeOnly("org.apache.logging.log4j:log4j-1.2-api:${log4j}")

  // // // // // // // // // // // // // // // // // // // // // // // // // //
  //
  // Project Dependencies
  //
  // // // // // // // // // // // // // // // // // // // // // // // // // //

  //
  // (De)Serialization stuff
  //

  // Jersey
  implementation("org.glassfish.jersey.containers:jersey-container-grizzly2-http:${jersey}")
  implementation("org.glassfish.jersey.containers:jersey-container-grizzly2-servlet:${jersey}")
  implementation("org.glassfish.jersey.media:jersey-media-json-jackson:${jersey}")
  implementation("org.glassfish.jersey.core:jersey-client:${jersey}")
  runtimeOnly("org.glassfish.jersey.inject:jersey-hk2:${jersey}")

  // Jackson
  implementation("com.fasterxml.jackson.core:jackson-databind:${jackson}")
  implementation("com.fasterxml.jackson.core:jackson-annotations:${jackson}")
  implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:${jackson}")

  //
  // Logging Stuff
  //

  // Log4J
  implementation("org.apache.logging.log4j:log4j-api:${log4j}")
  implementation("org.apache.logging.log4j:log4j-core:${log4j}")
  implementation("org.apache.logging.log4j:log4j:${log4j}")

  //
  // Testing Stuff
  //

  // Unit Testing
  testImplementation("org.junit.jupiter:junit-jupiter:${junit}")
  testImplementation("org.mockito:mockito-core:2.+")
}
