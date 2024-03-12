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

package co.elastic.clients.elasticsearch.sql;

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
 * Client for the sql namespace.
 */
public class ElasticsearchSqlAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchSqlAsyncClient> {

	public ElasticsearchSqlAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSqlAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSqlAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSqlAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: sql.clear_cursor

	/**
	 * Clears the SQL cursor
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-sql-cursor-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCursorResponse> clearCursor(ClearCursorRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCursorRequest, ClearCursorResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCursorRequest, ClearCursorResponse, ErrorResponse>) ClearCursorRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clears the SQL cursor
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCursorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-sql-cursor-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCursorResponse> clearCursor(
			Function<ClearCursorRequest.Builder, ObjectBuilder<ClearCursorRequest>> fn) {
		return clearCursor(fn.apply(new ClearCursorRequest.Builder()).build());
	}

	// ----- Endpoint: sql.delete_async

	/**
	 * Deletes an async SQL search or a stored synchronous SQL search. If the search
	 * is still running, the API cancels it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-async-sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAsyncResponse> deleteAsync(DeleteAsyncRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAsyncRequest, DeleteAsyncResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAsyncRequest, DeleteAsyncResponse, ErrorResponse>) DeleteAsyncRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an async SQL search or a stored synchronous SQL search. If the search
	 * is still running, the API cancels it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAsyncRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-async-sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAsyncResponse> deleteAsync(
			Function<DeleteAsyncRequest.Builder, ObjectBuilder<DeleteAsyncRequest>> fn) {
		return deleteAsync(fn.apply(new DeleteAsyncRequest.Builder()).build());
	}

	// ----- Endpoint: sql.get_async

	/**
	 * Returns the current status and available results for an async SQL search or
	 * stored synchronous SQL search
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-async-sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAsyncResponse> getAsync(GetAsyncRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncRequest, GetAsyncResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncRequest, GetAsyncResponse, ErrorResponse>) GetAsyncRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the current status and available results for an async SQL search or
	 * stored synchronous SQL search
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-async-sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAsyncResponse> getAsync(
			Function<GetAsyncRequest.Builder, ObjectBuilder<GetAsyncRequest>> fn) {
		return getAsync(fn.apply(new GetAsyncRequest.Builder()).build());
	}

	// ----- Endpoint: sql.get_async_status

	/**
	 * Returns the current status of an async SQL search or a stored synchronous SQL
	 * search
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-async-sql-search-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAsyncStatusResponse> getAsyncStatus(GetAsyncStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAsyncStatusRequest, GetAsyncStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAsyncStatusRequest, GetAsyncStatusResponse, ErrorResponse>) GetAsyncStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the current status of an async SQL search or a stored synchronous SQL
	 * search
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAsyncStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-async-sql-search-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAsyncStatusResponse> getAsyncStatus(
			Function<GetAsyncStatusRequest.Builder, ObjectBuilder<GetAsyncStatusRequest>> fn) {
		return getAsyncStatus(fn.apply(new GetAsyncStatusRequest.Builder()).build());
	}

	// ----- Endpoint: sql.query

	/**
	 * Executes a SQL request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryResponse> query(QueryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryRequest, QueryResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryRequest, QueryResponse, ErrorResponse>) QueryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Executes a SQL request
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<QueryResponse> query(
			Function<QueryRequest.Builder, ObjectBuilder<QueryRequest>> fn) {
		return query(fn.apply(new QueryRequest.Builder()).build());
	}

	/**
	 * Executes a SQL request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryResponse> query() {
		return this.transport.performRequestAsync(new QueryRequest.Builder().build(), QueryRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: sql.translate

	/**
	 * Translates SQL into Elasticsearch queries
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-translate-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TranslateResponse> translate(TranslateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TranslateRequest, TranslateResponse, ErrorResponse> endpoint = (JsonEndpoint<TranslateRequest, TranslateResponse, ErrorResponse>) TranslateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Translates SQL into Elasticsearch queries
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TranslateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-translate-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TranslateResponse> translate(
			Function<TranslateRequest.Builder, ObjectBuilder<TranslateRequest>> fn) {
		return translate(fn.apply(new TranslateRequest.Builder()).build());
	}

}
