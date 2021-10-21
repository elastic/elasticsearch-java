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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the indices namespace.
 */
public class ElasticsearchIndicesAsyncClient extends ApiClient {

	public ElasticsearchIndicesAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: indices.add_block

	/**
	 * Adds a block to an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AddBlockResponse> addBlock(AddBlockRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, AddBlockRequest.ENDPOINT);
	}

	/**
	 * Adds a block to an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AddBlockRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AddBlockResponse> addBlock(
			Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn)
			throws IOException, ElasticsearchException {
		return addBlock(fn.apply(new AddBlockRequest.Builder()).build());
	}

	// ----- Endpoint: indices.analyze

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AnalyzeResponse> analyze(AnalyzeRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, AnalyzeRequest.ENDPOINT);
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AnalyzeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AnalyzeResponse> analyze(
			Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn)
			throws IOException, ElasticsearchException {
		return analyze(fn.apply(new AnalyzeRequest.Builder()).build());
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AnalyzeResponse> analyze() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new AnalyzeRequest.Builder().build(), AnalyzeRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ClearCacheRequest.ENDPOINT);
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCacheRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCacheResponse> clearCache(
			Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCacheResponse> clearCache() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ClearCacheRequest.Builder().build(), ClearCacheRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.clone

	/**
	 * Clones an index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CloneIndexResponse> clone(CloneIndexRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CloneIndexRequest.ENDPOINT);
	}

	/**
	 * Clones an index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloneIndexResponse> clone(
			Function<CloneIndexRequest.Builder, ObjectBuilder<CloneIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return clone(fn.apply(new CloneIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.close

	/**
	 * Closes an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CloseIndexResponse> close(CloseIndexRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CloseIndexRequest.ENDPOINT);
	}

	/**
	 * Closes an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloseIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloseIndexResponse> close(
			Function<CloseIndexRequest.Builder, ObjectBuilder<CloseIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return close(fn.apply(new CloseIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Creates an index with optional settings and mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-create-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateIndexResponse> create(CreateIndexRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CreateIndexRequest.ENDPOINT);
	}

	/**
	 * Creates an index with optional settings and mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-create-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateIndexResponse> create(
			Function<CreateIndexRequest.Builder, ObjectBuilder<CreateIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return create(fn.apply(new CreateIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create_data_stream

	/**
	 * Creates a data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CreateDataStreamRequest.ENDPOINT);
	}

	/**
	 * Creates a data stream
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateDataStreamResponse> createDataStream(
			Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return createDataStream(fn.apply(new CreateDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.data_streams_stats

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(DataStreamsStatsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DataStreamsStatsRequest.ENDPOINT);
	}

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DataStreamsStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(
			Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return dataStreamsStats(fn.apply(new DataStreamsStatsRequest.Builder()).build());
	}

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DataStreamsStatsResponse> dataStreamsStats() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new DataStreamsStatsRequest.Builder().build(),
				DataStreamsStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.delete

	/**
	 * Deletes an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteIndexResponse> delete(DeleteIndexRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteIndexRequest.ENDPOINT);
	}

	/**
	 * Deletes an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteIndexResponse> delete(
			Function<DeleteIndexRequest.Builder, ObjectBuilder<DeleteIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Deletes an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteAliasRequest.ENDPOINT);
	}

	/**
	 * Deletes an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAliasResponse> deleteAlias(
			Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_stream

	/**
	 * Deletes a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteDataStreamRequest.ENDPOINT);
	}

	/**
	 * Deletes a data stream.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDataStreamResponse> deleteDataStream(
			Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDataStream(fn.apply(new DeleteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_index_template

	/**
	 * Deletes an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Deletes an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(
			Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Deletes an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteTemplateRequest.ENDPOINT);
	}

	/**
	 * Deletes an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteTemplateResponse> deleteTemplate(
			Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.disk_usage

	/**
	 * Analyzes the disk usage of each field of an index or data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-disk-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DiskUsageResponse> diskUsage(DiskUsageRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DiskUsageRequest.ENDPOINT);
	}

	/**
	 * Analyzes the disk usage of each field of an index or data stream
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DiskUsageRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-disk-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DiskUsageResponse> diskUsage(
			Function<DiskUsageRequest.Builder, ObjectBuilder<DiskUsageRequest>> fn)
			throws IOException, ElasticsearchException {
		return diskUsage(fn.apply(new DiskUsageRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Returns information about whether a particular index exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> exists(ExistsRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ExistsRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular index exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> exists(
			Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException, ElasticsearchException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Returns information about whether a particular alias exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsAlias(ExistsAliasRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ExistsAliasRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular alias exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsAlias(
			Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsIndexTemplate(ExistsIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ExistsIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsIndexTemplate(
			Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsTemplate(ExistsTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ExistsTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsTemplate(
			Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsTemplate(fn.apply(new ExistsTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_type

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-types-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsType(ExistsTypeRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ExistsTypeRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsTypeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-types-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsType(
			Function<ExistsTypeRequest.Builder, ObjectBuilder<ExistsTypeRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsType(fn.apply(new ExistsTypeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FlushResponse> flush(FlushRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, FlushRequest.ENDPOINT);
	}

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FlushRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FlushResponse> flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn)
			throws IOException, ElasticsearchException {
		return flush(fn.apply(new FlushRequest.Builder()).build());
	}

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FlushResponse> flush() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new FlushRequest.Builder().build(), FlushRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.forcemerge

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ForcemergeResponse> forcemerge(ForcemergeRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ForcemergeRequest.ENDPOINT);
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForcemergeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ForcemergeResponse> forcemerge(
			Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn)
			throws IOException, ElasticsearchException {
		return forcemerge(fn.apply(new ForcemergeRequest.Builder()).build());
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ForcemergeResponse> forcemerge() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ForcemergeRequest.Builder().build(), ForcemergeRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.freeze

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/freeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FreezeResponse> freeze(FreezeRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, FreezeRequest.ENDPOINT);
	}

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FreezeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/freeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FreezeResponse> freeze(
			Function<FreezeRequest.Builder, ObjectBuilder<FreezeRequest>> fn)
			throws IOException, ElasticsearchException {
		return freeze(fn.apply(new FreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get

	/**
	 * Returns information about one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndexResponse> get(GetIndexRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetIndexRequest.ENDPOINT);
	}

	/**
	 * Returns information about one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetIndexResponse> get(
			Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Returns an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetAliasRequest.ENDPOINT);
	}

	/**
	 * Returns an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAliasResponse> getAlias(
			Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return getAlias(fn.apply(new GetAliasRequest.Builder()).build());
	}

	/**
	 * Returns an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAliasResponse> getAlias() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetAliasRequest.Builder().build(), GetAliasRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_data_stream

	/**
	 * Returns data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataStreamResponse> getDataStream(GetDataStreamRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetDataStreamRequest.ENDPOINT);
	}

	/**
	 * Returns data streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDataStreamResponse> getDataStream(
			Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return getDataStream(fn.apply(new GetDataStreamRequest.Builder()).build());
	}

	/**
	 * Returns data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataStreamResponse> getDataStream() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetDataStreamRequest.Builder().build(),
				GetDataStreamRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Returns mapping for one or more fields.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetFieldMappingResponse> getFieldMapping(GetFieldMappingRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetFieldMappingRequest.ENDPOINT);
	}

	/**
	 * Returns mapping for one or more fields.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetFieldMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetFieldMappingResponse> getFieldMapping(
			Function<GetFieldMappingRequest.Builder, ObjectBuilder<GetFieldMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return getFieldMapping(fn.apply(new GetFieldMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(GetIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(
			Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build());
	}

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIndexTemplateResponse> getIndexTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetIndexTemplateRequest.Builder().build(),
				GetIndexTemplateRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetMappingResponse> getMapping(GetMappingRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetMappingRequest.ENDPOINT);
	}

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetMappingResponse> getMapping(
			Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return getMapping(fn.apply(new GetMappingRequest.Builder()).build());
	}

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetMappingResponse> getMapping() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetMappingRequest.Builder().build(), GetMappingRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSettingsResponse> getSettings(GetSettingsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetSettingsRequest.ENDPOINT);
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSettingsResponse> getSettings(
			Function<GetSettingsRequest.Builder, ObjectBuilder<GetSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSettings(fn.apply(new GetSettingsRequest.Builder()).build());
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSettingsResponse> getSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetSettingsRequest.Builder().build(),
				GetSettingsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTemplateResponse> getTemplate(
			Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build());
	}

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTemplateResponse> getTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetTemplateRequest.Builder().build(),
				GetTemplateRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.migrate_to_data_stream

	/**
	 * Migrates an alias to a data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MigrateToDataStreamResponse> migrateToDataStream(MigrateToDataStreamRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, MigrateToDataStreamRequest.ENDPOINT);
	}

	/**
	 * Migrates an alias to a data stream
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MigrateToDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MigrateToDataStreamResponse> migrateToDataStream(
			Function<MigrateToDataStreamRequest.Builder, ObjectBuilder<MigrateToDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return migrateToDataStream(fn.apply(new MigrateToDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.open

	/**
	 * Opens an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<OpenResponse> open(OpenRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, OpenRequest.ENDPOINT);
	}

	/**
	 * Opens an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<OpenResponse> open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn)
			throws IOException, ElasticsearchException {
		return open(fn.apply(new OpenRequest.Builder()).build());
	}

	// ----- Endpoint: indices.promote_data_stream

	/**
	 * Promotes a data stream from a replicated data stream managed by CCR to a
	 * regular data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PromoteDataStreamResponse> promoteDataStream(PromoteDataStreamRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PromoteDataStreamRequest.ENDPOINT);
	}

	/**
	 * Promotes a data stream from a replicated data stream managed by CCR to a
	 * regular data stream
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PromoteDataStreamRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PromoteDataStreamResponse> promoteDataStream(
			Function<PromoteDataStreamRequest.Builder, ObjectBuilder<PromoteDataStreamRequest>> fn)
			throws IOException, ElasticsearchException {
		return promoteDataStream(fn.apply(new PromoteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Creates or updates an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutAliasResponse> putAlias(PutAliasRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutAliasRequest.ENDPOINT);
	}

	/**
	 * Creates or updates an alias.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAliasRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutAliasResponse> putAlias(
			Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAlias(fn.apply(new PutAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Creates or updates an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(PutIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Creates or updates an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(
			Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Updates the index mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutMappingResponse> putMapping(PutMappingRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutMappingRequest.ENDPOINT);
	}

	/**
	 * Updates the index mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutMappingResponse> putMapping(
			Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return putMapping(fn.apply(new PutMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Updates the index settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutSettingsResponse> putSettings(PutSettingsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutSettingsRequest.ENDPOINT);
	}

	/**
	 * Updates the index settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutSettingsResponse> putSettings(
			Function<PutSettingsRequest.Builder, ObjectBuilder<PutSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return putSettings(fn.apply(new PutSettingsRequest.Builder()).build());
	}

	/**
	 * Updates the index settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutSettingsResponse> putSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PutSettingsRequest.Builder().build(),
				PutSettingsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Creates or updates an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutTemplateResponse> putTemplate(PutTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutTemplateRequest.ENDPOINT);
	}

	/**
	 * Creates or updates an index template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutTemplateResponse> putTemplate(
			Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, RecoveryRequest.ENDPOINT);
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RecoveryResponse> recovery(
			Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException, ElasticsearchException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new RecoveryRequest.Builder().build(), RecoveryRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RefreshResponse> refresh(RefreshRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, RefreshRequest.ENDPOINT);
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RefreshRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RefreshResponse> refresh(
			Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn)
			throws IOException, ElasticsearchException {
		return refresh(fn.apply(new RefreshRequest.Builder()).build());
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RefreshResponse> refresh() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new RefreshRequest.Builder().build(), RefreshRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.reload_search_analyzers

	/**
	 * Reloads an index's search analyzers and their resources.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReloadSearchAnalyzersResponse> reloadSearchAnalyzers(ReloadSearchAnalyzersRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ReloadSearchAnalyzersRequest.ENDPOINT);
	}

	/**
	 * Reloads an index's search analyzers and their resources.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReloadSearchAnalyzersRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReloadSearchAnalyzersResponse> reloadSearchAnalyzers(
			Function<ReloadSearchAnalyzersRequest.Builder, ObjectBuilder<ReloadSearchAnalyzersRequest>> fn)
			throws IOException, ElasticsearchException {
		return reloadSearchAnalyzers(fn.apply(new ReloadSearchAnalyzersRequest.Builder()).build());
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ResolveIndexResponse> resolveIndex(ResolveIndexRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ResolveIndexRequest.ENDPOINT);
	}

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResolveIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResolveIndexResponse> resolveIndex(
			Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.rollover

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-rollover-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RolloverResponse> rollover(RolloverRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, RolloverRequest.ENDPOINT);
	}

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RolloverRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-rollover-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RolloverResponse> rollover(
			Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn)
			throws IOException, ElasticsearchException {
		return rollover(fn.apply(new RolloverRequest.Builder()).build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, SegmentsRequest.ENDPOINT);
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SegmentsResponse> segments(
			Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException, ElasticsearchException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SegmentsRequest.Builder().build(), SegmentsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.shard_stores

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardStoresResponse> shardStores(ShardStoresRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ShardStoresRequest.ENDPOINT);
	}

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardStoresRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShardStoresResponse> shardStores(
			Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn)
			throws IOException, ElasticsearchException {
		return shardStores(fn.apply(new ShardStoresRequest.Builder()).build());
	}

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardStoresResponse> shardStores() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ShardStoresRequest.Builder().build(),
				ShardStoresRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.shrink

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shrink-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShrinkResponse> shrink(ShrinkRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ShrinkRequest.ENDPOINT);
	}

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShrinkRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shrink-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShrinkResponse> shrink(
			Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn)
			throws IOException, ElasticsearchException {
		return shrink(fn.apply(new ShrinkRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_index_template

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(SimulateIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, SimulateIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateIndexTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(
			Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateTemplateResponse> simulateTemplate(SimulateTemplateRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, SimulateTemplateRequest.ENDPOINT);
	}

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SimulateTemplateResponse> simulateTemplate(
			Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build());
	}

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateTemplateResponse> simulateTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SimulateTemplateRequest.Builder().build(),
				SimulateTemplateRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.split

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-split-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SplitResponse> split(SplitRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, SplitRequest.ENDPOINT);
	}

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SplitRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-split-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SplitResponse> split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn)
			throws IOException, ElasticsearchException {
		return split(fn.apply(new SplitRequest.Builder()).build());
	}

	// ----- Endpoint: indices.stats

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesStatsResponse> stats(IndicesStatsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, IndicesStatsRequest.ENDPOINT);
	}

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<IndicesStatsResponse> stats(
			Function<IndicesStatsRequest.Builder, ObjectBuilder<IndicesStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return stats(fn.apply(new IndicesStatsRequest.Builder()).build());
	}

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesStatsResponse> stats() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new IndicesStatsRequest.Builder().build(),
				IndicesStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.unfreeze

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/unfreeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UnfreezeResponse> unfreeze(UnfreezeRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, UnfreezeRequest.ENDPOINT);
	}

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
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
			Function<UnfreezeRequest.Builder, ObjectBuilder<UnfreezeRequest>> fn)
			throws IOException, ElasticsearchException {
		return unfreeze(fn.apply(new UnfreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Updates index aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateAliasesResponse> updateAliases(UpdateAliasesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, UpdateAliasesRequest.ENDPOINT);
	}

	/**
	 * Updates index aliases.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateAliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateAliasesResponse> updateAliases(
			Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build());
	}

	/**
	 * Updates index aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateAliasesResponse> updateAliases() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new UpdateAliasesRequest.Builder().build(),
				UpdateAliasesRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ValidateQueryResponse> validateQuery(ValidateQueryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ValidateQueryRequest.ENDPOINT);
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ValidateQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ValidateQueryResponse> validateQuery(
			Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build());
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ValidateQueryResponse> validateQuery() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ValidateQueryRequest.Builder().build(),
				ValidateQueryRequest.ENDPOINT);
	}

}
