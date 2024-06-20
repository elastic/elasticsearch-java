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

package co.elastic.clients.elasticsearch.ilm;

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
 * Client for the ilm namespace.
 */
public class ElasticsearchIlmClient extends ApiClient<ElasticsearchTransport, ElasticsearchIlmClient> {

	public ElasticsearchIlmClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchIlmClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchIlmClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchIlmClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ilm.delete_lifecycle

	/**
	 * Deletes the specified lifecycle policy definition. You cannot delete policies
	 * that are currently in use. If the policy is being used to manage any indices,
	 * the request fails and returns an error.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-delete-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteLifecycleResponse deleteLifecycle(DeleteLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse>) DeleteLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes the specified lifecycle policy definition. You cannot delete policies
	 * that are currently in use. If the policy is being used to manage any indices,
	 * the request fails and returns an error.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-delete-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteLifecycleResponse deleteLifecycle(
			Function<DeleteLifecycleRequest.Builder, ObjectBuilder<DeleteLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteLifecycle(fn.apply(new DeleteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.explain_lifecycle

	/**
	 * Retrieves information about the index’s current lifecycle state, such as the
	 * currently executing phase, action, and step. Shows when the index entered
	 * each one, the definition of the running phase, and information about any
	 * failures.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-explain-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExplainLifecycleResponse explainLifecycle(ExplainLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainLifecycleRequest, ExplainLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<ExplainLifecycleRequest, ExplainLifecycleResponse, ErrorResponse>) ExplainLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves information about the index’s current lifecycle state, such as the
	 * currently executing phase, action, and step. Shows when the index entered
	 * each one, the definition of the running phase, and information about any
	 * failures.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-explain-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ExplainLifecycleResponse explainLifecycle(
			Function<ExplainLifecycleRequest.Builder, ObjectBuilder<ExplainLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return explainLifecycle(fn.apply(new ExplainLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.get_lifecycle

	/**
	 * Retrieves a lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-get-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetLifecycleResponse getLifecycle(GetLifecycleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse>) GetLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-get-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetLifecycleResponse getLifecycle(
			Function<GetLifecycleRequest.Builder, ObjectBuilder<GetLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return getLifecycle(fn.apply(new GetLifecycleRequest.Builder()).build());
	}

	/**
	 * Retrieves a lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-get-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetLifecycleResponse getLifecycle() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetLifecycleRequest.Builder().build(), GetLifecycleRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ilm.get_status

	/**
	 * Retrieves the current index lifecycle management (ILM) status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-get-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetIlmStatusResponse getStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetIlmStatusRequest._INSTANCE, GetIlmStatusRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ilm.migrate_to_data_tiers

	/**
	 * Switches the indices, ILM policies, and legacy, composable and component
	 * templates from using custom node attributes and attribute-based allocation
	 * filters to using data tiers, and optionally deletes one legacy index
	 * template.+ Using node roles enables ILM to automatically move the indices
	 * between data tiers.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-migrate-to-data-tiers.html">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateToDataTiersResponse migrateToDataTiers(MigrateToDataTiersRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MigrateToDataTiersRequest, MigrateToDataTiersResponse, ErrorResponse> endpoint = (JsonEndpoint<MigrateToDataTiersRequest, MigrateToDataTiersResponse, ErrorResponse>) MigrateToDataTiersRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Switches the indices, ILM policies, and legacy, composable and component
	 * templates from using custom node attributes and attribute-based allocation
	 * filters to using data tiers, and optionally deletes one legacy index
	 * template.+ Using node roles enables ILM to automatically move the indices
	 * between data tiers.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MigrateToDataTiersRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-migrate-to-data-tiers.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MigrateToDataTiersResponse migrateToDataTiers(
			Function<MigrateToDataTiersRequest.Builder, ObjectBuilder<MigrateToDataTiersRequest>> fn)
			throws IOException, ElasticsearchException {
		return migrateToDataTiers(fn.apply(new MigrateToDataTiersRequest.Builder()).build());
	}

	/**
	 * Switches the indices, ILM policies, and legacy, composable and component
	 * templates from using custom node attributes and attribute-based allocation
	 * filters to using data tiers, and optionally deletes one legacy index
	 * template.+ Using node roles enables ILM to automatically move the indices
	 * between data tiers.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-migrate-to-data-tiers.html">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateToDataTiersResponse migrateToDataTiers() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MigrateToDataTiersRequest.Builder().build(),
				MigrateToDataTiersRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ilm.move_to_step

	/**
	 * Manually moves an index into the specified step and executes that step.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-move-to-step.html">Documentation
	 *      on elastic.co</a>
	 */

