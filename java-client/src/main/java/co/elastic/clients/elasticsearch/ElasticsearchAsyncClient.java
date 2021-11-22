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

package co.elastic.clients.elasticsearch;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch.async_search.ElasticsearchAsyncSearchAsyncClient;
import co.elastic.clients.elasticsearch.autoscaling.ElasticsearchAutoscalingAsyncClient;
import co.elastic.clients.elasticsearch.cat.ElasticsearchCatAsyncClient;
import co.elastic.clients.elasticsearch.ccr.ElasticsearchCcrAsyncClient;
import co.elastic.clients.elasticsearch.cluster.ElasticsearchClusterAsyncClient;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.ClearScrollRequest;
import co.elastic.clients.elasticsearch.core.ClearScrollResponse;
import co.elastic.clients.elasticsearch.core.ClosePointInTimeRequest;
import co.elastic.clients.elasticsearch.core.ClosePointInTimeResponse;
import co.elastic.clients.elasticsearch.core.CountRequest;
import co.elastic.clients.elasticsearch.core.CountResponse;
import co.elastic.clients.elasticsearch.core.CreateRequest;
import co.elastic.clients.elasticsearch.core.CreateResponse;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRequest;
import co.elastic.clients.elasticsearch.core.DeleteByQueryResponse;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch.core.DeleteByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch.core.DeleteRequest;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.DeleteScriptRequest;
import co.elastic.clients.elasticsearch.core.DeleteScriptResponse;
import co.elastic.clients.elasticsearch.core.ExistsRequest;
import co.elastic.clients.elasticsearch.core.ExistsSourceRequest;
import co.elastic.clients.elasticsearch.core.ExplainRequest;
import co.elastic.clients.elasticsearch.core.ExplainResponse;
import co.elastic.clients.elasticsearch.core.FieldCapsRequest;
import co.elastic.clients.elasticsearch.core.FieldCapsResponse;
import co.elastic.clients.elasticsearch.core.GetRequest;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.GetScriptContextRequest;
import co.elastic.clients.elasticsearch.core.GetScriptContextResponse;
import co.elastic.clients.elasticsearch.core.GetScriptLanguagesRequest;
import co.elastic.clients.elasticsearch.core.GetScriptLanguagesResponse;
import co.elastic.clients.elasticsearch.core.GetScriptRequest;
import co.elastic.clients.elasticsearch.core.GetScriptResponse;
import co.elastic.clients.elasticsearch.core.GetSourceRequest;
import co.elastic.clients.elasticsearch.core.GetSourceResponse;
import co.elastic.clients.elasticsearch.core.IndexRequest;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.InfoRequest;
import co.elastic.clients.elasticsearch.core.InfoResponse;
import co.elastic.clients.elasticsearch.core.MgetRequest;
import co.elastic.clients.elasticsearch.core.MgetResponse;
import co.elastic.clients.elasticsearch.core.MsearchRequest;
import co.elastic.clients.elasticsearch.core.MsearchResponse;
import co.elastic.clients.elasticsearch.core.MsearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.MsearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.MtermvectorsRequest;
import co.elastic.clients.elasticsearch.core.MtermvectorsResponse;
import co.elastic.clients.elasticsearch.core.OpenPointInTimeRequest;
import co.elastic.clients.elasticsearch.core.OpenPointInTimeResponse;
import co.elastic.clients.elasticsearch.core.PingRequest;
import co.elastic.clients.elasticsearch.core.PutScriptRequest;
import co.elastic.clients.elasticsearch.core.PutScriptResponse;
import co.elastic.clients.elasticsearch.core.RankEvalRequest;
import co.elastic.clients.elasticsearch.core.RankEvalResponse;
import co.elastic.clients.elasticsearch.core.ReindexRequest;
import co.elastic.clients.elasticsearch.core.ReindexResponse;
import co.elastic.clients.elasticsearch.core.ReindexRethrottleRequest;
import co.elastic.clients.elasticsearch.core.ReindexRethrottleResponse;
import co.elastic.clients.elasticsearch.core.RenderSearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.RenderSearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteRequest;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteResponse;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.SearchShardsRequest;
import co.elastic.clients.elasticsearch.core.SearchShardsResponse;
import co.elastic.clients.elasticsearch.core.SearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.SearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.TermsEnumRequest;
import co.elastic.clients.elasticsearch.core.TermsEnumResponse;
import co.elastic.clients.elasticsearch.core.TermvectorsRequest;
import co.elastic.clients.elasticsearch.core.TermvectorsResponse;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRequest;
import co.elastic.clients.elasticsearch.core.UpdateByQueryResponse;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch.core.UpdateRequest;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.dangling_indices.ElasticsearchDanglingIndicesAsyncClient;
import co.elastic.clients.elasticsearch.enrich.ElasticsearchEnrichAsyncClient;
import co.elastic.clients.elasticsearch.eql.ElasticsearchEqlAsyncClient;
import co.elastic.clients.elasticsearch.features.ElasticsearchFeaturesAsyncClient;
import co.elastic.clients.elasticsearch.graph.ElasticsearchGraphAsyncClient;
import co.elastic.clients.elasticsearch.ilm.ElasticsearchIlmAsyncClient;
import co.elastic.clients.elasticsearch.indices.ElasticsearchIndicesAsyncClient;
import co.elastic.clients.elasticsearch.ingest.ElasticsearchIngestAsyncClient;
import co.elastic.clients.elasticsearch.license.ElasticsearchLicenseAsyncClient;
import co.elastic.clients.elasticsearch.logstash.ElasticsearchLogstashAsyncClient;
import co.elastic.clients.elasticsearch.migration.ElasticsearchMigrationAsyncClient;
import co.elastic.clients.elasticsearch.ml.ElasticsearchMlAsyncClient;
import co.elastic.clients.elasticsearch.monitoring.ElasticsearchMonitoringAsyncClient;
import co.elastic.clients.elasticsearch.nodes.ElasticsearchNodesAsyncClient;
import co.elastic.clients.elasticsearch.rollup.ElasticsearchRollupAsyncClient;
import co.elastic.clients.elasticsearch.searchable_snapshots.ElasticsearchSearchableSnapshotsAsyncClient;
import co.elastic.clients.elasticsearch.security.ElasticsearchSecurityAsyncClient;
import co.elastic.clients.elasticsearch.shutdown.ElasticsearchShutdownAsyncClient;
import co.elastic.clients.elasticsearch.slm.ElasticsearchSlmAsyncClient;
import co.elastic.clients.elasticsearch.snapshot.ElasticsearchSnapshotAsyncClient;
import co.elastic.clients.elasticsearch.sql.ElasticsearchSqlAsyncClient;
import co.elastic.clients.elasticsearch.ssl.ElasticsearchSslAsyncClient;
import co.elastic.clients.elasticsearch.tasks.ElasticsearchTasksAsyncClient;
import co.elastic.clients.elasticsearch.transform.ElasticsearchTransformAsyncClient;
import co.elastic.clients.elasticsearch.watcher.ElasticsearchWatcherAsyncClient;
import co.elastic.clients.elasticsearch.xpack.ElasticsearchXpackAsyncClient;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the namespace.
 */
