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
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
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
 * Client for the indices namespace.
 */
public class ElasticsearchIndicesClient extends ApiClient<ElasticsearchTransport, ElasticsearchIndicesClient> {

	public ElasticsearchIndicesClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchIndicesClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchIndicesClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchIndicesClient(this.transport, transportOptions);
	}

	// ----- Endpoint: indices.add_block

	/**
	 * Add an index block.
	 * <p>
	 * Add an index block to an index. Index blocks limit the operations allowed on
	 * an index by blocking specific operation types.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-add-block">Documentation
	 *      on elastic.co</a>
	 */

	public AddBlockResponse addBlock(AddBlockRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AddBlockRequest, AddBlockResponse, ErrorResponse> endpoint = (JsonEndpoint<AddBlockRequest, AddBlockResponse, ErrorResponse>) AddBlockRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Add an index block.
	 * <p>
	 * Add an index block to an index. Index blocks limit the operations allowed on
	 * an index by blocking specific operation types.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AddBlockRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-add-block">Documentation
	 *      on elastic.co</a>
	 */

	public final AddBlockResponse addBlock(Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn)
			throws IOException, ElasticsearchException {
		return addBlock(fn.apply(new AddBlockRequest.Builder()).build());
	}

	// ----- Endpoint: indices.analyze

	/**
	 * Get tokens from text analysis. The analyze API performs analysis on a text
	 * string and returns the resulting tokens.
	 * <p>
	 * Generating excessive amount of tokens may cause a node to run out of memory.
	 * The <code>index.analyze.max_token_count</code> setting enables you to limit
	 * the number of tokens that can be produced. If more than this limit of tokens
	 * gets generated, an error occurs. The <code>_analyze</code> endpoint without a
	 * specified index will always use <code>10000</code> as its limit.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-analyze">Documentation
	 *      on elastic.co</a>
	 */

	public AnalyzeResponse analyze(AnalyzeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse> endpoint = (JsonEndpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse>) AnalyzeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get tokens from text analysis. The analyze API performs analysis on a text
	 * string and returns the resulting tokens.
	 * <p>
	 * Generating excessive amount of tokens may cause a node to run out of memory.
	 * The <code>index.analyze.max_token_count</code> setting enables you to limit
	 * the number of tokens that can be produced. If more than this limit of tokens
	 * gets generated, an error occurs. The <code>_analyze</code> endpoint without a
	 * specified index will always use <code>10000</code> as its limit.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AnalyzeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-analyze">Documentation
	 *      on elastic.co</a>
	 */

	public final AnalyzeResponse analyze(Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn)
			throws IOException, ElasticsearchException {
		return analyze(fn.apply(new AnalyzeRequest.Builder()).build());
	}

	/**
	 * Get tokens from text analysis. The analyze API performs analysis on a text
	 * string and returns the resulting tokens.
	 * <p>
	 * Generating excessive amount of tokens may cause a node to run out of memory.
	 * The <code>index.analyze.max_token_count</code> setting enables you to limit
	 * the number of tokens that can be produced. If more than this limit of tokens
	 * gets generated, an error occurs. The <code>_analyze</code> endpoint without a
	 * specified index will always use <code>10000</code> as its limit.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-analyze">Documentation
	 *      on elastic.co</a>
	 */

	public AnalyzeResponse analyze() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new AnalyzeRequest.Builder().build(), AnalyzeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.cancel_migrate_reindex

	/**
	 * Cancel a migration reindex operation.
	 * <p>
	 * Cancel a migration reindex attempt for a data stream or index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-cancel-migrate-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public CancelMigrateReindexResponse cancelMigrateReindex(CancelMigrateReindexRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CancelMigrateReindexRequest, CancelMigrateReindexResponse, ErrorResponse> endpoint = (JsonEndpoint<CancelMigrateReindexRequest, CancelMigrateReindexResponse, ErrorResponse>) CancelMigrateReindexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Cancel a migration reindex operation.
	 * <p>
	 * Cancel a migration reindex attempt for a data stream or index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CancelMigrateReindexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-cancel-migrate-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public final CancelMigrateReindexResponse cancelMigrateReindex(
			Function<CancelMigrateReindexRequest.Builder, ObjectBuilder<CancelMigrateReindexRequest>> fn)
			throws IOException, ElasticsearchException {
		return cancelMigrateReindex(fn.apply(new CancelMigrateReindexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clear the cache. Clear the cache of one or more indices. For data streams,
	 * the API clears the caches of the stream's backing indices.
	 * <p>
	 * By default, the clear cache API clears all caches. To clear only specific
	 * caches, use the <code>fielddata</code>, <code>query</code>, or
	 * <code>request</code> parameters. To clear the cache only of specific fields,
	 * use the <code>fields</code> parameter.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-clear-cache">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse>) ClearCacheRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the cache. Clear the cache of one or more indices. For data streams,
	 * the API clears the caches of the stream's backing indices.
	 * <p>
	 * By default, the clear cache API clears all caches. To clear only specific
	 * caches, use the <code>fielddata</code>, <code>query</code>, or
	 * <code>request</code> parameters. To clear the cache only of specific fields,
	 * use the <code>fields</code> parameter.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCacheRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-clear-cache">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCacheResponse clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	/**
	 * Clear the cache. Clear the cache of one or more indices. For data streams,
	 * the API clears the caches of the stream's backing indices.
	 * <p>
	 * By default, the clear cache API clears all caches. To clear only specific
	 * caches, use the <code>fielddata</code>, <code>query</code>, or
	 * <code>request</code> parameters. To clear the cache only of specific fields,
	 * use the <code>fields</code> parameter.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-clear-cache">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ClearCacheRequest.Builder().build(), ClearCacheRequest._ENDPOINT,
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
	 * <li>The index must be marked as read-only and have a cluster health status of
	 * green.</li>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have the same number of primary shards as the
	 * target index.</li>
	 * <li>The node handling the clone process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 * <p>
	 * The current write index on a data stream cannot be cloned. In order to clone
	 * the current write index, the data stream must first be rolled over so that a
	 * new write index is created and then the previous write index can be cloned.
	 * <p>
	 * NOTE: Mappings cannot be specified in the <code>_clone</code> request. The
	 * mappings of the source index will be used for the target index.
	 * <p>
	 * <strong>Monitor the cloning process</strong>
	 * <p>
	 * The cloning process can be monitored with the cat recovery API or the cluster
	 * health API can be used to wait until all primary shards have been allocated
	 * by setting the <code>wait_for_status</code> parameter to <code>yellow</code>.
	 * <p>
	 * The <code>_clone</code> API returns as soon as the target index has been
	 * added to the cluster state, before any shards have been allocated. At this
	 * point, all shards are in the state unassigned. If, for any reason, the target
	 * index can't be allocated, its primary shard will remain unassigned until it
	 * can be allocated on that node.
	 * <p>
	 * Once the primary shard is allocated, it moves to state initializing, and the
	 * clone process begins. When the clone operation completes, the shard will
	 * become active. At that point, Elasticsearch will try to allocate any replicas
	 * and may decide to relocate the primary shard to another node.
	 * <p>
	 * <strong>Wait for active shards</strong>
	 * <p>
	 * Because the clone operation creates a new index to clone the shards to, the
	 * wait for active shards setting on index creation applies to the clone index
	 * action as well.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-clone">Documentation
	 *      on elastic.co</a>
	 */

	public CloneIndexResponse clone(CloneIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloneIndexRequest, CloneIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<CloneIndexRequest, CloneIndexResponse, ErrorResponse>) CloneIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 * <li>The index must be marked as read-only and have a cluster health status of
	 * green.</li>
	 * <li>The target index must not exist.</li>
	 * <li>The source index must have the same number of primary shards as the
	 * target index.</li>
	 * <li>The node handling the clone process must have sufficient free disk space
	 * to accommodate a second copy of the existing index.</li>
	 * </ul>
	 * <p>
	 * The current write index on a data stream cannot be cloned. In order to clone
	 * the current write index, the data stream must first be rolled over so that a
	 * new write index is created and then the previous write index can be cloned.
	 * <p>
	 * NOTE: Mappings cannot be specified in the <code>_clone</code> request. The
	 * mappings of the source index will be used for the target index.
	 * <p>
	 * <strong>Monitor the cloning process</strong>
	 * <p>
	 * The cloning process can be monitored with the cat recovery API or the cluster
	 * health API can be used to wait until all primary shards have been allocated
	 * by setting the <code>wait_for_status</code> parameter to <code>yellow</code>.
	 * <p>
	 * The <code>_clone</code> API returns as soon as the target index has been
	 * added to the cluster state, before any shards have been allocated. At this
	 * point, all shards are in the state unassigned. If, for any reason, the target
	 * index can't be allocated, its primary shard will remain unassigned until it
	 * can be allocated on that node.
	 * <p>
	 * Once the primary shard is allocated, it moves to state initializing, and the
	 * clone process begins. When the clone operation completes, the shard will
	 * become active. At that point, Elasticsearch will try to allocate any replicas
	 * and may decide to relocate the primary shard to another node.
	 * <p>
	 * <strong>Wait for active shards</strong>
	 * <p>
	 * Because the clone operation creates a new index to clone the shards to, the
	 * wait for active shards setting on index creation applies to the clone index
	 * action as well.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-clone">Documentation
	 *      on elastic.co</a>
	 */

	public final CloneIndexResponse clone(Function<CloneIndexRequest.Builder, ObjectBuilder<CloneIndexRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-close">Documentation
	 *      on elastic.co</a>
	 */

	public CloseIndexResponse close(CloseIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloseIndexRequest, CloseIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<CloseIndexRequest, CloseIndexResponse, ErrorResponse>) CloseIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-close">Documentation
	 *      on elastic.co</a>
	 */

	public final CloseIndexResponse close(Function<CloseIndexRequest.Builder, ObjectBuilder<CloseIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return close(fn.apply(new CloseIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Create an index. You can use the create index API to add a new index to an
	 * Elasticsearch cluster. When creating an index, you can specify the following:
	 * <ul>
	 * <li>Settings for the index.</li>
	 * <li>Mappings for fields in the index.</li>
	 * <li>Index aliases</li>
	 * </ul>
	 * <p>
	 * <strong>Wait for active shards</strong>
	 * <p>
	 * By default, index creation will only return a response to the client when the
	 * primary copies of each shard have been started, or the request times out. The
	 * index creation response will indicate what happened. For example,
	 * <code>acknowledged</code> indicates whether the index was successfully
	 * created in the cluster, <code>while shards_acknowledged</code> indicates
	 * whether the requisite number of shard copies were started for each shard in
	 * the index before timing out. Note that it is still possible for either
	 * <code>acknowledged</code> or <code>shards_acknowledged</code> to be
	 * <code>false</code>, but for the index creation to be successful. These values
	 * simply indicate whether the operation completed before the timeout. If
	 * <code>acknowledged</code> is false, the request timed out before the cluster
	 * state was updated with the newly created index, but it probably will be
	 * created sometime soon. If <code>shards_acknowledged</code> is false, then the
	 * request timed out before the requisite number of shards were started (by
	 * default just the primaries), even if the cluster state was successfully
	 * updated to reflect the newly created index (that is to say,
	 * <code>acknowledged</code> is <code>true</code>).
	 * <p>
	 * You can change the default of only waiting for the primary shards to start
	 * through the index setting <code>index.write.wait_for_active_shards</code>.
	 * Note that changing this setting will also affect the
	 * <code>wait_for_active_shards</code> value on all subsequent write operations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-create">Documentation
	 *      on elastic.co</a>
	 */

	public CreateIndexResponse create(CreateIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateIndexRequest, CreateIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateIndexRequest, CreateIndexResponse, ErrorResponse>) CreateIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an index. You can use the create index API to add a new index to an
	 * Elasticsearch cluster. When creating an index, you can specify the following:
	 * <ul>
	 * <li>Settings for the index.</li>
	 * <li>Mappings for fields in the index.</li>
	 * <li>Index aliases</li>
	 * </ul>
	 * <p>
	 * <strong>Wait for active shards</strong>
	 * <p>
	 * By default, index creation will only return a response to the client when the
	 * primary copies of each shard have been started, or the request times out. The
	 * index creation response will indicate what happened. For example,
	 * <code>acknowledged</code> indicates whether the index was successfully
	 * created in the cluster, <code>while shards_acknowledged</code> indicates
	 * whether the requisite number of shard copies were started for each shard in
	 * the index before timing out. Note that it is still possible for either
	 * <code>acknowledged</code> or <code>shards_acknowledged</code> to be
	 * <code>false</code>, but for the index creation to be successful. These values
	 * simply indicate whether the operation completed before the timeout. If
	 * <code>acknowledged</code> is false, the request timed out before the cluster
	 * state was updated with the newly created index, but it probably will be
	 * created sometime soon. If <code>shards_acknowledged</code> is false, then the
	 * request timed out before the requisite number of shards were started (by
	 * default just the primaries), even if the cluster state was successfully
	 * updated to reflect the newly created index (that is to say,
	 * <code>acknowledged</code> is <code>true</code>).
	 * <p>
	 * You can change the default of only waiting for the primary shards to start
	 * through the index setting <code>index.write.wait_for_active_shards</code>.
	 * Note that changing this setting will also affect the
	 * <code>wait_for_active_shards</code> value on all subsequent write operations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-create">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateIndexResponse create(Function<CreateIndexRequest.Builder, ObjectBuilder<CreateIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return create(fn.apply(new CreateIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create_data_stream

	/**
	 * Create a data stream.
	 * <p>
	 * You must have a matching index template with data stream enabled.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-create-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public CreateDataStreamResponse createDataStream(CreateDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateDataStreamRequest, CreateDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateDataStreamRequest, CreateDataStreamResponse, ErrorResponse>) CreateDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a data stream.
	 * <p>
	 * You must have a matching index template with data stream enabled.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-create-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateDataStreamResponse createDataStream(
			Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return createDataStream(fn.apply(new CreateDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create_from

	/**
	 * Create an index from a source index.
	 * <p>
	 * Copy the mappings and settings from the source index to a destination index
	 * while allowing request settings and mappings to override the source values.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-create-from">Documentation
	 *      on elastic.co</a>
	 */

	public CreateFromResponse createFrom(CreateFromRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateFromRequest, CreateFromResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateFromRequest, CreateFromResponse, ErrorResponse>) CreateFromRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an index from a source index.
	 * <p>
	 * Copy the mappings and settings from the source index to a destination index
	 * while allowing request settings and mappings to override the source values.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateFromRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-create-from">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateFromResponse createFrom(Function<CreateFromRequest.Builder, ObjectBuilder<CreateFromRequest>> fn)
			throws IOException, ElasticsearchException {
		return createFrom(fn.apply(new CreateFromRequest.Builder()).build());
	}

	// ----- Endpoint: indices.data_streams_stats

	/**
	 * Get data stream stats.
	 * <p>
	 * Get statistics for one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-data-streams-stats-1">Documentation
	 *      on elastic.co</a>
	 */

	public DataStreamsStatsResponse dataStreamsStats(DataStreamsStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DataStreamsStatsRequest, DataStreamsStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<DataStreamsStatsRequest, DataStreamsStatsResponse, ErrorResponse>) DataStreamsStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data stream stats.
	 * <p>
	 * Get statistics for one or more data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DataStreamsStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-data-streams-stats-1">Documentation
	 *      on elastic.co</a>
	 */

	public final DataStreamsStatsResponse dataStreamsStats(
			Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return dataStreamsStats(fn.apply(new DataStreamsStatsRequest.Builder()).build());
	}

	/**
	 * Get data stream stats.
	 * <p>
	 * Get statistics for one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-data-streams-stats-1">Documentation
	 *      on elastic.co</a>
	 */

	public DataStreamsStatsResponse dataStreamsStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new DataStreamsStatsRequest.Builder().build(),
				DataStreamsStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.delete

	/**
	 * Delete indices. Deleting an index deletes its documents, shards, and
	 * metadata. It does not delete related Kibana components, such as data views,
	 * visualizations, or dashboards.
	 * <p>
	 * You cannot delete the current write index of a data stream. To delete the
	 * index, you must roll over the data stream so a new write index is created.
	 * You can then use the delete index API to delete the previous write index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteIndexResponse delete(DeleteIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteIndexRequest, DeleteIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteIndexRequest, DeleteIndexResponse, ErrorResponse>) DeleteIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete indices. Deleting an index deletes its documents, shards, and
	 * metadata. It does not delete related Kibana components, such as data views,
	 * visualizations, or dashboards.
	 * <p>
	 * You cannot delete the current write index of a data stream. To delete the
	 * index, you must roll over the data stream so a new write index is created.
	 * You can then use the delete index API to delete the previous write index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteIndexResponse delete(Function<DeleteIndexRequest.Builder, ObjectBuilder<DeleteIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Delete an alias. Removes a data stream or index from an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-alias">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAliasRequest, DeleteAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAliasRequest, DeleteAliasResponse, ErrorResponse>) DeleteAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an alias. Removes a data stream or index from an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-alias">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAliasResponse deleteAlias(
			Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_lifecycle

	/**
	 * Delete data stream lifecycles. Removes the data stream lifecycle from a data
	 * stream, rendering it not managed by the data stream lifecycle.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDataLifecycleResponse deleteDataLifecycle(DeleteDataLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDataLifecycleRequest, DeleteDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDataLifecycleRequest, DeleteDataLifecycleResponse, ErrorResponse>) DeleteDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete data stream lifecycles. Removes the data stream lifecycle from a data
	 * stream, rendering it not managed by the data stream lifecycle.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDataLifecycleResponse deleteDataLifecycle(
			Function<DeleteDataLifecycleRequest.Builder, ObjectBuilder<DeleteDataLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDataLifecycle(fn.apply(new DeleteDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_stream

	/**
	 * Delete data streams. Deletes one or more data streams and their backing
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDataStreamResponse deleteDataStream(DeleteDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDataStreamRequest, DeleteDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDataStreamRequest, DeleteDataStreamResponse, ErrorResponse>) DeleteDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete data streams. Deletes one or more data streams and their backing
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDataStreamResponse deleteDataStream(
			Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteIndexTemplateResponse deleteIndexTemplate(DeleteIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteIndexTemplateRequest, DeleteIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteIndexTemplateRequest, DeleteIndexTemplateResponse, ErrorResponse>) DeleteIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteIndexTemplateResponse deleteIndexTemplate(
			Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Delete a legacy index template. IMPORTANT: This documentation is about legacy
	 * index templates, which are deprecated and will be replaced by the composable
	 * templates introduced in Elasticsearch 7.8.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-template">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteTemplateRequest, DeleteTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteTemplateRequest, DeleteTemplateResponse, ErrorResponse>) DeleteTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a legacy index template. IMPORTANT: This documentation is about legacy
	 * index templates, which are deprecated and will be replaced by the composable
	 * templates introduced in Elasticsearch 7.8.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-delete-template">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteTemplateResponse deleteTemplate(
			Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.disk_usage

	/**
	 * Analyze the index disk usage. Analyze the disk usage of each field of an
	 * index or data stream. This API might not support indices created in previous
	 * Elasticsearch versions. The result of a small index can be inaccurate as some
	 * parts of an index might not be analyzed by the API.
	 * <p>
	 * NOTE: The total size of fields of the analyzed shards of the index in the
	 * response is usually smaller than the index <code>store_size</code> value
	 * because some small metadata files are ignored and some parts of data files
	 * might not be scanned by the API. Since stored fields are stored together in a
	 * compressed format, the sizes of stored fields are also estimates and can be
	 * inaccurate. The stored size of the <code>_id</code> field is likely
	 * underestimated while the <code>_source</code> field is overestimated.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-disk-usage">Documentation
	 *      on elastic.co</a>
	 */

	public DiskUsageResponse diskUsage(DiskUsageRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DiskUsageRequest, DiskUsageResponse, ErrorResponse> endpoint = (JsonEndpoint<DiskUsageRequest, DiskUsageResponse, ErrorResponse>) DiskUsageRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Analyze the index disk usage. Analyze the disk usage of each field of an
	 * index or data stream. This API might not support indices created in previous
	 * Elasticsearch versions. The result of a small index can be inaccurate as some
	 * parts of an index might not be analyzed by the API.
	 * <p>
	 * NOTE: The total size of fields of the analyzed shards of the index in the
	 * response is usually smaller than the index <code>store_size</code> value
	 * because some small metadata files are ignored and some parts of data files
	 * might not be scanned by the API. Since stored fields are stored together in a
	 * compressed format, the sizes of stored fields are also estimates and can be
	 * inaccurate. The stored size of the <code>_id</code> field is likely
	 * underestimated while the <code>_source</code> field is overestimated.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DiskUsageRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-disk-usage">Documentation
	 *      on elastic.co</a>
	 */

	public final DiskUsageResponse diskUsage(Function<DiskUsageRequest.Builder, ObjectBuilder<DiskUsageRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-downsample">Documentation
	 *      on elastic.co</a>
	 */

	public DownsampleResponse downsample(DownsampleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DownsampleRequest, DownsampleResponse, ErrorResponse> endpoint = (JsonEndpoint<DownsampleRequest, DownsampleResponse, ErrorResponse>) DownsampleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-downsample">Documentation
	 *      on elastic.co</a>
	 */

	public final DownsampleResponse downsample(Function<DownsampleRequest.Builder, ObjectBuilder<DownsampleRequest>> fn)
			throws IOException, ElasticsearchException {
		return downsample(fn.apply(new DownsampleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Check indices. Check if one or more indices, index aliases, or data streams
	 * exist.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsRequest, BooleanResponse, ErrorResponse>) ExistsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check indices. Check if one or more indices, index aliases, or data streams
	 * exist.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException, ElasticsearchException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Check aliases.
	 * <p>
	 * Check if one or more data stream or index aliases exist.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists-alias">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsAlias(ExistsAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsAliasRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsAliasRequest, BooleanResponse, ErrorResponse>) ExistsAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check aliases.
	 * <p>
	 * Check if one or more data stream or index aliases exist.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists-alias">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsAlias(Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Check index templates.
	 * <p>
	 * Check whether index templates exist.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsIndexTemplate(ExistsIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsIndexTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsIndexTemplateRequest, BooleanResponse, ErrorResponse>) ExistsIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check index templates.
	 * <p>
	 * Check whether index templates exist.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsIndexTemplate(
			Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Check existence of index templates. Get information about whether index
	 * templates exist. Index templates define settings, mappings, and aliases that
	 * can be applied automatically to new indices.
	 * <p>
	 * IMPORTANT: This documentation is about legacy index templates, which are
	 * deprecated and will be replaced by the composable templates introduced in
	 * Elasticsearch 7.8.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists-template">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsTemplate(ExistsTemplateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsTemplateRequest, BooleanResponse, ErrorResponse>) ExistsTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check existence of index templates. Get information about whether index
	 * templates exist. Index templates define settings, mappings, and aliases that
	 * can be applied automatically to new indices.
	 * <p>
	 * IMPORTANT: This documentation is about legacy index templates, which are
	 * deprecated and will be replaced by the composable templates introduced in
	 * Elasticsearch 7.8.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-exists-template">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsTemplate(
			Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-explain-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public ExplainDataLifecycleResponse explainDataLifecycle(ExplainDataLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainDataLifecycleRequest, ExplainDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<ExplainDataLifecycleRequest, ExplainDataLifecycleResponse, ErrorResponse>) ExplainDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-explain-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final ExplainDataLifecycleResponse explainDataLifecycle(
			Function<ExplainDataLifecycleRequest.Builder, ObjectBuilder<ExplainDataLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return explainDataLifecycle(fn.apply(new ExplainDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.field_usage_stats

	/**
	 * Get field usage stats. Get field usage information for each shard and field
	 * of an index. Field usage statistics are automatically captured when queries
	 * are running on a cluster. A shard-level search request that accesses a given
	 * field, even if multiple times during that request, is counted as a single
	 * use.
	 * <p>
	 * The response body reports the per-shard usage count of the data structures
	 * that back the fields in the index. A given request will increment each count
	 * by a maximum value of 1, even if the request accesses the same field multiple
	 * times.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-field-usage-stats">Documentation
	 *      on elastic.co</a>
	 */

	public FieldUsageStatsResponse fieldUsageStats(FieldUsageStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FieldUsageStatsRequest, FieldUsageStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<FieldUsageStatsRequest, FieldUsageStatsResponse, ErrorResponse>) FieldUsageStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get field usage stats. Get field usage information for each shard and field
	 * of an index. Field usage statistics are automatically captured when queries
	 * are running on a cluster. A shard-level search request that accesses a given
	 * field, even if multiple times during that request, is counted as a single
	 * use.
	 * <p>
	 * The response body reports the per-shard usage count of the data structures
	 * that back the fields in the index. A given request will increment each count
	 * by a maximum value of 1, even if the request accesses the same field multiple
	 * times.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FieldUsageStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-field-usage-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final FieldUsageStatsResponse fieldUsageStats(
			Function<FieldUsageStatsRequest.Builder, ObjectBuilder<FieldUsageStatsRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-flush">Documentation
	 *      on elastic.co</a>
	 */

	public FlushResponse flush(FlushRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FlushRequest, FlushResponse, ErrorResponse> endpoint = (JsonEndpoint<FlushRequest, FlushResponse, ErrorResponse>) FlushRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-flush">Documentation
	 *      on elastic.co</a>
	 */

	public final FlushResponse flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-flush">Documentation
	 *      on elastic.co</a>
	 */

	public FlushResponse flush() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new FlushRequest.Builder().build(), FlushRequest._ENDPOINT,
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
	 * <p>
	 * <strong>Blocks during a force merge</strong>
	 * <p>
	 * Calls to this API block until the merge is complete (unless request contains
	 * <code>wait_for_completion=false</code>). If the client connection is lost
	 * before completion then the force merge process will continue in the
	 * background. Any new requests to force merge the same indices will also block
	 * until the ongoing force merge is complete.
	 * <p>
	 * <strong>Running force merge asynchronously</strong>
	 * <p>
	 * If the request contains <code>wait_for_completion=false</code>, Elasticsearch
	 * performs some preflight checks, launches the request, and returns a task you
	 * can use to get the status of the task. However, you can not cancel this task
	 * as the force merge task is not cancelable. Elasticsearch creates a record of
	 * this task as a document at <code>_tasks/&lt;task_id&gt;</code>. When you are
	 * done with a task, you should delete the task document so Elasticsearch can
	 * reclaim the space.
	 * <p>
	 * <strong>Force merging multiple indices</strong>
	 * <p>
	 * You can force merge multiple indices with a single request by targeting:
	 * <ul>
	 * <li>One or more data streams that contain multiple backing indices</li>
	 * <li>Multiple indices</li>
	 * <li>One or more aliases</li>
	 * <li>All data streams and indices in a cluster</li>
	 * </ul>
	 * <p>
	 * Each targeted shard is force-merged separately using the force_merge
	 * threadpool. By default each node only has a single <code>force_merge</code>
	 * thread which means that the shards on that node are force-merged one at a
	 * time. If you expand the <code>force_merge</code> threadpool on a node then it
	 * will force merge its shards in parallel
	 * <p>
	 * Force merge makes the storage for the shard being merged temporarily
	 * increase, as it may require free space up to triple its size in case
	 * <code>max_num_segments parameter</code> is set to <code>1</code>, to rewrite
	 * all segments into a new one.
	 * <p>
	 * <strong>Data streams and time-based indices</strong>
	 * <p>
	 * Force-merging is useful for managing a data stream's older backing indices
	 * and other time-based indices, particularly after a rollover. In these cases,
	 * each index only receives indexing traffic for a certain period of time. Once
	 * an index receive no more writes, its shards can be force-merged to a single
	 * segment. This can be a good idea because single-segment shards can sometimes
	 * use simpler and more efficient data structures to perform searches. For
	 * example:
	 * 
	 * <pre>
	 * <code>POST /.ds-my-data-stream-2099.03.07-000001/_forcemerge?max_num_segments=1
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-forcemerge">Documentation
	 *      on elastic.co</a>
	 */

	public ForcemergeResponse forcemerge(ForcemergeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ForcemergeRequest, ForcemergeResponse, ErrorResponse> endpoint = (JsonEndpoint<ForcemergeRequest, ForcemergeResponse, ErrorResponse>) ForcemergeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 * <p>
	 * <strong>Blocks during a force merge</strong>
	 * <p>
	 * Calls to this API block until the merge is complete (unless request contains
	 * <code>wait_for_completion=false</code>). If the client connection is lost
	 * before completion then the force merge process will continue in the
	 * background. Any new requests to force merge the same indices will also block
	 * until the ongoing force merge is complete.
	 * <p>
	 * <strong>Running force merge asynchronously</strong>
	 * <p>
	 * If the request contains <code>wait_for_completion=false</code>, Elasticsearch
	 * performs some preflight checks, launches the request, and returns a task you
	 * can use to get the status of the task. However, you can not cancel this task
	 * as the force merge task is not cancelable. Elasticsearch creates a record of
	 * this task as a document at <code>_tasks/&lt;task_id&gt;</code>. When you are
	 * done with a task, you should delete the task document so Elasticsearch can
	 * reclaim the space.
	 * <p>
	 * <strong>Force merging multiple indices</strong>
	 * <p>
	 * You can force merge multiple indices with a single request by targeting:
	 * <ul>
	 * <li>One or more data streams that contain multiple backing indices</li>
	 * <li>Multiple indices</li>
	 * <li>One or more aliases</li>
	 * <li>All data streams and indices in a cluster</li>
	 * </ul>
	 * <p>
	 * Each targeted shard is force-merged separately using the force_merge
	 * threadpool. By default each node only has a single <code>force_merge</code>
	 * thread which means that the shards on that node are force-merged one at a
	 * time. If you expand the <code>force_merge</code> threadpool on a node then it
	 * will force merge its shards in parallel
	 * <p>
	 * Force merge makes the storage for the shard being merged temporarily
	 * increase, as it may require free space up to triple its size in case
	 * <code>max_num_segments parameter</code> is set to <code>1</code>, to rewrite
	 * all segments into a new one.
	 * <p>
	 * <strong>Data streams and time-based indices</strong>
	 * <p>
	 * Force-merging is useful for managing a data stream's older backing indices
	 * and other time-based indices, particularly after a rollover. In these cases,
	 * each index only receives indexing traffic for a certain period of time. Once
	 * an index receive no more writes, its shards can be force-merged to a single
	 * segment. This can be a good idea because single-segment shards can sometimes
	 * use simpler and more efficient data structures to perform searches. For
	 * example:
	 * 
	 * <pre>
	 * <code>POST /.ds-my-data-stream-2099.03.07-000001/_forcemerge?max_num_segments=1
	 * </code>
	 * </pre>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForcemergeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-forcemerge">Documentation
	 *      on elastic.co</a>
	 */

	public final ForcemergeResponse forcemerge(Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 * <p>
	 * <strong>Blocks during a force merge</strong>
	 * <p>
	 * Calls to this API block until the merge is complete (unless request contains
	 * <code>wait_for_completion=false</code>). If the client connection is lost
	 * before completion then the force merge process will continue in the
	 * background. Any new requests to force merge the same indices will also block
	 * until the ongoing force merge is complete.
	 * <p>
	 * <strong>Running force merge asynchronously</strong>
	 * <p>
	 * If the request contains <code>wait_for_completion=false</code>, Elasticsearch
	 * performs some preflight checks, launches the request, and returns a task you
	 * can use to get the status of the task. However, you can not cancel this task
	 * as the force merge task is not cancelable. Elasticsearch creates a record of
	 * this task as a document at <code>_tasks/&lt;task_id&gt;</code>. When you are
	 * done with a task, you should delete the task document so Elasticsearch can
	 * reclaim the space.
	 * <p>
	 * <strong>Force merging multiple indices</strong>
	 * <p>
	 * You can force merge multiple indices with a single request by targeting:
	 * <ul>
	 * <li>One or more data streams that contain multiple backing indices</li>
	 * <li>Multiple indices</li>
	 * <li>One or more aliases</li>
	 * <li>All data streams and indices in a cluster</li>
	 * </ul>
	 * <p>
	 * Each targeted shard is force-merged separately using the force_merge
	 * threadpool. By default each node only has a single <code>force_merge</code>
	 * thread which means that the shards on that node are force-merged one at a
	 * time. If you expand the <code>force_merge</code> threadpool on a node then it
	 * will force merge its shards in parallel
	 * <p>
	 * Force merge makes the storage for the shard being merged temporarily
	 * increase, as it may require free space up to triple its size in case
	 * <code>max_num_segments parameter</code> is set to <code>1</code>, to rewrite
	 * all segments into a new one.
	 * <p>
	 * <strong>Data streams and time-based indices</strong>
	 * <p>
	 * Force-merging is useful for managing a data stream's older backing indices
	 * and other time-based indices, particularly after a rollover. In these cases,
	 * each index only receives indexing traffic for a certain period of time. Once
	 * an index receive no more writes, its shards can be force-merged to a single
	 * segment. This can be a good idea because single-segment shards can sometimes
	 * use simpler and more efficient data structures to perform searches. For
	 * example:
	 * 
	 * <pre>
	 * <code>POST /.ds-my-data-stream-2099.03.07-000001/_forcemerge?max_num_segments=1
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-forcemerge">Documentation
	 *      on elastic.co</a>
	 */

	public ForcemergeResponse forcemerge() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ForcemergeRequest.Builder().build(), ForcemergeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get

	/**
	 * Get index information. Get information about one or more indices. For data
	 * streams, the API returns information about the stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexResponse get(GetIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetIndexRequest, GetIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<GetIndexRequest, GetIndexResponse, ErrorResponse>) GetIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index information. Get information about one or more indices. For data
	 * streams, the API returns information about the stream’s backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get">Documentation
	 *      on elastic.co</a>
	 */

	public final GetIndexResponse get(Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Get aliases. Retrieves information for one or more data stream or index
	 * aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-alias">Documentation
	 *      on elastic.co</a>
	 */

	public GetAliasResponse getAlias(GetAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAliasRequest, GetAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAliasRequest, GetAliasResponse, ErrorResponse>) GetAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get aliases. Retrieves information for one or more data stream or index
	 * aliases.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-alias">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAliasResponse getAlias(Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return getAlias(fn.apply(new GetAliasRequest.Builder()).build());
	}

	/**
	 * Get aliases. Retrieves information for one or more data stream or index
	 * aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-alias">Documentation
	 *      on elastic.co</a>
	 */

	public GetAliasResponse getAlias() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetAliasRequest.Builder().build(), GetAliasRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_data_lifecycle

	/**
	 * Get data stream lifecycles.
	 * <p>
	 * Get the data stream lifecycle configuration of one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataLifecycleResponse getDataLifecycle(GetDataLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDataLifecycleRequest, GetDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDataLifecycleRequest, GetDataLifecycleResponse, ErrorResponse>) GetDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data stream lifecycles.
	 * <p>
	 * Get the data stream lifecycle configuration of one or more data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final GetDataLifecycleResponse getDataLifecycle(
			Function<GetDataLifecycleRequest.Builder, ObjectBuilder<GetDataLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return getDataLifecycle(fn.apply(new GetDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_data_lifecycle_stats

	/**
	 * Get data stream lifecycle stats. Get statistics about the data streams that
	 * are managed by a data stream lifecycle.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-data-lifecycle-stats">Documentation
	 *      on elastic.co</a>
	 */
	public GetDataLifecycleStatsResponse getDataLifecycleStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetDataLifecycleStatsRequest._INSTANCE,
				GetDataLifecycleStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_data_stream

	/**
	 * Get data streams.
	 * <p>
	 * Get information about one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataStreamResponse getDataStream(GetDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDataStreamRequest, GetDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDataStreamRequest, GetDataStreamResponse, ErrorResponse>) GetDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data streams.
	 * <p>
	 * Get information about one or more data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public final GetDataStreamResponse getDataStream(
			Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return getDataStream(fn.apply(new GetDataStreamRequest.Builder()).build());
	}

	/**
	 * Get data streams.
	 * <p>
	 * Get information about one or more data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataStreamResponse getDataStream() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetDataStreamRequest.Builder().build(), GetDataStreamRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Get mapping definitions. Retrieves mapping definitions for one or more
	 * fields. For data streams, the API retrieves field mappings for the stream’s
	 * backing indices.
	 * <p>
	 * This API is useful if you don't need a complete mapping or if an index
	 * mapping contains a large number of fields.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public GetFieldMappingResponse getFieldMapping(GetFieldMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetFieldMappingRequest, GetFieldMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetFieldMappingRequest, GetFieldMappingResponse, ErrorResponse>) GetFieldMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get mapping definitions. Retrieves mapping definitions for one or more
	 * fields. For data streams, the API retrieves field mappings for the stream’s
	 * backing indices.
	 * <p>
	 * This API is useful if you don't need a complete mapping or if an index
	 * mapping contains a large number of fields.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetFieldMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public final GetFieldMappingResponse getFieldMapping(
			Function<GetFieldMappingRequest.Builder, ObjectBuilder<GetFieldMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return getFieldMapping(fn.apply(new GetFieldMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Get index templates. Get information about one or more index templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexTemplateResponse getIndexTemplate(GetIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetIndexTemplateRequest, GetIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<GetIndexTemplateRequest, GetIndexTemplateResponse, ErrorResponse>) GetIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index templates. Get information about one or more index templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public final GetIndexTemplateResponse getIndexTemplate(
			Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build());
	}

	/**
	 * Get index templates. Get information about one or more index templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexTemplateResponse getIndexTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetIndexTemplateRequest.Builder().build(),
				GetIndexTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Get mapping definitions. For data streams, the API retrieves mappings for the
	 * stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public GetMappingResponse getMapping(GetMappingRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetMappingRequest, GetMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetMappingRequest, GetMappingResponse, ErrorResponse>) GetMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get mapping definitions. For data streams, the API retrieves mappings for the
	 * stream’s backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public final GetMappingResponse getMapping(Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return getMapping(fn.apply(new GetMappingRequest.Builder()).build());
	}

	/**
	 * Get mapping definitions. For data streams, the API retrieves mappings for the
	 * stream’s backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public GetMappingResponse getMapping() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetMappingRequest.Builder().build(), GetMappingRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_migrate_reindex_status

	/**
	 * Get the migration reindexing status.
	 * <p>
	 * Get the status of a migration reindex attempt for a data stream or index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/group/endpoint-migration">Documentation
	 *      on elastic.co</a>
	 */

	public GetMigrateReindexStatusResponse getMigrateReindexStatus(GetMigrateReindexStatusRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetMigrateReindexStatusRequest, GetMigrateReindexStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<GetMigrateReindexStatusRequest, GetMigrateReindexStatusResponse, ErrorResponse>) GetMigrateReindexStatusRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the migration reindexing status.
	 * <p>
	 * Get the status of a migration reindex attempt for a data stream or index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetMigrateReindexStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/group/endpoint-migration">Documentation
	 *      on elastic.co</a>
	 */

	public final GetMigrateReindexStatusResponse getMigrateReindexStatus(
			Function<GetMigrateReindexStatusRequest.Builder, ObjectBuilder<GetMigrateReindexStatusRequest>> fn)
			throws IOException, ElasticsearchException {
		return getMigrateReindexStatus(fn.apply(new GetMigrateReindexStatusRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Get index settings. Get setting information for one or more indices. For data
	 * streams, it returns setting information for the stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndicesSettingsResponse getSettings(GetIndicesSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetIndicesSettingsRequest, GetIndicesSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetIndicesSettingsRequest, GetIndicesSettingsResponse, ErrorResponse>) GetIndicesSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index settings. Get setting information for one or more indices. For data
	 * streams, it returns setting information for the stream's backing indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndicesSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final GetIndicesSettingsResponse getSettings(
			Function<GetIndicesSettingsRequest.Builder, ObjectBuilder<GetIndicesSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSettings(fn.apply(new GetIndicesSettingsRequest.Builder()).build());
	}

	/**
	 * Get index settings. Get setting information for one or more indices. For data
	 * streams, it returns setting information for the stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndicesSettingsResponse getSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetIndicesSettingsRequest.Builder().build(),
				GetIndicesSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Get legacy index templates. Get information about one or more index
	 * templates.
	 * <p>
	 * IMPORTANT: This documentation is about legacy index templates, which are
	 * deprecated and will be replaced by the composable templates introduced in
	 * Elasticsearch 7.8.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-template">Documentation
	 *      on elastic.co</a>
	 */

	public GetTemplateResponse getTemplate(GetTemplateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTemplateRequest, GetTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTemplateRequest, GetTemplateResponse, ErrorResponse>) GetTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get legacy index templates. Get information about one or more index
	 * templates.
	 * <p>
	 * IMPORTANT: This documentation is about legacy index templates, which are
	 * deprecated and will be replaced by the composable templates introduced in
	 * Elasticsearch 7.8.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-template">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTemplateResponse getTemplate(
			Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build());
	}

	/**
	 * Get legacy index templates. Get information about one or more index
	 * templates.
	 * <p>
	 * IMPORTANT: This documentation is about legacy index templates, which are
	 * deprecated and will be replaced by the composable templates introduced in
	 * Elasticsearch 7.8.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-get-template">Documentation
	 *      on elastic.co</a>
	 */

	public GetTemplateResponse getTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTemplateRequest.Builder().build(), GetTemplateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.migrate_reindex

	/**
	 * Reindex legacy backing indices.
	 * <p>
	 * Reindex all legacy backing indices for a data stream. This operation occurs
	 * in a persistent task. The persistent task ID is returned immediately and the
	 * reindexing work is completed in that task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-migrate-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateReindexResponse migrateReindex(MigrateReindexRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MigrateReindexRequest, MigrateReindexResponse, ErrorResponse> endpoint = (JsonEndpoint<MigrateReindexRequest, MigrateReindexResponse, ErrorResponse>) MigrateReindexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Reindex legacy backing indices.
	 * <p>
	 * Reindex all legacy backing indices for a data stream. This operation occurs
	 * in a persistent task. The persistent task ID is returned immediately and the
	 * reindexing work is completed in that task.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MigrateReindexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-migrate-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public final MigrateReindexResponse migrateReindex(
			Function<MigrateReindexRequest.Builder, ObjectBuilder<MigrateReindexRequest>> fn)
			throws IOException, ElasticsearchException {
		return migrateReindex(fn.apply(new MigrateReindexRequest.Builder()).build());
	}

	/**
	 * Reindex legacy backing indices.
	 * <p>
	 * Reindex all legacy backing indices for a data stream. This operation occurs
	 * in a persistent task. The persistent task ID is returned immediately and the
	 * reindexing work is completed in that task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-migrate-reindex">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateReindexResponse migrateReindex() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MigrateReindexRequest.Builder().build(),
				MigrateReindexRequest._ENDPOINT, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-migrate-to-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateToDataStreamResponse migrateToDataStream(MigrateToDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MigrateToDataStreamRequest, MigrateToDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<MigrateToDataStreamRequest, MigrateToDataStreamResponse, ErrorResponse>) MigrateToDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-migrate-to-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public final MigrateToDataStreamResponse migrateToDataStream(
			Function<MigrateToDataStreamRequest.Builder, ObjectBuilder<MigrateToDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return migrateToDataStream(fn.apply(new MigrateToDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.modify_data_stream

	/**
	 * Update data streams. Performs one or more data stream modification actions in
	 * a single atomic operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-modify-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public ModifyDataStreamResponse modifyDataStream(ModifyDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ModifyDataStreamRequest, ModifyDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<ModifyDataStreamRequest, ModifyDataStreamResponse, ErrorResponse>) ModifyDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update data streams. Performs one or more data stream modification actions in
	 * a single atomic operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ModifyDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-modify-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public final ModifyDataStreamResponse modifyDataStream(
			Function<ModifyDataStreamRequest.Builder, ObjectBuilder<ModifyDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return modifyDataStream(fn.apply(new ModifyDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.open

	/**
	 * Open a closed index. For data streams, the API opens any closed backing
	 * indices.
	 * <p>
	 * A closed index is blocked for read/write operations and does not allow all
	 * operations that opened indices allow. It is not possible to index documents
	 * or to search for documents in a closed index. This allows closed indices to
	 * not have to maintain internal data structures for indexing or searching
	 * documents, resulting in a smaller overhead on the cluster.
	 * <p>
	 * When opening or closing an index, the master is responsible for restarting
	 * the index shards to reflect the new state of the index. The shards will then
	 * go through the normal recovery process. The data of opened or closed indices
	 * is automatically replicated by the cluster to ensure that enough shard copies
	 * are safely kept around at all times.
	 * <p>
	 * You can open and close multiple indices. An error is thrown if the request
	 * explicitly refers to a missing index. This behavior can be turned off by
	 * using the <code>ignore_unavailable=true</code> parameter.
	 * <p>
	 * By default, you must explicitly name the indices you are opening or closing.
	 * To open or close indices with <code>_all</code>, <code>*</code>, or other
	 * wildcard expressions, change the
	 * <code>action.destructive_requires_name</code> setting to <code>false</code>.
	 * This setting can also be changed with the cluster update settings API.
	 * <p>
	 * Closed indices consume a significant amount of disk-space which can cause
	 * problems in managed environments. Closing indices can be turned off with the
	 * cluster settings API by setting <code>cluster.indices.close.enable</code> to
	 * <code>false</code>.
	 * <p>
	 * Because opening or closing an index allocates its shards, the
	 * <code>wait_for_active_shards</code> setting on index creation applies to the
	 * <code>_open</code> and <code>_close</code> index actions as well.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-open">Documentation
	 *      on elastic.co</a>
	 */

	public OpenResponse open(OpenRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OpenRequest, OpenResponse, ErrorResponse> endpoint = (JsonEndpoint<OpenRequest, OpenResponse, ErrorResponse>) OpenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Open a closed index. For data streams, the API opens any closed backing
	 * indices.
	 * <p>
	 * A closed index is blocked for read/write operations and does not allow all
	 * operations that opened indices allow. It is not possible to index documents
	 * or to search for documents in a closed index. This allows closed indices to
	 * not have to maintain internal data structures for indexing or searching
	 * documents, resulting in a smaller overhead on the cluster.
	 * <p>
	 * When opening or closing an index, the master is responsible for restarting
	 * the index shards to reflect the new state of the index. The shards will then
	 * go through the normal recovery process. The data of opened or closed indices
	 * is automatically replicated by the cluster to ensure that enough shard copies
	 * are safely kept around at all times.
	 * <p>
	 * You can open and close multiple indices. An error is thrown if the request
	 * explicitly refers to a missing index. This behavior can be turned off by
	 * using the <code>ignore_unavailable=true</code> parameter.
	 * <p>
	 * By default, you must explicitly name the indices you are opening or closing.
	 * To open or close indices with <code>_all</code>, <code>*</code>, or other
	 * wildcard expressions, change the
	 * <code>action.destructive_requires_name</code> setting to <code>false</code>.
	 * This setting can also be changed with the cluster update settings API.
	 * <p>
	 * Closed indices consume a significant amount of disk-space which can cause
	 * problems in managed environments. Closing indices can be turned off with the
	 * cluster settings API by setting <code>cluster.indices.close.enable</code> to
	 * <code>false</code>.
	 * <p>
	 * Because opening or closing an index allocates its shards, the
	 * <code>wait_for_active_shards</code> setting on index creation applies to the
	 * <code>_open</code> and <code>_close</code> index actions as well.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-open">Documentation
	 *      on elastic.co</a>
	 */

	public final OpenResponse open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-promote-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public PromoteDataStreamResponse promoteDataStream(PromoteDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PromoteDataStreamRequest, PromoteDataStreamResponse, ErrorResponse> endpoint = (JsonEndpoint<PromoteDataStreamRequest, PromoteDataStreamResponse, ErrorResponse>) PromoteDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-promote-data-stream">Documentation
	 *      on elastic.co</a>
	 */

	public final PromoteDataStreamResponse promoteDataStream(
			Function<PromoteDataStreamRequest.Builder, ObjectBuilder<PromoteDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return promoteDataStream(fn.apply(new PromoteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-alias">Documentation
	 *      on elastic.co</a>
	 */

	public PutAliasResponse putAlias(PutAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAliasRequest, PutAliasResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAliasRequest, PutAliasResponse, ErrorResponse>) PutAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-alias">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAliasResponse putAlias(Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAlias(fn.apply(new PutAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_data_lifecycle

	/**
	 * Update data stream lifecycles. Update the data stream lifecycle of the
	 * specified data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public PutDataLifecycleResponse putDataLifecycle(PutDataLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutDataLifecycleRequest, PutDataLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutDataLifecycleRequest, PutDataLifecycleResponse, ErrorResponse>) PutDataLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update data stream lifecycles. Update the data stream lifecycle of the
	 * specified data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutDataLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-data-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final PutDataLifecycleResponse putDataLifecycle(
			Function<PutDataLifecycleRequest.Builder, ObjectBuilder<PutDataLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return putDataLifecycle(fn.apply(new PutDataLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Create or update an index template. Index templates define settings,
	 * mappings, and aliases that can be applied automatically to new indices.
	 * <p>
	 * Elasticsearch applies templates to new indices based on an wildcard pattern
	 * that matches the index name. Index templates are applied during data stream
	 * or index creation. For data streams, these settings and mappings are applied
	 * when the stream's backing indices are created. Settings and mappings
	 * specified in a create index API request override any settings or mappings
	 * specified in an index template. Changes to index templates do not affect
	 * existing indices, including the existing backing indices of a data stream.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in index templates.
	 * You can include comments anywhere in the request body, except before the
	 * opening curly bracket.
	 * <p>
	 * <strong>Multiple matching templates</strong>
	 * <p>
	 * If multiple index templates match the name of a new index or data stream, the
	 * template with the highest priority is used.
	 * <p>
	 * Multiple templates with overlapping index patterns at the same priority are
	 * not allowed and an error will be thrown when attempting to create a template
	 * matching an existing index template at identical priorities.
	 * <p>
	 * <strong>Composing aliases, mappings, and settings</strong>
	 * <p>
	 * When multiple component templates are specified in the
	 * <code>composed_of</code> field for an index template, they are merged in the
	 * order specified, meaning that later component templates override earlier
	 * component templates. Any mappings, settings, or aliases from the parent index
	 * template are merged in next. Finally, any configuration on the index request
	 * itself is merged. Mapping definitions are merged recursively, which means
	 * that later mapping components can introduce new field mappings and update the
	 * mapping configuration. If a field mapping is already contained in an earlier
	 * component, its definition will be completely overwritten by the later one.
	 * This recursive merging strategy applies not only to field mappings, but also
	 * root options like <code>dynamic_templates</code> and <code>meta</code>. If an
	 * earlier component contains a <code>dynamic_templates</code> block, then by
	 * default new <code>dynamic_templates</code> entries are appended onto the end.
	 * If an entry already exists with the same key, then it is overwritten by the
	 * new definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public PutIndexTemplateResponse putIndexTemplate(PutIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse>) PutIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an index template. Index templates define settings,
	 * mappings, and aliases that can be applied automatically to new indices.
	 * <p>
	 * Elasticsearch applies templates to new indices based on an wildcard pattern
	 * that matches the index name. Index templates are applied during data stream
	 * or index creation. For data streams, these settings and mappings are applied
	 * when the stream's backing indices are created. Settings and mappings
	 * specified in a create index API request override any settings or mappings
	 * specified in an index template. Changes to index templates do not affect
	 * existing indices, including the existing backing indices of a data stream.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in index templates.
	 * You can include comments anywhere in the request body, except before the
	 * opening curly bracket.
	 * <p>
	 * <strong>Multiple matching templates</strong>
	 * <p>
	 * If multiple index templates match the name of a new index or data stream, the
	 * template with the highest priority is used.
	 * <p>
	 * Multiple templates with overlapping index patterns at the same priority are
	 * not allowed and an error will be thrown when attempting to create a template
	 * matching an existing index template at identical priorities.
	 * <p>
	 * <strong>Composing aliases, mappings, and settings</strong>
	 * <p>
	 * When multiple component templates are specified in the
	 * <code>composed_of</code> field for an index template, they are merged in the
	 * order specified, meaning that later component templates override earlier
	 * component templates. Any mappings, settings, or aliases from the parent index
	 * template are merged in next. Finally, any configuration on the index request
	 * itself is merged. Mapping definitions are merged recursively, which means
	 * that later mapping components can introduce new field mappings and update the
	 * mapping configuration. If a field mapping is already contained in an earlier
	 * component, its definition will be completely overwritten by the later one.
	 * This recursive merging strategy applies not only to field mappings, but also
	 * root options like <code>dynamic_templates</code> and <code>meta</code>. If an
	 * earlier component contains a <code>dynamic_templates</code> block, then by
	 * default new <code>dynamic_templates</code> entries are appended onto the end.
	 * If an entry already exists with the same key, then it is overwritten by the
	 * new definition.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public final PutIndexTemplateResponse putIndexTemplate(
			Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Update field mappings. Add new fields to an existing data stream or index.
	 * You can use the update mapping API to:
	 * <ul>
	 * <li>Add a new field to an existing index</li>
	 * <li>Update mappings for multiple indices in a single request</li>
	 * <li>Add new properties to an object field</li>
	 * <li>Enable multi-fields for an existing field</li>
	 * <li>Update supported mapping parameters</li>
	 * <li>Change a field's mapping using reindexing</li>
	 * <li>Rename a field using a field alias</li>
	 * </ul>
	 * <p>
	 * Learn how to use the update mapping API with practical examples in the
	 * <a href=
	 * "https://www.elastic.co/docs/manage-data/data-store/mapping/update-mappings-examples">Update
	 * mapping API examples</a> guide.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public PutMappingResponse putMapping(PutMappingRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutMappingRequest, PutMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<PutMappingRequest, PutMappingResponse, ErrorResponse>) PutMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update field mappings. Add new fields to an existing data stream or index.
	 * You can use the update mapping API to:
	 * <ul>
	 * <li>Add a new field to an existing index</li>
	 * <li>Update mappings for multiple indices in a single request</li>
	 * <li>Add new properties to an object field</li>
	 * <li>Enable multi-fields for an existing field</li>
	 * <li>Update supported mapping parameters</li>
	 * <li>Change a field's mapping using reindexing</li>
	 * <li>Rename a field using a field alias</li>
	 * </ul>
	 * <p>
	 * Learn how to use the update mapping API with practical examples in the
	 * <a href=
	 * "https://www.elastic.co/docs/manage-data/data-store/mapping/update-mappings-examples">Update
	 * mapping API examples</a> guide.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public final PutMappingResponse putMapping(Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return putMapping(fn.apply(new PutMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Update index settings. Changes dynamic index settings in real time. For data
	 * streams, index setting changes are applied to all backing indices by default.
	 * <p>
	 * To revert a setting to the default value, use a null value. The list of
	 * per-index settings that can be updated dynamically on live indices can be
	 * found in index settings documentation. To preserve existing settings from
	 * being updated, set the <code>preserve_existing</code> parameter to
	 * <code>true</code>.
	 * <p>
	 * For performance optimization during bulk indexing, you can disable the
	 * refresh interval. Refer to <a href=
	 * "https://www.elastic.co/docs/deploy-manage/production-guidance/optimize-performance/indexing-speed#disable-refresh-interval">disable
	 * refresh interval</a> for an example. There are multiple valid ways to
	 * represent index settings in the request body. You can specify only the
	 * setting, for example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;number_of_replicas&quot;: 1
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can use an <code>index</code> setting object:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;index&quot;: {
	 *     &quot;number_of_replicas&quot;: 1
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can use dot annotation:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;index.number_of_replicas&quot;: 1
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can embed any of the aforementioned options in a <code>settings</code>
	 * object. For example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;settings&quot;: {
	 *     &quot;index&quot;: {
	 *       &quot;number_of_replicas&quot;: 1
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * NOTE: You can only define new analyzers on closed indices. To add an
	 * analyzer, you must close the index, define the analyzer, and reopen the
	 * index. You cannot close the write index of a data stream. To update the
	 * analyzer for a data stream's write index and future backing indices, update
	 * the analyzer in the index template used by the stream. Then roll over the
	 * data stream to apply the new analyzer to the stream's write index and future
	 * backing indices. This affects searches and any new data added to the stream
	 * after the rollover. However, it does not affect the data stream's backing
	 * indices or their existing data. To change the analyzer for existing backing
	 * indices, you must create a new data stream and reindex your data into it.
	 * Refer to <a href=
	 * "https://www.elastic.co/docs/manage-data/data-store/text-analysis/specify-an-analyzer#update-analyzers-on-existing-indices">updating
	 * analyzers on existing indices</a> for step-by-step examples.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-settings">Documentation
	 *      on elastic.co</a>
	 */

	public PutIndicesSettingsResponse putSettings(PutIndicesSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutIndicesSettingsRequest, PutIndicesSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<PutIndicesSettingsRequest, PutIndicesSettingsResponse, ErrorResponse>) PutIndicesSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update index settings. Changes dynamic index settings in real time. For data
	 * streams, index setting changes are applied to all backing indices by default.
	 * <p>
	 * To revert a setting to the default value, use a null value. The list of
	 * per-index settings that can be updated dynamically on live indices can be
	 * found in index settings documentation. To preserve existing settings from
	 * being updated, set the <code>preserve_existing</code> parameter to
	 * <code>true</code>.
	 * <p>
	 * For performance optimization during bulk indexing, you can disable the
	 * refresh interval. Refer to <a href=
	 * "https://www.elastic.co/docs/deploy-manage/production-guidance/optimize-performance/indexing-speed#disable-refresh-interval">disable
	 * refresh interval</a> for an example. There are multiple valid ways to
	 * represent index settings in the request body. You can specify only the
	 * setting, for example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;number_of_replicas&quot;: 1
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can use an <code>index</code> setting object:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;index&quot;: {
	 *     &quot;number_of_replicas&quot;: 1
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can use dot annotation:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;index.number_of_replicas&quot;: 1
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can embed any of the aforementioned options in a <code>settings</code>
	 * object. For example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;settings&quot;: {
	 *     &quot;index&quot;: {
	 *       &quot;number_of_replicas&quot;: 1
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * NOTE: You can only define new analyzers on closed indices. To add an
	 * analyzer, you must close the index, define the analyzer, and reopen the
	 * index. You cannot close the write index of a data stream. To update the
	 * analyzer for a data stream's write index and future backing indices, update
	 * the analyzer in the index template used by the stream. Then roll over the
	 * data stream to apply the new analyzer to the stream's write index and future
	 * backing indices. This affects searches and any new data added to the stream
	 * after the rollover. However, it does not affect the data stream's backing
	 * indices or their existing data. To change the analyzer for existing backing
	 * indices, you must create a new data stream and reindex your data into it.
	 * Refer to <a href=
	 * "https://www.elastic.co/docs/manage-data/data-store/text-analysis/specify-an-analyzer#update-analyzers-on-existing-indices">updating
	 * analyzers on existing indices</a> for step-by-step examples.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIndicesSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final PutIndicesSettingsResponse putSettings(
			Function<PutIndicesSettingsRequest.Builder, ObjectBuilder<PutIndicesSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return putSettings(fn.apply(new PutIndicesSettingsRequest.Builder()).build());
	}

	/**
	 * Update index settings. Changes dynamic index settings in real time. For data
	 * streams, index setting changes are applied to all backing indices by default.
	 * <p>
	 * To revert a setting to the default value, use a null value. The list of
	 * per-index settings that can be updated dynamically on live indices can be
	 * found in index settings documentation. To preserve existing settings from
	 * being updated, set the <code>preserve_existing</code> parameter to
	 * <code>true</code>.
	 * <p>
	 * For performance optimization during bulk indexing, you can disable the
	 * refresh interval. Refer to <a href=
	 * "https://www.elastic.co/docs/deploy-manage/production-guidance/optimize-performance/indexing-speed#disable-refresh-interval">disable
	 * refresh interval</a> for an example. There are multiple valid ways to
	 * represent index settings in the request body. You can specify only the
	 * setting, for example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;number_of_replicas&quot;: 1
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can use an <code>index</code> setting object:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;index&quot;: {
	 *     &quot;number_of_replicas&quot;: 1
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can use dot annotation:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;index.number_of_replicas&quot;: 1
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * Or you can embed any of the aforementioned options in a <code>settings</code>
	 * object. For example:
	 * 
	 * <pre>
	 * <code>{
	 *   &quot;settings&quot;: {
	 *     &quot;index&quot;: {
	 *       &quot;number_of_replicas&quot;: 1
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * NOTE: You can only define new analyzers on closed indices. To add an
	 * analyzer, you must close the index, define the analyzer, and reopen the
	 * index. You cannot close the write index of a data stream. To update the
	 * analyzer for a data stream's write index and future backing indices, update
	 * the analyzer in the index template used by the stream. Then roll over the
	 * data stream to apply the new analyzer to the stream's write index and future
	 * backing indices. This affects searches and any new data added to the stream
	 * after the rollover. However, it does not affect the data stream's backing
	 * indices or their existing data. To change the analyzer for existing backing
	 * indices, you must create a new data stream and reindex your data into it.
	 * Refer to <a href=
	 * "https://www.elastic.co/docs/manage-data/data-store/text-analysis/specify-an-analyzer#update-analyzers-on-existing-indices">updating
	 * analyzers on existing indices</a> for step-by-step examples.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-settings">Documentation
	 *      on elastic.co</a>
	 */

	public PutIndicesSettingsResponse putSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PutIndicesSettingsRequest.Builder().build(),
				PutIndicesSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Create or update a legacy index template. Index templates define settings,
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
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in index templates.
	 * You can include comments anywhere in the request body, except before the
	 * opening curly bracket.
	 * <p>
	 * <strong>Indices matching multiple templates</strong>
	 * <p>
	 * Multiple index templates can potentially match an index, in this case, both
	 * the settings and mappings are merged into the final configuration of the
	 * index. The order of the merging can be controlled using the order parameter,
	 * with lower order being applied first, and higher orders overriding them.
	 * NOTE: Multiple matching templates with the same order value will result in a
	 * non-deterministic merging order.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-template">Documentation
	 *      on elastic.co</a>
	 */

	public PutTemplateResponse putTemplate(PutTemplateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutTemplateRequest, PutTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<PutTemplateRequest, PutTemplateResponse, ErrorResponse>) PutTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a legacy index template. Index templates define settings,
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
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in index templates.
	 * You can include comments anywhere in the request body, except before the
	 * opening curly bracket.
	 * <p>
	 * <strong>Indices matching multiple templates</strong>
	 * <p>
	 * Multiple index templates can potentially match an index, in this case, both
	 * the settings and mappings are merged into the final configuration of the
	 * index. The order of the merging can be controlled using the order parameter,
	 * with lower order being applied first, and higher orders overriding them.
	 * NOTE: Multiple matching templates with the same order value will result in a
	 * non-deterministic merging order.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-put-template">Documentation
	 *      on elastic.co</a>
	 */

	public final PutTemplateResponse putTemplate(
			Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Get index recovery information. Get information about ongoing and completed
	 * shard recoveries for one or more indices. For data streams, the API returns
	 * information for the stream's backing indices.
	 * <p>
	 * All recoveries, whether ongoing or complete, are kept in the cluster state
	 * and may be reported on at any time.
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-recovery">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery(RecoveryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> endpoint = (JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse>) RecoveryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index recovery information. Get information about ongoing and completed
	 * shard recoveries for one or more indices. For data streams, the API returns
	 * information for the stream's backing indices.
	 * <p>
	 * All recoveries, whether ongoing or complete, are kept in the cluster state
	 * and may be reported on at any time.
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-recovery">Documentation
	 *      on elastic.co</a>
	 */

	public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException, ElasticsearchException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Get index recovery information. Get information about ongoing and completed
	 * shard recoveries for one or more indices. For data streams, the API returns
	 * information for the stream's backing indices.
	 * <p>
	 * All recoveries, whether ongoing or complete, are kept in the cluster state
	 * and may be reported on at any time.
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-recovery">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RecoveryRequest.Builder().build(), RecoveryRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Refresh an index. A refresh makes recent operations performed on one or more
	 * indices available for search. For data streams, the API runs the refresh
	 * operation on the stream’s backing indices.
	 * <p>
	 * By default, Elasticsearch periodically refreshes indices every second, but
	 * only on indices that have received one search request or more in the last 30
	 * seconds. You can change this default interval with the
	 * <code>index.refresh_interval</code> setting.
	 * <p>
	 * Refresh requests are synchronous and do not return a response until the
	 * refresh operation completes.
	 * <p>
	 * Refreshes are resource-intensive. To ensure good cluster performance, it's
	 * recommended to wait for Elasticsearch's periodic refresh rather than
	 * performing an explicit refresh when possible.
	 * <p>
	 * If your application workflow indexes documents and then runs a search to
	 * retrieve the indexed document, it's recommended to use the index API's
	 * <code>refresh=wait_for</code> query parameter option. This option ensures the
	 * indexing operation waits for a periodic refresh before running the search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-refresh">Documentation
	 *      on elastic.co</a>
	 */

	public RefreshResponse refresh(RefreshRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RefreshRequest, RefreshResponse, ErrorResponse> endpoint = (JsonEndpoint<RefreshRequest, RefreshResponse, ErrorResponse>) RefreshRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Refresh an index. A refresh makes recent operations performed on one or more
	 * indices available for search. For data streams, the API runs the refresh
	 * operation on the stream’s backing indices.
	 * <p>
	 * By default, Elasticsearch periodically refreshes indices every second, but
	 * only on indices that have received one search request or more in the last 30
	 * seconds. You can change this default interval with the
	 * <code>index.refresh_interval</code> setting.
	 * <p>
	 * Refresh requests are synchronous and do not return a response until the
	 * refresh operation completes.
	 * <p>
	 * Refreshes are resource-intensive. To ensure good cluster performance, it's
	 * recommended to wait for Elasticsearch's periodic refresh rather than
	 * performing an explicit refresh when possible.
	 * <p>
	 * If your application workflow indexes documents and then runs a search to
	 * retrieve the indexed document, it's recommended to use the index API's
	 * <code>refresh=wait_for</code> query parameter option. This option ensures the
	 * indexing operation waits for a periodic refresh before running the search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RefreshRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-refresh">Documentation
	 *      on elastic.co</a>
	 */

	public final RefreshResponse refresh(Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn)
			throws IOException, ElasticsearchException {
		return refresh(fn.apply(new RefreshRequest.Builder()).build());
	}

	/**
	 * Refresh an index. A refresh makes recent operations performed on one or more
	 * indices available for search. For data streams, the API runs the refresh
	 * operation on the stream’s backing indices.
	 * <p>
	 * By default, Elasticsearch periodically refreshes indices every second, but
	 * only on indices that have received one search request or more in the last 30
	 * seconds. You can change this default interval with the
	 * <code>index.refresh_interval</code> setting.
	 * <p>
	 * Refresh requests are synchronous and do not return a response until the
	 * refresh operation completes.
	 * <p>
	 * Refreshes are resource-intensive. To ensure good cluster performance, it's
	 * recommended to wait for Elasticsearch's periodic refresh rather than
	 * performing an explicit refresh when possible.
	 * <p>
	 * If your application workflow indexes documents and then runs a search to
	 * retrieve the indexed document, it's recommended to use the index API's
	 * <code>refresh=wait_for</code> query parameter option. This option ensures the
	 * indexing operation waits for a periodic refresh before running the search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-refresh">Documentation
	 *      on elastic.co</a>
	 */

	public RefreshResponse refresh() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RefreshRequest.Builder().build(), RefreshRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-reload-search-analyzers">Documentation
	 *      on elastic.co</a>
	 */

	public ReloadSearchAnalyzersResponse reloadSearchAnalyzers(ReloadSearchAnalyzersRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReloadSearchAnalyzersRequest, ReloadSearchAnalyzersResponse, ErrorResponse> endpoint = (JsonEndpoint<ReloadSearchAnalyzersRequest, ReloadSearchAnalyzersResponse, ErrorResponse>) ReloadSearchAnalyzersRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-reload-search-analyzers">Documentation
	 *      on elastic.co</a>
	 */

	public final ReloadSearchAnalyzersResponse reloadSearchAnalyzers(
			Function<ReloadSearchAnalyzersRequest.Builder, ObjectBuilder<ReloadSearchAnalyzersRequest>> fn)
			throws IOException, ElasticsearchException {
		return reloadSearchAnalyzers(fn.apply(new ReloadSearchAnalyzersRequest.Builder()).build());
	}

	// ----- Endpoint: indices.resolve_cluster

	/**
	 * Resolve the cluster.
	 * <p>
	 * Resolve the specified index expressions to return information about each
	 * cluster, including the local &quot;querying&quot; cluster, if included. If no
	 * index expression is provided, the API will return information about all the
	 * remote clusters that are configured on the querying cluster.
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
	 * to each remote cluster specified in the index expression. Note that this
	 * endpoint actively attempts to contact the remote clusters, unlike the
	 * <code>remote/info</code> endpoint.</li>
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
	 * <p>
	 * For example,
	 * <code>GET /_resolve/cluster/my-index-*,cluster*:my-index-*</code> returns
	 * information about the local cluster and all remotely configured clusters that
	 * start with the alias <code>cluster*</code>. Each cluster returns information
	 * about whether it has any indices, aliases or data streams that match
	 * <code>my-index-*</code>.
	 * <h2>Note on backwards compatibility</h2>
	 * <p>
	 * The ability to query without an index expression was added in version 8.18,
	 * so when querying remote clusters older than that, the local cluster will send
	 * the index expression <code>dummy*</code> to those remote clusters. Thus, if
	 * an errors occur, you may see a reference to that index expression even though
	 * you didn't request it. If it causes a problem, you can instead include an
	 * index expression like <code>*:*</code> to bypass the issue.
	 * <h2>Advantages of using this endpoint before a cross-cluster search</h2>
	 * <p>
	 * You may want to exclude a cluster or index from a search when:
	 * <ul>
	 * <li>A remote cluster is not currently connected and is configured with
	 * <code>skip_unavailable=false</code>. Running a cross-cluster search under
	 * those conditions will cause the entire search to fail.</li>
	 * <li>A cluster has no matching indices, aliases or data streams for the index
	 * expression (or your user does not have permissions to search them). For
	 * example, suppose your index expression is <code>logs*,remote1:logs*</code>
	 * and the remote1 cluster has no indices, aliases or data streams that match
	 * <code>logs*</code>. In that case, that cluster will return no results from
	 * that cluster if you include it in a cross-cluster search.</li>
	 * <li>The index expression (combined with any query parameters you specify)
	 * will likely cause an exception to be thrown when you do the search. In these
	 * cases, the &quot;error&quot; field in the <code>_resolve/cluster</code>
	 * response will be present. (This is also where security/permission errors will
	 * be shown.)</li>
	 * <li>A remote cluster is an older version that does not support the feature
	 * you want to use in your search.</li>
	 * </ul>
	 * <h2>Test availability of remote clusters</h2>
	 * <p>
	 * The <code>remote/info</code> endpoint is commonly used to test whether the
	 * &quot;local&quot; cluster (the cluster being queried) is connected to its
	 * remote clusters, but it does not necessarily reflect whether the remote
	 * cluster is available or not. The remote cluster may be available, while the
	 * local cluster is not currently connected to it.
	 * <p>
	 * You can use the <code>_resolve/cluster</code> API to attempt to reconnect to
	 * remote clusters. For example with <code>GET _resolve/cluster</code> or
	 * <code>GET _resolve/cluster/*:*</code>. The <code>connected</code> field in
	 * the response will indicate whether it was successful. If a connection was
	 * (re-)established, this will also cause the <code>remote/info</code> endpoint
	 * to now indicate a connected status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-resolve-cluster">Documentation
	 *      on elastic.co</a>
	 */

	public ResolveClusterResponse resolveCluster(ResolveClusterRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResolveClusterRequest, ResolveClusterResponse, ErrorResponse> endpoint = (JsonEndpoint<ResolveClusterRequest, ResolveClusterResponse, ErrorResponse>) ResolveClusterRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Resolve the cluster.
	 * <p>
	 * Resolve the specified index expressions to return information about each
	 * cluster, including the local &quot;querying&quot; cluster, if included. If no
	 * index expression is provided, the API will return information about all the
	 * remote clusters that are configured on the querying cluster.
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
	 * to each remote cluster specified in the index expression. Note that this
	 * endpoint actively attempts to contact the remote clusters, unlike the
	 * <code>remote/info</code> endpoint.</li>
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
	 * <p>
	 * For example,
	 * <code>GET /_resolve/cluster/my-index-*,cluster*:my-index-*</code> returns
	 * information about the local cluster and all remotely configured clusters that
	 * start with the alias <code>cluster*</code>. Each cluster returns information
	 * about whether it has any indices, aliases or data streams that match
	 * <code>my-index-*</code>.
	 * <h2>Note on backwards compatibility</h2>
	 * <p>
	 * The ability to query without an index expression was added in version 8.18,
	 * so when querying remote clusters older than that, the local cluster will send
	 * the index expression <code>dummy*</code> to those remote clusters. Thus, if
	 * an errors occur, you may see a reference to that index expression even though
	 * you didn't request it. If it causes a problem, you can instead include an
	 * index expression like <code>*:*</code> to bypass the issue.
	 * <h2>Advantages of using this endpoint before a cross-cluster search</h2>
	 * <p>
	 * You may want to exclude a cluster or index from a search when:
	 * <ul>
	 * <li>A remote cluster is not currently connected and is configured with
	 * <code>skip_unavailable=false</code>. Running a cross-cluster search under
	 * those conditions will cause the entire search to fail.</li>
	 * <li>A cluster has no matching indices, aliases or data streams for the index
	 * expression (or your user does not have permissions to search them). For
	 * example, suppose your index expression is <code>logs*,remote1:logs*</code>
	 * and the remote1 cluster has no indices, aliases or data streams that match
	 * <code>logs*</code>. In that case, that cluster will return no results from
	 * that cluster if you include it in a cross-cluster search.</li>
	 * <li>The index expression (combined with any query parameters you specify)
	 * will likely cause an exception to be thrown when you do the search. In these
	 * cases, the &quot;error&quot; field in the <code>_resolve/cluster</code>
	 * response will be present. (This is also where security/permission errors will
	 * be shown.)</li>
	 * <li>A remote cluster is an older version that does not support the feature
	 * you want to use in your search.</li>
	 * </ul>
	 * <h2>Test availability of remote clusters</h2>
	 * <p>
	 * The <code>remote/info</code> endpoint is commonly used to test whether the
	 * &quot;local&quot; cluster (the cluster being queried) is connected to its
	 * remote clusters, but it does not necessarily reflect whether the remote
	 * cluster is available or not. The remote cluster may be available, while the
	 * local cluster is not currently connected to it.
	 * <p>
	 * You can use the <code>_resolve/cluster</code> API to attempt to reconnect to
	 * remote clusters. For example with <code>GET _resolve/cluster</code> or
	 * <code>GET _resolve/cluster/*:*</code>. The <code>connected</code> field in
	 * the response will indicate whether it was successful. If a connection was
	 * (re-)established, this will also cause the <code>remote/info</code> endpoint
	 * to now indicate a connected status.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResolveClusterRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-resolve-cluster">Documentation
	 *      on elastic.co</a>
	 */

	public final ResolveClusterResponse resolveCluster(
			Function<ResolveClusterRequest.Builder, ObjectBuilder<ResolveClusterRequest>> fn)
			throws IOException, ElasticsearchException {
		return resolveCluster(fn.apply(new ResolveClusterRequest.Builder()).build());
	}

	/**
	 * Resolve the cluster.
	 * <p>
	 * Resolve the specified index expressions to return information about each
	 * cluster, including the local &quot;querying&quot; cluster, if included. If no
	 * index expression is provided, the API will return information about all the
	 * remote clusters that are configured on the querying cluster.
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
	 * to each remote cluster specified in the index expression. Note that this
	 * endpoint actively attempts to contact the remote clusters, unlike the
	 * <code>remote/info</code> endpoint.</li>
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
	 * <p>
	 * For example,
	 * <code>GET /_resolve/cluster/my-index-*,cluster*:my-index-*</code> returns
	 * information about the local cluster and all remotely configured clusters that
	 * start with the alias <code>cluster*</code>. Each cluster returns information
	 * about whether it has any indices, aliases or data streams that match
	 * <code>my-index-*</code>.
	 * <h2>Note on backwards compatibility</h2>
	 * <p>
	 * The ability to query without an index expression was added in version 8.18,
	 * so when querying remote clusters older than that, the local cluster will send
	 * the index expression <code>dummy*</code> to those remote clusters. Thus, if
	 * an errors occur, you may see a reference to that index expression even though
	 * you didn't request it. If it causes a problem, you can instead include an
	 * index expression like <code>*:*</code> to bypass the issue.
	 * <h2>Advantages of using this endpoint before a cross-cluster search</h2>
	 * <p>
	 * You may want to exclude a cluster or index from a search when:
	 * <ul>
	 * <li>A remote cluster is not currently connected and is configured with
	 * <code>skip_unavailable=false</code>. Running a cross-cluster search under
	 * those conditions will cause the entire search to fail.</li>
	 * <li>A cluster has no matching indices, aliases or data streams for the index
	 * expression (or your user does not have permissions to search them). For
	 * example, suppose your index expression is <code>logs*,remote1:logs*</code>
	 * and the remote1 cluster has no indices, aliases or data streams that match
	 * <code>logs*</code>. In that case, that cluster will return no results from
	 * that cluster if you include it in a cross-cluster search.</li>
	 * <li>The index expression (combined with any query parameters you specify)
	 * will likely cause an exception to be thrown when you do the search. In these
	 * cases, the &quot;error&quot; field in the <code>_resolve/cluster</code>
	 * response will be present. (This is also where security/permission errors will
	 * be shown.)</li>
	 * <li>A remote cluster is an older version that does not support the feature
	 * you want to use in your search.</li>
	 * </ul>
	 * <h2>Test availability of remote clusters</h2>
	 * <p>
	 * The <code>remote/info</code> endpoint is commonly used to test whether the
	 * &quot;local&quot; cluster (the cluster being queried) is connected to its
	 * remote clusters, but it does not necessarily reflect whether the remote
	 * cluster is available or not. The remote cluster may be available, while the
	 * local cluster is not currently connected to it.
	 * <p>
	 * You can use the <code>_resolve/cluster</code> API to attempt to reconnect to
	 * remote clusters. For example with <code>GET _resolve/cluster</code> or
	 * <code>GET _resolve/cluster/*:*</code>. The <code>connected</code> field in
	 * the response will indicate whether it was successful. If a connection was
	 * (re-)established, this will also cause the <code>remote/info</code> endpoint
	 * to now indicate a connected status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-resolve-cluster">Documentation
	 *      on elastic.co</a>
	 */

	public ResolveClusterResponse resolveCluster() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ResolveClusterRequest.Builder().build(),
				ResolveClusterRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Resolve indices. Resolve the names and/or index patterns for indices,
	 * aliases, and data streams. Multiple patterns and remote clusters are
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-resolve-index">Documentation
	 *      on elastic.co</a>
	 */

	public ResolveIndexResponse resolveIndex(ResolveIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResolveIndexRequest, ResolveIndexResponse, ErrorResponse> endpoint = (JsonEndpoint<ResolveIndexRequest, ResolveIndexResponse, ErrorResponse>) ResolveIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-resolve-index">Documentation
	 *      on elastic.co</a>
	 */

	public final ResolveIndexResponse resolveIndex(
			Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.rollover

	/**
	 * Roll over to a new index. TIP: We recommend using the index lifecycle
	 * rollover action to automate rollovers. However, Serverless does not support
	 * Index Lifecycle Management (ILM), so don't use this approach in the
	 * Serverless context.
	 * <p>
	 * The rollover API creates a new index for a data stream or index alias. The
	 * API behavior depends on the rollover target.
	 * <p>
	 * <strong>Roll over a data stream</strong>
	 * <p>
	 * If you roll over a data stream, the API creates a new write index for the
	 * stream. The stream's previous write index becomes a regular backing index. A
	 * rollover also increments the data stream's generation.
	 * <p>
	 * <strong>Roll over an index alias with a write index</strong>
	 * <p>
	 * TIP: Prior to Elasticsearch 7.9, you'd typically use an index alias with a
	 * write index to manage time series data. Data streams replace this
	 * functionality, require less maintenance, and automatically integrate with
	 * data tiers.
	 * <p>
	 * If an index alias points to multiple indices, one of the indices must be a
	 * write index. The rollover API creates a new write index for the alias with
	 * <code>is_write_index</code> set to <code>true</code>. The API also
	 * <code>sets is_write_index</code> to <code>false</code> for the previous write
	 * index.
	 * <p>
	 * <strong>Roll over an index alias with one index</strong>
	 * <p>
	 * If you roll over an index alias that points to only one index, the API
	 * creates a new index for the alias and removes the original index from the
	 * alias.
	 * <p>
	 * NOTE: A rollover creates a new index and is subject to the
	 * <code>wait_for_active_shards</code> setting.
	 * <p>
	 * <strong>Increment index names for an alias</strong>
	 * <p>
	 * When you roll over an index alias, you can specify a name for the new index.
	 * If you don't specify a name and the current index ends with <code>-</code>
	 * and a number, such as <code>my-index-000001</code> or
	 * <code>my-index-3</code>, the new index name increments that number. For
	 * example, if you roll over an alias with a current index of
	 * <code>my-index-000001</code>, the rollover creates a new index named
	 * <code>my-index-000002</code>. This number is always six characters and
	 * zero-padded, regardless of the previous index's name.
	 * <p>
	 * If you use an index alias for time series data, you can use date math in the
	 * index name to track the rollover date. For example, you can create an alias
	 * that points to an index named <code>&lt;my-index-{now/d}-000001&gt;</code>.
	 * If you create the index on May 6, 2099, the index's name is
	 * <code>my-index-2099.05.06-000001</code>. If you roll over the alias on May 7,
	 * 2099, the new index's name is <code>my-index-2099.05.07-000002</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-rollover">Documentation
	 *      on elastic.co</a>
	 */

	public RolloverResponse rollover(RolloverRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RolloverRequest, RolloverResponse, ErrorResponse> endpoint = (JsonEndpoint<RolloverRequest, RolloverResponse, ErrorResponse>) RolloverRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Roll over to a new index. TIP: We recommend using the index lifecycle
	 * rollover action to automate rollovers. However, Serverless does not support
	 * Index Lifecycle Management (ILM), so don't use this approach in the
	 * Serverless context.
	 * <p>
	 * The rollover API creates a new index for a data stream or index alias. The
	 * API behavior depends on the rollover target.
	 * <p>
	 * <strong>Roll over a data stream</strong>
	 * <p>
	 * If you roll over a data stream, the API creates a new write index for the
	 * stream. The stream's previous write index becomes a regular backing index. A
	 * rollover also increments the data stream's generation.
	 * <p>
	 * <strong>Roll over an index alias with a write index</strong>
	 * <p>
	 * TIP: Prior to Elasticsearch 7.9, you'd typically use an index alias with a
	 * write index to manage time series data. Data streams replace this
	 * functionality, require less maintenance, and automatically integrate with
	 * data tiers.
	 * <p>
	 * If an index alias points to multiple indices, one of the indices must be a
	 * write index. The rollover API creates a new write index for the alias with
	 * <code>is_write_index</code> set to <code>true</code>. The API also
	 * <code>sets is_write_index</code> to <code>false</code> for the previous write
	 * index.
	 * <p>
	 * <strong>Roll over an index alias with one index</strong>
	 * <p>
	 * If you roll over an index alias that points to only one index, the API
	 * creates a new index for the alias and removes the original index from the
	 * alias.
	 * <p>
	 * NOTE: A rollover creates a new index and is subject to the
	 * <code>wait_for_active_shards</code> setting.
	 * <p>
	 * <strong>Increment index names for an alias</strong>
	 * <p>
	 * When you roll over an index alias, you can specify a name for the new index.
	 * If you don't specify a name and the current index ends with <code>-</code>
	 * and a number, such as <code>my-index-000001</code> or
	 * <code>my-index-3</code>, the new index name increments that number. For
	 * example, if you roll over an alias with a current index of
	 * <code>my-index-000001</code>, the rollover creates a new index named
	 * <code>my-index-000002</code>. This number is always six characters and
	 * zero-padded, regardless of the previous index's name.
	 * <p>
	 * If you use an index alias for time series data, you can use date math in the
	 * index name to track the rollover date. For example, you can create an alias
	 * that points to an index named <code>&lt;my-index-{now/d}-000001&gt;</code>.
	 * If you create the index on May 6, 2099, the index's name is
	 * <code>my-index-2099.05.06-000001</code>. If you roll over the alias on May 7,
	 * 2099, the new index's name is <code>my-index-2099.05.07-000002</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RolloverRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-rollover">Documentation
	 *      on elastic.co</a>
	 */

	public final RolloverResponse rollover(Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn)
			throws IOException, ElasticsearchException {
		return rollover(fn.apply(new RolloverRequest.Builder()).build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Get index segments. Get low-level information about the Lucene segments in
	 * index shards. For data streams, the API returns information about the
	 * stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-segments">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments(SegmentsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse> endpoint = (JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse>) SegmentsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-segments">Documentation
	 *      on elastic.co</a>
	 */

	public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException, ElasticsearchException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Get index segments. Get low-level information about the Lucene segments in
	 * index shards. For data streams, the API returns information about the
	 * stream's backing indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-segments">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SegmentsRequest.Builder().build(), SegmentsRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-shard-stores">Documentation
	 *      on elastic.co</a>
	 */

	public ShardStoresResponse shardStores(ShardStoresRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ShardStoresRequest, ShardStoresResponse, ErrorResponse> endpoint = (JsonEndpoint<ShardStoresRequest, ShardStoresResponse, ErrorResponse>) ShardStoresRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-shard-stores">Documentation
	 *      on elastic.co</a>
	 */

	public final ShardStoresResponse shardStores(
			Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-shard-stores">Documentation
	 *      on elastic.co</a>
	 */

	public ShardStoresResponse shardStores() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ShardStoresRequest.Builder().build(), ShardStoresRequest._ENDPOINT,
				this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-shrink">Documentation
	 *      on elastic.co</a>
	 */

	public ShrinkResponse shrink(ShrinkRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ShrinkRequest, ShrinkResponse, ErrorResponse> endpoint = (JsonEndpoint<ShrinkRequest, ShrinkResponse, ErrorResponse>) ShrinkRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-shrink">Documentation
	 *      on elastic.co</a>
	 */

	public final ShrinkResponse shrink(Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn)
			throws IOException, ElasticsearchException {
		return shrink(fn.apply(new ShrinkRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_index_template

	/**
	 * Simulate an index. Get the index configuration that would be applied to the
	 * specified index from an existing index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-simulate-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateIndexTemplateResponse simulateIndexTemplate(SimulateIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse>) SimulateIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Simulate an index. Get the index configuration that would be applied to the
	 * specified index from an existing index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-simulate-index-template">Documentation
	 *      on elastic.co</a>
	 */

	public final SimulateIndexTemplateResponse simulateIndexTemplate(
			Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate an index template. Get the index configuration that would be applied
	 * by a particular index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-simulate-template">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateTemplateResponse simulateTemplate(SimulateTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SimulateTemplateRequest, SimulateTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<SimulateTemplateRequest, SimulateTemplateResponse, ErrorResponse>) SimulateTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Simulate an index template. Get the index configuration that would be applied
	 * by a particular index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-simulate-template">Documentation
	 *      on elastic.co</a>
	 */

	public final SimulateTemplateResponse simulateTemplate(
			Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build());
	}

	/**
	 * Simulate an index template. Get the index configuration that would be applied
	 * by a particular index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-simulate-template">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateTemplateResponse simulateTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SimulateTemplateRequest.Builder().build(),
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
	 * You can do make an index read-only with the following request using the add
	 * index block API:
	 * 
	 * <pre>
	 * <code>PUT /my_source_index/_block/write
	 * </code>
	 * </pre>
	 * <p>
	 * The current write index on a data stream cannot be split. In order to split
	 * the current write index, the data stream must first be rolled over so that a
	 * new write index is created and then the previous write index can be split.
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-split">Documentation
	 *      on elastic.co</a>
	 */

	public SplitResponse split(SplitRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SplitRequest, SplitResponse, ErrorResponse> endpoint = (JsonEndpoint<SplitRequest, SplitResponse, ErrorResponse>) SplitRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 * You can do make an index read-only with the following request using the add
	 * index block API:
	 * 
	 * <pre>
	 * <code>PUT /my_source_index/_block/write
	 * </code>
	 * </pre>
	 * <p>
	 * The current write index on a data stream cannot be split. In order to split
	 * the current write index, the data stream must first be rolled over so that a
	 * new write index is created and then the previous write index can be split.
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-split">Documentation
	 *      on elastic.co</a>
	 */

	public final SplitResponse split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-stats">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesStatsResponse stats(IndicesStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse>) IndicesStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final IndicesStatsResponse stats(
			Function<IndicesStatsRequest.Builder, ObjectBuilder<IndicesStatsRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-stats">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new IndicesStatsRequest.Builder().build(), IndicesStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-update-aliases">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateAliasesResponse updateAliases(UpdateAliasesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse>) UpdateAliasesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateAliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-update-aliases">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateAliasesResponse updateAliases(
			Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build());
	}

	/**
	 * Create or update an alias. Adds a data stream or index to an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-update-aliases">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateAliasesResponse updateAliases() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new UpdateAliasesRequest.Builder().build(), UpdateAliasesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Validate a query. Validates a query without running it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-validate-query">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateQueryResponse validateQuery(ValidateQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ValidateQueryRequest, ValidateQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<ValidateQueryRequest, ValidateQueryResponse, ErrorResponse>) ValidateQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Validate a query. Validates a query without running it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ValidateQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-validate-query">Documentation
	 *      on elastic.co</a>
	 */

	public final ValidateQueryResponse validateQuery(
			Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build());
	}

	/**
	 * Validate a query. Validates a query without running it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-indices-validate-query">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateQueryResponse validateQuery() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ValidateQueryRequest.Builder().build(), ValidateQueryRequest._ENDPOINT,
				this.transportOptions);
	}

}
