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

tasks.compileJava {
    options.release.set(17)
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
                name.set("Elasticsearch Rest5 Client")
                artifactId = "elasticsearch-rest5-client"
                description.set("Low level client based on http5")
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
    // Apache 2.0
    // https://hc.apache.org/httpcomponents-client-ga/
    api("org.apache.httpcomponents.client5","httpclient5","5.6")

    // Apache 2.0
    // http://commons.apache.org/logging/
    api("commons-logging:commons-logging:1.3.5")

    testImplementation("org.apache.commons:commons-lang3:3.14.0")
    testImplementation("junit:junit:4.13.2")

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://github.com/eclipse-ee4j/jsonp
    api("jakarta.json:jakarta.json-api:2.1.3")

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://github.com/eclipse-ee4j/parsson
    implementation("org.eclipse.parsson:parsson:1.1.7")

//    // Apache-2.0
//    testImplementation("commons-io:commons-io:2.17.0")

    // EPL-2.0
    // https://junit.org/junit5/
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

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
