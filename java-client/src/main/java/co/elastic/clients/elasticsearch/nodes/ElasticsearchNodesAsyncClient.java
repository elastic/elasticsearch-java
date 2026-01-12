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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.TextResponse;
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
 * Client for the nodes namespace.
 */
public class ElasticsearchNodesAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchNodesAsyncClient> {

	public ElasticsearchNodesAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchNodesAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchNodesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchNodesAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: nodes.clear_repositories_metering_archive

	/**
	 * Clear the archived repositories metering. Clear the archived repositories
	 * metering information in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-clear-repositories-metering-archive">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearRepositoriesMeteringArchiveResponse> clearRepositoriesMeteringArchive(
			ClearRepositoriesMeteringArchiveRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearRepositoriesMeteringArchiveRequest, ClearRepositoriesMeteringArchiveResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearRepositoriesMeteringArchiveRequest, ClearRepositoriesMeteringArchiveResponse, ErrorResponse>) ClearRepositoriesMeteringArchiveRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the archived repositories metering. Clear the archived repositories
	 * metering information in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearRepositoriesMeteringArchiveRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-clear-repositories-metering-archive">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearRepositoriesMeteringArchiveResponse> clearRepositoriesMeteringArchive(
			Function<ClearRepositoriesMeteringArchiveRequest.Builder, ObjectBuilder<ClearRepositoriesMeteringArchiveRequest>> fn) {
		return clearRepositoriesMeteringArchive(
				fn.apply(new ClearRepositoriesMeteringArchiveRequest.Builder()).build());
	}

	// ----- Endpoint: nodes.get_repositories_metering_info

	/**
	 * Get cluster repositories metering. Get repositories metering information for
	 * a cluster. This API exposes monotonically non-decreasing counters and it is
	 * expected that clients would durably store the information needed to compute
	 * aggregations over a period of time. Additionally, the information exposed by
	 * this API is volatile, meaning that it will not be present after node
	 * restarts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-get-repositories-metering-info">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoriesMeteringInfoResponse> getRepositoriesMeteringInfo(
			GetRepositoriesMeteringInfoRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRepositoriesMeteringInfoRequest, GetRepositoriesMeteringInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRepositoriesMeteringInfoRequest, GetRepositoriesMeteringInfoResponse, ErrorResponse>) GetRepositoriesMeteringInfoRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get cluster repositories metering. Get repositories metering information for
	 * a cluster. This API exposes monotonically non-decreasing counters and it is
	 * expected that clients would durably store the information needed to compute
	 * aggregations over a period of time. Additionally, the information exposed by
	 * this API is volatile, meaning that it will not be present after node
	 * restarts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRepositoriesMeteringInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-get-repositories-metering-info">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRepositoriesMeteringInfoResponse> getRepositoriesMeteringInfo(
			Function<GetRepositoriesMeteringInfoRequest.Builder, ObjectBuilder<GetRepositoriesMeteringInfoRequest>> fn) {
		return getRepositoriesMeteringInfo(fn.apply(new GetRepositoriesMeteringInfoRequest.Builder()).build());
	}

	// ----- Endpoint: nodes.hot_threads

	/**
	 * Get the hot threads for nodes. Get a breakdown of the hot threads on each
	 * selected node in the cluster. The output is plain text with a breakdown of
	 * the top hot threads for each node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-hot-threads">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TextResponse> hotThreads(HotThreadsRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<HotThreadsRequest, TextResponse, ErrorResponse> endpoint = (Endpoint<HotThreadsRequest, TextResponse, ErrorResponse>) HotThreadsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the hot threads for nodes. Get a breakdown of the hot threads on each
	 * selected node in the cluster. The output is plain text with a breakdown of
	 * the top hot threads for each node.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HotThreadsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-hot-threads">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TextResponse> hotThreads(
			Function<HotThreadsRequest.Builder, ObjectBuilder<HotThreadsRequest>> fn) {
		return hotThreads(fn.apply(new HotThreadsRequest.Builder()).build());
	}

	/**
	 * Get the hot threads for nodes. Get a breakdown of the hot threads on each
	 * selected node in the cluster. The output is plain text with a breakdown of
	 * the top hot threads for each node.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-hot-threads">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TextResponse> hotThreads() {
		return this.transport.performRequestAsync(new HotThreadsRequest.Builder().build(), HotThreadsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: nodes.info

	/**
	 * Get node information.
	 * <p>
	 * By default, the API returns all attributes and core settings for cluster
	 * nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-info">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesInfoResponse> info(NodesInfoRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesInfoRequest, NodesInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<NodesInfoRequest, NodesInfoResponse, ErrorResponse>) NodesInfoRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get node information.
	 * <p>
	 * By default, the API returns all attributes and core settings for cluster
	 * nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-info">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesInfoResponse> info(
			Function<NodesInfoRequest.Builder, ObjectBuilder<NodesInfoRequest>> fn) {
		return info(fn.apply(new NodesInfoRequest.Builder()).build());
	}

	/**
	 * Get node information.
	 * <p>
	 * By default, the API returns all attributes and core settings for cluster
	 * nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-info">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesInfoResponse> info() {
		return this.transport.performRequestAsync(new NodesInfoRequest.Builder().build(), NodesInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: nodes.reload_secure_settings

	/**
	 * Reload the keystore on nodes in the cluster.
	 * <p>
	 * Secure settings are stored in an on-disk keystore. Certain of these settings
	 * are reloadable. That is, you can change them on disk and reload them without
	 * restarting any nodes in the cluster. When you have updated reloadable secure
	 * settings in your keystore, you can use this API to reload those settings on
	 * each node.
	 * <p>
	 * When the Elasticsearch keystore is password protected and not simply
	 * obfuscated, you must provide the password for the keystore when you reload
	 * the secure settings. Reloading the settings for the whole cluster assumes
	 * that the keystores for all nodes are protected with the same password; this
	 * method is allowed only when inter-node communications are encrypted.
	 * Alternatively, you can reload the secure settings on each node by locally
	 * accessing the API and passing the node-specific Elasticsearch keystore
	 * password.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-reload-secure-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings(ReloadSecureSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ErrorResponse>) ReloadSecureSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Reload the keystore on nodes in the cluster.
	 * <p>
	 * Secure settings are stored in an on-disk keystore. Certain of these settings
	 * are reloadable. That is, you can change them on disk and reload them without
	 * restarting any nodes in the cluster. When you have updated reloadable secure
	 * settings in your keystore, you can use this API to reload those settings on
	 * each node.
	 * <p>
	 * When the Elasticsearch keystore is password protected and not simply
	 * obfuscated, you must provide the password for the keystore when you reload
	 * the secure settings. Reloading the settings for the whole cluster assumes
	 * that the keystores for all nodes are protected with the same password; this
	 * method is allowed only when inter-node communications are encrypted.
	 * Alternatively, you can reload the secure settings on each node by locally
	 * accessing the API and passing the node-specific Elasticsearch keystore
	 * password.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReloadSecureSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-reload-secure-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings(
			Function<ReloadSecureSettingsRequest.Builder, ObjectBuilder<ReloadSecureSettingsRequest>> fn) {
		return reloadSecureSettings(fn.apply(new ReloadSecureSettingsRequest.Builder()).build());
	}

	/**
	 * Reload the keystore on nodes in the cluster.
	 * <p>
	 * Secure settings are stored in an on-disk keystore. Certain of these settings
	 * are reloadable. That is, you can change them on disk and reload them without
	 * restarting any nodes in the cluster. When you have updated reloadable secure
	 * settings in your keystore, you can use this API to reload those settings on
	 * each node.
	 * <p>
	 * When the Elasticsearch keystore is password protected and not simply
	 * obfuscated, you must provide the password for the keystore when you reload
	 * the secure settings. Reloading the settings for the whole cluster assumes
	 * that the keystores for all nodes are protected with the same password; this
	 * method is allowed only when inter-node communications are encrypted.
	 * Alternatively, you can reload the secure settings on each node by locally
	 * accessing the API and passing the node-specific Elasticsearch keystore
	 * password.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-reload-secure-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings() {
		return this.transport.performRequestAsync(new ReloadSecureSettingsRequest.Builder().build(),
				ReloadSecureSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: nodes.stats

	/**
	 * Get node statistics. Get statistics for nodes in a cluster. By default, all
	 * stats are returned. You can limit the returned information by using metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesStatsResponse> stats(NodesStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesStatsRequest, NodesStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<NodesStatsRequest, NodesStatsResponse, ErrorResponse>) NodesStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get node statistics. Get statistics for nodes in a cluster. By default, all
	 * stats are returned. You can limit the returned information by using metrics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesStatsResponse> stats(
			Function<NodesStatsRequest.Builder, ObjectBuilder<NodesStatsRequest>> fn) {
		return stats(fn.apply(new NodesStatsRequest.Builder()).build());
	}

	/**
	 * Get node statistics. Get statistics for nodes in a cluster. By default, all
	 * stats are returned. You can limit the returned information by using metrics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesStatsResponse> stats() {
		return this.transport.performRequestAsync(new NodesStatsRequest.Builder().build(), NodesStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: nodes.usage

	/**
	 * Get feature usage information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-usage">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesUsageResponse> usage(NodesUsageRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesUsageRequest, NodesUsageResponse, ErrorResponse> endpoint = (JsonEndpoint<NodesUsageRequest, NodesUsageResponse, ErrorResponse>) NodesUsageRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get feature usage information.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesUsageRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-usage">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesUsageResponse> usage(
			Function<NodesUsageRequest.Builder, ObjectBuilder<NodesUsageRequest>> fn) {
		return usage(fn.apply(new NodesUsageRequest.Builder()).build());
	}

	/**
	 * Get feature usage information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-nodes-usage">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesUsageResponse> usage() {
		return this.transport.performRequestAsync(new NodesUsageRequest.Builder().build(), NodesUsageRequest._ENDPOINT,
				this.transportOptions);
	}

}
