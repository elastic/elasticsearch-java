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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the cluster namespace.
 */
public class ElasticsearchClusterClient extends ApiClient<ElasticsearchTransport, ElasticsearchClusterClient> {

	public ElasticsearchClusterClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchClusterClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchClusterClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchClusterClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cluster.allocation_explain

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public AllocationExplainResponse allocationExplain(AllocationExplainRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse> endpoint = (Endpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse>) AllocationExplainRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AllocationExplainResponse allocationExplain(Consumer<AllocationExplainRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		AllocationExplainRequest.Builder builder = new AllocationExplainRequest.Builder();
		fn.accept(builder);
		return allocationExplain(builder.build());
	}

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public AllocationExplainResponse allocationExplain() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new AllocationExplainRequest.Builder().build(),
				AllocationExplainRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.delete_component_template

	/**
	 * Deletes a component template
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteComponentTemplateResponse deleteComponentTemplate(DeleteComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse> endpoint = (Endpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse>) DeleteComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a component template
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteComponentTemplateResponse deleteComponentTemplate(
			Consumer<DeleteComponentTemplateRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeleteComponentTemplateRequest.Builder builder = new DeleteComponentTemplateRequest.Builder();
		fn.accept(builder);
		return deleteComponentTemplate(builder.build());
	}

	// ----- Endpoint: cluster.delete_voting_config_exclusions

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse deleteVotingConfigExclusions(DeleteVotingConfigExclusionsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>) DeleteVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse deleteVotingConfigExclusions(Consumer<DeleteVotingConfigExclusionsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteVotingConfigExclusionsRequest.Builder builder = new DeleteVotingConfigExclusionsRequest.Builder();
		fn.accept(builder);
		return deleteVotingConfigExclusions(builder.build());
	}

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse deleteVotingConfigExclusions() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new DeleteVotingConfigExclusionsRequest.Builder().build(),
				DeleteVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.exists_component_template

	/**
	 * Returns information about whether a particular component template exist
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsComponentTemplate(ExistsComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse>) ExistsComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular component template exist
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsComponentTemplate(Consumer<ExistsComponentTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExistsComponentTemplateRequest.Builder builder = new ExistsComponentTemplateRequest.Builder();
		fn.accept(builder);
		return existsComponentTemplate(builder.build());
	}

	// ----- Endpoint: cluster.get_component_template

	/**
	 * Returns one or more component templates
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetComponentTemplateResponse getComponentTemplate(GetComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse> endpoint = (Endpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse>) GetComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns one or more component templates
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetComponentTemplateResponse getComponentTemplate(Consumer<GetComponentTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetComponentTemplateRequest.Builder builder = new GetComponentTemplateRequest.Builder();
		fn.accept(builder);
		return getComponentTemplate(builder.build());
	}

	/**
	 * Returns one or more component templates
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetComponentTemplateResponse getComponentTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetComponentTemplateRequest.Builder().build(),
				GetComponentTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.get_settings

	/**
	 * Returns cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetClusterSettingsResponse getSettings(GetClusterSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse> endpoint = (Endpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse>) GetClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns cluster settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetClusterSettingsResponse getSettings(Consumer<GetClusterSettingsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetClusterSettingsRequest.Builder builder = new GetClusterSettingsRequest.Builder();
		fn.accept(builder);
		return getSettings(builder.build());
	}

	/**
	 * Returns cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetClusterSettingsResponse getSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetClusterSettingsRequest.Builder().build(),
				GetClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.health

	/**
	 * Returns basic information about the health of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public HealthResponse health(HealthRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<HealthRequest, HealthResponse, ErrorResponse> endpoint = (Endpoint<HealthRequest, HealthResponse, ErrorResponse>) HealthRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns basic information about the health of the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final HealthResponse health(Consumer<HealthRequest.Builder> fn) throws IOException, ElasticsearchException {
		HealthRequest.Builder builder = new HealthRequest.Builder();
		fn.accept(builder);
		return health(builder.build());
	}

	/**
	 * Returns basic information about the health of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public HealthResponse health() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new HealthRequest.Builder().build(), HealthRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.pending_tasks

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public PendingTasksResponse pendingTasks(PendingTasksRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse> endpoint = (Endpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse>) PendingTasksRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PendingTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PendingTasksResponse pendingTasks(Consumer<PendingTasksRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PendingTasksRequest.Builder builder = new PendingTasksRequest.Builder();
		fn.accept(builder);
		return pendingTasks(builder.build());
	}

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public PendingTasksResponse pendingTasks() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PendingTasksRequest.Builder().build(), PendingTasksRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.post_voting_config_exclusions

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse postVotingConfigExclusions(PostVotingConfigExclusionsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>) PostVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse postVotingConfigExclusions(Consumer<PostVotingConfigExclusionsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PostVotingConfigExclusionsRequest.Builder builder = new PostVotingConfigExclusionsRequest.Builder();
		fn.accept(builder);
		return postVotingConfigExclusions(builder.build());
	}

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse postVotingConfigExclusions() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PostVotingConfigExclusionsRequest.Builder().build(),
				PostVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.put_component_template

	/**
	 * Creates or updates a component template
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutComponentTemplateResponse putComponentTemplate(PutComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse> endpoint = (Endpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse>) PutComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a component template
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutComponentTemplateResponse putComponentTemplate(Consumer<PutComponentTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutComponentTemplateRequest.Builder builder = new PutComponentTemplateRequest.Builder();
		fn.accept(builder);
		return putComponentTemplate(builder.build());
	}

	// ----- Endpoint: cluster.put_settings

	/**
	 * Updates the cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutClusterSettingsResponse putSettings(PutClusterSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse> endpoint = (Endpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse>) PutClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the cluster settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutClusterSettingsResponse putSettings(Consumer<PutClusterSettingsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutClusterSettingsRequest.Builder builder = new PutClusterSettingsRequest.Builder();
		fn.accept(builder);
		return putSettings(builder.build());
	}

	/**
	 * Updates the cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutClusterSettingsResponse putSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PutClusterSettingsRequest.Builder().build(),
				PutClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.remote_info

	/**
	 * Returns the information about configured remote clusters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-remote-info.html">Documentation
	 *      on elastic.co</a>
	 */
	public RemoteInfoResponse remoteInfo() throws IOException, ElasticsearchException {
		return this.transport.performRequest(RemoteInfoRequest._INSTANCE, RemoteInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.reroute

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public RerouteResponse reroute(RerouteRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RerouteRequest, RerouteResponse, ErrorResponse> endpoint = (Endpoint<RerouteRequest, RerouteResponse, ErrorResponse>) RerouteRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RerouteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RerouteResponse reroute(Consumer<RerouteRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		RerouteRequest.Builder builder = new RerouteRequest.Builder();
		fn.accept(builder);
		return reroute(builder.build());
	}

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public RerouteResponse reroute() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RerouteRequest.Builder().build(), RerouteRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.state

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public StateResponse state(StateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StateRequest, StateResponse, ErrorResponse> endpoint = (Endpoint<StateRequest, StateResponse, ErrorResponse>) StateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StateResponse state(Consumer<StateRequest.Builder> fn) throws IOException, ElasticsearchException {
		StateRequest.Builder builder = new StateRequest.Builder();
		fn.accept(builder);
		return state(builder.build());
	}

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public StateResponse state() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new StateRequest.Builder().build(), StateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.stats

	/**
	 * Returns high-level overview of cluster statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClusterStatsResponse stats(ClusterStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse> endpoint = (Endpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse>) ClusterStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns high-level overview of cluster statistics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClusterStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClusterStatsResponse stats(Consumer<ClusterStatsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ClusterStatsRequest.Builder builder = new ClusterStatsRequest.Builder();
		fn.accept(builder);
		return stats(builder.build());
	}

	/**
	 * Returns high-level overview of cluster statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClusterStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ClusterStatsRequest.Builder().build(), ClusterStatsRequest._ENDPOINT,
				this.transportOptions);
	}

}
