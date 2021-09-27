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

import co.elastic.clients.elasticsearch._types.query_dsl.TermQuery;
import jakarta.json.JsonValue;
import org.junit.Test;

public class BehaviorsTest extends ModelTestCase {

    @Test
    public void testSingleKeyDictionary() {
        // Term query is used as a single key dict with a field key
        TermQuery tq = new TermQuery.Builder()
            .field("field-name")
            .value("some-value") // required field
            .build();

        tq = checkJsonRoundtrip(tq, "{\"field-name\":{\"value\":\"some-value\"}}");

        assertEquals("field-name", tq.field());
    }
}
