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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the watcher namespace.
 */
public class ElasticsearchWatcherAsyncClient extends ApiClient {

	public ElasticsearchWatcherAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: watcher.ack_watch

	/**
	 * Acknowledges a watch, manually throttling the execution of the watch's
	 * actions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-ack-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AckWatchResponse> ackWatch(AckWatchRequest request) throws IOException {
		return this.transport.performRequestAsync(request, AckWatchRequest.ENDPOINT);
	}

	/**
	 * Acknowledges a watch, manually throttling the execution of the watch's
	 * actions.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-ack-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AckWatchResponse> ackWatch(
			Function<AckWatchRequest.Builder, ObjectBuilder<AckWatchRequest>> fn) throws IOException {
		return ackWatch(fn.apply(new AckWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.activate_watch

	/**
	 * Activates a currently inactive watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-activate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ActivateWatchResponse> activateWatch(ActivateWatchRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ActivateWatchRequest.ENDPOINT);
	}

	/**
	 * Activates a currently inactive watch.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-activate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ActivateWatchResponse> activateWatch(
			Function<ActivateWatchRequest.Builder, ObjectBuilder<ActivateWatchRequest>> fn) throws IOException {
		return activateWatch(fn.apply(new ActivateWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.deactivate_watch

	/**
	 * Deactivates a currently active watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-deactivate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeactivateWatchResponse> deactivateWatch(DeactivateWatchRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeactivateWatchRequest.ENDPOINT);
	}

	/**
	 * Deactivates a currently active watch.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-deactivate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeactivateWatchResponse> deactivateWatch(
			Function<DeactivateWatchRequest.Builder, ObjectBuilder<DeactivateWatchRequest>> fn) throws IOException {
		return deactivateWatch(fn.apply(new DeactivateWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.delete_watch

	/**
	 * Removes a watch from Watcher.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-delete-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteWatchResponse> deleteWatch(DeleteWatchRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteWatchRequest.ENDPOINT);
	}

	/**
	 * Removes a watch from Watcher.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-delete-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteWatchResponse> deleteWatch(
			Function<DeleteWatchRequest.Builder, ObjectBuilder<DeleteWatchRequest>> fn) throws IOException {
		return deleteWatch(fn.apply(new DeleteWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.execute_watch

	/**
	 * Forces the execution of a stored watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteWatchResponse> executeWatch(ExecuteWatchRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExecuteWatchRequest.ENDPOINT);
	}

	/**
	 * Forces the execution of a stored watch.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecuteWatchResponse> executeWatch(
			Function<ExecuteWatchRequest.Builder, ObjectBuilder<ExecuteWatchRequest>> fn) throws IOException {
		return executeWatch(fn.apply(new ExecuteWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.get_watch

	/**
	 * Retrieves a watch by its ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-get-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetWatchResponse> getWatch(GetWatchRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetWatchRequest.ENDPOINT);
	}

	/**
	 * Retrieves a watch by its ID.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-get-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetWatchResponse> getWatch(
			Function<GetWatchRequest.Builder, ObjectBuilder<GetWatchRequest>> fn) throws IOException {
		return getWatch(fn.apply(new GetWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.put_watch

	/**
	 * Creates a new watch, or updates an existing one.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-put-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutWatchResponse> putWatch(PutWatchRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutWatchRequest.ENDPOINT);
	}

	/**
	 * Creates a new watch, or updates an existing one.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-put-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutWatchResponse> putWatch(
			Function<PutWatchRequest.Builder, ObjectBuilder<PutWatchRequest>> fn) throws IOException {
		return putWatch(fn.apply(new PutWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.query_watches

	/**
	 * Retrieves stored watches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-query-watches.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryWatchesResponse> queryWatches(QueryWatchesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, QueryWatchesRequest.ENDPOINT);
	}

	/**
	 * Retrieves stored watches.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-query-watches.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<QueryWatchesResponse> queryWatches(
			Function<QueryWatchesRequest.Builder, ObjectBuilder<QueryWatchesRequest>> fn) throws IOException {
		return queryWatches(fn.apply(new QueryWatchesRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.start

	/**
	 * Starts Watcher if it is not already running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-start.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<StartResponse> start() throws IOException {
		return this.transport.performRequestAsync(StartRequest._INSTANCE, StartRequest.ENDPOINT);
	}

	// ----- Endpoint: watcher.stats

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StatsResponse> stats(StatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StatsRequest.ENDPOINT);
	}

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StatsResponse> stats(Function<StatsRequest.Builder, ObjectBuilder<StatsRequest>> fn)
			throws IOException {
		return stats(fn.apply(new StatsRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.stop

	/**
	 * Stops Watcher if it is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stop.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<StopResponse> stop() throws IOException {
		return this.transport.performRequestAsync(StopRequest._INSTANCE, StopRequest.ENDPOINT);
	}

}
