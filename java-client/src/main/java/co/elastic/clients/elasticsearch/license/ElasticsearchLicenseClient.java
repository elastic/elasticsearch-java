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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the license namespace.
 */
public class ElasticsearchLicenseClient extends ApiClient<ElasticsearchLicenseClient> {

	public ElasticsearchLicenseClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchLicenseClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchLicenseClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchLicenseClient(this.transport, transportOptions);
	}

	// ----- Endpoint: license.delete

	/**
	 * Deletes licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-license.html">Documentation
	 *      on elastic.co</a>
	 */
	public DeleteLicenseResponse delete() throws IOException, ElasticsearchException {
		return this.transport.performRequest(DeleteLicenseRequest._INSTANCE, DeleteLicenseRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetLicenseResponse get(GetLicenseRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, GetLicenseRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLicenseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetLicenseResponse get(Function<GetLicenseRequest.Builder, ObjectBuilder<GetLicenseRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetLicenseRequest.Builder()).build());
	}

	/**
	 * Retrieves licensing information for the cluster
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetLicenseResponse get() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetLicenseRequest.Builder().build(), GetLicenseRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get_basic_status

	/**
	 * Retrieves information about the status of the basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-basic-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetBasicStatusResponse getBasicStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetBasicStatusRequest._INSTANCE, GetBasicStatusRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.get_trial_status

	/**
	 * Retrieves information about the status of the trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-trial-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetTrialStatusResponse getTrialStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetTrialStatusRequest._INSTANCE, GetTrialStatusRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.post

	/**
	 * Updates the license for the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostResponse post(PostRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, PostRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Updates the license for the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PostResponse post(Function<PostRequest.Builder, ObjectBuilder<PostRequest>> fn)
			throws IOException, ElasticsearchException {
		return post(fn.apply(new PostRequest.Builder()).build());
	}

	/**
	 * Updates the license for the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/update-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostResponse post() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PostRequest.Builder().build(), PostRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: license.post_start_basic

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostStartBasicResponse postStartBasic(PostStartBasicRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, PostStartBasicRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostStartBasicRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PostStartBasicResponse postStartBasic(
			Function<PostStartBasicRequest.Builder, ObjectBuilder<PostStartBasicRequest>> fn)
			throws IOException, ElasticsearchException {
		return postStartBasic(fn.apply(new PostStartBasicRequest.Builder()).build());
	}

	/**
	 * Starts an indefinite basic license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-basic.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostStartBasicResponse postStartBasic() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PostStartBasicRequest.Builder().build(),
				PostStartBasicRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: license.post_start_trial

	/**
	 * starts a limited time trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostStartTrialResponse postStartTrial(PostStartTrialRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, PostStartTrialRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * starts a limited time trial license.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostStartTrialRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PostStartTrialResponse postStartTrial(
			Function<PostStartTrialRequest.Builder, ObjectBuilder<PostStartTrialRequest>> fn)
			throws IOException, ElasticsearchException {
		return postStartTrial(fn.apply(new PostStartTrialRequest.Builder()).build());
	}

	/**
	 * starts a limited time trial license.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/start-trial.html">Documentation
	 *      on elastic.co</a>
	 */

	public PostStartTrialResponse postStartTrial() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PostStartTrialRequest.Builder().build(),
				PostStartTrialRequest.ENDPOINT, this.transportOptions);
	}

}
