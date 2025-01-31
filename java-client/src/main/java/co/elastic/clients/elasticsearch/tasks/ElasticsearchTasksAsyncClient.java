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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Client for the tasks namespace.
 */
public class ElasticsearchTasksAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchTasksAsyncClient> {

	public ElasticsearchTasksAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchTasksAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTasksAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTasksAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: tasks.cancel

	/**
	 * Cancel a task.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * A task may continue to run for some time after it has been cancelled because
	 * it may not be able to safely stop its current activity straight away. It is
	 * also possible that Elasticsearch must complete its work on other tasks before
	 * it can process the cancellation. The get task information API will continue
	 * to list these cancelled tasks until they complete. The cancelled flag in the
	 * response indicates that the cancellation command has been processed and the
	 * task will stop as soon as possible.
	 * <p>
	 * To troubleshoot why a cancelled task does not complete promptly, use the get
	 * task information API with the <code>?detailed</code> parameter to identify
	 * the other tasks the system is running. You can also use the node hot threads
	 * API to obtain detailed information about the work the system is doing instead
	 * of completing the cancelled task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CancelResponse> cancel(CancelRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CancelRequest, CancelResponse, ErrorResponse> endpoint = (JsonEndpoint<CancelRequest, CancelResponse, ErrorResponse>) CancelRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Cancel a task.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * A task may continue to run for some time after it has been cancelled because
	 * it may not be able to safely stop its current activity straight away. It is
	 * also possible that Elasticsearch must complete its work on other tasks before
	 * it can process the cancellation. The get task information API will continue
	 * to list these cancelled tasks until they complete. The cancelled flag in the
	 * response indicates that the cancellation command has been processed and the
	 * task will stop as soon as possible.
	 * <p>
	 * To troubleshoot why a cancelled task does not complete promptly, use the get
	 * task information API with the <code>?detailed</code> parameter to identify
	 * the other tasks the system is running. You can also use the node hot threads
	 * API to obtain detailed information about the work the system is doing instead
	 * of completing the cancelled task.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CancelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CancelResponse> cancel(
			Function<CancelRequest.Builder, ObjectBuilder<CancelRequest>> fn) {
		return cancel(fn.apply(new CancelRequest.Builder()).build());
	}

	/**
	 * Cancel a task.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * A task may continue to run for some time after it has been cancelled because
	 * it may not be able to safely stop its current activity straight away. It is
	 * also possible that Elasticsearch must complete its work on other tasks before
	 * it can process the cancellation. The get task information API will continue
	 * to list these cancelled tasks until they complete. The cancelled flag in the
	 * response indicates that the cancellation command has been processed and the
	 * task will stop as soon as possible.
	 * <p>
	 * To troubleshoot why a cancelled task does not complete promptly, use the get
	 * task information API with the <code>?detailed</code> parameter to identify
	 * the other tasks the system is running. You can also use the node hot threads
	 * API to obtain detailed information about the work the system is doing instead
	 * of completing the cancelled task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CancelResponse> cancel() {
		return this.transport.performRequestAsync(new CancelRequest.Builder().build(), CancelRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: tasks.get

	/**
	 * Get task information. Get information about a task currently running in the
	 * cluster.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * If the task identifier is not found, a 404 response code indicates that there
	 * are no resources that match the request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTasksResponse> get(GetTasksRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTasksRequest, GetTasksResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTasksRequest, GetTasksResponse, ErrorResponse>) GetTasksRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get task information. Get information about a task currently running in the
	 * cluster.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * If the task identifier is not found, a 404 response code indicates that there
	 * are no resources that match the request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTasksResponse> get(
			Function<GetTasksRequest.Builder, ObjectBuilder<GetTasksRequest>> fn) {
		return get(fn.apply(new GetTasksRequest.Builder()).build());
	}

	// ----- Endpoint: tasks.list

	/**
	 * Get all tasks. Get information about the tasks currently running on one or
	 * more nodes in the cluster.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * <strong>Identifying running tasks</strong>
	 * <p>
	 * The <code>X-Opaque-Id header</code>, when provided on the HTTP request
	 * header, is going to be returned as a header in the response as well as in the
	 * headers field for in the task information. This enables you to track certain
	 * calls or associate certain tasks with the client that started them. For
	 * example:
	 * 
	 * <pre>
	 * <code>curl -i -H &quot;X-Opaque-Id: 123456&quot; &quot;http://localhost:9200/_tasks?group_by=parents&quot;
	 * </code>
	 * </pre>
	 * <p>
	 * The API returns the following result:
	 * 
	 * <pre>
	 * <code>HTTP/1.1 200 OK
	 * X-Opaque-Id: 123456
	 * content-type: application/json; charset=UTF-8
	 * content-length: 831
	 *
	 * {
	 *   &quot;tasks&quot; : {
	 *     &quot;u5lcZHqcQhu-rUoFaqDphA:45&quot; : {
	 *       &quot;node&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA&quot;,
	 *       &quot;id&quot; : 45,
	 *       &quot;type&quot; : &quot;transport&quot;,
	 *       &quot;action&quot; : &quot;cluster:monitor/tasks/lists&quot;,
	 *       &quot;start_time_in_millis&quot; : 1513823752749,
	 *       &quot;running_time_in_nanos&quot; : 293139,
	 *       &quot;cancellable&quot; : false,
	 *       &quot;headers&quot; : {
	 *         &quot;X-Opaque-Id&quot; : &quot;123456&quot;
	 *       },
	 *       &quot;children&quot; : [
	 *         {
	 *           &quot;node&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA&quot;,
	 *           &quot;id&quot; : 46,
	 *           &quot;type&quot; : &quot;direct&quot;,
	 *           &quot;action&quot; : &quot;cluster:monitor/tasks/lists[n]&quot;,
	 *           &quot;start_time_in_millis&quot; : 1513823752750,
	 *           &quot;running_time_in_nanos&quot; : 92133,
	 *           &quot;cancellable&quot; : false,
	 *           &quot;parent_task_id&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA:45&quot;,
	 *           &quot;headers&quot; : {
	 *             &quot;X-Opaque-Id&quot; : &quot;123456&quot;
	 *           }
	 *         }
	 *       ]
	 *     }
	 *   }
	 *  }
	 * </code>
	 * </pre>
	 * <p>
	 * In this example, <code>X-Opaque-Id: 123456</code> is the ID as a part of the
	 * response header. The <code>X-Opaque-Id</code> in the task
	 * <code>headers</code> is the ID for the task that was initiated by the REST
	 * request. The <code>X-Opaque-Id</code> in the children <code>headers</code> is
	 * the child task of the task that was initiated by the REST request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list(ListRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRequest, ListResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRequest, ListResponse, ErrorResponse>) ListRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get all tasks. Get information about the tasks currently running on one or
	 * more nodes in the cluster.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * <strong>Identifying running tasks</strong>
	 * <p>
	 * The <code>X-Opaque-Id header</code>, when provided on the HTTP request
	 * header, is going to be returned as a header in the response as well as in the
	 * headers field for in the task information. This enables you to track certain
	 * calls or associate certain tasks with the client that started them. For
	 * example:
	 * 
	 * <pre>
	 * <code>curl -i -H &quot;X-Opaque-Id: 123456&quot; &quot;http://localhost:9200/_tasks?group_by=parents&quot;
	 * </code>
	 * </pre>
	 * <p>
	 * The API returns the following result:
	 * 
	 * <pre>
	 * <code>HTTP/1.1 200 OK
	 * X-Opaque-Id: 123456
	 * content-type: application/json; charset=UTF-8
	 * content-length: 831
	 *
	 * {
	 *   &quot;tasks&quot; : {
	 *     &quot;u5lcZHqcQhu-rUoFaqDphA:45&quot; : {
	 *       &quot;node&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA&quot;,
	 *       &quot;id&quot; : 45,
	 *       &quot;type&quot; : &quot;transport&quot;,
	 *       &quot;action&quot; : &quot;cluster:monitor/tasks/lists&quot;,
	 *       &quot;start_time_in_millis&quot; : 1513823752749,
	 *       &quot;running_time_in_nanos&quot; : 293139,
	 *       &quot;cancellable&quot; : false,
	 *       &quot;headers&quot; : {
	 *         &quot;X-Opaque-Id&quot; : &quot;123456&quot;
	 *       },
	 *       &quot;children&quot; : [
	 *         {
	 *           &quot;node&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA&quot;,
	 *           &quot;id&quot; : 46,
	 *           &quot;type&quot; : &quot;direct&quot;,
	 *           &quot;action&quot; : &quot;cluster:monitor/tasks/lists[n]&quot;,
	 *           &quot;start_time_in_millis&quot; : 1513823752750,
	 *           &quot;running_time_in_nanos&quot; : 92133,
	 *           &quot;cancellable&quot; : false,
	 *           &quot;parent_task_id&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA:45&quot;,
	 *           &quot;headers&quot; : {
	 *             &quot;X-Opaque-Id&quot; : &quot;123456&quot;
	 *           }
	 *         }
	 *       ]
	 *     }
	 *   }
	 *  }
	 * </code>
	 * </pre>
	 * <p>
	 * In this example, <code>X-Opaque-Id: 123456</code> is the ID as a part of the
	 * response header. The <code>X-Opaque-Id</code> in the task
	 * <code>headers</code> is the ID for the task that was initiated by the REST
	 * request. The <code>X-Opaque-Id</code> in the children <code>headers</code> is
	 * the child task of the task that was initiated by the REST request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ListResponse> list(Function<ListRequest.Builder, ObjectBuilder<ListRequest>> fn) {
		return list(fn.apply(new ListRequest.Builder()).build());
	}

	/**
	 * Get all tasks. Get information about the tasks currently running on one or
	 * more nodes in the cluster.
	 * <p>
	 * WARNING: The task management API is new and should still be considered a beta
	 * feature. The API may change in ways that are not backwards compatible.
	 * <p>
	 * <strong>Identifying running tasks</strong>
	 * <p>
	 * The <code>X-Opaque-Id header</code>, when provided on the HTTP request
	 * header, is going to be returned as a header in the response as well as in the
	 * headers field for in the task information. This enables you to track certain
	 * calls or associate certain tasks with the client that started them. For
	 * example:
	 * 
	 * <pre>
	 * <code>curl -i -H &quot;X-Opaque-Id: 123456&quot; &quot;http://localhost:9200/_tasks?group_by=parents&quot;
	 * </code>
	 * </pre>
	 * <p>
	 * The API returns the following result:
	 * 
	 * <pre>
	 * <code>HTTP/1.1 200 OK
	 * X-Opaque-Id: 123456
	 * content-type: application/json; charset=UTF-8
	 * content-length: 831
	 *
	 * {
	 *   &quot;tasks&quot; : {
	 *     &quot;u5lcZHqcQhu-rUoFaqDphA:45&quot; : {
	 *       &quot;node&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA&quot;,
	 *       &quot;id&quot; : 45,
	 *       &quot;type&quot; : &quot;transport&quot;,
	 *       &quot;action&quot; : &quot;cluster:monitor/tasks/lists&quot;,
	 *       &quot;start_time_in_millis&quot; : 1513823752749,
	 *       &quot;running_time_in_nanos&quot; : 293139,
	 *       &quot;cancellable&quot; : false,
	 *       &quot;headers&quot; : {
	 *         &quot;X-Opaque-Id&quot; : &quot;123456&quot;
	 *       },
	 *       &quot;children&quot; : [
	 *         {
	 *           &quot;node&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA&quot;,
	 *           &quot;id&quot; : 46,
	 *           &quot;type&quot; : &quot;direct&quot;,
	 *           &quot;action&quot; : &quot;cluster:monitor/tasks/lists[n]&quot;,
	 *           &quot;start_time_in_millis&quot; : 1513823752750,
	 *           &quot;running_time_in_nanos&quot; : 92133,
	 *           &quot;cancellable&quot; : false,
	 *           &quot;parent_task_id&quot; : &quot;u5lcZHqcQhu-rUoFaqDphA:45&quot;,
	 *           &quot;headers&quot; : {
	 *             &quot;X-Opaque-Id&quot; : &quot;123456&quot;
	 *           }
	 *         }
	 *       ]
	 *     }
	 *   }
	 *  }
	 * </code>
	 * </pre>
	 * <p>
	 * In this example, <code>X-Opaque-Id: 123456</code> is the ID as a part of the
	 * response header. The <code>X-Opaque-Id</code> in the task
	 * <code>headers</code> is the ID for the task that was initiated by the REST
	 * request. The <code>X-Opaque-Id</code> in the children <code>headers</code> is
	 * the child task of the task that was initiated by the REST request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-tasks">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ListResponse> list() {
		return this.transport.performRequestAsync(new ListRequest.Builder().build(), ListRequest._ENDPOINT,
				this.transportOptions);
	}

}
