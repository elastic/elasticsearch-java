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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Consumer;
import javax.annotation.Nullable;

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
	 * Adds a block to an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html">Documentation
	 *      on elastic.co</a>
	 */

	public AddBlockResponse addBlock(AddBlockRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<AddBlockRequest, AddBlockResponse, ErrorResponse> endpoint = (Endpoint<AddBlockRequest, AddBlockResponse, ErrorResponse>) AddBlockRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final AddBlockResponse addBlock(Consumer<AddBlockRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		AddBlockRequest.Builder builder = new AddBlockRequest.Builder();
		fn.accept(builder);
		return addBlock(builder.build());
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

	public AnalyzeResponse analyze(AnalyzeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse> endpoint = (Endpoint<AnalyzeRequest, AnalyzeResponse, ErrorResponse>) AnalyzeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final AnalyzeResponse analyze(Consumer<AnalyzeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		AnalyzeRequest.Builder builder = new AnalyzeRequest.Builder();
		fn.accept(builder);
		return analyze(builder.build());
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public AnalyzeResponse analyze() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new AnalyzeRequest.Builder().build(), AnalyzeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse> endpoint = (Endpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse>) ClearCacheRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ClearCacheResponse clearCache(Consumer<ClearCacheRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ClearCacheRequest.Builder builder = new ClearCacheRequest.Builder();
		fn.accept(builder);
		return clearCache(builder.build());
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ClearCacheRequest.Builder().build(), ClearCacheRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.clone

	/**
	 * Clones an index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CloneIndexResponse clone(CloneIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CloneIndexRequest, CloneIndexResponse, ErrorResponse> endpoint = (Endpoint<CloneIndexRequest, CloneIndexResponse, ErrorResponse>) CloneIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CloneIndexResponse clone(Consumer<CloneIndexRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CloneIndexRequest.Builder builder = new CloneIndexRequest.Builder();
		fn.accept(builder);
		return clone(builder.build());
	}

	// ----- Endpoint: indices.close

	/**
	 * Closes an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public CloseIndexResponse close(CloseIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CloseIndexRequest, CloseIndexResponse, ErrorResponse> endpoint = (Endpoint<CloseIndexRequest, CloseIndexResponse, ErrorResponse>) CloseIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CloseIndexResponse close(Consumer<CloseIndexRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CloseIndexRequest.Builder builder = new CloseIndexRequest.Builder();
		fn.accept(builder);
		return close(builder.build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Creates an index with optional settings and mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-create-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CreateIndexResponse create(CreateIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CreateIndexRequest, CreateIndexResponse, ErrorResponse> endpoint = (Endpoint<CreateIndexRequest, CreateIndexResponse, ErrorResponse>) CreateIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CreateIndexResponse create(Consumer<CreateIndexRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CreateIndexRequest.Builder builder = new CreateIndexRequest.Builder();
		fn.accept(builder);
		return create(builder.build());
	}

	// ----- Endpoint: indices.create_data_stream

	/**
	 * Creates a data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CreateDataStreamResponse createDataStream(CreateDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CreateDataStreamRequest, CreateDataStreamResponse, ErrorResponse> endpoint = (Endpoint<CreateDataStreamRequest, CreateDataStreamResponse, ErrorResponse>) CreateDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CreateDataStreamResponse createDataStream(Consumer<CreateDataStreamRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CreateDataStreamRequest.Builder builder = new CreateDataStreamRequest.Builder();
		fn.accept(builder);
		return createDataStream(builder.build());
	}

	// ----- Endpoint: indices.data_streams_stats

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public DataStreamsStatsResponse dataStreamsStats(DataStreamsStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DataStreamsStatsRequest, DataStreamsStatsResponse, ErrorResponse> endpoint = (Endpoint<DataStreamsStatsRequest, DataStreamsStatsResponse, ErrorResponse>) DataStreamsStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DataStreamsStatsResponse dataStreamsStats(Consumer<DataStreamsStatsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DataStreamsStatsRequest.Builder builder = new DataStreamsStatsRequest.Builder();
		fn.accept(builder);
		return dataStreamsStats(builder.build());
	}

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public DataStreamsStatsResponse dataStreamsStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new DataStreamsStatsRequest.Builder().build(),
				DataStreamsStatsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.delete

	/**
	 * Deletes an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteIndexResponse delete(DeleteIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteIndexRequest, DeleteIndexResponse, ErrorResponse> endpoint = (Endpoint<DeleteIndexRequest, DeleteIndexResponse, ErrorResponse>) DeleteIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteIndexResponse delete(Consumer<DeleteIndexRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteIndexRequest.Builder builder = new DeleteIndexRequest.Builder();
		fn.accept(builder);
		return delete(builder.build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Deletes an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteAliasRequest, DeleteAliasResponse, ErrorResponse> endpoint = (Endpoint<DeleteAliasRequest, DeleteAliasResponse, ErrorResponse>) DeleteAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteAliasResponse deleteAlias(Consumer<DeleteAliasRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteAliasRequest.Builder builder = new DeleteAliasRequest.Builder();
		fn.accept(builder);
		return deleteAlias(builder.build());
	}

	// ----- Endpoint: indices.delete_data_stream

	/**
	 * Deletes a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDataStreamResponse deleteDataStream(DeleteDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteDataStreamRequest, DeleteDataStreamResponse, ErrorResponse> endpoint = (Endpoint<DeleteDataStreamRequest, DeleteDataStreamResponse, ErrorResponse>) DeleteDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteDataStreamResponse deleteDataStream(Consumer<DeleteDataStreamRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteDataStreamRequest.Builder builder = new DeleteDataStreamRequest.Builder();
		fn.accept(builder);
		return deleteDataStream(builder.build());
	}

	// ----- Endpoint: indices.delete_index_template

	/**
	 * Deletes an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteIndexTemplateResponse deleteIndexTemplate(DeleteIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteIndexTemplateRequest, DeleteIndexTemplateResponse, ErrorResponse> endpoint = (Endpoint<DeleteIndexTemplateRequest, DeleteIndexTemplateResponse, ErrorResponse>) DeleteIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteIndexTemplateResponse deleteIndexTemplate(Consumer<DeleteIndexTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteIndexTemplateRequest.Builder builder = new DeleteIndexTemplateRequest.Builder();
		fn.accept(builder);
		return deleteIndexTemplate(builder.build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Deletes an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteTemplateRequest, DeleteTemplateResponse, ErrorResponse> endpoint = (Endpoint<DeleteTemplateRequest, DeleteTemplateResponse, ErrorResponse>) DeleteTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteTemplateResponse deleteTemplate(Consumer<DeleteTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteTemplateRequest.Builder builder = new DeleteTemplateRequest.Builder();
		fn.accept(builder);
		return deleteTemplate(builder.build());
	}

	// ----- Endpoint: indices.disk_usage

	/**
	 * Analyzes the disk usage of each field of an index or data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-disk-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public DiskUsageResponse diskUsage(DiskUsageRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DiskUsageRequest, DiskUsageResponse, ErrorResponse> endpoint = (Endpoint<DiskUsageRequest, DiskUsageResponse, ErrorResponse>) DiskUsageRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DiskUsageResponse diskUsage(Consumer<DiskUsageRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DiskUsageRequest.Builder builder = new DiskUsageRequest.Builder();
		fn.accept(builder);
		return diskUsage(builder.build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Returns information about whether a particular index exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsRequest, BooleanResponse, ErrorResponse>) ExistsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final BooleanResponse exists(Consumer<ExistsRequest.Builder> fn) throws IOException, ElasticsearchException {
		ExistsRequest.Builder builder = new ExistsRequest.Builder();
		fn.accept(builder);
		return exists(builder.build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Returns information about whether a particular alias exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsAlias(ExistsAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsAliasRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsAliasRequest, BooleanResponse, ErrorResponse>) ExistsAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final BooleanResponse existsAlias(Consumer<ExistsAliasRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExistsAliasRequest.Builder builder = new ExistsAliasRequest.Builder();
		fn.accept(builder);
		return existsAlias(builder.build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsIndexTemplate(ExistsIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsIndexTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsIndexTemplateRequest, BooleanResponse, ErrorResponse>) ExistsIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final BooleanResponse existsIndexTemplate(Consumer<ExistsIndexTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExistsIndexTemplateRequest.Builder builder = new ExistsIndexTemplateRequest.Builder();
		fn.accept(builder);
		return existsIndexTemplate(builder.build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsTemplate(ExistsTemplateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsTemplateRequest, BooleanResponse, ErrorResponse>) ExistsTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final BooleanResponse existsTemplate(Consumer<ExistsTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExistsTemplateRequest.Builder builder = new ExistsTemplateRequest.Builder();
		fn.accept(builder);
		return existsTemplate(builder.build());
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

	public BooleanResponse existsType(ExistsTypeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsTypeRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsTypeRequest, BooleanResponse, ErrorResponse>) ExistsTypeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final BooleanResponse existsType(Consumer<ExistsTypeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExistsTypeRequest.Builder builder = new ExistsTypeRequest.Builder();
		fn.accept(builder);
		return existsType(builder.build());
	}

	// ----- Endpoint: indices.flush

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushResponse flush(FlushRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<FlushRequest, FlushResponse, ErrorResponse> endpoint = (Endpoint<FlushRequest, FlushResponse, ErrorResponse>) FlushRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final FlushResponse flush(Consumer<FlushRequest.Builder> fn) throws IOException, ElasticsearchException {
		FlushRequest.Builder builder = new FlushRequest.Builder();
		fn.accept(builder);
		return flush(builder.build());
	}

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushResponse flush() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new FlushRequest.Builder().build(), FlushRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.flush_synced

	/**
	 * Performs a synced flush operation on one or more indices. Synced flush is
	 * deprecated and will be removed in 8.0. Use flush instead
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-synced-flush-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushSyncedResponse flushSynced(FlushSyncedRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<FlushSyncedRequest, FlushSyncedResponse, ErrorResponse> endpoint = (Endpoint<FlushSyncedRequest, FlushSyncedResponse, ErrorResponse>) FlushSyncedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Performs a synced flush operation on one or more indices. Synced flush is
	 * deprecated and will be removed in 8.0. Use flush instead
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FlushSyncedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-synced-flush-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FlushSyncedResponse flushSynced(Consumer<FlushSyncedRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		FlushSyncedRequest.Builder builder = new FlushSyncedRequest.Builder();
		fn.accept(builder);
		return flushSynced(builder.build());
	}

	/**
	 * Performs a synced flush operation on one or more indices. Synced flush is
	 * deprecated and will be removed in 8.0. Use flush instead
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-synced-flush-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushSyncedResponse flushSynced() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new FlushSyncedRequest.Builder().build(), FlushSyncedRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.forcemerge

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public ForcemergeResponse forcemerge(ForcemergeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ForcemergeRequest, ForcemergeResponse, ErrorResponse> endpoint = (Endpoint<ForcemergeRequest, ForcemergeResponse, ErrorResponse>) ForcemergeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ForcemergeResponse forcemerge(Consumer<ForcemergeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ForcemergeRequest.Builder builder = new ForcemergeRequest.Builder();
		fn.accept(builder);
		return forcemerge(builder.build());
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public ForcemergeResponse forcemerge() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ForcemergeRequest.Builder().build(), ForcemergeRequest._ENDPOINT,
				this.transportOptions);
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

	public FreezeResponse freeze(FreezeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<FreezeRequest, FreezeResponse, ErrorResponse> endpoint = (Endpoint<FreezeRequest, FreezeResponse, ErrorResponse>) FreezeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final FreezeResponse freeze(Consumer<FreezeRequest.Builder> fn) throws IOException, ElasticsearchException {
		FreezeRequest.Builder builder = new FreezeRequest.Builder();
		fn.accept(builder);
		return freeze(builder.build());
	}

	// ----- Endpoint: indices.get

	/**
	 * Returns information about one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexResponse get(GetIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetIndexRequest, GetIndexResponse, ErrorResponse> endpoint = (Endpoint<GetIndexRequest, GetIndexResponse, ErrorResponse>) GetIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetIndexResponse get(Consumer<GetIndexRequest.Builder> fn) throws IOException, ElasticsearchException {
		GetIndexRequest.Builder builder = new GetIndexRequest.Builder();
		fn.accept(builder);
		return get(builder.build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Returns an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAliasResponse getAlias(GetAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetAliasRequest, GetAliasResponse, ErrorResponse> endpoint = (Endpoint<GetAliasRequest, GetAliasResponse, ErrorResponse>) GetAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetAliasResponse getAlias(Consumer<GetAliasRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetAliasRequest.Builder builder = new GetAliasRequest.Builder();
		fn.accept(builder);
		return getAlias(builder.build());
	}

	/**
	 * Returns an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAliasResponse getAlias() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetAliasRequest.Builder().build(), GetAliasRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_data_stream

	/**
	 * Returns data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataStreamResponse getDataStream(GetDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetDataStreamRequest, GetDataStreamResponse, ErrorResponse> endpoint = (Endpoint<GetDataStreamRequest, GetDataStreamResponse, ErrorResponse>) GetDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetDataStreamResponse getDataStream(Consumer<GetDataStreamRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetDataStreamRequest.Builder builder = new GetDataStreamRequest.Builder();
		fn.accept(builder);
		return getDataStream(builder.build());
	}

	/**
	 * Returns data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataStreamResponse getDataStream() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetDataStreamRequest.Builder().build(), GetDataStreamRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Returns mapping for one or more fields.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetFieldMappingResponse getFieldMapping(GetFieldMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetFieldMappingRequest, GetFieldMappingResponse, ErrorResponse> endpoint = (Endpoint<GetFieldMappingRequest, GetFieldMappingResponse, ErrorResponse>) GetFieldMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetFieldMappingResponse getFieldMapping(Consumer<GetFieldMappingRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetFieldMappingRequest.Builder builder = new GetFieldMappingRequest.Builder();
		fn.accept(builder);
		return getFieldMapping(builder.build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexTemplateResponse getIndexTemplate(GetIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetIndexTemplateRequest, GetIndexTemplateResponse, ErrorResponse> endpoint = (Endpoint<GetIndexTemplateRequest, GetIndexTemplateResponse, ErrorResponse>) GetIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetIndexTemplateResponse getIndexTemplate(Consumer<GetIndexTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetIndexTemplateRequest.Builder builder = new GetIndexTemplateRequest.Builder();
		fn.accept(builder);
		return getIndexTemplate(builder.build());
	}

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexTemplateResponse getIndexTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetIndexTemplateRequest.Builder().build(),
				GetIndexTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetMappingResponse getMapping(GetMappingRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetMappingRequest, GetMappingResponse, ErrorResponse> endpoint = (Endpoint<GetMappingRequest, GetMappingResponse, ErrorResponse>) GetMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetMappingResponse getMapping(Consumer<GetMappingRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetMappingRequest.Builder builder = new GetMappingRequest.Builder();
		fn.accept(builder);
		return getMapping(builder.build());
	}

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetMappingResponse getMapping() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetMappingRequest.Builder().build(), GetMappingRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndicesSettingsResponse getSettings(GetIndicesSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetIndicesSettingsRequest, GetIndicesSettingsResponse, ErrorResponse> endpoint = (Endpoint<GetIndicesSettingsRequest, GetIndicesSettingsResponse, ErrorResponse>) GetIndicesSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIndicesSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetIndicesSettingsResponse getSettings(Consumer<GetIndicesSettingsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetIndicesSettingsRequest.Builder builder = new GetIndicesSettingsRequest.Builder();
		fn.accept(builder);
		return getSettings(builder.build());
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndicesSettingsResponse getSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetIndicesSettingsRequest.Builder().build(),
				GetIndicesSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTemplateResponse getTemplate(GetTemplateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetTemplateRequest, GetTemplateResponse, ErrorResponse> endpoint = (Endpoint<GetTemplateRequest, GetTemplateResponse, ErrorResponse>) GetTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetTemplateResponse getTemplate(Consumer<GetTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetTemplateRequest.Builder builder = new GetTemplateRequest.Builder();
		fn.accept(builder);
		return getTemplate(builder.build());
	}

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTemplateResponse getTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTemplateRequest.Builder().build(), GetTemplateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.get_upgrade

	/**
	 * DEPRECATED Returns a progress status of current upgrade.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetUpgradeResponse getUpgrade(GetUpgradeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetUpgradeRequest, GetUpgradeResponse, ErrorResponse> endpoint = (Endpoint<GetUpgradeRequest, GetUpgradeResponse, ErrorResponse>) GetUpgradeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * DEPRECATED Returns a progress status of current upgrade.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUpgradeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetUpgradeResponse getUpgrade(Consumer<GetUpgradeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetUpgradeRequest.Builder builder = new GetUpgradeRequest.Builder();
		fn.accept(builder);
		return getUpgrade(builder.build());
	}

	/**
	 * DEPRECATED Returns a progress status of current upgrade.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetUpgradeResponse getUpgrade() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetUpgradeRequest.Builder().build(), GetUpgradeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.migrate_to_data_stream

	/**
	 * Migrates an alias to a data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateToDataStreamResponse migrateToDataStream(MigrateToDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MigrateToDataStreamRequest, MigrateToDataStreamResponse, ErrorResponse> endpoint = (Endpoint<MigrateToDataStreamRequest, MigrateToDataStreamResponse, ErrorResponse>) MigrateToDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final MigrateToDataStreamResponse migrateToDataStream(Consumer<MigrateToDataStreamRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		MigrateToDataStreamRequest.Builder builder = new MigrateToDataStreamRequest.Builder();
		fn.accept(builder);
		return migrateToDataStream(builder.build());
	}

	// ----- Endpoint: indices.open

	/**
	 * Opens an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public OpenResponse open(OpenRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<OpenRequest, OpenResponse, ErrorResponse> endpoint = (Endpoint<OpenRequest, OpenResponse, ErrorResponse>) OpenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final OpenResponse open(Consumer<OpenRequest.Builder> fn) throws IOException, ElasticsearchException {
		OpenRequest.Builder builder = new OpenRequest.Builder();
		fn.accept(builder);
		return open(builder.build());
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

	public PromoteDataStreamResponse promoteDataStream(PromoteDataStreamRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PromoteDataStreamRequest, PromoteDataStreamResponse, ErrorResponse> endpoint = (Endpoint<PromoteDataStreamRequest, PromoteDataStreamResponse, ErrorResponse>) PromoteDataStreamRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PromoteDataStreamResponse promoteDataStream(Consumer<PromoteDataStreamRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PromoteDataStreamRequest.Builder builder = new PromoteDataStreamRequest.Builder();
		fn.accept(builder);
		return promoteDataStream(builder.build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Creates or updates an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAliasResponse putAlias(PutAliasRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutAliasRequest, PutAliasResponse, ErrorResponse> endpoint = (Endpoint<PutAliasRequest, PutAliasResponse, ErrorResponse>) PutAliasRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutAliasResponse putAlias(Consumer<PutAliasRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutAliasRequest.Builder builder = new PutAliasRequest.Builder();
		fn.accept(builder);
		return putAlias(builder.build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Creates or updates an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutIndexTemplateResponse putIndexTemplate(PutIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse> endpoint = (Endpoint<PutIndexTemplateRequest, PutIndexTemplateResponse, ErrorResponse>) PutIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutIndexTemplateResponse putIndexTemplate(Consumer<PutIndexTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutIndexTemplateRequest.Builder builder = new PutIndexTemplateRequest.Builder();
		fn.accept(builder);
		return putIndexTemplate(builder.build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Updates the index mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutMappingResponse putMapping(PutMappingRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutMappingRequest, PutMappingResponse, ErrorResponse> endpoint = (Endpoint<PutMappingRequest, PutMappingResponse, ErrorResponse>) PutMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutMappingResponse putMapping(Consumer<PutMappingRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutMappingRequest.Builder builder = new PutMappingRequest.Builder();
		fn.accept(builder);
		return putMapping(builder.build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Updates the index settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutIndicesSettingsResponse putSettings(PutIndicesSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutIndicesSettingsRequest, PutIndicesSettingsResponse, ErrorResponse> endpoint = (Endpoint<PutIndicesSettingsRequest, PutIndicesSettingsResponse, ErrorResponse>) PutIndicesSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the index settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIndicesSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutIndicesSettingsResponse putSettings(Consumer<PutIndicesSettingsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutIndicesSettingsRequest.Builder builder = new PutIndicesSettingsRequest.Builder();
		fn.accept(builder);
		return putSettings(builder.build());
	}

	/**
	 * Updates the index settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutIndicesSettingsResponse putSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PutIndicesSettingsRequest.Builder().build(),
				PutIndicesSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Creates or updates an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTemplateResponse putTemplate(PutTemplateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutTemplateRequest, PutTemplateResponse, ErrorResponse> endpoint = (Endpoint<PutTemplateRequest, PutTemplateResponse, ErrorResponse>) PutTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutTemplateResponse putTemplate(Consumer<PutTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutTemplateRequest.Builder builder = new PutTemplateRequest.Builder();
		fn.accept(builder);
		return putTemplate(builder.build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery(RecoveryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> endpoint = (Endpoint<RecoveryRequest, RecoveryResponse, ErrorResponse>) RecoveryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final RecoveryResponse recovery(Consumer<RecoveryRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		RecoveryRequest.Builder builder = new RecoveryRequest.Builder();
		fn.accept(builder);
		return recovery(builder.build());
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RecoveryRequest.Builder().build(), RecoveryRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public RefreshResponse refresh(RefreshRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RefreshRequest, RefreshResponse, ErrorResponse> endpoint = (Endpoint<RefreshRequest, RefreshResponse, ErrorResponse>) RefreshRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final RefreshResponse refresh(Consumer<RefreshRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		RefreshRequest.Builder builder = new RefreshRequest.Builder();
		fn.accept(builder);
		return refresh(builder.build());
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public RefreshResponse refresh() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RefreshRequest.Builder().build(), RefreshRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.reload_search_analyzers

	/**
	 * Reloads an index's search analyzers and their resources.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html">Documentation
	 *      on elastic.co</a>
	 */

	public ReloadSearchAnalyzersResponse reloadSearchAnalyzers(ReloadSearchAnalyzersRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ReloadSearchAnalyzersRequest, ReloadSearchAnalyzersResponse, ErrorResponse> endpoint = (Endpoint<ReloadSearchAnalyzersRequest, ReloadSearchAnalyzersResponse, ErrorResponse>) ReloadSearchAnalyzersRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ReloadSearchAnalyzersResponse reloadSearchAnalyzers(Consumer<ReloadSearchAnalyzersRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ReloadSearchAnalyzersRequest.Builder builder = new ReloadSearchAnalyzersRequest.Builder();
		fn.accept(builder);
		return reloadSearchAnalyzers(builder.build());
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResolveIndexResponse resolveIndex(ResolveIndexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ResolveIndexRequest, ResolveIndexResponse, ErrorResponse> endpoint = (Endpoint<ResolveIndexRequest, ResolveIndexResponse, ErrorResponse>) ResolveIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ResolveIndexResponse resolveIndex(Consumer<ResolveIndexRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ResolveIndexRequest.Builder builder = new ResolveIndexRequest.Builder();
		fn.accept(builder);
		return resolveIndex(builder.build());
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

	public RolloverResponse rollover(RolloverRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RolloverRequest, RolloverResponse, ErrorResponse> endpoint = (Endpoint<RolloverRequest, RolloverResponse, ErrorResponse>) RolloverRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final RolloverResponse rollover(Consumer<RolloverRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		RolloverRequest.Builder builder = new RolloverRequest.Builder();
		fn.accept(builder);
		return rollover(builder.build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments(SegmentsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SegmentsRequest, SegmentsResponse, ErrorResponse> endpoint = (Endpoint<SegmentsRequest, SegmentsResponse, ErrorResponse>) SegmentsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final SegmentsResponse segments(Consumer<SegmentsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SegmentsRequest.Builder builder = new SegmentsRequest.Builder();
		fn.accept(builder);
		return segments(builder.build());
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SegmentsRequest.Builder().build(), SegmentsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.shard_stores

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShardStoresResponse shardStores(ShardStoresRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ShardStoresRequest, ShardStoresResponse, ErrorResponse> endpoint = (Endpoint<ShardStoresRequest, ShardStoresResponse, ErrorResponse>) ShardStoresRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ShardStoresResponse shardStores(Consumer<ShardStoresRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ShardStoresRequest.Builder builder = new ShardStoresRequest.Builder();
		fn.accept(builder);
		return shardStores(builder.build());
	}

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShardStoresResponse shardStores() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ShardStoresRequest.Builder().build(), ShardStoresRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.shrink

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shrink-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShrinkResponse shrink(ShrinkRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ShrinkRequest, ShrinkResponse, ErrorResponse> endpoint = (Endpoint<ShrinkRequest, ShrinkResponse, ErrorResponse>) ShrinkRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ShrinkResponse shrink(Consumer<ShrinkRequest.Builder> fn) throws IOException, ElasticsearchException {
		ShrinkRequest.Builder builder = new ShrinkRequest.Builder();
		fn.accept(builder);
		return shrink(builder.build());
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

	public SimulateIndexTemplateResponse simulateIndexTemplate(SimulateIndexTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse> endpoint = (Endpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse>) SimulateIndexTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final SimulateIndexTemplateResponse simulateIndexTemplate(Consumer<SimulateIndexTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SimulateIndexTemplateRequest.Builder builder = new SimulateIndexTemplateRequest.Builder();
		fn.accept(builder);
		return simulateIndexTemplate(builder.build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateTemplateResponse simulateTemplate(SimulateTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SimulateTemplateRequest, SimulateTemplateResponse, ErrorResponse> endpoint = (Endpoint<SimulateTemplateRequest, SimulateTemplateResponse, ErrorResponse>) SimulateTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final SimulateTemplateResponse simulateTemplate(Consumer<SimulateTemplateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SimulateTemplateRequest.Builder builder = new SimulateTemplateRequest.Builder();
		fn.accept(builder);
		return simulateTemplate(builder.build());
	}

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateTemplateResponse simulateTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SimulateTemplateRequest.Builder().build(),
				SimulateTemplateRequest._ENDPOINT, this.transportOptions);
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

	public SplitResponse split(SplitRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SplitRequest, SplitResponse, ErrorResponse> endpoint = (Endpoint<SplitRequest, SplitResponse, ErrorResponse>) SplitRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final SplitResponse split(Consumer<SplitRequest.Builder> fn) throws IOException, ElasticsearchException {
		SplitRequest.Builder builder = new SplitRequest.Builder();
		fn.accept(builder);
		return split(builder.build());
	}

	// ----- Endpoint: indices.stats

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesStatsResponse stats(IndicesStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse> endpoint = (Endpoint<IndicesStatsRequest, IndicesStatsResponse, ErrorResponse>) IndicesStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final IndicesStatsResponse stats(Consumer<IndicesStatsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		IndicesStatsRequest.Builder builder = new IndicesStatsRequest.Builder();
		fn.accept(builder);
		return stats(builder.build());
	}

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new IndicesStatsRequest.Builder().build(), IndicesStatsRequest._ENDPOINT,
				this.transportOptions);
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

	public UnfreezeResponse unfreeze(UnfreezeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UnfreezeRequest, UnfreezeResponse, ErrorResponse> endpoint = (Endpoint<UnfreezeRequest, UnfreezeResponse, ErrorResponse>) UnfreezeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final UnfreezeResponse unfreeze(Consumer<UnfreezeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		UnfreezeRequest.Builder builder = new UnfreezeRequest.Builder();
		fn.accept(builder);
		return unfreeze(builder.build());
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Updates index aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateAliasesResponse updateAliases(UpdateAliasesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse> endpoint = (Endpoint<UpdateAliasesRequest, UpdateAliasesResponse, ErrorResponse>) UpdateAliasesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final UpdateAliasesResponse updateAliases(Consumer<UpdateAliasesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		UpdateAliasesRequest.Builder builder = new UpdateAliasesRequest.Builder();
		fn.accept(builder);
		return updateAliases(builder.build());
	}

	/**
	 * Updates index aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateAliasesResponse updateAliases() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new UpdateAliasesRequest.Builder().build(), UpdateAliasesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.upgrade

	/**
	 * DEPRECATED Upgrades to the current version of Lucene.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpgradeResponse upgrade(UpgradeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpgradeRequest, UpgradeResponse, ErrorResponse> endpoint = (Endpoint<UpgradeRequest, UpgradeResponse, ErrorResponse>) UpgradeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * DEPRECATED Upgrades to the current version of Lucene.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpgradeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpgradeResponse upgrade(Consumer<UpgradeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		UpgradeRequest.Builder builder = new UpgradeRequest.Builder();
		fn.accept(builder);
		return upgrade(builder.build());
	}

	/**
	 * DEPRECATED Upgrades to the current version of Lucene.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-upgrade.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpgradeResponse upgrade() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new UpgradeRequest.Builder().build(), UpgradeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateQueryResponse validateQuery(ValidateQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ValidateQueryRequest, ValidateQueryResponse, ErrorResponse> endpoint = (Endpoint<ValidateQueryRequest, ValidateQueryResponse, ErrorResponse>) ValidateQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ValidateQueryResponse validateQuery(Consumer<ValidateQueryRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ValidateQueryRequest.Builder builder = new ValidateQueryRequest.Builder();
		fn.accept(builder);
		return validateQuery(builder.build());
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateQueryResponse validateQuery() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ValidateQueryRequest.Builder().build(), ValidateQueryRequest._ENDPOINT,
				this.transportOptions);
	}

}
