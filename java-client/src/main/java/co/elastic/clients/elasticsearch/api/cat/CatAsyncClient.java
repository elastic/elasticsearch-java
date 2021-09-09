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

package co.elastic.clients.elasticsearch.api.cat;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.cat.AliasesRequest;
import co.elastic.clients.elasticsearch.cat.AliasesResponse;
import co.elastic.clients.elasticsearch.cat.AllocationRequest;
import co.elastic.clients.elasticsearch.cat.AllocationResponse;
import co.elastic.clients.elasticsearch.cat.CountRequest;
import co.elastic.clients.elasticsearch.cat.CountResponse;
import co.elastic.clients.elasticsearch.cat.FielddataRequest;
import co.elastic.clients.elasticsearch.cat.FielddataResponse;
import co.elastic.clients.elasticsearch.cat.HealthRequest;
import co.elastic.clients.elasticsearch.cat.HealthResponse;
import co.elastic.clients.elasticsearch.cat.HelpRequest;
import co.elastic.clients.elasticsearch.cat.HelpResponse;
import co.elastic.clients.elasticsearch.cat.IndicesRequest;
import co.elastic.clients.elasticsearch.cat.IndicesResponse;
import co.elastic.clients.elasticsearch.cat.MasterRequest;
import co.elastic.clients.elasticsearch.cat.MasterResponse;
import co.elastic.clients.elasticsearch.cat.MlDataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.cat.MlDataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.cat.MlDatafeedsRequest;
import co.elastic.clients.elasticsearch.cat.MlDatafeedsResponse;
import co.elastic.clients.elasticsearch.cat.MlJobsRequest;
import co.elastic.clients.elasticsearch.cat.MlJobsResponse;
import co.elastic.clients.elasticsearch.cat.MlTrainedModelsRequest;
import co.elastic.clients.elasticsearch.cat.MlTrainedModelsResponse;
import co.elastic.clients.elasticsearch.cat.NodeattrsRequest;
import co.elastic.clients.elasticsearch.cat.NodeattrsResponse;
import co.elastic.clients.elasticsearch.cat.NodesRequest;
import co.elastic.clients.elasticsearch.cat.NodesResponse;
import co.elastic.clients.elasticsearch.cat.PendingTasksRequest;
import co.elastic.clients.elasticsearch.cat.PendingTasksResponse;
import co.elastic.clients.elasticsearch.cat.PluginsRequest;
import co.elastic.clients.elasticsearch.cat.PluginsResponse;
import co.elastic.clients.elasticsearch.cat.RecoveryRequest;
import co.elastic.clients.elasticsearch.cat.RecoveryResponse;
import co.elastic.clients.elasticsearch.cat.RepositoriesRequest;
import co.elastic.clients.elasticsearch.cat.RepositoriesResponse;
import co.elastic.clients.elasticsearch.cat.SegmentsRequest;
import co.elastic.clients.elasticsearch.cat.SegmentsResponse;
import co.elastic.clients.elasticsearch.cat.ShardsRequest;
import co.elastic.clients.elasticsearch.cat.ShardsResponse;
import co.elastic.clients.elasticsearch.cat.SnapshotsRequest;
import co.elastic.clients.elasticsearch.cat.SnapshotsResponse;
import co.elastic.clients.elasticsearch.cat.TasksRequest;
import co.elastic.clients.elasticsearch.cat.TasksResponse;
import co.elastic.clients.elasticsearch.cat.TemplatesRequest;
import co.elastic.clients.elasticsearch.cat.TemplatesResponse;
import co.elastic.clients.elasticsearch.cat.ThreadPoolRequest;
import co.elastic.clients.elasticsearch.cat.ThreadPoolResponse;
import co.elastic.clients.elasticsearch.cat.TransformsRequest;
import co.elastic.clients.elasticsearch.cat.TransformsResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the cat namespace.
 */
public class CatAsyncClient extends ApiClient<CatAsyncClient> {

	public CatAsyncClient(Transport transport) {
		super(transport, null);
	}

	public CatAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
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

