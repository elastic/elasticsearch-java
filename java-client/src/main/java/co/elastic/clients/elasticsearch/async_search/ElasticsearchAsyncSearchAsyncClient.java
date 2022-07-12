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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the async_search namespace.
 */
public class ElasticsearchAsyncSearchAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchAsyncSearchAsyncClient> {

	public ElasticsearchAsyncSearchAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchAsyncSearchAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchAsyncSearchAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchAsyncSearchAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: async_search.delete

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAsyncSearchResponse> delete(DeleteAsyncSearchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse>) DeleteAsyncSearchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAsyncSearchResponse> delete(
			Function<DeleteAsyncSearchRequest.Builder, ObjectBuilder<DeleteAsyncSearchRequest>> fn) {
		return delete(fn.apply(new DeleteAsyncSearchRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.get

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(GetAsyncSearchRequest request,
			Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse>) GetAsyncSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.get.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(
			Function<GetAsyncSearchRequest.Builder, ObjectBuilder<GetAsyncSearchRequest>> fn,
			Class<TDocument> tDocumentClass) {
		return get(fn.apply(new GetAsyncSearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: async_search.status

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AsyncSearchStatusResponse> status(AsyncSearchStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse, ErrorResponse>) AsyncSearchStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AsyncSearchStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AsyncSearchStatusResponse> status(
			Function<AsyncSearchStatusRequest.Builder, ObjectBuilder<AsyncSearchStatusRequest>> fn) {
		return status(fn.apply(new AsyncSearchStatusRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.submit

	/**
	 * Executes a search request asynchronously.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(SubmitRequest request,
			Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse>) SubmitRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.submit.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Executes a search request asynchronously.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SubmitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(
			Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn, Class<TDocument> tDocumentClass) {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), tDocumentClass);
	}

}
