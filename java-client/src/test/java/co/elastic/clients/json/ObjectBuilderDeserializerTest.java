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

package co.elastic.clients.json;

import co.elastic.clients.elasticsearch._types.mapping.TextProperty;
import co.elastic.clients.testkit.ModelTestCase;
import co.elastic.clients.elasticsearch.transform.UpdateTransformRequest;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class ObjectBuilderDeserializerTest extends ModelTestCase {

    @Test
    public void testNullObjectValue() {
        // Should also accept null for optional values
        String json = "{ \"index_prefixes\": null }";
        fromJson(json, TextProperty.class);
    }

    @Test
    public void testNullObjectValueInFunctionBuilder() {
        String json = "{\n" +
            "        \"retention_policy\": null\n" +
            "      }";

        UpdateTransformRequest.Builder builder = new UpdateTransformRequest.Builder();
        builder.transformId("foo");
        builder.withJson(new StringReader(json));
        builder.build();
    }

}
