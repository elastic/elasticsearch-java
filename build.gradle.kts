/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

allprojects {
    group = "co.elastic.clients"
    version = (File(project.rootDir, "config/version.txt").readText().trim() + "-SNAPSHOT")

    repositories {
        maven {
            name = "Elastic-Snapshots"
            url = uri("https://snapshots.elastic.co/maven/")
        }
        mavenCentral()
    }

    apply(plugin = "checkstyle")
}

// Find git information.
// The ".git" directory may not exist when resolving dependencies in the Docker image build
if (File(rootProject.rootDir, ".git").exists()) {
    val grgit = org.ajoberstar.grgit.Grgit.open(mapOf("currentDir" to rootProject.rootDir))
    rootProject.extra["gitHashFull"] = grgit.head().id
    rootProject.extra["gitCommitTime"] = grgit.head().dateTime.withZoneSameLocal(java.time.ZoneOffset.UTC)
    grgit.close()
}

rootProject.extra["buildTime"] = java.time.Instant.now().atZone(java.time.ZoneOffset.UTC)

tasks.register<Task>(name = "resolveDependencies") {
    group = "Build Setup"
    description = "Resolves and prefetches dependencies"
    doLast {
        rootProject.allprojects.forEach {
            it.buildscript.configurations.filter(Configuration::isCanBeResolved).forEach { it.resolve() }
            it.configurations.filter(Configuration::isCanBeResolved).forEach { it.resolve() }
        }
    }
}

tasks.register<Task>(name = "publishForReleaseManager") {
    group = "Publishing"
    description = "Publishes artifacts in a format suitable for the Elastic release manager"
    dependsOn(
        ":java-client:publishAllPublicationsToBuildRepository",
        ":java-client:generateLicenseReport"
    )
    doLast {
        val version = this.project.version.toString()
        val isSnapshot = version.endsWith("SNAPSHOT")

        println("Releasing version $version")

        val releaseDir = File(rootProject.buildDir, "release")
        releaseDir.mkdirs()

        File(rootProject.buildDir, "repository/co/elastic/clients").listFiles()?.forEach { artifact ->
            println("Releasing artifact " + artifact.name)

            val versionDir = File(artifact, version)
            var gotPom = false;

            versionDir.listFiles()?.forEach { file ->
                if (file.name.endsWith(".jar") || file.name.endsWith(".pom")) {
                    var name = file.name

                    if (isSnapshot) {
                        if (file.name.endsWith(".pom")) {
                            if (gotPom) throw GradleException("Multiple snapshots found in " + file.parentFile)
                            gotPom = true
                        }
                        name = name.replace(Regex("-\\d{8}\\.\\d{6}-\\d+"), "-SNAPSHOT")
                    }

                    file.copyTo(File(releaseDir, name), overwrite = true)
                }
            }
        }
    }
}
