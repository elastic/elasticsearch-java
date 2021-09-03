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
import co.elastic.clients.elasticsearch.cat.DataFrameAnalyticsRequest;
import co.elastic.clients.elasticsearch.cat.DataFrameAnalyticsResponse;
import co.elastic.clients.elasticsearch.cat.DatafeedsRequest;
import co.elastic.clients.elasticsearch.cat.DatafeedsResponse;
import co.elastic.clients.elasticsearch.cat.FielddataRequest;
import co.elastic.clients.elasticsearch.cat.FielddataResponse;
import co.elastic.clients.elasticsearch.cat.HealthRequest;
import co.elastic.clients.elasticsearch.cat.HealthResponse;
import co.elastic.clients.elasticsearch.cat.HelpRequest;
import co.elastic.clients.elasticsearch.cat.HelpResponse;
import co.elastic.clients.elasticsearch.cat.IndicesRequest;
import co.elastic.clients.elasticsearch.cat.IndicesResponse;
import co.elastic.clients.elasticsearch.cat.JobsRequest;
import co.elastic.clients.elasticsearch.cat.JobsResponse;
import co.elastic.clients.elasticsearch.cat.MasterRequest;
import co.elastic.clients.elasticsearch.cat.MasterResponse;
import co.elastic.clients.elasticsearch.cat.NodeAttributesRequest;
import co.elastic.clients.elasticsearch.cat.NodeAttributesResponse;
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
import co.elastic.clients.elasticsearch.cat.TrainedModelsRequest;
import co.elastic.clients.elasticsearch.cat.TrainedModelsResponse;
import co.elastic.clients.elasticsearch.cat.TransformsRequest;
import co.elastic.clients.elasticsearch.cat.TransformsResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the cat namespace.
 */
public class CatClient extends ApiClient<CatClient> {

	public CatClient(Transport transport) {
		super(transport, null);
	}

