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

package co.elastic.clients.elasticsearch.autoscaling;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
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
	 * Delete an autoscaling policy.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-delete-autoscaling-policy">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAutoscalingPolicyResponse deleteAutoscalingPolicy(DeleteAutoscalingPolicyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAutoscalingPolicyRequest, DeleteAutoscalingPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAutoscalingPolicyRequest, DeleteAutoscalingPolicyResponse, ErrorResponse>) DeleteAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an autoscaling policy.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-delete-autoscaling-policy">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAutoscalingPolicyResponse deleteAutoscalingPolicy(
			Function<DeleteAutoscalingPolicyRequest.Builder, ObjectBuilder<DeleteAutoscalingPolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteAutoscalingPolicy(fn.apply(new DeleteAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.get_autoscaling_capacity

	/**
	 * Get the autoscaling capacity.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * This API gets the current autoscaling capacity based on the configured
	 * autoscaling policy. It will return information to size the cluster
	 * appropriately to the current workload.
	 * <p>
	 * The <code>required_capacity</code> is calculated as the maximum of the
	 * <code>required_capacity</code> result of all individual deciders that are
	 * enabled for the policy.
	 * <p>
	 * The operator should verify that the <code>current_nodes</code> match the
	 * operator’s knowledge of the cluster to avoid making autoscaling decisions
	 * based on stale or incomplete information.
	 * <p>
	 * The response contains decider-specific information you can use to diagnose
	 * how and why autoscaling determined a certain capacity was required. This
	 * information is provided for diagnosis only. Do not use this information to
	 * make autoscaling decisions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-get-autoscaling-capacity">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoscalingCapacityResponse getAutoscalingCapacity(GetAutoscalingCapacityRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAutoscalingCapacityRequest, GetAutoscalingCapacityResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAutoscalingCapacityRequest, GetAutoscalingCapacityResponse, ErrorResponse>) GetAutoscalingCapacityRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the autoscaling capacity.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * This API gets the current autoscaling capacity based on the configured
	 * autoscaling policy. It will return information to size the cluster
	 * appropriately to the current workload.
	 * <p>
	 * The <code>required_capacity</code> is calculated as the maximum of the
	 * <code>required_capacity</code> result of all individual deciders that are
	 * enabled for the policy.
	 * <p>
	 * The operator should verify that the <code>current_nodes</code> match the
	 * operator’s knowledge of the cluster to avoid making autoscaling decisions
	 * based on stale or incomplete information.
	 * <p>
	 * The response contains decider-specific information you can use to diagnose
	 * how and why autoscaling determined a certain capacity was required. This
	 * information is provided for diagnosis only. Do not use this information to
	 * make autoscaling decisions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAutoscalingCapacityRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-get-autoscaling-capacity">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAutoscalingCapacityResponse getAutoscalingCapacity(
			Function<GetAutoscalingCapacityRequest.Builder, ObjectBuilder<GetAutoscalingCapacityRequest>> fn)
			throws IOException, ElasticsearchException {
		return getAutoscalingCapacity(fn.apply(new GetAutoscalingCapacityRequest.Builder()).build());
	}

	/**
	 * Get the autoscaling capacity.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * This API gets the current autoscaling capacity based on the configured
	 * autoscaling policy. It will return information to size the cluster
	 * appropriately to the current workload.
	 * <p>
	 * The <code>required_capacity</code> is calculated as the maximum of the
	 * <code>required_capacity</code> result of all individual deciders that are
	 * enabled for the policy.
	 * <p>
	 * The operator should verify that the <code>current_nodes</code> match the
	 * operator’s knowledge of the cluster to avoid making autoscaling decisions
	 * based on stale or incomplete information.
	 * <p>
	 * The response contains decider-specific information you can use to diagnose
	 * how and why autoscaling determined a certain capacity was required. This
	 * information is provided for diagnosis only. Do not use this information to
	 * make autoscaling decisions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-get-autoscaling-capacity">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoscalingCapacityResponse getAutoscalingCapacity() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetAutoscalingCapacityRequest.Builder().build(),
				GetAutoscalingCapacityRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: autoscaling.get_autoscaling_policy

	/**
	 * Get an autoscaling policy.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-get-autoscaling-capacity">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoscalingPolicyResponse getAutoscalingPolicy(GetAutoscalingPolicyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAutoscalingPolicyRequest, GetAutoscalingPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAutoscalingPolicyRequest, GetAutoscalingPolicyResponse, ErrorResponse>) GetAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get an autoscaling policy.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-get-autoscaling-capacity">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAutoscalingPolicyResponse getAutoscalingPolicy(
			Function<GetAutoscalingPolicyRequest.Builder, ObjectBuilder<GetAutoscalingPolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return getAutoscalingPolicy(fn.apply(new GetAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.put_autoscaling_policy

	/**
	 * Create or update an autoscaling policy.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-put-autoscaling-policy">Documentation
	 *      on elastic.co</a>
	 */

	public PutAutoscalingPolicyResponse putAutoscalingPolicy(PutAutoscalingPolicyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ErrorResponse>) PutAutoscalingPolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an autoscaling policy.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAutoscalingPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-autoscaling-put-autoscaling-policy">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAutoscalingPolicyResponse putAutoscalingPolicy(
			Function<PutAutoscalingPolicyRequest.Builder, ObjectBuilder<PutAutoscalingPolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAutoscalingPolicy(fn.apply(new PutAutoscalingPolicyRequest.Builder()).build());
	}

}
