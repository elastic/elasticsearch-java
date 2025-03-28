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

package co.elastic.clients.elasticsearch.fleet;

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
 * Client for the fleet namespace.
 */
public class ElasticsearchFleetAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchFleetAsyncClient> {

	public ElasticsearchFleetAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchFleetAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchFleetAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchFleetAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: fleet.search

	/**
	 * Run a Fleet search. The purpose of the Fleet search API is to provide an API
	 * where the search will be run only after the provided checkpoint has been
	 * processed and is visible for searches inside of Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-fleet-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<FleetSearchResponse<TDocument>> search(FleetSearchRequest request,
			Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FleetSearchRequest, FleetSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<FleetSearchRequest, FleetSearchResponse<TDocument>, ErrorResponse>) FleetSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:fleet.search.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a Fleet search. The purpose of the Fleet search API is to provide an API
	 * where the search will be run only after the provided checkpoint has been
	 * processed and is visible for searches inside of Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FleetSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-fleet-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<FleetSearchResponse<TDocument>> search(
			Function<FleetSearchRequest.Builder, ObjectBuilder<FleetSearchRequest>> fn,
			Class<TDocument> tDocumentClass) {
		return search(fn.apply(new FleetSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #search(FleetSearchRequest, Class)}, where Class is
	 * defined as Void, meaning the documents will not be deserialized.
	 */

	public CompletableFuture<FleetSearchResponse<Void>> search(FleetSearchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FleetSearchRequest, FleetSearchResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<FleetSearchRequest, FleetSearchResponse<Void>, ErrorResponse>) FleetSearchRequest._ENDPOINT;
		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #search(Function, Class)}, where Class is defined as Void,
	 * meaning the documents will not be deserialized.
	 */

	public final CompletableFuture<FleetSearchResponse<Void>> search(
			Function<FleetSearchRequest.Builder, ObjectBuilder<FleetSearchRequest>> fn) {
		return search(fn.apply(new FleetSearchRequest.Builder()).build(), Void.class);
	}

	/**
	 * Run a Fleet search. The purpose of the Fleet search API is to provide an API
	 * where the search will be run only after the provided checkpoint has been
	 * processed and is visible for searches inside of Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-fleet-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<FleetSearchResponse<TDocument>> search(FleetSearchRequest request,
			Type tDocumentType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FleetSearchRequest, FleetSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<FleetSearchRequest, FleetSearchResponse<TDocument>, ErrorResponse>) FleetSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:fleet.search.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a Fleet search. The purpose of the Fleet search API is to provide an API
	 * where the search will be run only after the provided checkpoint has been
	 * processed and is visible for searches inside of Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FleetSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-fleet-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<FleetSearchResponse<TDocument>> search(
			Function<FleetSearchRequest.Builder, ObjectBuilder<FleetSearchRequest>> fn, Type tDocumentType) {
		return search(fn.apply(new FleetSearchRequest.Builder()).build(), tDocumentType);
	}

}
