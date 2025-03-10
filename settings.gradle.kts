pluginManagement {
    fun requireNonBlankGitHubCred(key: String, env: String) =
        if (extra.has(key)) {
            with(extra[key] as String?) {
                if (isNullOrBlank()) {
                    println("Gradle property \"$key\" has been set to a null or blank value.")
                    throw RuntimeException("Gradle property \"$key\" has been set to a null or blank value.")
                }

                this
            }
        } else {
            with(System.getenv(env)) {
                if (isNullOrBlank()) {
                    println("Environment variable \"$env\" is missing or blank and no \"$key\" gradle property was present.")
                    throw RuntimeException("Environment variable \"$env\" is missing or blank and no \"$key\" gradle property was present.")
                }

                this
            }
        }

    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven {
            name = "GitHubPackages"
            url  = uri("https://maven.pkg.github.com/veupathdb/maven-packages")
            credentials {
                username = requireNonBlankGitHubCred("gpr.user", "GITHUB_USERNAME")
                password = requireNonBlankGitHubCred("gpr.key", "GITHUB_TOKEN")
            }
        }
    }
}


rootProject.name = "eda-common"
