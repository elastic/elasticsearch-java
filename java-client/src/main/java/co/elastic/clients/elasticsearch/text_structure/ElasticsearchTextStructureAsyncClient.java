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
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
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
public class ElasticsearchTextStructureAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchTextStructureAsyncClient> {

	public ElasticsearchTextStructureAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchTextStructureAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTextStructureAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTextStructureAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: text_structure.find_field_structure

	/**
	 * Find the structure of a text field. Find the structure of a text field in an
	 * Elasticsearch index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/find-field-structure.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FindFieldStructureResponse> findFieldStructure(FindFieldStructureRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FindFieldStructureRequest, FindFieldStructureResponse, ErrorResponse> endpoint = (JsonEndpoint<FindFieldStructureRequest, FindFieldStructureResponse, ErrorResponse>) FindFieldStructureRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Find the structure of a text field. Find the structure of a text field in an
	 * Elasticsearch index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FindFieldStructureRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/find-field-structure.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FindFieldStructureResponse> findFieldStructure(
			Function<FindFieldStructureRequest.Builder, ObjectBuilder<FindFieldStructureRequest>> fn) {
		return findFieldStructure(fn.apply(new FindFieldStructureRequest.Builder()).build());
	}

	// ----- Endpoint: text_structure.find_message_structure

	/**
	 * Find the structure of text messages. Find the structure of a list of text
	 * messages. The messages must contain data that is suitable to be ingested into
	 * Elasticsearch.
	 * <p>
	 * This API provides a starting point for ingesting data into Elasticsearch in a
	 * format that is suitable for subsequent use with other Elastic Stack
	 * functionality. Use this API rather than the find text structure API if your
	 * input text has already been split up into separate messages by some other
	 * process. The response from the API contains:
	 * <ul>
	 * <li>Sample messages.</li>
	 * <li>Statistics that reveal the most common values for all fields detected
	 * within the text and basic numeric statistics for numeric fields.</li>
	 * <li>Information about the structure of the text, which is useful when you
	 * write ingest configurations to index it or similarly formatted text.
	 * Appropriate mappings for an Elasticsearch index, which you could use to
	 * ingest the text.</li>
	 * </ul>
	 * <p>
	 * All this information can be calculated by the structure finder with no
	 * guidance. However, you can optionally override some of the decisions about
	 * the text structure by specifying one or more query parameters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/find-message-structure.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FindMessageStructureResponse> findMessageStructure(FindMessageStructureRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FindMessageStructureRequest, FindMessageStructureResponse, ErrorResponse> endpoint = (JsonEndpoint<FindMessageStructureRequest, FindMessageStructureResponse, ErrorResponse>) FindMessageStructureRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Find the structure of text messages. Find the structure of a list of text
	 * messages. The messages must contain data that is suitable to be ingested into
	 * Elasticsearch.
	 * <p>
	 * This API provides a starting point for ingesting data into Elasticsearch in a
	 * format that is suitable for subsequent use with other Elastic Stack
	 * functionality. Use this API rather than the find text structure API if your
	 * input text has already been split up into separate messages by some other
	 * process. The response from the API contains:
	 * <ul>
	 * <li>Sample messages.</li>
	 * <li>Statistics that reveal the most common values for all fields detected
	 * within the text and basic numeric statistics for numeric fields.</li>
	 * <li>Information about the structure of the text, which is useful when you
	 * write ingest configurations to index it or similarly formatted text.
	 * Appropriate mappings for an Elasticsearch index, which you could use to
	 * ingest the text.</li>
	 * </ul>
	 * <p>
	 * All this information can be calculated by the structure finder with no
	 * guidance. However, you can optionally override some of the decisions about
	 * the text structure by specifying one or more query parameters.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FindMessageStructureRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/find-message-structure.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FindMessageStructureResponse> findMessageStructure(
			Function<FindMessageStructureRequest.Builder, ObjectBuilder<FindMessageStructureRequest>> fn) {
		return findMessageStructure(fn.apply(new FindMessageStructureRequest.Builder()).build());
	}

	// ----- Endpoint: text_structure.test_grok_pattern

	/**
	 * Test a Grok pattern. Test a Grok pattern on one or more lines of text. The
	 * API indicates whether the lines match the pattern together with the offsets
	 * and lengths of the matched substrings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/test-grok-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TestGrokPatternResponse> testGrokPattern(TestGrokPatternRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TestGrokPatternRequest, TestGrokPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<TestGrokPatternRequest, TestGrokPatternResponse, ErrorResponse>) TestGrokPatternRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Test a Grok pattern. Test a Grok pattern on one or more lines of text. The
	 * API indicates whether the lines match the pattern together with the offsets
	 * and lengths of the matched substrings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TestGrokPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/test-grok-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TestGrokPatternResponse> testGrokPattern(
			Function<TestGrokPatternRequest.Builder, ObjectBuilder<TestGrokPatternRequest>> fn) {
		return testGrokPattern(fn.apply(new TestGrokPatternRequest.Builder()).build());
	}

}
