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

package co.elastic.clients.elasticsearch.eql;

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
 * Client for the eql namespace.
 */
public class ElasticsearchEqlClient extends ApiClient<ElasticsearchTransport, ElasticsearchEqlClient> {

	public ElasticsearchEqlClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchEqlClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchEqlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchEqlClient(this.transport, transportOptions);
	}

	// ----- Endpoint: eql.delete

	/**
	 * Delete an async EQL search. Delete an async EQL search or a stored
	 * synchronous EQL search. The API also deletes results for the search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-delete">Documentation
	 *      on elastic.co</a>
	 */

	public EqlDeleteResponse delete(EqlDeleteRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlDeleteRequest, EqlDeleteResponse, ErrorResponse> endpoint = (JsonEndpoint<EqlDeleteRequest, EqlDeleteResponse, ErrorResponse>) EqlDeleteRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an async EQL search. Delete an async EQL search or a stored
	 * synchronous EQL search. The API also deletes results for the search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlDeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-delete">Documentation
	 *      on elastic.co</a>
	 */

	public final EqlDeleteResponse delete(Function<EqlDeleteRequest.Builder, ObjectBuilder<EqlDeleteRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new EqlDeleteRequest.Builder()).build());
	}

	// ----- Endpoint: eql.get

	/**
	 * Get async EQL search results. Get the current status and available results
	 * for an async EQL search or a stored synchronous EQL search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-get">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> EqlGetResponse<TEvent> get(EqlGetRequest request, Class<TEvent> tEventClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse>) EqlGetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.get.Response.TEvent", getDeserializer(tEventClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get async EQL search results. Get the current status and available results
	 * for an async EQL search or a stored synchronous EQL search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlGetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-get">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> EqlGetResponse<TEvent> get(Function<EqlGetRequest.Builder, ObjectBuilder<EqlGetRequest>> fn,
			Class<TEvent> tEventClass) throws IOException, ElasticsearchException {
		return get(fn.apply(new EqlGetRequest.Builder()).build(), tEventClass);
	}

	/**
	 * Overload of {@link #get(EqlGetRequest, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public EqlGetResponse<Void> get(EqlGetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlGetRequest, EqlGetResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<EqlGetRequest, EqlGetResponse<Void>, ErrorResponse>) EqlGetRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #get(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final EqlGetResponse<Void> get(Function<EqlGetRequest.Builder, ObjectBuilder<EqlGetRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new EqlGetRequest.Builder()).build(), Void.class);
	}

	/**
	 * Get async EQL search results. Get the current status and available results
	 * for an async EQL search or a stored synchronous EQL search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-get">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> EqlGetResponse<TEvent> get(EqlGetRequest request, Type tEventType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse>) EqlGetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.get.Response.TEvent", getDeserializer(tEventType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get async EQL search results. Get the current status and available results
	 * for an async EQL search or a stored synchronous EQL search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlGetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-get">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> EqlGetResponse<TEvent> get(Function<EqlGetRequest.Builder, ObjectBuilder<EqlGetRequest>> fn,
			Type tEventType) throws IOException, ElasticsearchException {
		return get(fn.apply(new EqlGetRequest.Builder()).build(), tEventType);
	}

	// ----- Endpoint: eql.get_status

	/**
	 * Get the async EQL status. Get the current status for an async EQL search or a
	 * stored synchronous EQL search without returning results.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-get-status">Documentation
	 *      on elastic.co</a>
	 */

	public GetEqlStatusResponse getStatus(GetEqlStatusRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetEqlStatusRequest, GetEqlStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<GetEqlStatusRequest, GetEqlStatusResponse, ErrorResponse>) GetEqlStatusRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the async EQL status. Get the current status for an async EQL search or a
	 * stored synchronous EQL search without returning results.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetEqlStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-get-status">Documentation
	 *      on elastic.co</a>
	 */

	public final GetEqlStatusResponse getStatus(
			Function<GetEqlStatusRequest.Builder, ObjectBuilder<GetEqlStatusRequest>> fn)
			throws IOException, ElasticsearchException {
		return getStatus(fn.apply(new GetEqlStatusRequest.Builder()).build());
	}

	// ----- Endpoint: eql.search

	/**
	 * Get EQL search results. Returns search results for an Event Query Language
	 * (EQL) query. EQL assumes each document in a data stream or index corresponds
	 * to an event.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> EqlSearchResponse<TEvent> search(EqlSearchRequest request, Class<TEvent> tEventClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse>) EqlSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.search.Response.TEvent", getDeserializer(tEventClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get EQL search results. Returns search results for an Event Query Language
	 * (EQL) query. EQL assumes each document in a data stream or index corresponds
	 * to an event.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> EqlSearchResponse<TEvent> search(
			Function<EqlSearchRequest.Builder, ObjectBuilder<EqlSearchRequest>> fn, Class<TEvent> tEventClass)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new EqlSearchRequest.Builder()).build(), tEventClass);
	}

	/**
	 * Overload of {@link #search(EqlSearchRequest, Class)}, where Class is defined
	 * as Void, meaning the documents will not be deserialized.
	 */

	public EqlSearchResponse<Void> search(EqlSearchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlSearchRequest, EqlSearchResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<EqlSearchRequest, EqlSearchResponse<Void>, ErrorResponse>) EqlSearchRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #search(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final EqlSearchResponse<Void> search(Function<EqlSearchRequest.Builder, ObjectBuilder<EqlSearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new EqlSearchRequest.Builder()).build(), Void.class);
	}

	/**
	 * Get EQL search results. Returns search results for an Event Query Language
	 * (EQL) query. EQL assumes each document in a data stream or index corresponds
	 * to an event.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> EqlSearchResponse<TEvent> search(EqlSearchRequest request, Type tEventType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse>) EqlSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.search.Response.TEvent", getDeserializer(tEventType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get EQL search results. Returns search results for an Event Query Language
	 * (EQL) query. EQL assumes each document in a data stream or index corresponds
	 * to an event.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-eql-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> EqlSearchResponse<TEvent> search(
			Function<EqlSearchRequest.Builder, ObjectBuilder<EqlSearchRequest>> fn, Type tEventType)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new EqlSearchRequest.Builder()).build(), tEventType);
	}

}
