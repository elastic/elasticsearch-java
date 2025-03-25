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

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonParser;

import java.io.StringReader;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonValueParserTest extends Assertions {

    public static class Data {
        public Map<String, Object> data;
    }

    @Test
    public void testFloatsShouldDeserializeAsFloats() throws Exception {
        // When using Jackson to target a map of objects, values with a decimal separator
        // should deserialize as a double even if they fit in an int or long.
        // See https://github.com/elastic/elasticsearch-java/issues/156

        String json = "{\"data\": {\"value\": 1.4778125E7, \"value2\": 1.4778125E7 }}";
        JsonpMapper mapper = new JacksonJsonpMapper();

        {
            JsonParser parser = mapper.jsonProvider().createParser(new StringReader(json));
            Data data = mapper.deserialize(parser, Data.class);

            Double d = (Double)data.data.get("value");
            assertEquals(1.4778125E7, d, 0.001);
        }

        {
            // Test with buffering used in union resolution
            JsonParser parser = mapper.jsonProvider().createParser(new StringReader(json));
            parser.next();
            JsonObject object = parser.getObject();

            // Test equals/hashcode
            JsonValue v = object.getJsonObject("data").get("value");
            JsonValue v2 = object.getJsonObject("data").get("value2");

            assertEquals(v.hashCode(), v2.hashCode());
            assertEquals(v, v2);
            
            parser = JsonpUtils.jsonValueParser(object, mapper);
            Data data = mapper.deserialize(parser, Data.class);

            Double d = (Double)data.data.get("value");
            assertEquals(1.4778125E7, d, 0.001);
        }

    }
}
