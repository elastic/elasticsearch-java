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

package co.elastic.clients.elasticsearch.dangling_indices;

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
 * Client for the dangling_indices namespace.
 */
public class ElasticsearchDanglingIndicesAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchDanglingIndicesAsyncClient> {

	public ElasticsearchDanglingIndicesAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchDanglingIndicesAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchDanglingIndicesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchDanglingIndicesAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: dangling_indices.delete_dangling_index

	/**
	 * Deletes the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteDanglingIndexResponse> deleteDanglingIndex(DeleteDanglingIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDanglingIndexRequest, DeleteDanglingIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDanglingIndexRequest, DeleteDanglingIndexResponse, ErrorResponse>) DeleteDanglingIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDanglingIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDanglingIndexResponse> deleteDanglingIndex(
			Function<DeleteDanglingIndexRequest.Builder, ObjectBuilder<DeleteDanglingIndexRequest>> fn) {
		return deleteDanglingIndex(fn.apply(new DeleteDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.import_dangling_index

	/**
	 * Imports the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ImportDanglingIndexResponse> importDanglingIndex(ImportDanglingIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ImportDanglingIndexRequest, ImportDanglingIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<ImportDanglingIndexRequest, ImportDanglingIndexResponse, ErrorResponse>) ImportDanglingIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Imports the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ImportDanglingIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ImportDanglingIndexResponse> importDanglingIndex(
			Function<ImportDanglingIndexRequest.Builder, ObjectBuilder<ImportDanglingIndexRequest>> fn) {
		return importDanglingIndex(fn.apply(new ImportDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.list_dangling_indices

	/**
	 * Returns all dangling indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ListDanglingIndicesResponse> listDanglingIndices() {
		return this.transport.performRequestAsync(ListDanglingIndicesRequest._INSTANCE,
				ListDanglingIndicesRequest._ENDPOINT, this.transportOptions);
	}

}
