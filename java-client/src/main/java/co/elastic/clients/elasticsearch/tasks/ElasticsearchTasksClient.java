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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the tasks namespace.
 */
public class ElasticsearchTasksClient extends ApiClient<ElasticsearchTasksClient> {

	public ElasticsearchTasksClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchTasksClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTasksClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTasksClient(this.transport, transportOptions);
	}

	// ----- Endpoint: tasks.cancel

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CancelResponse cancel(CancelRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, CancelRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CancelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CancelResponse cancel(Function<CancelRequest.Builder, ObjectBuilder<CancelRequest>> fn)
			throws IOException, ElasticsearchException {
		return cancel(fn.apply(new CancelRequest.Builder()).build());
	}

	/**
	 * Cancels a task, if it can be cancelled through an API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CancelResponse cancel() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CancelRequest.Builder().build(), CancelRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: tasks.get

	/**
	 * Returns information about a task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTasksResponse get(GetTasksRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, GetTasksRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns information about a task.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTasksResponse get(Function<GetTasksRequest.Builder, ObjectBuilder<GetTasksRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetTasksRequest.Builder()).build());
	}

	// ----- Endpoint: tasks.list

	/**
	 * Returns a list of tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list(ListRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, ListRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Returns a list of tasks.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ListResponse list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn)
			throws IOException, ElasticsearchException {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Returns a list of tasks.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public ListResponse list() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ListRequest.Builder().build(), ListRequest.ENDPOINT,
				this.transportOptions);
	}

}
