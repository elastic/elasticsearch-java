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

package co.elastic.clients.elasticsearch.cat;

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

/**
 * Client for the cat namespace.
 */
public class ElasticsearchCatClient extends ApiClient<ElasticsearchTransport, ElasticsearchCatClient> {

	public ElasticsearchCatClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchCatClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCatClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCatClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cat.aliases

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public AliasesResponse aliases(AliasesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse> endpoint = (JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse>) AliasesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AliasesResponse aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
			throws IOException, ElasticsearchException {
		return aliases(fn.apply(new AliasesRequest.Builder()).build());
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public AliasesResponse aliases() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new AliasesRequest.Builder().build(), AliasesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.allocation

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public AllocationResponse allocation(AllocationRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AllocationRequest, AllocationResponse, ErrorResponse> endpoint = (JsonEndpoint<AllocationRequest, AllocationResponse, ErrorResponse>) AllocationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AllocationResponse allocation(Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn)
			throws IOException, ElasticsearchException {
		return allocation(fn.apply(new AllocationRequest.Builder()).build());
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public AllocationResponse allocation() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new AllocationRequest.Builder().build(), AllocationRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.component_templates

	/**
	 * Returns information about existing component_templates templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-compoentn-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public ComponentTemplatesResponse componentTemplates(ComponentTemplatesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ComponentTemplatesRequest, ComponentTemplatesResponse, ErrorResponse> endpoint = (JsonEndpoint<ComponentTemplatesRequest, ComponentTemplatesResponse, ErrorResponse>) ComponentTemplatesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about existing component_templates templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ComponentTemplatesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-compoentn-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ComponentTemplatesResponse componentTemplates(
			Function<ComponentTemplatesRequest.Builder, ObjectBuilder<ComponentTemplatesRequest>> fn)
			throws IOException, ElasticsearchException {
		return componentTemplates(fn.apply(new ComponentTemplatesRequest.Builder()).build());
	}

	/**
	 * Returns information about existing component_templates templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-compoentn-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public ComponentTemplatesResponse componentTemplates() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ComponentTemplatesRequest.Builder().build(),
				ComponentTemplatesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.count

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count(CountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (JsonEndpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, ElasticsearchException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.fielddata

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public FielddataResponse fielddata(FielddataRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FielddataRequest, FielddataResponse, ErrorResponse> endpoint = (JsonEndpoint<FielddataRequest, FielddataResponse, ErrorResponse>) FielddataRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FielddataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FielddataResponse fielddata(Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn)
			throws IOException, ElasticsearchException {
		return fielddata(fn.apply(new FielddataRequest.Builder()).build());
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public FielddataResponse fielddata() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new FielddataRequest.Builder().build(), FielddataRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.health

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public HealthResponse health(HealthRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse> endpoint = (JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse>) HealthRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final HealthResponse health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
			throws IOException, ElasticsearchException {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public HealthResponse health() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new HealthRequest.Builder().build(), HealthRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.help

	/**
	 * Returns help for the Cat APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat.html">Documentation
	 *      on elastic.co</a>
	 */
	public HelpResponse help() throws IOException, ElasticsearchException {
		return this.transport.performRequest(HelpRequest._INSTANCE, HelpRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.indices

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesResponse indices(IndicesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse> endpoint = (JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse>) IndicesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final IndicesResponse indices(Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn)
			throws IOException, ElasticsearchException {
		return indices(fn.apply(new IndicesRequest.Builder()).build());
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesResponse indices() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new IndicesRequest.Builder().build(), IndicesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.master

	/**
	 * Returns information about the master node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-master.html">Documentation
	 *      on elastic.co</a>
	 */
	public MasterResponse master() throws IOException, ElasticsearchException {
		return this.transport.performRequest(MasterRequest._INSTANCE, MasterRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_data_frame_analytics

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDataFrameAnalyticsResponse mlDataFrameAnalytics(MlDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse>) MlDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlDataFrameAnalyticsResponse mlDataFrameAnalytics(
			Function<MlDataFrameAnalyticsRequest.Builder, ObjectBuilder<MlDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlDataFrameAnalytics(fn.apply(new MlDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDataFrameAnalyticsResponse mlDataFrameAnalytics() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlDataFrameAnalyticsRequest.Builder().build(),
				MlDataFrameAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_datafeeds

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDatafeedsResponse mlDatafeeds(MlDatafeedsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse>) MlDatafeedsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDatafeedsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlDatafeedsResponse mlDatafeeds(
			Function<MlDatafeedsRequest.Builder, ObjectBuilder<MlDatafeedsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlDatafeeds(fn.apply(new MlDatafeedsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDatafeedsResponse mlDatafeeds() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlDatafeedsRequest.Builder().build(), MlDatafeedsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_jobs

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlJobsResponse mlJobs(MlJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse>) MlJobsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlJobsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlJobsResponse mlJobs(Function<MlJobsRequest.Builder, ObjectBuilder<MlJobsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlJobs(fn.apply(new MlJobsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlJobsResponse mlJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlJobsRequest.Builder().build(), MlJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_trained_models

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlTrainedModelsResponse mlTrainedModels(MlTrainedModelsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse>) MlTrainedModelsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlTrainedModelsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlTrainedModelsResponse mlTrainedModels(
			Function<MlTrainedModelsRequest.Builder, ObjectBuilder<MlTrainedModelsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlTrainedModels(fn.apply(new MlTrainedModelsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlTrainedModelsResponse mlTrainedModels() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlTrainedModelsRequest.Builder().build(),
				MlTrainedModelsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.nodeattrs

	/**
	 * Returns information about custom node attributes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-nodeattrs.html">Documentation
	 *      on elastic.co</a>
	 */
	public NodeattrsResponse nodeattrs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(NodeattrsRequest._INSTANCE, NodeattrsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.nodes

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesResponse nodes(NodesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesRequest, NodesResponse, ErrorResponse> endpoint = (JsonEndpoint<NodesRequest, NodesResponse, ErrorResponse>) NodesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public final NodesResponse nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn)
			throws IOException, ElasticsearchException {
		return nodes(fn.apply(new NodesRequest.Builder()).build());
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesResponse nodes() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new NodesRequest.Builder().build(), NodesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.pending_tasks

	/**
	 * Returns a concise representation of the cluster pending tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-pending-tasks.html">Documentation
	 *      on elastic.co</a>
	 */
	public PendingTasksResponse pendingTasks() throws IOException, ElasticsearchException {
		return this.transport.performRequest(PendingTasksRequest._INSTANCE, PendingTasksRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.plugins

	/**
	 * Returns information about installed plugins across nodes node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-plugins.html">Documentation
	 *      on elastic.co</a>
	 */
	public PluginsResponse plugins() throws IOException, ElasticsearchException {
		return this.transport.performRequest(PluginsRequest._INSTANCE, PluginsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.recovery

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery(RecoveryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> endpoint = (JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse>) RecoveryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException, ElasticsearchException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RecoveryRequest.Builder().build(), RecoveryRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.repositories

	/**
	 * Returns information about snapshot repositories registered in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-repositories.html">Documentation
	 *      on elastic.co</a>
	 */
	public RepositoriesResponse repositories() throws IOException, ElasticsearchException {
		return this.transport.performRequest(RepositoriesRequest._INSTANCE, RepositoriesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.segments

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments(SegmentsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse> endpoint = (JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse>) SegmentsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException, ElasticsearchException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SegmentsRequest.Builder().build(), SegmentsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.shards

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShardsResponse shards(ShardsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ShardsRequest, ShardsResponse, ErrorResponse> endpoint = (JsonEndpoint<ShardsRequest, ShardsResponse, ErrorResponse>) ShardsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ShardsResponse shards(Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn)
			throws IOException, ElasticsearchException {
		return shards(fn.apply(new ShardsRequest.Builder()).build());
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShardsResponse shards() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ShardsRequest.Builder().build(), ShardsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.snapshots

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public SnapshotsResponse snapshots(SnapshotsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SnapshotsRequest, SnapshotsResponse, ErrorResponse> endpoint = (JsonEndpoint<SnapshotsRequest, SnapshotsResponse, ErrorResponse>) SnapshotsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SnapshotsResponse snapshots(Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn)
			throws IOException, ElasticsearchException {
		return snapshots(fn.apply(new SnapshotsRequest.Builder()).build());
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public SnapshotsResponse snapshots() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SnapshotsRequest.Builder().build(), SnapshotsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.tasks

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public TasksResponse tasks(TasksRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TasksRequest, TasksResponse, ErrorResponse> endpoint = (JsonEndpoint<TasksRequest, TasksResponse, ErrorResponse>) TasksRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TasksResponse tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn)
			throws IOException, ElasticsearchException {
		return tasks(fn.apply(new TasksRequest.Builder()).build());
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public TasksResponse tasks() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new TasksRequest.Builder().build(), TasksRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.templates

	/**
	 * Returns information about existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public TemplatesResponse templates(TemplatesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TemplatesRequest, TemplatesResponse, ErrorResponse> endpoint = (JsonEndpoint<TemplatesRequest, TemplatesResponse, ErrorResponse>) TemplatesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TemplatesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TemplatesResponse templates(Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn)
			throws IOException, ElasticsearchException {
		return templates(fn.apply(new TemplatesRequest.Builder()).build());
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public TemplatesResponse templates() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new TemplatesRequest.Builder().build(), TemplatesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.thread_pool

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public ThreadPoolResponse threadPool(ThreadPoolRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse> endpoint = (JsonEndpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse>) ThreadPoolRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ThreadPoolRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ThreadPoolResponse threadPool(Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn)
			throws IOException, ElasticsearchException {
		return threadPool(fn.apply(new ThreadPoolRequest.Builder()).build());
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public ThreadPoolResponse threadPool() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ThreadPoolRequest.Builder().build(), ThreadPoolRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.transforms

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public TransformsResponse transforms(TransformsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse> endpoint = (JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse>) TransformsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TransformsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TransformsResponse transforms(Function<TransformsRequest.Builder, ObjectBuilder<TransformsRequest>> fn)
			throws IOException, ElasticsearchException {
		return transforms(fn.apply(new TransformsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.4/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public TransformsResponse transforms() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new TransformsRequest.Builder().build(), TransformsRequest._ENDPOINT,
				this.transportOptions);
	}

}
