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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the searchable_snapshots namespace.
 */
public class ElasticsearchSearchableSnapshotsClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSearchableSnapshotsClient> {

	public ElasticsearchSearchableSnapshotsClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSearchableSnapshotsClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSearchableSnapshotsClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSearchableSnapshotsClient(this.transport, transportOptions);
	}

	// ----- Endpoint: searchable_snapshots.clear_cache

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse> endpoint = (Endpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse>) ClearCacheRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCacheRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCacheResponse clearCache(Consumer<ClearCacheRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ClearCacheRequest.Builder builder = new ClearCacheRequest.Builder();
		fn.accept(builder);
		return clearCache(builder.build());
	}

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ClearCacheRequest.Builder().build(), ClearCacheRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: searchable_snapshots.mount

	/**
	 * Mount a snapshot as a searchable index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-api-mount-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public MountResponse mount(MountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MountRequest, MountResponse, ErrorResponse> endpoint = (Endpoint<MountRequest, MountResponse, ErrorResponse>) MountRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Mount a snapshot as a searchable index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-api-mount-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MountResponse mount(Consumer<MountRequest.Builder> fn) throws IOException, ElasticsearchException {
		MountRequest.Builder builder = new MountRequest.Builder();
		fn.accept(builder);
		return mount(builder.build());
	}

	// ----- Endpoint: searchable_snapshots.stats

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public SearchableSnapshotsStatsResponse stats(SearchableSnapshotsStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SearchableSnapshotsStatsRequest, SearchableSnapshotsStatsResponse, ErrorResponse> endpoint = (Endpoint<SearchableSnapshotsStatsRequest, SearchableSnapshotsStatsResponse, ErrorResponse>) SearchableSnapshotsStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchableSnapshotsStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SearchableSnapshotsStatsResponse stats(Consumer<SearchableSnapshotsStatsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SearchableSnapshotsStatsRequest.Builder builder = new SearchableSnapshotsStatsRequest.Builder();
		fn.accept(builder);
		return stats(builder.build());
	}

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public SearchableSnapshotsStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SearchableSnapshotsStatsRequest.Builder().build(),
				SearchableSnapshotsStatsRequest._ENDPOINT, this.transportOptions);
	}

}
