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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.mapping.Property;
import co.elastic.clients.elasticsearch._types.mapping.TextProperty;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.TermQuery;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.indices.PutIndicesSettingsRequest;
import co.elastic.clients.elasticsearch.security.RoleTemplateScript;
import co.elastic.clients.testkit.ModelTestCase;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class WithJsonTest extends ModelTestCase {

    @Test
    public void testRequestWithGenericValueBody() {
        String json = "{\"foo\": \"bar\", \"baz\": 1}";

        IndexRequest<JsonData> req = IndexRequest.of(b -> b
            .index("index") // required path parameter (cannot be expressed in json)
            .withJson(new StringReader(json))
        );

        assertEquals("index", req.index());
        assertEquals("bar", req.document().toJson().asJsonObject().getString("foo"));
        assertEquals(1, req.document().toJson().asJsonObject().getInt("baz"));
    }

    @Test
    public void testRequestWithValueBody() {
        String json = "{" +
            "\"analyze\": {" +
            "    \"max_token_count\": 12" +
            "  }" +
            "}";

        PutIndicesSettingsRequest req = PutIndicesSettingsRequest.of(b -> b
            .withJson(new StringReader(json))
        );

        assertEquals(12, req.settings().analyze().maxTokenCount().intValue());
    }

    @Test
    public void testRegularObject() {
        String json = "{\"field\": \"foo\", \"id\": 12}";

        SlicedScroll s = SlicedScroll.of(b -> b
            .withJson(new StringReader(json))
            .max(34) // required property not present in the json
        );

        assertEquals("foo", s.field());
        assertEquals("12", s.id());
        assertEquals(34, s.max());
    }

    @Test
    public void testObjectWithGenericParam() {

        String json = "{" +
            "  \"took\" : 9," +
            "  \"timed_out\" : false," +
            "  \"_shards\" : {" +
            "    \"total\" : 1," +
            "    \"successful\" : 1," +
            "    \"skipped\" : 0," +
            "    \"failed\" : 0" +
            "  }," +
            "  \"hits\" : {" +
            "    \"total\" : {" +
            "      \"value\" : 1," +
            "      \"relation\" : \"eq\"" +
            "    }," +
            "    \"max_score\" : 1.0," +
            "    \"hits\" : [" +
            "      {" +
            "        \"_index\" : \"test\"," +
            "        \"_id\" : \"8aSerXUBs1w7Wkuj31zd\"," +
            "        \"_score\" : 1.0," +
            "        \"_source\" : {" +
            "          \"foo\" : \"bar\"" +
            "        }" +
            "      }" +
            "    ]" +
            "  }" +
            "}";

        // withJson() will read values of the generic parameter type as JsonData
        SearchResponse<JsonData> r = SearchResponse.of(b -> b
            .withJson(new StringReader(json))
        );

        assertEquals(1, r.hits().total().value());
        assertEquals("bar", r.hits().hits().get(0).source().toJson().asJsonObject().getString("foo"));
    }

    @Test
    public void testTypeWithParent() {

        String json = "{\"source\": \"return doc;\"}";

        Script is = Script.of(b -> b
            .withJson(new StringReader(json))
        );

        assertEquals("return doc;", is.source());
    }

    @Test
    public void testContainerTaggedUnion() {
        String json = "{" +
            "    \"term\": {" +
            "      \"user.id\": {" +
            "        \"value\": \"kimchy\"," +
            "        \"boost\": 1.0" +
            "      }" +
            "    }" +
            "  }";

        Query q = Query.of(b -> b
            .withJson(new StringReader(json))
        );

        TermQuery tq = q.term();
        assertEquals("user.id", tq.field());
        assertEquals("kimchy", tq.value().stringValue());
        assertEquals(1.0, tq.boost(), 0.001);
    }

    @Test
    public void testInternallyTaggedUnion() {
        String json = "{ " +
            "        \"type\": \"text\"," +
            "        \"fields\": {" +
            "          \"some_field\": { " +
            "            \"type\": \"keyword\"," +
            "            \"normalizer\": \"lowercase\"" +
            "          }" +
            "        }" +
            "      }";

        Property p = Property.of(b -> b
            .withJson(new StringReader(json))
        );

        TextProperty tp = p.text();
        assertEquals("lowercase", tp.fields().get("some_field").keyword().normalizer());
    }

    @Test
    public void testExternalTaggedUnion() {

        RoleTemplateScript withSource = RoleTemplateScript.of(j -> j
            .withJson(new StringReader("{\"source\": {\"match\": {\"category\": \"click\"}}}")));
        assertTrue(withSource.source().isQueryObject());
        RoleTemplateScript withStringSource = RoleTemplateScript.of(j -> j
            .withJson(new StringReader("{\"source\": \"string\"}")));
        assertTrue(withStringSource.source().isQueryString());
        RoleTemplateScript withStoredScript = RoleTemplateScript.of(j -> j
            .withJson(new StringReader("{\"id\": \"foo\"}")));
        assertTrue(!withStoredScript.id().isEmpty());
    }
}