	public MoveToStepResponse moveToStep(MoveToStepRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MoveToStepRequest, MoveToStepResponse, ErrorResponse> endpoint = (JsonEndpoint<MoveToStepRequest, MoveToStepResponse, ErrorResponse>) MoveToStepRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Manually moves an index into the specified step and executes that step.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MoveToStepRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-move-to-step.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MoveToStepResponse moveToStep(Function<MoveToStepRequest.Builder, ObjectBuilder<MoveToStepRequest>> fn)
			throws IOException, ElasticsearchException {
		return moveToStep(fn.apply(new MoveToStepRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.put_lifecycle

	/**
	 * Creates a lifecycle policy. If the specified policy exists, the policy is
	 * replaced and the policy version is incremented.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-put-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutLifecycleResponse putLifecycle(PutLifecycleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse>) PutLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a lifecycle policy. If the specified policy exists, the policy is
	 * replaced and the policy version is incremented.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-put-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutLifecycleResponse putLifecycle(
			Function<PutLifecycleRequest.Builder, ObjectBuilder<PutLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return putLifecycle(fn.apply(new PutLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.remove_policy

	/**
	 * Removes the assigned lifecycle policy and stops managing the specified index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-remove-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public RemovePolicyResponse removePolicy(RemovePolicyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RemovePolicyRequest, RemovePolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<RemovePolicyRequest, RemovePolicyResponse, ErrorResponse>) RemovePolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes the assigned lifecycle policy and stops managing the specified index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RemovePolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-remove-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RemovePolicyResponse removePolicy(
			Function<RemovePolicyRequest.Builder, ObjectBuilder<RemovePolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return removePolicy(fn.apply(new RemovePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.retry

	/**
	 * Retries executing the policy for an index that is in the ERROR step.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-retry-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public RetryResponse retry(RetryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RetryRequest, RetryResponse, ErrorResponse> endpoint = (JsonEndpoint<RetryRequest, RetryResponse, ErrorResponse>) RetryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retries executing the policy for an index that is in the ERROR step.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RetryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-retry-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RetryResponse retry(Function<RetryRequest.Builder, ObjectBuilder<RetryRequest>> fn)
			throws IOException, ElasticsearchException {
		return retry(fn.apply(new RetryRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.start

	/**
	 * Start the index lifecycle management (ILM) plugin.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-start.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartIlmResponse start(StartIlmRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartIlmRequest, StartIlmResponse, ErrorResponse> endpoint = (JsonEndpoint<StartIlmRequest, StartIlmResponse, ErrorResponse>) StartIlmRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Start the index lifecycle management (ILM) plugin.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartIlmRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-start.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StartIlmResponse start(Function<StartIlmRequest.Builder, ObjectBuilder<StartIlmRequest>> fn)
			throws IOException, ElasticsearchException {
		return start(fn.apply(new StartIlmRequest.Builder()).build());
	}

	/**
	 * Start the index lifecycle management (ILM) plugin.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-start.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartIlmResponse start() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new StartIlmRequest.Builder().build(), StartIlmRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ilm.stop

	/**
	 * Halts all lifecycle management operations and stops the index lifecycle
	 * management (ILM) plugin
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-stop.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopIlmResponse stop(StopIlmRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopIlmRequest, StopIlmResponse, ErrorResponse> endpoint = (JsonEndpoint<StopIlmRequest, StopIlmResponse, ErrorResponse>) StopIlmRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Halts all lifecycle management operations and stops the index lifecycle
	 * management (ILM) plugin
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopIlmRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-stop.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StopIlmResponse stop(Function<StopIlmRequest.Builder, ObjectBuilder<StopIlmRequest>> fn)
			throws IOException, ElasticsearchException {
		return stop(fn.apply(new StopIlmRequest.Builder()).build());
	}

	/**
	 * Halts all lifecycle management operations and stops the index lifecycle
	 * management (ILM) plugin
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-stop.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopIlmResponse stop() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new StopIlmRequest.Builder().build(), StopIlmRequest._ENDPOINT,
				this.transportOptions);
	}

}
