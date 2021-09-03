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

package co.elastic.clients.elasticsearch.api.enrich;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.enrich.DeletePolicyRequest;
import co.elastic.clients.elasticsearch.enrich.DeletePolicyResponse;
import co.elastic.clients.elasticsearch.enrich.ExecutePolicyRequest;
import co.elastic.clients.elasticsearch.enrich.ExecutePolicyResponse;
import co.elastic.clients.elasticsearch.enrich.GetPolicyRequest;
import co.elastic.clients.elasticsearch.enrich.GetPolicyResponse;
import co.elastic.clients.elasticsearch.enrich.PutPolicyRequest;
import co.elastic.clients.elasticsearch.enrich.PutPolicyResponse;
import co.elastic.clients.elasticsearch.enrich.StatsRequest;
import co.elastic.clients.elasticsearch.enrich.StatsResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the enrich namespace.
 */
public class EnrichClient extends ApiClient<EnrichClient> {

	public EnrichClient(Transport transport) {
		super(transport, null);
	}

	public EnrichClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: enrich.delete_policy

	/**
	 * Deletes an existing enrich policy and its enrich index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws IOException {
		return this.transport.performRequest(request, DeletePolicyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing enrich policy and its enrich index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeletePolicyResponse deletePolicy(
			Function<DeletePolicyRequest.Builder, ObjectBuilder<DeletePolicyRequest>> fn) throws IOException {
		return deletePolicy(fn.apply(new DeletePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.execute_policy

	/**
	 * Creates the enrich index for an existing enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/execute-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ExecutePolicyResponse executePolicy(ExecutePolicyRequest request) throws IOException {
		return this.transport.performRequest(request, ExecutePolicyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates the enrich index for an existing enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/execute-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ExecutePolicyResponse executePolicy(
			Function<ExecutePolicyRequest.Builder, ObjectBuilder<ExecutePolicyRequest>> fn) throws IOException {
		return executePolicy(fn.apply(new ExecutePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.get_policy

	/**
	 * Gets information about an enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetPolicyResponse getPolicy(GetPolicyRequest request) throws IOException {
		return this.transport.performRequest(request, GetPolicyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Gets information about an enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetPolicyResponse getPolicy(Function<GetPolicyRequest.Builder, ObjectBuilder<GetPolicyRequest>> fn)
			throws IOException {
		return getPolicy(fn.apply(new GetPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.put_policy

	/**
	 * Creates a new enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutPolicyResponse putPolicy(PutPolicyRequest request) throws IOException {
		return this.transport.performRequest(request, PutPolicyRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a new enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutPolicyResponse putPolicy(Function<PutPolicyRequest.Builder, ObjectBuilder<PutPolicyRequest>> fn)
			throws IOException {
		return putPolicy(fn.apply(new PutPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.stats

	/**
	 * Gets enrich coordinator statistics and information about enrich policies that
	 * are currently executing.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/enrich-stats-api.html">Documentation
	 *      on elastic.co</a>
	 */
	public StatsResponse stats() throws IOException {
		return this.transport.performRequest(StatsRequest.INSTANCE, StatsRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Misc

	/**
	 * Creates a new {@link #EnrichClient} with specific request options.
	 */
	@Override
	public EnrichClient withRequestOptions(@Nullable RequestOptions options) {
		return new EnrichClient(transport, options);
	}

	/**
	 * Creates a new {@link #EnrichClient} with specific request options, inheriting
	 * existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public EnrichClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
