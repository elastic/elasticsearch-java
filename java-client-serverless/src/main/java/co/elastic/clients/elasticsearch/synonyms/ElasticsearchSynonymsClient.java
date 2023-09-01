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

package co.elastic.clients.elasticsearch.synonyms;

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
 * Client for the synonyms namespace.
 */
public class ElasticsearchSynonymsClient extends ApiClient<ElasticsearchTransport, ElasticsearchSynonymsClient> {

	public ElasticsearchSynonymsClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSynonymsClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSynonymsClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSynonymsClient(this.transport, transportOptions);
	}

	// ----- Endpoint: synonyms.delete_synonym

	/**
	 * Deletes a synonym set
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-synonyms-set.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteSynonymResponse deleteSynonym(DeleteSynonymRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSynonymRequest, DeleteSynonymResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSynonymRequest, DeleteSynonymResponse, ErrorResponse>) DeleteSynonymRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a synonym set
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSynonymRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-synonyms-set.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteSynonymResponse deleteSynonym(
			Function<DeleteSynonymRequest.Builder, ObjectBuilder<DeleteSynonymRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteSynonym(fn.apply(new DeleteSynonymRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.delete_synonym_rule

	/**
	 * Deletes a synonym rule in a synonym set
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-synonym-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteSynonymRuleResponse deleteSynonymRule(DeleteSynonymRuleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSynonymRuleRequest, DeleteSynonymRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSynonymRuleRequest, DeleteSynonymRuleResponse, ErrorResponse>) DeleteSynonymRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a synonym rule in a synonym set
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSynonymRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-synonym-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteSynonymRuleResponse deleteSynonymRule(
			Function<DeleteSynonymRuleRequest.Builder, ObjectBuilder<DeleteSynonymRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteSynonymRule(fn.apply(new DeleteSynonymRuleRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.get_synonym

	/**
	 * Retrieves a synonym set
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-synonyms-set.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSynonymResponse getSynonym(GetSynonymRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSynonymRequest, GetSynonymResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSynonymRequest, GetSynonymResponse, ErrorResponse>) GetSynonymRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a synonym set
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSynonymRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-synonyms-set.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSynonymResponse getSynonym(Function<GetSynonymRequest.Builder, ObjectBuilder<GetSynonymRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSynonym(fn.apply(new GetSynonymRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.get_synonym_rule

	/**
	 * Retrieves a synonym rule from a synonym set
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-synonym-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSynonymRuleResponse getSynonymRule(GetSynonymRuleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSynonymRuleRequest, GetSynonymRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSynonymRuleRequest, GetSynonymRuleResponse, ErrorResponse>) GetSynonymRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a synonym rule from a synonym set
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSynonymRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-synonym-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSynonymRuleResponse getSynonymRule(
			Function<GetSynonymRuleRequest.Builder, ObjectBuilder<GetSynonymRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSynonymRule(fn.apply(new GetSynonymRuleRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.get_synonyms_sets

	/**
	 * Retrieves a summary of all defined synonym sets
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-synonyms-sets.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSynonymsSetsResponse getSynonymsSets(GetSynonymsSetsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSynonymsSetsRequest, GetSynonymsSetsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSynonymsSetsRequest, GetSynonymsSetsResponse, ErrorResponse>) GetSynonymsSetsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a summary of all defined synonym sets
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSynonymsSetsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-synonyms-sets.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSynonymsSetsResponse getSynonymsSets(
			Function<GetSynonymsSetsRequest.Builder, ObjectBuilder<GetSynonymsSetsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSynonymsSets(fn.apply(new GetSynonymsSetsRequest.Builder()).build());
	}

	/**
	 * Retrieves a summary of all defined synonym sets
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/list-synonyms-sets.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSynonymsSetsResponse getSynonymsSets() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetSynonymsSetsRequest.Builder().build(),
				GetSynonymsSetsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: synonyms.put_synonym

	/**
	 * Creates or updates a synonyms set
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-synonyms-set.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutSynonymResponse putSynonym(PutSynonymRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutSynonymRequest, PutSynonymResponse, ErrorResponse> endpoint = (JsonEndpoint<PutSynonymRequest, PutSynonymResponse, ErrorResponse>) PutSynonymRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a synonyms set
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutSynonymRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-synonyms-set.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutSynonymResponse putSynonym(Function<PutSynonymRequest.Builder, ObjectBuilder<PutSynonymRequest>> fn)
			throws IOException, ElasticsearchException {
		return putSynonym(fn.apply(new PutSynonymRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.put_synonym_rule

	/**
	 * Creates or updates a synonym rule in a synonym set
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-synonym-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutSynonymRuleResponse putSynonymRule(PutSynonymRuleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutSynonymRuleRequest, PutSynonymRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutSynonymRuleRequest, PutSynonymRuleResponse, ErrorResponse>) PutSynonymRuleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a synonym rule in a synonym set
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutSynonymRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-synonym-rule.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutSynonymRuleResponse putSynonymRule(
			Function<PutSynonymRuleRequest.Builder, ObjectBuilder<PutSynonymRuleRequest>> fn)
			throws IOException, ElasticsearchException {
		return putSynonymRule(fn.apply(new PutSynonymRuleRequest.Builder()).build());
	}

}
