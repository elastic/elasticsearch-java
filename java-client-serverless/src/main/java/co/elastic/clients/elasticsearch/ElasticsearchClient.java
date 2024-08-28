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

package co.elastic.clients.elasticsearch;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch.async_search.ElasticsearchAsyncSearchClient;
import co.elastic.clients.elasticsearch.cat.ElasticsearchCatClient;
import co.elastic.clients.elasticsearch.cluster.ElasticsearchClusterClient;
import co.elastic.clients.elasticsearch.connector.ElasticsearchConnectorClient;
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
import co.elastic.clients.elasticsearch.core.RenderSearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.RenderSearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteRequest;
import co.elastic.clients.elasticsearch.core.ScriptsPainlessExecuteResponse;
import co.elastic.clients.elasticsearch.core.ScrollRequest;
import co.elastic.clients.elasticsearch.core.ScrollResponse;
import co.elastic.clients.elasticsearch.core.SearchMvtRequest;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.SearchTemplateRequest;
import co.elastic.clients.elasticsearch.core.SearchTemplateResponse;
import co.elastic.clients.elasticsearch.core.TermsEnumRequest;
import co.elastic.clients.elasticsearch.core.TermsEnumResponse;
import co.elastic.clients.elasticsearch.core.TermvectorsRequest;
import co.elastic.clients.elasticsearch.core.TermvectorsResponse;
import co.elastic.clients.elasticsearch.core.UpdateByQueryRequest;
import co.elastic.clients.elasticsearch.core.UpdateByQueryResponse;
import co.elastic.clients.elasticsearch.core.UpdateRequest;
import co.elastic.clients.elasticsearch.core.UpdateResponse;
import co.elastic.clients.elasticsearch.enrich.ElasticsearchEnrichClient;
import co.elastic.clients.elasticsearch.eql.ElasticsearchEqlClient;
import co.elastic.clients.elasticsearch.esql.ElasticsearchEsqlClient;
import co.elastic.clients.elasticsearch.graph.ElasticsearchGraphClient;
import co.elastic.clients.elasticsearch.indices.ElasticsearchIndicesClient;
import co.elastic.clients.elasticsearch.inference.ElasticsearchInferenceClient;
import co.elastic.clients.elasticsearch.ingest.ElasticsearchIngestClient;
import co.elastic.clients.elasticsearch.license.ElasticsearchLicenseClient;
import co.elastic.clients.elasticsearch.logstash.ElasticsearchLogstashClient;
import co.elastic.clients.elasticsearch.ml.ElasticsearchMlClient;
import co.elastic.clients.elasticsearch.query_rules.ElasticsearchQueryRulesClient;
import co.elastic.clients.elasticsearch.search_application.ElasticsearchSearchApplicationClient;
import co.elastic.clients.elasticsearch.security.ElasticsearchSecurityClient;
import co.elastic.clients.elasticsearch.sql.ElasticsearchSqlClient;
import co.elastic.clients.elasticsearch.synonyms.ElasticsearchSynonymsClient;
import co.elastic.clients.elasticsearch.tasks.ElasticsearchTasksClient;
import co.elastic.clients.elasticsearch.transform.ElasticsearchTransformClient;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.lang.reflect.Type;
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
 * Client for the namespace.
 */
public class ElasticsearchClient extends ApiClient<ElasticsearchTransport, ElasticsearchClient> {

