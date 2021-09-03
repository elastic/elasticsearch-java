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

package co.elastic.clients.elasticsearch.api.watcher;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.watcher.AckWatchRequest;
import co.elastic.clients.elasticsearch.watcher.AckWatchResponse;
import co.elastic.clients.elasticsearch.watcher.ActivateWatchRequest;
import co.elastic.clients.elasticsearch.watcher.ActivateWatchResponse;
import co.elastic.clients.elasticsearch.watcher.DeactivateWatchRequest;
import co.elastic.clients.elasticsearch.watcher.DeactivateWatchResponse;
import co.elastic.clients.elasticsearch.watcher.DeleteWatchRequest;
import co.elastic.clients.elasticsearch.watcher.DeleteWatchResponse;
import co.elastic.clients.elasticsearch.watcher.ExecuteWatchRequest;
import co.elastic.clients.elasticsearch.watcher.ExecuteWatchResponse;
import co.elastic.clients.elasticsearch.watcher.GetWatchRequest;
import co.elastic.clients.elasticsearch.watcher.GetWatchResponse;
import co.elastic.clients.elasticsearch.watcher.PutWatchRequest;
import co.elastic.clients.elasticsearch.watcher.PutWatchResponse;
import co.elastic.clients.elasticsearch.watcher.QueryWatchesRequest;
import co.elastic.clients.elasticsearch.watcher.QueryWatchesResponse;
import co.elastic.clients.elasticsearch.watcher.StartRequest;
import co.elastic.clients.elasticsearch.watcher.StartResponse;
import co.elastic.clients.elasticsearch.watcher.StatsRequest;
import co.elastic.clients.elasticsearch.watcher.StatsResponse;
import co.elastic.clients.elasticsearch.watcher.StopRequest;
import co.elastic.clients.elasticsearch.watcher.StopResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the watcher namespace.
 */
public class WatcherClient extends ApiClient<WatcherClient> {

	public WatcherClient(Transport transport) {
		super(transport, null);
	}

	public WatcherClient(Transport transport, RequestOptions options) {
		super(transport, options);
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

	public AckWatchResponse ackWatch(AckWatchRequest request) throws IOException {
		return this.transport.performRequest(request, AckWatchRequest.ENDPOINT, this.requestOptions);
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

	public final AckWatchResponse ackWatch(Function<AckWatchRequest.Builder, ObjectBuilder<AckWatchRequest>> fn)
			throws IOException {
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

	public ActivateWatchResponse activateWatch(ActivateWatchRequest request) throws IOException {
		return this.transport.performRequest(request, ActivateWatchRequest.ENDPOINT, this.requestOptions);
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

	public final ActivateWatchResponse activateWatch(
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

	public DeactivateWatchResponse deactivateWatch(DeactivateWatchRequest request) throws IOException {
		return this.transport.performRequest(request, DeactivateWatchRequest.ENDPOINT, this.requestOptions);
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

	public final DeactivateWatchResponse deactivateWatch(
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

	public DeleteWatchResponse deleteWatch(DeleteWatchRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteWatchRequest.ENDPOINT, this.requestOptions);
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

	public final DeleteWatchResponse deleteWatch(
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

	public ExecuteWatchResponse executeWatch(ExecuteWatchRequest request) throws IOException {
		return this.transport.performRequest(request, ExecuteWatchRequest.ENDPOINT, this.requestOptions);
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

	public final ExecuteWatchResponse executeWatch(
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

	public GetWatchResponse getWatch(GetWatchRequest request) throws IOException {
		return this.transport.performRequest(request, GetWatchRequest.ENDPOINT, this.requestOptions);
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

	public final GetWatchResponse getWatch(Function<GetWatchRequest.Builder, ObjectBuilder<GetWatchRequest>> fn)
			throws IOException {
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

	public PutWatchResponse putWatch(PutWatchRequest request) throws IOException {
		return this.transport.performRequest(request, PutWatchRequest.ENDPOINT, this.requestOptions);
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

	public final PutWatchResponse putWatch(Function<PutWatchRequest.Builder, ObjectBuilder<PutWatchRequest>> fn)
			throws IOException {
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

	public QueryWatchesResponse queryWatches(QueryWatchesRequest request) throws IOException {
		return this.transport.performRequest(request, QueryWatchesRequest.ENDPOINT, this.requestOptions);
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

	public final QueryWatchesResponse queryWatches(
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
	public StartResponse start() throws IOException {
		return this.transport.performRequest(StartRequest.INSTANCE, StartRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: watcher.stats

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public StatsResponse stats(StatsRequest request) throws IOException {
		return this.transport.performRequest(request, StatsRequest.ENDPOINT, this.requestOptions);
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

	public final StatsResponse stats(Function<StatsRequest.Builder, ObjectBuilder<StatsRequest>> fn)
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
	public StopResponse stop() throws IOException {
		return this.transport.performRequest(StopRequest.INSTANCE, StopRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Misc

	/**
	 * Creates a new {@link #WatcherClient} with specific request options.
	 */
	@Override
	public WatcherClient withRequestOptions(@Nullable RequestOptions options) {
		return new WatcherClient(transport, options);
	}

	/**
	 * Creates a new {@link #WatcherClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public WatcherClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
