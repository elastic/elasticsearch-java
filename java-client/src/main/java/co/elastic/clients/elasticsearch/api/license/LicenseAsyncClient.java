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
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the license namespace.
 */
public class LicenseAsyncClient extends ApiClient<LicenseAsyncClient> {

	public LicenseAsyncClient(Transport transport) {
		super(transport, null);
	}

	public LicenseAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: license.delete

	/**
	 * Deletes licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-license.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<DeleteResponse> delete() throws IOException {
		return this.transport.performRequestAsync(DeleteRequest.INSTANCE, DeleteRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: license.get

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetResponse> get(GetRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetResponse> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn)
			throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build());
	}

	// ----- Endpoint: license.get_basic_status

	/**
	 * Retrieves information about the status of the basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-basic-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetBasicStatusResponse> getBasicStatus() throws IOException {
		return this.transport.performRequestAsync(GetBasicStatusRequest.INSTANCE, GetBasicStatusRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: license.get_trial_status

	/**
	 * Retrieves information about the status of the trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-trial-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetTrialStatusResponse> getTrialStatus() throws IOException {
		return this.transport.performRequestAsync(GetTrialStatusRequest.INSTANCE, GetTrialStatusRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: license.post

	/**
	 * Updates the license for the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostResponse> post(PostRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PostRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates the license for the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostResponse> post(Function<PostRequest.Builder, ObjectBuilder<PostRequest>> fn)
			throws IOException {
		return post(fn.apply(new PostRequest.Builder()).build());
	}

	// ----- Endpoint: license.post_start_basic

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartBasicResponse> postStartBasic(PostStartBasicRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PostStartBasicRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostStartBasicResponse> postStartBasic(
			Function<PostStartBasicRequest.Builder, ObjectBuilder<PostStartBasicRequest>> fn) throws IOException {
		return postStartBasic(fn.apply(new PostStartBasicRequest.Builder()).build());
	}

	// ----- Endpoint: license.post_start_trial

	/**
	 * starts a limited time trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PostStartTrialResponse> postStartTrial(PostStartTrialRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PostStartTrialRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * starts a limited time trial license.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PostStartTrialResponse> postStartTrial(
			Function<PostStartTrialRequest.Builder, ObjectBuilder<PostStartTrialRequest>> fn) throws IOException {
		return postStartTrial(fn.apply(new PostStartTrialRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #LicenseAsyncClient} with specific request options.
	 */
	@Override
	public LicenseAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new LicenseAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #LicenseAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public LicenseAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
