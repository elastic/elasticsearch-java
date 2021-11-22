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

package co.elastic.clients.elasticsearch.sql;

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
 * Client for the sql namespace.
 */
public class ElasticsearchSqlClient extends ApiClient<ElasticsearchTransport, ElasticsearchSqlClient> {

	public ElasticsearchSqlClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSqlClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSqlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSqlClient(this.transport, transportOptions);
	}

	// ----- Endpoint: sql.clear_cursor

	/**
	 * Clears the SQL cursor
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-sql-cursor-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCursorResponse clearCursor(ClearCursorRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ClearCursorRequest, ClearCursorResponse, ErrorResponse> endpoint = (Endpoint<ClearCursorRequest, ClearCursorResponse, ErrorResponse>) ClearCursorRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ClearCursorResponse clearCursor(Consumer<ClearCursorRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ClearCursorRequest.Builder builder = new ClearCursorRequest.Builder();
		fn.accept(builder);
		return clearCursor(builder.build());
	}

	// ----- Endpoint: sql.query

	/**
	 * Executes a SQL request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryResponse query(QueryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<QueryRequest, QueryResponse, ErrorResponse> endpoint = (Endpoint<QueryRequest, QueryResponse, ErrorResponse>) QueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final QueryResponse query(Consumer<QueryRequest.Builder> fn) throws IOException, ElasticsearchException {
		QueryRequest.Builder builder = new QueryRequest.Builder();
		fn.accept(builder);
		return query(builder.build());
	}

	/**
	 * Executes a SQL request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryResponse query() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryRequest.Builder().build(), QueryRequest._ENDPOINT,
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

	public TranslateResponse translate(TranslateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<TranslateRequest, TranslateResponse, ErrorResponse> endpoint = (Endpoint<TranslateRequest, TranslateResponse, ErrorResponse>) TranslateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final TranslateResponse translate(Consumer<TranslateRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		TranslateRequest.Builder builder = new TranslateRequest.Builder();
		fn.accept(builder);
		return translate(builder.build());
	}

}
