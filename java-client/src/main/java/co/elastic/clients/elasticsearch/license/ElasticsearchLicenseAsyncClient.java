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

package co.elastic.clients.elasticsearch.license;

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
 * Client for the license namespace.
 */
public class ElasticsearchLicenseAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchLicenseAsyncClient> {

	public ElasticsearchLicenseAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchLicenseAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchLicenseAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchLicenseAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: license.delete

	/**
	 * Delete the license.
	 * <p>
	 * When the license expires, your subscription level reverts to Basic.
	 * <p>
	 * If the operator privileges feature is enabled, only operator users can use
	 * this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/delete-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteLicenseResponse> delete(DeleteLicenseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteLicenseRequest, DeleteLicenseResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteLicenseRequest, DeleteLicenseResponse, ErrorResponse>) DeleteLicenseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete the license.
	 * <p>
	 * When the license expires, your subscription level reverts to Basic.
	 * <p>
	 * If the operator privileges feature is enabled, only operator users can use
	 * this API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteLicenseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/delete-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteLicenseResponse> delete(
			Function<DeleteLicenseRequest.Builder, ObjectBuilder<DeleteLicenseRequest>> fn) {
		return delete(fn.apply(new DeleteLicenseRequest.Builder()).build());
	}

	/**
	 * Delete the license.
	 * <p>
	 * When the license expires, your subscription level reverts to Basic.
	 * <p>
	 * If the operator privileges feature is enabled, only operator users can use
	 * this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/delete-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteLicenseResponse> delete() {
		return this.transport.performRequestAsync(new DeleteLicenseRequest.Builder().build(),
				DeleteLicenseRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: license.get

	/**
	 * Get license information.
	 * <p>
	 * Get information about your Elastic license including its type, its status,
	 * when it was issued, and when it expires. <blockquote>
	 * <p>
	 * info If the master node is generating a new cluster state, the get license
	 * API may return a <code>404 Not Found</code> response. If you receive an
	 * unexpected 404 response after cluster startup, wait a short period and retry
	 * the request.
	 * </p>
	 * </blockquote>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLicenseResponse> get(GetLicenseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse> endpoint = (JsonEndpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse>) GetLicenseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get license information.
	 * <p>
	 * Get information about your Elastic license including its type, its status,
	 * when it was issued, and when it expires. <blockquote>
	 * <p>
	 * info If the master node is generating a new cluster state, the get license
	 * API may return a <code>404 Not Found</code> response. If you receive an
	 * unexpected 404 response after cluster startup, wait a short period and retry
	 * the request.
	 * </p>
	 * </blockquote>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLicenseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetLicenseResponse> get(
			Function<GetLicenseRequest.Builder, ObjectBuilder<GetLicenseRequest>> fn) {
		return get(fn.apply(new GetLicenseRequest.Builder()).build());
	}

	/**
	 * Get license information.
	 * <p>
	 * Get information about your Elastic license including its type, its status,
	 * when it was issued, and when it expires. <blockquote>
	 * <p>
	 * info If the master node is generating a new cluster state, the get license
	 * API may return a <code>404 Not Found</code> response. If you receive an
	 * unexpected 404 response after cluster startup, wait a short period and retry
	 * the request.
	 * </p>
	 * </blockquote>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLicenseResponse> get() {
		return this.transport.performRequestAsync(new GetLicenseRequest.Builder().build(), GetLicenseRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get_basic_status

	/**
	 * Get the basic license status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-basic-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetBasicStatusResponse> getBasicStatus() {
		return this.transport.performRequestAsync(GetBasicStatusRequest._INSTANCE, GetBasicStatusRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get_trial_status

	/**
	 * Get the trial status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-trial-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetTrialStatusResponse> getTrialStatus() {
		return this.transport.performRequestAsync(GetTrialStatusRequest._INSTANCE, GetTrialStatusRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.post

	/**
	 * Update the license.
	 * <p>
	 * You can update your license at runtime without shutting down your nodes.
	 * License updates take effect immediately. If the license you are installing
	 * does not support all of the features that were available with your previous
	 * license, however, you are notified in the response. You must then re-submit
	 * the API request with the acknowledge parameter set to true.
	 * <p>
	 * NOTE: If Elasticsearch security features are enabled and you are installing a
	 * gold or higher license, you must enable TLS on the transport networking layer
	 * before you install the license. If the operator privileges feature is
	 * enabled, only operator users can use this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-license-post">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostResponse> post(PostRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostRequest, PostResponse, ErrorResponse> endpoint = (JsonEndpoint<PostRequest, PostResponse, ErrorResponse>) PostRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update the license.
	 * <p>
	 * You can update your license at runtime without shutting down your nodes.
	 * License updates take effect immediately. If the license you are installing
	 * does not support all of the features that were available with your previous
	 * license, however, you are notified in the response. You must then re-submit
	 * the API request with the acknowledge parameter set to true.
	 * <p>
	 * NOTE: If Elasticsearch security features are enabled and you are installing a
	 * gold or higher license, you must enable TLS on the transport networking layer
	 * before you install the license. If the operator privileges feature is
	 * enabled, only operator users can use this API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-license-post">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostResponse> post(Function<PostRequest.Builder, ObjectBuilder<PostRequest>> fn) {
		return post(fn.apply(new PostRequest.Builder()).build());
	}

	/**
	 * Update the license.
	 * <p>
	 * You can update your license at runtime without shutting down your nodes.
	 * License updates take effect immediately. If the license you are installing
	 * does not support all of the features that were available with your previous
	 * license, however, you are notified in the response. You must then re-submit
	 * the API request with the acknowledge parameter set to true.
	 * <p>
	 * NOTE: If Elasticsearch security features are enabled and you are installing a
	 * gold or higher license, you must enable TLS on the transport networking layer
	 * before you install the license. If the operator privileges feature is
	 * enabled, only operator users can use this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-license-post">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostResponse> post() {
		return this.transport.performRequestAsync(new PostRequest.Builder().build(), PostRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.post_start_basic

	/**
	 * Start a basic license.
	 * <p>
	 * Start an indefinite basic license, which gives access to all the basic
	 * features.
	 * <p>
	 * NOTE: In order to start a basic license, you must not currently have a basic
	 * license.
	 * <p>
	 * If the basic license does not support all of the features that are available
	 * with your current license, however, you are notified in the response. You
	 * must then re-submit the API request with the <code>acknowledge</code>
	 * parameter set to <code>true</code>.
	 * <p>
	 * To check the status of your basic license, use the get basic license API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartBasicResponse> postStartBasic(PostStartBasicRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostStartBasicRequest, PostStartBasicResponse, ErrorResponse> endpoint = (JsonEndpoint<PostStartBasicRequest, PostStartBasicResponse, ErrorResponse>) PostStartBasicRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Start a basic license.
	 * <p>
	 * Start an indefinite basic license, which gives access to all the basic
	 * features.
	 * <p>
	 * NOTE: In order to start a basic license, you must not currently have a basic
	 * license.
	 * <p>
	 * If the basic license does not support all of the features that are available
	 * with your current license, however, you are notified in the response. You
	 * must then re-submit the API request with the <code>acknowledge</code>
	 * parameter set to <code>true</code>.
	 * <p>
	 * To check the status of your basic license, use the get basic license API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostStartBasicRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostStartBasicResponse> postStartBasic(
			Function<PostStartBasicRequest.Builder, ObjectBuilder<PostStartBasicRequest>> fn) {
		return postStartBasic(fn.apply(new PostStartBasicRequest.Builder()).build());
	}

	/**
	 * Start a basic license.
	 * <p>
	 * Start an indefinite basic license, which gives access to all the basic
	 * features.
	 * <p>
	 * NOTE: In order to start a basic license, you must not currently have a basic
	 * license.
	 * <p>
	 * If the basic license does not support all of the features that are available
	 * with your current license, however, you are notified in the response. You
	 * must then re-submit the API request with the <code>acknowledge</code>
	 * parameter set to <code>true</code>.
	 * <p>
	 * To check the status of your basic license, use the get basic license API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartBasicResponse> postStartBasic() {
		return this.transport.performRequestAsync(new PostStartBasicRequest.Builder().build(),
				PostStartBasicRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: license.post_start_trial

	/**
	 * Start a trial. Start a 30-day trial, which gives access to all subscription
	 * features.
	 * <p>
	 * NOTE: You are allowed to start a trial only if your cluster has not already
	 * activated a trial for the current major product version. For example, if you
	 * have already activated a trial for v8.0, you cannot start a new trial until
	 * v9.0. You can, however, request an extended trial at <a href=
	 * "https://www.elastic.co/trialextension">https://www.elastic.co/trialextension</a>.
	 * <p>
	 * To check the status of your trial, use the get trial status API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartTrialResponse> postStartTrial(PostStartTrialRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostStartTrialRequest, PostStartTrialResponse, ErrorResponse> endpoint = (JsonEndpoint<PostStartTrialRequest, PostStartTrialResponse, ErrorResponse>) PostStartTrialRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Start a trial. Start a 30-day trial, which gives access to all subscription
	 * features.
	 * <p>
	 * NOTE: You are allowed to start a trial only if your cluster has not already
	 * activated a trial for the current major product version. For example, if you
	 * have already activated a trial for v8.0, you cannot start a new trial until
	 * v9.0. You can, however, request an extended trial at <a href=
	 * "https://www.elastic.co/trialextension">https://www.elastic.co/trialextension</a>.
	 * <p>
	 * To check the status of your trial, use the get trial status API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostStartTrialRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostStartTrialResponse> postStartTrial(
			Function<PostStartTrialRequest.Builder, ObjectBuilder<PostStartTrialRequest>> fn) {
		return postStartTrial(fn.apply(new PostStartTrialRequest.Builder()).build());
	}

	/**
	 * Start a trial. Start a 30-day trial, which gives access to all subscription
	 * features.
	 * <p>
	 * NOTE: You are allowed to start a trial only if your cluster has not already
	 * activated a trial for the current major product version. For example, if you
	 * have already activated a trial for v8.0, you cannot start a new trial until
	 * v9.0. You can, however, request an extended trial at <a href=
	 * "https://www.elastic.co/trialextension">https://www.elastic.co/trialextension</a>.
	 * <p>
	 * To check the status of your trial, use the get trial status API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartTrialResponse> postStartTrial() {
		return this.transport.performRequestAsync(new PostStartTrialRequest.Builder().build(),
				PostStartTrialRequest._ENDPOINT, this.transportOptions);
	}

}
