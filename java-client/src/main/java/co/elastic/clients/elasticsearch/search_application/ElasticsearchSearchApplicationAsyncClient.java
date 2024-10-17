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

package co.elastic.clients.elasticsearch.search_application;

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
 * Client for the search_application namespace.
 */
public class ElasticsearchSearchApplicationAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSearchApplicationAsyncClient> {

	public ElasticsearchSearchApplicationAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSearchApplicationAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSearchApplicationAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSearchApplicationAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: search_application.delete

	/**
	 * Delete a search application. Remove a search application and its associated
	 * alias. Indices attached to the search application are not removed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteSearchApplicationResponse> delete(DeleteSearchApplicationRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSearchApplicationRequest, DeleteSearchApplicationResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSearchApplicationRequest, DeleteSearchApplicationResponse, ErrorResponse>) DeleteSearchApplicationRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a search application. Remove a search application and its associated
	 * alias. Indices attached to the search application are not removed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSearchApplicationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteSearchApplicationResponse> delete(
			Function<DeleteSearchApplicationRequest.Builder, ObjectBuilder<DeleteSearchApplicationRequest>> fn) {
		return delete(fn.apply(new DeleteSearchApplicationRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.delete_behavioral_analytics

	/**
	 * Delete a behavioral analytics collection. The associated data stream is also
	 * deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteBehavioralAnalyticsResponse> deleteBehavioralAnalytics(
			DeleteBehavioralAnalyticsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteBehavioralAnalyticsRequest, DeleteBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteBehavioralAnalyticsRequest, DeleteBehavioralAnalyticsResponse, ErrorResponse>) DeleteBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a behavioral analytics collection. The associated data stream is also
	 * deleted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteBehavioralAnalyticsResponse> deleteBehavioralAnalytics(
			Function<DeleteBehavioralAnalyticsRequest.Builder, ObjectBuilder<DeleteBehavioralAnalyticsRequest>> fn) {
		return deleteBehavioralAnalytics(fn.apply(new DeleteBehavioralAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.get

	/**
	 * Get search application details.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSearchApplicationResponse> get(GetSearchApplicationRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSearchApplicationRequest, GetSearchApplicationResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSearchApplicationRequest, GetSearchApplicationResponse, ErrorResponse>) GetSearchApplicationRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get search application details.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSearchApplicationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSearchApplicationResponse> get(
			Function<GetSearchApplicationRequest.Builder, ObjectBuilder<GetSearchApplicationRequest>> fn) {
		return get(fn.apply(new GetSearchApplicationRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.get_behavioral_analytics

	/**
	 * Get behavioral analytics collections.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetBehavioralAnalyticsResponse> getBehavioralAnalytics(
			GetBehavioralAnalyticsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetBehavioralAnalyticsRequest, GetBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetBehavioralAnalyticsRequest, GetBehavioralAnalyticsResponse, ErrorResponse>) GetBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get behavioral analytics collections.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetBehavioralAnalyticsResponse> getBehavioralAnalytics(
			Function<GetBehavioralAnalyticsRequest.Builder, ObjectBuilder<GetBehavioralAnalyticsRequest>> fn) {
		return getBehavioralAnalytics(fn.apply(new GetBehavioralAnalyticsRequest.Builder()).build());
	}

	/**
	 * Get behavioral analytics collections.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetBehavioralAnalyticsResponse> getBehavioralAnalytics() {
		return this.transport.performRequestAsync(new GetBehavioralAnalyticsRequest.Builder().build(),
				GetBehavioralAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: search_application.list

	/**
	 * Returns the existing search applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-search-applications.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list(ListRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the existing search applications.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-search-applications.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ListResponse> list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn) {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Returns the existing search applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-search-applications.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list() {
		return this.transport.performRequestAsync(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: search_application.put

	/**
	 * Create or update a search application.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutResponse> put(PutRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a search application.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutResponse> put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn) {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.put_behavioral_analytics

	/**
	 * Create a behavioral analytics collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutBehavioralAnalyticsResponse> putBehavioralAnalytics(
			PutBehavioralAnalyticsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutBehavioralAnalyticsRequest, PutBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutBehavioralAnalyticsRequest, PutBehavioralAnalyticsResponse, ErrorResponse>) PutBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a behavioral analytics collection.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutBehavioralAnalyticsResponse> putBehavioralAnalytics(
			Function<PutBehavioralAnalyticsRequest.Builder, ObjectBuilder<PutBehavioralAnalyticsRequest>> fn) {
		return putBehavioralAnalytics(fn.apply(new PutBehavioralAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.search

	/**
	 * Run a search application search. Generate and run an Elasticsearch query that
	 * uses the specified query parameteter and the search template associated with
	 * the search application or default template. Unspecified template parameters
	 * are assigned their default values if applicable.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SearchApplicationSearchResponse<TDocument>> search(
			SearchApplicationSearchRequest request, Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse>) SearchApplicationSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:search_application.search.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a search application search. Generate and run an Elasticsearch query that
	 * uses the specified query parameteter and the search template associated with
	 * the search application or default template. Unspecified template parameters
	 * are assigned their default values if applicable.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchApplicationSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SearchApplicationSearchResponse<TDocument>> search(
			Function<SearchApplicationSearchRequest.Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn,
			Class<TDocument> tDocumentClass) {
		return search(fn.apply(new SearchApplicationSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Run a search application search. Generate and run an Elasticsearch query that
	 * uses the specified query parameteter and the search template associated with
	 * the search application or default template. Unspecified template parameters
	 * are assigned their default values if applicable.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SearchApplicationSearchResponse<TDocument>> search(
			SearchApplicationSearchRequest request, Type tDocumentType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse>) SearchApplicationSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:search_application.search.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a search application search. Generate and run an Elasticsearch query that
	 * uses the specified query parameteter and the search template associated with
	 * the search application or default template. Unspecified template parameters
	 * are assigned their default values if applicable.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchApplicationSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SearchApplicationSearchResponse<TDocument>> search(
			Function<SearchApplicationSearchRequest.Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn,
			Type tDocumentType) {
		return search(fn.apply(new SearchApplicationSearchRequest.Builder()).build(), tDocumentType);
	}

}
