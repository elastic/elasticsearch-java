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
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the cat namespace.
 */
public class ElasticsearchCatAsyncClient extends ApiClient<ElasticsearchCatAsyncClient> {

	public ElasticsearchCatAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchCatAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCatAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCatAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cat.aliases

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AliasesResponse> aliases(AliasesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, AliasesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AliasesResponse> aliases(
			Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
			throws IOException, ElasticsearchException {
		return aliases(fn.apply(new AliasesRequest.Builder()).build());
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AliasesResponse> aliases() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new AliasesRequest.Builder().build(), AliasesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.allocation

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationResponse> allocation(AllocationRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, AllocationRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AllocationResponse> allocation(
			Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn)
			throws IOException, ElasticsearchException {
		return allocation(fn.apply(new AllocationRequest.Builder()).build());
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationResponse> allocation() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new AllocationRequest.Builder().build(), AllocationRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.count

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count(CountRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CountRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, ElasticsearchException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new CountRequest.Builder().build(), CountRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.fielddata

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FielddataResponse> fielddata(FielddataRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, FielddataRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FielddataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FielddataResponse> fielddata(
			Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn)
			throws IOException, ElasticsearchException {
		return fielddata(fn.apply(new FielddataRequest.Builder()).build());
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FielddataResponse> fielddata() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new FielddataRequest.Builder().build(), FielddataRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.health

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, HealthRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HealthResponse> health(
			Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
			throws IOException, ElasticsearchException {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new HealthRequest.Builder().build(), HealthRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.help

	/**
	 * Returns help for the Cat APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<HelpResponse> help() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(HelpRequest._INSTANCE, HelpRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.indices

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesResponse> indices(IndicesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, IndicesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<IndicesResponse> indices(
			Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn)
			throws IOException, ElasticsearchException {
		return indices(fn.apply(new IndicesRequest.Builder()).build());
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesResponse> indices() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new IndicesRequest.Builder().build(), IndicesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.master

	/**
	 * Returns information about the master node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-master.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<MasterResponse> master() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(MasterRequest._INSTANCE, MasterRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_data_frame_analytics

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics(MlDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, MlDataFrameAnalyticsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics(
			Function<MlDataFrameAnalyticsRequest.Builder, ObjectBuilder<MlDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlDataFrameAnalytics(fn.apply(new MlDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlDataFrameAnalyticsRequest.Builder().build(),
				MlDataFrameAnalyticsRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_datafeeds

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDatafeedsResponse> mlDatafeeds(MlDatafeedsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, MlDatafeedsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDatafeedsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDatafeedsResponse> mlDatafeeds(
			Function<MlDatafeedsRequest.Builder, ObjectBuilder<MlDatafeedsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlDatafeeds(fn.apply(new MlDatafeedsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDatafeedsResponse> mlDatafeeds() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlDatafeedsRequest.Builder().build(), MlDatafeedsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_jobs

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlJobsResponse> mlJobs(MlJobsRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, MlJobsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlJobsRequest}
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlJobsResponse> mlJobs(
			Function<MlJobsRequest.Builder, ObjectBuilder<MlJobsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlJobs(fn.apply(new MlJobsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlJobsResponse> mlJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlJobsRequest.Builder().build(), MlJobsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_trained_models

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlTrainedModelsResponse> mlTrainedModels(MlTrainedModelsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, MlTrainedModelsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlTrainedModelsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlTrainedModelsResponse> mlTrainedModels(
			Function<MlTrainedModelsRequest.Builder, ObjectBuilder<MlTrainedModelsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlTrainedModels(fn.apply(new MlTrainedModelsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlTrainedModelsResponse> mlTrainedModels() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MlTrainedModelsRequest.Builder().build(),
				MlTrainedModelsRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.nodeattrs

	/**
	 * Returns information about custom node attributes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodeattrs.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<NodeattrsResponse> nodeattrs() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(NodeattrsRequest._INSTANCE, NodeattrsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.nodes

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesResponse> nodes(NodesRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, NodesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesResponse> nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn)
			throws IOException, ElasticsearchException {
		return nodes(fn.apply(new NodesRequest.Builder()).build());
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesResponse> nodes() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new NodesRequest.Builder().build(), NodesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.pending_tasks

	/**
	 * Returns a concise representation of the cluster pending tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-pending-tasks.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PendingTasksResponse> pendingTasks() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(PendingTasksRequest._INSTANCE, PendingTasksRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.plugins

	/**
	 * Returns information about installed plugins across nodes node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-plugins.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PluginsResponse> plugins() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(PluginsRequest._INSTANCE, PluginsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.recovery

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, RecoveryRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RecoveryResponse> recovery(
			Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException, ElasticsearchException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new RecoveryRequest.Builder().build(), RecoveryRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.repositories

	/**
	 * Returns information about snapshot repositories registered in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-repositories.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<RepositoriesResponse> repositories() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(RepositoriesRequest._INSTANCE, RepositoriesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.segments

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, SegmentsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SegmentsResponse> segments(
			Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException, ElasticsearchException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SegmentsRequest.Builder().build(), SegmentsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.shards

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardsResponse> shards(ShardsRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ShardsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShardsResponse> shards(
			Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn)
			throws IOException, ElasticsearchException {
		return shards(fn.apply(new ShardsRequest.Builder()).build());
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardsResponse> shards() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ShardsRequest.Builder().build(), ShardsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.snapshots

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotsResponse> snapshots(SnapshotsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, SnapshotsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SnapshotsResponse> snapshots(
			Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn)
			throws IOException, ElasticsearchException {
		return snapshots(fn.apply(new SnapshotsRequest.Builder()).build());
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotsResponse> snapshots() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SnapshotsRequest.Builder().build(), SnapshotsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.tasks

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TasksResponse> tasks(TasksRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, TasksRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TasksResponse> tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn)
			throws IOException, ElasticsearchException {
		return tasks(fn.apply(new TasksRequest.Builder()).build());
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TasksResponse> tasks() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new TasksRequest.Builder().build(), TasksRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.templates

	/**
	 * Returns information about existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, TemplatesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TemplatesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TemplatesResponse> templates(
			Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn)
			throws IOException, ElasticsearchException {
		return templates(fn.apply(new TemplatesRequest.Builder()).build());
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TemplatesResponse> templates() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new TemplatesRequest.Builder().build(), TemplatesRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.thread_pool

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool(ThreadPoolRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ThreadPoolRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ThreadPoolRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ThreadPoolResponse> threadPool(
			Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn)
			throws IOException, ElasticsearchException {
		return threadPool(fn.apply(new ThreadPoolRequest.Builder()).build());
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ThreadPoolRequest.Builder().build(), ThreadPoolRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.transforms

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TransformsResponse> transforms(TransformsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, TransformsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TransformsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TransformsResponse> transforms(
			Function<TransformsRequest.Builder, ObjectBuilder<TransformsRequest>> fn)
			throws IOException, ElasticsearchException {
		return transforms(fn.apply(new TransformsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TransformsResponse> transforms() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new TransformsRequest.Builder().build(), TransformsRequest.ENDPOINT,
				this.transportOptions);
	}

}
