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

package co.elastic.clients.json.jackson;

import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class JacksonMapperTest extends ModelTestCase {

    @Test
    public void testCustomDeserializer() {
        // See https://github.com/elastic/elasticsearch-java/issues/120
        JsonpMapper jsonpMapper = new JacksonJsonpMapper();

        String json = "{\"_index\":\"foo\",\"_id\":\"1\",\"_source\":{\"model\":\"Foo\",\"age\":42}}";

        Hit<TestData> testDataHit = fromJson(json,
            Hit.createHitDeserializer(JsonpDeserializer.of(TestData.class)),
            jsonpMapper
        );
        TestData data = testDataHit.source();
        assertEquals("Foo", data.theModel);
        assertEquals(42, data.theAge);
    }

    @JsonDeserialize(using = TestData.TestDeserializer.class)
    public static class TestData {
        public String theModel;
        public int theAge;

        public static class TestDeserializer extends JsonDeserializer<TestData> {

            @Override
            public TestData deserialize(JsonParser jp, DeserializationContext ctx) throws IOException {
                JsonNode node = jp.getCodec().readTree(jp);

                TestData res = new TestData();
                if (node.has("age")) {
                    res.theAge = node.get("age").asInt();
                }
                if (node.has("model")) {
                    res.theModel = node.get("model").asText();
                }
                return res;
            }
        }
    }

    @Test
    public void testSingleValueAsList() {
        JsonpMapper jsonpMapper = new JacksonJsonpMapper();

        String json = "{\"_index\":\"foo\",\"_id\":\"1\",\"_source\":{\"emp_no\":42,\"job_positions\":\"SWE\"}}";

        Hit<EmpData> testDataHit = fromJson(json,
            Hit.createHitDeserializer(JsonpDeserializer.of(EmpData.class)),
            jsonpMapper
        );
        EmpData data = testDataHit.source();
        assertEquals(42, data.empNo);
        assertEquals(Collections.singletonList("SWE"), data.jobPositions);
    }

    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EmpData {
        public int empNo;
        public List<String> jobPositions;
    }
}
