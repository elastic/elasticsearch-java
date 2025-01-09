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
 * Client for the connector namespace.
 */
public class ElasticsearchConnectorAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchConnectorAsyncClient> {

	public ElasticsearchConnectorAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchConnectorAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchConnectorAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchConnectorAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: connector.check_in

	/**
	 * Check in a connector.
	 * <p>
	 * Update the <code>last_seen</code> field in the connector and set it to the
	 * current timestamp.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/check-in-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CheckInResponse> checkIn(CheckInRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CheckInRequest, CheckInResponse, ErrorResponse> endpoint = (JsonEndpoint<CheckInRequest, CheckInResponse, ErrorResponse>) CheckInRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check in a connector.
	 * <p>
	 * Update the <code>last_seen</code> field in the connector and set it to the
	 * current timestamp.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CheckInRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/check-in-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CheckInResponse> checkIn(
			Function<CheckInRequest.Builder, ObjectBuilder<CheckInRequest>> fn) {
		return checkIn(fn.apply(new CheckInRequest.Builder()).build());
	}

	// ----- Endpoint: connector.delete

	/**
	 * Delete a connector.
	 * <p>
	 * Removes a connector and associated sync jobs. This is a destructive action
	 * that is not recoverable. NOTE: This action doesn’t delete any API keys,
	 * ingest pipelines, or data indices associated with the connector. These need
	 * to be removed manually.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteConnectorResponse> delete(DeleteConnectorRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteConnectorRequest, DeleteConnectorResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteConnectorRequest, DeleteConnectorResponse, ErrorResponse>) DeleteConnectorRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a connector.
	 * <p>
	 * Removes a connector and associated sync jobs. This is a destructive action
	 * that is not recoverable. NOTE: This action doesn’t delete any API keys,
	 * ingest pipelines, or data indices associated with the connector. These need
	 * to be removed manually.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteConnectorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteConnectorResponse> delete(
			Function<DeleteConnectorRequest.Builder, ObjectBuilder<DeleteConnectorRequest>> fn) {
		return delete(fn.apply(new DeleteConnectorRequest.Builder()).build());
	}

	// ----- Endpoint: connector.get

	/**
	 * Get a connector.
	 * <p>
	 * Get the details about a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetConnectorResponse> get(GetConnectorRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetConnectorRequest, GetConnectorResponse, ErrorResponse> endpoint = (JsonEndpoint<GetConnectorRequest, GetConnectorResponse, ErrorResponse>) GetConnectorRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a connector.
	 * <p>
	 * Get the details about a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetConnectorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetConnectorResponse> get(
			Function<GetConnectorRequest.Builder, ObjectBuilder<GetConnectorRequest>> fn) {
		return get(fn.apply(new GetConnectorRequest.Builder()).build());
	}

	// ----- Endpoint: connector.list

	/**
	 * Get all connectors.
	 * <p>
	 * Get information about all connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list(ListRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get all connectors.
	 * <p>
	 * Get information about all connectors.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ListResponse> list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn) {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Get all connectors.
	 * <p>
	 * Get information about all connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list() {
		return this.transport.performRequestAsync(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: connector.post

	/**
	 * Create a connector.
	 * <p>
	 * Connectors are Elasticsearch integrations that bring content from third-party
	 * data sources, which can be deployed on Elastic Cloud or hosted on your own
	 * infrastructure. Elastic managed connectors (Native connectors) are a managed
	 * service on Elastic Cloud. Self-managed connectors (Connector clients) are
	 * self-managed on your infrastructure.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostResponse> post(PostRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostRequest, PostResponse, ErrorResponse> endpoint = (JsonEndpoint<PostRequest, PostResponse, ErrorResponse>) PostRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a connector.
	 * <p>
	 * Connectors are Elasticsearch integrations that bring content from third-party
	 * data sources, which can be deployed on Elastic Cloud or hosted on your own
	 * infrastructure. Elastic managed connectors (Native connectors) are a managed
	 * service on Elastic Cloud. Self-managed connectors (Connector clients) are
	 * self-managed on your infrastructure.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostResponse> post(Function<PostRequest.Builder, ObjectBuilder<PostRequest>> fn) {
		return post(fn.apply(new PostRequest.Builder()).build());
	}

	/**
	 * Create a connector.
	 * <p>
	 * Connectors are Elasticsearch integrations that bring content from third-party
	 * data sources, which can be deployed on Elastic Cloud or hosted on your own
	 * infrastructure. Elastic managed connectors (Native connectors) are a managed
	 * service on Elastic Cloud. Self-managed connectors (Connector clients) are
	 * self-managed on your infrastructure.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostResponse> post() {
		return this.transport.performRequestAsync(new PostRequest.Builder().build(), PostRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: connector.put

	/**
	 * Create or update a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutResponse> put(PutRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutResponse> put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn) {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	/**
	 * Create or update a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutResponse> put() {
		return this.transport.performRequestAsync(new PutRequest.Builder().build(), PutRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: connector.sync_job_cancel

	/**
	 * Cancel a connector sync job.
	 * <p>
	 * Cancel a connector sync job, which sets the status to cancelling and updates
	 * <code>cancellation_requested_at</code> to the current time. The connector
	 * service is then responsible for setting the status of connector sync jobs to
	 * cancelled.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cancel-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobCancelResponse> syncJobCancel(SyncJobCancelRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobCancelRequest, SyncJobCancelResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobCancelRequest, SyncJobCancelResponse, ErrorResponse>) SyncJobCancelRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Cancel a connector sync job.
	 * <p>
	 * Cancel a connector sync job, which sets the status to cancelling and updates
	 * <code>cancellation_requested_at</code> to the current time. The connector
	 * service is then responsible for setting the status of connector sync jobs to
	 * cancelled.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobCancelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cancel-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobCancelResponse> syncJobCancel(
			Function<SyncJobCancelRequest.Builder, ObjectBuilder<SyncJobCancelRequest>> fn) {
		return syncJobCancel(fn.apply(new SyncJobCancelRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_check_in

	/**
	 * Check in a connector sync job. Check in a connector sync job and set the
	 * <code>last_seen</code> field to the current time before updating it in the
	 * internal index.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/check-in-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobCheckInResponse> syncJobCheckIn(SyncJobCheckInRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobCheckInRequest, SyncJobCheckInResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobCheckInRequest, SyncJobCheckInResponse, ErrorResponse>) SyncJobCheckInRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check in a connector sync job. Check in a connector sync job and set the
	 * <code>last_seen</code> field to the current time before updating it in the
	 * internal index.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobCheckInRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/check-in-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobCheckInResponse> syncJobCheckIn(
			Function<SyncJobCheckInRequest.Builder, ObjectBuilder<SyncJobCheckInRequest>> fn) {
		return syncJobCheckIn(fn.apply(new SyncJobCheckInRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_claim

	/**
	 * Claim a connector sync job. This action updates the job status to
	 * <code>in_progress</code> and sets the <code>last_seen</code> and
	 * <code>started_at</code> timestamps to the current time. Additionally, it can
	 * set the <code>sync_cursor</code> property for the sync job.
	 * <p>
	 * This API is not intended for direct connector management by users. It
	 * supports the implementation of services that utilize the connector protocol
	 * to communicate with Elasticsearch.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/claim-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobClaimResponse> syncJobClaim(SyncJobClaimRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobClaimRequest, SyncJobClaimResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobClaimRequest, SyncJobClaimResponse, ErrorResponse>) SyncJobClaimRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Claim a connector sync job. This action updates the job status to
	 * <code>in_progress</code> and sets the <code>last_seen</code> and
	 * <code>started_at</code> timestamps to the current time. Additionally, it can
	 * set the <code>sync_cursor</code> property for the sync job.
	 * <p>
	 * This API is not intended for direct connector management by users. It
	 * supports the implementation of services that utilize the connector protocol
	 * to communicate with Elasticsearch.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobClaimRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/claim-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobClaimResponse> syncJobClaim(
			Function<SyncJobClaimRequest.Builder, ObjectBuilder<SyncJobClaimRequest>> fn) {
		return syncJobClaim(fn.apply(new SyncJobClaimRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_delete

	/**
	 * Delete a connector sync job.
	 * <p>
	 * Remove a connector sync job and its associated data. This is a destructive
	 * action that is not recoverable.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobDeleteResponse> syncJobDelete(SyncJobDeleteRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobDeleteRequest, SyncJobDeleteResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobDeleteRequest, SyncJobDeleteResponse, ErrorResponse>) SyncJobDeleteRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a connector sync job.
	 * <p>
	 * Remove a connector sync job and its associated data. This is a destructive
	 * action that is not recoverable.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobDeleteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/delete-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobDeleteResponse> syncJobDelete(
			Function<SyncJobDeleteRequest.Builder, ObjectBuilder<SyncJobDeleteRequest>> fn) {
		return syncJobDelete(fn.apply(new SyncJobDeleteRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_error

	/**
	 * Set a connector sync job error. Set the <code>error</code> field for a
	 * connector sync job and set its <code>status</code> to <code>error</code>.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/set-connector-sync-job-error-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobErrorResponse> syncJobError(SyncJobErrorRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobErrorRequest, SyncJobErrorResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobErrorRequest, SyncJobErrorResponse, ErrorResponse>) SyncJobErrorRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Set a connector sync job error. Set the <code>error</code> field for a
	 * connector sync job and set its <code>status</code> to <code>error</code>.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobErrorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/set-connector-sync-job-error-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobErrorResponse> syncJobError(
			Function<SyncJobErrorRequest.Builder, ObjectBuilder<SyncJobErrorRequest>> fn) {
		return syncJobError(fn.apply(new SyncJobErrorRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_get

	/**
	 * Get a connector sync job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobGetResponse> syncJobGet(SyncJobGetRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobGetRequest, SyncJobGetResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobGetRequest, SyncJobGetResponse, ErrorResponse>) SyncJobGetRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a connector sync job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobGetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/get-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobGetResponse> syncJobGet(
			Function<SyncJobGetRequest.Builder, ObjectBuilder<SyncJobGetRequest>> fn) {
		return syncJobGet(fn.apply(new SyncJobGetRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_list

	/**
	 * Get all connector sync jobs.
	 * <p>
	 * Get information about all stored connector sync jobs listed by their creation
	 * date in ascending order.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-sync-jobs-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobListResponse> syncJobList(SyncJobListRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobListRequest, SyncJobListResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobListRequest, SyncJobListResponse, ErrorResponse>) SyncJobListRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get all connector sync jobs.
	 * <p>
	 * Get information about all stored connector sync jobs listed by their creation
	 * date in ascending order.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-sync-jobs-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobListResponse> syncJobList(
			Function<SyncJobListRequest.Builder, ObjectBuilder<SyncJobListRequest>> fn) {
		return syncJobList(fn.apply(new SyncJobListRequest.Builder()).build());
	}

	/**
	 * Get all connector sync jobs.
	 * <p>
	 * Get information about all stored connector sync jobs listed by their creation
	 * date in ascending order.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/list-connector-sync-jobs-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobListResponse> syncJobList() {
		return this.transport.performRequestAsync(new SyncJobListRequest.Builder().build(),
				SyncJobListRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: connector.sync_job_post

	/**
	 * Create a connector sync job.
	 * <p>
	 * Create a connector sync job document in the internal index and initialize its
	 * counters and timestamps with default values.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobPostResponse> syncJobPost(SyncJobPostRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobPostRequest, SyncJobPostResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobPostRequest, SyncJobPostResponse, ErrorResponse>) SyncJobPostRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a connector sync job.
	 * <p>
	 * Create a connector sync job document in the internal index and initialize its
	 * counters and timestamps with default values.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobPostRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/create-connector-sync-job-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobPostResponse> syncJobPost(
			Function<SyncJobPostRequest.Builder, ObjectBuilder<SyncJobPostRequest>> fn) {
		return syncJobPost(fn.apply(new SyncJobPostRequest.Builder()).build());
	}

	// ----- Endpoint: connector.sync_job_update_stats

	/**
	 * Set the connector sync job stats. Stats include:
	 * <code>deleted_document_count</code>, <code>indexed_document_count</code>,
	 * <code>indexed_document_volume</code>, and <code>total_document_count</code>.
	 * You can also update <code>last_seen</code>. This API is mainly used by the
	 * connector service for updating sync job information.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/set-connector-sync-job-stats-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SyncJobUpdateStatsResponse> syncJobUpdateStats(SyncJobUpdateStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SyncJobUpdateStatsRequest, SyncJobUpdateStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<SyncJobUpdateStatsRequest, SyncJobUpdateStatsResponse, ErrorResponse>) SyncJobUpdateStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Set the connector sync job stats. Stats include:
	 * <code>deleted_document_count</code>, <code>indexed_document_count</code>,
	 * <code>indexed_document_volume</code>, and <code>total_document_count</code>.
	 * You can also update <code>last_seen</code>. This API is mainly used by the
	 * connector service for updating sync job information.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SyncJobUpdateStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/set-connector-sync-job-stats-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SyncJobUpdateStatsResponse> syncJobUpdateStats(
			Function<SyncJobUpdateStatsRequest.Builder, ObjectBuilder<SyncJobUpdateStatsRequest>> fn) {
		return syncJobUpdateStats(fn.apply(new SyncJobUpdateStatsRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_active_filtering

	/**
	 * Activate the connector draft filter.
	 * <p>
	 * Activates the valid draft filtering for a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateActiveFilteringResponse> updateActiveFiltering(
			UpdateActiveFilteringRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateActiveFilteringRequest, UpdateActiveFilteringResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateActiveFilteringRequest, UpdateActiveFilteringResponse, ErrorResponse>) UpdateActiveFilteringRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Activate the connector draft filter.
	 * <p>
	 * Activates the valid draft filtering for a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateActiveFilteringRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateActiveFilteringResponse> updateActiveFiltering(
			Function<UpdateActiveFilteringRequest.Builder, ObjectBuilder<UpdateActiveFilteringRequest>> fn) {
		return updateActiveFiltering(fn.apply(new UpdateActiveFilteringRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_api_key_id

	/**
	 * Update the connector API key ID.
	 * <p>
	 * Update the <code>api_key_id</code> and <code>api_key_secret_id</code> fields
	 * of a connector. You can specify the ID of the API key used for authorization
	 * and the ID of the connector secret where the API key is stored. The connector
	 * secret ID is required only for Elastic managed (native) connectors.
	 * Self-managed connectors (connector clients) do not use this field.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-api-key-id-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateApiKeyIdResponse> updateApiKeyId(UpdateApiKeyIdRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateApiKeyIdRequest, UpdateApiKeyIdResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateApiKeyIdRequest, UpdateApiKeyIdResponse, ErrorResponse>) UpdateApiKeyIdRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector API key ID.
	 * <p>
	 * Update the <code>api_key_id</code> and <code>api_key_secret_id</code> fields
	 * of a connector. You can specify the ID of the API key used for authorization
	 * and the ID of the connector secret where the API key is stored. The connector
	 * secret ID is required only for Elastic managed (native) connectors.
	 * Self-managed connectors (connector clients) do not use this field.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateApiKeyIdRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-api-key-id-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateApiKeyIdResponse> updateApiKeyId(
			Function<UpdateApiKeyIdRequest.Builder, ObjectBuilder<UpdateApiKeyIdRequest>> fn) {
		return updateApiKeyId(fn.apply(new UpdateApiKeyIdRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_configuration

	/**
	 * Update the connector configuration.
	 * <p>
	 * Update the configuration field in the connector document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-configuration-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateConfigurationResponse> updateConfiguration(UpdateConfigurationRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateConfigurationRequest, UpdateConfigurationResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateConfigurationRequest, UpdateConfigurationResponse, ErrorResponse>) UpdateConfigurationRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector configuration.
	 * <p>
	 * Update the configuration field in the connector document.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateConfigurationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-configuration-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateConfigurationResponse> updateConfiguration(
			Function<UpdateConfigurationRequest.Builder, ObjectBuilder<UpdateConfigurationRequest>> fn) {
		return updateConfiguration(fn.apply(new UpdateConfigurationRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_error

	/**
	 * Update the connector error field.
	 * <p>
	 * Set the error field for the connector. If the error provided in the request
	 * body is non-null, the connector’s status is updated to error. Otherwise, if
	 * the error is reset to null, the connector status is updated to connected.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-error-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateErrorResponse> updateError(UpdateErrorRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateErrorRequest, UpdateErrorResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateErrorRequest, UpdateErrorResponse, ErrorResponse>) UpdateErrorRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector error field.
	 * <p>
	 * Set the error field for the connector. If the error provided in the request
	 * body is non-null, the connector’s status is updated to error. Otherwise, if
	 * the error is reset to null, the connector status is updated to connected.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateErrorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-error-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateErrorResponse> updateError(
			Function<UpdateErrorRequest.Builder, ObjectBuilder<UpdateErrorRequest>> fn) {
		return updateError(fn.apply(new UpdateErrorRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_features

	/**
	 * Update the connector features. Update the connector features in the connector
	 * document. This API can be used to control the following aspects of a
	 * connector:
	 * <ul>
	 * <li>document-level security</li>
	 * <li>incremental syncs</li>
	 * <li>advanced sync rules</li>
	 * <li>basic sync rules</li>
	 * </ul>
	 * <p>
	 * Normally, the running connector service automatically manages these features.
	 * However, you can use this API to override the default behavior.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-features-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateFeaturesResponse> updateFeatures(UpdateFeaturesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateFeaturesRequest, UpdateFeaturesResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateFeaturesRequest, UpdateFeaturesResponse, ErrorResponse>) UpdateFeaturesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector features. Update the connector features in the connector
	 * document. This API can be used to control the following aspects of a
	 * connector:
	 * <ul>
	 * <li>document-level security</li>
	 * <li>incremental syncs</li>
	 * <li>advanced sync rules</li>
	 * <li>basic sync rules</li>
	 * </ul>
	 * <p>
	 * Normally, the running connector service automatically manages these features.
	 * However, you can use this API to override the default behavior.
	 * <p>
	 * To sync data using self-managed connectors, you need to deploy the Elastic
	 * connector service on your own infrastructure. This service runs automatically
	 * on Elastic Cloud for Elastic managed connectors.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateFeaturesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-features-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateFeaturesResponse> updateFeatures(
			Function<UpdateFeaturesRequest.Builder, ObjectBuilder<UpdateFeaturesRequest>> fn) {
		return updateFeatures(fn.apply(new UpdateFeaturesRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_filtering

	/**
	 * Update the connector filtering.
	 * <p>
	 * Update the draft filtering configuration of a connector and marks the draft
	 * validation state as edited. The filtering draft is activated once validated
	 * by the running Elastic connector service. The filtering property is used to
	 * configure sync rules (both basic and advanced) for a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateFilteringResponse> updateFiltering(UpdateFilteringRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateFilteringRequest, UpdateFilteringResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateFilteringRequest, UpdateFilteringResponse, ErrorResponse>) UpdateFilteringRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector filtering.
	 * <p>
	 * Update the draft filtering configuration of a connector and marks the draft
	 * validation state as edited. The filtering draft is activated once validated
	 * by the running Elastic connector service. The filtering property is used to
	 * configure sync rules (both basic and advanced) for a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateFilteringRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateFilteringResponse> updateFiltering(
			Function<UpdateFilteringRequest.Builder, ObjectBuilder<UpdateFilteringRequest>> fn) {
		return updateFiltering(fn.apply(new UpdateFilteringRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_filtering_validation

	/**
	 * Update the connector draft filtering validation.
	 * <p>
	 * Update the draft filtering validation info for a connector.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-validation-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateFilteringValidationResponse> updateFilteringValidation(
			UpdateFilteringValidationRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateFilteringValidationRequest, UpdateFilteringValidationResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateFilteringValidationRequest, UpdateFilteringValidationResponse, ErrorResponse>) UpdateFilteringValidationRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector draft filtering validation.
	 * <p>
	 * Update the draft filtering validation info for a connector.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateFilteringValidationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-filtering-validation-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateFilteringValidationResponse> updateFilteringValidation(
			Function<UpdateFilteringValidationRequest.Builder, ObjectBuilder<UpdateFilteringValidationRequest>> fn) {
		return updateFilteringValidation(fn.apply(new UpdateFilteringValidationRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_index_name

	/**
	 * Update the connector index name.
	 * <p>
	 * Update the <code>index_name</code> field of a connector, specifying the index
	 * where the data ingested by the connector is stored.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-index-name-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateIndexNameResponse> updateIndexName(UpdateIndexNameRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateIndexNameRequest, UpdateIndexNameResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateIndexNameRequest, UpdateIndexNameResponse, ErrorResponse>) UpdateIndexNameRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector index name.
	 * <p>
	 * Update the <code>index_name</code> field of a connector, specifying the index
	 * where the data ingested by the connector is stored.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateIndexNameRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-index-name-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateIndexNameResponse> updateIndexName(
			Function<UpdateIndexNameRequest.Builder, ObjectBuilder<UpdateIndexNameRequest>> fn) {
		return updateIndexName(fn.apply(new UpdateIndexNameRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_name

	/**
	 * Update the connector name and description.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-name-description-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateNameResponse> updateName(UpdateNameRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateNameRequest, UpdateNameResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateNameRequest, UpdateNameResponse, ErrorResponse>) UpdateNameRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector name and description.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateNameRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-name-description-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateNameResponse> updateName(
			Function<UpdateNameRequest.Builder, ObjectBuilder<UpdateNameRequest>> fn) {
		return updateName(fn.apply(new UpdateNameRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_native

	/**
	 * Update the connector is_native flag.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-native-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateNativeResponse> updateNative(UpdateNativeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateNativeRequest, UpdateNativeResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateNativeRequest, UpdateNativeResponse, ErrorResponse>) UpdateNativeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector is_native flag.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateNativeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-native-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateNativeResponse> updateNative(
			Function<UpdateNativeRequest.Builder, ObjectBuilder<UpdateNativeRequest>> fn) {
		return updateNative(fn.apply(new UpdateNativeRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_pipeline

	/**
	 * Update the connector pipeline.
	 * <p>
	 * When you create a new connector, the configuration of an ingest pipeline is
	 * populated with default settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdatePipelineRequest, UpdatePipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdatePipelineRequest, UpdatePipelineResponse, ErrorResponse>) UpdatePipelineRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector pipeline.
	 * <p>
	 * When you create a new connector, the configuration of an ingest pipeline is
	 * populated with default settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdatePipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdatePipelineResponse> updatePipeline(
			Function<UpdatePipelineRequest.Builder, ObjectBuilder<UpdatePipelineRequest>> fn) {
		return updatePipeline(fn.apply(new UpdatePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_scheduling

	/**
	 * Update the connector scheduling.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-scheduling-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateSchedulingResponse> updateScheduling(UpdateSchedulingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateSchedulingRequest, UpdateSchedulingResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateSchedulingRequest, UpdateSchedulingResponse, ErrorResponse>) UpdateSchedulingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector scheduling.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateSchedulingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-scheduling-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateSchedulingResponse> updateScheduling(
			Function<UpdateSchedulingRequest.Builder, ObjectBuilder<UpdateSchedulingRequest>> fn) {
		return updateScheduling(fn.apply(new UpdateSchedulingRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_service_type

	/**
	 * Update the connector service type.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-service-type-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateServiceTypeResponse> updateServiceType(UpdateServiceTypeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateServiceTypeRequest, UpdateServiceTypeResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateServiceTypeRequest, UpdateServiceTypeResponse, ErrorResponse>) UpdateServiceTypeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector service type.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateServiceTypeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-service-type-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateServiceTypeResponse> updateServiceType(
			Function<UpdateServiceTypeRequest.Builder, ObjectBuilder<UpdateServiceTypeRequest>> fn) {
		return updateServiceType(fn.apply(new UpdateServiceTypeRequest.Builder()).build());
	}

	// ----- Endpoint: connector.update_status

	/**
	 * Update the connector status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateStatusResponse> updateStatus(UpdateStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateStatusRequest, UpdateStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateStatusRequest, UpdateStatusResponse, ErrorResponse>) UpdateStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the connector status.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/update-connector-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateStatusResponse> updateStatus(
			Function<UpdateStatusRequest.Builder, ObjectBuilder<UpdateStatusRequest>> fn) {
		return updateStatus(fn.apply(new UpdateStatusRequest.Builder()).build());
	}

}
