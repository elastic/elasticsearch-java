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

package co.elastic.clients.elasticsearch.query_rule;

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
 * Client for the query_rule namespace.
 */
public class ElasticsearchQueryRuleClient extends ApiClient<ElasticsearchTransport, ElasticsearchQueryRuleClient> {

	public ElasticsearchQueryRuleClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchQueryRuleClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchQueryRuleClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchQueryRuleClient(this.transport, transportOptions);
	}

	// ----- Endpoint: query_rule.delete

	/**
	 * Deletes a query rule within a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteQueryRuleResponse delete(DeleteQueryRuleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteQueryRuleRequest, DeleteQueryRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteQueryRuleRequest, DeleteQueryRuleResponse, ErrorResponse>) DeleteQueryRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a query rule within a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteQueryRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteQueryRuleResponse delete(
			Function<DeleteQueryRuleRequest.Builder, ObjectBuilder<DeleteQueryRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteQueryRuleRequest.Builder()).build());
	}

	// ----- Endpoint: query_rule.get

	/**
	 * Returns the details about a query rule within a query ruleset
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetQueryRuleResponse get(GetQueryRuleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetQueryRuleRequest, GetQueryRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetQueryRuleRequest, GetQueryRuleResponse, ErrorResponse>) GetQueryRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the details about a query rule within a query ruleset
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetQueryRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetQueryRuleResponse get(Function<GetQueryRuleRequest.Builder, ObjectBuilder<GetQueryRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetQueryRuleRequest.Builder()).build());
	}

	// ----- Endpoint: query_rule.put

	/**
	 * Creates or updates a query rule within a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutResponse put(PutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a query rule within a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutResponse put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn)
			throws IOException, ElasticsearchException {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

}
