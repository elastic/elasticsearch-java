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

package co.elastic.clients.elasticsearch.api.indices;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.indices.AddBlockRequest;
import co.elastic.clients.elasticsearch.indices.AddBlockResponse;
import co.elastic.clients.elasticsearch.indices.AnalyzeRequest;
import co.elastic.clients.elasticsearch.indices.AnalyzeResponse;
import co.elastic.clients.elasticsearch.indices.ClearCacheRequest;
import co.elastic.clients.elasticsearch.indices.ClearCacheResponse;
import co.elastic.clients.elasticsearch.indices.CloneRequest;
import co.elastic.clients.elasticsearch.indices.CloneResponse;
import co.elastic.clients.elasticsearch.indices.CloseRequest;
import co.elastic.clients.elasticsearch.indices.CloseResponse;
import co.elastic.clients.elasticsearch.indices.CreateDataStreamRequest;
import co.elastic.clients.elasticsearch.indices.CreateDataStreamResponse;
import co.elastic.clients.elasticsearch.indices.CreateRequest;
import co.elastic.clients.elasticsearch.indices.CreateResponse;
import co.elastic.clients.elasticsearch.indices.DataStreamsStatsRequest;
import co.elastic.clients.elasticsearch.indices.DataStreamsStatsResponse;
import co.elastic.clients.elasticsearch.indices.DeleteAliasRequest;
import co.elastic.clients.elasticsearch.indices.DeleteAliasResponse;
import co.elastic.clients.elasticsearch.indices.DeleteDataStreamRequest;
import co.elastic.clients.elasticsearch.indices.DeleteDataStreamResponse;
import co.elastic.clients.elasticsearch.indices.DeleteIndexTemplateRequest;
import co.elastic.clients.elasticsearch.indices.DeleteIndexTemplateResponse;
import co.elastic.clients.elasticsearch.indices.DeleteRequest;
import co.elastic.clients.elasticsearch.indices.DeleteResponse;
import co.elastic.clients.elasticsearch.indices.DeleteTemplateRequest;
import co.elastic.clients.elasticsearch.indices.DeleteTemplateResponse;
import co.elastic.clients.elasticsearch.indices.ExistsAliasRequest;
import co.elastic.clients.elasticsearch.indices.ExistsIndexTemplateRequest;
import co.elastic.clients.elasticsearch.indices.ExistsRequest;
import co.elastic.clients.elasticsearch.indices.ExistsTemplateRequest;
import co.elastic.clients.elasticsearch.indices.ExistsTypeRequest;
import co.elastic.clients.elasticsearch.indices.FlushRequest;
import co.elastic.clients.elasticsearch.indices.FlushResponse;
import co.elastic.clients.elasticsearch.indices.FlushSyncedRequest;
import co.elastic.clients.elasticsearch.indices.FlushSyncedResponse;
import co.elastic.clients.elasticsearch.indices.ForcemergeRequest;
import co.elastic.clients.elasticsearch.indices.ForcemergeResponse;
import co.elastic.clients.elasticsearch.indices.FreezeRequest;
import co.elastic.clients.elasticsearch.indices.FreezeResponse;
import co.elastic.clients.elasticsearch.indices.GetAliasRequest;
import co.elastic.clients.elasticsearch.indices.GetAliasResponse;
import co.elastic.clients.elasticsearch.indices.GetDataStreamRequest;
import co.elastic.clients.elasticsearch.indices.GetDataStreamResponse;
import co.elastic.clients.elasticsearch.indices.GetFieldMappingRequest;
import co.elastic.clients.elasticsearch.indices.GetFieldMappingResponse;
import co.elastic.clients.elasticsearch.indices.GetIndexTemplateRequest;
import co.elastic.clients.elasticsearch.indices.GetIndexTemplateResponse;
import co.elastic.clients.elasticsearch.indices.GetMappingRequest;
import co.elastic.clients.elasticsearch.indices.GetMappingResponse;
import co.elastic.clients.elasticsearch.indices.GetRequest;
import co.elastic.clients.elasticsearch.indices.GetResponse;
import co.elastic.clients.elasticsearch.indices.GetSettingsRequest;
import co.elastic.clients.elasticsearch.indices.GetSettingsResponse;
import co.elastic.clients.elasticsearch.indices.GetTemplateRequest;
import co.elastic.clients.elasticsearch.indices.GetTemplateResponse;
import co.elastic.clients.elasticsearch.indices.GetUpgradeRequest;
import co.elastic.clients.elasticsearch.indices.GetUpgradeResponse;
import co.elastic.clients.elasticsearch.indices.MigrateToDataStreamRequest;
import co.elastic.clients.elasticsearch.indices.MigrateToDataStreamResponse;
import co.elastic.clients.elasticsearch.indices.OpenRequest;
import co.elastic.clients.elasticsearch.indices.OpenResponse;
import co.elastic.clients.elasticsearch.indices.PromoteDataStreamRequest;
import co.elastic.clients.elasticsearch.indices.PromoteDataStreamResponse;
import co.elastic.clients.elasticsearch.indices.PutAliasRequest;
import co.elastic.clients.elasticsearch.indices.PutAliasResponse;
import co.elastic.clients.elasticsearch.indices.PutIndexTemplateRequest;
import co.elastic.clients.elasticsearch.indices.PutIndexTemplateResponse;
import co.elastic.clients.elasticsearch.indices.PutMappingRequest;
import co.elastic.clients.elasticsearch.indices.PutMappingResponse;
import co.elastic.clients.elasticsearch.indices.PutSettingsRequest;
import co.elastic.clients.elasticsearch.indices.PutSettingsResponse;
import co.elastic.clients.elasticsearch.indices.PutTemplateRequest;
import co.elastic.clients.elasticsearch.indices.PutTemplateResponse;
import co.elastic.clients.elasticsearch.indices.RecoveryRequest;
import co.elastic.clients.elasticsearch.indices.RecoveryResponse;
import co.elastic.clients.elasticsearch.indices.RefreshRequest;
import co.elastic.clients.elasticsearch.indices.RefreshResponse;
import co.elastic.clients.elasticsearch.indices.ReloadSearchAnalyzersRequest;
import co.elastic.clients.elasticsearch.indices.ReloadSearchAnalyzersResponse;
import co.elastic.clients.elasticsearch.indices.ResolveIndexRequest;
import co.elastic.clients.elasticsearch.indices.ResolveIndexResponse;
import co.elastic.clients.elasticsearch.indices.RolloverRequest;
import co.elastic.clients.elasticsearch.indices.RolloverResponse;
import co.elastic.clients.elasticsearch.indices.SegmentsRequest;
import co.elastic.clients.elasticsearch.indices.SegmentsResponse;
import co.elastic.clients.elasticsearch.indices.ShardStoresRequest;
import co.elastic.clients.elasticsearch.indices.ShardStoresResponse;
import co.elastic.clients.elasticsearch.indices.ShrinkRequest;
import co.elastic.clients.elasticsearch.indices.ShrinkResponse;
import co.elastic.clients.elasticsearch.indices.SimulateIndexTemplateRequest;
import co.elastic.clients.elasticsearch.indices.SimulateIndexTemplateResponse;
import co.elastic.clients.elasticsearch.indices.SimulateTemplateRequest;
import co.elastic.clients.elasticsearch.indices.SimulateTemplateResponse;
import co.elastic.clients.elasticsearch.indices.SplitRequest;
import co.elastic.clients.elasticsearch.indices.SplitResponse;
import co.elastic.clients.elasticsearch.indices.StatsRequest;
import co.elastic.clients.elasticsearch.indices.StatsResponse;
import co.elastic.clients.elasticsearch.indices.UnfreezeRequest;
import co.elastic.clients.elasticsearch.indices.UnfreezeResponse;
import co.elastic.clients.elasticsearch.indices.UpdateAliasesRequest;
import co.elastic.clients.elasticsearch.indices.UpdateAliasesResponse;
import co.elastic.clients.elasticsearch.indices.UpgradeRequest;
import co.elastic.clients.elasticsearch.indices.UpgradeResponse;
import co.elastic.clients.elasticsearch.indices.ValidateQueryRequest;
import co.elastic.clients.elasticsearch.indices.ValidateQueryResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the indices namespace.
 */
