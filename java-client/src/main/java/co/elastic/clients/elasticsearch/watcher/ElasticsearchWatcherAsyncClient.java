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
 * Client for the watcher namespace.
 */
public class ElasticsearchWatcherAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchWatcherAsyncClient> {

	public ElasticsearchWatcherAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchWatcherAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchWatcherAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchWatcherAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: watcher.ack_watch

	/**
	 * Acknowledge a watch. Acknowledging a watch enables you to manually throttle
	 * the execution of the watch's actions.
	 * <p>
	 * The acknowledgement state of an action is stored in the
	 * <code>status.actions.&lt;id&gt;.ack.state</code> structure.
	 * <p>
	 * IMPORTANT: If the specified watch is currently being executed, this API will
	 * return an error The reason for this behavior is to prevent overwriting the
	 * watch status from a watch execution.
	 * <p>
	 * Acknowledging an action throttles further executions of that action until its
	 * <code>ack.state</code> is reset to <code>awaits_successful_execution</code>.
	 * This happens when the condition of the watch is not met (the condition
	 * evaluates to false). To demonstrate how throttling works in practice and how
	 * it can be configured for individual actions within a watch, refer to External
	 * documentation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-ack-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AckWatchResponse> ackWatch(AckWatchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AckWatchRequest, AckWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<AckWatchRequest, AckWatchResponse, ErrorResponse>) AckWatchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Acknowledge a watch. Acknowledging a watch enables you to manually throttle
	 * the execution of the watch's actions.
	 * <p>
	 * The acknowledgement state of an action is stored in the
	 * <code>status.actions.&lt;id&gt;.ack.state</code> structure.
	 * <p>
	 * IMPORTANT: If the specified watch is currently being executed, this API will
	 * return an error The reason for this behavior is to prevent overwriting the
	 * watch status from a watch execution.
	 * <p>
	 * Acknowledging an action throttles further executions of that action until its
	 * <code>ack.state</code> is reset to <code>awaits_successful_execution</code>.
	 * This happens when the condition of the watch is not met (the condition
	 * evaluates to false). To demonstrate how throttling works in practice and how
	 * it can be configured for individual actions within a watch, refer to External
	 * documentation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AckWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-ack-watch">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AckWatchResponse> ackWatch(
			Function<AckWatchRequest.Builder, ObjectBuilder<AckWatchRequest>> fn) {
		return ackWatch(fn.apply(new AckWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.activate_watch

	/**
	 * Activate a watch. A watch can be either active or inactive.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-activate-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ActivateWatchResponse> activateWatch(ActivateWatchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ActivateWatchRequest, ActivateWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<ActivateWatchRequest, ActivateWatchResponse, ErrorResponse>) ActivateWatchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Activate a watch. A watch can be either active or inactive.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ActivateWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-activate-watch">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ActivateWatchResponse> activateWatch(
			Function<ActivateWatchRequest.Builder, ObjectBuilder<ActivateWatchRequest>> fn) {
		return activateWatch(fn.apply(new ActivateWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.deactivate_watch

	/**
	 * Deactivate a watch. A watch can be either active or inactive.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-deactivate-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeactivateWatchResponse> deactivateWatch(DeactivateWatchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse>) DeactivateWatchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deactivate a watch. A watch can be either active or inactive.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeactivateWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-deactivate-watch">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeactivateWatchResponse> deactivateWatch(
			Function<DeactivateWatchRequest.Builder, ObjectBuilder<DeactivateWatchRequest>> fn) {
		return deactivateWatch(fn.apply(new DeactivateWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.delete_watch

	/**
	 * Delete a watch. When the watch is removed, the document representing the
	 * watch in the <code>.watches</code> index is gone and it will never be run
	 * again.
	 * <p>
	 * Deleting a watch does not delete any watch execution records related to this
	 * watch from the watch history.
	 * <p>
	 * IMPORTANT: Deleting a watch must be done by using only this API. Do not
	 * delete the watch directly from the <code>.watches</code> index using the
	 * Elasticsearch delete document API When Elasticsearch security features are
	 * enabled, make sure no write privileges are granted to anyone for the
	 * <code>.watches</code> index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-delete-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteWatchResponse> deleteWatch(DeleteWatchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteWatchRequest, DeleteWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteWatchRequest, DeleteWatchResponse, ErrorResponse>) DeleteWatchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a watch. When the watch is removed, the document representing the
	 * watch in the <code>.watches</code> index is gone and it will never be run
	 * again.
	 * <p>
	 * Deleting a watch does not delete any watch execution records related to this
	 * watch from the watch history.
	 * <p>
	 * IMPORTANT: Deleting a watch must be done by using only this API. Do not
	 * delete the watch directly from the <code>.watches</code> index using the
	 * Elasticsearch delete document API When Elasticsearch security features are
	 * enabled, make sure no write privileges are granted to anyone for the
	 * <code>.watches</code> index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-delete-watch">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteWatchResponse> deleteWatch(
			Function<DeleteWatchRequest.Builder, ObjectBuilder<DeleteWatchRequest>> fn) {
		return deleteWatch(fn.apply(new DeleteWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.execute_watch

	/**
	 * Run a watch. This API can be used to force execution of the watch outside of
	 * its triggering logic or to simulate the watch execution for debugging
	 * purposes.
	 * <p>
	 * For testing and debugging purposes, you also have fine-grained control on how
	 * the watch runs. You can run the watch without running all of its actions or
	 * alternatively by simulating them. You can also force execution by ignoring
	 * the watch condition and control whether a watch record would be written to
	 * the watch history after it runs.
	 * <p>
	 * You can use the run watch API to run watches that are not yet registered by
	 * specifying the watch definition inline. This serves as great tool for testing
	 * and debugging your watches prior to adding them to Watcher.
	 * <p>
	 * When Elasticsearch security features are enabled on your cluster, watches are
	 * run with the privileges of the user that stored the watches. If your user is
	 * allowed to read index <code>a</code>, but not index <code>b</code>, then the
	 * exact same set of rules will apply during execution of a watch.
	 * <p>
	 * When using the run watch API, the authorization data of the user that called
	 * the API will be used as a base, instead of the information who stored the
	 * watch. Refer to the external documentation for examples of watch execution
	 * requests, including existing, customized, and inline watches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-execute-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteWatchResponse> executeWatch(ExecuteWatchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExecuteWatchRequest, ExecuteWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<ExecuteWatchRequest, ExecuteWatchResponse, ErrorResponse>) ExecuteWatchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a watch. This API can be used to force execution of the watch outside of
	 * its triggering logic or to simulate the watch execution for debugging
	 * purposes.
	 * <p>
	 * For testing and debugging purposes, you also have fine-grained control on how
	 * the watch runs. You can run the watch without running all of its actions or
	 * alternatively by simulating them. You can also force execution by ignoring
	 * the watch condition and control whether a watch record would be written to
	 * the watch history after it runs.
	 * <p>
	 * You can use the run watch API to run watches that are not yet registered by
	 * specifying the watch definition inline. This serves as great tool for testing
	 * and debugging your watches prior to adding them to Watcher.
	 * <p>
	 * When Elasticsearch security features are enabled on your cluster, watches are
	 * run with the privileges of the user that stored the watches. If your user is
	 * allowed to read index <code>a</code>, but not index <code>b</code>, then the
	 * exact same set of rules will apply during execution of a watch.
	 * <p>
	 * When using the run watch API, the authorization data of the user that called
	 * the API will be used as a base, instead of the information who stored the
	 * watch. Refer to the external documentation for examples of watch execution
	 * requests, including existing, customized, and inline watches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecuteWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-execute-watch">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecuteWatchResponse> executeWatch(
			Function<ExecuteWatchRequest.Builder, ObjectBuilder<ExecuteWatchRequest>> fn) {
		return executeWatch(fn.apply(new ExecuteWatchRequest.Builder()).build());
	}

	/**
	 * Run a watch. This API can be used to force execution of the watch outside of
	 * its triggering logic or to simulate the watch execution for debugging
	 * purposes.
	 * <p>
	 * For testing and debugging purposes, you also have fine-grained control on how
	 * the watch runs. You can run the watch without running all of its actions or
	 * alternatively by simulating them. You can also force execution by ignoring
	 * the watch condition and control whether a watch record would be written to
	 * the watch history after it runs.
	 * <p>
	 * You can use the run watch API to run watches that are not yet registered by
	 * specifying the watch definition inline. This serves as great tool for testing
	 * and debugging your watches prior to adding them to Watcher.
	 * <p>
	 * When Elasticsearch security features are enabled on your cluster, watches are
	 * run with the privileges of the user that stored the watches. If your user is
	 * allowed to read index <code>a</code>, but not index <code>b</code>, then the
	 * exact same set of rules will apply during execution of a watch.
	 * <p>
	 * When using the run watch API, the authorization data of the user that called
	 * the API will be used as a base, instead of the information who stored the
	 * watch. Refer to the external documentation for examples of watch execution
	 * requests, including existing, customized, and inline watches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-execute-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecuteWatchResponse> executeWatch() {
		return this.transport.performRequestAsync(new ExecuteWatchRequest.Builder().build(),
				ExecuteWatchRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: watcher.get_settings

	/**
	 * Get Watcher index settings. Get settings for the Watcher internal index
	 * (<code>.watches</code>). Only a subset of settings are shown, for example
	 * <code>index.auto_expand_replicas</code> and
	 * <code>index.number_of_replicas</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetWatcherSettingsResponse> getSettings(GetWatcherSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetWatcherSettingsRequest, GetWatcherSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetWatcherSettingsRequest, GetWatcherSettingsResponse, ErrorResponse>) GetWatcherSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get Watcher index settings. Get settings for the Watcher internal index
	 * (<code>.watches</code>). Only a subset of settings are shown, for example
	 * <code>index.auto_expand_replicas</code> and
	 * <code>index.number_of_replicas</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetWatcherSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetWatcherSettingsResponse> getSettings(
			Function<GetWatcherSettingsRequest.Builder, ObjectBuilder<GetWatcherSettingsRequest>> fn) {
		return getSettings(fn.apply(new GetWatcherSettingsRequest.Builder()).build());
	}

	/**
	 * Get Watcher index settings. Get settings for the Watcher internal index
	 * (<code>.watches</code>). Only a subset of settings are shown, for example
	 * <code>index.auto_expand_replicas</code> and
	 * <code>index.number_of_replicas</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetWatcherSettingsResponse> getSettings() {
		return this.transport.performRequestAsync(new GetWatcherSettingsRequest.Builder().build(),
				GetWatcherSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: watcher.get_watch

	/**
	 * Get a watch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-get-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetWatchResponse> getWatch(GetWatchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetWatchRequest, GetWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<GetWatchRequest, GetWatchResponse, ErrorResponse>) GetWatchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a watch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-get-watch">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetWatchResponse> getWatch(
			Function<GetWatchRequest.Builder, ObjectBuilder<GetWatchRequest>> fn) {
		return getWatch(fn.apply(new GetWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.put_watch

	/**
	 * Create or update a watch. When a watch is registered, a new document that
	 * represents the watch is added to the <code>.watches</code> index and its
	 * trigger is immediately registered with the relevant trigger engine. Typically
	 * for the <code>schedule</code> trigger, the scheduler is the trigger engine.
	 * <p>
	 * IMPORTANT: You must use Kibana or this API to create a watch. Do not add a
	 * watch directly to the <code>.watches</code> index by using the Elasticsearch
	 * index API. If Elasticsearch security features are enabled, do not give users
	 * write privileges on the <code>.watches</code> index.
	 * <p>
	 * When you add a watch you can also define its initial active state by setting
	 * the <em>active</em> parameter.
	 * <p>
	 * When Elasticsearch security features are enabled, your watch can index or
	 * search only on indices for which the user that stored the watch has
	 * privileges. If the user is able to read index <code>a</code>, but not index
	 * <code>b</code>, the same will apply when the watch runs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-put-watch">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutWatchResponse> putWatch(PutWatchRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutWatchRequest, PutWatchResponse, ErrorResponse> endpoint = (JsonEndpoint<PutWatchRequest, PutWatchResponse, ErrorResponse>) PutWatchRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a watch. When a watch is registered, a new document that
	 * represents the watch is added to the <code>.watches</code> index and its
	 * trigger is immediately registered with the relevant trigger engine. Typically
	 * for the <code>schedule</code> trigger, the scheduler is the trigger engine.
	 * <p>
	 * IMPORTANT: You must use Kibana or this API to create a watch. Do not add a
	 * watch directly to the <code>.watches</code> index by using the Elasticsearch
	 * index API. If Elasticsearch security features are enabled, do not give users
	 * write privileges on the <code>.watches</code> index.
	 * <p>
	 * When you add a watch you can also define its initial active state by setting
	 * the <em>active</em> parameter.
	 * <p>
	 * When Elasticsearch security features are enabled, your watch can index or
	 * search only on indices for which the user that stored the watch has
	 * privileges. If the user is able to read index <code>a</code>, but not index
	 * <code>b</code>, the same will apply when the watch runs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutWatchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-put-watch">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutWatchResponse> putWatch(
			Function<PutWatchRequest.Builder, ObjectBuilder<PutWatchRequest>> fn) {
		return putWatch(fn.apply(new PutWatchRequest.Builder()).build());
	}

	// ----- Endpoint: watcher.query_watches

	/**
	 * Query watches. Get all registered watches in a paginated manner and
	 * optionally filter watches by a query.
	 * <p>
	 * Note that only the <code>_id</code> and <code>metadata.*</code> fields are
	 * queryable or sortable.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-query-watches">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryWatchesResponse> queryWatches(QueryWatchesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryWatchesRequest, QueryWatchesResponse, ErrorResponse>) QueryWatchesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Query watches. Get all registered watches in a paginated manner and
	 * optionally filter watches by a query.
	 * <p>
	 * Note that only the <code>_id</code> and <code>metadata.*</code> fields are
	 * queryable or sortable.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryWatchesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-query-watches">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<QueryWatchesResponse> queryWatches(
			Function<QueryWatchesRequest.Builder, ObjectBuilder<QueryWatchesRequest>> fn) {
		return queryWatches(fn.apply(new QueryWatchesRequest.Builder()).build());
	}

	/**
	 * Query watches. Get all registered watches in a paginated manner and
	 * optionally filter watches by a query.
	 * <p>
	 * Note that only the <code>_id</code> and <code>metadata.*</code> fields are
	 * queryable or sortable.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-query-watches">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryWatchesResponse> queryWatches() {
		return this.transport.performRequestAsync(new QueryWatchesRequest.Builder().build(),
				QueryWatchesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: watcher.start

	/**
	 * Start the watch service. Start the Watcher service if it is not already
	 * running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-start">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartWatcherResponse> start(StartWatcherRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartWatcherRequest, StartWatcherResponse, ErrorResponse> endpoint = (JsonEndpoint<StartWatcherRequest, StartWatcherResponse, ErrorResponse>) StartWatcherRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Start the watch service. Start the Watcher service if it is not already
	 * running.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartWatcherRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-start">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartWatcherResponse> start(
			Function<StartWatcherRequest.Builder, ObjectBuilder<StartWatcherRequest>> fn) {
		return start(fn.apply(new StartWatcherRequest.Builder()).build());
	}

	/**
	 * Start the watch service. Start the Watcher service if it is not already
	 * running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-start">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartWatcherResponse> start() {
		return this.transport.performRequestAsync(new StartWatcherRequest.Builder().build(),
				StartWatcherRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: watcher.stats

	/**
	 * Get Watcher statistics. This API always returns basic metrics. You retrieve
	 * more metrics by using the metric parameter.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<WatcherStatsResponse> stats(WatcherStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<WatcherStatsRequest, WatcherStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<WatcherStatsRequest, WatcherStatsResponse, ErrorResponse>) WatcherStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get Watcher statistics. This API always returns basic metrics. You retrieve
	 * more metrics by using the metric parameter.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link WatcherStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<WatcherStatsResponse> stats(
			Function<WatcherStatsRequest.Builder, ObjectBuilder<WatcherStatsRequest>> fn) {
		return stats(fn.apply(new WatcherStatsRequest.Builder()).build());
	}

	/**
	 * Get Watcher statistics. This API always returns basic metrics. You retrieve
	 * more metrics by using the metric parameter.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<WatcherStatsResponse> stats() {
		return this.transport.performRequestAsync(new WatcherStatsRequest.Builder().build(),
				WatcherStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: watcher.stop

	/**
	 * Stop the watch service. Stop the Watcher service if it is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-stop">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopWatcherResponse> stop(StopWatcherRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopWatcherRequest, StopWatcherResponse, ErrorResponse> endpoint = (JsonEndpoint<StopWatcherRequest, StopWatcherResponse, ErrorResponse>) StopWatcherRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop the watch service. Stop the Watcher service if it is running.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopWatcherRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-stop">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopWatcherResponse> stop(
			Function<StopWatcherRequest.Builder, ObjectBuilder<StopWatcherRequest>> fn) {
		return stop(fn.apply(new StopWatcherRequest.Builder()).build());
	}

	/**
	 * Stop the watch service. Stop the Watcher service if it is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-stop">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopWatcherResponse> stop() {
		return this.transport.performRequestAsync(new StopWatcherRequest.Builder().build(),
				StopWatcherRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: watcher.update_settings

	/**
	 * Update Watcher index settings. Update settings for the Watcher internal index
	 * (<code>.watches</code>). Only a subset of settings can be modified. This
	 * includes <code>index.auto_expand_replicas</code>,
	 * <code>index.number_of_replicas</code>,
	 * <code>index.routing.allocation.exclude.*</code>,
	 * <code>index.routing.allocation.include.*</code> and
	 * <code>index.routing.allocation.require.*</code>. Modification of
	 * <code>index.routing.allocation.include._tier_preference</code> is an
	 * exception and is not allowed as the Watcher shards must always be in the
	 * <code>data_content</code> tier.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-update-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateSettingsResponse> updateSettings(UpdateSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateSettingsRequest, UpdateSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateSettingsRequest, UpdateSettingsResponse, ErrorResponse>) UpdateSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update Watcher index settings. Update settings for the Watcher internal index
	 * (<code>.watches</code>). Only a subset of settings can be modified. This
	 * includes <code>index.auto_expand_replicas</code>,
	 * <code>index.number_of_replicas</code>,
	 * <code>index.routing.allocation.exclude.*</code>,
	 * <code>index.routing.allocation.include.*</code> and
	 * <code>index.routing.allocation.require.*</code>. Modification of
	 * <code>index.routing.allocation.include._tier_preference</code> is an
	 * exception and is not allowed as the Watcher shards must always be in the
	 * <code>data_content</code> tier.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-update-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateSettingsResponse> updateSettings(
			Function<UpdateSettingsRequest.Builder, ObjectBuilder<UpdateSettingsRequest>> fn) {
		return updateSettings(fn.apply(new UpdateSettingsRequest.Builder()).build());
	}

	/**
	 * Update Watcher index settings. Update settings for the Watcher internal index
	 * (<code>.watches</code>). Only a subset of settings can be modified. This
	 * includes <code>index.auto_expand_replicas</code>,
	 * <code>index.number_of_replicas</code>,
	 * <code>index.routing.allocation.exclude.*</code>,
	 * <code>index.routing.allocation.include.*</code> and
	 * <code>index.routing.allocation.require.*</code>. Modification of
	 * <code>index.routing.allocation.include._tier_preference</code> is an
	 * exception and is not allowed as the Watcher shards must always be in the
	 * <code>data_content</code> tier.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-watcher-update-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateSettingsResponse> updateSettings() {
		return this.transport.performRequestAsync(new UpdateSettingsRequest.Builder().build(),
				UpdateSettingsRequest._ENDPOINT, this.transportOptions);
	}

}
