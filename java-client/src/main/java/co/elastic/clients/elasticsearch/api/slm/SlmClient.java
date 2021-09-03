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

package co.elastic.clients.elasticsearch.api.slm;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.slm.DeleteLifecycleRequest;
import co.elastic.clients.elasticsearch.slm.DeleteLifecycleResponse;
import co.elastic.clients.elasticsearch.slm.ExecuteLifecycleRequest;
import co.elastic.clients.elasticsearch.slm.ExecuteLifecycleResponse;
import co.elastic.clients.elasticsearch.slm.ExecuteRetentionRequest;
import co.elastic.clients.elasticsearch.slm.ExecuteRetentionResponse;
import co.elastic.clients.elasticsearch.slm.GetLifecycleRequest;
import co.elastic.clients.elasticsearch.slm.GetLifecycleResponse;
import co.elastic.clients.elasticsearch.slm.GetStatsRequest;
import co.elastic.clients.elasticsearch.slm.GetStatsResponse;
import co.elastic.clients.elasticsearch.slm.GetStatusRequest;
import co.elastic.clients.elasticsearch.slm.GetStatusResponse;
import co.elastic.clients.elasticsearch.slm.PutLifecycleRequest;
import co.elastic.clients.elasticsearch.slm.PutLifecycleResponse;
import co.elastic.clients.elasticsearch.slm.StartRequest;
import co.elastic.clients.elasticsearch.slm.StartResponse;
import co.elastic.clients.elasticsearch.slm.StopRequest;
import co.elastic.clients.elasticsearch.slm.StopResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the slm namespace.
 */
public class SlmClient extends ApiClient<SlmClient> {

	public SlmClient(Transport transport) {
		super(transport, null);
	}

	public SlmClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: slm.delete_lifecycle

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteLifecycleResponse deleteLifecycle(DeleteLifecycleRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteLifecycleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-delete-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteLifecycleResponse deleteLifecycle(
			Function<DeleteLifecycleRequest.Builder, ObjectBuilder<DeleteLifecycleRequest>> fn) throws IOException {
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

	public ExecuteLifecycleResponse executeLifecycle(ExecuteLifecycleRequest request) throws IOException {
		return this.transport.performRequest(request, ExecuteLifecycleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Immediately creates a snapshot according to the lifecycle policy, without
	 * waiting for the scheduled time.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-execute-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ExecuteLifecycleResponse executeLifecycle(
			Function<ExecuteLifecycleRequest.Builder, ObjectBuilder<ExecuteLifecycleRequest>> fn) throws IOException {
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
	public ExecuteRetentionResponse executeRetention() throws IOException {
		return this.transport.performRequest(ExecuteRetentionRequest.INSTANCE, ExecuteRetentionRequest.ENDPOINT,
				this.requestOptions);
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

	public GetLifecycleResponse getLifecycle(GetLifecycleRequest request) throws IOException {
		return this.transport.performRequest(request, GetLifecycleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves one or more snapshot lifecycle policy definitions and information
	 * about the latest snapshot attempts.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetLifecycleResponse getLifecycle(
			Function<GetLifecycleRequest.Builder, ObjectBuilder<GetLifecycleRequest>> fn) throws IOException {
		return getLifecycle(fn.apply(new GetLifecycleRequest.Builder()).build());
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
	public GetStatsResponse getStats() throws IOException {
		return this.transport.performRequest(GetStatsRequest.INSTANCE, GetStatsRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: slm.get_status

	/**
	 * Retrieves the status of snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-get-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetStatusResponse getStatus() throws IOException {
		return this.transport.performRequest(GetStatusRequest.INSTANCE, GetStatusRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: slm.put_lifecycle

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutLifecycleResponse putLifecycle(PutLifecycleRequest request) throws IOException {
		return this.transport.performRequest(request, PutLifecycleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates a snapshot lifecycle policy.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-put-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutLifecycleResponse putLifecycle(
			Function<PutLifecycleRequest.Builder, ObjectBuilder<PutLifecycleRequest>> fn) throws IOException {
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
	public StartResponse start() throws IOException {
		return this.transport.performRequest(StartRequest.INSTANCE, StartRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: slm.stop

	/**
	 * Turns off snapshot lifecycle management (SLM).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/slm-api-stop.html">Documentation
	 *      on elastic.co</a>
	 */
	public StopResponse stop() throws IOException {
		return this.transport.performRequest(StopRequest.INSTANCE, StopRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Misc

	/**
	 * Creates a new {@link #SlmClient} with specific request options.
	 */
	@Override
	public SlmClient withRequestOptions(@Nullable RequestOptions options) {
		return new SlmClient(transport, options);
	}

	/**
	 * Creates a new {@link #SlmClient} with specific request options, inheriting
	 * existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public SlmClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