public class IndicesAsyncClient extends ApiClient<IndicesAsyncClient> {

	public IndicesAsyncClient(Transport transport) {
		super(transport, null);
	}

	public IndicesAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: indices.add_block

	/**
	 * Adds a block to an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html"
	 */

	public CompletableFuture<AddBlockResponse> addBlock(AddBlockRequest request) throws IOException {
		return this.transport.performRequestAsync(request, AddBlockRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds a block to an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<AddBlockResponse> addBlock(
			Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn) throws IOException {
		return addBlock(fn.apply(new AddBlockRequest.Builder()).build());
	}

	// ----- Endpoint: indices.analyze

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html"
	 */

	public CompletableFuture<AnalyzeResponse> analyze(AnalyzeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, AnalyzeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<AnalyzeResponse> analyze(
			Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn) throws IOException {
		return analyze(fn.apply(new AnalyzeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clears all or specific caches for one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html"
	 */

	public CompletableFuture<ClearCacheResponse> clearCache(ClearCacheRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ClearCacheRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ClearCacheResponse> clearCache(
			Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn) throws IOException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	// ----- Endpoint: indices.clone

	/**
	 * Clones an index
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html"
	 */

	public CompletableFuture<CloneResponse> clone(CloneRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CloneRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Clones an index
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<CloneResponse> clone(Function<CloneRequest.Builder, ObjectBuilder<CloneRequest>> fn)
			throws IOException {
		return clone(fn.apply(new CloneRequest.Builder()).build());
	}

	// ----- Endpoint: indices.close

	/**
	 * Closes an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html"
	 */

	public CompletableFuture<CloseResponse> close(CloseRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CloseRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Closes an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<CloseResponse> close(Function<CloseRequest.Builder, ObjectBuilder<CloseRequest>> fn)
			throws IOException {
		return close(fn.apply(new CloseRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Creates an index with optional settings and mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-create-index.html"
	 */

	public CompletableFuture<CreateResponse> create(CreateRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CreateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates an index with optional settings and mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-create-index.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<CreateResponse> create(
			Function<CreateRequest.Builder, ObjectBuilder<CreateRequest>> fn) throws IOException {
		return create(fn.apply(new CreateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create_data_stream

	/**
	 * Creates a data stream
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 */

	public CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, CreateDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a data stream
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<CreateDataStreamResponse> createDataStream(
			Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn) throws IOException {
		return createDataStream(fn.apply(new CreateDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.data_streams_stats

	/**
	 * Provides statistics on operations happening in a data stream.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 */

	public CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(DataStreamsStatsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DataStreamsStatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides statistics on operations happening in a data stream.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DataStreamsStatsResponse> dataStreamsStats(
			Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn) throws IOException {
		return dataStreamsStats(fn.apply(new DataStreamsStatsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete

	/**
	 * Deletes an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html"
	 */

	public CompletableFuture<DeleteResponse> delete(DeleteRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteResponse> delete(
			Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn) throws IOException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Deletes an alias.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 */

	public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an alias.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteAliasResponse> deleteAlias(
			Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn) throws IOException {
		return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_stream

	/**
	 * Deletes a data stream.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 */

	public CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a data stream.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteDataStreamResponse> deleteDataStream(
			Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn) throws IOException {
		return deleteDataStream(fn.apply(new DeleteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_index_template

	/**
	 * Deletes an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(
			Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn)
			throws IOException {
		return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Deletes an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<DeleteTemplateResponse> deleteTemplate(
			Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn) throws IOException {
		return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Returns information about whether a particular index exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html"
	 */

	public CompletableFuture<BooleanResponse> exists(ExistsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExistsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular index exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<BooleanResponse> exists(
			Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn) throws IOException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Returns information about whether a particular alias exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 */

	public CompletableFuture<BooleanResponse> existsAlias(ExistsAliasRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExistsAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular alias exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<BooleanResponse> existsAlias(
			Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn) throws IOException {
		return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<BooleanResponse> existsIndexTemplate(ExistsIndexTemplateRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ExistsIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<BooleanResponse> existsIndexTemplate(
			Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn)
			throws IOException {
		return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<BooleanResponse> existsTemplate(ExistsTemplateRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExistsTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<BooleanResponse> existsTemplate(
			Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn) throws IOException {
		return existsTemplate(fn.apply(new ExistsTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_type

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-types-exists.html"
	 */

	public CompletableFuture<BooleanResponse> existsType(ExistsTypeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExistsTypeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-types-exists.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<BooleanResponse> existsType(
			Function<ExistsTypeRequest.Builder, ObjectBuilder<ExistsTypeRequest>> fn) throws IOException {
		return existsType(fn.apply(new ExistsTypeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush

	/**
	 * Performs the flush operation on one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html"
	 */

	public CompletableFuture<FlushResponse> flush(FlushRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FlushRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the flush operation on one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<FlushResponse> flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn)
			throws IOException {
		return flush(fn.apply(new FlushRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush_synced

	/**
	 * Performs a synced flush operation on one or more indices. Synced flush is
	 * deprecated and will be removed in 8.0. Use flush instead
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-synced-flush-api.html"
	 */

	public CompletableFuture<FlushSyncedResponse> flushSynced(FlushSyncedRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FlushSyncedRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs a synced flush operation on one or more indices. Synced flush is
	 * deprecated and will be removed in 8.0. Use flush instead
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-synced-flush-api.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<FlushSyncedResponse> flushSynced(
			Function<FlushSyncedRequest.Builder, ObjectBuilder<FlushSyncedRequest>> fn) throws IOException {
		return flushSynced(fn.apply(new FlushSyncedRequest.Builder()).build());
	}

	// ----- Endpoint: indices.forcemerge

	/**
	 * Performs the force merge operation on one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html"
	 */

	public CompletableFuture<ForcemergeResponse> forcemerge(ForcemergeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ForcemergeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ForcemergeResponse> forcemerge(
			Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn) throws IOException {
		return forcemerge(fn.apply(new ForcemergeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.freeze

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/freeze-index-api.html"
	 */

	public CompletableFuture<FreezeResponse> freeze(FreezeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FreezeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/freeze-index-api.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<FreezeResponse> freeze(
			Function<FreezeRequest.Builder, ObjectBuilder<FreezeRequest>> fn) throws IOException {
		return freeze(fn.apply(new FreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get

	/**
	 * Returns information about one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html"
	 */

	public CompletableFuture<GetResponse> get(GetRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetResponse> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn)
			throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Returns an alias.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 */

	public CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns an alias.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetAliasResponse> getAlias(
			Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn) throws IOException {
		return getAlias(fn.apply(new GetAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_data_stream

	/**
	 * Returns data streams.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 */

	public CompletableFuture<GetDataStreamResponse> getDataStream(GetDataStreamRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns data streams.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetDataStreamResponse> getDataStream(
			Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn) throws IOException {
		return getDataStream(fn.apply(new GetDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Returns mapping for one or more fields.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html"
	 */

	public CompletableFuture<GetFieldMappingResponse> getFieldMapping(GetFieldMappingRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetFieldMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns mapping for one or more fields.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetFieldMappingResponse> getFieldMapping(
			Function<GetFieldMappingRequest.Builder, ObjectBuilder<GetFieldMappingRequest>> fn) throws IOException {
		return getFieldMapping(fn.apply(new GetFieldMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Returns an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(GetIndexTemplateRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetIndexTemplateResponse> getIndexTemplate(
			Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn) throws IOException {
		return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Returns mappings for one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html"
	 */

	public CompletableFuture<GetMappingResponse> getMapping(GetMappingRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns mappings for one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetMappingResponse> getMapping(
			Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn) throws IOException {
		return getMapping(fn.apply(new GetMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Returns settings for one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html"
	 */

	public CompletableFuture<GetSettingsResponse> getSettings(GetSettingsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetSettingsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns settings for one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetSettingsResponse> getSettings(
			Function<GetSettingsRequest.Builder, ObjectBuilder<GetSettingsRequest>> fn) throws IOException {
		return getSettings(fn.apply(new GetSettingsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Returns an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetTemplateResponse> getTemplate(
			Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn) throws IOException {
		return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_upgrade

	/**
	 * DEPRECATED Returns a progress status of current upgrade.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html"
	 */

	public CompletableFuture<GetUpgradeResponse> getUpgrade(GetUpgradeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetUpgradeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * DEPRECATED Returns a progress status of current upgrade.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetUpgradeResponse> getUpgrade(
			Function<GetUpgradeRequest.Builder, ObjectBuilder<GetUpgradeRequest>> fn) throws IOException {
		return getUpgrade(fn.apply(new GetUpgradeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.migrate_to_data_stream

	/**
	 * Migrates an alias to a data stream
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 */

	public CompletableFuture<MigrateToDataStreamResponse> migrateToDataStream(MigrateToDataStreamRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, MigrateToDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Migrates an alias to a data stream
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<MigrateToDataStreamResponse> migrateToDataStream(
			Function<MigrateToDataStreamRequest.Builder, ObjectBuilder<MigrateToDataStreamRequest>> fn)
			throws IOException {
		return migrateToDataStream(fn.apply(new MigrateToDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.open

	/**
	 * Opens an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html"
	 */

	public CompletableFuture<OpenResponse> open(OpenRequest request) throws IOException {
		return this.transport.performRequestAsync(request, OpenRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Opens an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<OpenResponse> open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn)
			throws IOException {
		return open(fn.apply(new OpenRequest.Builder()).build());
	}

	// ----- Endpoint: indices.promote_data_stream

	/**
	 * Promotes a data stream from a replicated data stream managed by CCR to a
	 * regular data stream
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 */

	public CompletableFuture<PromoteDataStreamResponse> promoteDataStream(PromoteDataStreamRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PromoteDataStreamRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Promotes a data stream from a replicated data stream managed by CCR to a
	 * regular data stream
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PromoteDataStreamResponse> promoteDataStream(
			Function<PromoteDataStreamRequest.Builder, ObjectBuilder<PromoteDataStreamRequest>> fn) throws IOException {
		return promoteDataStream(fn.apply(new PromoteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Creates or updates an alias.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 */

	public CompletableFuture<PutAliasResponse> putAlias(PutAliasRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutAliasRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates an alias.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutAliasResponse> putAlias(
			Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn) throws IOException {
		return putAlias(fn.apply(new PutAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Creates or updates an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(PutIndexTemplateRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutIndexTemplateResponse> putIndexTemplate(
			Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn) throws IOException {
		return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Updates the index mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html"
	 */

	public CompletableFuture<PutMappingResponse> putMapping(PutMappingRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutMappingRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the index mappings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutMappingResponse> putMapping(
			Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn) throws IOException {
		return putMapping(fn.apply(new PutMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Updates the index settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html"
	 */

	public CompletableFuture<PutSettingsResponse> putSettings(PutSettingsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutSettingsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the index settings.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutSettingsResponse> putSettings(
			Function<PutSettingsRequest.Builder, ObjectBuilder<PutSettingsRequest>> fn) throws IOException {
		return putSettings(fn.apply(new PutSettingsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Creates or updates an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<PutTemplateResponse> putTemplate(PutTemplateRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates an index template.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<PutTemplateResponse> putTemplate(
			Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn) throws IOException {
		return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Returns information about ongoing index shard recoveries.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html"
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RecoveryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<RecoveryResponse> recovery(
			Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn) throws IOException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Performs the refresh operation in one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html"
	 */

	public CompletableFuture<RefreshResponse> refresh(RefreshRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RefreshRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<RefreshResponse> refresh(
			Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn) throws IOException {
		return refresh(fn.apply(new RefreshRequest.Builder()).build());
	}

	// ----- Endpoint: indices.reload_search_analyzers

	/**
	 * Reloads an index's search analyzers and their resources.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html"
	 */

	public CompletableFuture<ReloadSearchAnalyzersResponse> reloadSearchAnalyzers(ReloadSearchAnalyzersRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ReloadSearchAnalyzersRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Reloads an index's search analyzers and their resources.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ReloadSearchAnalyzersResponse> reloadSearchAnalyzers(
			Function<ReloadSearchAnalyzersRequest.Builder, ObjectBuilder<ReloadSearchAnalyzersRequest>> fn)
			throws IOException {
		return reloadSearchAnalyzers(fn.apply(new ReloadSearchAnalyzersRequest.Builder()).build());
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html"
	 */

	public CompletableFuture<ResolveIndexResponse> resolveIndex(ResolveIndexRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ResolveIndexRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ResolveIndexResponse> resolveIndex(
			Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn) throws IOException {
		return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.rollover

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-rollover-index.html"
	 */

	public CompletableFuture<RolloverResponse> rollover(RolloverRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RolloverRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-rollover-index.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<RolloverResponse> rollover(
			Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn) throws IOException {
		return rollover(fn.apply(new RolloverRequest.Builder()).build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Provides low-level information about segments in a Lucene index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html"
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SegmentsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<SegmentsResponse> segments(
			Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn) throws IOException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.shard_stores

	/**
	 * Provides store information for shard copies of indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html"
	 */

	public CompletableFuture<ShardStoresResponse> shardStores(ShardStoresRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ShardStoresRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides store information for shard copies of indices.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ShardStoresResponse> shardStores(
			Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn) throws IOException {
		return shardStores(fn.apply(new ShardStoresRequest.Builder()).build());
	}

	// ----- Endpoint: indices.shrink

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shrink-index.html"
	 */

	public CompletableFuture<ShrinkResponse> shrink(ShrinkRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ShrinkRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shrink-index.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ShrinkResponse> shrink(
			Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn) throws IOException {
		return shrink(fn.apply(new ShrinkRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_index_template

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(SimulateIndexTemplateRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, SimulateIndexTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<SimulateIndexTemplateResponse> simulateIndexTemplate(
			Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn)
			throws IOException {
		return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate resolving the given template name or body
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 */

	public CompletableFuture<SimulateTemplateResponse> simulateTemplate(SimulateTemplateRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, SimulateTemplateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Simulate resolving the given template name or body
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<SimulateTemplateResponse> simulateTemplate(
			Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn) throws IOException {
		return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.split

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-split-index.html"
	 */

	public CompletableFuture<SplitResponse> split(SplitRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SplitRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-split-index.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<SplitResponse> split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn)
			throws IOException {
		return split(fn.apply(new SplitRequest.Builder()).build());
	}

	// ----- Endpoint: indices.stats

	/**
	 * Provides statistics on operations happening in an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html"
	 */

	public CompletableFuture<StatsResponse> stats(StatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Provides statistics on operations happening in an index.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<StatsResponse> stats(Function<StatsRequest.Builder, ObjectBuilder<StatsRequest>> fn)
			throws IOException {
		return stats(fn.apply(new StatsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.unfreeze

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/unfreeze-index-api.html"
	 */

	public CompletableFuture<UnfreezeResponse> unfreeze(UnfreezeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UnfreezeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/current/unfreeze-index-api.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UnfreezeResponse> unfreeze(
			Function<UnfreezeRequest.Builder, ObjectBuilder<UnfreezeRequest>> fn) throws IOException {
		return unfreeze(fn.apply(new UnfreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Updates index aliases.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 */

	public CompletableFuture<UpdateAliasesResponse> updateAliases(UpdateAliasesRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateAliasesRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates index aliases.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UpdateAliasesResponse> updateAliases(
			Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn) throws IOException {
		return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build());
	}

	// ----- Endpoint: indices.upgrade

	/**
	 * DEPRECATED Upgrades to the current version of Lucene.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html"
	 */

	public CompletableFuture<UpgradeResponse> upgrade(UpgradeRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpgradeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * DEPRECATED Upgrades to the current version of Lucene.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<UpgradeResponse> upgrade(
			Function<UpgradeRequest.Builder, ObjectBuilder<UpgradeRequest>> fn) throws IOException {
		return upgrade(fn.apply(new UpgradeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html"
	 */

	public CompletableFuture<ValidateQueryResponse> validateQuery(ValidateQueryRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ValidateQueryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ValidateQueryResponse> validateQuery(
			Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn) throws IOException {
		return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #IndicesAsyncClient} with specific request options.
	 */
	@Override
	public IndicesAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new IndicesAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #IndicesAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public IndicesAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