	public ElasticsearchClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchClient(this.transport, transportOptions);
	}

	// ----- Child clients

	public ElasticsearchAsyncSearchClient asyncSearch() {
		return new ElasticsearchAsyncSearchClient(this.transport, this.transportOptions);
	}

	public ElasticsearchCatClient cat() {
		return new ElasticsearchCatClient(this.transport, this.transportOptions);
	}

	public ElasticsearchClusterClient cluster() {
		return new ElasticsearchClusterClient(this.transport, this.transportOptions);
	}

	public ElasticsearchConnectorClient connector() {
		return new ElasticsearchConnectorClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEnrichClient enrich() {
		return new ElasticsearchEnrichClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEqlClient eql() {
		return new ElasticsearchEqlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchEsqlClient esql() {
		return new ElasticsearchEsqlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchGraphClient graph() {
		return new ElasticsearchGraphClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIndicesClient indices() {
		return new ElasticsearchIndicesClient(this.transport, this.transportOptions);
	}

	public ElasticsearchInferenceClient inference() {
		return new ElasticsearchInferenceClient(this.transport, this.transportOptions);
	}

	public ElasticsearchIngestClient ingest() {
		return new ElasticsearchIngestClient(this.transport, this.transportOptions);
	}

	public ElasticsearchLicenseClient license() {
		return new ElasticsearchLicenseClient(this.transport, this.transportOptions);
	}

	public ElasticsearchLogstashClient logstash() {
		return new ElasticsearchLogstashClient(this.transport, this.transportOptions);
	}

	public ElasticsearchMlClient ml() {
		return new ElasticsearchMlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchQueryRulesClient queryRules() {
		return new ElasticsearchQueryRulesClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSearchApplicationClient searchApplication() {
		return new ElasticsearchSearchApplicationClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSecurityClient security() {
		return new ElasticsearchSecurityClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSqlClient sql() {
		return new ElasticsearchSqlClient(this.transport, this.transportOptions);
	}

	public ElasticsearchSynonymsClient synonyms() {
		return new ElasticsearchSynonymsClient(this.transport, this.transportOptions);
	}

	public ElasticsearchTasksClient tasks() {
		return new ElasticsearchTasksClient(this.transport, this.transportOptions);
	}

	public ElasticsearchTransformClient transform() {
		return new ElasticsearchTransformClient(this.transport, this.transportOptions);
	}

	// ----- Endpoint: bulk

	/**
	 * Bulk index or delete documents. Performs multiple indexing or delete
	 * operations in a single API call. This reduces overhead and can greatly
	 * increase indexing speed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public BulkResponse bulk(BulkRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkRequest, BulkResponse, ErrorResponse> endpoint = (JsonEndpoint<BulkRequest, BulkResponse, ErrorResponse>) BulkRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Bulk index or delete documents. Performs multiple indexing or delete
	 * operations in a single API call. This reduces overhead and can greatly
	 * increase indexing speed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BulkResponse bulk(Function<BulkRequest.Builder, ObjectBuilder<BulkRequest>> fn)
			throws IOException, ElasticsearchException {
		return bulk(fn.apply(new BulkRequest.Builder()).build());
	}

	/**
	 * Bulk index or delete documents. Performs multiple indexing or delete
	 * operations in a single API call. This reduces overhead and can greatly
	 * increase indexing speed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public BulkResponse bulk() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new BulkRequest.Builder().build(), BulkRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: clear_scroll

	/**
	 * Clears the search context and results for a scrolling search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearScrollResponse clearScroll(ClearScrollRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearScrollRequest, ClearScrollResponse, ErrorResponse>) ClearScrollRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clears the search context and results for a scrolling search.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearScrollResponse clearScroll(
			Function<ClearScrollRequest.Builder, ObjectBuilder<ClearScrollRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearScroll(fn.apply(new ClearScrollRequest.Builder()).build());
	}

	/**
	 * Clears the search context and results for a scrolling search.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearScrollResponse clearScroll() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ClearScrollRequest.Builder().build(), ClearScrollRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: close_point_in_time

	/**
	 * Closes a point-in-time.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClosePointInTimeResponse closePointInTime(ClosePointInTimeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse> endpoint = (JsonEndpoint<ClosePointInTimeRequest, ClosePointInTimeResponse, ErrorResponse>) ClosePointInTimeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Closes a point-in-time.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClosePointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClosePointInTimeResponse closePointInTime(
			Function<ClosePointInTimeRequest.Builder, ObjectBuilder<ClosePointInTimeRequest>> fn)
			throws IOException, ElasticsearchException {
		return closePointInTime(fn.apply(new ClosePointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: count

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count(CountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (JsonEndpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, ElasticsearchException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: create

	/**
	 * Index a document. Adds a JSON document to the specified data stream or index
	 * and makes it searchable. If the target is an index and the document already
	 * exists, the request updates the document and increments its version.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CreateResponse create(CreateRequest<TDocument> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateRequest<?>, CreateResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateRequest<?>, CreateResponse, ErrorResponse>) CreateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Index a document. Adds a JSON document to the specified data stream or index
	 * and makes it searchable. If the target is an index and the document already
	 * exists, the request updates the document and increments its version.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CreateResponse create(
			Function<CreateRequest.Builder<TDocument>, ObjectBuilder<CreateRequest<TDocument>>> fn)
			throws IOException, ElasticsearchException {
		return create(fn.apply(new CreateRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: delete

	/**
	 * Delete a document. Removes a JSON document from the specified index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteResponse delete(DeleteRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRequest, DeleteResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRequest, DeleteResponse, ErrorResponse>) DeleteRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a document. Removes a JSON document from the specified index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteResponse delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: delete_by_query

	/**
	 * Delete documents. Deletes documents that match the specified query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteByQueryResponse deleteByQuery(DeleteByQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteByQueryRequest, DeleteByQueryResponse, ErrorResponse>) DeleteByQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete documents. Deletes documents that match the specified query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteByQueryResponse deleteByQuery(
			Function<DeleteByQueryRequest.Builder, ObjectBuilder<DeleteByQueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteByQuery(fn.apply(new DeleteByQueryRequest.Builder()).build());
	}

	// ----- Endpoint: delete_script

	/**
	 * Delete a script or search template. Deletes a stored script or search
	 * template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteScriptResponse deleteScript(DeleteScriptRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteScriptRequest, DeleteScriptResponse, ErrorResponse>) DeleteScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a script or search template. Deletes a stored script or search
	 * template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteScriptResponse deleteScript(
			Function<DeleteScriptRequest.Builder, ObjectBuilder<DeleteScriptRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteScript(fn.apply(new DeleteScriptRequest.Builder()).build());
	}

	// ----- Endpoint: exists

	/**
	 * Check a document. Checks if a specified document exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsRequest, BooleanResponse, ErrorResponse>) ExistsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check a document. Checks if a specified document exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException, ElasticsearchException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: exists_source

	/**
	 * Check for a document source. Checks if a document's <code>_source</code> is
	 * stored.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsSource(ExistsSourceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsSourceRequest, BooleanResponse, ErrorResponse>) ExistsSourceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check for a document source. Checks if a document's <code>_source</code> is
	 * stored.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsSource(
			Function<ExistsSourceRequest.Builder, ObjectBuilder<ExistsSourceRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsSource(fn.apply(new ExistsSourceRequest.Builder()).build());
	}

	// ----- Endpoint: explain

	/**
	 * Explain a document match result. Returns information about why a specific
	 * document matches, or doesn’t match, a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ExplainResponse<TDocument> explain(ExplainRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse>) ExplainRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.explain.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Explain a document match result. Returns information about why a specific
	 * document matches, or doesn’t match, a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ExplainResponse<TDocument> explain(
			Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Explain a document match result. Returns information about why a specific
	 * document matches, or doesn’t match, a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ExplainResponse<TDocument> explain(ExplainRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ExplainRequest, ExplainResponse<TDocument>, ErrorResponse>) ExplainRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.explain.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Explain a document match result. Returns information about why a specific
	 * document matches, or doesn’t match, a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ExplainResponse<TDocument> explain(
			Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: field_caps

	/**
	 * The field capabilities API returns the information about the capabilities of
	 * fields among multiple indices. The field capabilities API returns runtime
	 * fields like any other field. For example, a runtime field with a type of
	 * keyword is returned as any other field that belongs to the
	 * <code>keyword</code> family.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public FieldCapsResponse fieldCaps(FieldCapsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse> endpoint = (JsonEndpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse>) FieldCapsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * The field capabilities API returns the information about the capabilities of
	 * fields among multiple indices. The field capabilities API returns runtime
	 * fields like any other field. For example, a runtime field with a type of
	 * keyword is returned as any other field that belongs to the
	 * <code>keyword</code> family.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FieldCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FieldCapsResponse fieldCaps(Function<FieldCapsRequest.Builder, ObjectBuilder<FieldCapsRequest>> fn)
			throws IOException, ElasticsearchException {
		return fieldCaps(fn.apply(new FieldCapsRequest.Builder()).build());
	}

	/**
	 * The field capabilities API returns the information about the capabilities of
	 * fields among multiple indices. The field capabilities API returns runtime
	 * fields like any other field. For example, a runtime field with a type of
	 * keyword is returned as any other field that belongs to the
	 * <code>keyword</code> family.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public FieldCapsResponse fieldCaps() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new FieldCapsRequest.Builder().build(), FieldCapsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: get

	/**
	 * Get a document by its ID. Retrieves the document with the specified ID from
	 * an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetResponse<TDocument> get(GetRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse>) GetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document by its ID. Retrieves the document with the specified ID from
	 * an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetResponse<TDocument> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return get(fn.apply(new GetRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Get a document by its ID. Retrieves the document with the specified ID from
	 * an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetResponse<TDocument> get(GetRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetRequest, GetResponse<TDocument>, ErrorResponse>) GetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document by its ID. Retrieves the document with the specified ID from
	 * an index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetResponse<TDocument> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return get(fn.apply(new GetRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: get_script

	/**
	 * Get a script or search template. Retrieves a stored script or search
	 * template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetScriptResponse getScript(GetScriptRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetScriptRequest, GetScriptResponse, ErrorResponse> endpoint = (JsonEndpoint<GetScriptRequest, GetScriptResponse, ErrorResponse>) GetScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a script or search template. Retrieves a stored script or search
	 * template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetScriptResponse getScript(Function<GetScriptRequest.Builder, ObjectBuilder<GetScriptRequest>> fn)
			throws IOException, ElasticsearchException {
		return getScript(fn.apply(new GetScriptRequest.Builder()).build());
	}

	// ----- Endpoint: get_source

	/**
	 * Get a document's source. Returns the source of a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetSourceResponse<TDocument> getSource(GetSourceRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse>) GetSourceRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get_source.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document's source. Returns the source of a document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetSourceResponse<TDocument> getSource(
			Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Get a document's source. Returns the source of a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> GetSourceResponse<TDocument> getSource(GetSourceRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<GetSourceRequest, GetSourceResponse<TDocument>, ErrorResponse>) GetSourceRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.get_source.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document's source. Returns the source of a document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> GetSourceResponse<TDocument> getSource(
			Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: index

	/**
	 * Index a document. Adds a JSON document to the specified data stream or index
	 * and makes it searchable. If the target is an index and the document already
	 * exists, the request updates the document and increments its version.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> IndexResponse index(IndexRequest<TDocument> request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndexRequest<?>, IndexResponse, ErrorResponse> endpoint = (JsonEndpoint<IndexRequest<?>, IndexResponse, ErrorResponse>) IndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Index a document. Adds a JSON document to the specified data stream or index
	 * and makes it searchable. If the target is an index and the document already
	 * exists, the request updates the document and increments its version.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> IndexResponse index(
			Function<IndexRequest.Builder<TDocument>, ObjectBuilder<IndexRequest<TDocument>>> fn)
			throws IOException, ElasticsearchException {
		return index(fn.apply(new IndexRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: info

	/**
	 * Get cluster info. Returns basic information about the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public InfoResponse info() throws IOException, ElasticsearchException {
		return this.transport.performRequest(InfoRequest._INSTANCE, InfoRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: mget

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MgetResponse<TDocument> mget(MgetRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse>) MgetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.mget.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final <TDocument> MgetResponse<TDocument> mget(Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return mget(fn.apply(new MgetRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MgetResponse<TDocument> mget(MgetRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MgetRequest, MgetResponse<TDocument>, ErrorResponse>) MgetRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.mget.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final <TDocument> MgetResponse<TDocument> mget(Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return mget(fn.apply(new MgetRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: msearch

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchResponse<TDocument> msearch(MsearchRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse>) MsearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final <TDocument> MsearchResponse<TDocument> msearch(
			Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return msearch(fn.apply(new MsearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchResponse<TDocument> msearch(MsearchRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse>) MsearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final <TDocument> MsearchResponse<TDocument> msearch(
			Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return msearch(fn.apply(new MsearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: msearch_template

	/**
	 * Runs multiple templated searches with a single request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(MsearchTemplateRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse>) MsearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch_template.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Runs multiple templated searches with a single request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(
			Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Runs multiple templated searches with a single request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(MsearchTemplateRequest request,
			Type tDocumentType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<MsearchTemplateRequest, MsearchTemplateResponse<TDocument>, ErrorResponse>) MsearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.msearch_template.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Runs multiple templated searches with a single request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MsearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> MsearchTemplateResponse<TDocument> msearchTemplate(
			Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: mtermvectors

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MtermvectorsResponse mtermvectors(MtermvectorsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse> endpoint = (JsonEndpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse>) MtermvectorsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final MtermvectorsResponse mtermvectors(
			Function<MtermvectorsRequest.Builder, ObjectBuilder<MtermvectorsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mtermvectors(fn.apply(new MtermvectorsRequest.Builder()).build());
	}

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MtermvectorsResponse mtermvectors() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MtermvectorsRequest.Builder().build(), MtermvectorsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: open_point_in_time

	/**
	 * A search request by default executes against the most recent visible data of
	 * the target indices, which is called point in time. Elasticsearch pit (point
	 * in time) is a lightweight view into the state of the data as it existed when
	 * initiated. In some cases, it’s preferred to perform multiple search requests
	 * using the same point in time. For example, if refreshes happen between
	 * <code>search_after</code> requests, then the results of those requests might
	 * not be consistent as changes happening between searches are only visible to
	 * the more recent point in time.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public OpenPointInTimeResponse openPointInTime(OpenPointInTimeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> endpoint = (JsonEndpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse>) OpenPointInTimeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * A search request by default executes against the most recent visible data of
	 * the target indices, which is called point in time. Elasticsearch pit (point
	 * in time) is a lightweight view into the state of the data as it existed when
	 * initiated. In some cases, it’s preferred to perform multiple search requests
	 * using the same point in time. For example, if refreshes happen between
	 * <code>search_after</code> requests, then the results of those requests might
	 * not be consistent as changes happening between searches are only visible to
	 * the more recent point in time.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OpenPointInTimeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final OpenPointInTimeResponse openPointInTime(
			Function<OpenPointInTimeRequest.Builder, ObjectBuilder<OpenPointInTimeRequest>> fn)
			throws IOException, ElasticsearchException {
		return openPointInTime(fn.apply(new OpenPointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: ping

	/**
	 * Ping the cluster. Returns whether the cluster is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public BooleanResponse ping() throws IOException, ElasticsearchException {
		return this.transport.performRequest(PingRequest._INSTANCE, PingRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: put_script

	/**
	 * Create or update a script or search template. Creates or updates a stored
	 * script or search template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutScriptResponse putScript(PutScriptRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutScriptRequest, PutScriptResponse, ErrorResponse> endpoint = (JsonEndpoint<PutScriptRequest, PutScriptResponse, ErrorResponse>) PutScriptRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a script or search template. Creates or updates a stored
	 * script or search template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutScriptRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutScriptResponse putScript(Function<PutScriptRequest.Builder, ObjectBuilder<PutScriptRequest>> fn)
			throws IOException, ElasticsearchException {
		return putScript(fn.apply(new PutScriptRequest.Builder()).build());
	}

	// ----- Endpoint: rank_eval

	/**
	 * Enables you to evaluate the quality of ranked search results over a set of
	 * typical search queries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public RankEvalResponse rankEval(RankEvalRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RankEvalRequest, RankEvalResponse, ErrorResponse> endpoint = (JsonEndpoint<RankEvalRequest, RankEvalResponse, ErrorResponse>) RankEvalRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Enables you to evaluate the quality of ranked search results over a set of
	 * typical search queries.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RankEvalRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RankEvalResponse rankEval(Function<RankEvalRequest.Builder, ObjectBuilder<RankEvalRequest>> fn)
			throws IOException, ElasticsearchException {
		return rankEval(fn.apply(new RankEvalRequest.Builder()).build());
	}

	// ----- Endpoint: reindex

	/**
	 * Reindex documents. Copies documents from a source to a destination. The
	 * source can be any existing index, alias, or data stream. The destination must
	 * differ from the source. For example, you cannot reindex a data stream into
	 * itself.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public ReindexResponse reindex(ReindexRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReindexRequest, ReindexResponse, ErrorResponse> endpoint = (JsonEndpoint<ReindexRequest, ReindexResponse, ErrorResponse>) ReindexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Reindex documents. Copies documents from a source to a destination. The
	 * source can be any existing index, alias, or data stream. The destination must
	 * differ from the source. For example, you cannot reindex a data stream into
	 * itself.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReindexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ReindexResponse reindex(Function<ReindexRequest.Builder, ObjectBuilder<ReindexRequest>> fn)
			throws IOException, ElasticsearchException {
		return reindex(fn.apply(new ReindexRequest.Builder()).build());
	}

	// ----- Endpoint: render_search_template

	/**
	 * Renders a search template as a search request body.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public RenderSearchTemplateResponse renderSearchTemplate(RenderSearchTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<RenderSearchTemplateRequest, RenderSearchTemplateResponse, ErrorResponse>) RenderSearchTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Renders a search template as a search request body.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RenderSearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RenderSearchTemplateResponse renderSearchTemplate(
			Function<RenderSearchTemplateRequest.Builder, ObjectBuilder<RenderSearchTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return renderSearchTemplate(fn.apply(new RenderSearchTemplateRequest.Builder()).build());
	}

	/**
	 * Renders a search template as a search request body.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/render-search-template-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public RenderSearchTemplateResponse renderSearchTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new RenderSearchTemplateRequest.Builder().build(),
				RenderSearchTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: scripts_painless_execute

	/**
	 * Run a script. Runs a script and returns a result.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			ScriptsPainlessExecuteRequest request, Class<TResult> tResultClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> endpoint = (JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse>) ScriptsPainlessExecuteRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scripts_painless_execute.Response.TResult",
				getDeserializer(tResultClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a script. Runs a script and returns a result.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScriptsPainlessExecuteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
			Class<TResult> tResultClass) throws IOException, ElasticsearchException {
		return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultClass);
	}

	/**
	 * Run a script. Runs a script and returns a result.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			ScriptsPainlessExecuteRequest request, Type tResultType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse> endpoint = (JsonEndpoint<ScriptsPainlessExecuteRequest, ScriptsPainlessExecuteResponse<TResult>, ErrorResponse>) ScriptsPainlessExecuteRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scripts_painless_execute.Response.TResult",
				getDeserializer(tResultType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run a script. Runs a script and returns a result.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScriptsPainlessExecuteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TResult> ScriptsPainlessExecuteResponse<TResult> scriptsPainlessExecute(
			Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
			Type tResultType) throws IOException, ElasticsearchException {
		return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultType);
	}

	// ----- Endpoint: scroll

	/**
	 * Allows to retrieve a large numbers of results from a single search request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-request-body.html#request-body-search-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ScrollResponse<TDocument> scroll(ScrollRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse>) ScrollRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scroll.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to retrieve a large numbers of results from a single search request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-request-body.html#request-body-search-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ScrollResponse<TDocument> scroll(
			Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return scroll(fn.apply(new ScrollRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Allows to retrieve a large numbers of results from a single search request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-request-body.html#request-body-search-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> ScrollResponse<TDocument> scroll(ScrollRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<ScrollRequest, ScrollResponse<TDocument>, ErrorResponse>) ScrollRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.scroll.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to retrieve a large numbers of results from a single search request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScrollRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-request-body.html#request-body-search-scroll">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> ScrollResponse<TDocument> scroll(
			Function<ScrollRequest.Builder, ObjectBuilder<ScrollRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return scroll(fn.apply(new ScrollRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: search

	/**
	 * Returns search hits that match the query defined in the request. You can
	 * provide search queries using the <code>q</code> query string parameter or the
	 * request body. If both are specified, only the query parameter is used.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchResponse<TDocument> search(SearchRequest request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse>) SearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns search hits that match the query defined in the request. You can
	 * provide search queries using the <code>q</code> query string parameter or the
	 * request body. If both are specified, only the query parameter is used.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchResponse<TDocument> search(
			Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Returns search hits that match the query defined in the request. You can
	 * provide search queries using the <code>q</code> query string parameter or the
	 * request body. If both are specified, only the query parameter is used.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchResponse<TDocument> search(SearchRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchRequest, SearchResponse<TDocument>, ErrorResponse>) SearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns search hits that match the query defined in the request. You can
	 * provide search queries using the <code>q</code> query string parameter or the
	 * request body. If both are specified, only the query parameter is used.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchResponse<TDocument> search(
			Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: search_mvt

	/**
	 * Search a vector tile. Searches a vector tile for geospatial values.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-vector-tile-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public BinaryResponse searchMvt(SearchMvtRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SearchMvtRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<SearchMvtRequest, BinaryResponse, ErrorResponse>) SearchMvtRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Search a vector tile. Searches a vector tile for geospatial values.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchMvtRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-vector-tile-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BinaryResponse searchMvt(Function<SearchMvtRequest.Builder, ObjectBuilder<SearchMvtRequest>> fn)
			throws IOException, ElasticsearchException {
		return searchMvt(fn.apply(new SearchMvtRequest.Builder()).build());
	}

	// ----- Endpoint: search_template

	/**
	 * Runs a search with a search template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchTemplateResponse<TDocument> searchTemplate(SearchTemplateRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse>) SearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search_template.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Runs a search with a search template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchTemplateResponse<TDocument> searchTemplate(
			Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Runs a search with a search template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> SearchTemplateResponse<TDocument> searchTemplate(SearchTemplateRequest request,
			Type tDocumentType) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<SearchTemplateRequest, SearchTemplateResponse<TDocument>, ErrorResponse>) SearchTemplateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.search_template.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Runs a search with a search template.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SearchTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> SearchTemplateResponse<TDocument> searchTemplate(
			Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentType);
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

	public TermsEnumResponse termsEnum(TermsEnumRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse> endpoint = (JsonEndpoint<TermsEnumRequest, TermsEnumResponse, ErrorResponse>) TermsEnumRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final TermsEnumResponse termsEnum(Function<TermsEnumRequest.Builder, ObjectBuilder<TermsEnumRequest>> fn)
			throws IOException, ElasticsearchException {
		return termsEnum(fn.apply(new TermsEnumRequest.Builder()).build());
	}

	// ----- Endpoint: termvectors

	/**
	 * Get term vector information. Returns information and statistics about terms
	 * in the fields of a particular document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> TermvectorsResponse termvectors(TermvectorsRequest<TDocument> request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse> endpoint = (JsonEndpoint<TermvectorsRequest<?>, TermvectorsResponse, ErrorResponse>) TermvectorsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get term vector information. Returns information and statistics about terms
	 * in the fields of a particular document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TermvectorsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> TermvectorsResponse termvectors(
			Function<TermvectorsRequest.Builder<TDocument>, ObjectBuilder<TermvectorsRequest<TDocument>>> fn)
			throws IOException, ElasticsearchException {
		return termvectors(fn.apply(new TermvectorsRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: update

	/**
	 * Update a document. Updates a document by running a script or passing a
	 * partial document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			UpdateRequest<TDocument, TPartialDocument> request, Class<TDocument> tDocumentClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse>) UpdateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.update.Response.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a document. Updates a document by running a script or passing a
	 * partial document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			Function<UpdateRequest.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return update(fn.apply(new UpdateRequest.Builder<TDocument, TPartialDocument>()).build(), tDocumentClass);
	}

	/**
	 * Update a document. Updates a document by running a script or passing a
	 * partial document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			UpdateRequest<TDocument, TPartialDocument> request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<UpdateRequest<?, ?>, UpdateResponse<TDocument>, ErrorResponse>) UpdateRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:_global.update.Response.TDocument", getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a document. Updates a document by running a script or passing a
	 * partial document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument, TPartialDocument> UpdateResponse<TDocument> update(
			Function<UpdateRequest.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn,
			Type tDocumentType) throws IOException, ElasticsearchException {
		return update(fn.apply(new UpdateRequest.Builder<TDocument, TPartialDocument>()).build(), tDocumentType);
	}

	// ----- Endpoint: update_by_query

	/**
	 * Update documents. Updates documents that match the specified query. If no
	 * query is specified, performs an update on every document in the data stream
	 * or index without modifying the source, which is useful for picking up mapping
	 * changes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateByQueryResponse updateByQuery(UpdateByQueryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateByQueryRequest, UpdateByQueryResponse, ErrorResponse>) UpdateByQueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update documents. Updates documents that match the specified query. If no
	 * query is specified, performs an update on every document in the data stream
	 * or index without modifying the source, which is useful for picking up mapping
	 * changes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateByQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateByQueryResponse updateByQuery(
			Function<UpdateByQueryRequest.Builder, ObjectBuilder<UpdateByQueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateByQuery(fn.apply(new UpdateByQueryRequest.Builder()).build());
	}

}
