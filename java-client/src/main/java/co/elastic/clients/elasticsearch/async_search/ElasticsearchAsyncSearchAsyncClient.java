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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the async_search namespace.
 */
public class ElasticsearchAsyncSearchAsyncClient extends ApiClient {

	public ElasticsearchAsyncSearchAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: async_search.delete

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAsyncSearchResponse> delete(DeleteAsyncSearchRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteAsyncSearchRequest.ENDPOINT);
	}

	/**
	 * Deletes an async search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAsyncSearchResponse> delete(
			Function<DeleteAsyncSearchRequest.Builder, ObjectBuilder<DeleteAsyncSearchRequest>> fn) throws IOException {
		return delete(fn.apply(new DeleteAsyncSearchRequest.Builder()).build());
	}

	// ----- Endpoint: async_search.get

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(GetAsyncSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				GetAsyncSearchRequest.createGetEndpoint(getDeserializer(tDocumentClass)));
	}

	/**
	 * Retrieves the results of a previously submitted async search request given
	 * its ID.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetAsyncSearchResponse<TDocument>> get(
			Function<GetAsyncSearchRequest.Builder, ObjectBuilder<GetAsyncSearchRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException {
		return get(fn.apply(new GetAsyncSearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: async_search.status

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<StatusResponse<TDocument>> status(StatusRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				StatusRequest.createStatusEndpoint(getDeserializer(tDocumentClass)));
	}

	/**
	 * Retrieves the status of a previously submitted async search request given its
	 * ID.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<StatusResponse<TDocument>> status(
			Function<StatusRequest.Builder, ObjectBuilder<StatusRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return status(fn.apply(new StatusRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: async_search.submit

	/**
	 * Executes a search request asynchronously.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(SubmitRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				SubmitRequest.createSubmitEndpoint(getDeserializer(tDocumentClass)));
	}

	/**
	 * Executes a search request asynchronously.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/async-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SubmitResponse<TDocument>> submit(
			Function<SubmitRequest.Builder, ObjectBuilder<SubmitRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return submit(fn.apply(new SubmitRequest.Builder()).build(), tDocumentClass);
	}

}
