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

package co.elastic.clients.util;

import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch._types.aggregations.TermsAggregation;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Test;

class NamedValueTest extends ModelTestCase {

    @Test
    public void testTermAggregation() {

        String json = "{\"order\":[{\"a\":\"asc\"},{\"b\":\"desc\"}]}";

        TermsAggregation ta = TermsAggregation.of(b -> b
            .order(NamedValue.of("a", SortOrder.Asc))
            .order(NamedValue.of("b", SortOrder.Desc)
            )
        );

        ta = checkJsonRoundtrip(ta, json);

        assertEquals(2, ta.order().size());

        assertEquals("a", ta.order().get(0).name());
        assertEquals(SortOrder.Asc, ta.order().get(0).value());
        assertEquals("b", ta.order().get(1).name());
        assertEquals(SortOrder.Desc, ta.order().get(1).value());
    }
}
