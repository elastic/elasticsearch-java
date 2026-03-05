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

package co.elastic.clients.elasticsearch.project;

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
 * Client for the project namespace.
 */
public class ElasticsearchProjectAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchProjectAsyncClient> {

	public ElasticsearchProjectAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchProjectAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchProjectAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchProjectAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: project.create_many_routing

	/**
	 * Create or update project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<CreateManyRoutingResponse> createManyRouting(CreateManyRoutingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateManyRoutingRequest, CreateManyRoutingResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateManyRoutingRequest, CreateManyRoutingResponse, ErrorResponse>) CreateManyRoutingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update project routing expressions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateManyRoutingRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<CreateManyRoutingResponse> createManyRouting(
			Function<CreateManyRoutingRequest.Builder, ObjectBuilder<CreateManyRoutingRequest>> fn) {
		return createManyRouting(fn.apply(new CreateManyRoutingRequest.Builder()).build());
	}

	/**
	 * Create or update project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<CreateManyRoutingResponse> createManyRouting() {
		return this.transport.performRequestAsync(new CreateManyRoutingRequest.Builder().build(),
				CreateManyRoutingRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: project.create_routing

	/**
	 * Create or update a project routing expression.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<CreateRoutingResponse> createRouting(CreateRoutingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateRoutingRequest, CreateRoutingResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateRoutingRequest, CreateRoutingResponse, ErrorResponse>) CreateRoutingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a project routing expression.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateRoutingRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<CreateRoutingResponse> createRouting(
			Function<CreateRoutingRequest.Builder, ObjectBuilder<CreateRoutingRequest>> fn) {
		return createRouting(fn.apply(new CreateRoutingRequest.Builder()).build());
	}

	// ----- Endpoint: project.delete_routing

	/**
	 * Delete a project routing expression.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<DeleteRoutingResponse> deleteRouting(DeleteRoutingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoutingRequest, DeleteRoutingResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoutingRequest, DeleteRoutingResponse, ErrorResponse>) DeleteRoutingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a project routing expression.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRoutingRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRoutingResponse> deleteRouting(
			Function<DeleteRoutingRequest.Builder, ObjectBuilder<DeleteRoutingRequest>> fn) {
		return deleteRouting(fn.apply(new DeleteRoutingRequest.Builder()).build());
	}

	// ----- Endpoint: project.get_many_routing

	/**
	 * Get project routing expressions.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */
	public CompletableFuture<GetManyRoutingResponse> getManyRouting() {
		return this.transport.performRequestAsync(GetManyRoutingRequest._INSTANCE, GetManyRoutingRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: project.get_routing

	/**
	 * Get a project routing expression.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public CompletableFuture<GetRoutingResponse> getRouting(GetRoutingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoutingRequest, GetRoutingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoutingRequest, GetRoutingResponse, ErrorResponse>) GetRoutingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a project routing expression.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRoutingRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final CompletableFuture<GetRoutingResponse> getRouting(
			Function<GetRoutingRequest.Builder, ObjectBuilder<GetRoutingRequest>> fn) {
		return getRouting(fn.apply(new GetRoutingRequest.Builder()).build());
	}

	// ----- Endpoint: project.tags

	/**
	 * Get tags.
	 * <p>
	 * Get the tags that are defined for the project.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch-serverless/operation/operation-project-tags">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TagsResponse> tags(TagsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TagsRequest, TagsResponse, ErrorResponse> endpoint = (JsonEndpoint<TagsRequest, TagsResponse, ErrorResponse>) TagsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get tags.
	 * <p>
	 * Get the tags that are defined for the project.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TagsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch-serverless/operation/operation-project-tags">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TagsResponse> tags(Function<TagsRequest.Builder, ObjectBuilder<TagsRequest>> fn) {
		return tags(fn.apply(new TagsRequest.Builder()).build());
	}

	/**
	 * Get tags.
	 * <p>
	 * Get the tags that are defined for the project.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch-serverless/operation/operation-project-tags">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TagsResponse> tags() {
		return this.transport.performRequestAsync(new TagsRequest.Builder().build(), TagsRequest._ENDPOINT,
				this.transportOptions);
	}

}
