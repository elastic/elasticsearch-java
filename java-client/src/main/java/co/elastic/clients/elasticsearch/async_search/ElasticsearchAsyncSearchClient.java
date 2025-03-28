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
 * Client for the async_search namespace.
 */
public class ElasticsearchAsyncSearchClient extends ApiClient<ElasticsearchTransport, ElasticsearchAsyncSearchClient> {

	public ElasticsearchAsyncSearchClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchAsyncSearchClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchAsyncSearchClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchAsyncSearchClient(this.transport, transportOptions);
	}

	// ----- Endpoint: async_search.delete

	/**
	 * Delete an async search.
	 * <p>
	 * If the asynchronous search is still running, it is cancelled. Otherwise, the
	 * saved search results are deleted. If the Elasticsearch security features are
	 * enabled, the deletion of a specific async search is restricted to: the
	 * authenticated user that submitted the original search request; users that
	 * have the <code>cancel_task</code> cluster privilege.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAsyncSearchResponse delete(DeleteAsyncSearchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse>) DeleteAsyncSearchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an async search.
	 * <p>
	 * If the asynchronous search is still running, it is cancelled. Otherwise, the
	 * saved search results are deleted. If the Elasticsearch security features are
	 * enabled, the deletion of a specific async search is restricted to: the
	 * authenticated user that submitted the original search request; users that
	 * have the <code>cancel_task</code> cluster privilege.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAsyncSearchResponse delete(
			Function<DeleteAsyncSearchRequest.Builder, ObjectBuilder<DeleteAsyncSearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteAsyncSearchRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.get

	/**
	 * Get async search results.
	 * <p>
	 * Retrieve the results of a previously submitted asynchronous search request.
	 * If the Elasticsearch security features are enabled, access to the results of
	 * a specific async search is restricted to the user or API key that submitted
	 * it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetAsyncSearchResponse<TDocument> get(GetAsyncSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse>) GetAsyncSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.get.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get async search results.
	 * <p>
	 * Retrieve the results of a previously submitted asynchronous search request.
	 * If the Elasticsearch security features are enabled, access to the results of
	 * a specific async search is restricted to the user or API key that submitted
	 * it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetAsyncSearchResponse<TDocument> get(
			Function<GetAsyncSearchRequest.Builder, ObjectBuilder<GetAsyncSearchRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return get(fn.apply(new GetAsyncSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #get(GetAsyncSearchRequest, Class)}, where Class is
	 * defined as Void, meaning the documents will not be deserialized.
	 */

	public GetAsyncSearchResponse<Void> get(GetAsyncSearchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<Void>, ErrorResponse>) GetAsyncSearchRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #get(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final GetAsyncSearchResponse<Void> get(
			Function<GetAsyncSearchRequest.Builder, ObjectBuilder<GetAsyncSearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetAsyncSearchRequest.Builder()).build(), Void.class);
	}

	/**
	 * Get async search results.
	 * <p>
	 * Retrieve the results of a previously submitted asynchronous search request.
	 * If the Elasticsearch security features are enabled, access to the results of
	 * a specific async search is restricted to the user or API key that submitted
	 * it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetAsyncSearchResponse<TDocument> get(GetAsyncSearchRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse>) GetAsyncSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.get.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get async search results.
	 * <p>
	 * Retrieve the results of a previously submitted asynchronous search request.
	 * If the Elasticsearch security features are enabled, access to the results of
	 * a specific async search is restricted to the user or API key that submitted
	 * it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetAsyncSearchResponse<TDocument> get(
			Function<GetAsyncSearchRequest.Builder, ObjectBuilder<GetAsyncSearchRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetAsyncSearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: async_search.status

	/**
	 * Get the async search status.
	 * <p>
	 * Get the status of a previously submitted async search request given its
	 * identifier, without retrieving search results. If the Elasticsearch security
	 * features are enabled, the access to the status of a specific async search is
	 * restricted to:
	 * <ul>
	 * <li>The user or API key that submitted the original async search
	 * request.</li>
	 * <li>Users that have the <code>monitor</code> cluster privilege or greater
	 * privileges.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public AsyncSearchStatusResponse status(AsyncSearchStatusRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse, ErrorResponse>) AsyncSearchStatusRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the async search status.
	 * <p>
	 * Get the status of a previously submitted async search request given its
	 * identifier, without retrieving search results. If the Elasticsearch security
	 * features are enabled, the access to the status of a specific async search is
	 * restricted to:
	 * <ul>
	 * <li>The user or API key that submitted the original async search
	 * request.</li>
	 * <li>Users that have the <code>monitor</code> cluster privilege or greater
	 * privileges.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AsyncSearchStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public final AsyncSearchStatusResponse status(
			Function<AsyncSearchStatusRequest.Builder, ObjectBuilder<AsyncSearchStatusRequest>> fn)
			throws IOException, ElasticsearchException {
		return status(fn.apply(new AsyncSearchStatusRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.submit

	/**
	 * Run an async search.
	 * <p>
	 * When the primary sort of the results is an indexed field, shards get sorted
	 * based on minimum and maximum value that they hold for that field. Partial
	 * results become available following the sort criteria that was requested.
	 * <p>
	 * Warning: Asynchronous search does not support scroll or search requests that
	 * include only the suggest section.
	 * <p>
	 * By default, Elasticsearch does not allow you to store an async search
	 * response larger than 10Mb and an attempt to do this results in an error. The
	 * maximum allowed size for a stored async search response can be set by
	 * changing the <code>search.max_async_search_response_size</code> cluster level
	 * setting.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SubmitResponse<TDocument> submit(SubmitRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse>) SubmitRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.submit.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run an async search.
	 * <p>
	 * When the primary sort of the results is an indexed field, shards get sorted
	 * based on minimum and maximum value that they hold for that field. Partial
	 * results become available following the sort criteria that was requested.
	 * <p>
	 * Warning: Asynchronous search does not support scroll or search requests that
	 * include only the suggest section.
	 * <p>
	 * By default, Elasticsearch does not allow you to store an async search
	 * response larger than 10Mb and an attempt to do this results in an error. The
	 * maximum allowed size for a stored async search response can be set by
	 * changing the <code>search.max_async_search_response_size</code> cluster level
	 * setting.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SubmitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SubmitResponse<TDocument> submit(
			Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #submit(SubmitRequest, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public SubmitResponse<Void> submit(SubmitRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SubmitRequest, SubmitResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<SubmitRequest, SubmitResponse<Void>, ErrorResponse>) SubmitRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #submit(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final SubmitResponse<Void> submit(Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn)
			throws IOException, ElasticsearchException {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run an async search.
	 * <p>
	 * When the primary sort of the results is an indexed field, shards get sorted
	 * based on minimum and maximum value that they hold for that field. Partial
	 * results become available following the sort criteria that was requested.
	 * <p>
	 * Warning: Asynchronous search does not support scroll or search requests that
	 * include only the suggest section.
	 * <p>
	 * By default, Elasticsearch does not allow you to store an async search
	 * response larger than 10Mb and an attempt to do this results in an error. The
	 * maximum allowed size for a stored async search response can be set by
	 * changing the <code>search.max_async_search_response_size</code> cluster level
	 * setting.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SubmitResponse<TDocument> submit(SubmitRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse>) SubmitRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:async_search.submit.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run an async search.
	 * <p>
	 * When the primary sort of the results is an indexed field, shards get sorted
	 * based on minimum and maximum value that they hold for that field. Partial
	 * results become available following the sort criteria that was requested.
	 * <p>
	 * Warning: Asynchronous search does not support scroll or search requests that
	 * include only the suggest section.
	 * <p>
	 * By default, Elasticsearch does not allow you to store an async search
	 * response larger than 10Mb and an attempt to do this results in an error. The
	 * maximum allowed size for a stored async search response can be set by
	 * changing the <code>search.max_async_search_response_size</code> cluster level
	 * setting.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SubmitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-async-search-submit">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SubmitResponse<TDocument> submit(
			Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), tDocumentType);
	}

}
