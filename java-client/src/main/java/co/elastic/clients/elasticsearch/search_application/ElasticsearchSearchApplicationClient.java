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
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.lang.reflect.Type;
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
public class ElasticsearchSearchApplicationClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSearchApplicationClient> {

	public ElasticsearchSearchApplicationClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSearchApplicationClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSearchApplicationClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSearchApplicationClient(this.transport, transportOptions);
	}

	// ----- Endpoint: search_application.delete

	/**
	 * Delete a search application.
	 * <p>
	 * Remove a search application and its associated alias. Indices attached to the
	 * search application are not removed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-delete">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteSearchApplicationResponse delete(DeleteSearchApplicationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSearchApplicationRequest, DeleteSearchApplicationResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSearchApplicationRequest, DeleteSearchApplicationResponse, ErrorResponse>) DeleteSearchApplicationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a search application.
	 * <p>
	 * Remove a search application and its associated alias. Indices attached to the
	 * search application are not removed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSearchApplicationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-delete">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteSearchApplicationResponse delete(
			Function<DeleteSearchApplicationRequest.Builder, ObjectBuilder<DeleteSearchApplicationRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteSearchApplicationRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.delete_behavioral_analytics

	/**
	 * Delete a behavioral analytics collection. The associated data stream is also
	 * deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-delete-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteBehavioralAnalyticsResponse deleteBehavioralAnalytics(DeleteBehavioralAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteBehavioralAnalyticsRequest, DeleteBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteBehavioralAnalyticsRequest, DeleteBehavioralAnalyticsResponse, ErrorResponse>) DeleteBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a behavioral analytics collection. The associated data stream is also
	 * deleted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-delete-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteBehavioralAnalyticsResponse deleteBehavioralAnalytics(
			Function<DeleteBehavioralAnalyticsRequest.Builder, ObjectBuilder<DeleteBehavioralAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteBehavioralAnalytics(fn.apply(new DeleteBehavioralAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.get

	/**
	 * Get search application details.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get">Documentation
	 *      on elastic.co</a>
	 */

	public GetSearchApplicationResponse get(GetSearchApplicationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSearchApplicationRequest, GetSearchApplicationResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSearchApplicationRequest, GetSearchApplicationResponse, ErrorResponse>) GetSearchApplicationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get search application details.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSearchApplicationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSearchApplicationResponse get(
			Function<GetSearchApplicationRequest.Builder, ObjectBuilder<GetSearchApplicationRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetSearchApplicationRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.get_behavioral_analytics

	/**
	 * Get behavioral analytics collections.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public GetBehavioralAnalyticsResponse getBehavioralAnalytics(GetBehavioralAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetBehavioralAnalyticsRequest, GetBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetBehavioralAnalyticsRequest, GetBehavioralAnalyticsResponse, ErrorResponse>) GetBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get behavioral analytics collections.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public final GetBehavioralAnalyticsResponse getBehavioralAnalytics(
			Function<GetBehavioralAnalyticsRequest.Builder, ObjectBuilder<GetBehavioralAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getBehavioralAnalytics(fn.apply(new GetBehavioralAnalyticsRequest.Builder()).build());
	}

	/**
	 * Get behavioral analytics collections.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public GetBehavioralAnalyticsResponse getBehavioralAnalytics() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetBehavioralAnalyticsRequest.Builder().build(),
				GetBehavioralAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: search_application.list

	/**
	 * Get search applications. Get information about search applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list(ListRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get search applications. Get information about search applications.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public final ListResponse list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn)
			throws IOException, ElasticsearchException {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Get search applications. Get information about search applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-get-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: search_application.post_behavioral_analytics_event

	/**
	 * Create a behavioral analytics collection event.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-post-behavioral-analytics-event">Documentation
	 *      on elastic.co</a>
	 */

	public PostBehavioralAnalyticsEventResponse postBehavioralAnalyticsEvent(
			PostBehavioralAnalyticsEventRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostBehavioralAnalyticsEventRequest, PostBehavioralAnalyticsEventResponse, ErrorResponse> endpoint = (JsonEndpoint<PostBehavioralAnalyticsEventRequest, PostBehavioralAnalyticsEventResponse, ErrorResponse>) PostBehavioralAnalyticsEventRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a behavioral analytics collection event.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostBehavioralAnalyticsEventRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-post-behavioral-analytics-event">Documentation
	 *      on elastic.co</a>
	 */

	public final PostBehavioralAnalyticsEventResponse postBehavioralAnalyticsEvent(
			Function<PostBehavioralAnalyticsEventRequest.Builder, ObjectBuilder<PostBehavioralAnalyticsEventRequest>> fn)
			throws IOException, ElasticsearchException {
		return postBehavioralAnalyticsEvent(fn.apply(new PostBehavioralAnalyticsEventRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.put

	/**
	 * Create or update a search application.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-put">Documentation
	 *      on elastic.co</a>
	 */

	public PutResponse put(PutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a search application.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-put">Documentation
	 *      on elastic.co</a>
	 */

	public final PutResponse put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn)
			throws IOException, ElasticsearchException {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.put_behavioral_analytics

	/**
	 * Create a behavioral analytics collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-put-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public PutBehavioralAnalyticsResponse putBehavioralAnalytics(PutBehavioralAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutBehavioralAnalyticsRequest, PutBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutBehavioralAnalyticsRequest, PutBehavioralAnalyticsResponse, ErrorResponse>) PutBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a behavioral analytics collection.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-put-behavioral-analytics">Documentation
	 *      on elastic.co</a>
	 */

	public final PutBehavioralAnalyticsResponse putBehavioralAnalytics(
			Function<PutBehavioralAnalyticsRequest.Builder, ObjectBuilder<PutBehavioralAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return putBehavioralAnalytics(fn.apply(new PutBehavioralAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.render_query

	/**
	 * Render a search application query. Generate an Elasticsearch query using the
	 * specified query parameters and the search template associated with the search
	 * application or a default template if none is specified. If a parameter used
	 * in the search template is not specified in <code>params</code>, the
	 * parameter's default value will be used. The API returns the specific
	 * Elasticsearch query that would be generated and run by calling the search
	 * application search API.
	 * <p>
	 * You must have <code>read</code> privileges on the backing alias of the search
	 * application.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-render-query">Documentation
	 *      on elastic.co</a>
	 */

	public RenderQueryResponse renderQuery(RenderQueryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RenderQueryRequest, RenderQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<RenderQueryRequest, RenderQueryResponse, ErrorResponse>) RenderQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Render a search application query. Generate an Elasticsearch query using the
	 * specified query parameters and the search template associated with the search
	 * application or a default template if none is specified. If a parameter used
	 * in the search template is not specified in <code>params</code>, the
	 * parameter's default value will be used. The API returns the specific
	 * Elasticsearch query that would be generated and run by calling the search
	 * application search API.
	 * <p>
	 * You must have <code>read</code> privileges on the backing alias of the search
	 * application.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RenderQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-render-query">Documentation
	 *      on elastic.co</a>
	 */

	public final RenderQueryResponse renderQuery(
			Function<RenderQueryRequest.Builder, ObjectBuilder<RenderQueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return renderQuery(fn.apply(new RenderQueryRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.search

	/**
	 * Run a search application search. Generate and run an Elasticsearch query that
	 * uses the specified query parameteter and the search template associated with
	 * the search application or default template. Unspecified template parameters
	 * are assigned their default values if applicable.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchApplicationSearchResponse<TDocument> search(SearchApplicationSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse>) SearchApplicationSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:search_application.search.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchApplicationSearchResponse<TDocument> search(
			Function<SearchApplicationSearchRequest.Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchApplicationSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #search(SearchApplicationSearchRequest, Class)}, where
	 * Class is defined as Void, meaning the documents will not be deserialized.
	 */

	public SearchApplicationSearchResponse<Void> search(SearchApplicationSearchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<Void>, ErrorResponse>) SearchApplicationSearchRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #search(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final SearchApplicationSearchResponse<Void> search(
			Function<SearchApplicationSearchRequest.Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchApplicationSearchRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run a search application search. Generate and run an Elasticsearch query that
	 * uses the specified query parameteter and the search template associated with
	 * the search application or default template. Unspecified template parameters
	 * are assigned their default values if applicable.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchApplicationSearchResponse<TDocument> search(SearchApplicationSearchRequest request,
			Type tDocumentType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse>) SearchApplicationSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:search_application.search.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-search-application-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchApplicationSearchResponse<TDocument> search(
			Function<SearchApplicationSearchRequest.Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchApplicationSearchRequest.Builder()).build(), tDocumentType);
	}

}
