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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the eql namespace.
 */
public class ElasticsearchEqlClient extends ApiClient<ElasticsearchEqlClient> {

	public ElasticsearchEqlClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchEqlClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchEqlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchEqlClient(this.transport, transportOptions);
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

	public EqlDeleteResponse delete(EqlDeleteRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, EqlDeleteRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes an async EQL search by ID. If the search is still running, the search
	 * request will be cancelled. Otherwise, the saved search results are deleted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlDeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final EqlDeleteResponse delete(Function<EqlDeleteRequest.Builder, ObjectBuilder<EqlDeleteRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new EqlDeleteRequest.Builder()).build());
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

	public <TEvent> EqlGetResponse<TEvent> get(EqlGetRequest request, Class<TEvent> tEventClass)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, EqlGetRequest.createGetEndpoint(getDeserializer(tEventClass)),
				this.transportOptions);
	}

	/**
	 * Returns async results from previously executed Event Query Language (EQL)
	 * search
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlGetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> EqlGetResponse<TEvent> get(Function<EqlGetRequest.Builder, ObjectBuilder<EqlGetRequest>> fn,
			Class<TEvent> tEventClass) throws IOException, ElasticsearchException {
		return get(fn.apply(new EqlGetRequest.Builder()).build(), tEventClass);
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

	public GetStatusResponse getStatus(GetStatusRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, GetStatusRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns the status of a previously submitted async or stored Event Query
	 * Language (EQL) search
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetStatusResponse getStatus(Function<GetStatusRequest.Builder, ObjectBuilder<GetStatusRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public <TEvent> EqlSearchResponse<TEvent> search(EqlSearchRequest request, Class<TEvent> tEventClass)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request,
				EqlSearchRequest.createSearchEndpoint(getDeserializer(tEventClass)), this.transportOptions);
	}

	/**
	 * Returns results matching a query expressed in Event Query Language (EQL)
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EqlSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/eql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TEvent> EqlSearchResponse<TEvent> search(
			Function<EqlSearchRequest.Builder, ObjectBuilder<EqlSearchRequest>> fn, Class<TEvent> tEventClass)
			throws IOException, ElasticsearchException {
		return search(fn.apply(new EqlSearchRequest.Builder()).build(), tEventClass);
	}

}
