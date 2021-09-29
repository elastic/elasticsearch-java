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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the ilm namespace.
 */
public class ElasticsearchIlmAsyncClient extends ApiClient {

	public ElasticsearchIlmAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: ilm.delete_lifecycle

	/**
	 * Deletes the specified lifecycle policy definition. A currently used policy
	 * cannot be deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-delete-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(DeleteLifecycleRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, DeleteLifecycleRequest.ENDPOINT);
	}

	/**
	 * Deletes the specified lifecycle policy definition. A currently used policy
	 * cannot be deleted.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-delete-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteLifecycleResponse> deleteLifecycle(
			Function<DeleteLifecycleRequest.Builder, ObjectBuilder<DeleteLifecycleRequest>> fn) throws IOException {
		return deleteLifecycle(fn.apply(new DeleteLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.explain_lifecycle

	/**
	 * Retrieves information about the index's current lifecycle state, such as the
	 * currently executing phase, action, and step.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-explain-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExplainLifecycleResponse> explainLifecycle(ExplainLifecycleRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ExplainLifecycleRequest.ENDPOINT);
	}

	/**
	 * Retrieves information about the index's current lifecycle state, such as the
	 * currently executing phase, action, and step.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-explain-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExplainLifecycleResponse> explainLifecycle(
			Function<ExplainLifecycleRequest.Builder, ObjectBuilder<ExplainLifecycleRequest>> fn) throws IOException {
		return explainLifecycle(fn.apply(new ExplainLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.get_lifecycle

	/**
	 * Returns the specified policy definition. Includes the policy version and last
	 * modified date.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-get-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLifecycleResponse> getLifecycle(GetLifecycleRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetLifecycleRequest.ENDPOINT);
	}

	/**
	 * Returns the specified policy definition. Includes the policy version and last
	 * modified date.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-get-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetLifecycleResponse> getLifecycle(
			Function<GetLifecycleRequest.Builder, ObjectBuilder<GetLifecycleRequest>> fn) throws IOException {
		return getLifecycle(fn.apply(new GetLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.get_status

	/**
	 * Retrieves the current index lifecycle management (ILM) status.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-get-status.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetStatusResponse> getStatus() throws IOException {
		return this.transport.performRequestAsync(GetStatusRequest._INSTANCE, GetStatusRequest.ENDPOINT);
	}

	// ----- Endpoint: ilm.move_to_step

	/**
	 * Manually moves an index into the specified step and executes that step.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-move-to-step.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MoveToStepResponse> moveToStep(MoveToStepRequest request) throws IOException {
		return this.transport.performRequestAsync(request, MoveToStepRequest.ENDPOINT);
	}

	/**
	 * Manually moves an index into the specified step and executes that step.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-move-to-step.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MoveToStepResponse> moveToStep(
			Function<MoveToStepRequest.Builder, ObjectBuilder<MoveToStepRequest>> fn) throws IOException {
		return moveToStep(fn.apply(new MoveToStepRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.put_lifecycle

	/**
	 * Creates a lifecycle policy
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-put-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutLifecycleResponse> putLifecycle(PutLifecycleRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutLifecycleRequest.ENDPOINT);
	}

	/**
	 * Creates a lifecycle policy
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-put-lifecycle.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutLifecycleResponse> putLifecycle(
			Function<PutLifecycleRequest.Builder, ObjectBuilder<PutLifecycleRequest>> fn) throws IOException {
		return putLifecycle(fn.apply(new PutLifecycleRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.remove_policy

	/**
	 * Removes the assigned lifecycle policy and stops managing the specified index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-remove-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RemovePolicyResponse> removePolicy(RemovePolicyRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RemovePolicyRequest.ENDPOINT);
	}

	/**
	 * Removes the assigned lifecycle policy and stops managing the specified index
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-remove-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RemovePolicyResponse> removePolicy(
			Function<RemovePolicyRequest.Builder, ObjectBuilder<RemovePolicyRequest>> fn) throws IOException {
		return removePolicy(fn.apply(new RemovePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.retry

	/**
	 * Retries executing the policy for an index that is in the ERROR step.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-retry-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RetryResponse> retry(RetryRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RetryRequest.ENDPOINT);
	}

	/**
	 * Retries executing the policy for an index that is in the ERROR step.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-retry-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RetryResponse> retry(Function<RetryRequest.Builder, ObjectBuilder<RetryRequest>> fn)
			throws IOException {
		return retry(fn.apply(new RetryRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.start

	/**
	 * Start the index lifecycle management (ILM) plugin.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-start.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartResponse> start(StartRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StartRequest.ENDPOINT);
	}

	/**
	 * Start the index lifecycle management (ILM) plugin.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-start.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartResponse> start(Function<StartRequest.Builder, ObjectBuilder<StartRequest>> fn)
			throws IOException {
		return start(fn.apply(new StartRequest.Builder()).build());
	}

	// ----- Endpoint: ilm.stop

	/**
	 * Halts all lifecycle management operations and stops the index lifecycle
	 * management (ILM) plugin
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-stop.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopResponse> stop(StopRequest request) throws IOException {
		return this.transport.performRequestAsync(request, StopRequest.ENDPOINT);
	}

	/**
	 * Halts all lifecycle management operations and stops the index lifecycle
	 * management (ILM) plugin
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ilm-stop.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopResponse> stop(Function<StopRequest.Builder, ObjectBuilder<StopRequest>> fn)
			throws IOException {
		return stop(fn.apply(new StopRequest.Builder()).build());
	}

}
