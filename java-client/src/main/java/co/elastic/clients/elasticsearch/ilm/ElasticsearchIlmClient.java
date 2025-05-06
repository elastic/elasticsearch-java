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
	 * Delete a lifecycle policy. You cannot delete policies that are currently in
	 * use. If the policy is being used to manage any indices, the request fails and
	 * returns an error.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-delete-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteLifecycleResponse deleteLifecycle(DeleteLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteLifecycleRequest, DeleteLifecycleResponse, ErrorResponse>) DeleteLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a lifecycle policy. You cannot delete policies that are currently in
	 * use. If the policy is being used to manage any indices, the request fails and
	 * returns an error.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-delete-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteLifecycleResponse deleteLifecycle(
			Function<DeleteLifecycleRequest.Builder, ObjectBuilder<DeleteLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteLifecycle(fn.apply(new DeleteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.explain_lifecycle

	/**
	 * Explain the lifecycle state. Get the current lifecycle status for one or more
	 * indices. For data streams, the API retrieves the current lifecycle status for
	 * the stream's backing indices.
	 * <p>
	 * The response indicates when the index entered each lifecycle state, provides
	 * the definition of the running phase, and information about any failures.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-explain-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public ExplainLifecycleResponse explainLifecycle(ExplainLifecycleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExplainLifecycleRequest, ExplainLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<ExplainLifecycleRequest, ExplainLifecycleResponse, ErrorResponse>) ExplainLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Explain the lifecycle state. Get the current lifecycle status for one or more
	 * indices. For data streams, the API retrieves the current lifecycle status for
	 * the stream's backing indices.
	 * <p>
	 * The response indicates when the index entered each lifecycle state, provides
	 * the definition of the running phase, and information about any failures.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExplainLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-explain-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final ExplainLifecycleResponse explainLifecycle(
			Function<ExplainLifecycleRequest.Builder, ObjectBuilder<ExplainLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return explainLifecycle(fn.apply(new ExplainLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.get_lifecycle

	/**
	 * Get lifecycle policies.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-get-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public GetLifecycleResponse getLifecycle(GetLifecycleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse>) GetLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get lifecycle policies.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-get-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final GetLifecycleResponse getLifecycle(
			Function<GetLifecycleRequest.Builder, ObjectBuilder<GetLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return getLifecycle(fn.apply(new GetLifecycleRequest.Builder()).build());
	}

	/**
	 * Get lifecycle policies.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-get-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public GetLifecycleResponse getLifecycle() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetLifecycleRequest.Builder().build(), GetLifecycleRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ilm.get_status

	/**
	 * Get the ILM status.
	 * <p>
	 * Get the current index lifecycle management status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-get-status">Documentation
	 *      on elastic.co</a>
	 */
	public GetIlmStatusResponse getStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetIlmStatusRequest._INSTANCE, GetIlmStatusRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ilm.migrate_to_data_tiers

	/**
	 * Migrate to data tiers routing. Switch the indices, ILM policies, and legacy,
	 * composable, and component templates from using custom node attributes and
	 * attribute-based allocation filters to using data tiers. Optionally, delete
	 * one legacy index template. Using node roles enables ILM to automatically move
	 * the indices between data tiers.
	 * <p>
	 * Migrating away from custom node attributes routing can be manually performed.
	 * This API provides an automated way of performing three out of the four manual
	 * steps listed in the migration guide:
	 * <ol>
	 * <li>Stop setting the custom hot attribute on new indices.</li>
	 * <li>Remove custom allocation settings from existing ILM policies.</li>
	 * <li>Replace custom allocation settings from existing indices with the
	 * corresponding tier preference.</li>
	 * </ol>
	 * <p>
	 * ILM must be stopped before performing the migration. Use the stop ILM and get
	 * ILM status APIs to wait until the reported operation mode is
	 * <code>STOPPED</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-migrate-to-data-tiers">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateToDataTiersResponse migrateToDataTiers(MigrateToDataTiersRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MigrateToDataTiersRequest, MigrateToDataTiersResponse, ErrorResponse> endpoint = (JsonEndpoint<MigrateToDataTiersRequest, MigrateToDataTiersResponse, ErrorResponse>) MigrateToDataTiersRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Migrate to data tiers routing. Switch the indices, ILM policies, and legacy,
	 * composable, and component templates from using custom node attributes and
	 * attribute-based allocation filters to using data tiers. Optionally, delete
	 * one legacy index template. Using node roles enables ILM to automatically move
	 * the indices between data tiers.
	 * <p>
	 * Migrating away from custom node attributes routing can be manually performed.
	 * This API provides an automated way of performing three out of the four manual
	 * steps listed in the migration guide:
	 * <ol>
	 * <li>Stop setting the custom hot attribute on new indices.</li>
	 * <li>Remove custom allocation settings from existing ILM policies.</li>
	 * <li>Replace custom allocation settings from existing indices with the
	 * corresponding tier preference.</li>
	 * </ol>
	 * <p>
	 * ILM must be stopped before performing the migration. Use the stop ILM and get
	 * ILM status APIs to wait until the reported operation mode is
	 * <code>STOPPED</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MigrateToDataTiersRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-migrate-to-data-tiers">Documentation
	 *      on elastic.co</a>
	 */

	public final MigrateToDataTiersResponse migrateToDataTiers(
			Function<MigrateToDataTiersRequest.Builder, ObjectBuilder<MigrateToDataTiersRequest>> fn)
			throws IOException, ElasticsearchException {
		return migrateToDataTiers(fn.apply(new MigrateToDataTiersRequest.Builder()).build());
	}

	/**
	 * Migrate to data tiers routing. Switch the indices, ILM policies, and legacy,
	 * composable, and component templates from using custom node attributes and
	 * attribute-based allocation filters to using data tiers. Optionally, delete
	 * one legacy index template. Using node roles enables ILM to automatically move
	 * the indices between data tiers.
	 * <p>
	 * Migrating away from custom node attributes routing can be manually performed.
	 * This API provides an automated way of performing three out of the four manual
	 * steps listed in the migration guide:
	 * <ol>
	 * <li>Stop setting the custom hot attribute on new indices.</li>
	 * <li>Remove custom allocation settings from existing ILM policies.</li>
	 * <li>Replace custom allocation settings from existing indices with the
	 * corresponding tier preference.</li>
	 * </ol>
	 * <p>
	 * ILM must be stopped before performing the migration. Use the stop ILM and get
	 * ILM status APIs to wait until the reported operation mode is
	 * <code>STOPPED</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-migrate-to-data-tiers">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateToDataTiersResponse migrateToDataTiers() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MigrateToDataTiersRequest.Builder().build(),
				MigrateToDataTiersRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ilm.move_to_step

	/**
	 * Move to a lifecycle step. Manually move an index into a specific step in the
	 * lifecycle policy and run that step.
	 * <p>
	 * WARNING: This operation can result in the loss of data. Manually moving an
	 * index into a specific step runs that step even if it has already been
	 * performed. This is a potentially destructive action and this should be
	 * considered an expert level API.
	 * <p>
	 * You must specify both the current step and the step to be executed in the
	 * body of the request. The request will fail if the current step does not match
	 * the step currently running for the index This is to prevent the index from
	 * being moved from an unexpected step into the next step.
	 * <p>
	 * When specifying the target (<code>next_step</code>) to which the index will
	 * be moved, either the name or both the action and name fields are optional. If
	 * only the phase is specified, the index will move to the first step of the
	 * first action in the target phase. If the phase and action are specified, the
	 * index will move to the first step of the specified action in the specified
	 * phase. Only actions specified in the ILM policy are considered valid. An
	 * index cannot move to a step that is not part of its policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-move-to-step">Documentation
	 *      on elastic.co</a>
	 */

	public MoveToStepResponse moveToStep(MoveToStepRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MoveToStepRequest, MoveToStepResponse, ErrorResponse> endpoint = (JsonEndpoint<MoveToStepRequest, MoveToStepResponse, ErrorResponse>) MoveToStepRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Move to a lifecycle step. Manually move an index into a specific step in the
	 * lifecycle policy and run that step.
	 * <p>
	 * WARNING: This operation can result in the loss of data. Manually moving an
	 * index into a specific step runs that step even if it has already been
	 * performed. This is a potentially destructive action and this should be
	 * considered an expert level API.
	 * <p>
	 * You must specify both the current step and the step to be executed in the
	 * body of the request. The request will fail if the current step does not match
	 * the step currently running for the index This is to prevent the index from
	 * being moved from an unexpected step into the next step.
	 * <p>
	 * When specifying the target (<code>next_step</code>) to which the index will
	 * be moved, either the name or both the action and name fields are optional. If
	 * only the phase is specified, the index will move to the first step of the
	 * first action in the target phase. If the phase and action are specified, the
	 * index will move to the first step of the specified action in the specified
	 * phase. Only actions specified in the ILM policy are considered valid. An
	 * index cannot move to a step that is not part of its policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MoveToStepRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-move-to-step">Documentation
	 *      on elastic.co</a>
	 */

	public final MoveToStepResponse moveToStep(Function<MoveToStepRequest.Builder, ObjectBuilder<MoveToStepRequest>> fn)
			throws IOException, ElasticsearchException {
		return moveToStep(fn.apply(new MoveToStepRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.put_lifecycle

	/**
	 * Create or update a lifecycle policy. If the specified policy exists, it is
	 * replaced and the policy version is incremented.
	 * <p>
	 * NOTE: Only the latest version of the policy is stored, you cannot revert to
	 * previous versions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-put-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public PutLifecycleResponse putLifecycle(PutLifecycleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutLifecycleRequest, PutLifecycleResponse, ErrorResponse>) PutLifecycleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a lifecycle policy. If the specified policy exists, it is
	 * replaced and the policy version is incremented.
	 * <p>
	 * NOTE: Only the latest version of the policy is stored, you cannot revert to
	 * previous versions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-put-lifecycle">Documentation
	 *      on elastic.co</a>
	 */

	public final PutLifecycleResponse putLifecycle(
			Function<PutLifecycleRequest.Builder, ObjectBuilder<PutLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return putLifecycle(fn.apply(new PutLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.remove_policy

	/**
	 * Remove policies from an index. Remove the assigned lifecycle policies from an
	 * index or a data stream's backing indices. It also stops managing the indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-remove-policy">Documentation
	 *      on elastic.co</a>
	 */

	public RemovePolicyResponse removePolicy(RemovePolicyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RemovePolicyRequest, RemovePolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<RemovePolicyRequest, RemovePolicyResponse, ErrorResponse>) RemovePolicyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Remove policies from an index. Remove the assigned lifecycle policies from an
	 * index or a data stream's backing indices. It also stops managing the indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RemovePolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-remove-policy">Documentation
	 *      on elastic.co</a>
	 */

	public final RemovePolicyResponse removePolicy(
			Function<RemovePolicyRequest.Builder, ObjectBuilder<RemovePolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return removePolicy(fn.apply(new RemovePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.retry

	/**
	 * Retry a policy. Retry running the lifecycle policy for an index that is in
	 * the ERROR step. The API sets the policy back to the step where the error
	 * occurred and runs the step. Use the explain lifecycle state API to determine
	 * whether an index is in the ERROR step.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-retry">Documentation
	 *      on elastic.co</a>
	 */

	public RetryResponse retry(RetryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RetryRequest, RetryResponse, ErrorResponse> endpoint = (JsonEndpoint<RetryRequest, RetryResponse, ErrorResponse>) RetryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retry a policy. Retry running the lifecycle policy for an index that is in
	 * the ERROR step. The API sets the policy back to the step where the error
	 * occurred and runs the step. Use the explain lifecycle state API to determine
	 * whether an index is in the ERROR step.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RetryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-retry">Documentation
	 *      on elastic.co</a>
	 */

	public final RetryResponse retry(Function<RetryRequest.Builder, ObjectBuilder<RetryRequest>> fn)
			throws IOException, ElasticsearchException {
		return retry(fn.apply(new RetryRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.start

	/**
	 * Start the ILM plugin. Start the index lifecycle management plugin if it is
	 * currently stopped. ILM is started automatically when the cluster is formed.
	 * Restarting ILM is necessary only when it has been stopped using the stop ILM
	 * API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-start">Documentation
	 *      on elastic.co</a>
	 */

	public StartIlmResponse start(StartIlmRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartIlmRequest, StartIlmResponse, ErrorResponse> endpoint = (JsonEndpoint<StartIlmRequest, StartIlmResponse, ErrorResponse>) StartIlmRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Start the ILM plugin. Start the index lifecycle management plugin if it is
	 * currently stopped. ILM is started automatically when the cluster is formed.
	 * Restarting ILM is necessary only when it has been stopped using the stop ILM
	 * API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartIlmRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-start">Documentation
	 *      on elastic.co</a>
	 */

	public final StartIlmResponse start(Function<StartIlmRequest.Builder, ObjectBuilder<StartIlmRequest>> fn)
			throws IOException, ElasticsearchException {
		return start(fn.apply(new StartIlmRequest.Builder()).build());
	}

	/**
	 * Start the ILM plugin. Start the index lifecycle management plugin if it is
	 * currently stopped. ILM is started automatically when the cluster is formed.
	 * Restarting ILM is necessary only when it has been stopped using the stop ILM
	 * API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-start">Documentation
	 *      on elastic.co</a>
	 */

	public StartIlmResponse start() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new StartIlmRequest.Builder().build(), StartIlmRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ilm.stop

	/**
	 * Stop the ILM plugin. Halt all lifecycle management operations and stop the
	 * index lifecycle management plugin. This is useful when you are performing
	 * maintenance on the cluster and need to prevent ILM from performing any
	 * actions on your indices.
	 * <p>
	 * The API returns as soon as the stop request has been acknowledged, but the
	 * plugin might continue to run until in-progress operations complete and the
	 * plugin can be safely stopped. Use the get ILM status API to check whether ILM
	 * is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-stop">Documentation
	 *      on elastic.co</a>
	 */

	public StopIlmResponse stop(StopIlmRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopIlmRequest, StopIlmResponse, ErrorResponse> endpoint = (JsonEndpoint<StopIlmRequest, StopIlmResponse, ErrorResponse>) StopIlmRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop the ILM plugin. Halt all lifecycle management operations and stop the
	 * index lifecycle management plugin. This is useful when you are performing
	 * maintenance on the cluster and need to prevent ILM from performing any
	 * actions on your indices.
	 * <p>
	 * The API returns as soon as the stop request has been acknowledged, but the
	 * plugin might continue to run until in-progress operations complete and the
	 * plugin can be safely stopped. Use the get ILM status API to check whether ILM
	 * is running.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopIlmRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-stop">Documentation
	 *      on elastic.co</a>
	 */

	public final StopIlmResponse stop(Function<StopIlmRequest.Builder, ObjectBuilder<StopIlmRequest>> fn)
			throws IOException, ElasticsearchException {
		return stop(fn.apply(new StopIlmRequest.Builder()).build());
	}

	/**
	 * Stop the ILM plugin. Halt all lifecycle management operations and stop the
	 * index lifecycle management plugin. This is useful when you are performing
	 * maintenance on the cluster and need to prevent ILM from performing any
	 * actions on your indices.
	 * <p>
	 * The API returns as soon as the stop request has been acknowledged, but the
	 * plugin might continue to run until in-progress operations complete and the
	 * plugin can be safely stopped. Use the get ILM status API to check whether ILM
	 * is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-ilm-stop">Documentation
	 *      on elastic.co</a>
	 */

	public StopIlmResponse stop() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new StopIlmRequest.Builder().build(), StopIlmRequest._ENDPOINT,
				this.transportOptions);
	}

}
