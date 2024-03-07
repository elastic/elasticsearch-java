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

package co.elastic.clients.elasticsearch.text_structure;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Client for the text_structure namespace.
 */
public class ElasticsearchTextStructureClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchTextStructureClient> {

	public ElasticsearchTextStructureClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchTextStructureClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTextStructureClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTextStructureClient(this.transport, transportOptions);
	}

	// ----- Endpoint: text_structure.test_grok_pattern

	/**
	 * Tests a Grok pattern on some text.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/test-grok-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public TestGrokPatternResponse testGrokPattern(TestGrokPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TestGrokPatternRequest, TestGrokPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<TestGrokPatternRequest, TestGrokPatternResponse, ErrorResponse>) TestGrokPatternRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Tests a Grok pattern on some text.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TestGrokPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/test-grok-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TestGrokPatternResponse testGrokPattern(
			Function<TestGrokPatternRequest.Builder, ObjectBuilder<TestGrokPatternRequest>> fn)
			throws IOException, ElasticsearchException {
		return testGrokPattern(fn.apply(new TestGrokPatternRequest.Builder()).build());
	}

}
