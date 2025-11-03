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

import com.github.jk1.license.ProjectData
import com.github.jk1.license.render.LicenseDataCollector
import com.github.jk1.license.render.ReportRenderer
import java.io.FileWriter

plugins {
    java
    `java-library`
    `maven-publish`
    publishing
    checkstyle
    signing
    id("com.github.jk1.dependency-license-report") version "2.2"
    id("de.thetaphi.forbiddenapis") version "3.4"
}

checkstyle {
    toolVersion = "10.16.0"
}

java {
    targetCompatibility = JavaVersion.VERSION_17
    sourceCompatibility = JavaVersion.VERSION_17

    withJavadocJar()
    withSourcesJar()
}

sourceSets {
    main {
        java.srcDir("src/main-flavored/java")
    }
}

forbiddenApis {
    signaturesFiles = files(File(rootProject.projectDir, "config/forbidden-apis.txt"))
    suppressAnnotations = setOf("co.elastic.clients.util.AllowForbiddenApis")
}

tasks.compileJava {
    options.release.set(17)
}

tasks.forbiddenApisMain {
    bundledSignatures = setOf("jdk-system-out")
}

tasks.getByName<ProcessResources>("processResources") {
    eachFile {
        if (name != "apis.json") {
            // Only process main source-set resources (test files are large)
            expand(
                    "version" to version,
                    "git_revision" to (if (rootProject.extra.has("gitHashFull")) rootProject.extra["gitHashFull"] else "unknown")
            )
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    doFirst {
        if (rootProject.extra.has("gitHashFull")) {
            val jar = this as Jar
            jar.manifest.attributes["X-Git-Revision"] = rootProject.extra["gitHashFull"]
            jar.manifest.attributes["X-Git-Commit-Time"] = rootProject.extra["gitCommitTime"]
        } else {
            throw GradleException("No git information available")
        }
    }

    manifest {
        attributes["Implementation-Title"] = "Elasticsearch Java client"
        attributes["Implementation-Vendor"] = "Elastic"
        attributes["Implementation-URL"] = "https://github.com/elastic/elasticsearch-java/"
        attributes["Build-Date"] = rootProject.extra["buildTime"]
    }

    metaInf {
        from("../LICENSE.txt")
        from("../NOTICE.txt")
    }
}

tasks.withType<Javadoc> {
    val opt = options as StandardJavadocDocletOptions
    // Gradle calls javadoc with a list of file and not a path. This prevents doc-files from being copied.
    opt.addStringOption("sourcepath", project.projectDir.path + "/src/main/java")
    opt.docFilesSubDirs(true)
    opt.addBooleanOption("Xdoclint:-missing", true)

    doLast {
        // Javadoc adds its decoration to html doc files, including quite some JS. This slows down the api spec
        // redirector that doesn't need it. So overwrite the target file with the original one.
        val specFile = "co/elastic/clients/elasticsearch/doc-files/api-spec.html"
        val source = File(project.projectDir, "src/main/java/" + specFile)
        val target = File(project.projectDir, "build/docs/javadoc/" + specFile)
        source.copyTo(target, overwrite = true)
    }
}

publishing {
    repositories {
        maven {
            // See https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry
            name = "ESJavaGithubPackages"
            url = uri("https://maven.pkg.github.com/elastic/elasticsearch-java")
            credentials(PasswordCredentials::class)
        }

        maven {
            name = "Build"
            url = uri("${rootProject.layout.buildDirectory.get().asFile}/repository")
        }
    }

    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("Elasticsearch Java API Client")
                artifactId = "elasticsearch-java"
                description.set("Elasticsearch Java API Client")
                url.set("https://github.com/elastic/elasticsearch-java/")
                licenses {
                    license {
                        name.set("The Apache Software License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        name.set("Elastic")
                        url.set("https://www.elastic.co")
                        inceptionYear.set("2020")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/elastic/elasticsearch-java.git")
                    developerConnection.set("scm:git:ssh://git@github.com:elastic/elasticsearch-java.git")
                    url.set("https://github.com/elastic/elasticsearch-java/")
                }
            }
        }
    }
}


signing {
    // Only sign if a key has been configured in gradle.properties
    isRequired = providers.gradleProperty("signing.keyId").isPresent
    sign(publishing.publications["maven"])
}

dependencies {
    val elasticsearchVersion = "9.2.0"
    val jacksonVersion = "2.18.3"
    val jackson3Version = "3.0.0"
    val openTelemetryVersion = "1.32.0"

    api(project(":rest5-client"))

    // Apache 2.0
    // https://www.elastic.co/guide/en/elasticsearch/client/java-rest/current/java-rest-low.html
    compileOnly("org.elasticsearch.client", "elasticsearch-rest-client", elasticsearchVersion)
    testImplementation("org.elasticsearch.client", "elasticsearch-rest-client", elasticsearchVersion)

    // Apache 2.0
    // https://hc.apache.org/httpcomponents-client-ga/
    api("org.apache.httpcomponents.client5","httpclient5","5.4.4")

    // Apache 2.0
    // https://search.maven.org/artifact/com.google.code.findbugs/jsr305
    api("com.google.code.findbugs:jsr305:3.0.2")

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://github.com/eclipse-ee4j/jsonp
    api("jakarta.json:jakarta.json-api:2.1.3")

    // Needed even if using Jackson to have an implementation of the Jsonp object model
    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://github.com/eclipse-ee4j/parsson
    api("org.eclipse.parsson:parsson:1.1.7")

    // Apache 2.0
    // http://commons.apache.org/logging/
    api("commons-logging:commons-logging:1.3.5")

    // OpenTelemetry API for native instrumentation of the client.
    // Apache 2.0
    // https://github.com/open-telemetry/opentelemetry-java
    implementation("io.opentelemetry", "opentelemetry-api", openTelemetryVersion)
    implementation("io.opentelemetry.semconv","opentelemetry-semconv", openTelemetryVersion)
    testImplementation("io.opentelemetry", "opentelemetry-sdk", openTelemetryVersion)

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://github.com/eclipse-ee4j/jsonb-api
    compileOnly("jakarta.json.bind", "jakarta.json.bind-api", "3.0.1")
    testImplementation("jakarta.json.bind", "jakarta.json.bind-api", "3.0.1")

    // Apache 2.0
    // https://github.com/FasterXML/jackson
    implementation("com.fasterxml.jackson.core", "jackson-core", jacksonVersion)
    implementation("com.fasterxml.jackson.core", "jackson-databind", jacksonVersion)

    // Apache 2.0
    // https://github.com/FasterXML/jackson
    implementation("tools.jackson.core", "jackson-databind", jackson3Version)
    implementation("tools.jackson.core", "jackson-core", jackson3Version)

    // EPL-2.0 OR BSD-3-Clause
    // https://eclipse-ee4j.github.io/yasson/
    testImplementation("org.eclipse", "yasson", "3.0.4")

    // Apache-2.0
    testImplementation("commons-io:commons-io:2.17.0")

    // EPL-2.0
    // https://junit.org/junit5/
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

    // MIT
    // https://github.com/classgraph/classgraph
    testImplementation("io.github.classgraph:classgraph:4.8.147")

    // MIT
    // https://www.testcontainers.org/
    testImplementation("org.testcontainers", "testcontainers", "1.17.3")
    testImplementation("org.testcontainers", "elasticsearch", "1.17.3")
    // updating transitive dependency from testcontainers
    testImplementation("org.apache.commons","commons-compress","1.26.1")

    // Apache-2.0
    // https://github.com/awaitility/awaitility
    testImplementation("org.awaitility", "awaitility", "4.2.0")

    // MIT
    // https://github.com/mockito/mockito
    testImplementation("org.mockito","mockito-core","5.12.0")

    // Apache-2.0
    // https://github.com/elastic/mocksocket
    testImplementation("org.elasticsearch","mocksocket","1.2")


}


licenseReport {
    renderers = arrayOf(SpdxReporter(File(rootProject.layout.buildDirectory.get().asFile, "release/dependencies.csv")))
    excludeGroups = arrayOf("org.elasticsearch.client")
}

class SpdxReporter(val dest: File) : ReportRenderer {
    // License names to their SPDX identifier
    val spdxIds = mapOf(
            "The Apache License, Version 2.0" to "Apache-2.0",
            "Apache License, Version 2.0" to "Apache-2.0",
            "The Apache Software License, Version 2.0" to "Apache-2.0",
            "Apache-2.0" to "Apache-2.0",
            "MIT License" to "MIT",
            "BSD Zero Clause License" to "0BSD",
            "Eclipse Public License 2.0" to "EPL-2.0",
            "Eclipse Public License v. 2.0" to "EPL-2.0",
            "Eclipse Public License - v 2.0" to "EPL-2.0",
            "GNU General Public License, version 2 with the GNU Classpath Exception" to "GPL-2.0 WITH Classpath-exception-2.0",
            "COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0" to "CDDL-1.0"
    )

    private fun quote(str: String): String {
        return if (str.contains(',') || str.contains("\"")) {
            "\"" + str.replace("\"", "\"\"") + "\""
        } else {
            str
        }
    }

    override fun render(data: ProjectData?) {
        dest.parentFile.mkdirs()
        FileWriter(dest).use { out ->
            out.append("name,url,version,revision,license\n")
            data?.allDependencies?.forEach { dep ->

                val depVersion = dep.version
                val depName = dep.group + ":" + dep.name

                val info = LicenseDataCollector.multiModuleLicenseInfo(dep)
                val depUrl = when(dep.group) {
                    "org.apache.httpcomponents.client5" -> "https://hc.apache.org/"
                    "org.apache.httpcomponents.core5" -> "https://hc.apache.org/"
                    "com.fasterxml.jackson" -> "https://github.com/FasterXML/jackson"
                    "tools.jackson" -> " https://github.com/FasterXML/jackson-bom "
                    else -> if (info.moduleUrls.isEmpty()) {
                                throw RuntimeException("No URL found for module '$depName'")
                            } else {
                                info.moduleUrls.first()
                            }
                }

                val licenseIds = info.licenses.mapNotNull { license ->
                    license.name?.let {
                        checkNotNull(spdxIds[it]) { "No SPDX identifier for $license" }
                    }
                }.toSet()

                // Combine multiple licenses.
                // See https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/#composite-license-expressions
                val licenseId = licenseIds.joinToString(" OR ")

                out.append("${quote(depName)},${quote(depUrl)},${quote(depVersion)},,${quote(licenseId)}\n")
            }
        }
    }
}
