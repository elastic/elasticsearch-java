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
 * Client for the query_rules namespace.
 */
public class ElasticsearchQueryRulesAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchQueryRulesAsyncClient> {

	public ElasticsearchQueryRulesAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchQueryRulesAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchQueryRulesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchQueryRulesAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: query_rules.delete_rule

	/**
	 * Deletes a query rule within a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRuleRequest, DeleteRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRuleRequest, DeleteRuleResponse, ErrorResponse>) DeleteRuleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<DeleteRuleResponse> deleteRule(
			Function<DeleteRuleRequest.Builder, ObjectBuilder<DeleteRuleRequest>> fn) {
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

	public CompletableFuture<DeleteRulesetResponse> deleteRuleset(DeleteRulesetRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRulesetRequest, DeleteRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRulesetRequest, DeleteRulesetResponse, ErrorResponse>) DeleteRulesetRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<DeleteRulesetResponse> deleteRuleset(
			Function<DeleteRulesetRequest.Builder, ObjectBuilder<DeleteRulesetRequest>> fn) {
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

	public CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRuleRequest, GetRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRuleRequest, GetRuleResponse, ErrorResponse>) GetRuleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetRuleResponse> getRule(
			Function<GetRuleRequest.Builder, ObjectBuilder<GetRuleRequest>> fn) {
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

	public CompletableFuture<GetRulesetResponse> getRuleset(GetRulesetRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRulesetRequest, GetRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRulesetRequest, GetRulesetResponse, ErrorResponse>) GetRulesetRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetRulesetResponse> getRuleset(
			Function<GetRulesetRequest.Builder, ObjectBuilder<GetRulesetRequest>> fn) {
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

	public CompletableFuture<ListRulesetsResponse> listRulesets(ListRulesetsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRulesetsRequest, ListRulesetsResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRulesetsRequest, ListRulesetsResponse, ErrorResponse>) ListRulesetsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<ListRulesetsResponse> listRulesets(
			Function<ListRulesetsRequest.Builder, ObjectBuilder<ListRulesetsRequest>> fn) {
		return listRulesets(fn.apply(new ListRulesetsRequest.Builder()).build());
	}

	/**
	 * Returns summarized information about existing query rulesets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-query-rulesets.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListRulesetsResponse> listRulesets() {
		return this.transport.performRequestAsync(new ListRulesetsRequest.Builder().build(),
				ListRulesetsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: query_rules.put_rule

	/**
	 * Creates or updates a query rule within a query ruleset.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-query-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutRuleResponse> putRule(PutRuleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRuleRequest, PutRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRuleRequest, PutRuleResponse, ErrorResponse>) PutRuleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<PutRuleResponse> putRule(
			Function<PutRuleRequest.Builder, ObjectBuilder<PutRuleRequest>> fn) {
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

	public CompletableFuture<PutRulesetResponse> putRuleset(PutRulesetRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRulesetRequest, PutRulesetResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRulesetRequest, PutRulesetResponse, ErrorResponse>) PutRulesetRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<PutRulesetResponse> putRuleset(
			Function<PutRulesetRequest.Builder, ObjectBuilder<PutRulesetRequest>> fn) {
		return putRuleset(fn.apply(new PutRulesetRequest.Builder()).build());
	}

}
