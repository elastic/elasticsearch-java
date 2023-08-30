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

package co.elastic.clients.elasticsearch.query_ruleset;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the query_ruleset namespace.
 */
public class ElasticsearchQueryRulesetClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchQueryRulesetClient> {

	public ElasticsearchQueryRulesetClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchQueryRulesetClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchQueryRulesetClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchQueryRulesetClient(this.transport, transportOptions);
	}

	// ----- Endpoint: query_ruleset.delete

	/**
	 * Deletes a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteQueryRulesetResponse delete(DeleteQueryRulesetRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteQueryRulesetRequest, DeleteQueryRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteQueryRulesetRequest, DeleteQueryRulesetResponse, ErrorResponse>) DeleteQueryRulesetRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteQueryRulesetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteQueryRulesetResponse delete(
			Function<DeleteQueryRulesetRequest.Builder, ObjectBuilder<DeleteQueryRulesetRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteQueryRulesetRequest.Builder()).build());
	}

	// ----- Endpoint: query_ruleset.get

	/**
	 * Returns the details about a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetQueryRulesetResponse get(GetQueryRulesetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetQueryRulesetRequest, GetQueryRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<GetQueryRulesetRequest, GetQueryRulesetResponse, ErrorResponse>) GetQueryRulesetRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the details about a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetQueryRulesetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetQueryRulesetResponse get(
			Function<GetQueryRulesetRequest.Builder, ObjectBuilder<GetQueryRulesetRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetQueryRulesetRequest.Builder()).build());
	}

	// ----- Endpoint: query_ruleset.list

	/**
	 * Lists query rulesets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-query-rulesets.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list(ListRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Lists query rulesets.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-query-rulesets.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ListResponse list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn)
			throws IOException, ElasticsearchException {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Lists query rulesets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-query-rulesets.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: query_ruleset.put

	/**
	 * Creates or updates a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutResponse put(PutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutResponse put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn)
			throws IOException, ElasticsearchException {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

}
