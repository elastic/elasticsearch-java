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
import java.lang.reflect.Type;
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
	 * Deletes an async search by identifier. If the search is still running, the
	 * search request will be cancelled. Otherwise, the saved search results are
	 * deleted. If the Elasticsearch security features are enabled, the deletion of
	 * a specific async search is restricted to: the authenticated user that
	 * submitted the original search request; users that have the
	 * <code>cancel_task</code> cluster privilege.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAsyncSearchResponse> delete(DeleteAsyncSearchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse>) DeleteAsyncSearchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an async search by identifier. If the search is still running, the
	 * search request will be cancelled. Otherwise, the saved search results are
	 * deleted. If the Elasticsearch security features are enabled, the deletion of
	 * a specific async search is restricted to: the authenticated user that
	 * submitted the original search request; users that have the
	 * <code>cancel_task</code> cluster privilege.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAsyncSearchResponse> delete(
			Function<DeleteAsyncSearchRequest.Builder, ObjectBuilder<DeleteAsyncSearchRequest>> fn) {
		return delete(fn.apply(new DeleteAsyncSearchRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.get

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its identifier. If the Elasticsearch security features are enabled, access to
	 * the results of a specific async search is restricted to the user or API key
	 * that submitted it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(GetAsyncSearchRequest request,
			Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse>) GetAsyncSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.get.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its identifier. If the Elasticsearch security features are enabled, access to
	 * the results of a specific async search is restricted to the user or API key
	 * that submitted it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(
			Function<GetAsyncSearchRequest.Builder, ObjectBuilder<GetAsyncSearchRequest>> fn,
			Class<TDocument> tDocumentClass) {
		return get(fn.apply(new GetAsyncSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its identifier. If the Elasticsearch security features are enabled, access to
	 * the results of a specific async search is restricted to the user or API key
	 * that submitted it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(GetAsyncSearchRequest request,
			Type tDocumentType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse>) GetAsyncSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.get.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its identifier. If the Elasticsearch security features are enabled, access to
	 * the results of a specific async search is restricted to the user or API key
	 * that submitted it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(
			Function<GetAsyncSearchRequest.Builder, ObjectBuilder<GetAsyncSearchRequest>> fn, Type tDocumentType) {
		return get(fn.apply(new GetAsyncSearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: async_search.status

	/**
	 * Get async search status Retrieves the status of a previously submitted async
	 * search request given its identifier, without retrieving search results. If
	 * the Elasticsearch security features are enabled, use of this API is
	 * restricted to the <code>monitoring_user</code> role.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AsyncSearchStatusResponse> status(AsyncSearchStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse, ErrorResponse>) AsyncSearchStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get async search status Retrieves the status of a previously submitted async
	 * search request given its identifier, without retrieving search results. If
	 * the Elasticsearch security features are enabled, use of this API is
	 * restricted to the <code>monitoring_user</code> role.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AsyncSearchStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AsyncSearchStatusResponse> status(
			Function<AsyncSearchStatusRequest.Builder, ObjectBuilder<AsyncSearchStatusRequest>> fn) {
		return status(fn.apply(new AsyncSearchStatusRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.submit

	/**
	 * Runs a search request asynchronously. When the primary sort of the results is
	 * an indexed field, shards get sorted based on minimum and maximum value that
	 * they hold for that field, hence partial results become available following
	 * the sort criteria that was requested. Warning: Async search does not support
	 * scroll nor search requests that only include the suggest section. By default,
	 * Elasticsearch doesn’t allow you to store an async search response larger than
	 * 10Mb and an attempt to do this results in an error. The maximum allowed size
	 * for a stored async search response can be set by changing the
	 * <code>search.max_async_search_response_size</code> cluster level setting.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(SubmitRequest request,
			Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse>) SubmitRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.submit.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Runs a search request asynchronously. When the primary sort of the results is
	 * an indexed field, shards get sorted based on minimum and maximum value that
	 * they hold for that field, hence partial results become available following
	 * the sort criteria that was requested. Warning: Async search does not support
	 * scroll nor search requests that only include the suggest section. By default,
	 * Elasticsearch doesn’t allow you to store an async search response larger than
	 * 10Mb and an attempt to do this results in an error. The maximum allowed size
	 * for a stored async search response can be set by changing the
	 * <code>search.max_async_search_response_size</code> cluster level setting.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SubmitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(
			Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn, Class<TDocument> tDocumentClass) {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Runs a search request asynchronously. When the primary sort of the results is
	 * an indexed field, shards get sorted based on minimum and maximum value that
	 * they hold for that field, hence partial results become available following
	 * the sort criteria that was requested. Warning: Async search does not support
	 * scroll nor search requests that only include the suggest section. By default,
	 * Elasticsearch doesn’t allow you to store an async search response larger than
	 * 10Mb and an attempt to do this results in an error. The maximum allowed size
	 * for a stored async search response can be set by changing the
	 * <code>search.max_async_search_response_size</code> cluster level setting.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(SubmitRequest request, Type tDocumentType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse>) SubmitRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.submit.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Runs a search request asynchronously. When the primary sort of the results is
	 * an indexed field, shards get sorted based on minimum and maximum value that
	 * they hold for that field, hence partial results become available following
	 * the sort criteria that was requested. Warning: Async search does not support
	 * scroll nor search requests that only include the suggest section. By default,
	 * Elasticsearch doesn’t allow you to store an async search response larger than
	 * 10Mb and an attempt to do this results in an error. The maximum allowed size
	 * for a stored async search response can be set by changing the
	 * <code>search.max_async_search_response_size</code> cluster level setting.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SubmitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(
			Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn, Type tDocumentType) {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), tDocumentType);
	}

}
