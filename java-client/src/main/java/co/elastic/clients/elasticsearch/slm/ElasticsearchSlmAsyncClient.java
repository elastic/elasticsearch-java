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

package co.elastic.clients.elasticsearch.slm;

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
 * Client for the slm namespace.
 */
public class ElasticsearchSlmAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchSlmAsyncClient> {

	public ElasticsearchSlmAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSlmAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSlmAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSlmAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: slm.delete_lifecycle

	/**
	 * Delete a policy.
	 * <p>
	 * Delete a snapshot lifecycle policy definition. This operation prevents any
	 * future snapshots from being taken but does not cancel in-progress snapshots
	 * or remove previously-taken snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-delete-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(DeleteLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse>) DeleteLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a policy.
	 * <p>
	 * Delete a snapshot lifecycle policy definition. This operation prevents any
	 * future snapshots from being taken but does not cancel in-progress snapshots
	 * or remove previously-taken snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-delete-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(
			Function<DeleteLifecycleRequest.Builder, ObjectBuilder<DeleteLifecycleRequest>> fn) {
		return deleteLifecycle(fn.apply(new DeleteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.execute_lifecycle

	/**
	 * Run a policy.
	 * <p>
	 * Immediately create a snapshot according to the snapshot lifecycle policy
	 * without waiting for the scheduled time. The snapshot policy is normally
	 * applied according to its schedule, but you might want to manually run a
	 * policy before performing an upgrade or other maintenance.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-execute-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteLifecycleResponse> executeLifecycle(ExecuteLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExecuteLifecycleRequest, ExecuteLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<ExecuteLifecycleRequest, ExecuteLifecycleResponse, ErrorResponse>) ExecuteLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a policy.
	 * <p>
	 * Immediately create a snapshot according to the snapshot lifecycle policy
	 * without waiting for the scheduled time. The snapshot policy is normally
	 * applied according to its schedule, but you might want to manually run a
	 * policy before performing an upgrade or other maintenance.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecuteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-execute-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecuteLifecycleResponse> executeLifecycle(
			Function<ExecuteLifecycleRequest.Builder, ObjectBuilder<ExecuteLifecycleRequest>> fn) {
		return executeLifecycle(fn.apply(new ExecuteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.execute_retention

	/**
	 * Run a retention policy.
	 * <p>
	 * Manually apply the retention policy to force immediate removal of snapshots
	 * that are expired according to the snapshot lifecycle policy retention rules.
	 * The retention policy is normally applied according to its schedule.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-execute-retention">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteRetentionResponse> executeRetention(ExecuteRetentionRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExecuteRetentionRequest, ExecuteRetentionResponse, ErrorResponse> endpoint = (JsonEndpoint<ExecuteRetentionRequest, ExecuteRetentionResponse, ErrorResponse>) ExecuteRetentionRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a retention policy.
	 * <p>
	 * Manually apply the retention policy to force immediate removal of snapshots
	 * that are expired according to the snapshot lifecycle policy retention rules.
	 * The retention policy is normally applied according to its schedule.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecuteRetentionRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-execute-retention">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecuteRetentionResponse> executeRetention(
			Function<ExecuteRetentionRequest.Builder, ObjectBuilder<ExecuteRetentionRequest>> fn) {
		return executeRetention(fn.apply(new ExecuteRetentionRequest.Builder()).build());
	}

	/**
	 * Run a retention policy.
	 * <p>
	 * Manually apply the retention policy to force immediate removal of snapshots
	 * that are expired according to the snapshot lifecycle policy retention rules.
	 * The retention policy is normally applied according to its schedule.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-execute-retention">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteRetentionResponse> executeRetention() {
		return this.transport.performRequestAsync(new ExecuteRetentionRequest.Builder().build(),
				ExecuteRetentionRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: slm.get_lifecycle

	/**
	 * Get policy information.
	 * <p>
	 * Get snapshot lifecycle policy definitions and information about the latest
	 * snapshot attempts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLifecycleResponse> getLifecycle(GetLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse>) GetLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get policy information.
	 * <p>
	 * Get snapshot lifecycle policy definitions and information about the latest
	 * snapshot attempts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetLifecycleResponse> getLifecycle(
			Function<GetLifecycleRequest.Builder, ObjectBuilder<GetLifecycleRequest>> fn) {
		return getLifecycle(fn.apply(new GetLifecycleRequest.Builder()).build());
	}

	/**
	 * Get policy information.
	 * <p>
	 * Get snapshot lifecycle policy definitions and information about the latest
	 * snapshot attempts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLifecycleResponse> getLifecycle() {
		return this.transport.performRequestAsync(new GetLifecycleRequest.Builder().build(),
				GetLifecycleRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: slm.get_stats

	/**
	 * Get snapshot lifecycle management statistics.
	 * <p>
	 * Get global and policy-level statistics about actions taken by snapshot
	 * lifecycle management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetStatsResponse> getStats(GetStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetStatsRequest, GetStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetStatsRequest, GetStatsResponse, ErrorResponse>) GetStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get snapshot lifecycle management statistics.
	 * <p>
	 * Get global and policy-level statistics about actions taken by snapshot
	 * lifecycle management.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetStatsResponse> getStats(
			Function<GetStatsRequest.Builder, ObjectBuilder<GetStatsRequest>> fn) {
		return getStats(fn.apply(new GetStatsRequest.Builder()).build());
	}

	/**
	 * Get snapshot lifecycle management statistics.
	 * <p>
	 * Get global and policy-level statistics about actions taken by snapshot
	 * lifecycle management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetStatsResponse> getStats() {
		return this.transport.performRequestAsync(new GetStatsRequest.Builder().build(), GetStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.get_status

	/**
	 * Get the snapshot lifecycle management status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-status">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSlmStatusResponse> getStatus(GetSlmStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSlmStatusRequest, GetSlmStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSlmStatusRequest, GetSlmStatusResponse, ErrorResponse>) GetSlmStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the snapshot lifecycle management status.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSlmStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-status">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSlmStatusResponse> getStatus(
			Function<GetSlmStatusRequest.Builder, ObjectBuilder<GetSlmStatusRequest>> fn) {
		return getStatus(fn.apply(new GetSlmStatusRequest.Builder()).build());
	}

	/**
	 * Get the snapshot lifecycle management status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-get-status">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSlmStatusResponse> getStatus() {
		return this.transport.performRequestAsync(new GetSlmStatusRequest.Builder().build(),
				GetSlmStatusRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: slm.put_lifecycle

	/**
	 * Create or update a policy.
	 * <p>
	 * Create or update a snapshot lifecycle policy. If the policy already exists,
	 * this request increments the policy version. Only the latest version of a
	 * policy is stored.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-put-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutLifecycleResponse> putLifecycle(PutLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse>) PutLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a policy.
	 * <p>
	 * Create or update a snapshot lifecycle policy. If the policy already exists,
	 * this request increments the policy version. Only the latest version of a
	 * policy is stored.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-put-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutLifecycleResponse> putLifecycle(
			Function<PutLifecycleRequest.Builder, ObjectBuilder<PutLifecycleRequest>> fn) {
		return putLifecycle(fn.apply(new PutLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.start

	/**
	 * Start snapshot lifecycle management.
	 * <p>
	 * Snapshot lifecycle management (SLM) starts automatically when a cluster is
	 * formed. Manually starting SLM is necessary only if it has been stopped using
	 * the stop SLM API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-start">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartSlmResponse> start(StartSlmRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartSlmRequest, StartSlmResponse, ErrorResponse> endpoint = (JsonEndpoint<StartSlmRequest, StartSlmResponse, ErrorResponse>) StartSlmRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Start snapshot lifecycle management.
	 * <p>
	 * Snapshot lifecycle management (SLM) starts automatically when a cluster is
	 * formed. Manually starting SLM is necessary only if it has been stopped using
	 * the stop SLM API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartSlmRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-start">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartSlmResponse> start(
			Function<StartSlmRequest.Builder, ObjectBuilder<StartSlmRequest>> fn) {
		return start(fn.apply(new StartSlmRequest.Builder()).build());
	}

	/**
	 * Start snapshot lifecycle management.
	 * <p>
	 * Snapshot lifecycle management (SLM) starts automatically when a cluster is
	 * formed. Manually starting SLM is necessary only if it has been stopped using
	 * the stop SLM API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-start">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartSlmResponse> start() {
		return this.transport.performRequestAsync(new StartSlmRequest.Builder().build(), StartSlmRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.stop

	/**
	 * Stop snapshot lifecycle management.
	 * <p>
	 * Stop all snapshot lifecycle management (SLM) operations and the SLM plugin.
	 * This API is useful when you are performing maintenance on a cluster and need
	 * to prevent SLM from performing any actions on your data streams or indices.
	 * Stopping SLM does not stop any snapshots that are in progress. You can
	 * manually trigger snapshots with the run snapshot lifecycle policy API even if
	 * SLM is stopped.
	 * <p>
	 * The API returns a response as soon as the request is acknowledged, but the
	 * plugin might continue to run until in-progress operations complete and it can
	 * be safely stopped. Use the get snapshot lifecycle management status API to
	 * see if SLM is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-stop">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopSlmResponse> stop(StopSlmRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopSlmRequest, StopSlmResponse, ErrorResponse> endpoint = (JsonEndpoint<StopSlmRequest, StopSlmResponse, ErrorResponse>) StopSlmRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop snapshot lifecycle management.
	 * <p>
	 * Stop all snapshot lifecycle management (SLM) operations and the SLM plugin.
	 * This API is useful when you are performing maintenance on a cluster and need
	 * to prevent SLM from performing any actions on your data streams or indices.
	 * Stopping SLM does not stop any snapshots that are in progress. You can
	 * manually trigger snapshots with the run snapshot lifecycle policy API even if
	 * SLM is stopped.
	 * <p>
	 * The API returns a response as soon as the request is acknowledged, but the
	 * plugin might continue to run until in-progress operations complete and it can
	 * be safely stopped. Use the get snapshot lifecycle management status API to
	 * see if SLM is running.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopSlmRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-stop">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopSlmResponse> stop(
			Function<StopSlmRequest.Builder, ObjectBuilder<StopSlmRequest>> fn) {
		return stop(fn.apply(new StopSlmRequest.Builder()).build());
	}

	/**
	 * Stop snapshot lifecycle management.
	 * <p>
	 * Stop all snapshot lifecycle management (SLM) operations and the SLM plugin.
	 * This API is useful when you are performing maintenance on a cluster and need
	 * to prevent SLM from performing any actions on your data streams or indices.
	 * Stopping SLM does not stop any snapshots that are in progress. You can
	 * manually trigger snapshots with the run snapshot lifecycle policy API even if
	 * SLM is stopped.
	 * <p>
	 * The API returns a response as soon as the request is acknowledged, but the
	 * plugin might continue to run until in-progress operations complete and it can
	 * be safely stopped. Use the get snapshot lifecycle management status API to
	 * see if SLM is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-slm-stop">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopSlmResponse> stop() {
		return this.transport.performRequestAsync(new StopSlmRequest.Builder().build(), StopSlmRequest._ENDPOINT,
				this.transportOptions);
	}

}
