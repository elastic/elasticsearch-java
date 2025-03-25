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

package co.elastic.clients.rest5_client.elasticsearch.experiments.api.query2;

import co.elastic.clients.elasticsearch.experiments.api.query2.BoolQuery;
import co.elastic.clients.elasticsearch.experiments.api.query2.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class QueryTest extends Assertions {
    @Test
    public void testQuery() {
        co.elastic.clients.elasticsearch.experiments.api.query2.BoolQuery bq = new BoolQuery.Builder().build();

        co.elastic.clients.elasticsearch.experiments.api.query2.Query q = new co.elastic.clients.elasticsearch.experiments.api.query2.Query(bq);

        assertEquals(co.elastic.clients.elasticsearch.experiments.api.query2.Query.Kind.Bool, q._kind());

        co.elastic.clients.elasticsearch.experiments.api.query2.Query.Variant v = q._get();
        assertEquals(co.elastic.clients.elasticsearch.experiments.api.query2.Query.Kind.Bool, v._variantType());

        co.elastic.clients.elasticsearch.experiments.api.query2.Query q1 = v._toQuery();

        Collection<Query> must = q.bool().must();

    }
}
