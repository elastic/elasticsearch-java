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

import co.elastic.clients.elasticsearch.cat.NodesResponse;
import co.elastic.clients.elasticsearch.core.GetSourceResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapperBase;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.testkit.ModelTestCase;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;
import jakarta.json.Json;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonParser;
import jakarta.json.stream.JsonParsingException;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class SerializationTest extends ModelTestCase {

    @Test
    public void loadAllDeserializers() throws Exception {

        ScanResult scan = new ClassGraph()
            .acceptPackages("co.elastic.clients")
            .enableAnnotationInfo()
            .enableFieldInfo()
            .scan();

        ClassInfoList withAnnotation = scan.getClassesWithAnnotation(JsonpDeserializable.class.getName());

        assertFalse(withAnnotation.isEmpty(), "No JsonpDeserializable classes");

        for (ClassInfo info: withAnnotation) {
            Class<?> clazz = Class.forName(info.getName());
            JsonpDeserializer<?> deserializer = JsonpMapperBase.findDeserializer(clazz);
            assertNotNull(deserializer);

            // Deserialize something dummy to resolve lazy deserializers
            JsonParser parser = mapper.jsonProvider().createParser(new StringReader("-"));
            assertThrows(JsonParsingException.class, () -> deserializer.deserialize(parser, mapper), info.getName());
        }

        // Check that all classes that have a _DESERIALIZER field also have the annotation
        ClassInfoList withDeserializer = scan.getAllClasses().filter((c) -> c.hasDeclaredField("_DESERIALIZER"));
        assertFalse(withDeserializer.isEmpty(), "No classes with a _DESERIALIZER field");

// Disabled for now, empty response classes still need a deserializer object
// e.g. ExistsIndexTemplateResponse, PingResponse, ExistsResponse, ExistsAliasResponse
//
//        Set<String> annotationNames = withAnnotation.stream().map(c -> c.getName()).collect(Collectors.toSet());
//        Set<String> withFieldNames = withDeserializer.stream().map(c -> c.getName()).collect(Collectors.toSet());
//
//        withFieldNames.removeAll(annotationNames);
//
//        assertFalse(
//            withFieldNames.size() + " classes with the field but not the annotation: " + withFieldNames,
//            !withFieldNames.isEmpty()
//        );

    }

    @Test
    public void testArrayValueBody() {

        NodesResponse nr = NodesResponse.of(_0 -> _0
            .valueBody(_1 -> _1.bulkTotalOperations("1"))
            .valueBody(_1 -> _1.bulkTotalOperations("2"))
        );

        checkJsonRoundtrip(nr, "[{\"bulk.total_operations\":\"1\"},{\"bulk.total_operations\":\"2\"}]");

        assertEquals(2, nr.valueBody().size());
        assertEquals("1", nr.valueBody().get(0).bulkTotalOperations());
        assertEquals("2", nr.valueBody().get(1).bulkTotalOperations());
    }

    @Test
    public void testGenericValueBody() {

        GetSourceResponse<String> r = GetSourceResponse.of(_0 -> _0
            .valueBody("The value")
        );

        String json = toJson(r);
        assertEquals("\"The value\"", json);

        JsonpDeserializer<GetSourceResponse<String>> deserializer =
            GetSourceResponse.createGetSourceResponseDeserializer(JsonpDeserializer.stringDeserializer());

        r = deserializer.deserialize(mapper.jsonProvider().createParser(new StringReader(json)), mapper);

        assertEquals("The value", r.valueBody());

    }

    @Test
    public void testJsonpValuesToString() {

        assertEquals("foo", JsonpUtils.toString(Json.createValue("foo")));
        assertEquals("42", JsonpUtils.toString(Json.createValue(42)));
        assertEquals("42.1337", JsonpUtils.toString(Json.createValue(42.1337)));
        assertEquals("true", JsonpUtils.toString(JsonValue.TRUE));
        assertEquals("false", JsonpUtils.toString(JsonValue.FALSE));
        assertEquals("null", JsonpUtils.toString(JsonValue.NULL));
        assertEquals("a,b,c", JsonpUtils.toString(Json.createArrayBuilder().add("a").add("b").add("c").build()));

        assertThrows(IllegalArgumentException.class, () -> {
            JsonpUtils.toString(Json.createObjectBuilder().build());
        });
    }
}
