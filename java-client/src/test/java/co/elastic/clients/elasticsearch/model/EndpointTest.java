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

import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch.indices.RefreshRequest;
import org.junit.Assert;
import org.junit.Test;

public class EndpointTest extends Assert {

    @Test
    public void testArrayPathParameter() {
        RefreshRequest req;

        req = RefreshRequest.of(b -> b);
        assertNotNull(req.index());
        assertEquals("/_refresh", RefreshRequest.ENDPOINT.requestUrl(req));

        req = RefreshRequest.of(b -> b.index("a"));
        assertEquals("/a/_refresh", RefreshRequest.ENDPOINT.requestUrl(req));

        req = RefreshRequest.of(b -> b.index("a", "b"));
        assertEquals("/a,b/_refresh", RefreshRequest.ENDPOINT.requestUrl(req));

        req = RefreshRequest.of(b -> b.index("a", "b", "c"));
        assertEquals("/a,b,c/_refresh", RefreshRequest.ENDPOINT.requestUrl(req));
    }

    @Test
    public void testPathEncoding() {
        RefreshRequest req;

        req = RefreshRequest.of(b -> b.index("a/b"));
        assertEquals("/a%2Fb/_refresh", RefreshRequest.ENDPOINT.requestUrl(req));

        req = RefreshRequest.of(b -> b.index("a/b", "c/d"));
        assertEquals("/a%2Fb,c%2Fd/_refresh", RefreshRequest.ENDPOINT.requestUrl(req));

    }

    @Test
    public void testArrayQueryParameter() {
        RefreshRequest req;

        req = RefreshRequest.of(b -> b);
        assertNotNull(req.expandWildcards()); // undefined list
        assertNull(RefreshRequest.ENDPOINT.queryParameters(req).get("expand_wildcards"));

        req = RefreshRequest.of(b -> b.expandWildcards(ExpandWildcardOptions.All));
        // Also tests query encoding of enums
        assertEquals("all", RefreshRequest.ENDPOINT.queryParameters(req).get("expand_wildcards"));

        req = RefreshRequest.of(b -> b.expandWildcards(ExpandWildcardOptions.All, ExpandWildcardOptions.Closed));
        assertEquals("all,closed", RefreshRequest.ENDPOINT.queryParameters(req).get("expand_wildcards"));
    }
}
