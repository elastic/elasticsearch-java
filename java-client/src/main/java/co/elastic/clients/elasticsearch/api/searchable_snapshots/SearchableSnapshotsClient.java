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

package co.elastic.clients.elasticsearch.api.searchable_snapshots;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.searchable_snapshots.ClearCacheRequest;
import co.elastic.clients.elasticsearch.searchable_snapshots.ClearCacheResponse;
import co.elastic.clients.elasticsearch.searchable_snapshots.MountRequest;
import co.elastic.clients.elasticsearch.searchable_snapshots.MountResponse;
import co.elastic.clients.elasticsearch.searchable_snapshots.RepositoryStatsRequest;
import co.elastic.clients.elasticsearch.searchable_snapshots.RepositoryStatsResponse;
import co.elastic.clients.elasticsearch.searchable_snapshots.StatsRequest;
import co.elastic.clients.elasticsearch.searchable_snapshots.StatsResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the searchable_snapshots namespace.
 */
public class SearchableSnapshotsClient extends ApiClient<SearchableSnapshotsClient> {

	public SearchableSnapshotsClient(Transport transport) {
		super(transport, null);
	}

	public SearchableSnapshotsClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: searchable_snapshots.clear_cache

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException {
		return this.transport.performRequest(request, ClearCacheRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCacheResponse clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
			throws IOException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	// ----- Endpoint: searchable_snapshots.mount

	/**
	 * Mount a snapshot as a searchable index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-api-mount-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public MountResponse mount(MountRequest request) throws IOException {
		return this.transport.performRequest(request, MountRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Mount a snapshot as a searchable index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-api-mount-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MountResponse mount(Function<MountRequest.Builder, ObjectBuilder<MountRequest>> fn)
			throws IOException {
		return mount(fn.apply(new MountRequest.Builder()).build());
	}

	// ----- Endpoint: searchable_snapshots.repository_stats

	/**
	 * DEPRECATED: This API is replaced by the Repositories Metering API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public RepositoryStatsResponse repositoryStats(RepositoryStatsRequest request) throws IOException {
		return this.transport.performRequest(request, RepositoryStatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * DEPRECATED: This API is replaced by the Repositories Metering API.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RepositoryStatsResponse repositoryStats(
			Function<RepositoryStatsRequest.Builder, ObjectBuilder<RepositoryStatsRequest>> fn) throws IOException {
		return repositoryStats(fn.apply(new RepositoryStatsRequest.Builder()).build());
	}

	// ----- Endpoint: searchable_snapshots.stats

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public StatsResponse stats(StatsRequest request) throws IOException {
		return this.transport.performRequest(request, StatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StatsResponse stats(Function<StatsRequest.Builder, ObjectBuilder<StatsRequest>> fn)
			throws IOException {
		return stats(fn.apply(new StatsRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #SearchableSnapshotsClient} with specific request
	 * options.
	 */
	@Override
	public SearchableSnapshotsClient withRequestOptions(@Nullable RequestOptions options) {
		return new SearchableSnapshotsClient(transport, options);
	}

	/**
	 * Creates a new {@link #SearchableSnapshotsClient} with specific request
	 * options, inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public SearchableSnapshotsClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
