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

package co.elastic.clients.elasticsearch.watcher;

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
 * Client for the watcher namespace.
 */
public class ElasticsearchWatcherClient extends ApiClient<ElasticsearchTransport, ElasticsearchWatcherClient> {

	public ElasticsearchWatcherClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchWatcherClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchWatcherClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchWatcherClient(this.transport, transportOptions);
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

	public AckWatchResponse ackWatch(AckWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AckWatchRequest, AckWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<AckWatchRequest, AckWatchResponse, ErrorResponse>) AckWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Acknowledges a watch, manually throttling the execution of the watch's
	 * actions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AckWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-ack-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AckWatchResponse ackWatch(Function<AckWatchRequest.Builder, ObjectBuilder<AckWatchRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public ActivateWatchResponse activateWatch(ActivateWatchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ActivateWatchRequest, ActivateWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<ActivateWatchRequest, ActivateWatchResponse, ErrorResponse>) ActivateWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Activates a currently inactive watch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ActivateWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-activate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ActivateWatchResponse activateWatch(
			Function<ActivateWatchRequest.Builder, ObjectBuilder<ActivateWatchRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public DeactivateWatchResponse deactivateWatch(DeactivateWatchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse>) DeactivateWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deactivates a currently active watch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeactivateWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-deactivate-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeactivateWatchResponse deactivateWatch(
			Function<DeactivateWatchRequest.Builder, ObjectBuilder<DeactivateWatchRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public DeleteWatchResponse deleteWatch(DeleteWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteWatchRequest, DeleteWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteWatchRequest, DeleteWatchResponse, ErrorResponse>) DeleteWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes a watch from Watcher.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-delete-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteWatchResponse deleteWatch(
			Function<DeleteWatchRequest.Builder, ObjectBuilder<DeleteWatchRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteWatch(fn.apply(new DeleteWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.execute_watch

	/**
	 * This API can be used to force execution of the watch outside of its
	 * triggering logic or to simulate the watch execution for debugging purposes.
	 * For testing and debugging purposes, you also have fine-grained control on how
	 * the watch runs. You can execute the watch without executing all of its
	 * actions or alternatively by simulating them. You can also force execution by
	 * ignoring the watch condition and control whether a watch record would be
	 * written to the watch history after execution.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExecuteWatchResponse executeWatch(ExecuteWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExecuteWatchRequest, ExecuteWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<ExecuteWatchRequest, ExecuteWatchResponse, ErrorResponse>) ExecuteWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * This API can be used to force execution of the watch outside of its
	 * triggering logic or to simulate the watch execution for debugging purposes.
	 * For testing and debugging purposes, you also have fine-grained control on how
	 * the watch runs. You can execute the watch without executing all of its
	 * actions or alternatively by simulating them. You can also force execution by
	 * ignoring the watch condition and control whether a watch record would be
	 * written to the watch history after execution.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecuteWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ExecuteWatchResponse executeWatch(
			Function<ExecuteWatchRequest.Builder, ObjectBuilder<ExecuteWatchRequest>> fn)
			throws IOException, ElasticsearchException {
		return executeWatch(fn.apply(new ExecuteWatchRequest.Builder()).build());
	}

	/**
	 * This API can be used to force execution of the watch outside of its
	 * triggering logic or to simulate the watch execution for debugging purposes.
	 * For testing and debugging purposes, you also have fine-grained control on how
	 * the watch runs. You can execute the watch without executing all of its
	 * actions or alternatively by simulating them. You can also force execution by
	 * ignoring the watch condition and control whether a watch record would be
	 * written to the watch history after execution.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-execute-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExecuteWatchResponse executeWatch() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ExecuteWatchRequest.Builder().build(), ExecuteWatchRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.get_watch

	/**
	 * Retrieves a watch by its ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-get-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetWatchResponse getWatch(GetWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetWatchRequest, GetWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<GetWatchRequest, GetWatchResponse, ErrorResponse>) GetWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a watch by its ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-get-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetWatchResponse getWatch(Function<GetWatchRequest.Builder, ObjectBuilder<GetWatchRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public PutWatchResponse putWatch(PutWatchRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutWatchRequest, PutWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<PutWatchRequest, PutWatchResponse, ErrorResponse>) PutWatchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new watch, or updates an existing one.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-put-watch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutWatchResponse putWatch(Function<PutWatchRequest.Builder, ObjectBuilder<PutWatchRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public QueryWatchesResponse queryWatches(QueryWatchesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse>) QueryWatchesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves stored watches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryWatchesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-query-watches.html">Documentation
	 *      on elastic.co</a>
	 */

	public final QueryWatchesResponse queryWatches(
			Function<QueryWatchesRequest.Builder, ObjectBuilder<QueryWatchesRequest>> fn)
			throws IOException, ElasticsearchException {
		return queryWatches(fn.apply(new QueryWatchesRequest.Builder()).build());
	}

	/**
	 * Retrieves stored watches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-query-watches.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryWatchesResponse queryWatches() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryWatchesRequest.Builder().build(), QueryWatchesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.start

	/**
	 * Starts Watcher if it is not already running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-start.html">Documentation
	 *      on elastic.co</a>
	 */
	public StartWatcherResponse start() throws IOException, ElasticsearchException {
		return this.transport.performRequest(StartWatcherRequest._INSTANCE, StartWatcherRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.stats

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public WatcherStatsResponse stats(WatcherStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<WatcherStatsRequest, WatcherStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<WatcherStatsRequest, WatcherStatsResponse, ErrorResponse>) WatcherStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link WatcherStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final WatcherStatsResponse stats(
			Function<WatcherStatsRequest.Builder, ObjectBuilder<WatcherStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return stats(fn.apply(new WatcherStatsRequest.Builder()).build());
	}

	/**
	 * Retrieves the current Watcher metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public WatcherStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new WatcherStatsRequest.Builder().build(), WatcherStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: watcher.stop

	/**
	 * Stops Watcher if it is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/watcher-api-stop.html">Documentation
	 *      on elastic.co</a>
	 */
	public StopWatcherResponse stop() throws IOException, ElasticsearchException {
		return this.transport.performRequest(StopWatcherRequest._INSTANCE, StopWatcherRequest._ENDPOINT,
				this.transportOptions);
	}

}
