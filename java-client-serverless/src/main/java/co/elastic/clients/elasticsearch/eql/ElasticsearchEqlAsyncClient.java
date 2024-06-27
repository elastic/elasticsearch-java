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
 * Client for the eql namespace.
 */
public class ElasticsearchEqlAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchEqlAsyncClient> {

	public ElasticsearchEqlAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchEqlAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchEqlAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchEqlAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: eql.delete

	/**
	 * Deletes an async EQL search or a stored synchronous EQL search. The API also
	 * deletes results for the search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EqlDeleteResponse> delete(EqlDeleteRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlDeleteRequest, EqlDeleteResponse, ErrorResponse> endpoint = (JsonEndpoint<EqlDeleteRequest, EqlDeleteResponse, ErrorResponse>) EqlDeleteRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an async EQL search or a stored synchronous EQL search. The API also
	 * deletes results for the search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlDeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<EqlDeleteResponse> delete(
			Function<EqlDeleteRequest.Builder, ObjectBuilder<EqlDeleteRequest>> fn) {
		return delete(fn.apply(new EqlDeleteRequest.Builder()).build());
	}

	// ----- Endpoint: eql.get

	/**
	 * Returns the current status and available results for an async EQL search or a
	 * stored synchronous EQL search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/get-async-eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> CompletableFuture<EqlGetResponse<TEvent>> get(EqlGetRequest request, Class<TEvent> tEventClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse>) EqlGetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.get.Response.TEvent", getDeserializer(tEventClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the current status and available results for an async EQL search or a
	 * stored synchronous EQL search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlGetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/get-async-eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> CompletableFuture<EqlGetResponse<TEvent>> get(
			Function<EqlGetRequest.Builder, ObjectBuilder<EqlGetRequest>> fn, Class<TEvent> tEventClass) {
		return get(fn.apply(new EqlGetRequest.Builder()).build(), tEventClass);
	}

	/**
	 * Returns the current status and available results for an async EQL search or a
	 * stored synchronous EQL search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/get-async-eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> CompletableFuture<EqlGetResponse<TEvent>> get(EqlGetRequest request, Type tEventType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse>) EqlGetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.get.Response.TEvent", getDeserializer(tEventType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the current status and available results for an async EQL search or a
	 * stored synchronous EQL search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlGetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/get-async-eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> CompletableFuture<EqlGetResponse<TEvent>> get(
			Function<EqlGetRequest.Builder, ObjectBuilder<EqlGetRequest>> fn, Type tEventType) {
		return get(fn.apply(new EqlGetRequest.Builder()).build(), tEventType);
	}

	// ----- Endpoint: eql.get_status

	/**
	 * Returns the current status for an async EQL search or a stored synchronous
	 * EQL search without returning results.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/get-async-eql-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetEqlStatusResponse> getStatus(GetEqlStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetEqlStatusRequest, GetEqlStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<GetEqlStatusRequest, GetEqlStatusResponse, ErrorResponse>) GetEqlStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the current status for an async EQL search or a stored synchronous
	 * EQL search without returning results.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetEqlStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/get-async-eql-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetEqlStatusResponse> getStatus(
			Function<GetEqlStatusRequest.Builder, ObjectBuilder<GetEqlStatusRequest>> fn) {
		return getStatus(fn.apply(new GetEqlStatusRequest.Builder()).build());
	}

	// ----- Endpoint: eql.search

	/**
	 * Returns results matching a query expressed in Event Query Language (EQL)
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> CompletableFuture<EqlSearchResponse<TEvent>> search(EqlSearchRequest request,
			Class<TEvent> tEventClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse>) EqlSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.search.Response.TEvent", getDeserializer(tEventClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns results matching a query expressed in Event Query Language (EQL)
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> CompletableFuture<EqlSearchResponse<TEvent>> search(
			Function<EqlSearchRequest.Builder, ObjectBuilder<EqlSearchRequest>> fn, Class<TEvent> tEventClass) {
		return search(fn.apply(new EqlSearchRequest.Builder()).build(), tEventClass);
	}

	/**
	 * Returns results matching a query expressed in Event Query Language (EQL)
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> CompletableFuture<EqlSearchResponse<TEvent>> search(EqlSearchRequest request, Type tEventType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse> endpoint = (JsonEndpoint<EqlSearchRequest, EqlSearchResponse<TEvent>, ErrorResponse>) EqlSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:eql.search.Response.TEvent", getDeserializer(tEventType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns results matching a query expressed in Event Query Language (EQL)
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> CompletableFuture<EqlSearchResponse<TEvent>> search(
			Function<EqlSearchRequest.Builder, ObjectBuilder<EqlSearchRequest>> fn, Type tEventType) {
		return search(fn.apply(new EqlSearchRequest.Builder()).build(), tEventType);
	}

}
