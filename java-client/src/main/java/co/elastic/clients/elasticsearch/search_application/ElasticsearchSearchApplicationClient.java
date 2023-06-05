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
	 * Deletes a search application.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteSearchApplicationResponse delete(DeleteSearchApplicationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSearchApplicationRequest, DeleteSearchApplicationResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSearchApplicationRequest, DeleteSearchApplicationResponse, ErrorResponse>) DeleteSearchApplicationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a search application.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSearchApplicationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteSearchApplicationResponse delete(
			Function<DeleteSearchApplicationRequest.Builder, ObjectBuilder<DeleteSearchApplicationRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteSearchApplicationRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.delete_behavioral_analytics

	/**
	 * Delete a behavioral analytics collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteBehavioralAnalyticsResponse deleteBehavioralAnalytics(DeleteBehavioralAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteBehavioralAnalyticsRequest, DeleteBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteBehavioralAnalyticsRequest, DeleteBehavioralAnalyticsResponse, ErrorResponse>) DeleteBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a behavioral analytics collection.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteBehavioralAnalyticsResponse deleteBehavioralAnalytics(
			Function<DeleteBehavioralAnalyticsRequest.Builder, ObjectBuilder<DeleteBehavioralAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteBehavioralAnalytics(fn.apply(new DeleteBehavioralAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.get

	/**
	 * Returns the details about a search application.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSearchApplicationResponse get(GetSearchApplicationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSearchApplicationRequest, GetSearchApplicationResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSearchApplicationRequest, GetSearchApplicationResponse, ErrorResponse>) GetSearchApplicationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the details about a search application.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSearchApplicationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSearchApplicationResponse get(
			Function<GetSearchApplicationRequest.Builder, ObjectBuilder<GetSearchApplicationRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetSearchApplicationRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.get_behavioral_analytics

	/**
	 * Returns the existing behavioral analytics collections.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetBehavioralAnalyticsResponse getBehavioralAnalytics(GetBehavioralAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetBehavioralAnalyticsRequest, GetBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetBehavioralAnalyticsRequest, GetBehavioralAnalyticsResponse, ErrorResponse>) GetBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the existing behavioral analytics collections.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetBehavioralAnalyticsResponse getBehavioralAnalytics(
			Function<GetBehavioralAnalyticsRequest.Builder, ObjectBuilder<GetBehavioralAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getBehavioralAnalytics(fn.apply(new GetBehavioralAnalyticsRequest.Builder()).build());
	}

	/**
	 * Returns the existing behavioral analytics collections.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetBehavioralAnalyticsResponse getBehavioralAnalytics() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetBehavioralAnalyticsRequest.Builder().build(),
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

	public ListResponse list(ListRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ListResponse list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn)
			throws IOException, ElasticsearchException {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Returns the existing search applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-search-applications.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: search_application.put

	/**
	 * Creates or updates a search application.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutResponse put(PutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a search application.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-search-application.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutResponse put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn)
			throws IOException, ElasticsearchException {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.put_behavioral_analytics

	/**
	 * Creates a behavioral analytics collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutBehavioralAnalyticsResponse putBehavioralAnalytics(PutBehavioralAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutBehavioralAnalyticsRequest, PutBehavioralAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutBehavioralAnalyticsRequest, PutBehavioralAnalyticsResponse, ErrorResponse>) PutBehavioralAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a behavioral analytics collection.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutBehavioralAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-analytics-collection.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutBehavioralAnalyticsResponse putBehavioralAnalytics(
			Function<PutBehavioralAnalyticsRequest.Builder, ObjectBuilder<PutBehavioralAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return putBehavioralAnalytics(fn.apply(new PutBehavioralAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: search_application.search

	/**
	 * Perform a search against a search application
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchApplicationSearchResponse<TDocument> search(SearchApplicationSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse>) SearchApplicationSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:search_application.search.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform a search against a search application
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchApplicationSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchApplicationSearchResponse<TDocument> search(
			Function<SearchApplicationSearchRequest.Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchApplicationSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Perform a search against a search application
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchApplicationSearchResponse<TDocument> search(SearchApplicationSearchRequest request,
			Type tDocumentType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse>) SearchApplicationSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:search_application.search.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform a search against a search application
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchApplicationSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-application-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchApplicationSearchResponse<TDocument> search(
			Function<SearchApplicationSearchRequest.Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchApplicationSearchRequest.Builder()).build(), tDocumentType);
	}

}
