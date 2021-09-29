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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the eql namespace.
 */
public class ElasticsearchEqlClient extends ApiClient {

	public ElasticsearchEqlClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: eql.delete

	/**
	 * Deletes an async EQL search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteResponse delete(DeleteRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteRequest.ENDPOINT);
	}

	/**
	 * Deletes an async EQL search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteResponse delete(Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn)
			throws IOException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: eql.get

	/**
	 * Returns async results from previously executed Event Query Language (EQL)
	 * search
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> GetResponse<TEvent> get(GetRequest request, Class<TEvent> tEventClass) throws IOException {
		return this.transport.performRequest(request, GetRequest.createGetEndpoint(getDeserializer(tEventClass)));
	}

	/**
	 * Returns async results from previously executed Event Query Language (EQL)
	 * search
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> GetResponse<TEvent> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn,
			Class<TEvent> tEventClass) throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build(), tEventClass);
	}

	// ----- Endpoint: eql.get_status

	/**
	 * Returns the status of a previously submitted async or stored Event Query
	 * Language (EQL) search
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetStatusResponse getStatus(GetStatusRequest request) throws IOException {
		return this.transport.performRequest(request, GetStatusRequest.ENDPOINT);
	}

	/**
	 * Returns the status of a previously submitted async or stored Event Query
	 * Language (EQL) search
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetStatusResponse getStatus(Function<GetStatusRequest.Builder, ObjectBuilder<GetStatusRequest>> fn)
			throws IOException {
		return getStatus(fn.apply(new GetStatusRequest.Builder()).build());
	}

	// ----- Endpoint: eql.search

	/**
	 * Returns results matching a query expressed in Event Query Language (EQL)
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TEvent> SearchResponse<TEvent> search(SearchRequest request, Class<TEvent> tEventClass) throws IOException {
		return this.transport.performRequest(request, SearchRequest.createSearchEndpoint(getDeserializer(tEventClass)));
	}

	/**
	 * Returns results matching a query expressed in Event Query Language (EQL)
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> SearchResponse<TEvent> search(
			Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Class<TEvent> tEventClass)
			throws IOException {
		return search(fn.apply(new SearchRequest.Builder()).build(), tEventClass);
	}

}