	public CompletableFuture<AliasesResponse> aliases(AliasesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, AliasesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AliasesResponse> aliases(
			Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn) throws IOException {
		return aliases(fn.apply(new AliasesRequest.Builder()).build());
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

	public CompletableFuture<AllocationResponse> allocation(AllocationRequest request) throws IOException {
		return this.transport.performRequestAsync(request, AllocationRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides a snapshot of how many shards are allocated to each data node and
	 * how much disk space they are using.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AllocationResponse> allocation(
			Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn) throws IOException {
		return allocation(fn.apply(new AllocationRequest.Builder()).build());
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

	public CompletableFuture<CountResponse> count(CountRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CountRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException {
		return count(fn.apply(new CountRequest.Builder()).build());
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

	public CompletableFuture<FielddataResponse> fielddata(FielddataRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FielddataRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Shows how much heap memory is currently being used by fielddata on every data
	 * node in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FielddataResponse> fielddata(
			Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn) throws IOException {
		return fielddata(fn.apply(new FielddataRequest.Builder()).build());
	}

	// ----- Endpoint: cat.health

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) throws IOException {
		return this.transport.performRequestAsync(request, HealthRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns a concise representation of the cluster health.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HealthResponse> health(
			Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn) throws IOException {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	// ----- Endpoint: cat.help

	/**
	 * Returns help for the Cat APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<HelpResponse> help() throws IOException {
		return this.transport.performRequestAsync(HelpRequest.INSTANCE, HelpRequest.ENDPOINT, this.requestOptions);
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

	public CompletableFuture<IndicesResponse> indices(IndicesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, IndicesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<IndicesResponse> indices(
			Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn) throws IOException {
		return indices(fn.apply(new IndicesRequest.Builder()).build());
	}

	// ----- Endpoint: cat.master

	/**
	 * Returns information about the master node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-master.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<MasterResponse> master() throws IOException {
		return this.transport.performRequestAsync(MasterRequest.INSTANCE, MasterRequest.ENDPOINT, this.requestOptions);
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
			throws IOException {
		return this.transport.performRequestAsync(request, MlDataFrameAnalyticsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics(
			Function<MlDataFrameAnalyticsRequest.Builder, ObjectBuilder<MlDataFrameAnalyticsRequest>> fn)
			throws IOException {
		return mlDataFrameAnalytics(fn.apply(new MlDataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.ml_datafeeds

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDatafeedsResponse> mlDatafeeds(MlDatafeedsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, MlDatafeedsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDatafeedsResponse> mlDatafeeds(
			Function<MlDatafeedsRequest.Builder, ObjectBuilder<MlDatafeedsRequest>> fn) throws IOException {
		return mlDatafeeds(fn.apply(new MlDatafeedsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.ml_jobs

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlJobsResponse> mlJobs(MlJobsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, MlJobsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlJobsResponse> mlJobs(
			Function<MlJobsRequest.Builder, ObjectBuilder<MlJobsRequest>> fn) throws IOException {
		return mlJobs(fn.apply(new MlJobsRequest.Builder()).build());
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
			throws IOException {
		return this.transport.performRequestAsync(request, MlTrainedModelsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlTrainedModelsResponse> mlTrainedModels(
			Function<MlTrainedModelsRequest.Builder, ObjectBuilder<MlTrainedModelsRequest>> fn) throws IOException {
		return mlTrainedModels(fn.apply(new MlTrainedModelsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.nodeattrs

	/**
	 * Returns information about custom node attributes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodeattrs.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<NodeattrsResponse> nodeattrs() throws IOException {
		return this.transport.performRequestAsync(NodeattrsRequest.INSTANCE, NodeattrsRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: cat.nodes

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesResponse> nodes(NodesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, NodesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns basic statistics about performance of cluster nodes.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesResponse> nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn)
			throws IOException {
		return nodes(fn.apply(new NodesRequest.Builder()).build());
	}

	// ----- Endpoint: cat.pending_tasks

	/**
	 * Returns a concise representation of the cluster pending tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-pending-tasks.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PendingTasksResponse> pendingTasks() throws IOException {
		return this.transport.performRequestAsync(PendingTasksRequest.INSTANCE, PendingTasksRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: cat.plugins

	/**
	 * Returns information about installed plugins across nodes node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-plugins.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PluginsResponse> plugins() throws IOException {
		return this.transport.performRequestAsync(PluginsRequest.INSTANCE, PluginsRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: cat.recovery

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RecoveryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RecoveryResponse> recovery(
			Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn) throws IOException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	// ----- Endpoint: cat.repositories

	/**
	 * Returns information about snapshot repositories registered in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-repositories.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<RepositoriesResponse> repositories() throws IOException {
		return this.transport.performRequestAsync(RepositoriesRequest.INSTANCE, RepositoriesRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: cat.segments

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SegmentsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides low-level information about the segments in the shards of an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SegmentsResponse> segments(
			Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn) throws IOException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.shards

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardsResponse> shards(ShardsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ShardsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides a detailed view of shard allocation on nodes.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShardsResponse> shards(
			Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn) throws IOException {
		return shards(fn.apply(new ShardsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.snapshots

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotsResponse> snapshots(SnapshotsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SnapshotsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns all snapshots in a specific repository.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SnapshotsResponse> snapshots(
			Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn) throws IOException {
		return snapshots(fn.apply(new SnapshotsRequest.Builder()).build());
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

	public CompletableFuture<TasksResponse> tasks(TasksRequest request) throws IOException {
		return this.transport.performRequestAsync(request, TasksRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about the tasks currently executing on one or more nodes
	 * in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TasksResponse> tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn)
			throws IOException {
		return tasks(fn.apply(new TasksRequest.Builder()).build());
	}

	// ----- Endpoint: cat.templates

	/**
	 * Returns information about existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, TemplatesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about existing templates.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TemplatesResponse> templates(
			Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn) throws IOException {
		return templates(fn.apply(new TemplatesRequest.Builder()).build());
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

	public CompletableFuture<ThreadPoolResponse> threadPool(ThreadPoolRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ThreadPoolRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns cluster-wide thread pool statistics per node. By default the active,
	 * queue and rejected statistics are returned for all thread pools.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ThreadPoolResponse> threadPool(
			Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn) throws IOException {
		return threadPool(fn.apply(new ThreadPoolRequest.Builder()).build());
	}

	// ----- Endpoint: cat.transforms

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TransformsResponse> transforms(TransformsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, TransformsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TransformsResponse> transforms(
			Function<TransformsRequest.Builder, ObjectBuilder<TransformsRequest>> fn) throws IOException {
		return transforms(fn.apply(new TransformsRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #CatAsyncClient} with specific request options.
	 */
	@Override
	public CatAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new CatAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #CatAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public CatAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
