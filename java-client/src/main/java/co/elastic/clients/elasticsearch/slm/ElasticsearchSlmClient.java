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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the slm namespace.
 */
public class ElasticsearchSlmClient extends ApiClient<ElasticsearchSlmClient> {

	public ElasticsearchSlmClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchSlmClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSlmClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSlmClient(this.transport, transportOptions);
	}

	// ----- Endpoint: slm.delete_lifecycle

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteLifecycleResponse deleteLifecycle(DeleteLifecycleRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, DeleteLifecycleRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteLifecycleResponse deleteLifecycle(
			Function<DeleteLifecycleRequest.Builder, ObjectBuilder<DeleteLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteLifecycle(fn.apply(new DeleteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.execute_lifecycle

	/**
	 * Immediately creates a snapshot according to the lifecycle policy, without
	 * waiting for the scheduled time.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExecuteLifecycleResponse executeLifecycle(ExecuteLifecycleRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, ExecuteLifecycleRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Immediately creates a snapshot according to the lifecycle policy, without
	 * waiting for the scheduled time.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecuteLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ExecuteLifecycleResponse executeLifecycle(
			Function<ExecuteLifecycleRequest.Builder, ObjectBuilder<ExecuteLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return executeLifecycle(fn.apply(new ExecuteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.execute_retention

	/**
	 * Deletes any snapshots that are expired according to the policy's retention
	 * rules.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-retention.html">Documentation
	 *      on elastic.co</a>
	 */
	public ExecuteRetentionResponse executeRetention() throws IOException, ElasticsearchException {
		return this.transport.performRequest(ExecuteRetentionRequest._INSTANCE, ExecuteRetentionRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.get_lifecycle

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetLifecycleResponse getLifecycle(GetLifecycleRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, GetLifecycleRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetLifecycleResponse getLifecycle(
			Function<GetLifecycleRequest.Builder, ObjectBuilder<GetLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return getLifecycle(fn.apply(new GetLifecycleRequest.Builder()).build());
	}

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetLifecycleResponse getLifecycle() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetLifecycleRequest.Builder().build(), GetLifecycleRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.get_stats

	/**
	 * Returns global and policy-level statistics about actions taken by snapshot
	 * lifecycle management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/slm-api-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetStatsResponse getStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetStatsRequest._INSTANCE, GetStatsRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.get_status

	/**
	 * Retrieves the status of snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetStatusResponse getStatus() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetStatusRequest._INSTANCE, GetStatusRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.put_lifecycle

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutLifecycleResponse putLifecycle(PutLifecycleRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, PutLifecycleRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutLifecycleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutLifecycleResponse putLifecycle(
			Function<PutLifecycleRequest.Builder, ObjectBuilder<PutLifecycleRequest>> fn)
			throws IOException, ElasticsearchException {
		return putLifecycle(fn.apply(new PutLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: slm.start

	/**
	 * Turns on snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-start.html">Documentation
	 *      on elastic.co</a>
	 */
	public StartSlmResponse start() throws IOException, ElasticsearchException {
		return this.transport.performRequest(StartSlmRequest._INSTANCE, StartSlmRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: slm.stop

	/**
	 * Turns off snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-stop.html">Documentation
	 *      on elastic.co</a>
	 */
	public StopSlmResponse stop() throws IOException, ElasticsearchException {
		return this.transport.performRequest(StopSlmRequest._INSTANCE, StopSlmRequest.ENDPOINT, this.transportOptions);
	}

}
