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

package co.elastic.clients.elasticsearch.searchable_snapshots;

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
 * Client for the searchable_snapshots namespace.
 */
public class ElasticsearchSearchableSnapshotsAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSearchableSnapshotsAsyncClient> {

	public ElasticsearchSearchableSnapshotsAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSearchableSnapshotsAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSearchableSnapshotsAsyncClient withTransportOptions(
			@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSearchableSnapshotsAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: searchable_snapshots.cache_stats

	/**
	 * Get cache statistics. Get statistics about the shared cache for partially
	 * mounted indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-cache-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CacheStatsResponse> cacheStats(CacheStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CacheStatsRequest, CacheStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<CacheStatsRequest, CacheStatsResponse, ErrorResponse>) CacheStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get cache statistics. Get statistics about the shared cache for partially
	 * mounted indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CacheStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-cache-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CacheStatsResponse> cacheStats(
			Function<CacheStatsRequest.Builder, ObjectBuilder<CacheStatsRequest>> fn) {
		return cacheStats(fn.apply(new CacheStatsRequest.Builder()).build());
	}

	/**
	 * Get cache statistics. Get statistics about the shared cache for partially
	 * mounted indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-cache-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CacheStatsResponse> cacheStats() {
		return this.transport.performRequestAsync(new CacheStatsRequest.Builder().build(), CacheStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: searchable_snapshots.clear_cache

	/**
	 * Clear the cache. Clear indices and data streams from the shared cache for
	 * partially mounted indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-clear-cache">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse>) ClearCacheRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the cache. Clear indices and data streams from the shared cache for
	 * partially mounted indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCacheRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-clear-cache">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCacheResponse> clearCache(
			Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn) {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	/**
	 * Clear the cache. Clear indices and data streams from the shared cache for
	 * partially mounted indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-clear-cache">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCacheResponse> clearCache() {
		return this.transport.performRequestAsync(new ClearCacheRequest.Builder().build(), ClearCacheRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: searchable_snapshots.mount

	/**
	 * Mount a snapshot. Mount a snapshot as a searchable snapshot index. Do not use
	 * this API for snapshots managed by index lifecycle management (ILM). Manually
	 * mounting ILM-managed snapshots can interfere with ILM processes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-mount">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MountResponse> mount(MountRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MountRequest, MountResponse, ErrorResponse> endpoint = (JsonEndpoint<MountRequest, MountResponse, ErrorResponse>) MountRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Mount a snapshot. Mount a snapshot as a searchable snapshot index. Do not use
	 * this API for snapshots managed by index lifecycle management (ILM). Manually
	 * mounting ILM-managed snapshots can interfere with ILM processes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-mount">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MountResponse> mount(
			Function<MountRequest.Builder, ObjectBuilder<MountRequest>> fn) {
		return mount(fn.apply(new MountRequest.Builder()).build());
	}

	// ----- Endpoint: searchable_snapshots.stats

	/**
	 * Get searchable snapshot statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SearchableSnapshotsStatsResponse> stats(SearchableSnapshotsStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchableSnapshotsStatsRequest, SearchableSnapshotsStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<SearchableSnapshotsStatsRequest, SearchableSnapshotsStatsResponse, ErrorResponse>) SearchableSnapshotsStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get searchable snapshot statistics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchableSnapshotsStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SearchableSnapshotsStatsResponse> stats(
			Function<SearchableSnapshotsStatsRequest.Builder, ObjectBuilder<SearchableSnapshotsStatsRequest>> fn) {
		return stats(fn.apply(new SearchableSnapshotsStatsRequest.Builder()).build());
	}

	/**
	 * Get searchable snapshot statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-searchable-snapshots-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SearchableSnapshotsStatsResponse> stats() {
		return this.transport.performRequestAsync(new SearchableSnapshotsStatsRequest.Builder().build(),
				SearchableSnapshotsStatsRequest._ENDPOINT, this.transportOptions);
	}

}
