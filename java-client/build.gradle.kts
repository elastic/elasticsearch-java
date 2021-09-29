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
import com.github.jk1.license.render.ReportRenderer
import java.io.FileWriter

plugins {
    java
    checkstyle
    `maven-publish`
    id("com.github.jk1.dependency-license-report") version "1.17"
}

java {
    targetCompatibility = JavaVersion.VERSION_1_8
    sourceCompatibility = JavaVersion.VERSION_1_8

    withJavadocJar()
    withSourcesJar()
}

tasks.withType<Jar> {
    doFirst {
        if (rootProject.extra.has("gitHashFull")) {
            val jar = this as Jar
            jar.manifest.attributes["X-Git-Revision"] = rootProject.extra["gitHashFull"]
            jar.manifest.attributes["X-Git-Commit-Time"] = rootProject .extra["gitCommitTime"]
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
            url = uri("${rootProject.buildDir}/repository")
        }
    }

    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("Elasticsearch Java Client")
                artifactId = "elasticsearch-java"
                description.set("Next-gen Elasticsearch Java Client")
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

dependencies {
    val elasticsearchVersion = "7.15.0"
    val jacksonVersion = "2.12.0"

    // Apache 2.0
    // https://www.elastic.co/guide/en/elasticsearch/client/java-rest/current/java-rest-low.html
    implementation("org.elasticsearch.client", "elasticsearch-rest-client", elasticsearchVersion)

    // Apache 2.0
    // https://search.maven.org/artifact/com.google.code.findbugs/jsr305
    implementation("com.google.code.findbugs:jsr305:3.0.2")

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://eclipse-ee4j.github.io/jsonp/
    implementation("jakarta.json", "jakarta.json-api", "2.0.1")

    // Needed even if using Jackson to have an implementation of the Jsonp object model
    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // https://github.com/eclipse-ee4j/jsonp
    implementation("org.glassfish", "jakarta.json", "2.0.1")

    // EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
    // http://json-b.net/
    compileOnly("jakarta.json.bind", "jakarta.json.bind-api", "2.0.0")
    testImplementation("jakarta.json.bind", "jakarta.json.bind-api", "2.0.0")

    // Apache 2.0
    // https://github.com/FasterXML/jackson
    compileOnly("com.fasterxml.jackson.core", "jackson-core", jacksonVersion)
    compileOnly("com.fasterxml.jackson.core", "jackson-databind", jacksonVersion)
    testImplementation("com.fasterxml.jackson.core", "jackson-core", jacksonVersion)
    testImplementation("com.fasterxml.jackson.core", "jackson-databind", jacksonVersion)

    // EPL-2.0 OR BSD-3-Clause
    // https://eclipse-ee4j.github.io/yasson/
    testImplementation("org.eclipse", "yasson", "2.0.2")

    // EPL-1.0
    // https://junit.org/junit4/
    testImplementation("junit", "junit" , "4.12")

    // MIT
    // https://github.com/classgraph/classgraph
    testImplementation("io.github.classgraph:classgraph:4.8.116")

    // MIT
    // https://www.testcontainers.org/
    testImplementation("org.testcontainers", "testcontainers", "1.15.3")
    testImplementation("org.testcontainers", "elasticsearch", "1.15.3")
}


licenseReport {
    renderers = arrayOf(SpdxReporter(File(rootProject.buildDir, "release/dependencies.csv")))
    excludeGroups = arrayOf("org.elasticsearch.client")
}

class SpdxReporter(val dest: File) : ReportRenderer {
    // License names to their SPDX identifier
    val spdxIds = mapOf(
        "Apache License, Version 2.0" to "Apache-2.0",
        "The Apache Software License, Version 2.0" to "Apache-2.0",
        "BSD Zero Clause License" to "0BSD",
        "Eclipse Public License 2.0" to "EPL-2.0",
        "Eclipse Public License v. 2.0" to "EPL-2.0",
        "GNU General Public License, version 2 with the GNU Classpath Exception" to "GPL-2.0 WITH Classpath-exception-2.0",
        "COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0" to "CDDL-1.0"
    )

    private fun quote(str: String) : String {
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
                val info = com.github.jk1.license.render.LicenseDataCollector.multiModuleLicenseInfo(dep)

                val depVersion = dep.version
                val depName = dep.group + ":" + dep.name
                val depUrl = info.moduleUrls.first()

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
