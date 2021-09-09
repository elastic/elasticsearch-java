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

package co.elastic.clients.elasticsearch.api.autoscaling;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.autoscaling.DeleteAutoscalingPolicyRequest;
import co.elastic.clients.elasticsearch.autoscaling.DeleteAutoscalingPolicyResponse;
import co.elastic.clients.elasticsearch.autoscaling.GetAutoscalingCapacityRequest;
import co.elastic.clients.elasticsearch.autoscaling.GetAutoscalingCapacityResponse;
import co.elastic.clients.elasticsearch.autoscaling.GetAutoscalingPolicyRequest;
import co.elastic.clients.elasticsearch.autoscaling.GetAutoscalingPolicyResponse;
import co.elastic.clients.elasticsearch.autoscaling.PutAutoscalingPolicyRequest;
import co.elastic.clients.elasticsearch.autoscaling.PutAutoscalingPolicyResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the autoscaling namespace.
 */
public class AutoscalingAsyncClient extends ApiClient<AutoscalingAsyncClient> {

	public AutoscalingAsyncClient(Transport transport) {
		super(transport, null);
	}

	public AutoscalingAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: autoscaling.delete_autoscaling_policy

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAutoscalingPolicyResponse> deleteAutoscalingPolicy(
			DeleteAutoscalingPolicyRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteAutoscalingPolicyRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAutoscalingPolicyResponse> deleteAutoscalingPolicy(
			Function<DeleteAutoscalingPolicyRequest.Builder, ObjectBuilder<DeleteAutoscalingPolicyRequest>> fn)
			throws IOException {
		return deleteAutoscalingPolicy(fn.apply(new DeleteAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.get_autoscaling_capacity

	/**
	 * Gets the current autoscaling capacity based on the configured autoscaling
	 * policy. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-capacity.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetAutoscalingCapacityResponse> getAutoscalingCapacity() throws IOException {
		return this.transport.performRequestAsync(GetAutoscalingCapacityRequest.INSTANCE,
				GetAutoscalingCapacityRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: autoscaling.get_autoscaling_policy

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetAutoscalingPolicyResponse> getAutoscalingPolicy(GetAutoscalingPolicyRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, GetAutoscalingPolicyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAutoscalingPolicyResponse> getAutoscalingPolicy(
			Function<GetAutoscalingPolicyRequest.Builder, ObjectBuilder<GetAutoscalingPolicyRequest>> fn)
			throws IOException {
		return getAutoscalingPolicy(fn.apply(new GetAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.put_autoscaling_policy

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutAutoscalingPolicyResponse> putAutoscalingPolicy(PutAutoscalingPolicyRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, PutAutoscalingPolicyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutAutoscalingPolicyResponse> putAutoscalingPolicy(
			Function<PutAutoscalingPolicyRequest.Builder, ObjectBuilder<PutAutoscalingPolicyRequest>> fn)
			throws IOException {
		return putAutoscalingPolicy(fn.apply(new PutAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #AutoscalingAsyncClient} with specific request options.
	 */
	@Override
	public AutoscalingAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new AutoscalingAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #AutoscalingAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public AutoscalingAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