public class ElasticsearchAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchAsyncClient> {

	public ElasticsearchAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchAsyncClient(this.transport, transportOptions);
	}

	// ----- Child clients

	public ElasticsearchAsyncSearchAsyncClient asyncSearch() {
		return new ElasticsearchAsyncSearchAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchAutoscalingAsyncClient autoscaling() {
		return new ElasticsearchAutoscalingAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchCatAsyncClient cat() {
		return new ElasticsearchCatAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchCcrAsyncClient ccr() {
		return new ElasticsearchCcrAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchClusterAsyncClient cluster() {
		return new ElasticsearchClusterAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchDanglingIndicesAsyncClient danglingIndices() {
		return new ElasticsearchDanglingIndicesAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEnrichAsyncClient enrich() {
		return new ElasticsearchEnrichAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEqlAsyncClient eql() {
		return new ElasticsearchEqlAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchFeaturesAsyncClient features() {
		return new ElasticsearchFeaturesAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchGraphAsyncClient graph() {
		return new ElasticsearchGraphAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIlmAsyncClient ilm() {
		return new ElasticsearchIlmAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIndicesAsyncClient indices() {
		return new ElasticsearchIndicesAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIngestAsyncClient ingest() {
		return new ElasticsearchIngestAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchLicenseAsyncClient license() {
		return new ElasticsearchLicenseAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchLogstashAsyncClient logstash() {
		return new ElasticsearchLogstashAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchMigrationAsyncClient migration() {
		return new ElasticsearchMigrationAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchMlAsyncClient ml() {
		return new ElasticsearchMlAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchMonitoringAsyncClient monitoring() {
		return new ElasticsearchMonitoringAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchNodesAsyncClient nodes() {
		return new ElasticsearchNodesAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchRollupAsyncClient rollup() {
		return new ElasticsearchRollupAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSearchableSnapshotsAsyncClient searchableSnapshots() {
		return new ElasticsearchSearchableSnapshotsAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSecurityAsyncClient security() {
		return new ElasticsearchSecurityAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchShutdownAsyncClient shutdown() {
		return new ElasticsearchShutdownAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSlmAsyncClient slm() {
		return new ElasticsearchSlmAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSnapshotAsyncClient snapshot() {
		return new ElasticsearchSnapshotAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSqlAsyncClient sql() {
		return new ElasticsearchSqlAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSslAsyncClient ssl() {
		return new ElasticsearchSslAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchTasksAsyncClient tasks() {
		return new ElasticsearchTasksAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchTransformAsyncClient transform() {
		return new ElasticsearchTransformAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchWatcherAsyncClient watcher() {
		return new ElasticsearchWatcherAsyncClient(this.transport, this.transportOptions);
	}

	public ElasticsearchXpackAsyncClient xpack() {
		return new ElasticsearchXpackAsyncClient(this.transport, this.transportOptions);
	}

	// ----- Endpoint: bulk

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BulkResponse> bulk(BulkRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<BulkRequest, BulkResponse, ErrorResponse> endpoint = (Endpoint<BulkRequest, BulkResponse, ErrorResponse>) BulkRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BulkResponse> bulk(Consumer<BulkRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		BulkRequest.Builder builder = new BulkRequest.Builder();
		fn.accept(builder);
		return bulk(builder.build());
	}

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BulkResponse> bulk() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new BulkRequest.Builder().build(), BulkRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: clear_scroll

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearScrollResponse> clearScroll(ClearScrollRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse> endpoint = (Endpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse>) ClearScrollRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearScrollResponse> clearScroll(Consumer<ClearScrollRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ClearScrollRequest.Builder builder = new ClearScrollRequest.Builder();
		fn.accept(builder);
		return clearScroll(builder.build());
	}

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearScrollResponse> clearScroll() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ClearScrollRequest.Builder().build(),
				ClearScrollRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: close_point_in_time

	/**
	 * Close a point in time
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClosePointInTimeResponse> closePointInTime(ClosePointInTimeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse> endpoint = (Endpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse>) ClosePointInTimeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Close a point in time
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClosePointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClosePointInTimeResponse> closePointInTime(
			Consumer<ClosePointInTimeRequest.Builder> fn) throws IOException, ElasticsearchException {
		ClosePointInTimeRequest.Builder builder = new ClosePointInTimeRequest.Builder();
		fn.accept(builder);
		return closePointInTime(builder.build());
	}

	// ----- Endpoint: count

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count(CountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (Endpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CountResponse> count(Consumer<CountRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CountRequest.Builder builder = new CountRequest.Builder();
		fn.accept(builder);
		return count(builder.build());
	}

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: create

	/**
	 * Creates a new document in the index.
	 * <p>
	 * Returns a 409 response when a document with a same ID already exists in the
	 * index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<CreateResponse> create(CreateRequest<TDocument> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<CreateRequest<?>, CreateResponse, ErrorResponse> endpoint = (Endpoint<CreateRequest<?>, CreateResponse, ErrorResponse>) CreateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a new document in the index.
	 * <p>
	 * Returns a 409 response when a document with a same ID already exists in the
	 * index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<CreateResponse> create(Consumer<CreateRequest.Builder<TDocument>> fn)
			throws IOException, ElasticsearchException {
		CreateRequest.Builder<TDocument> builder = new CreateRequest.Builder<TDocument>();
		fn.accept(builder);
		return create(builder.build());
	}

	// ----- Endpoint: delete

	/**
	 * Removes a document from the index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteResponse> delete(DeleteRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteRequest, DeleteResponse, ErrorResponse> endpoint = (Endpoint<DeleteRequest, DeleteResponse, ErrorResponse>) DeleteRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes a document from the index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteResponse> delete(Consumer<DeleteRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteRequest.Builder builder = new DeleteRequest.Builder();
		fn.accept(builder);
		return delete(builder.build());
	}

	// ----- Endpoint: delete_by_query

	/**
	 * Deletes documents matching the provided query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteByQueryResponse> deleteByQuery(DeleteByQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse> endpoint = (Endpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse>) DeleteByQueryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes documents matching the provided query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteByQueryResponse> deleteByQuery(Consumer<DeleteByQueryRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteByQueryRequest.Builder builder = new DeleteByQueryRequest.Builder();
		fn.accept(builder);
		return deleteByQuery(builder.build());
	}

	// ----- Endpoint: delete_by_query_rethrottle

	/**
	 * Changes the number of requests per second for a particular Delete By Query
	 * operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(
			DeleteByQueryRethrottleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse> endpoint = (Endpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse>) DeleteByQueryRethrottleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Delete By Query
	 * operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteByQueryRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(
			Consumer<DeleteByQueryRethrottleRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeleteByQueryRethrottleRequest.Builder builder = new DeleteByQueryRethrottleRequest.Builder();
		fn.accept(builder);
		return deleteByQueryRethrottle(builder.build());
	}

	// ----- Endpoint: delete_script

	/**
	 * Deletes a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse> endpoint = (Endpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse>) DeleteScriptRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteScriptResponse> deleteScript(Consumer<DeleteScriptRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteScriptRequest.Builder builder = new DeleteScriptRequest.Builder();
		fn.accept(builder);
		return deleteScript(builder.build());
	}

	// ----- Endpoint: exists

	/**
	 * Returns information about whether a document exists in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> exists(ExistsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsRequest, BooleanResponse, ErrorResponse>) ExistsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about whether a document exists in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> exists(Consumer<ExistsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExistsRequest.Builder builder = new ExistsRequest.Builder();
		fn.accept(builder);
		return exists(builder.build());
	}

	// ----- Endpoint: exists_source

	/**
	 * Returns information about whether a document source exists in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsSource(ExistsSourceRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse>) ExistsSourceRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about whether a document source exists in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsSource(Consumer<ExistsSourceRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ExistsSourceRequest.Builder builder = new ExistsSourceRequest.Builder();
		fn.accept(builder);
		return existsSource(builder.build());
	}

	// ----- Endpoint: explain

	/**
	 * Returns information about why a specific matches (or doesn't match) a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(ExplainRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse>) ExplainRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.explain.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about why a specific matches (or doesn't match) a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(Consumer<ExplainRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		ExplainRequest.Builder builder = new ExplainRequest.Builder();
		fn.accept(builder);
		return explain(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: field_caps

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FieldCapsResponse> fieldCaps(FieldCapsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse> endpoint = (Endpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse>) FieldCapsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FieldCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FieldCapsResponse> fieldCaps(Consumer<FieldCapsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		FieldCapsRequest.Builder builder = new FieldCapsRequest.Builder();
		fn.accept(builder);
		return fieldCaps(builder.build());
	}

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FieldCapsResponse> fieldCaps() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new FieldCapsRequest.Builder().build(), FieldCapsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get

	/**
	 * Returns a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetResponse<TDocument>> get(GetRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<GetRequest, GetResponse<TDocument>, ErrorResponse>) GetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetResponse<TDocument>> get(Consumer<GetRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		GetRequest.Builder builder = new GetRequest.Builder();
		fn.accept(builder);
		return get(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: get_script

	/**
	 * Returns a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetScriptResponse> getScript(GetScriptRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetScriptRequest, GetScriptResponse, ErrorResponse> endpoint = (Endpoint<GetScriptRequest, GetScriptResponse, ErrorResponse>) GetScriptRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetScriptResponse> getScript(Consumer<GetScriptRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetScriptRequest.Builder builder = new GetScriptRequest.Builder();
		fn.accept(builder);
		return getScript(builder.build());
	}

	// ----- Endpoint: get_script_context

	/**
	 * Returns all script contexts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-contexts.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetScriptContextResponse> getScriptContext() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetScriptContextRequest._INSTANCE, GetScriptContextRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get_script_languages

	/**
	 * Returns available script types, languages and contexts
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetScriptLanguagesRequest._INSTANCE,
				GetScriptLanguagesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: get_source

	/**
	 * Returns the source of a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(GetSourceRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse>) GetSourceRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get_source.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the source of a document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(
			Consumer<GetSourceRequest.Builder> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		GetSourceRequest.Builder builder = new GetSourceRequest.Builder();
		fn.accept(builder);
		return getSource(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: index

	/**
	 * Creates or updates a document in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<IndexResponse> index(IndexRequest<TDocument> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<IndexRequest<?>, IndexResponse, ErrorResponse> endpoint = (Endpoint<IndexRequest<?>, IndexResponse, ErrorResponse>) IndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a document in an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<IndexResponse> index(Consumer<IndexRequest.Builder<TDocument>> fn)
			throws IOException, ElasticsearchException {
		IndexRequest.Builder<TDocument> builder = new IndexRequest.Builder<TDocument>();
		fn.accept(builder);
		return index(builder.build());
	}

	// ----- Endpoint: info

	/**
	 * Returns basic information about the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<InfoResponse> info() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(InfoRequest._INSTANCE, InfoRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: mget

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<MgetResponse<TDocument>> mget(MgetRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse>) MgetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.mget.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MgetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<MgetResponse<TDocument>> mget(Consumer<MgetRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		MgetRequest.Builder builder = new MgetRequest.Builder();
		fn.accept(builder);
		return mget(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: msearch

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<MsearchResponse<TDocument>> msearch(MsearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse>) MsearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<MsearchResponse<TDocument>> msearch(Consumer<MsearchRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		MsearchRequest.Builder builder = new MsearchRequest.Builder();
		fn.accept(builder);
		return msearch(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: msearch_template

	/**
	 * Allows to execute several search template operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<MsearchTemplateResponse<TDocument>> msearchTemplate(
			MsearchTemplateRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse>) MsearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch_template.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to execute several search template operations in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<MsearchTemplateResponse<TDocument>> msearchTemplate(
			Consumer<MsearchTemplateRequest.Builder> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		MsearchTemplateRequest.Builder builder = new MsearchTemplateRequest.Builder();
		fn.accept(builder);
		return msearchTemplate(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: mtermvectors

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MtermvectorsResponse> mtermvectors(MtermvectorsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse> endpoint = (Endpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse>) MtermvectorsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MtermvectorsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MtermvectorsResponse> mtermvectors(Consumer<MtermvectorsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		MtermvectorsRequest.Builder builder = new MtermvectorsRequest.Builder();
		fn.accept(builder);
		return mtermvectors(builder.build());
	}

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MtermvectorsResponse> mtermvectors() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new MtermvectorsRequest.Builder().build(),
				MtermvectorsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: open_point_in_time

	/**
	 * Open a point in time that can be used in subsequent searches
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<OpenPointInTimeResponse> openPointInTime(OpenPointInTimeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> endpoint = (Endpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse>) OpenPointInTimeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Open a point in time that can be used in subsequent searches
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenPointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<OpenPointInTimeResponse> openPointInTime(Consumer<OpenPointInTimeRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		OpenPointInTimeRequest.Builder builder = new OpenPointInTimeRequest.Builder();
		fn.accept(builder);
		return openPointInTime(builder.build());
	}

	// ----- Endpoint: ping

	/**
	 * Returns whether the cluster is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<BooleanResponse> ping() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(PingRequest._INSTANCE, PingRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: put_script

	/**
	 * Creates or updates a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutScriptResponse> putScript(PutScriptRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutScriptRequest, PutScriptResponse, ErrorResponse> endpoint = (Endpoint<PutScriptRequest, PutScriptResponse, ErrorResponse>) PutScriptRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a script.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutScriptResponse> putScript(Consumer<PutScriptRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutScriptRequest.Builder builder = new PutScriptRequest.Builder();
		fn.accept(builder);
		return putScript(builder.build());
	}

	// ----- Endpoint: rank_eval

	/**
	 * Allows to evaluate the quality of ranked search results over a set of typical
	 * search queries
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RankEvalResponse> rankEval(RankEvalRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RankEvalRequest, RankEvalResponse, ErrorResponse> endpoint = (Endpoint<RankEvalRequest, RankEvalResponse, ErrorResponse>) RankEvalRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to evaluate the quality of ranked search results over a set of typical
	 * search queries
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RankEvalRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RankEvalResponse> rankEval(Consumer<RankEvalRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		RankEvalRequest.Builder builder = new RankEvalRequest.Builder();
		fn.accept(builder);
		return rankEval(builder.build());
	}

	// ----- Endpoint: reindex

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReindexResponse> reindex(ReindexRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ReindexRequest, ReindexResponse, ErrorResponse> endpoint = (Endpoint<ReindexRequest, ReindexResponse, ErrorResponse>) ReindexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReindexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReindexResponse> reindex(Consumer<ReindexRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ReindexRequest.Builder builder = new ReindexRequest.Builder();
		fn.accept(builder);
		return reindex(builder.build());
	}

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReindexResponse> reindex() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ReindexRequest.Builder().build(), ReindexRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: reindex_rethrottle

	/**
	 * Changes the number of requests per second for a particular Reindex operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(ReindexRethrottleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ReindexRethrottleRequest, ReindexRethrottleResponse, ErrorResponse> endpoint = (Endpoint<ReindexRethrottleRequest, ReindexRethrottleResponse, ErrorResponse>) ReindexRethrottleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Reindex operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReindexRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(
			Consumer<ReindexRethrottleRequest.Builder> fn) throws IOException, ElasticsearchException {
		ReindexRethrottleRequest.Builder builder = new ReindexRethrottleRequest.Builder();
		fn.accept(builder);
		return reindexRethrottle(builder.build());
	}

	// ----- Endpoint: render_search_template

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate(RenderSearchTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse> endpoint = (Endpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse>) RenderSearchTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RenderSearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate(
			Consumer<RenderSearchTemplateRequest.Builder> fn) throws IOException, ElasticsearchException {
		RenderSearchTemplateRequest.Builder builder = new RenderSearchTemplateRequest.Builder();
		fn.accept(builder);
		return renderSearchTemplate(builder.build());
	}

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RenderSearchTemplateResponse> renderSearchTemplate()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new RenderSearchTemplateRequest.Builder().build(),
				RenderSearchTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: scripts_painless_execute

	/**
	 * Allows an arbitrary script to be executed and a result to be returned
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
			ScriptsPainlessExecuteRequest request, Class<TResult> tResultClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> endpoint = (Endpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse>) ScriptsPainlessExecuteRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scripts_painless_execute.TResult",
				getDeserializer(tResultClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows an arbitrary script to be executed and a result to be returned
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScriptsPainlessExecuteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
			Consumer<ScriptsPainlessExecuteRequest.Builder> fn, Class<TResult> tResultClass)
			throws IOException, ElasticsearchException {
		ScriptsPainlessExecuteRequest.Builder builder = new ScriptsPainlessExecuteRequest.Builder();
		fn.accept(builder);
		return scriptsPainlessExecute(builder.build(), tResultClass);
	}

	// ----- Endpoint: search

	/**
	 * Returns results matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SearchResponse<TDocument>> search(SearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse>) SearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns results matching a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SearchResponse<TDocument>> search(Consumer<SearchRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		SearchRequest.Builder builder = new SearchRequest.Builder();
		fn.accept(builder);
		return search(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: search_shards

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SearchShardsResponse> searchShards(SearchShardsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SearchShardsRequest, SearchShardsResponse, ErrorResponse> endpoint = (Endpoint<SearchShardsRequest, SearchShardsResponse, ErrorResponse>) SearchShardsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchShardsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SearchShardsResponse> searchShards(Consumer<SearchShardsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		SearchShardsRequest.Builder builder = new SearchShardsRequest.Builder();
		fn.accept(builder);
		return searchShards(builder.build());
	}

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SearchShardsResponse> searchShards() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new SearchShardsRequest.Builder().build(),
				SearchShardsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: search_template

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
			SearchTemplateRequest request, Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse>) SearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search_template.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
			Consumer<SearchTemplateRequest.Builder> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		SearchTemplateRequest.Builder builder = new SearchTemplateRequest.Builder();
		fn.accept(builder);
		return searchTemplate(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: terms_enum

	/**
	 * The terms enum API can be used to discover terms in the index that begin with
	 * the provided string. It is designed for low-latency look-ups used in
	 * auto-complete scenarios.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TermsEnumResponse> termsEnum(TermsEnumRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse> endpoint = (Endpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse>) TermsEnumRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * The terms enum API can be used to discover terms in the index that begin with
	 * the provided string. It is designed for low-latency look-ups used in
	 * auto-complete scenarios.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TermsEnumRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TermsEnumResponse> termsEnum(Consumer<TermsEnumRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		TermsEnumRequest.Builder builder = new TermsEnumRequest.Builder();
		fn.accept(builder);
		return termsEnum(builder.build());
	}

	// ----- Endpoint: termvectors

	/**
	 * Returns information and statistics about terms in the fields of a particular
	 * document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<TermvectorsResponse> termvectors(TermvectorsRequest<TDocument> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse> endpoint = (Endpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse>) TermvectorsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information and statistics about terms in the fields of a particular
	 * document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TermvectorsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<TermvectorsResponse> termvectors(
			Consumer<TermvectorsRequest.Builder<TDocument>> fn) throws IOException, ElasticsearchException {
		TermvectorsRequest.Builder<TDocument> builder = new TermvectorsRequest.Builder<TDocument>();
		fn.accept(builder);
		return termvectors(builder.build());
	}

	// ----- Endpoint: update

	/**
	 * Updates a document with a script or partial document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument, TPartialDocument> CompletableFuture<UpdateResponse<TDocument>> update(
			UpdateRequest<TDocument, TPartialDocument> request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse>) UpdateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.update.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates a document with a script or partial document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument, TPartialDocument> CompletableFuture<UpdateResponse<TDocument>> update(
			Consumer<UpdateRequest.Builder<TDocument, TPartialDocument>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		UpdateRequest.Builder<TDocument, TPartialDocument> builder = new UpdateRequest.Builder<TDocument, TPartialDocument>();
		fn.accept(builder);
		return update(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: update_by_query

	/**
	 * Performs an update on every document in the index without changing the
	 * source, for example to pick up a mapping change.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateByQueryResponse> updateByQuery(UpdateByQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse> endpoint = (Endpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse>) UpdateByQueryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Performs an update on every document in the index without changing the
	 * source, for example to pick up a mapping change.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateByQueryResponse> updateByQuery(Consumer<UpdateByQueryRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		UpdateByQueryRequest.Builder builder = new UpdateByQueryRequest.Builder();
		fn.accept(builder);
		return updateByQuery(builder.build());
	}

	// ----- Endpoint: update_by_query_rethrottle

	/**
	 * Changes the number of requests per second for a particular Update By Query
	 * operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(
			UpdateByQueryRethrottleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateByQueryRethrottleRequest, UpdateByQueryRethrottleResponse, ErrorResponse> endpoint = (Endpoint<UpdateByQueryRethrottleRequest, UpdateByQueryRethrottleResponse, ErrorResponse>) UpdateByQueryRethrottleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Update By Query
	 * operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateByQueryRethrottleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(
			Consumer<UpdateByQueryRethrottleRequest.Builder> fn) throws IOException, ElasticsearchException {
		UpdateByQueryRethrottleRequest.Builder builder = new UpdateByQueryRethrottleRequest.Builder();
		fn.accept(builder);
		return updateByQueryRethrottle(builder.build());
	}

}
