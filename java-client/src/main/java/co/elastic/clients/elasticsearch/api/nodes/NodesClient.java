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

package co.elastic.clients.elasticsearch.api.nodes;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.nodes.HotThreadsRequest;
import co.elastic.clients.elasticsearch.nodes.HotThreadsResponse;
import co.elastic.clients.elasticsearch.nodes.InfoRequest;
import co.elastic.clients.elasticsearch.nodes.InfoResponse;
import co.elastic.clients.elasticsearch.nodes.ReloadSecureSettingsRequest;
import co.elastic.clients.elasticsearch.nodes.ReloadSecureSettingsResponse;
import co.elastic.clients.elasticsearch.nodes.StatsRequest;
import co.elastic.clients.elasticsearch.nodes.StatsResponse;
import co.elastic.clients.elasticsearch.nodes.UsageRequest;
import co.elastic.clients.elasticsearch.nodes.UsageResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the nodes namespace.
 */
public class NodesClient extends ApiClient<NodesClient> {

	public NodesClient(Transport transport) {
		super(transport, null);
	}

	public NodesClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: nodes.hot_threads

	/**
	 * Returns information about hot threads on each node in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html"
	 */

	public HotThreadsResponse hotThreads(HotThreadsRequest request) throws IOException {
		return this.transport.performRequest(request, HotThreadsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about hot threads on each node in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final HotThreadsResponse hotThreads(Function<HotThreadsRequest.Builder, ObjectBuilder<HotThreadsRequest>> fn)
			throws IOException {
		return hotThreads(fn.apply(new HotThreadsRequest.Builder()).build());
	}

	// ----- Endpoint: nodes.info

	/**
	 * Returns information about nodes in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html"
	 */

	public InfoResponse info(InfoRequest request) throws IOException {
		return this.transport.performRequest(request, InfoRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about nodes in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final InfoResponse info(Function<InfoRequest.Builder, ObjectBuilder<InfoRequest>> fn) throws IOException {
		return info(fn.apply(new InfoRequest.Builder()).build());
	}

	// ----- Endpoint: nodes.reload_secure_settings

	/**
	 * Reloads secure settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/secure-settings.html#reloadable-secure-settings"
	 */

	public ReloadSecureSettingsResponse reloadSecureSettings(ReloadSecureSettingsRequest request) throws IOException {
		return this.transport.performRequest(request, ReloadSecureSettingsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Reloads secure settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/secure-settings.html#reloadable-secure-settings"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final ReloadSecureSettingsResponse reloadSecureSettings(
			Function<ReloadSecureSettingsRequest.Builder, ObjectBuilder<ReloadSecureSettingsRequest>> fn)
			throws IOException {
		return reloadSecureSettings(fn.apply(new ReloadSecureSettingsRequest.Builder()).build());
	}

	// ----- Endpoint: nodes.stats

	/**
	 * Returns statistical information about nodes in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html"
	 */

	public StatsResponse stats(StatsRequest request) throws IOException {
		return this.transport.performRequest(request, StatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns statistical information about nodes in the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final StatsResponse stats(Function<StatsRequest.Builder, ObjectBuilder<StatsRequest>> fn)
			throws IOException {
		return stats(fn.apply(new StatsRequest.Builder()).build());
	}

	// ----- Endpoint: nodes.usage

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html"
	 */

	public UsageResponse usage(UsageRequest request) throws IOException {
		return this.transport.performRequest(request, UsageRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final UsageResponse usage(Function<UsageRequest.Builder, ObjectBuilder<UsageRequest>> fn)
			throws IOException {
		return usage(fn.apply(new UsageRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #NodesClient} with specific request options.
	 */
	@Override
	public NodesClient withRequestOptions(@Nullable RequestOptions options) {
		return new NodesClient(transport, options);
	}

	/**
	 * Creates a new {@link #NodesClient} with specific request options, inheriting
	 * existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public NodesClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
