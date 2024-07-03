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

package co.elastic.clients.elasticsearch.query_rules;

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
 * Client for the query_rules namespace.
 */
public class ElasticsearchQueryRulesClient extends ApiClient<ElasticsearchTransport, ElasticsearchQueryRulesClient> {

	public ElasticsearchQueryRulesClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchQueryRulesClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchQueryRulesClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchQueryRulesClient(this.transport, transportOptions);
	}

	// ----- Endpoint: query_rules.delete_rule

	/**
	 * Deletes a query rule within a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRuleRequest, DeleteRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRuleRequest, DeleteRuleResponse, ErrorResponse>) DeleteRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a query rule within a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteRuleResponse deleteRule(Function<DeleteRuleRequest.Builder, ObjectBuilder<DeleteRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRule(fn.apply(new DeleteRuleRequest.Builder()).build());
	}

	// ----- Endpoint: query_rules.delete_ruleset

	/**
	 * Deletes a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteRulesetResponse deleteRuleset(DeleteRulesetRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRulesetRequest, DeleteRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRulesetRequest, DeleteRulesetResponse, ErrorResponse>) DeleteRulesetRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRulesetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteRulesetResponse deleteRuleset(
			Function<DeleteRulesetRequest.Builder, ObjectBuilder<DeleteRulesetRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRuleset(fn.apply(new DeleteRulesetRequest.Builder()).build());
	}

	// ----- Endpoint: query_rules.get_rule

	/**
	 * Returns the details about a query rule within a query ruleset
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRuleResponse getRule(GetRuleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRuleRequest, GetRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRuleRequest, GetRuleResponse, ErrorResponse>) GetRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the details about a query rule within a query ruleset
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRuleResponse getRule(Function<GetRuleRequest.Builder, ObjectBuilder<GetRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRule(fn.apply(new GetRuleRequest.Builder()).build());
	}

	// ----- Endpoint: query_rules.get_ruleset

	/**
	 * Returns the details about a query ruleset
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRulesetResponse getRuleset(GetRulesetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRulesetRequest, GetRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRulesetRequest, GetRulesetResponse, ErrorResponse>) GetRulesetRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the details about a query ruleset
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRulesetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRulesetResponse getRuleset(Function<GetRulesetRequest.Builder, ObjectBuilder<GetRulesetRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRuleset(fn.apply(new GetRulesetRequest.Builder()).build());
	}

	// ----- Endpoint: query_rules.list_rulesets

	/**
	 * Returns summarized information about existing query rulesets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-query-rulesets.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListRulesetsResponse listRulesets(ListRulesetsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRulesetsRequest, ListRulesetsResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRulesetsRequest, ListRulesetsResponse, ErrorResponse>) ListRulesetsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns summarized information about existing query rulesets.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRulesetsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-query-rulesets.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ListRulesetsResponse listRulesets(
			Function<ListRulesetsRequest.Builder, ObjectBuilder<ListRulesetsRequest>> fn)
			throws IOException, ElasticsearchException {
		return listRulesets(fn.apply(new ListRulesetsRequest.Builder()).build());
	}

	/**
	 * Returns summarized information about existing query rulesets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-query-rulesets.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListRulesetsResponse listRulesets() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ListRulesetsRequest.Builder().build(), ListRulesetsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: query_rules.put_rule

	/**
	 * Creates or updates a query rule within a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutRuleResponse putRule(PutRuleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRuleRequest, PutRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRuleRequest, PutRuleResponse, ErrorResponse>) PutRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a query rule within a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutRuleResponse putRule(Function<PutRuleRequest.Builder, ObjectBuilder<PutRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return putRule(fn.apply(new PutRuleRequest.Builder()).build());
	}

	// ----- Endpoint: query_rules.put_ruleset

	/**
	 * Creates or updates a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutRulesetResponse putRuleset(PutRulesetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRulesetRequest, PutRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRulesetRequest, PutRulesetResponse, ErrorResponse>) PutRulesetRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a query ruleset.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRulesetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-ruleset.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutRulesetResponse putRuleset(Function<PutRulesetRequest.Builder, ObjectBuilder<PutRulesetRequest>> fn)
			throws IOException, ElasticsearchException {
		return putRuleset(fn.apply(new PutRulesetRequest.Builder()).build());
	}

}
