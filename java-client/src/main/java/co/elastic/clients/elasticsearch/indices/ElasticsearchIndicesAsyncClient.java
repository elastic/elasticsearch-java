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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
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
 * Client for the indices namespace.
 */
public class ElasticsearchIndicesAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchIndicesAsyncClient> {

	public ElasticsearchIndicesAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchIndicesAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchIndicesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchIndicesAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: indices.add_block

	/**
	 * Add an index block. Limits the operations allowed on an index by blocking
	 * specific operation types.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AddBlockResponse> addBlock(AddBlockRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AddBlockRequest, AddBlockResponse, ErrorResponse> endpoint = (JsonEndpoint<AddBlockRequest, AddBlockResponse, ErrorResponse>) AddBlockRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Add an index block. Limits the operations allowed on an index by blocking
	 * specific operation types.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AddBlockRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AddBlockResponse> addBlock(
			Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn) {
		return addBlock(fn.apply(new AddBlockRequest.Builder()).build());
	}

	// ----- Endpoint: indices.analyze

	/**
	 * Get tokens from text analysis. The analyze API performs <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis.html">analysis</a>
	 * on a text string and returns the resulting tokens.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AnalyzeResponse> analyze(AnalyzeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse> endpoint = (JsonEndpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse>) AnalyzeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get tokens from text analysis. The analyze API performs <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis.html">analysis</a>
	 * on a text string and returns the resulting tokens.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AnalyzeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AnalyzeResponse> analyze(
			Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn) {
		return analyze(fn.apply(new AnalyzeRequest.Builder()).build());
	}

	/**
	 * Get tokens from text analysis. The analyze API performs <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis.html">analysis</a>
	 * on a text string and returns the resulting tokens.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AnalyzeResponse> analyze() {
		return this.transport.performRequestAsync(new AnalyzeRequest.Builder().build(), AnalyzeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clear the cache. Clear the cache of one or more indices. For data streams,
	 * the API clears the caches of the stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse>) ClearCacheRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the cache. Clear the cache of one or more indices. For data streams,
	 * the API clears the caches of the stream's backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCacheRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCacheResponse> clearCache(
			Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn) {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	/**
	 * Clear the cache. Clear the cache of one or more indices. For data streams,
	 * the API clears the caches of the stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCacheResponse> clearCache() {
		return this.transport.performRequestAsync(new ClearCacheRequest.Builder().build(), ClearCacheRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.clone

	/**
	 * Clone an index. Clone an existing index into a new index. Each original
	 * primary shard is cloned into a new primary shard in the new index.
	 * <p>
	 * IMPORTANT: Elasticsearch does not apply index templates to the resulting
	 * index. The API also does not copy index metadata from the original index.
	 * Index metadata includes aliases, index lifecycle management phase
	 * definitions, and cross-cluster replication (CCR) follower information. For
	 * example, if you clone a CCR follower index, the resulting clone will not be a
	 * follower index.
	 * <p>
	 * The clone API copies most index settings from the source index to the
	 * resulting index, with the exception of <code>index.number_of_replicas</code>
	 * and <code>index.auto_expand_replicas</code>. To set the number of replicas in
	 * the resulting index, configure these settings in the clone request.
	 * <p>
	 * Cloning works as follows:
	 * <ul>
	 * <li>First, it creates a new target index with the same definition as the
	 * source index.</li>
	 * <li>Then it hard-links segments from the source index into the target index.
	 * If the file system does not support hard-linking, all segments are copied
	 * into the new index, which is a much more time consuming process.</li>
	 * <li>Finally, it recovers the target index as though it were a closed index
	 * which had just been re-opened.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: Indices can only be cloned if they meet the following
	 * requirements:
	 * <ul>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have the same number of primary shards as the
	 * target index.</li>
	 * <li>The node handling the clone process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CloneIndexResponse> clone(CloneIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloneIndexRequest, CloneIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<CloneIndexRequest, CloneIndexResponse, ErrorResponse>) CloneIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clone an index. Clone an existing index into a new index. Each original
	 * primary shard is cloned into a new primary shard in the new index.
	 * <p>
	 * IMPORTANT: Elasticsearch does not apply index templates to the resulting
	 * index. The API also does not copy index metadata from the original index.
	 * Index metadata includes aliases, index lifecycle management phase
	 * definitions, and cross-cluster replication (CCR) follower information. For
	 * example, if you clone a CCR follower index, the resulting clone will not be a
	 * follower index.
	 * <p>
	 * The clone API copies most index settings from the source index to the
	 * resulting index, with the exception of <code>index.number_of_replicas</code>
	 * and <code>index.auto_expand_replicas</code>. To set the number of replicas in
	 * the resulting index, configure these settings in the clone request.
	 * <p>
	 * Cloning works as follows:
	 * <ul>
	 * <li>First, it creates a new target index with the same definition as the
	 * source index.</li>
	 * <li>Then it hard-links segments from the source index into the target index.
	 * If the file system does not support hard-linking, all segments are copied
	 * into the new index, which is a much more time consuming process.</li>
	 * <li>Finally, it recovers the target index as though it were a closed index
	 * which had just been re-opened.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: Indices can only be cloned if they meet the following
	 * requirements:
	 * <ul>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have the same number of primary shards as the
	 * target index.</li>
	 * <li>The node handling the clone process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloneIndexResponse> clone(
			Function<CloneIndexRequest.Builder, ObjectBuilder<CloneIndexRequest>> fn) {
		return clone(fn.apply(new CloneIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.close

	/**
	 * Close an index. A closed index is blocked for read or write operations and
	 * does not allow all operations that opened indices allow. It is not possible
	 * to index documents or to search for documents in a closed index. Closed
	 * indices do not have to maintain internal data structures for indexing or
	 * searching documents, which results in a smaller overhead on the cluster.
	 * <p>
	 * When opening or closing an index, the master node is responsible for
	 * restarting the index shards to reflect the new state of the index. The shards
	 * will then go through the normal recovery process. The data of opened and
	 * closed indices is automatically replicated by the cluster to ensure that
	 * enough shard copies are safely kept around at all times.
	 * <p>
	 * You can open and close multiple indices. An error is thrown if the request
	 * explicitly refers to a missing index. This behaviour can be turned off using
	 * the <code>ignore_unavailable=true</code> parameter.
	 * <p>
	 * By default, you must explicitly name the indices you are opening or closing.
	 * To open or close indices with <code>_all</code>, <code>*</code>, or other
	 * wildcard expressions, change
	 * the<code> action.destructive_requires_name</code> setting to
	 * <code>false</code>. This setting can also be changed with the cluster update
	 * settings API.
	 * <p>
	 * Closed indices consume a significant amount of disk-space which can cause
	 * problems in managed environments. Closing indices can be turned off with the
	 * cluster settings API by setting <code>cluster.indices.close.enable</code> to
	 * <code>false</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CloseIndexResponse> close(CloseIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloseIndexRequest, CloseIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<CloseIndexRequest, CloseIndexResponse, ErrorResponse>) CloseIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Close an index. A closed index is blocked for read or write operations and
	 * does not allow all operations that opened indices allow. It is not possible
	 * to index documents or to search for documents in a closed index. Closed
	 * indices do not have to maintain internal data structures for indexing or
	 * searching documents, which results in a smaller overhead on the cluster.
	 * <p>
	 * When opening or closing an index, the master node is responsible for
	 * restarting the index shards to reflect the new state of the index. The shards
	 * will then go through the normal recovery process. The data of opened and
	 * closed indices is automatically replicated by the cluster to ensure that
	 * enough shard copies are safely kept around at all times.
	 * <p>
	 * You can open and close multiple indices. An error is thrown if the request
	 * explicitly refers to a missing index. This behaviour can be turned off using
	 * the <code>ignore_unavailable=true</code> parameter.
	 * <p>
	 * By default, you must explicitly name the indices you are opening or closing.
	 * To open or close indices with <code>_all</code>, <code>*</code>, or other
	 * wildcard expressions, change
	 * the<code> action.destructive_requires_name</code> setting to
	 * <code>false</code>. This setting can also be changed with the cluster update
	 * settings API.
	 * <p>
	 * Closed indices consume a significant amount of disk-space which can cause
	 * problems in managed environments. Closing indices can be turned off with the
	 * cluster settings API by setting <code>cluster.indices.close.enable</code> to
	 * <code>false</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloseIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloseIndexResponse> close(
			Function<CloseIndexRequest.Builder, ObjectBuilder<CloseIndexRequest>> fn) {
		return close(fn.apply(new CloseIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Create an index. Creates a new index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-create-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateIndexResponse> create(CreateIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateIndexRequest, CreateIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateIndexRequest, CreateIndexResponse, ErrorResponse>) CreateIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an index. Creates a new index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-create-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateIndexResponse> create(
			Function<CreateIndexRequest.Builder, ObjectBuilder<CreateIndexRequest>> fn) {
		return create(fn.apply(new CreateIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create_data_stream

	/**
	 * Create a data stream. Creates a data stream. You must have a matching index
	 * template with data stream enabled.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateDataStreamRequest, CreateDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateDataStreamRequest, CreateDataStreamResponse, ErrorResponse>) CreateDataStreamRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a data stream. Creates a data stream. You must have a matching index
	 * template with data stream enabled.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateDataStreamResponse> createDataStream(
			Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn) {
		return createDataStream(fn.apply(new CreateDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.data_streams_stats

	/**
	 * Get data stream stats. Retrieves statistics for one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(DataStreamsStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DataStreamsStatsRequest, DataStreamsStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<DataStreamsStatsRequest, DataStreamsStatsResponse, ErrorResponse>) DataStreamsStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data stream stats. Retrieves statistics for one or more data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DataStreamsStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(
			Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn) {
		return dataStreamsStats(fn.apply(new DataStreamsStatsRequest.Builder()).build());
	}

	/**
	 * Get data stream stats. Retrieves statistics for one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DataStreamsStatsResponse> dataStreamsStats() {
		return this.transport.performRequestAsync(new DataStreamsStatsRequest.Builder().build(),
				DataStreamsStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.delete

	/**
	 * Delete indices. Deletes one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteIndexResponse> delete(DeleteIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteIndexRequest, DeleteIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteIndexRequest, DeleteIndexResponse, ErrorResponse>) DeleteIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete indices. Deletes one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteIndexResponse> delete(
			Function<DeleteIndexRequest.Builder, ObjectBuilder<DeleteIndexRequest>> fn) {
		return delete(fn.apply(new DeleteIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Delete an alias. Removes a data stream or index from an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAliasRequest, DeleteAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAliasRequest, DeleteAliasResponse, ErrorResponse>) DeleteAliasRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an alias. Removes a data stream or index from an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAliasResponse> deleteAlias(
			Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn) {
		return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_lifecycle

	/**
	 * Delete data stream lifecycles. Removes the data stream lifecycle from a data
	 * stream, rendering it not managed by the data stream lifecycle.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams-delete-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteDataLifecycleResponse> deleteDataLifecycle(DeleteDataLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDataLifecycleRequest, DeleteDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDataLifecycleRequest, DeleteDataLifecycleResponse, ErrorResponse>) DeleteDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete data stream lifecycles. Removes the data stream lifecycle from a data
	 * stream, rendering it not managed by the data stream lifecycle.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams-delete-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDataLifecycleResponse> deleteDataLifecycle(
			Function<DeleteDataLifecycleRequest.Builder, ObjectBuilder<DeleteDataLifecycleRequest>> fn) {
		return deleteDataLifecycle(fn.apply(new DeleteDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_stream

	/**
	 * Delete data streams. Deletes one or more data streams and their backing
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDataStreamRequest, DeleteDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDataStreamRequest, DeleteDataStreamResponse, ErrorResponse>) DeleteDataStreamRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete data streams. Deletes one or more data streams and their backing
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDataStreamResponse> deleteDataStream(
			Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn) {
		return deleteDataStream(fn.apply(new DeleteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_index_template

	/**
	 * Delete an index template. The provided &lt;index-template&gt; may contain
	 * multiple template names separated by a comma. If multiple template names are
	 * specified then there is no wildcard support and the provided names should
	 * match completely with existing templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteIndexTemplateRequest, DeleteIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteIndexTemplateRequest, DeleteIndexTemplateResponse, ErrorResponse>) DeleteIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an index template. The provided &lt;index-template&gt; may contain
	 * multiple template names separated by a comma. If multiple template names are
	 * specified then there is no wildcard support and the provided names should
	 * match completely with existing templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(
			Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn) {
		return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Deletes a legacy index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-template-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteTemplateRequest, DeleteTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteTemplateRequest, DeleteTemplateResponse, ErrorResponse>) DeleteTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a legacy index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-template-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteTemplateResponse> deleteTemplate(
			Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn) {
		return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.disk_usage

	/**
	 * Analyze the index disk usage. Analyze the disk usage of each field of an
	 * index or data stream. This API might not support indices created in previous
	 * Elasticsearch versions. The result of a small index can be inaccurate as some
	 * parts of an index might not be analyzed by the API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-disk-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DiskUsageResponse> diskUsage(DiskUsageRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DiskUsageRequest, DiskUsageResponse, ErrorResponse> endpoint = (JsonEndpoint<DiskUsageRequest, DiskUsageResponse, ErrorResponse>) DiskUsageRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Analyze the index disk usage. Analyze the disk usage of each field of an
	 * index or data stream. This API might not support indices created in previous
	 * Elasticsearch versions. The result of a small index can be inaccurate as some
	 * parts of an index might not be analyzed by the API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DiskUsageRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-disk-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DiskUsageResponse> diskUsage(
			Function<DiskUsageRequest.Builder, ObjectBuilder<DiskUsageRequest>> fn) {
		return diskUsage(fn.apply(new DiskUsageRequest.Builder()).build());
	}

	// ----- Endpoint: indices.downsample

	/**
	 * Downsample an index. Aggregate a time series (TSDS) index and store
	 * pre-computed statistical summaries (<code>min</code>, <code>max</code>,
	 * <code>sum</code>, <code>value_count</code> and <code>avg</code>) for each
	 * metric field grouped by a configured time interval. For example, a TSDS index
	 * that contains metrics sampled every 10 seconds can be downsampled to an
	 * hourly index. All documents within an hour interval are summarized and stored
	 * as a single document in the downsample index.
	 * <p>
	 * NOTE: Only indices in a time series data stream are supported. Neither field
	 * nor document level security can be defined on the source index. The source
	 * index must be read only (<code>index.blocks.write: true</code>).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-downsample-data-stream.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DownsampleResponse> downsample(DownsampleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DownsampleRequest, DownsampleResponse, ErrorResponse> endpoint = (JsonEndpoint<DownsampleRequest, DownsampleResponse, ErrorResponse>) DownsampleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Downsample an index. Aggregate a time series (TSDS) index and store
	 * pre-computed statistical summaries (<code>min</code>, <code>max</code>,
	 * <code>sum</code>, <code>value_count</code> and <code>avg</code>) for each
	 * metric field grouped by a configured time interval. For example, a TSDS index
	 * that contains metrics sampled every 10 seconds can be downsampled to an
	 * hourly index. All documents within an hour interval are summarized and stored
	 * as a single document in the downsample index.
	 * <p>
	 * NOTE: Only indices in a time series data stream are supported. Neither field
	 * nor document level security can be defined on the source index. The source
	 * index must be read only (<code>index.blocks.write: true</code>).
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DownsampleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-downsample-data-stream.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DownsampleResponse> downsample(
			Function<DownsampleRequest.Builder, ObjectBuilder<DownsampleRequest>> fn) {
		return downsample(fn.apply(new DownsampleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Check indices. Checks if one or more indices, index aliases, or data streams
	 * exist.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> exists(ExistsRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsRequest, BooleanResponse, ErrorResponse>) ExistsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check indices. Checks if one or more indices, index aliases, or data streams
	 * exist.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> exists(
			Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn) {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Check aliases. Checks if one or more data stream or index aliases exist.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsAlias(ExistsAliasRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsAliasRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsAliasRequest, BooleanResponse, ErrorResponse>) ExistsAliasRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check aliases. Checks if one or more data stream or index aliases exist.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsAlias(
			Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn) {
		return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Check index templates. Check whether index templates exist.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsIndexTemplate(ExistsIndexTemplateRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsIndexTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsIndexTemplateRequest, BooleanResponse, ErrorResponse>) ExistsIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check index templates. Check whether index templates exist.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsIndexTemplate(
			Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn) {
		return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Check existence of index templates. Returns information about whether a
	 * particular index template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-template-exists-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsTemplate(ExistsTemplateRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsTemplateRequest, BooleanResponse, ErrorResponse>) ExistsTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check existence of index templates. Returns information about whether a
	 * particular index template exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-template-exists-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsTemplate(
			Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn) {
		return existsTemplate(fn.apply(new ExistsTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.explain_data_lifecycle

	/**
	 * Get the status for a data stream lifecycle. Get information about an index or
	 * data stream's current data stream lifecycle status, such as time since index
	 * creation, time since rollover, the lifecycle configuration managing the
	 * index, or any errors encountered during lifecycle execution.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/data-streams-explain-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExplainDataLifecycleResponse> explainDataLifecycle(ExplainDataLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainDataLifecycleRequest, ExplainDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<ExplainDataLifecycleRequest, ExplainDataLifecycleResponse, ErrorResponse>) ExplainDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the status for a data stream lifecycle. Get information about an index or
	 * data stream's current data stream lifecycle status, such as time since index
	 * creation, time since rollover, the lifecycle configuration managing the
	 * index, or any errors encountered during lifecycle execution.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainDataLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/data-streams-explain-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExplainDataLifecycleResponse> explainDataLifecycle(
			Function<ExplainDataLifecycleRequest.Builder, ObjectBuilder<ExplainDataLifecycleRequest>> fn) {
		return explainDataLifecycle(fn.apply(new ExplainDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.field_usage_stats

	/**
	 * Get field usage stats. Get field usage information for each shard and field
	 * of an index. Field usage statistics are automatically captured when queries
	 * are running on a cluster. A shard-level search request that accesses a given
	 * field, even if multiple times during that request, is counted as a single
	 * use.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/field-usage-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FieldUsageStatsResponse> fieldUsageStats(FieldUsageStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FieldUsageStatsRequest, FieldUsageStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<FieldUsageStatsRequest, FieldUsageStatsResponse, ErrorResponse>) FieldUsageStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get field usage stats. Get field usage information for each shard and field
	 * of an index. Field usage statistics are automatically captured when queries
	 * are running on a cluster. A shard-level search request that accesses a given
	 * field, even if multiple times during that request, is counted as a single
	 * use.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FieldUsageStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/field-usage-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FieldUsageStatsResponse> fieldUsageStats(
			Function<FieldUsageStatsRequest.Builder, ObjectBuilder<FieldUsageStatsRequest>> fn) {
		return fieldUsageStats(fn.apply(new FieldUsageStatsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush

	/**
	 * Flush data streams or indices. Flushing a data stream or index is the process
	 * of making sure that any data that is currently only stored in the transaction
	 * log is also permanently stored in the Lucene index. When restarting,
	 * Elasticsearch replays any unflushed operations from the transaction log into
	 * the Lucene index to bring it back into the state that it was in before the
	 * restart. Elasticsearch automatically triggers flushes as needed, using
	 * heuristics that trade off the size of the unflushed transaction log against
	 * the cost of performing each flush.
	 * <p>
	 * After each operation has been flushed it is permanently stored in the Lucene
	 * index. This may mean that there is no need to maintain an additional copy of
	 * it in the transaction log. The transaction log is made up of multiple files,
	 * called generations, and Elasticsearch will delete any generation files when
	 * they are no longer needed, freeing up disk space.
	 * <p>
	 * It is also possible to trigger a flush on one or more indices using the flush
	 * API, although it is rare for users to need to call this API directly. If you
	 * call the flush API after indexing some documents then a successful response
	 * indicates that Elasticsearch has flushed all the documents that were indexed
	 * before the flush API was called.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FlushResponse> flush(FlushRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FlushRequest, FlushResponse, ErrorResponse> endpoint = (JsonEndpoint<FlushRequest, FlushResponse, ErrorResponse>) FlushRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Flush data streams or indices. Flushing a data stream or index is the process
	 * of making sure that any data that is currently only stored in the transaction
	 * log is also permanently stored in the Lucene index. When restarting,
	 * Elasticsearch replays any unflushed operations from the transaction log into
	 * the Lucene index to bring it back into the state that it was in before the
	 * restart. Elasticsearch automatically triggers flushes as needed, using
	 * heuristics that trade off the size of the unflushed transaction log against
	 * the cost of performing each flush.
	 * <p>
	 * After each operation has been flushed it is permanently stored in the Lucene
	 * index. This may mean that there is no need to maintain an additional copy of
	 * it in the transaction log. The transaction log is made up of multiple files,
	 * called generations, and Elasticsearch will delete any generation files when
	 * they are no longer needed, freeing up disk space.
	 * <p>
	 * It is also possible to trigger a flush on one or more indices using the flush
	 * API, although it is rare for users to need to call this API directly. If you
	 * call the flush API after indexing some documents then a successful response
	 * indicates that Elasticsearch has flushed all the documents that were indexed
	 * before the flush API was called.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FlushRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FlushResponse> flush(
			Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn) {
		return flush(fn.apply(new FlushRequest.Builder()).build());
	}

	/**
	 * Flush data streams or indices. Flushing a data stream or index is the process
	 * of making sure that any data that is currently only stored in the transaction
	 * log is also permanently stored in the Lucene index. When restarting,
	 * Elasticsearch replays any unflushed operations from the transaction log into
	 * the Lucene index to bring it back into the state that it was in before the
	 * restart. Elasticsearch automatically triggers flushes as needed, using
	 * heuristics that trade off the size of the unflushed transaction log against
	 * the cost of performing each flush.
	 * <p>
	 * After each operation has been flushed it is permanently stored in the Lucene
	 * index. This may mean that there is no need to maintain an additional copy of
	 * it in the transaction log. The transaction log is made up of multiple files,
	 * called generations, and Elasticsearch will delete any generation files when
	 * they are no longer needed, freeing up disk space.
	 * <p>
	 * It is also possible to trigger a flush on one or more indices using the flush
	 * API, although it is rare for users to need to call this API directly. If you
	 * call the flush API after indexing some documents then a successful response
	 * indicates that Elasticsearch has flushed all the documents that were indexed
	 * before the flush API was called.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FlushResponse> flush() {
		return this.transport.performRequestAsync(new FlushRequest.Builder().build(), FlushRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.forcemerge

	/**
	 * Force a merge. Perform the force merge operation on the shards of one or more
	 * indices. For data streams, the API forces a merge on the shards of the
	 * stream's backing indices.
	 * <p>
	 * Merging reduces the number of segments in each shard by merging some of them
	 * together and also frees up the space used by deleted documents. Merging
	 * normally happens automatically, but sometimes it is useful to trigger a merge
	 * manually.
	 * <p>
	 * WARNING: We recommend force merging only a read-only index (meaning the index
	 * is no longer receiving writes). When documents are updated or deleted, the
	 * old version is not immediately removed but instead soft-deleted and marked
	 * with a &quot;tombstone&quot;. These soft-deleted documents are automatically
	 * cleaned up during regular segment merges. But force merge can cause very
	 * large (greater than 5 GB) segments to be produced, which are not eligible for
	 * regular merges. So the number of soft-deleted documents can then grow
	 * rapidly, resulting in higher disk usage and worse search performance. If you
	 * regularly force merge an index receiving writes, this can also make snapshots
	 * more expensive, since the new documents can't be backed up incrementally.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ForcemergeResponse> forcemerge(ForcemergeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ForcemergeRequest, ForcemergeResponse, ErrorResponse> endpoint = (JsonEndpoint<ForcemergeRequest, ForcemergeResponse, ErrorResponse>) ForcemergeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Force a merge. Perform the force merge operation on the shards of one or more
	 * indices. For data streams, the API forces a merge on the shards of the
	 * stream's backing indices.
	 * <p>
	 * Merging reduces the number of segments in each shard by merging some of them
	 * together and also frees up the space used by deleted documents. Merging
	 * normally happens automatically, but sometimes it is useful to trigger a merge
	 * manually.
	 * <p>
	 * WARNING: We recommend force merging only a read-only index (meaning the index
	 * is no longer receiving writes). When documents are updated or deleted, the
	 * old version is not immediately removed but instead soft-deleted and marked
	 * with a &quot;tombstone&quot;. These soft-deleted documents are automatically
	 * cleaned up during regular segment merges. But force merge can cause very
	 * large (greater than 5 GB) segments to be produced, which are not eligible for
	 * regular merges. So the number of soft-deleted documents can then grow
	 * rapidly, resulting in higher disk usage and worse search performance. If you
	 * regularly force merge an index receiving writes, this can also make snapshots
	 * more expensive, since the new documents can't be backed up incrementally.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForcemergeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ForcemergeResponse> forcemerge(
			Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn) {
		return forcemerge(fn.apply(new ForcemergeRequest.Builder()).build());
	}

	/**
	 * Force a merge. Perform the force merge operation on the shards of one or more
	 * indices. For data streams, the API forces a merge on the shards of the
	 * stream's backing indices.
	 * <p>
	 * Merging reduces the number of segments in each shard by merging some of them
	 * together and also frees up the space used by deleted documents. Merging
	 * normally happens automatically, but sometimes it is useful to trigger a merge
	 * manually.
	 * <p>
	 * WARNING: We recommend force merging only a read-only index (meaning the index
	 * is no longer receiving writes). When documents are updated or deleted, the
	 * old version is not immediately removed but instead soft-deleted and marked
	 * with a &quot;tombstone&quot;. These soft-deleted documents are automatically
	 * cleaned up during regular segment merges. But force merge can cause very
	 * large (greater than 5 GB) segments to be produced, which are not eligible for
	 * regular merges. So the number of soft-deleted documents can then grow
	 * rapidly, resulting in higher disk usage and worse search performance. If you
	 * regularly force merge an index receiving writes, this can also make snapshots
	 * more expensive, since the new documents can't be backed up incrementally.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ForcemergeResponse> forcemerge() {
		return this.transport.performRequestAsync(new ForcemergeRequest.Builder().build(), ForcemergeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get

	/**
	 * Get index information. Returns information about one or more indices. For
	 * data streams, the API returns information about the stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndexResponse> get(GetIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetIndexRequest, GetIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<GetIndexRequest, GetIndexResponse, ErrorResponse>) GetIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index information. Returns information about one or more indices. For
	 * data streams, the API returns information about the stream’s backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetIndexResponse> get(
			Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn) {
		return get(fn.apply(new GetIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Get aliases. Retrieves information for one or more data stream or index
	 * aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAliasRequest, GetAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAliasRequest, GetAliasResponse, ErrorResponse>) GetAliasRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get aliases. Retrieves information for one or more data stream or index
	 * aliases.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAliasResponse> getAlias(
			Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn) {
		return getAlias(fn.apply(new GetAliasRequest.Builder()).build());
	}

	/**
	 * Get aliases. Retrieves information for one or more data stream or index
	 * aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAliasResponse> getAlias() {
		return this.transport.performRequestAsync(new GetAliasRequest.Builder().build(), GetAliasRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_data_lifecycle

	/**
	 * Get data stream lifecycles. Retrieves the data stream lifecycle configuration
	 * of one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams-get-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataLifecycleResponse> getDataLifecycle(GetDataLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDataLifecycleRequest, GetDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDataLifecycleRequest, GetDataLifecycleResponse, ErrorResponse>) GetDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data stream lifecycles. Retrieves the data stream lifecycle configuration
	 * of one or more data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams-get-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDataLifecycleResponse> getDataLifecycle(
			Function<GetDataLifecycleRequest.Builder, ObjectBuilder<GetDataLifecycleRequest>> fn) {
		return getDataLifecycle(fn.apply(new GetDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_data_stream

	/**
	 * Get data streams. Retrieves information about one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataStreamResponse> getDataStream(GetDataStreamRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDataStreamRequest, GetDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDataStreamRequest, GetDataStreamResponse, ErrorResponse>) GetDataStreamRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data streams. Retrieves information about one or more data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDataStreamResponse> getDataStream(
			Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn) {
		return getDataStream(fn.apply(new GetDataStreamRequest.Builder()).build());
	}

	/**
	 * Get data streams. Retrieves information about one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataStreamResponse> getDataStream() {
		return this.transport.performRequestAsync(new GetDataStreamRequest.Builder().build(),
				GetDataStreamRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Get mapping definitions. Retrieves mapping definitions for one or more
	 * fields. For data streams, the API retrieves field mappings for the stream’s
	 * backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetFieldMappingResponse> getFieldMapping(GetFieldMappingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetFieldMappingRequest, GetFieldMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetFieldMappingRequest, GetFieldMappingResponse, ErrorResponse>) GetFieldMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get mapping definitions. Retrieves mapping definitions for one or more
	 * fields. For data streams, the API retrieves field mappings for the stream’s
	 * backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetFieldMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetFieldMappingResponse> getFieldMapping(
			Function<GetFieldMappingRequest.Builder, ObjectBuilder<GetFieldMappingRequest>> fn) {
		return getFieldMapping(fn.apply(new GetFieldMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Get index templates. Returns information about one or more index templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(GetIndexTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetIndexTemplateRequest, GetIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<GetIndexTemplateRequest, GetIndexTemplateResponse, ErrorResponse>) GetIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index templates. Returns information about one or more index templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(
			Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn) {
		return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build());
	}

	/**
	 * Get index templates. Returns information about one or more index templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndexTemplateResponse> getIndexTemplate() {
		return this.transport.performRequestAsync(new GetIndexTemplateRequest.Builder().build(),
				GetIndexTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Get mapping definitions. Retrieves mapping definitions for one or more
	 * indices. For data streams, the API retrieves mappings for the stream’s
	 * backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetMappingResponse> getMapping(GetMappingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetMappingRequest, GetMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetMappingRequest, GetMappingResponse, ErrorResponse>) GetMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get mapping definitions. Retrieves mapping definitions for one or more
	 * indices. For data streams, the API retrieves mappings for the stream’s
	 * backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetMappingResponse> getMapping(
			Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn) {
		return getMapping(fn.apply(new GetMappingRequest.Builder()).build());
	}

	/**
	 * Get mapping definitions. Retrieves mapping definitions for one or more
	 * indices. For data streams, the API retrieves mappings for the stream’s
	 * backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetMappingResponse> getMapping() {
		return this.transport.performRequestAsync(new GetMappingRequest.Builder().build(), GetMappingRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Get index settings. Returns setting information for one or more indices. For
	 * data streams, returns setting information for the stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndicesSettingsResponse> getSettings(GetIndicesSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetIndicesSettingsRequest, GetIndicesSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetIndicesSettingsRequest, GetIndicesSettingsResponse, ErrorResponse>) GetIndicesSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index settings. Returns setting information for one or more indices. For
	 * data streams, returns setting information for the stream’s backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndicesSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetIndicesSettingsResponse> getSettings(
			Function<GetIndicesSettingsRequest.Builder, ObjectBuilder<GetIndicesSettingsRequest>> fn) {
		return getSettings(fn.apply(new GetIndicesSettingsRequest.Builder()).build());
	}

	/**
	 * Get index settings. Returns setting information for one or more indices. For
	 * data streams, returns setting information for the stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndicesSettingsResponse> getSettings() {
		return this.transport.performRequestAsync(new GetIndicesSettingsRequest.Builder().build(),
				GetIndicesSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Get index templates. Retrieves information about one or more index templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-template-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTemplateRequest, GetTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTemplateRequest, GetTemplateResponse, ErrorResponse>) GetTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index templates. Retrieves information about one or more index templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-template-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTemplateResponse> getTemplate(
			Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn) {
		return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build());
	}

	/**
	 * Get index templates. Retrieves information about one or more index templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-template-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTemplateResponse> getTemplate() {
		return this.transport.performRequestAsync(new GetTemplateRequest.Builder().build(),
				GetTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.migrate_to_data_stream

	/**
	 * Convert an index alias to a data stream. Converts an index alias to a data
	 * stream. You must have a matching index template that is data stream enabled.
	 * The alias must meet the following criteria: The alias must have a write
	 * index; All indices for the alias must have a <code>@timestamp</code> field
	 * mapping of a <code>date</code> or <code>date_nanos</code> field type; The
	 * alias must not have any filters; The alias must not use custom routing. If
	 * successful, the request removes the alias and creates a data stream with the
	 * same name. The indices for the alias become hidden backing indices for the
	 * stream. The write index for the alias becomes the write index for the stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MigrateToDataStreamResponse> migrateToDataStream(MigrateToDataStreamRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MigrateToDataStreamRequest, MigrateToDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<MigrateToDataStreamRequest, MigrateToDataStreamResponse, ErrorResponse>) MigrateToDataStreamRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Convert an index alias to a data stream. Converts an index alias to a data
	 * stream. You must have a matching index template that is data stream enabled.
	 * The alias must meet the following criteria: The alias must have a write
	 * index; All indices for the alias must have a <code>@timestamp</code> field
	 * mapping of a <code>date</code> or <code>date_nanos</code> field type; The
	 * alias must not have any filters; The alias must not use custom routing. If
	 * successful, the request removes the alias and creates a data stream with the
	 * same name. The indices for the alias become hidden backing indices for the
	 * stream. The write index for the alias becomes the write index for the stream.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MigrateToDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MigrateToDataStreamResponse> migrateToDataStream(
			Function<MigrateToDataStreamRequest.Builder, ObjectBuilder<MigrateToDataStreamRequest>> fn) {
		return migrateToDataStream(fn.apply(new MigrateToDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.modify_data_stream

	/**
	 * Update data streams. Performs one or more data stream modification actions in
	 * a single atomic operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ModifyDataStreamResponse> modifyDataStream(ModifyDataStreamRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ModifyDataStreamRequest, ModifyDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<ModifyDataStreamRequest, ModifyDataStreamResponse, ErrorResponse>) ModifyDataStreamRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update data streams. Performs one or more data stream modification actions in
	 * a single atomic operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ModifyDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ModifyDataStreamResponse> modifyDataStream(
			Function<ModifyDataStreamRequest.Builder, ObjectBuilder<ModifyDataStreamRequest>> fn) {
		return modifyDataStream(fn.apply(new ModifyDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.open

	/**
	 * Opens a closed index. For data streams, the API opens any closed backing
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<OpenResponse> open(OpenRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OpenRequest, OpenResponse, ErrorResponse> endpoint = (JsonEndpoint<OpenRequest, OpenResponse, ErrorResponse>) OpenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Opens a closed index. For data streams, the API opens any closed backing
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<OpenResponse> open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn) {
		return open(fn.apply(new OpenRequest.Builder()).build());
	}

	// ----- Endpoint: indices.promote_data_stream

	/**
	 * Promote a data stream. Promote a data stream from a replicated data stream
	 * managed by cross-cluster replication (CCR) to a regular data stream.
	 * <p>
	 * With CCR auto following, a data stream from a remote cluster can be
	 * replicated to the local cluster. These data streams can't be rolled over in
	 * the local cluster. These replicated data streams roll over only if the
	 * upstream data stream rolls over. In the event that the remote cluster is no
	 * longer available, the data stream in the local cluster can be promoted to a
	 * regular data stream, which allows these data streams to be rolled over in the
	 * local cluster.
	 * <p>
	 * NOTE: When promoting a data stream, ensure the local cluster has a data
	 * stream enabled index template that matches the data stream. If this is
	 * missing, the data stream will not be able to roll over until a matching index
	 * template is created. This will affect the lifecycle management of the data
	 * stream and interfere with the data stream size and retention.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PromoteDataStreamResponse> promoteDataStream(PromoteDataStreamRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PromoteDataStreamRequest, PromoteDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<PromoteDataStreamRequest, PromoteDataStreamResponse, ErrorResponse>) PromoteDataStreamRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Promote a data stream. Promote a data stream from a replicated data stream
	 * managed by cross-cluster replication (CCR) to a regular data stream.
	 * <p>
	 * With CCR auto following, a data stream from a remote cluster can be
	 * replicated to the local cluster. These data streams can't be rolled over in
	 * the local cluster. These replicated data streams roll over only if the
	 * upstream data stream rolls over. In the event that the remote cluster is no
	 * longer available, the data stream in the local cluster can be promoted to a
	 * regular data stream, which allows these data streams to be rolled over in the
	 * local cluster.
	 * <p>
	 * NOTE: When promoting a data stream, ensure the local cluster has a data
	 * stream enabled index template that matches the data stream. If this is
	 * missing, the data stream will not be able to roll over until a matching index
	 * template is created. This will affect the lifecycle management of the data
	 * stream and interfere with the data stream size and retention.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PromoteDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PromoteDataStreamResponse> promoteDataStream(
			Function<PromoteDataStreamRequest.Builder, ObjectBuilder<PromoteDataStreamRequest>> fn) {
		return promoteDataStream(fn.apply(new PromoteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutAliasResponse> putAlias(PutAliasRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAliasRequest, PutAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAliasRequest, PutAliasResponse, ErrorResponse>) PutAliasRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutAliasResponse> putAlias(
			Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn) {
		return putAlias(fn.apply(new PutAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_data_lifecycle

	/**
	 * Update data stream lifecycles. Update the data stream lifecycle of the
	 * specified data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams-put-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutDataLifecycleResponse> putDataLifecycle(PutDataLifecycleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutDataLifecycleRequest, PutDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutDataLifecycleRequest, PutDataLifecycleResponse, ErrorResponse>) PutDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update data stream lifecycles. Update the data stream lifecycle of the
	 * specified data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutDataLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams-put-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutDataLifecycleResponse> putDataLifecycle(
			Function<PutDataLifecycleRequest.Builder, ObjectBuilder<PutDataLifecycleRequest>> fn) {
		return putDataLifecycle(fn.apply(new PutDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Create or update an index template. Index templates define settings,
	 * mappings, and aliases that can be applied automatically to new indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(PutIndexTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse>) PutIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an index template. Index templates define settings,
	 * mappings, and aliases that can be applied automatically to new indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(
			Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn) {
		return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Update field mappings. Adds new fields to an existing data stream or index.
	 * You can also use this API to change the search settings of existing fields.
	 * For data streams, these changes are applied to all backing indices by
	 * default.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutMappingResponse> putMapping(PutMappingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutMappingRequest, PutMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<PutMappingRequest, PutMappingResponse, ErrorResponse>) PutMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update field mappings. Adds new fields to an existing data stream or index.
	 * You can also use this API to change the search settings of existing fields.
	 * For data streams, these changes are applied to all backing indices by
	 * default.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutMappingResponse> putMapping(
			Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn) {
		return putMapping(fn.apply(new PutMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Update index settings. Changes dynamic index settings in real time. For data
	 * streams, index setting changes are applied to all backing indices by default.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutIndicesSettingsResponse> putSettings(PutIndicesSettingsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutIndicesSettingsRequest, PutIndicesSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutIndicesSettingsRequest, PutIndicesSettingsResponse, ErrorResponse>) PutIndicesSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update index settings. Changes dynamic index settings in real time. For data
	 * streams, index setting changes are applied to all backing indices by default.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIndicesSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutIndicesSettingsResponse> putSettings(
			Function<PutIndicesSettingsRequest.Builder, ObjectBuilder<PutIndicesSettingsRequest>> fn) {
		return putSettings(fn.apply(new PutIndicesSettingsRequest.Builder()).build());
	}

	/**
	 * Update index settings. Changes dynamic index settings in real time. For data
	 * streams, index setting changes are applied to all backing indices by default.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutIndicesSettingsResponse> putSettings() {
		return this.transport.performRequestAsync(new PutIndicesSettingsRequest.Builder().build(),
				PutIndicesSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Create or update an index template. Index templates define settings,
	 * mappings, and aliases that can be applied automatically to new indices.
	 * Elasticsearch applies templates to new indices based on an index pattern that
	 * matches the index name.
	 * <p>
	 * IMPORTANT: This documentation is about legacy index templates, which are
	 * deprecated and will be replaced by the composable templates introduced in
	 * Elasticsearch 7.8.
	 * <p>
	 * Composable templates always take precedence over legacy templates. If no
	 * composable template matches a new index, matching legacy templates are
	 * applied according to their order.
	 * <p>
	 * Index templates are only applied during index creation. Changes to index
	 * templates do not affect existing indices. Settings and mappings specified in
	 * create index API requests override any settings or mappings specified in an
	 * index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutTemplateResponse> putTemplate(PutTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutTemplateRequest, PutTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<PutTemplateRequest, PutTemplateResponse, ErrorResponse>) PutTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an index template. Index templates define settings,
	 * mappings, and aliases that can be applied automatically to new indices.
	 * Elasticsearch applies templates to new indices based on an index pattern that
	 * matches the index name.
	 * <p>
	 * IMPORTANT: This documentation is about legacy index templates, which are
	 * deprecated and will be replaced by the composable templates introduced in
	 * Elasticsearch 7.8.
	 * <p>
	 * Composable templates always take precedence over legacy templates. If no
	 * composable template matches a new index, matching legacy templates are
	 * applied according to their order.
	 * <p>
	 * Index templates are only applied during index creation. Changes to index
	 * templates do not affect existing indices. Settings and mappings specified in
	 * create index API requests override any settings or mappings specified in an
	 * index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates-v1.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutTemplateResponse> putTemplate(
			Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn) {
		return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Get index recovery information. Get information about ongoing and completed
	 * shard recoveries for one or more indices. For data streams, the API returns
	 * information for the stream's backing indices.
	 * <p>
	 * Shard recovery is the process of initializing a shard copy, such as restoring
	 * a primary shard from a snapshot or creating a replica shard from a primary
	 * shard. When a shard recovery completes, the recovered shard is available for
	 * search and indexing.
	 * <p>
	 * Recovery automatically occurs during the following processes:
	 * <ul>
	 * <li>When creating an index for the first time.</li>
	 * <li>When a node rejoins the cluster and starts up any missing primary shard
	 * copies using the data that it holds in its data path.</li>
	 * <li>Creation of new replica shard copies from the primary.</li>
	 * <li>Relocation of a shard copy to a different node in the same cluster.</li>
	 * <li>A snapshot restore operation.</li>
	 * <li>A clone, shrink, or split operation.</li>
	 * </ul>
	 * <p>
	 * You can determine the cause of a shard recovery using the recovery or cat
	 * recovery APIs.
	 * <p>
	 * The index recovery API reports information about completed recoveries only
	 * for shard copies that currently exist in the cluster. It only reports the
	 * last recovery for each shard copy and does not report historical information
	 * about earlier recoveries, nor does it report information about the recoveries
	 * of shard copies that no longer exist. This means that if a shard copy
	 * completes a recovery and then Elasticsearch relocates it onto a different
	 * node then the information about the original recovery will not be shown in
	 * the recovery API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> endpoint = (JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse>) RecoveryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index recovery information. Get information about ongoing and completed
	 * shard recoveries for one or more indices. For data streams, the API returns
	 * information for the stream's backing indices.
	 * <p>
	 * Shard recovery is the process of initializing a shard copy, such as restoring
	 * a primary shard from a snapshot or creating a replica shard from a primary
	 * shard. When a shard recovery completes, the recovered shard is available for
	 * search and indexing.
	 * <p>
	 * Recovery automatically occurs during the following processes:
	 * <ul>
	 * <li>When creating an index for the first time.</li>
	 * <li>When a node rejoins the cluster and starts up any missing primary shard
	 * copies using the data that it holds in its data path.</li>
	 * <li>Creation of new replica shard copies from the primary.</li>
	 * <li>Relocation of a shard copy to a different node in the same cluster.</li>
	 * <li>A snapshot restore operation.</li>
	 * <li>A clone, shrink, or split operation.</li>
	 * </ul>
	 * <p>
	 * You can determine the cause of a shard recovery using the recovery or cat
	 * recovery APIs.
	 * <p>
	 * The index recovery API reports information about completed recoveries only
	 * for shard copies that currently exist in the cluster. It only reports the
	 * last recovery for each shard copy and does not report historical information
	 * about earlier recoveries, nor does it report information about the recoveries
	 * of shard copies that no longer exist. This means that if a shard copy
	 * completes a recovery and then Elasticsearch relocates it onto a different
	 * node then the information about the original recovery will not be shown in
	 * the recovery API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RecoveryResponse> recovery(
			Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn) {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Get index recovery information. Get information about ongoing and completed
	 * shard recoveries for one or more indices. For data streams, the API returns
	 * information for the stream's backing indices.
	 * <p>
	 * Shard recovery is the process of initializing a shard copy, such as restoring
	 * a primary shard from a snapshot or creating a replica shard from a primary
	 * shard. When a shard recovery completes, the recovered shard is available for
	 * search and indexing.
	 * <p>
	 * Recovery automatically occurs during the following processes:
	 * <ul>
	 * <li>When creating an index for the first time.</li>
	 * <li>When a node rejoins the cluster and starts up any missing primary shard
	 * copies using the data that it holds in its data path.</li>
	 * <li>Creation of new replica shard copies from the primary.</li>
	 * <li>Relocation of a shard copy to a different node in the same cluster.</li>
	 * <li>A snapshot restore operation.</li>
	 * <li>A clone, shrink, or split operation.</li>
	 * </ul>
	 * <p>
	 * You can determine the cause of a shard recovery using the recovery or cat
	 * recovery APIs.
	 * <p>
	 * The index recovery API reports information about completed recoveries only
	 * for shard copies that currently exist in the cluster. It only reports the
	 * last recovery for each shard copy and does not report historical information
	 * about earlier recoveries, nor does it report information about the recoveries
	 * of shard copies that no longer exist. This means that if a shard copy
	 * completes a recovery and then Elasticsearch relocates it onto a different
	 * node then the information about the original recovery will not be shown in
	 * the recovery API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery() {
		return this.transport.performRequestAsync(new RecoveryRequest.Builder().build(), RecoveryRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Refresh an index. A refresh makes recent operations performed on one or more
	 * indices available for search. For data streams, the API runs the refresh
	 * operation on the stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RefreshResponse> refresh(RefreshRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RefreshRequest, RefreshResponse, ErrorResponse> endpoint = (JsonEndpoint<RefreshRequest, RefreshResponse, ErrorResponse>) RefreshRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Refresh an index. A refresh makes recent operations performed on one or more
	 * indices available for search. For data streams, the API runs the refresh
	 * operation on the stream’s backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RefreshRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RefreshResponse> refresh(
			Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn) {
		return refresh(fn.apply(new RefreshRequest.Builder()).build());
	}

	/**
	 * Refresh an index. A refresh makes recent operations performed on one or more
	 * indices available for search. For data streams, the API runs the refresh
	 * operation on the stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RefreshResponse> refresh() {
		return this.transport.performRequestAsync(new RefreshRequest.Builder().build(), RefreshRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.reload_search_analyzers

	/**
	 * Reload search analyzers. Reload an index's search analyzers and their
	 * resources. For data streams, the API reloads search analyzers and resources
	 * for the stream's backing indices.
	 * <p>
	 * IMPORTANT: After reloading the search analyzers you should clear the request
	 * cache to make sure it doesn't contain responses derived from the previous
	 * versions of the analyzer.
	 * <p>
	 * You can use the reload search analyzers API to pick up changes to synonym
	 * files used in the <code>synonym_graph</code> or <code>synonym</code> token
	 * filter of a search analyzer. To be eligible, the token filter must have an
	 * <code>updateable</code> flag of <code>true</code> and only be used in search
	 * analyzers.
	 * <p>
	 * NOTE: This API does not perform a reload for each shard of an index. Instead,
	 * it performs a reload for each node containing index shards. As a result, the
	 * total shard count returned by the API can differ from the number of index
	 * shards. Because reloading affects every node with an index shard, it is
	 * important to update the synonym file on every data node in the
	 * cluster--including nodes that don't contain a shard replica--before using
	 * this API. This ensures the synonym file is updated everywhere in the cluster
	 * in case shards are relocated in the future.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReloadSearchAnalyzersResponse> reloadSearchAnalyzers(
			ReloadSearchAnalyzersRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReloadSearchAnalyzersRequest, ReloadSearchAnalyzersResponse, ErrorResponse> endpoint = (JsonEndpoint<ReloadSearchAnalyzersRequest, ReloadSearchAnalyzersResponse, ErrorResponse>) ReloadSearchAnalyzersRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Reload search analyzers. Reload an index's search analyzers and their
	 * resources. For data streams, the API reloads search analyzers and resources
	 * for the stream's backing indices.
	 * <p>
	 * IMPORTANT: After reloading the search analyzers you should clear the request
	 * cache to make sure it doesn't contain responses derived from the previous
	 * versions of the analyzer.
	 * <p>
	 * You can use the reload search analyzers API to pick up changes to synonym
	 * files used in the <code>synonym_graph</code> or <code>synonym</code> token
	 * filter of a search analyzer. To be eligible, the token filter must have an
	 * <code>updateable</code> flag of <code>true</code> and only be used in search
	 * analyzers.
	 * <p>
	 * NOTE: This API does not perform a reload for each shard of an index. Instead,
	 * it performs a reload for each node containing index shards. As a result, the
	 * total shard count returned by the API can differ from the number of index
	 * shards. Because reloading affects every node with an index shard, it is
	 * important to update the synonym file on every data node in the
	 * cluster--including nodes that don't contain a shard replica--before using
	 * this API. This ensures the synonym file is updated everywhere in the cluster
	 * in case shards are relocated in the future.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReloadSearchAnalyzersRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReloadSearchAnalyzersResponse> reloadSearchAnalyzers(
			Function<ReloadSearchAnalyzersRequest.Builder, ObjectBuilder<ReloadSearchAnalyzersRequest>> fn) {
		return reloadSearchAnalyzers(fn.apply(new ReloadSearchAnalyzersRequest.Builder()).build());
	}

	// ----- Endpoint: indices.resolve_cluster

	/**
	 * Resolve the cluster. Resolve the specified index expressions to return
	 * information about each cluster, including the local cluster, if included.
	 * Multiple patterns and remote clusters are supported.
	 * <p>
	 * This endpoint is useful before doing a cross-cluster search in order to
	 * determine which remote clusters should be included in a search.
	 * <p>
	 * You use the same index expression with this endpoint as you would for
	 * cross-cluster search. Index and cluster exclusions are also supported with
	 * this endpoint.
	 * <p>
	 * For each cluster in the index expression, information is returned about:
	 * <ul>
	 * <li>Whether the querying (&quot;local&quot;) cluster is currently connected
	 * to each remote cluster in the index expression scope.</li>
	 * <li>Whether each remote cluster is configured with
	 * <code>skip_unavailable</code> as <code>true</code> or
	 * <code>false</code>.</li>
	 * <li>Whether there are any indices, aliases, or data streams on that cluster
	 * that match the index expression.</li>
	 * <li>Whether the search is likely to have errors returned when you do the
	 * cross-cluster search (including any authorization errors if you do not have
	 * permission to query the index).</li>
	 * <li>Cluster version information, including the Elasticsearch server
	 * version.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-cluster-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ResolveClusterResponse> resolveCluster(ResolveClusterRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResolveClusterRequest, ResolveClusterResponse, ErrorResponse> endpoint = (JsonEndpoint<ResolveClusterRequest, ResolveClusterResponse, ErrorResponse>) ResolveClusterRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Resolve the cluster. Resolve the specified index expressions to return
	 * information about each cluster, including the local cluster, if included.
	 * Multiple patterns and remote clusters are supported.
	 * <p>
	 * This endpoint is useful before doing a cross-cluster search in order to
	 * determine which remote clusters should be included in a search.
	 * <p>
	 * You use the same index expression with this endpoint as you would for
	 * cross-cluster search. Index and cluster exclusions are also supported with
	 * this endpoint.
	 * <p>
	 * For each cluster in the index expression, information is returned about:
	 * <ul>
	 * <li>Whether the querying (&quot;local&quot;) cluster is currently connected
	 * to each remote cluster in the index expression scope.</li>
	 * <li>Whether each remote cluster is configured with
	 * <code>skip_unavailable</code> as <code>true</code> or
	 * <code>false</code>.</li>
	 * <li>Whether there are any indices, aliases, or data streams on that cluster
	 * that match the index expression.</li>
	 * <li>Whether the search is likely to have errors returned when you do the
	 * cross-cluster search (including any authorization errors if you do not have
	 * permission to query the index).</li>
	 * <li>Cluster version information, including the Elasticsearch server
	 * version.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResolveClusterRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-cluster-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResolveClusterResponse> resolveCluster(
			Function<ResolveClusterRequest.Builder, ObjectBuilder<ResolveClusterRequest>> fn) {
		return resolveCluster(fn.apply(new ResolveClusterRequest.Builder()).build());
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Resolve indices. Resolve the names and/or index patterns for indices,
	 * aliases, and data streams. Multiple patterns and remote clusters are
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ResolveIndexResponse> resolveIndex(ResolveIndexRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResolveIndexRequest, ResolveIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<ResolveIndexRequest, ResolveIndexResponse, ErrorResponse>) ResolveIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Resolve indices. Resolve the names and/or index patterns for indices,
	 * aliases, and data streams. Multiple patterns and remote clusters are
	 * supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResolveIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResolveIndexResponse> resolveIndex(
			Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn) {
		return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.rollover

	/**
	 * Roll over to a new index. Creates a new index for a data stream or index
	 * alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-rollover-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RolloverResponse> rollover(RolloverRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RolloverRequest, RolloverResponse, ErrorResponse> endpoint = (JsonEndpoint<RolloverRequest, RolloverResponse, ErrorResponse>) RolloverRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Roll over to a new index. Creates a new index for a data stream or index
	 * alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RolloverRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-rollover-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RolloverResponse> rollover(
			Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn) {
		return rollover(fn.apply(new RolloverRequest.Builder()).build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Get index segments. Get low-level information about the Lucene segments in
	 * index shards. For data streams, the API returns information about the
	 * stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse> endpoint = (JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse>) SegmentsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index segments. Get low-level information about the Lucene segments in
	 * index shards. For data streams, the API returns information about the
	 * stream's backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SegmentsResponse> segments(
			Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn) {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Get index segments. Get low-level information about the Lucene segments in
	 * index shards. For data streams, the API returns information about the
	 * stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments() {
		return this.transport.performRequestAsync(new SegmentsRequest.Builder().build(), SegmentsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.shard_stores

	/**
	 * Get index shard stores. Get store information about replica shards in one or
	 * more indices. For data streams, the API retrieves store information for the
	 * stream's backing indices.
	 * <p>
	 * The index shard stores API returns the following information:
	 * <ul>
	 * <li>The node on which each replica shard exists.</li>
	 * <li>The allocation ID for each replica shard.</li>
	 * <li>A unique ID for each replica shard.</li>
	 * <li>Any errors encountered while opening the shard index or from an earlier
	 * failure.</li>
	 * </ul>
	 * <p>
	 * By default, the API returns store information only for primary shards that
	 * are unassigned or have one or more unassigned replica shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardStoresResponse> shardStores(ShardStoresRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ShardStoresRequest, ShardStoresResponse, ErrorResponse> endpoint = (JsonEndpoint<ShardStoresRequest, ShardStoresResponse, ErrorResponse>) ShardStoresRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index shard stores. Get store information about replica shards in one or
	 * more indices. For data streams, the API retrieves store information for the
	 * stream's backing indices.
	 * <p>
	 * The index shard stores API returns the following information:
	 * <ul>
	 * <li>The node on which each replica shard exists.</li>
	 * <li>The allocation ID for each replica shard.</li>
	 * <li>A unique ID for each replica shard.</li>
	 * <li>Any errors encountered while opening the shard index or from an earlier
	 * failure.</li>
	 * </ul>
	 * <p>
	 * By default, the API returns store information only for primary shards that
	 * are unassigned or have one or more unassigned replica shards.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardStoresRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShardStoresResponse> shardStores(
			Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn) {
		return shardStores(fn.apply(new ShardStoresRequest.Builder()).build());
	}

	/**
	 * Get index shard stores. Get store information about replica shards in one or
	 * more indices. For data streams, the API retrieves store information for the
	 * stream's backing indices.
	 * <p>
	 * The index shard stores API returns the following information:
	 * <ul>
	 * <li>The node on which each replica shard exists.</li>
	 * <li>The allocation ID for each replica shard.</li>
	 * <li>A unique ID for each replica shard.</li>
	 * <li>Any errors encountered while opening the shard index or from an earlier
	 * failure.</li>
	 * </ul>
	 * <p>
	 * By default, the API returns store information only for primary shards that
	 * are unassigned or have one or more unassigned replica shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardStoresResponse> shardStores() {
		return this.transport.performRequestAsync(new ShardStoresRequest.Builder().build(),
				ShardStoresRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.shrink

	/**
	 * Shrink an index. Shrink an index into a new index with fewer primary shards.
	 * <p>
	 * Before you can shrink an index:
	 * <ul>
	 * <li>The index must be read-only.</li>
	 * <li>A copy of every shard in the index must reside on the same node.</li>
	 * <li>The index must have a green health status.</li>
	 * </ul>
	 * <p>
	 * To make shard allocation easier, we recommend you also remove the index's
	 * replica shards. You can later re-add replica shards as part of the shrink
	 * operation.
	 * <p>
	 * The requested number of primary shards in the target index must be a factor
	 * of the number of shards in the source index. For example an index with 8
	 * primary shards can be shrunk into 4, 2 or 1 primary shards or an index with
	 * 15 primary shards can be shrunk into 5, 3 or 1. If the number of shards in
	 * the index is a prime number it can only be shrunk into a single primary shard
	 * Before shrinking, a (primary or replica) copy of every shard in the index
	 * must be present on the same node.
	 * <p>
	 * The current write index on a data stream cannot be shrunk. In order to shrink
	 * the current write index, the data stream must first be rolled over so that a
	 * new write index is created and then the previous write index can be shrunk.
	 * <p>
	 * A shrink operation:
	 * <ul>
	 * <li>Creates a new target index with the same definition as the source index,
	 * but with a smaller number of primary shards.</li>
	 * <li>Hard-links segments from the source index into the target index. If the
	 * file system does not support hard-linking, then all segments are copied into
	 * the new index, which is a much more time consuming process. Also if using
	 * multiple data paths, shards on different data paths require a full copy of
	 * segment files if they are not on the same disk since hardlinks do not work
	 * across disks.</li>
	 * <li>Recovers the target index as though it were a closed index which had just
	 * been re-opened. Recovers shards to the
	 * <code>.routing.allocation.initial_recovery._id</code> index setting.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: Indices can only be shrunk if they satisfy the following
	 * requirements:
	 * <ul>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have more primary shards than the target
	 * index.</li>
	 * <li>The number of primary shards in the target index must be a factor of the
	 * number of primary shards in the source index. The source index must have more
	 * primary shards than the target index.</li>
	 * <li>The index must not contain more than 2,147,483,519 documents in total
	 * across all shards that will be shrunk into a single shard on the target index
	 * as this is the maximum number of docs that can fit into a single shard.</li>
	 * <li>The node handling the shrink process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-shrink-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShrinkResponse> shrink(ShrinkRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ShrinkRequest, ShrinkResponse, ErrorResponse> endpoint = (JsonEndpoint<ShrinkRequest, ShrinkResponse, ErrorResponse>) ShrinkRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Shrink an index. Shrink an index into a new index with fewer primary shards.
	 * <p>
	 * Before you can shrink an index:
	 * <ul>
	 * <li>The index must be read-only.</li>
	 * <li>A copy of every shard in the index must reside on the same node.</li>
	 * <li>The index must have a green health status.</li>
	 * </ul>
	 * <p>
	 * To make shard allocation easier, we recommend you also remove the index's
	 * replica shards. You can later re-add replica shards as part of the shrink
	 * operation.
	 * <p>
	 * The requested number of primary shards in the target index must be a factor
	 * of the number of shards in the source index. For example an index with 8
	 * primary shards can be shrunk into 4, 2 or 1 primary shards or an index with
	 * 15 primary shards can be shrunk into 5, 3 or 1. If the number of shards in
	 * the index is a prime number it can only be shrunk into a single primary shard
	 * Before shrinking, a (primary or replica) copy of every shard in the index
	 * must be present on the same node.
	 * <p>
	 * The current write index on a data stream cannot be shrunk. In order to shrink
	 * the current write index, the data stream must first be rolled over so that a
	 * new write index is created and then the previous write index can be shrunk.
	 * <p>
	 * A shrink operation:
	 * <ul>
	 * <li>Creates a new target index with the same definition as the source index,
	 * but with a smaller number of primary shards.</li>
	 * <li>Hard-links segments from the source index into the target index. If the
	 * file system does not support hard-linking, then all segments are copied into
	 * the new index, which is a much more time consuming process. Also if using
	 * multiple data paths, shards on different data paths require a full copy of
	 * segment files if they are not on the same disk since hardlinks do not work
	 * across disks.</li>
	 * <li>Recovers the target index as though it were a closed index which had just
	 * been re-opened. Recovers shards to the
	 * <code>.routing.allocation.initial_recovery._id</code> index setting.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: Indices can only be shrunk if they satisfy the following
	 * requirements:
	 * <ul>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have more primary shards than the target
	 * index.</li>
	 * <li>The number of primary shards in the target index must be a factor of the
	 * number of primary shards in the source index. The source index must have more
	 * primary shards than the target index.</li>
	 * <li>The index must not contain more than 2,147,483,519 documents in total
	 * across all shards that will be shrunk into a single shard on the target index
	 * as this is the maximum number of docs that can fit into a single shard.</li>
	 * <li>The node handling the shrink process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShrinkRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-shrink-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShrinkResponse> shrink(
			Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn) {
		return shrink(fn.apply(new ShrinkRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_index_template

	/**
	 * Simulate an index. Returns the index configuration that would be applied to
	 * the specified index from an existing index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-simulate-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(
			SimulateIndexTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse>) SimulateIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Simulate an index. Returns the index configuration that would be applied to
	 * the specified index from an existing index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-simulate-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(
			Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn) {
		return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate an index template. Returns the index configuration that would be
	 * applied by a particular index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-simulate-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateTemplateResponse> simulateTemplate(SimulateTemplateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SimulateTemplateRequest, SimulateTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<SimulateTemplateRequest, SimulateTemplateResponse, ErrorResponse>) SimulateTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Simulate an index template. Returns the index configuration that would be
	 * applied by a particular index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-simulate-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SimulateTemplateResponse> simulateTemplate(
			Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn) {
		return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build());
	}

	/**
	 * Simulate an index template. Returns the index configuration that would be
	 * applied by a particular index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-simulate-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateTemplateResponse> simulateTemplate() {
		return this.transport.performRequestAsync(new SimulateTemplateRequest.Builder().build(),
				SimulateTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.split

	/**
	 * Split an index. Split an index into a new index with more primary shards.
	 * <ul>
	 * <li>
	 * <p>
	 * Before you can split an index:
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * The index must be read-only.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * The cluster health status must be green.
	 * </p>
	 * </li>
	 * </ul>
	 * <p>
	 * The number of times the index can be split (and the number of shards that
	 * each original shard can be split into) is determined by the
	 * <code>index.number_of_routing_shards</code> setting. The number of routing
	 * shards specifies the hashing space that is used internally to distribute
	 * documents across shards with consistent hashing. For instance, a 5 shard
	 * index with <code>number_of_routing_shards</code> set to 30 (5 x 2 x 3) could
	 * be split by a factor of 2 or 3.
	 * <p>
	 * A split operation:
	 * <ul>
	 * <li>Creates a new target index with the same definition as the source index,
	 * but with a larger number of primary shards.</li>
	 * <li>Hard-links segments from the source index into the target index. If the
	 * file system doesn't support hard-linking, all segments are copied into the
	 * new index, which is a much more time consuming process.</li>
	 * <li>Hashes all documents again, after low level files are created, to delete
	 * documents that belong to a different shard.</li>
	 * <li>Recovers the target index as though it were a closed index which had just
	 * been re-opened.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: Indices can only be split if they satisfy the following
	 * requirements:
	 * <ul>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have fewer primary shards than the target
	 * index.</li>
	 * <li>The number of primary shards in the target index must be a multiple of
	 * the number of primary shards in the source index.</li>
	 * <li>The node handling the split process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-split-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SplitResponse> split(SplitRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SplitRequest, SplitResponse, ErrorResponse> endpoint = (JsonEndpoint<SplitRequest, SplitResponse, ErrorResponse>) SplitRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Split an index. Split an index into a new index with more primary shards.
	 * <ul>
	 * <li>
	 * <p>
	 * Before you can split an index:
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * The index must be read-only.
	 * </p>
	 * </li>
	 * <li>
	 * <p>
	 * The cluster health status must be green.
	 * </p>
	 * </li>
	 * </ul>
	 * <p>
	 * The number of times the index can be split (and the number of shards that
	 * each original shard can be split into) is determined by the
	 * <code>index.number_of_routing_shards</code> setting. The number of routing
	 * shards specifies the hashing space that is used internally to distribute
	 * documents across shards with consistent hashing. For instance, a 5 shard
	 * index with <code>number_of_routing_shards</code> set to 30 (5 x 2 x 3) could
	 * be split by a factor of 2 or 3.
	 * <p>
	 * A split operation:
	 * <ul>
	 * <li>Creates a new target index with the same definition as the source index,
	 * but with a larger number of primary shards.</li>
	 * <li>Hard-links segments from the source index into the target index. If the
	 * file system doesn't support hard-linking, all segments are copied into the
	 * new index, which is a much more time consuming process.</li>
	 * <li>Hashes all documents again, after low level files are created, to delete
	 * documents that belong to a different shard.</li>
	 * <li>Recovers the target index as though it were a closed index which had just
	 * been re-opened.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: Indices can only be split if they satisfy the following
	 * requirements:
	 * <ul>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have fewer primary shards than the target
	 * index.</li>
	 * <li>The number of primary shards in the target index must be a multiple of
	 * the number of primary shards in the source index.</li>
	 * <li>The node handling the split process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SplitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/indices-split-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SplitResponse> split(
			Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn) {
		return split(fn.apply(new SplitRequest.Builder()).build());
	}

	// ----- Endpoint: indices.stats

	/**
	 * Get index statistics. For data streams, the API retrieves statistics for the
	 * stream's backing indices.
	 * <p>
	 * By default, the returned statistics are index-level with
	 * <code>primaries</code> and <code>total</code> aggregations.
	 * <code>primaries</code> are the values for only the primary shards.
	 * <code>total</code> are the accumulated values for both primary and replica
	 * shards.
	 * <p>
	 * To get shard-level statistics, set the <code>level</code> parameter to
	 * <code>shards</code>.
	 * <p>
	 * NOTE: When moving to another node, the shard-level statistics for a shard are
	 * cleared. Although the shard is no longer part of the node, that node retains
	 * any node-level statistics to which the shard contributed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesStatsResponse> stats(IndicesStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse>) IndicesStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index statistics. For data streams, the API retrieves statistics for the
	 * stream's backing indices.
	 * <p>
	 * By default, the returned statistics are index-level with
	 * <code>primaries</code> and <code>total</code> aggregations.
	 * <code>primaries</code> are the values for only the primary shards.
	 * <code>total</code> are the accumulated values for both primary and replica
	 * shards.
	 * <p>
	 * To get shard-level statistics, set the <code>level</code> parameter to
	 * <code>shards</code>.
	 * <p>
	 * NOTE: When moving to another node, the shard-level statistics for a shard are
	 * cleared. Although the shard is no longer part of the node, that node retains
	 * any node-level statistics to which the shard contributed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<IndicesStatsResponse> stats(
			Function<IndicesStatsRequest.Builder, ObjectBuilder<IndicesStatsRequest>> fn) {
		return stats(fn.apply(new IndicesStatsRequest.Builder()).build());
	}

	/**
	 * Get index statistics. For data streams, the API retrieves statistics for the
	 * stream's backing indices.
	 * <p>
	 * By default, the returned statistics are index-level with
	 * <code>primaries</code> and <code>total</code> aggregations.
	 * <code>primaries</code> are the values for only the primary shards.
	 * <code>total</code> are the accumulated values for both primary and replica
	 * shards.
	 * <p>
	 * To get shard-level statistics, set the <code>level</code> parameter to
	 * <code>shards</code>.
	 * <p>
	 * NOTE: When moving to another node, the shard-level statistics for a shard are
	 * cleared. Although the shard is no longer part of the node, that node retains
	 * any node-level statistics to which the shard contributed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesStatsResponse> stats() {
		return this.transport.performRequestAsync(new IndicesStatsRequest.Builder().build(),
				IndicesStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.unfreeze

	/**
	 * Unfreeze an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/unfreeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UnfreezeResponse> unfreeze(UnfreezeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UnfreezeRequest, UnfreezeResponse, ErrorResponse> endpoint = (JsonEndpoint<UnfreezeRequest, UnfreezeResponse, ErrorResponse>) UnfreezeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Unfreeze an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UnfreezeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/unfreeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UnfreezeResponse> unfreeze(
			Function<UnfreezeRequest.Builder, ObjectBuilder<UnfreezeRequest>> fn) {
		return unfreeze(fn.apply(new UnfreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateAliasesResponse> updateAliases(UpdateAliasesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse>) UpdateAliasesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateAliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateAliasesResponse> updateAliases(
			Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn) {
		return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build());
	}

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateAliasesResponse> updateAliases() {
		return this.transport.performRequestAsync(new UpdateAliasesRequest.Builder().build(),
				UpdateAliasesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Validate a query. Validates a query without running it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ValidateQueryResponse> validateQuery(ValidateQueryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ValidateQueryRequest, ValidateQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<ValidateQueryRequest, ValidateQueryResponse, ErrorResponse>) ValidateQueryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Validate a query. Validates a query without running it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ValidateQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ValidateQueryResponse> validateQuery(
			Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn) {
		return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build());
	}

	/**
	 * Validate a query. Validates a query without running it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ValidateQueryResponse> validateQuery() {
		return this.transport.performRequestAsync(new ValidateQueryRequest.Builder().build(),
				ValidateQueryRequest._ENDPOINT, this.transportOptions);
	}

}
