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

package co.elastic.clients.elasticsearch.model;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMapperBase;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import org.junit.Test;

import java.io.StringReader;
import java.util.Set;
import java.util.stream.Collectors;

public class SerializationTest extends ModelTestCase {

    @Test
    public void loadAllDeserializers() throws Exception {

        ScanResult scan = new ClassGraph()
            .acceptPackages("co.elastic.clients")
            .enableAnnotationInfo()
            .enableFieldInfo()
            .scan();

        ClassInfoList withAnnotation = scan.getClassesWithAnnotation(JsonpDeserializable.class.getName());

        assertFalse("No JsonpDeserializable classes", withAnnotation.isEmpty());

        for (ClassInfo info: withAnnotation) {
            Class<?> clazz = Class.forName(info.getName());
            JsonpDeserializer<?> deserializer = JsonpMapperBase.findDeserializer(clazz);
            assertNotNull(deserializer);

            // Deserialize something dummy to resolve lazy deserializers
            JsonParser parser = mapper.jsonProvider().createParser(new StringReader("-"));
            assertThrows(JsonParsingException.class, () -> deserializer.deserialize(parser, mapper));
        }

        // Check that all classes that have a _DESERIALIZER field also have the annotation
        ClassInfoList withDeserializer = scan.getAllClasses().filter((c) -> c.hasDeclaredField("_DESERIALIZER"));
        assertFalse("No classes with a _DESERIALIZER field", withDeserializer.isEmpty());

// Disabled for now, empty response classes still need a deserializer
//        Set<String> annotationNames = withAnnotation.stream().map(c -> c.getName()).collect(Collectors.toSet());
//        Set<String> withFieldNames = withDeserializer.stream().map(c -> c.getName()).collect(Collectors.toSet());
//
//        withFieldNames.removeAll(annotationNames);
//
//        assertFalse("Some classes with the field but not the annotation: " + withFieldNames, !withFieldNames.isEmpty());

    }
}
