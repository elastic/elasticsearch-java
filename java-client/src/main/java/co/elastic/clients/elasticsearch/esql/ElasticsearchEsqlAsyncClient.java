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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._helpers.esql.EsqlAdapter;
import co.elastic.clients.elasticsearch._helpers.esql.EsqlHelper;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BinaryResponse;
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
 * Client for the esql namespace.
 */
public class ElasticsearchEsqlAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchEsqlAsyncClient> {

	public ElasticsearchEsqlAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchEsqlAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchEsqlAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchEsqlAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: esql.delete_data_source

	/**
	 * Delete ES|QL data sources.
	 * <p>
	 * Deletes one or more data sources used in ES|QL data federation. Fails with
	 * <code>409</code> if any dataset references one of the named data sources;
	 * delete the dependent datasets first.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDataSourceRequest, DeleteDataSourceResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDataSourceRequest, DeleteDataSourceResponse, ErrorResponse>) DeleteDataSourceRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete ES|QL data sources.
	 * <p>
	 * Deletes one or more data sources used in ES|QL data federation. Fails with
	 * <code>409</code> if any dataset references one of the named data sources;
	 * delete the dependent datasets first.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDataSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDataSourceResponse> deleteDataSource(
			Function<DeleteDataSourceRequest.Builder, ObjectBuilder<DeleteDataSourceRequest>> fn) {
		return deleteDataSource(fn.apply(new DeleteDataSourceRequest.Builder()).build());
	}

	// ----- Endpoint: esql.delete_dataset

	/**
	 * Delete ES|QL datasets.
	 * <p>
	 * Deletes one or more datasets used in ES|QL data federation. If any specified
	 * dataset does not exist, the request fails and no datasets are deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDatasetRequest, DeleteDatasetResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteDatasetRequest, DeleteDatasetResponse, ErrorResponse>) DeleteDatasetRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete ES|QL datasets.
	 * <p>
	 * Deletes one or more datasets used in ES|QL data federation. If any specified
	 * dataset does not exist, the request fails and no datasets are deleted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDatasetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDatasetResponse> deleteDataset(
			Function<DeleteDatasetRequest.Builder, ObjectBuilder<DeleteDatasetRequest>> fn) {
		return deleteDataset(fn.apply(new DeleteDatasetRequest.Builder()).build());
	}

	// ----- Endpoint: esql.delete_view

	/**
	 * Delete an ES|QL view.
	 * <p>
	 * Deletes a stored ES|QL view.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteViewResponse> deleteView(DeleteViewRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteViewRequest, DeleteViewResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteViewRequest, DeleteViewResponse, ErrorResponse>) DeleteViewRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an ES|QL view.
	 * <p>
	 * Deletes a stored ES|QL view.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteViewRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteViewResponse> deleteView(
			Function<DeleteViewRequest.Builder, ObjectBuilder<DeleteViewRequest>> fn) {
		return deleteView(fn.apply(new DeleteViewRequest.Builder()).build());
	}

	// ----- Endpoint: esql.get_data_source

	/**
	 * Get ES|QL data sources.
	 * <p>
	 * Returns one or more data sources used in ES|QL data federation. A
	 * concrete-name miss returns <code>404</code>; a wildcard pattern or list-all
	 * request with no match returns <code>200</code> with an empty array.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDataSourceRequest, GetDataSourceResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDataSourceRequest, GetDataSourceResponse, ErrorResponse>) GetDataSourceRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get ES|QL data sources.
	 * <p>
	 * Returns one or more data sources used in ES|QL data federation. A
	 * concrete-name miss returns <code>404</code>; a wildcard pattern or list-all
	 * request with no match returns <code>200</code> with an empty array.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDataSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDataSourceResponse> getDataSource(
			Function<GetDataSourceRequest.Builder, ObjectBuilder<GetDataSourceRequest>> fn) {
		return getDataSource(fn.apply(new GetDataSourceRequest.Builder()).build());
	}

	/**
	 * Get ES|QL data sources.
	 * <p>
	 * Returns one or more data sources used in ES|QL data federation. A
	 * concrete-name miss returns <code>404</code>; a wildcard pattern or list-all
	 * request with no match returns <code>200</code> with an empty array.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDataSourceResponse> getDataSource() {
		return this.transport.performRequestAsync(new GetDataSourceRequest.Builder().build(),
				GetDataSourceRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: esql.get_dataset

	/**
	 * Get ES|QL datasets.
	 * <p>
	 * Returns one or more datasets used in ES|QL data federation. A concrete-name
	 * miss returns <code>404</code>; a wildcard pattern or list-all request with no
	 * match returns <code>200</code> with an empty array.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetDatasetRequest, GetDatasetResponse, ErrorResponse> endpoint = (JsonEndpoint<GetDatasetRequest, GetDatasetResponse, ErrorResponse>) GetDatasetRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get ES|QL datasets.
	 * <p>
	 * Returns one or more datasets used in ES|QL data federation. A concrete-name
	 * miss returns <code>404</code>; a wildcard pattern or list-all request with no
	 * match returns <code>200</code> with an empty array.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetDatasetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetDatasetResponse> getDataset(
			Function<GetDatasetRequest.Builder, ObjectBuilder<GetDatasetRequest>> fn) {
		return getDataset(fn.apply(new GetDatasetRequest.Builder()).build());
	}

	/**
	 * Get ES|QL datasets.
	 * <p>
	 * Returns one or more datasets used in ES|QL data federation. A concrete-name
	 * miss returns <code>404</code>; a wildcard pattern or list-all request with no
	 * match returns <code>200</code> with an empty array.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetDatasetResponse> getDataset() {
		return this.transport.performRequestAsync(new GetDatasetRequest.Builder().build(), GetDatasetRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: esql.get_query

	/**
	 * Get a specific running ES|QL query information.
	 * <p>
	 * Returns an object extended information about a running ES|QL query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-esql-get-query">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetQueryResponse> getQuery(GetQueryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetQueryRequest, GetQueryResponse, ErrorResponse> endpoint = (JsonEndpoint<GetQueryRequest, GetQueryResponse, ErrorResponse>) GetQueryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a specific running ES|QL query information.
	 * <p>
	 * Returns an object extended information about a running ES|QL query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetQueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-esql-get-query">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetQueryResponse> getQuery(
			Function<GetQueryRequest.Builder, ObjectBuilder<GetQueryRequest>> fn) {
		return getQuery(fn.apply(new GetQueryRequest.Builder()).build());
	}

	// ----- Endpoint: esql.get_view

	/**
	 * Get an ES|QL view.
	 * <p>
	 * Returns a stored ES|QL view.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetViewResponse> getView(GetViewRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetViewRequest, GetViewResponse, ErrorResponse> endpoint = (JsonEndpoint<GetViewRequest, GetViewResponse, ErrorResponse>) GetViewRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get an ES|QL view.
	 * <p>
	 * Returns a stored ES|QL view.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetViewRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetViewResponse> getView(
			Function<GetViewRequest.Builder, ObjectBuilder<GetViewRequest>> fn) {
		return getView(fn.apply(new GetViewRequest.Builder()).build());
	}

	/**
	 * Get an ES|QL view.
	 * <p>
	 * Returns a stored ES|QL view.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetViewResponse> getView() {
		return this.transport.performRequestAsync(new GetViewRequest.Builder().build(), GetViewRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: esql.list_queries

	/**
	 * Get running ES|QL queries information.
	 * <p>
	 * Returns an object containing IDs and other information about the running
	 * ES|QL queries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-esql-list-queries">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ListQueriesResponse> listQueries() {
		return this.transport.performRequestAsync(ListQueriesRequest._INSTANCE, ListQueriesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: esql.put_data_source

	/**
	 * Create or update an ES|QL data source.
	 * <p>
	 * Creates or replaces a named, type-specific data source configuration for
	 * ES|QL data federation. Datasets reference data source configurations to
	 * access external data. Names must be lowercase and follow index or alias
	 * naming rules.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutDataSourceResponse> putDataSource(PutDataSourceRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutDataSourceRequest, PutDataSourceResponse, ErrorResponse> endpoint = (JsonEndpoint<PutDataSourceRequest, PutDataSourceResponse, ErrorResponse>) PutDataSourceRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an ES|QL data source.
	 * <p>
	 * Creates or replaces a named, type-specific data source configuration for
	 * ES|QL data federation. Datasets reference data source configurations to
	 * access external data. Names must be lowercase and follow index or alias
	 * naming rules.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutDataSourceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutDataSourceResponse> putDataSource(
			Function<PutDataSourceRequest.Builder, ObjectBuilder<PutDataSourceRequest>> fn) {
		return putDataSource(fn.apply(new PutDataSourceRequest.Builder()).build());
	}

	// ----- Endpoint: esql.put_dataset

	/**
	 * Create or update an ES|QL dataset.
	 * <p>
	 * Creates or replaces a dataset that references a data source in ES|QL data
	 * federation. Dataset names participate in the index namespace and must follow
	 * index or alias naming rules. Returns <code>404</code> if the referenced data
	 * source does not exist.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutDatasetResponse> putDataset(PutDatasetRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutDatasetRequest, PutDatasetResponse, ErrorResponse> endpoint = (JsonEndpoint<PutDatasetRequest, PutDatasetResponse, ErrorResponse>) PutDatasetRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an ES|QL dataset.
	 * <p>
	 * Creates or replaces a dataset that references a data source in ES|QL data
	 * federation. Dataset names participate in the index namespace and must follow
	 * index or alias naming rules. Returns <code>404</code> if the referenced data
	 * source does not exist.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutDatasetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutDatasetResponse> putDataset(
			Function<PutDatasetRequest.Builder, ObjectBuilder<PutDatasetRequest>> fn) {
		return putDataset(fn.apply(new PutDatasetRequest.Builder()).build());
	}

	// ----- Endpoint: esql.put_view

	/**
	 * Create or update an ES|QL view.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutViewResponse> putView(PutViewRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutViewRequest, PutViewResponse, ErrorResponse> endpoint = (JsonEndpoint<PutViewRequest, PutViewResponse, ErrorResponse>) PutViewRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update an ES|QL view.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutViewRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutViewResponse> putView(
			Function<PutViewRequest.Builder, ObjectBuilder<PutViewRequest>> fn) {
		return putView(fn.apply(new PutViewRequest.Builder()).build());
	}

	// ----- Endpoint: esql.query

	/**
	 * Run an ES|QL query.
	 * <p>
	 * Get search results for an ES|QL (Elasticsearch query language) query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/explore-analyze/query-filter/languages/esql-rest">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BinaryResponse> query(QueryRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<QueryRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<QueryRequest, BinaryResponse, ErrorResponse>) QueryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run an ES|QL query.
	 * <p>
	 * Get search results for an ES|QL (Elasticsearch query language) query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/explore-analyze/query-filter/languages/esql-rest">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BinaryResponse> query(
			Function<QueryRequest.Builder, ObjectBuilder<QueryRequest>> fn) {
		return query(fn.apply(new QueryRequest.Builder()).build());
	}

	/**
	 * Executes an ES|QL request and adapts its result to a target type.
	 *
	 * @param adapter
	 *            the ES|QL response adapter
	 * @param query
	 *            the ES|QL query
	 * @param parameters
	 *            values for query parameters, if any
	 */
	public final <T> CompletableFuture<T> query(EsqlAdapter<T> adapter, String query, Object... parameters) {
		return EsqlHelper.queryAsync(this, adapter, query, parameters);
	}

	/**
	 * Executes an ES|QL request and adapts its result to a target type.
	 *
	 * @param adapter
	 *            the ES|QL response adapter
	 * @param request
	 *            the ES|QL request
	 */
	public final <T> CompletableFuture<T> query(EsqlAdapter<T> adapter, QueryRequest request) {
		return EsqlHelper.queryAsync(this, adapter, request);
	}

	/**
	 * Executes an ES|QL request and adapts its result to a target type.
	 *
	 * @param adapter
	 *            the ES|QL response adapter
	 * @param fn
	 *            the ES|QL request builder
	 */
	public final <T> CompletableFuture<T> query(EsqlAdapter<T> adapter,
			Function<QueryRequest.Builder, ObjectBuilder<QueryRequest>> fn) {
		return EsqlHelper.queryAsync(this, adapter, fn.apply(new QueryRequest.Builder()).build());
	}

}
