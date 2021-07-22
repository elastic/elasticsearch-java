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

package co.elastic.clients.elasticsearch.api.license;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.license.DeleteRequest;
import co.elastic.clients.elasticsearch.license.DeleteResponse;
import co.elastic.clients.elasticsearch.license.GetBasicStatusRequest;
import co.elastic.clients.elasticsearch.license.GetBasicStatusResponse;
import co.elastic.clients.elasticsearch.license.GetRequest;
import co.elastic.clients.elasticsearch.license.GetResponse;
import co.elastic.clients.elasticsearch.license.GetTrialStatusRequest;
import co.elastic.clients.elasticsearch.license.GetTrialStatusResponse;
import co.elastic.clients.elasticsearch.license.PostRequest;
import co.elastic.clients.elasticsearch.license.PostResponse;
import co.elastic.clients.elasticsearch.license.PostStartBasicRequest;
import co.elastic.clients.elasticsearch.license.PostStartBasicResponse;
import co.elastic.clients.elasticsearch.license.PostStartTrialRequest;
import co.elastic.clients.elasticsearch.license.PostStartTrialResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the license namespace.
 */
public class LicenseClient extends ApiClient<LicenseClient> {

	public LicenseClient(Transport transport) {
		super(transport, null);
	}

	public LicenseClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: license.delete

	/**
	 * Deletes licensing information for the cluster
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-license.html"
	 */
	public DeleteResponse delete() throws IOException {
		return this.transport.performRequest(DeleteRequest.INSTANCE, DeleteRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: license.get

	/**
	 * Retrieves licensing information for the cluster
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html"
	 */

	public GetResponse get(GetRequest request) throws IOException {
		return this.transport.performRequest(request, GetRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves licensing information for the cluster
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final GetResponse get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn) throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build());
	}

	// ----- Endpoint: license.get_basic_status

	/**
	 * Retrieves information about the status of the basic license.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-basic-status.html"
	 */
	public GetBasicStatusResponse getBasicStatus() throws IOException {
		return this.transport.performRequest(GetBasicStatusRequest.INSTANCE, GetBasicStatusRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: license.get_trial_status

	/**
	 * Retrieves information about the status of the trial license.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-trial-status.html"
	 */
	public GetTrialStatusResponse getTrialStatus() throws IOException {
		return this.transport.performRequest(GetTrialStatusRequest.INSTANCE, GetTrialStatusRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: license.post

	/**
	 * Updates the license for the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html"
	 */

	public PostResponse post(PostRequest request) throws IOException {
		return this.transport.performRequest(request, PostRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the license for the cluster.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PostResponse post(Function<PostRequest.Builder, ObjectBuilder<PostRequest>> fn) throws IOException {
		return post(fn.apply(new PostRequest.Builder()).build());
	}

	// ----- Endpoint: license.post_start_basic

	/**
	 * Starts an indefinite basic license.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html"
	 */

	public PostStartBasicResponse postStartBasic(PostStartBasicRequest request) throws IOException {
		return this.transport.performRequest(request, PostStartBasicRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Starts an indefinite basic license.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PostStartBasicResponse postStartBasic(
			Function<PostStartBasicRequest.Builder, ObjectBuilder<PostStartBasicRequest>> fn) throws IOException {
		return postStartBasic(fn.apply(new PostStartBasicRequest.Builder()).build());
	}

	// ----- Endpoint: license.post_start_trial

	/**
	 * starts a limited time trial license.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html"
	 */

	public PostStartTrialResponse postStartTrial(PostStartTrialRequest request) throws IOException {
		return this.transport.performRequest(request, PostStartTrialRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * starts a limited time trial license.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final PostStartTrialResponse postStartTrial(
			Function<PostStartTrialRequest.Builder, ObjectBuilder<PostStartTrialRequest>> fn) throws IOException {
		return postStartTrial(fn.apply(new PostStartTrialRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #LicenseClient} with specific request options.
	 */
	@Override
	public LicenseClient withRequestOptions(@Nullable RequestOptions options) {
		return new LicenseClient(transport, options);
	}

	/**
	 * Creates a new {@link #LicenseClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public LicenseClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
