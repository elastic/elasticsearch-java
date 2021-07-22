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

package co.elastic.clients.elasticsearch.api.tasks;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.task.CancelRequest;
import co.elastic.clients.elasticsearch.task.CancelResponse;
import co.elastic.clients.elasticsearch.task.GetRequest;
import co.elastic.clients.elasticsearch.task.GetResponse;
import co.elastic.clients.elasticsearch.task.ListRequest;
import co.elastic.clients.elasticsearch.task.ListResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the tasks namespace.
 */
public class TasksAsyncClient extends ApiClient<TasksAsyncClient> {

	public TasksAsyncClient(Transport transport) {
		super(transport, null);
	}

	public TasksAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: tasks.cancel

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html"
	 */

	public CompletableFuture<CancelResponse> cancel(CancelRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CancelRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<CancelResponse> cancel(
			Function<CancelRequest.Builder, ObjectBuilder<CancelRequest>> fn) throws IOException {
		return cancel(fn.apply(new CancelRequest.Builder()).build());
	}

	// ----- Endpoint: tasks.get

	/**
	 * Returns information about a task.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html"
	 */

	public CompletableFuture<GetResponse> get(GetRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about a task.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<GetResponse> get(Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn)
			throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build());
	}

	// ----- Endpoint: tasks.list

	/**
	 * Returns a list of tasks.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html"
	 */

	public CompletableFuture<ListResponse> list(ListRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ListRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns a list of tasks.
	 *
	 * @see "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html"
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 */

	public final CompletableFuture<ListResponse> list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn)
			throws IOException {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #TasksAsyncClient} with specific request options.
	 */
	@Override
	public TasksAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new TasksAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #TasksAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public TasksAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