	public CatClient(Transport transport, RequestOptions options) {
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

	public AliasesResponse aliases(AliasesRequest request) throws IOException {
		return this.transport.performRequest(request, AliasesRequest.ENDPOINT, this.requestOptions);
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

	public final AliasesResponse aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
			throws IOException {
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

	public AllocationResponse allocation(AllocationRequest request) throws IOException {
		return this.transport.performRequest(request, AllocationRequest.ENDPOINT, this.requestOptions);
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

	public final AllocationResponse allocation(Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn)
			throws IOException {
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

	public CountResponse count(CountRequest request) throws IOException {
		return this.transport.performRequest(request, CountRequest.ENDPOINT, this.requestOptions);
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

	public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
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

	public FielddataResponse fielddata(FielddataRequest request) throws IOException {
		return this.transport.performRequest(request, FielddataRequest.ENDPOINT, this.requestOptions);
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

	public final FielddataResponse fielddata(Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn)
			throws IOException {
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

	public HealthResponse health(HealthRequest request) throws IOException {
		return this.transport.performRequest(request, HealthRequest.ENDPOINT, this.requestOptions);
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

	public final HealthResponse health(Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
			throws IOException {
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
	public HelpResponse help() throws IOException {
		return this.transport.performRequest(HelpRequest.INSTANCE, HelpRequest.ENDPOINT, this.requestOptions);
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

	public IndicesResponse indices(IndicesRequest request) throws IOException {
		return this.transport.performRequest(request, IndicesRequest.ENDPOINT, this.requestOptions);
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

	public final IndicesResponse indices(Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn)
			throws IOException {
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
	public MasterResponse master() throws IOException {
		return this.transport.performRequest(MasterRequest.INSTANCE, MasterRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: cat.ml_data_frame_analytics

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public DataFrameAnalyticsResponse mlDataFrameAnalytics(DataFrameAnalyticsRequest request) throws IOException {
		return this.transport.performRequest(request, DataFrameAnalyticsRequest.ENDPOINT, this.requestOptions);
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

	public final DataFrameAnalyticsResponse mlDataFrameAnalytics(
			Function<DataFrameAnalyticsRequest.Builder, ObjectBuilder<DataFrameAnalyticsRequest>> fn)
			throws IOException {
		return mlDataFrameAnalytics(fn.apply(new DataFrameAnalyticsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.ml_datafeeds

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public DatafeedsResponse mlDatafeeds(DatafeedsRequest request) throws IOException {
		return this.transport.performRequest(request, DatafeedsRequest.ENDPOINT, this.requestOptions);
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

	public final DatafeedsResponse mlDatafeeds(Function<DatafeedsRequest.Builder, ObjectBuilder<DatafeedsRequest>> fn)
			throws IOException {
		return mlDatafeeds(fn.apply(new DatafeedsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.ml_jobs

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "http://www.elastic.co/guide/en/elasticsearch/reference/current/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public JobsResponse mlJobs(JobsRequest request) throws IOException {
		return this.transport.performRequest(request, JobsRequest.ENDPOINT, this.requestOptions);
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

	public final JobsResponse mlJobs(Function<JobsRequest.Builder, ObjectBuilder<JobsRequest>> fn) throws IOException {
		return mlJobs(fn.apply(new JobsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.ml_trained_models

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public TrainedModelsResponse mlTrainedModels(TrainedModelsRequest request) throws IOException {
		return this.transport.performRequest(request, TrainedModelsRequest.ENDPOINT, this.requestOptions);
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

	public final TrainedModelsResponse mlTrainedModels(
			Function<TrainedModelsRequest.Builder, ObjectBuilder<TrainedModelsRequest>> fn) throws IOException {
		return mlTrainedModels(fn.apply(new TrainedModelsRequest.Builder()).build());
	}

	// ----- Endpoint: cat.nodeattrs

	/**
	 * Returns information about custom node attributes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-nodeattrs.html">Documentation
	 *      on elastic.co</a>
	 */
	public NodeAttributesResponse nodeattrs() throws IOException {
		return this.transport.performRequest(NodeAttributesRequest.INSTANCE, NodeAttributesRequest.ENDPOINT,
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

	public NodesResponse nodes(NodesRequest request) throws IOException {
		return this.transport.performRequest(request, NodesRequest.ENDPOINT, this.requestOptions);
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

	public final NodesResponse nodes(Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn)
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
	public PendingTasksResponse pendingTasks() throws IOException {
		return this.transport.performRequest(PendingTasksRequest.INSTANCE, PendingTasksRequest.ENDPOINT,
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
	public PluginsResponse plugins() throws IOException {
		return this.transport.performRequest(PluginsRequest.INSTANCE, PluginsRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: cat.recovery

	/**
	 * Returns information about index shard recoveries, both on-going completed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery(RecoveryRequest request) throws IOException {
		return this.transport.performRequest(request, RecoveryRequest.ENDPOINT, this.requestOptions);
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

	public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException {
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
	public RepositoriesResponse repositories() throws IOException {
		return this.transport.performRequest(RepositoriesRequest.INSTANCE, RepositoriesRequest.ENDPOINT,
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

	public SegmentsResponse segments(SegmentsRequest request) throws IOException {
		return this.transport.performRequest(request, SegmentsRequest.ENDPOINT, this.requestOptions);
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

	public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException {
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

	public ShardsResponse shards(ShardsRequest request) throws IOException {
		return this.transport.performRequest(request, ShardsRequest.ENDPOINT, this.requestOptions);
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

	public final ShardsResponse shards(Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn)
			throws IOException {
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

	public SnapshotsResponse snapshots(SnapshotsRequest request) throws IOException {
		return this.transport.performRequest(request, SnapshotsRequest.ENDPOINT, this.requestOptions);
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

	public final SnapshotsResponse snapshots(Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn)
			throws IOException {
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

	public TasksResponse tasks(TasksRequest request) throws IOException {
		return this.transport.performRequest(request, TasksRequest.ENDPOINT, this.requestOptions);
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

	public final TasksResponse tasks(Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn)
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

	public TemplatesResponse templates(TemplatesRequest request) throws IOException {
		return this.transport.performRequest(request, TemplatesRequest.ENDPOINT, this.requestOptions);
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

	public final TemplatesResponse templates(Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn)
			throws IOException {
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

	public ThreadPoolResponse threadPool(ThreadPoolRequest request) throws IOException {
		return this.transport.performRequest(request, ThreadPoolRequest.ENDPOINT, this.requestOptions);
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

	public final ThreadPoolResponse threadPool(Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn)
			throws IOException {
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

	public TransformsResponse transforms(TransformsRequest request) throws IOException {
		return this.transport.performRequest(request, TransformsRequest.ENDPOINT, this.requestOptions);
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

	public final TransformsResponse transforms(Function<TransformsRequest.Builder, ObjectBuilder<TransformsRequest>> fn)
			throws IOException {
		return transforms(fn.apply(new TransformsRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #CatClient} with specific request options.
	 */
	@Override
	public CatClient withRequestOptions(@Nullable RequestOptions options) {
		return new CatClient(transport, options);
	}

	/**
	 * Creates a new {@link #CatClient} with specific request options, inheriting
	 * existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public CatClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
