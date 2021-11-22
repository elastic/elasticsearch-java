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
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the autoscaling namespace.
 */
public class ElasticsearchAutoscalingClient extends ApiClient<ElasticsearchTransport, ElasticsearchAutoscalingClient> {

	public ElasticsearchAutoscalingClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchAutoscalingClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchAutoscalingClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchAutoscalingClient(this.transport, transportOptions);
	}

	// ----- Endpoint: autoscaling.delete_autoscaling_policy

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAutoscalingPolicyResponse deleteAutoscalingPolicy(DeleteAutoscalingPolicyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteAutoscalingPolicyRequest, DeleteAutoscalingPolicyResponse, ErrorResponse> endpoint = (Endpoint<DeleteAutoscalingPolicyRequest, DeleteAutoscalingPolicyResponse, ErrorResponse>) DeleteAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAutoscalingPolicyResponse deleteAutoscalingPolicy(
			Consumer<DeleteAutoscalingPolicyRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeleteAutoscalingPolicyRequest.Builder builder = new DeleteAutoscalingPolicyRequest.Builder();
		fn.accept(builder);
		return deleteAutoscalingPolicy(builder.build());
	}

	// ----- Endpoint: autoscaling.get_autoscaling_capacity

	/**
	 * Gets the current autoscaling capacity based on the configured autoscaling
	 * policy. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-capacity.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetAutoscalingCapacityResponse getAutoscalingCapacity() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetAutoscalingCapacityRequest._INSTANCE,
				GetAutoscalingCapacityRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: autoscaling.get_autoscaling_policy

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoscalingPolicyResponse getAutoscalingPolicy(GetAutoscalingPolicyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetAutoscalingPolicyRequest, GetAutoscalingPolicyResponse, ErrorResponse> endpoint = (Endpoint<GetAutoscalingPolicyRequest, GetAutoscalingPolicyResponse, ErrorResponse>) GetAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAutoscalingPolicyResponse getAutoscalingPolicy(Consumer<GetAutoscalingPolicyRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetAutoscalingPolicyRequest.Builder builder = new GetAutoscalingPolicyRequest.Builder();
		fn.accept(builder);
		return getAutoscalingPolicy(builder.build());
	}

	// ----- Endpoint: autoscaling.put_autoscaling_policy

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAutoscalingPolicyResponse putAutoscalingPolicy(PutAutoscalingPolicyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ErrorResponse> endpoint = (Endpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ErrorResponse>) PutAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAutoscalingPolicyResponse putAutoscalingPolicy(Consumer<PutAutoscalingPolicyRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutAutoscalingPolicyRequest.Builder builder = new PutAutoscalingPolicyRequest.Builder();
		fn.accept(builder);
		return putAutoscalingPolicy(builder.build());
	}

}
