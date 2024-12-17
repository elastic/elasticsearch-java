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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
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
 * Client for the cluster namespace.
 */
public class ElasticsearchClusterAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchClusterAsyncClient> {

	public ElasticsearchClusterAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchClusterAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchClusterAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchClusterAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cluster.allocation_explain

	/**
	 * Explain the shard allocations. Get explanations for shard allocations in the
	 * cluster. For unassigned shards, it provides an explanation for why the shard
	 * is unassigned. For assigned shards, it provides an explanation for why the
	 * shard is remaining on its current node and has not moved or rebalanced to
	 * another node. This API can be very useful when attempting to diagnose why a
	 * shard is unassigned or why a shard continues to remain on its current node
	 * when you might expect otherwise.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationExplainResponse> allocationExplain(AllocationExplainRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse> endpoint = (JsonEndpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse>) AllocationExplainRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Explain the shard allocations. Get explanations for shard allocations in the
	 * cluster. For unassigned shards, it provides an explanation for why the shard
	 * is unassigned. For assigned shards, it provides an explanation for why the
	 * shard is remaining on its current node and has not moved or rebalanced to
	 * another node. This API can be very useful when attempting to diagnose why a
	 * shard is unassigned or why a shard continues to remain on its current node
	 * when you might expect otherwise.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AllocationExplainResponse> allocationExplain(
			Function<AllocationExplainRequest.Builder, ObjectBuilder<AllocationExplainRequest>> fn) {
		return allocationExplain(fn.apply(new AllocationExplainRequest.Builder()).build());
	}

	/**
	 * Explain the shard allocations. Get explanations for shard allocations in the
	 * cluster. For unassigned shards, it provides an explanation for why the shard
	 * is unassigned. For assigned shards, it provides an explanation for why the
	 * shard is remaining on its current node and has not moved or rebalanced to
	 * another node. This API can be very useful when attempting to diagnose why a
	 * shard is unassigned or why a shard continues to remain on its current node
	 * when you might expect otherwise.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationExplainResponse> allocationExplain() {
		return this.transport.performRequestAsync(new AllocationExplainRequest.Builder().build(),
				AllocationExplainRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.delete_component_template

	/**
	 * Delete component templates. Deletes component templates. Component templates
	 * are building blocks for constructing index templates that specify index
	 * mappings, settings, and aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(
			DeleteComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse>) DeleteComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete component templates. Deletes component templates. Component templates
	 * are building blocks for constructing index templates that specify index
	 * mappings, settings, and aliases.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(
			Function<DeleteComponentTemplateRequest.Builder, ObjectBuilder<DeleteComponentTemplateRequest>> fn) {
		return deleteComponentTemplate(fn.apply(new DeleteComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.delete_voting_config_exclusions

	/**
	 * Clear cluster voting config exclusions. Remove master-eligible nodes from the
	 * voting configuration exclusion list.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deleteVotingConfigExclusions(
			DeleteVotingConfigExclusionsRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>) DeleteVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear cluster voting config exclusions. Remove master-eligible nodes from the
	 * voting configuration exclusion list.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> deleteVotingConfigExclusions(
			Function<DeleteVotingConfigExclusionsRequest.Builder, ObjectBuilder<DeleteVotingConfigExclusionsRequest>> fn) {
		return deleteVotingConfigExclusions(fn.apply(new DeleteVotingConfigExclusionsRequest.Builder()).build());
	}

	/**
	 * Clear cluster voting config exclusions. Remove master-eligible nodes from the
	 * voting configuration exclusion list.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deleteVotingConfigExclusions() {
		return this.transport.performRequestAsync(new DeleteVotingConfigExclusionsRequest.Builder().build(),
				DeleteVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.exists_component_template

	/**
	 * Check component templates. Returns information about whether a particular
	 * component template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsComponentTemplate(ExistsComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse>) ExistsComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check component templates. Returns information about whether a particular
	 * component template exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsComponentTemplate(
			Function<ExistsComponentTemplateRequest.Builder, ObjectBuilder<ExistsComponentTemplateRequest>> fn) {
		return existsComponentTemplate(fn.apply(new ExistsComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.get_component_template

	/**
	 * Get component templates. Retrieves information about component templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(GetComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse>) GetComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get component templates. Retrieves information about component templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(
			Function<GetComponentTemplateRequest.Builder, ObjectBuilder<GetComponentTemplateRequest>> fn) {
		return getComponentTemplate(fn.apply(new GetComponentTemplateRequest.Builder()).build());
	}

	/**
	 * Get component templates. Retrieves information about component templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetComponentTemplateResponse> getComponentTemplate() {
		return this.transport.performRequestAsync(new GetComponentTemplateRequest.Builder().build(),
				GetComponentTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.get_settings

	/**
	 * Get cluster-wide settings. By default, it returns only settings that have
	 * been explicitly defined.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetClusterSettingsResponse> getSettings(GetClusterSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse>) GetClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get cluster-wide settings. By default, it returns only settings that have
	 * been explicitly defined.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetClusterSettingsResponse> getSettings(
			Function<GetClusterSettingsRequest.Builder, ObjectBuilder<GetClusterSettingsRequest>> fn) {
		return getSettings(fn.apply(new GetClusterSettingsRequest.Builder()).build());
	}

	/**
	 * Get cluster-wide settings. By default, it returns only settings that have
	 * been explicitly defined.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetClusterSettingsResponse> getSettings() {
		return this.transport.performRequestAsync(new GetClusterSettingsRequest.Builder().build(),
				GetClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.health

	/**
	 * Get the cluster health status. You can also use the API to get the health
	 * status of only specified data streams and indices. For data streams, the API
	 * retrieves the health status of the stream’s backing indices.
	 * <p>
	 * The cluster health status is: green, yellow or red. On the shard level, a red
	 * status indicates that the specific shard is not allocated in the cluster.
	 * Yellow means that the primary shard is allocated but replicas are not. Green
	 * means that all shards are allocated. The index level status is controlled by
	 * the worst shard status.
	 * <p>
	 * One of the main benefits of the API is the ability to wait until the cluster
	 * reaches a certain high watermark health level. The cluster status is
	 * controlled by the worst index status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse> endpoint = (JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse>) HealthRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the cluster health status. You can also use the API to get the health
	 * status of only specified data streams and indices. For data streams, the API
	 * retrieves the health status of the stream’s backing indices.
	 * <p>
	 * The cluster health status is: green, yellow or red. On the shard level, a red
	 * status indicates that the specific shard is not allocated in the cluster.
	 * Yellow means that the primary shard is allocated but replicas are not. Green
	 * means that all shards are allocated. The index level status is controlled by
	 * the worst shard status.
	 * <p>
	 * One of the main benefits of the API is the ability to wait until the cluster
	 * reaches a certain high watermark health level. The cluster status is
	 * controlled by the worst index status.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HealthResponse> health(
			Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn) {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	/**
	 * Get the cluster health status. You can also use the API to get the health
	 * status of only specified data streams and indices. For data streams, the API
	 * retrieves the health status of the stream’s backing indices.
	 * <p>
	 * The cluster health status is: green, yellow or red. On the shard level, a red
	 * status indicates that the specific shard is not allocated in the cluster.
	 * Yellow means that the primary shard is allocated but replicas are not. Green
	 * means that all shards are allocated. The index level status is controlled by
	 * the worst shard status.
	 * <p>
	 * One of the main benefits of the API is the ability to wait until the cluster
	 * reaches a certain high watermark health level. The cluster status is
	 * controlled by the worst index status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health() {
		return this.transport.performRequestAsync(new HealthRequest.Builder().build(), HealthRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.info

	/**
	 * Get cluster info. Returns basic information about the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterInfoResponse> info(ClusterInfoRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClusterInfoRequest, ClusterInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<ClusterInfoRequest, ClusterInfoResponse, ErrorResponse>) ClusterInfoRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get cluster info. Returns basic information about the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClusterInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClusterInfoResponse> info(
			Function<ClusterInfoRequest.Builder, ObjectBuilder<ClusterInfoRequest>> fn) {
		return info(fn.apply(new ClusterInfoRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.pending_tasks

	/**
	 * Get the pending cluster tasks. Get information about cluster-level changes
	 * (such as create index, update mapping, allocate or fail shard) that have not
	 * yet taken effect.
	 * <p>
	 * NOTE: This API returns a list of any pending updates to the cluster state.
	 * These are distinct from the tasks reported by the task management API which
	 * include periodic tasks and tasks initiated by the user, such as node stats,
	 * search queries, or create index requests. However, if a user-initiated task
	 * such as a create index command causes a cluster state update, the activity of
	 * this task might be reported by both task api and pending cluster tasks API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PendingTasksResponse> pendingTasks(PendingTasksRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse> endpoint = (JsonEndpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse>) PendingTasksRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the pending cluster tasks. Get information about cluster-level changes
	 * (such as create index, update mapping, allocate or fail shard) that have not
	 * yet taken effect.
	 * <p>
	 * NOTE: This API returns a list of any pending updates to the cluster state.
	 * These are distinct from the tasks reported by the task management API which
	 * include periodic tasks and tasks initiated by the user, such as node stats,
	 * search queries, or create index requests. However, if a user-initiated task
	 * such as a create index command causes a cluster state update, the activity of
	 * this task might be reported by both task api and pending cluster tasks API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PendingTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PendingTasksResponse> pendingTasks(
			Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn) {
		return pendingTasks(fn.apply(new PendingTasksRequest.Builder()).build());
	}

	/**
	 * Get the pending cluster tasks. Get information about cluster-level changes
	 * (such as create index, update mapping, allocate or fail shard) that have not
	 * yet taken effect.
	 * <p>
	 * NOTE: This API returns a list of any pending updates to the cluster state.
	 * These are distinct from the tasks reported by the task management API which
	 * include periodic tasks and tasks initiated by the user, such as node stats,
	 * search queries, or create index requests. However, if a user-initiated task
	 * such as a create index command causes a cluster state update, the activity of
	 * this task might be reported by both task api and pending cluster tasks API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PendingTasksResponse> pendingTasks() {
		return this.transport.performRequestAsync(new PendingTasksRequest.Builder().build(),
				PendingTasksRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.post_voting_config_exclusions

	/**
	 * Update voting configuration exclusions. Update the cluster voting config
	 * exclusions by node IDs or node names. By default, if there are more than
	 * three master-eligible nodes in the cluster and you remove fewer than half of
	 * the master-eligible nodes in the cluster at once, the voting configuration
	 * automatically shrinks. If you want to shrink the voting configuration to
	 * contain fewer than three nodes or to remove half or more of the
	 * master-eligible nodes in the cluster at once, use this API to remove
	 * departing nodes from the voting configuration manually. The API adds an entry
	 * for each specified node to the cluster’s voting configuration exclusions
	 * list. It then waits until the cluster has reconfigured its voting
	 * configuration to exclude the specified nodes.
	 * <p>
	 * Clusters should have no voting configuration exclusions in normal operation.
	 * Once the excluded nodes have stopped, clear the voting configuration
	 * exclusions with <code>DELETE /_cluster/voting_config_exclusions</code>. This
	 * API waits for the nodes to be fully removed from the cluster before it
	 * returns. If your cluster has voting configuration exclusions for nodes that
	 * you no longer intend to remove, use
	 * <code>DELETE /_cluster/voting_config_exclusions?wait_for_removal=false</code>
	 * to clear the voting configuration exclusions without waiting for the nodes to
	 * leave the cluster.
	 * <p>
	 * A response to <code>POST /_cluster/voting_config_exclusions</code> with an
	 * HTTP status code of 200 OK guarantees that the node has been removed from the
	 * voting configuration and will not be reinstated until the voting
	 * configuration exclusions are cleared by calling
	 * <code>DELETE /_cluster/voting_config_exclusions</code>. If the call to
	 * <code>POST /_cluster/voting_config_exclusions</code> fails or returns a
	 * response with an HTTP status code other than 200 OK then the node may not
	 * have been removed from the voting configuration. In that case, you may safely
	 * retry the call.
	 * <p>
	 * NOTE: Voting exclusions are required only when you remove at least half of
	 * the master-eligible nodes from a cluster in a short time period. They are not
	 * required when removing master-ineligible nodes or when removing fewer than
	 * half of the master-eligible nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> postVotingConfigExclusions(PostVotingConfigExclusionsRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>) PostVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update voting configuration exclusions. Update the cluster voting config
	 * exclusions by node IDs or node names. By default, if there are more than
	 * three master-eligible nodes in the cluster and you remove fewer than half of
	 * the master-eligible nodes in the cluster at once, the voting configuration
	 * automatically shrinks. If you want to shrink the voting configuration to
	 * contain fewer than three nodes or to remove half or more of the
	 * master-eligible nodes in the cluster at once, use this API to remove
	 * departing nodes from the voting configuration manually. The API adds an entry
	 * for each specified node to the cluster’s voting configuration exclusions
	 * list. It then waits until the cluster has reconfigured its voting
	 * configuration to exclude the specified nodes.
	 * <p>
	 * Clusters should have no voting configuration exclusions in normal operation.
	 * Once the excluded nodes have stopped, clear the voting configuration
	 * exclusions with <code>DELETE /_cluster/voting_config_exclusions</code>. This
	 * API waits for the nodes to be fully removed from the cluster before it
	 * returns. If your cluster has voting configuration exclusions for nodes that
	 * you no longer intend to remove, use
	 * <code>DELETE /_cluster/voting_config_exclusions?wait_for_removal=false</code>
	 * to clear the voting configuration exclusions without waiting for the nodes to
	 * leave the cluster.
	 * <p>
	 * A response to <code>POST /_cluster/voting_config_exclusions</code> with an
	 * HTTP status code of 200 OK guarantees that the node has been removed from the
	 * voting configuration and will not be reinstated until the voting
	 * configuration exclusions are cleared by calling
	 * <code>DELETE /_cluster/voting_config_exclusions</code>. If the call to
	 * <code>POST /_cluster/voting_config_exclusions</code> fails or returns a
	 * response with an HTTP status code other than 200 OK then the node may not
	 * have been removed from the voting configuration. In that case, you may safely
	 * retry the call.
	 * <p>
	 * NOTE: Voting exclusions are required only when you remove at least half of
	 * the master-eligible nodes from a cluster in a short time period. They are not
	 * required when removing master-ineligible nodes or when removing fewer than
	 * half of the master-eligible nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> postVotingConfigExclusions(
			Function<PostVotingConfigExclusionsRequest.Builder, ObjectBuilder<PostVotingConfigExclusionsRequest>> fn) {
		return postVotingConfigExclusions(fn.apply(new PostVotingConfigExclusionsRequest.Builder()).build());
	}

	/**
	 * Update voting configuration exclusions. Update the cluster voting config
	 * exclusions by node IDs or node names. By default, if there are more than
	 * three master-eligible nodes in the cluster and you remove fewer than half of
	 * the master-eligible nodes in the cluster at once, the voting configuration
	 * automatically shrinks. If you want to shrink the voting configuration to
	 * contain fewer than three nodes or to remove half or more of the
	 * master-eligible nodes in the cluster at once, use this API to remove
	 * departing nodes from the voting configuration manually. The API adds an entry
	 * for each specified node to the cluster’s voting configuration exclusions
	 * list. It then waits until the cluster has reconfigured its voting
	 * configuration to exclude the specified nodes.
	 * <p>
	 * Clusters should have no voting configuration exclusions in normal operation.
	 * Once the excluded nodes have stopped, clear the voting configuration
	 * exclusions with <code>DELETE /_cluster/voting_config_exclusions</code>. This
	 * API waits for the nodes to be fully removed from the cluster before it
	 * returns. If your cluster has voting configuration exclusions for nodes that
	 * you no longer intend to remove, use
	 * <code>DELETE /_cluster/voting_config_exclusions?wait_for_removal=false</code>
	 * to clear the voting configuration exclusions without waiting for the nodes to
	 * leave the cluster.
	 * <p>
	 * A response to <code>POST /_cluster/voting_config_exclusions</code> with an
	 * HTTP status code of 200 OK guarantees that the node has been removed from the
	 * voting configuration and will not be reinstated until the voting
	 * configuration exclusions are cleared by calling
	 * <code>DELETE /_cluster/voting_config_exclusions</code>. If the call to
	 * <code>POST /_cluster/voting_config_exclusions</code> fails or returns a
	 * response with an HTTP status code other than 200 OK then the node may not
	 * have been removed from the voting configuration. In that case, you may safely
	 * retry the call.
	 * <p>
	 * NOTE: Voting exclusions are required only when you remove at least half of
	 * the master-eligible nodes from a cluster in a short time period. They are not
	 * required when removing master-ineligible nodes or when removing fewer than
	 * half of the master-eligible nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> postVotingConfigExclusions() {
		return this.transport.performRequestAsync(new PostVotingConfigExclusionsRequest.Builder().build(),
				PostVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.put_component_template

	/**
	 * Create or update a component template. Creates or updates a component
	 * template. Component templates are building blocks for constructing index
	 * templates that specify index mappings, settings, and aliases.
	 * <p>
	 * An index template can be composed of multiple component templates. To use a
	 * component template, specify it in an index template’s
	 * <code>composed_of</code> list. Component templates are only applied to new
	 * data streams and indices as part of a matching index template.
	 * <p>
	 * Settings and mappings specified directly in the index template or the create
	 * index request override any settings or mappings specified in a component
	 * template.
	 * <p>
	 * Component templates are only used during index creation. For data streams,
	 * this includes data stream creation and the creation of a stream’s backing
	 * indices. Changes to component templates do not affect existing indices,
	 * including a stream’s backing indices.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in component
	 * templates. You can include comments anywhere in the request body except
	 * before the opening curly bracket.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutComponentTemplateResponse> putComponentTemplate(PutComponentTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse>) PutComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a component template. Creates or updates a component
	 * template. Component templates are building blocks for constructing index
	 * templates that specify index mappings, settings, and aliases.
	 * <p>
	 * An index template can be composed of multiple component templates. To use a
	 * component template, specify it in an index template’s
	 * <code>composed_of</code> list. Component templates are only applied to new
	 * data streams and indices as part of a matching index template.
	 * <p>
	 * Settings and mappings specified directly in the index template or the create
	 * index request override any settings or mappings specified in a component
	 * template.
	 * <p>
	 * Component templates are only used during index creation. For data streams,
	 * this includes data stream creation and the creation of a stream’s backing
	 * indices. Changes to component templates do not affect existing indices,
	 * including a stream’s backing indices.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in component
	 * templates. You can include comments anywhere in the request body except
	 * before the opening curly bracket.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutComponentTemplateResponse> putComponentTemplate(
			Function<PutComponentTemplateRequest.Builder, ObjectBuilder<PutComponentTemplateRequest>> fn) {
		return putComponentTemplate(fn.apply(new PutComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.put_settings

	/**
	 * Update the cluster settings. Configure and update dynamic settings on a
	 * running cluster. You can also configure dynamic settings locally on an
	 * unstarted or shut down node in <code>elasticsearch.yml</code>.
	 * <p>
	 * Updates made with this API can be persistent, which apply across cluster
	 * restarts, or transient, which reset after a cluster restart. You can also
	 * reset transient or persistent settings by assigning them a null value.
	 * <p>
	 * If you configure the same setting using multiple methods, Elasticsearch
	 * applies the settings in following order of precedence: 1) Transient setting;
	 * 2) Persistent setting; 3) <code>elasticsearch.yml</code> setting; 4) Default
	 * setting value. For example, you can apply a transient setting to override a
	 * persistent setting or <code>elasticsearch.yml</code> setting. However, a
	 * change to an <code>elasticsearch.yml</code> setting will not override a
	 * defined transient or persistent setting.
	 * <p>
	 * TIP: In Elastic Cloud, use the user settings feature to configure all cluster
	 * settings. This method automatically rejects unsafe settings that could break
	 * your cluster. If you run Elasticsearch on your own hardware, use this API to
	 * configure dynamic cluster settings. Only use <code>elasticsearch.yml</code>
	 * for static cluster settings and node settings. The API doesn’t require a
	 * restart and ensures a setting’s value is the same on all nodes.
	 * <p>
	 * WARNING: Transient cluster settings are no longer recommended. Use persistent
	 * cluster settings instead. If a cluster becomes unstable, transient settings
	 * can clear unexpectedly, resulting in a potentially undesired cluster
	 * configuration.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutClusterSettingsResponse> putSettings(PutClusterSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse>) PutClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the cluster settings. Configure and update dynamic settings on a
	 * running cluster. You can also configure dynamic settings locally on an
	 * unstarted or shut down node in <code>elasticsearch.yml</code>.
	 * <p>
	 * Updates made with this API can be persistent, which apply across cluster
	 * restarts, or transient, which reset after a cluster restart. You can also
	 * reset transient or persistent settings by assigning them a null value.
	 * <p>
	 * If you configure the same setting using multiple methods, Elasticsearch
	 * applies the settings in following order of precedence: 1) Transient setting;
	 * 2) Persistent setting; 3) <code>elasticsearch.yml</code> setting; 4) Default
	 * setting value. For example, you can apply a transient setting to override a
	 * persistent setting or <code>elasticsearch.yml</code> setting. However, a
	 * change to an <code>elasticsearch.yml</code> setting will not override a
	 * defined transient or persistent setting.
	 * <p>
	 * TIP: In Elastic Cloud, use the user settings feature to configure all cluster
	 * settings. This method automatically rejects unsafe settings that could break
	 * your cluster. If you run Elasticsearch on your own hardware, use this API to
	 * configure dynamic cluster settings. Only use <code>elasticsearch.yml</code>
	 * for static cluster settings and node settings. The API doesn’t require a
	 * restart and ensures a setting’s value is the same on all nodes.
	 * <p>
	 * WARNING: Transient cluster settings are no longer recommended. Use persistent
	 * cluster settings instead. If a cluster becomes unstable, transient settings
	 * can clear unexpectedly, resulting in a potentially undesired cluster
	 * configuration.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutClusterSettingsResponse> putSettings(
			Function<PutClusterSettingsRequest.Builder, ObjectBuilder<PutClusterSettingsRequest>> fn) {
		return putSettings(fn.apply(new PutClusterSettingsRequest.Builder()).build());
	}

	/**
	 * Update the cluster settings. Configure and update dynamic settings on a
	 * running cluster. You can also configure dynamic settings locally on an
	 * unstarted or shut down node in <code>elasticsearch.yml</code>.
	 * <p>
	 * Updates made with this API can be persistent, which apply across cluster
	 * restarts, or transient, which reset after a cluster restart. You can also
	 * reset transient or persistent settings by assigning them a null value.
	 * <p>
	 * If you configure the same setting using multiple methods, Elasticsearch
	 * applies the settings in following order of precedence: 1) Transient setting;
	 * 2) Persistent setting; 3) <code>elasticsearch.yml</code> setting; 4) Default
	 * setting value. For example, you can apply a transient setting to override a
	 * persistent setting or <code>elasticsearch.yml</code> setting. However, a
	 * change to an <code>elasticsearch.yml</code> setting will not override a
	 * defined transient or persistent setting.
	 * <p>
	 * TIP: In Elastic Cloud, use the user settings feature to configure all cluster
	 * settings. This method automatically rejects unsafe settings that could break
	 * your cluster. If you run Elasticsearch on your own hardware, use this API to
	 * configure dynamic cluster settings. Only use <code>elasticsearch.yml</code>
	 * for static cluster settings and node settings. The API doesn’t require a
	 * restart and ensures a setting’s value is the same on all nodes.
	 * <p>
	 * WARNING: Transient cluster settings are no longer recommended. Use persistent
	 * cluster settings instead. If a cluster becomes unstable, transient settings
	 * can clear unexpectedly, resulting in a potentially undesired cluster
	 * configuration.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutClusterSettingsResponse> putSettings() {
		return this.transport.performRequestAsync(new PutClusterSettingsRequest.Builder().build(),
				PutClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.remote_info

	/**
	 * Get remote cluster information. Get all of the configured remote cluster
	 * information. This API returns connection and endpoint information keyed by
	 * the configured remote cluster alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-remote-info.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<RemoteInfoResponse> remoteInfo() {
		return this.transport.performRequestAsync(RemoteInfoRequest._INSTANCE, RemoteInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.reroute

	/**
	 * Reroute the cluster. Manually change the allocation of individual shards in
	 * the cluster. For example, a shard can be moved from one node to another
	 * explicitly, an allocation can be canceled, and an unassigned shard can be
	 * explicitly allocated to a specific node.
	 * <p>
	 * It is important to note that after processing any reroute commands
	 * Elasticsearch will perform rebalancing as normal (respecting the values of
	 * settings such as <code>cluster.routing.rebalance.enable</code>) in order to
	 * remain in a balanced state. For example, if the requested allocation includes
	 * moving a shard from node1 to node2 then this may cause a shard to be moved
	 * from node2 back to node1 to even things out.
	 * <p>
	 * The cluster can be set to disable allocations using the
	 * <code>cluster.routing.allocation.enable</code> setting. If allocations are
	 * disabled then the only allocations that will be performed are explicit ones
	 * given using the reroute command, and consequent allocations due to
	 * rebalancing.
	 * <p>
	 * The cluster will attempt to allocate a shard a maximum of
	 * <code>index.allocation.max_retries</code> times in a row (defaults to
	 * <code>5</code>), before giving up and leaving the shard unallocated. This
	 * scenario can be caused by structural problems such as having an analyzer
	 * which refers to a stopwords file which doesn’t exist on all nodes.
	 * <p>
	 * Once the problem has been corrected, allocation can be manually retried by
	 * calling the reroute API with the <code>?retry_failed</code> URI query
	 * parameter, which will attempt a single retry round for these shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RerouteResponse> reroute(RerouteRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RerouteRequest, RerouteResponse, ErrorResponse> endpoint = (JsonEndpoint<RerouteRequest, RerouteResponse, ErrorResponse>) RerouteRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Reroute the cluster. Manually change the allocation of individual shards in
	 * the cluster. For example, a shard can be moved from one node to another
	 * explicitly, an allocation can be canceled, and an unassigned shard can be
	 * explicitly allocated to a specific node.
	 * <p>
	 * It is important to note that after processing any reroute commands
	 * Elasticsearch will perform rebalancing as normal (respecting the values of
	 * settings such as <code>cluster.routing.rebalance.enable</code>) in order to
	 * remain in a balanced state. For example, if the requested allocation includes
	 * moving a shard from node1 to node2 then this may cause a shard to be moved
	 * from node2 back to node1 to even things out.
	 * <p>
	 * The cluster can be set to disable allocations using the
	 * <code>cluster.routing.allocation.enable</code> setting. If allocations are
	 * disabled then the only allocations that will be performed are explicit ones
	 * given using the reroute command, and consequent allocations due to
	 * rebalancing.
	 * <p>
	 * The cluster will attempt to allocate a shard a maximum of
	 * <code>index.allocation.max_retries</code> times in a row (defaults to
	 * <code>5</code>), before giving up and leaving the shard unallocated. This
	 * scenario can be caused by structural problems such as having an analyzer
	 * which refers to a stopwords file which doesn’t exist on all nodes.
	 * <p>
	 * Once the problem has been corrected, allocation can be manually retried by
	 * calling the reroute API with the <code>?retry_failed</code> URI query
	 * parameter, which will attempt a single retry round for these shards.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RerouteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RerouteResponse> reroute(
			Function<RerouteRequest.Builder, ObjectBuilder<RerouteRequest>> fn) {
		return reroute(fn.apply(new RerouteRequest.Builder()).build());
	}

	/**
	 * Reroute the cluster. Manually change the allocation of individual shards in
	 * the cluster. For example, a shard can be moved from one node to another
	 * explicitly, an allocation can be canceled, and an unassigned shard can be
	 * explicitly allocated to a specific node.
	 * <p>
	 * It is important to note that after processing any reroute commands
	 * Elasticsearch will perform rebalancing as normal (respecting the values of
	 * settings such as <code>cluster.routing.rebalance.enable</code>) in order to
	 * remain in a balanced state. For example, if the requested allocation includes
	 * moving a shard from node1 to node2 then this may cause a shard to be moved
	 * from node2 back to node1 to even things out.
	 * <p>
	 * The cluster can be set to disable allocations using the
	 * <code>cluster.routing.allocation.enable</code> setting. If allocations are
	 * disabled then the only allocations that will be performed are explicit ones
	 * given using the reroute command, and consequent allocations due to
	 * rebalancing.
	 * <p>
	 * The cluster will attempt to allocate a shard a maximum of
	 * <code>index.allocation.max_retries</code> times in a row (defaults to
	 * <code>5</code>), before giving up and leaving the shard unallocated. This
	 * scenario can be caused by structural problems such as having an analyzer
	 * which refers to a stopwords file which doesn’t exist on all nodes.
	 * <p>
	 * Once the problem has been corrected, allocation can be manually retried by
	 * calling the reroute API with the <code>?retry_failed</code> URI query
	 * parameter, which will attempt a single retry round for these shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RerouteResponse> reroute() {
		return this.transport.performRequestAsync(new RerouteRequest.Builder().build(), RerouteRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.state

	/**
	 * Get the cluster state. Get comprehensive information about the state of the
	 * cluster.
	 * <p>
	 * The cluster state is an internal data structure which keeps track of a
	 * variety of information needed by every node, including the identity and
	 * attributes of the other nodes in the cluster; cluster-wide settings; index
	 * metadata, including the mapping and settings for each index; the location and
	 * status of every shard copy in the cluster.
	 * <p>
	 * The elected master node ensures that every node in the cluster has a copy of
	 * the same cluster state. This API lets you retrieve a representation of this
	 * internal state for debugging or diagnostic purposes. You may need to consult
	 * the Elasticsearch source code to determine the precise meaning of the
	 * response.
	 * <p>
	 * By default the API will route requests to the elected master node since this
	 * node is the authoritative source of cluster states. You can also retrieve the
	 * cluster state held on the node handling the API request by adding the
	 * <code>?local=true</code> query parameter.
	 * <p>
	 * Elasticsearch may need to expend significant effort to compute a response to
	 * this API in larger clusters, and the response may comprise a very large
	 * quantity of data. If you use this API repeatedly, your cluster may become
	 * unstable.
	 * <p>
	 * WARNING: The response is a representation of an internal data structure. Its
	 * format is not subject to the same compatibility guarantees as other more
	 * stable APIs and may change from version to version. Do not query this API
	 * using external monitoring tools. Instead, obtain the information you require
	 * using other more stable cluster APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StateResponse> state(StateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StateRequest, StateResponse, ErrorResponse> endpoint = (JsonEndpoint<StateRequest, StateResponse, ErrorResponse>) StateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the cluster state. Get comprehensive information about the state of the
	 * cluster.
	 * <p>
	 * The cluster state is an internal data structure which keeps track of a
	 * variety of information needed by every node, including the identity and
	 * attributes of the other nodes in the cluster; cluster-wide settings; index
	 * metadata, including the mapping and settings for each index; the location and
	 * status of every shard copy in the cluster.
	 * <p>
	 * The elected master node ensures that every node in the cluster has a copy of
	 * the same cluster state. This API lets you retrieve a representation of this
	 * internal state for debugging or diagnostic purposes. You may need to consult
	 * the Elasticsearch source code to determine the precise meaning of the
	 * response.
	 * <p>
	 * By default the API will route requests to the elected master node since this
	 * node is the authoritative source of cluster states. You can also retrieve the
	 * cluster state held on the node handling the API request by adding the
	 * <code>?local=true</code> query parameter.
	 * <p>
	 * Elasticsearch may need to expend significant effort to compute a response to
	 * this API in larger clusters, and the response may comprise a very large
	 * quantity of data. If you use this API repeatedly, your cluster may become
	 * unstable.
	 * <p>
	 * WARNING: The response is a representation of an internal data structure. Its
	 * format is not subject to the same compatibility guarantees as other more
	 * stable APIs and may change from version to version. Do not query this API
	 * using external monitoring tools. Instead, obtain the information you require
	 * using other more stable cluster APIs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StateResponse> state(
			Function<StateRequest.Builder, ObjectBuilder<StateRequest>> fn) {
		return state(fn.apply(new StateRequest.Builder()).build());
	}

	/**
	 * Get the cluster state. Get comprehensive information about the state of the
	 * cluster.
	 * <p>
	 * The cluster state is an internal data structure which keeps track of a
	 * variety of information needed by every node, including the identity and
	 * attributes of the other nodes in the cluster; cluster-wide settings; index
	 * metadata, including the mapping and settings for each index; the location and
	 * status of every shard copy in the cluster.
	 * <p>
	 * The elected master node ensures that every node in the cluster has a copy of
	 * the same cluster state. This API lets you retrieve a representation of this
	 * internal state for debugging or diagnostic purposes. You may need to consult
	 * the Elasticsearch source code to determine the precise meaning of the
	 * response.
	 * <p>
	 * By default the API will route requests to the elected master node since this
	 * node is the authoritative source of cluster states. You can also retrieve the
	 * cluster state held on the node handling the API request by adding the
	 * <code>?local=true</code> query parameter.
	 * <p>
	 * Elasticsearch may need to expend significant effort to compute a response to
	 * this API in larger clusters, and the response may comprise a very large
	 * quantity of data. If you use this API repeatedly, your cluster may become
	 * unstable.
	 * <p>
	 * WARNING: The response is a representation of an internal data structure. Its
	 * format is not subject to the same compatibility guarantees as other more
	 * stable APIs and may change from version to version. Do not query this API
	 * using external monitoring tools. Instead, obtain the information you require
	 * using other more stable cluster APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StateResponse> state() {
		return this.transport.performRequestAsync(new StateRequest.Builder().build(), StateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.stats

	/**
	 * Get cluster statistics. Get basic index metrics (shard numbers, store size,
	 * memory usage) and information about the current nodes that form the cluster
	 * (number, roles, os, jvm versions, memory usage, cpu and installed plugins).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterStatsResponse> stats(ClusterStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse>) ClusterStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get cluster statistics. Get basic index metrics (shard numbers, store size,
	 * memory usage) and information about the current nodes that form the cluster
	 * (number, roles, os, jvm versions, memory usage, cpu and installed plugins).
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClusterStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClusterStatsResponse> stats(
			Function<ClusterStatsRequest.Builder, ObjectBuilder<ClusterStatsRequest>> fn) {
		return stats(fn.apply(new ClusterStatsRequest.Builder()).build());
	}

	/**
	 * Get cluster statistics. Get basic index metrics (shard numbers, store size,
	 * memory usage) and information about the current nodes that form the cluster
	 * (number, roles, os, jvm versions, memory usage, cpu and installed plugins).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterStatsResponse> stats() {
		return this.transport.performRequestAsync(new ClusterStatsRequest.Builder().build(),
				ClusterStatsRequest._ENDPOINT, this.transportOptions);
	}

}
