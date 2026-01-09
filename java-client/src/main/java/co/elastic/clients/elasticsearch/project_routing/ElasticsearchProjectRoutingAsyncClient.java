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

package co.elastic.clients.elasticsearch.project_routing;

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
 * Client for the project_routing namespace.
 */
public class ElasticsearchProjectRoutingAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchProjectRoutingAsyncClient> {

	public ElasticsearchProjectRoutingAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchProjectRoutingAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchProjectRoutingAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchProjectRoutingAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: project_routing.create

	/**
	 * Create of update a single named project routing expression.
	 * <p>
	 * Create of update a single named project routing expression.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<CreateProjectRoutingResponse> create(CreateProjectRoutingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateProjectRoutingRequest, CreateProjectRoutingResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateProjectRoutingRequest, CreateProjectRoutingResponse, ErrorResponse>) CreateProjectRoutingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create of update a single named project routing expression.
	 * <p>
	 * Create of update a single named project routing expression.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateProjectRoutingRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<CreateProjectRoutingResponse> create(
			Function<CreateProjectRoutingRequest.Builder, ObjectBuilder<CreateProjectRoutingRequest>> fn) {
		return create(fn.apply(new CreateProjectRoutingRequest.Builder()).build());
	}

	// ----- Endpoint: project_routing.create_many

	/**
	 * Create of update named project routing expressions.
	 * <p>
	 * Create or update named project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<CreateManyResponse> createMany(CreateManyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateManyRequest, CreateManyResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateManyRequest, CreateManyResponse, ErrorResponse>) CreateManyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create of update named project routing expressions.
	 * <p>
	 * Create or update named project routing expressions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateManyRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<CreateManyResponse> createMany(
			Function<CreateManyRequest.Builder, ObjectBuilder<CreateManyRequest>> fn) {
		return createMany(fn.apply(new CreateManyRequest.Builder()).build());
	}

	/**
	 * Create of update named project routing expressions.
	 * <p>
	 * Create or update named project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<CreateManyResponse> createMany() {
		return this.transport.performRequestAsync(new CreateManyRequest.Builder().build(), CreateManyRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: project_routing.delete

	/**
	 * Delete named project routing expressions.
	 * <p>
	 * Delete named project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<DeleteProjectRoutingResponse> delete(DeleteProjectRoutingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteProjectRoutingRequest, DeleteProjectRoutingResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteProjectRoutingRequest, DeleteProjectRoutingResponse, ErrorResponse>) DeleteProjectRoutingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete named project routing expressions.
	 * <p>
	 * Delete named project routing expressions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteProjectRoutingRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<DeleteProjectRoutingResponse> delete(
			Function<DeleteProjectRoutingRequest.Builder, ObjectBuilder<DeleteProjectRoutingRequest>> fn) {
		return delete(fn.apply(new DeleteProjectRoutingRequest.Builder()).build());
	}

	// ----- Endpoint: project_routing.get

	/**
	 * Get named project routing expressions.
	 * <p>
	 * Get named project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<GetProjectRoutingResponse> get(GetProjectRoutingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetProjectRoutingRequest, GetProjectRoutingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetProjectRoutingRequest, GetProjectRoutingResponse, ErrorResponse>) GetProjectRoutingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get named project routing expressions.
	 * <p>
	 * Get named project routing expressions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetProjectRoutingRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<GetProjectRoutingResponse> get(
			Function<GetProjectRoutingRequest.Builder, ObjectBuilder<GetProjectRoutingRequest>> fn) {
		return get(fn.apply(new GetProjectRoutingRequest.Builder()).build());
	}

	// ----- Endpoint: project_routing.get_many

	/**
	 * Get named project routing expressions.
	 * <p>
	 * Get named project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */
	public CompletableFuture<GetManyResponse> getMany() {
		return this.transport.performRequestAsync(GetManyRequest._INSTANCE, GetManyRequest._ENDPOINT,
				this.transportOptions);
	}

}
