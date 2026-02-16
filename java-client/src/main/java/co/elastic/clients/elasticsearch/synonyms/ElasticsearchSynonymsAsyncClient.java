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

package co.elastic.clients.elasticsearch.synonyms;

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
 * Client for the synonyms namespace.
 */
public class ElasticsearchSynonymsAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSynonymsAsyncClient> {

	public ElasticsearchSynonymsAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSynonymsAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSynonymsAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSynonymsAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: synonyms.delete_synonym

	/**
	 * Delete a synonym set.
	 * <p>
	 * You can only delete a synonyms set that is not in use by any index analyzer.
	 * <p>
	 * Synonyms sets can be used in synonym graph token filters and synonym token
	 * filters. These synonym filters can be used as part of search analyzers.
	 * <p>
	 * Analyzers need to be loaded when an index is restored (such as when a node
	 * starts, or the index becomes open). Even if the analyzer is not used on any
	 * field mapping, it still needs to be loaded on the index recovery phase.
	 * <p>
	 * If any analyzers cannot be loaded, the index becomes unavailable and the
	 * cluster status becomes red or yellow as index shards are not available. To
	 * prevent that, synonyms sets that are used in analyzers can't be deleted. A
	 * delete request in this case will return a 400 response code.
	 * <p>
	 * To remove a synonyms set, you must first remove all indices that contain
	 * analyzers using it. You can migrate an index by creating a new index that
	 * does not contain the token filter with the synonyms set, and use the reindex
	 * API in order to copy over the index data. Once finished, you can delete the
	 * index. When the synonyms set is not used in analyzers, you will be able to
	 * delete it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-delete-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteSynonymResponse> deleteSynonym(DeleteSynonymRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSynonymRequest, DeleteSynonymResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSynonymRequest, DeleteSynonymResponse, ErrorResponse>) DeleteSynonymRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a synonym set.
	 * <p>
	 * You can only delete a synonyms set that is not in use by any index analyzer.
	 * <p>
	 * Synonyms sets can be used in synonym graph token filters and synonym token
	 * filters. These synonym filters can be used as part of search analyzers.
	 * <p>
	 * Analyzers need to be loaded when an index is restored (such as when a node
	 * starts, or the index becomes open). Even if the analyzer is not used on any
	 * field mapping, it still needs to be loaded on the index recovery phase.
	 * <p>
	 * If any analyzers cannot be loaded, the index becomes unavailable and the
	 * cluster status becomes red or yellow as index shards are not available. To
	 * prevent that, synonyms sets that are used in analyzers can't be deleted. A
	 * delete request in this case will return a 400 response code.
	 * <p>
	 * To remove a synonyms set, you must first remove all indices that contain
	 * analyzers using it. You can migrate an index by creating a new index that
	 * does not contain the token filter with the synonyms set, and use the reindex
	 * API in order to copy over the index data. Once finished, you can delete the
	 * index. When the synonyms set is not used in analyzers, you will be able to
	 * delete it.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSynonymRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-delete-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteSynonymResponse> deleteSynonym(
			Function<DeleteSynonymRequest.Builder, ObjectBuilder<DeleteSynonymRequest>> fn) {
		return deleteSynonym(fn.apply(new DeleteSynonymRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.delete_synonym_rule

	/**
	 * Delete a synonym rule.
	 * <p>
	 * Delete a synonym rule from a synonym set.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-delete-synonym-rule">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteSynonymRuleResponse> deleteSynonymRule(DeleteSynonymRuleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSynonymRuleRequest, DeleteSynonymRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSynonymRuleRequest, DeleteSynonymRuleResponse, ErrorResponse>) DeleteSynonymRuleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a synonym rule.
	 * <p>
	 * Delete a synonym rule from a synonym set.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSynonymRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-delete-synonym-rule">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteSynonymRuleResponse> deleteSynonymRule(
			Function<DeleteSynonymRuleRequest.Builder, ObjectBuilder<DeleteSynonymRuleRequest>> fn) {
		return deleteSynonymRule(fn.apply(new DeleteSynonymRuleRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.get_synonym

	/**
	 * Get a synonym set.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-get-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSynonymResponse> getSynonym(GetSynonymRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSynonymRequest, GetSynonymResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSynonymRequest, GetSynonymResponse, ErrorResponse>) GetSynonymRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a synonym set.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSynonymRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-get-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSynonymResponse> getSynonym(
			Function<GetSynonymRequest.Builder, ObjectBuilder<GetSynonymRequest>> fn) {
		return getSynonym(fn.apply(new GetSynonymRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.get_synonym_rule

	/**
	 * Get a synonym rule.
	 * <p>
	 * Get a synonym rule from a synonym set.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-get-synonym-rule">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSynonymRuleResponse> getSynonymRule(GetSynonymRuleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSynonymRuleRequest, GetSynonymRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSynonymRuleRequest, GetSynonymRuleResponse, ErrorResponse>) GetSynonymRuleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a synonym rule.
	 * <p>
	 * Get a synonym rule from a synonym set.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSynonymRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-get-synonym-rule">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSynonymRuleResponse> getSynonymRule(
			Function<GetSynonymRuleRequest.Builder, ObjectBuilder<GetSynonymRuleRequest>> fn) {
		return getSynonymRule(fn.apply(new GetSynonymRuleRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.get_synonyms_sets

	/**
	 * Get all synonym sets.
	 * <p>
	 * Get a summary of all defined synonym sets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-get-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSynonymsSetsResponse> getSynonymsSets(GetSynonymsSetsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSynonymsSetsRequest, GetSynonymsSetsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSynonymsSetsRequest, GetSynonymsSetsResponse, ErrorResponse>) GetSynonymsSetsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get all synonym sets.
	 * <p>
	 * Get a summary of all defined synonym sets.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSynonymsSetsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-get-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSynonymsSetsResponse> getSynonymsSets(
			Function<GetSynonymsSetsRequest.Builder, ObjectBuilder<GetSynonymsSetsRequest>> fn) {
		return getSynonymsSets(fn.apply(new GetSynonymsSetsRequest.Builder()).build());
	}

	/**
	 * Get all synonym sets.
	 * <p>
	 * Get a summary of all defined synonym sets.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-get-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSynonymsSetsResponse> getSynonymsSets() {
		return this.transport.performRequestAsync(new GetSynonymsSetsRequest.Builder().build(),
				GetSynonymsSetsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: synonyms.put_synonym

	/**
	 * Create or update a synonym set.
	 * <p>
	 * Synonyms sets are limited to a maximum of 10,000 synonym rules per set. If
	 * you need to manage more synonym rules, you can create multiple synonym sets.
	 * <p>
	 * When an existing synonyms set is updated, the search analyzers that use the
	 * synonyms set are reloaded automatically for all indices. This is equivalent
	 * to invoking the reload search analyzers API for all indices that use the
	 * synonyms set.
	 * <p>
	 * For practical examples of how to create or update a synonyms set, refer to
	 * the External documentation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-put-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutSynonymResponse> putSynonym(PutSynonymRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutSynonymRequest, PutSynonymResponse, ErrorResponse> endpoint = (JsonEndpoint<PutSynonymRequest, PutSynonymResponse, ErrorResponse>) PutSynonymRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a synonym set.
	 * <p>
	 * Synonyms sets are limited to a maximum of 10,000 synonym rules per set. If
	 * you need to manage more synonym rules, you can create multiple synonym sets.
	 * <p>
	 * When an existing synonyms set is updated, the search analyzers that use the
	 * synonyms set are reloaded automatically for all indices. This is equivalent
	 * to invoking the reload search analyzers API for all indices that use the
	 * synonyms set.
	 * <p>
	 * For practical examples of how to create or update a synonyms set, refer to
	 * the External documentation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutSynonymRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-put-synonym">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutSynonymResponse> putSynonym(
			Function<PutSynonymRequest.Builder, ObjectBuilder<PutSynonymRequest>> fn) {
		return putSynonym(fn.apply(new PutSynonymRequest.Builder()).build());
	}

	// ----- Endpoint: synonyms.put_synonym_rule

	/**
	 * Create or update a synonym rule.
	 * <p>
	 * Create or update a synonym rule in a synonym set.
	 * <p>
	 * If any of the synonym rules included is invalid, the API returns an error.
	 * <p>
	 * When you update a synonym rule, all analyzers using the synonyms set will be
	 * reloaded automatically to reflect the new rule.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-put-synonym-rule">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutSynonymRuleResponse> putSynonymRule(PutSynonymRuleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutSynonymRuleRequest, PutSynonymRuleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutSynonymRuleRequest, PutSynonymRuleResponse, ErrorResponse>) PutSynonymRuleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a synonym rule.
	 * <p>
	 * Create or update a synonym rule in a synonym set.
	 * <p>
	 * If any of the synonym rules included is invalid, the API returns an error.
	 * <p>
	 * When you update a synonym rule, all analyzers using the synonyms set will be
	 * reloaded automatically to reflect the new rule.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutSynonymRuleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-synonyms-put-synonym-rule">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutSynonymRuleResponse> putSynonymRule(
			Function<PutSynonymRuleRequest.Builder, ObjectBuilder<PutSynonymRuleRequest>> fn) {
		return putSynonymRule(fn.apply(new PutSynonymRuleRequest.Builder()).build());
	}

}
