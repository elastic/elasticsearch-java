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

package co.elastic.clients.elasticsearch.autoscaling;

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

/**
 * Client for the autoscaling namespace.
 */
public class ElasticsearchAutoscalingAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchAutoscalingAsyncClient> {

	public ElasticsearchAutoscalingAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchAutoscalingAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchAutoscalingAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchAutoscalingAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: autoscaling.delete_autoscaling_policy

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAutoscalingPolicyResponse> deleteAutoscalingPolicy(
			DeleteAutoscalingPolicyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAutoscalingPolicyRequest, DeleteAutoscalingPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAutoscalingPolicyRequest, DeleteAutoscalingPolicyResponse, ErrorResponse>) DeleteAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAutoscalingPolicyResponse> deleteAutoscalingPolicy(
			Function<DeleteAutoscalingPolicyRequest.Builder, ObjectBuilder<DeleteAutoscalingPolicyRequest>> fn) {
		return deleteAutoscalingPolicy(fn.apply(new DeleteAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.get_autoscaling_capacity

	/**
	 * Gets the current autoscaling capacity based on the configured autoscaling
	 * policy. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/autoscaling-get-autoscaling-capacity.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetAutoscalingCapacityResponse> getAutoscalingCapacity() {
		return this.transport.performRequestAsync(GetAutoscalingCapacityRequest._INSTANCE,
				GetAutoscalingCapacityRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: autoscaling.get_autoscaling_policy

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/autoscaling-get-autoscaling-capacity.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAutoscalingPolicyResponse> getAutoscalingPolicy(GetAutoscalingPolicyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAutoscalingPolicyRequest, GetAutoscalingPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAutoscalingPolicyRequest, GetAutoscalingPolicyResponse, ErrorResponse>) GetAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/autoscaling-get-autoscaling-capacity.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAutoscalingPolicyResponse> getAutoscalingPolicy(
			Function<GetAutoscalingPolicyRequest.Builder, ObjectBuilder<GetAutoscalingPolicyRequest>> fn) {
		return getAutoscalingPolicy(fn.apply(new GetAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.put_autoscaling_policy

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutAutoscalingPolicyResponse> putAutoscalingPolicy(PutAutoscalingPolicyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ErrorResponse>) PutAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutAutoscalingPolicyResponse> putAutoscalingPolicy(
			Function<PutAutoscalingPolicyRequest.Builder, ObjectBuilder<PutAutoscalingPolicyRequest>> fn) {
		return putAutoscalingPolicy(fn.apply(new PutAutoscalingPolicyRequest.Builder()).build());
	}

}
