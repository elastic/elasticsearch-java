---
mapped_pages:
  - https://www.elastic.co/guide/en/elasticsearch/client/java-api-client/current/java-rest-low-usage-shading.html
---

# Shading [java-rest-low-usage-shading]

In order to avoid version conflicts, the dependencies can be shaded and packaged within the client in a single JAR file (sometimes called an "uber JAR" or "fat JAR"). Shading a dependency consists of taking its content (resources files and Java class files) and renaming some of its packages before putting them in the same JAR file as the low-level Java REST client. Shading a JAR can be accomplished by 3rd-party plugins for Gradle and Maven.

Be advised that shading a JAR also has implications. Shading the Commons Logging layer, for instance, means that 3rd-party logging backends need to be shaded as well.

## Maven configuration [java-rest-low-usage-shading-maven]

Here is a configuration using the Maven [Shade](https://maven.apache.org/plugins/maven-shade-plugin/index.html) plugin. Add the following to your `pom.xml` file:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.1.0</version>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals><goal>shade</goal></goals>
                    <configuration>
                        <relocations>
                            <relocation>
                                <pattern>org.apache.http</pattern>
                                <shadedPattern>hidden.org.apache.http</shadedPattern>
                            </relocation>
                            <relocation>
                                <pattern>org.apache.logging</pattern>
                                <shadedPattern>hidden.org.apache.logging</shadedPattern>
                            </relocation>
                            <relocation>
                                <pattern>org.apache.commons.codec</pattern>
                                <shadedPattern>hidden.org.apache.commons.codec</shadedPattern>
                            </relocation>
                            <relocation>
                                <pattern>org.apache.commons.logging</pattern>
                                <shadedPattern>hidden.org.apache.commons.logging</shadedPattern>
                            </relocation>
                        </relocations>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```


## Gradle configuration [java-rest-low-usage-shading-gradle]

Here is a configuration using the Gradle [ShadowJar](https://github.com/johnrengelman/shadow) plugin. Add the following to your `build.gradle` file:

```groovy
shadowJar {
    relocate 'org.apache.http', 'hidden.org.apache.http'
    relocate 'org.apache.logging', 'hidden.org.apache.logging'
    relocate 'org.apache.commons.codec', 'hidden.org.apache.commons.codec'
    relocate 'org.apache.commons.logging', 'hidden.org.apache.commons.logging'
}
```


