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

package co.elastic.clients.elasticsearch.connector;

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
 * Client for the connector namespace.
 */
public class ElasticsearchConnectorClient extends ApiClient<ElasticsearchTransport, ElasticsearchConnectorClient> {

	public ElasticsearchConnectorClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchConnectorClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchConnectorClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchConnectorClient(this.transport, transportOptions);
	}

	// ----- Endpoint: connector.check_in

	/**
	 * Updates the last_seen field in the connector, and sets it to current
	 * timestamp
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/check-in-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CheckInResponse checkIn(CheckInRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CheckInRequest, CheckInResponse, ErrorResponse> endpoint = (JsonEndpoint<CheckInRequest, CheckInResponse, ErrorResponse>) CheckInRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the last_seen field in the connector, and sets it to current
	 * timestamp
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CheckInRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/check-in-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CheckInResponse checkIn(Function<CheckInRequest.Builder, ObjectBuilder<CheckInRequest>> fn)
			throws IOException, ElasticsearchException {
		return checkIn(fn.apply(new CheckInRequest.Builder()).build());
	}

	// ----- Endpoint: connector.delete

	/**
	 * Deletes a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteConnectorResponse delete(DeleteConnectorRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteConnectorRequest, DeleteConnectorResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteConnectorRequest, DeleteConnectorResponse, ErrorResponse>) DeleteConnectorRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteConnectorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteConnectorResponse delete(
			Function<DeleteConnectorRequest.Builder, ObjectBuilder<DeleteConnectorRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteConnectorRequest.Builder()).build());
	}

	// ----- Endpoint: connector.get

	/**
	 * Retrieves a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetConnectorResponse get(GetConnectorRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetConnectorRequest, GetConnectorResponse, ErrorResponse> endpoint = (JsonEndpoint<GetConnectorRequest, GetConnectorResponse, ErrorResponse>) GetConnectorRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetConnectorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetConnectorResponse get(Function<GetConnectorRequest.Builder, ObjectBuilder<GetConnectorRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetConnectorRequest.Builder()).build());
	}

	// ----- Endpoint: connector.list

	/**
	 * Returns existing connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list(ListRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns existing connectors.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ListResponse list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn)
			throws IOException, ElasticsearchException {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Returns existing connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: connector.post

	/**
	 * Creates a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostResponse post(PostRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostRequest, PostResponse, ErrorResponse> endpoint = (JsonEndpoint<PostRequest, PostResponse, ErrorResponse>) PostRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PostResponse post(Function<PostRequest.Builder, ObjectBuilder<PostRequest>> fn)
			throws IOException, ElasticsearchException {
		return post(fn.apply(new PostRequest.Builder()).build());
	}

	/**
	 * Creates a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostResponse post() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PostRequest.Builder().build(), PostRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: connector.put

	/**
	 * Creates or updates a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutResponse put(PutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutResponse put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn)
			throws IOException, ElasticsearchException {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	/**
	 * Creates or updates a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutResponse put() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PutRequest.Builder().build(), PutRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: connector.sync_job_cancel

	/**
	 * Cancels a connector sync job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cancel-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SyncJobCancelResponse syncJobCancel(SyncJobCancelRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobCancelRequest, SyncJobCancelResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobCancelRequest, SyncJobCancelResponse, ErrorResponse>) SyncJobCancelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Cancels a connector sync job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobCancelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cancel-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SyncJobCancelResponse syncJobCancel(
			Function<SyncJobCancelRequest.Builder, ObjectBuilder<SyncJobCancelRequest>> fn)
			throws IOException, ElasticsearchException {
		return syncJobCancel(fn.apply(new SyncJobCancelRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_delete

	/**
	 * Deletes a connector sync job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SyncJobDeleteResponse syncJobDelete(SyncJobDeleteRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobDeleteRequest, SyncJobDeleteResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobDeleteRequest, SyncJobDeleteResponse, ErrorResponse>) SyncJobDeleteRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a connector sync job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobDeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SyncJobDeleteResponse syncJobDelete(
			Function<SyncJobDeleteRequest.Builder, ObjectBuilder<SyncJobDeleteRequest>> fn)
			throws IOException, ElasticsearchException {
		return syncJobDelete(fn.apply(new SyncJobDeleteRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_get

	/**
	 * Retrieves a connector sync job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SyncJobGetResponse syncJobGet(SyncJobGetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobGetRequest, SyncJobGetResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobGetRequest, SyncJobGetResponse, ErrorResponse>) SyncJobGetRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves a connector sync job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobGetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SyncJobGetResponse syncJobGet(Function<SyncJobGetRequest.Builder, ObjectBuilder<SyncJobGetRequest>> fn)
			throws IOException, ElasticsearchException {
		return syncJobGet(fn.apply(new SyncJobGetRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_list

	/**
	 * Lists connector sync jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-sync-jobs-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SyncJobListResponse syncJobList(SyncJobListRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobListRequest, SyncJobListResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobListRequest, SyncJobListResponse, ErrorResponse>) SyncJobListRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Lists connector sync jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-sync-jobs-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SyncJobListResponse syncJobList(
			Function<SyncJobListRequest.Builder, ObjectBuilder<SyncJobListRequest>> fn)
			throws IOException, ElasticsearchException {
		return syncJobList(fn.apply(new SyncJobListRequest.Builder()).build());
	}

	/**
	 * Lists connector sync jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-sync-jobs-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SyncJobListResponse syncJobList() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SyncJobListRequest.Builder().build(), SyncJobListRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: connector.sync_job_post

	/**
	 * Creates a connector sync job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SyncJobPostResponse syncJobPost(SyncJobPostRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobPostRequest, SyncJobPostResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobPostRequest, SyncJobPostResponse, ErrorResponse>) SyncJobPostRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a connector sync job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobPostRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SyncJobPostResponse syncJobPost(
			Function<SyncJobPostRequest.Builder, ObjectBuilder<SyncJobPostRequest>> fn)
			throws IOException, ElasticsearchException {
		return syncJobPost(fn.apply(new SyncJobPostRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_active_filtering

	/**
	 * Activates the valid draft filtering for a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateActiveFilteringResponse updateActiveFiltering(UpdateActiveFilteringRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateActiveFilteringRequest, UpdateActiveFilteringResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateActiveFilteringRequest, UpdateActiveFilteringResponse, ErrorResponse>) UpdateActiveFilteringRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Activates the valid draft filtering for a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateActiveFilteringRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateActiveFilteringResponse updateActiveFiltering(
			Function<UpdateActiveFilteringRequest.Builder, ObjectBuilder<UpdateActiveFilteringRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateActiveFiltering(fn.apply(new UpdateActiveFilteringRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_api_key_id

	/**
	 * Updates the API key id in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-api-key-id-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateApiKeyIdResponse updateApiKeyId(UpdateApiKeyIdRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateApiKeyIdRequest, UpdateApiKeyIdResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateApiKeyIdRequest, UpdateApiKeyIdResponse, ErrorResponse>) UpdateApiKeyIdRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the API key id in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateApiKeyIdRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-api-key-id-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateApiKeyIdResponse updateApiKeyId(
			Function<UpdateApiKeyIdRequest.Builder, ObjectBuilder<UpdateApiKeyIdRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateApiKeyId(fn.apply(new UpdateApiKeyIdRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_configuration

	/**
	 * Updates the configuration field in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-configuration-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateConfigurationRequest, UpdateConfigurationResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateConfigurationRequest, UpdateConfigurationResponse, ErrorResponse>) UpdateConfigurationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the configuration field in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateConfigurationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-configuration-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateConfigurationResponse updateConfiguration(
			Function<UpdateConfigurationRequest.Builder, ObjectBuilder<UpdateConfigurationRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateConfiguration(fn.apply(new UpdateConfigurationRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_error

	/**
	 * Updates the filtering field in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-error-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateErrorResponse updateError(UpdateErrorRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateErrorRequest, UpdateErrorResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateErrorRequest, UpdateErrorResponse, ErrorResponse>) UpdateErrorRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the filtering field in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateErrorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-error-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateErrorResponse updateError(
			Function<UpdateErrorRequest.Builder, ObjectBuilder<UpdateErrorRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateError(fn.apply(new UpdateErrorRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_filtering

	/**
	 * Updates the filtering field in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateFilteringResponse updateFiltering(UpdateFilteringRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateFilteringRequest, UpdateFilteringResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateFilteringRequest, UpdateFilteringResponse, ErrorResponse>) UpdateFilteringRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the filtering field in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateFilteringRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateFilteringResponse updateFiltering(
			Function<UpdateFilteringRequest.Builder, ObjectBuilder<UpdateFilteringRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateFiltering(fn.apply(new UpdateFilteringRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_filtering_validation

	/**
	 * Updates the draft filtering validation info for a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-validation-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateFilteringValidationResponse updateFilteringValidation(UpdateFilteringValidationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateFilteringValidationRequest, UpdateFilteringValidationResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateFilteringValidationRequest, UpdateFilteringValidationResponse, ErrorResponse>) UpdateFilteringValidationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the draft filtering validation info for a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateFilteringValidationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-validation-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateFilteringValidationResponse updateFilteringValidation(
			Function<UpdateFilteringValidationRequest.Builder, ObjectBuilder<UpdateFilteringValidationRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateFilteringValidation(fn.apply(new UpdateFilteringValidationRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_index_name

	/**
	 * Updates the index_name in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-index-name-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateIndexNameResponse updateIndexName(UpdateIndexNameRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateIndexNameRequest, UpdateIndexNameResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateIndexNameRequest, UpdateIndexNameResponse, ErrorResponse>) UpdateIndexNameRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the index_name in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateIndexNameRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-index-name-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateIndexNameResponse updateIndexName(
			Function<UpdateIndexNameRequest.Builder, ObjectBuilder<UpdateIndexNameRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateIndexName(fn.apply(new UpdateIndexNameRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_name

	/**
	 * Updates the name and description fields in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-name-description-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateNameResponse updateName(UpdateNameRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateNameRequest, UpdateNameResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateNameRequest, UpdateNameResponse, ErrorResponse>) UpdateNameRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the name and description fields in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateNameRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-name-description-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateNameResponse updateName(Function<UpdateNameRequest.Builder, ObjectBuilder<UpdateNameRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateName(fn.apply(new UpdateNameRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_native

	/**
	 * Updates the is_native flag in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-native-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateNativeResponse updateNative(UpdateNativeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateNativeRequest, UpdateNativeResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateNativeRequest, UpdateNativeResponse, ErrorResponse>) UpdateNativeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the is_native flag in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateNativeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-native-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateNativeResponse updateNative(
			Function<UpdateNativeRequest.Builder, ObjectBuilder<UpdateNativeRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateNative(fn.apply(new UpdateNativeRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_pipeline

	/**
	 * Updates the pipeline field in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdatePipelineRequest, UpdatePipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdatePipelineRequest, UpdatePipelineResponse, ErrorResponse>) UpdatePipelineRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the pipeline field in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdatePipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdatePipelineResponse updatePipeline(
			Function<UpdatePipelineRequest.Builder, ObjectBuilder<UpdatePipelineRequest>> fn)
			throws IOException, ElasticsearchException {
		return updatePipeline(fn.apply(new UpdatePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_scheduling

	/**
	 * Updates the scheduling field in the connector document
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-scheduling-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateSchedulingResponse updateScheduling(UpdateSchedulingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateSchedulingRequest, UpdateSchedulingResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateSchedulingRequest, UpdateSchedulingResponse, ErrorResponse>) UpdateSchedulingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the scheduling field in the connector document
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateSchedulingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-scheduling-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateSchedulingResponse updateScheduling(
			Function<UpdateSchedulingRequest.Builder, ObjectBuilder<UpdateSchedulingRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateScheduling(fn.apply(new UpdateSchedulingRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_service_type

	/**
	 * Updates the service type of the connector
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-service-type-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateServiceTypeResponse updateServiceType(UpdateServiceTypeRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateServiceTypeRequest, UpdateServiceTypeResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateServiceTypeRequest, UpdateServiceTypeResponse, ErrorResponse>) UpdateServiceTypeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the service type of the connector
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateServiceTypeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-service-type-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateServiceTypeResponse updateServiceType(
			Function<UpdateServiceTypeRequest.Builder, ObjectBuilder<UpdateServiceTypeRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateServiceType(fn.apply(new UpdateServiceTypeRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_status

	/**
	 * Updates the status of the connector
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateStatusResponse updateStatus(UpdateStatusRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateStatusRequest, UpdateStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateStatusRequest, UpdateStatusResponse, ErrorResponse>) UpdateStatusRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the status of the connector
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateStatusResponse updateStatus(
			Function<UpdateStatusRequest.Builder, ObjectBuilder<UpdateStatusRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateStatus(fn.apply(new UpdateStatusRequest.Builder()).build());
	}

}
