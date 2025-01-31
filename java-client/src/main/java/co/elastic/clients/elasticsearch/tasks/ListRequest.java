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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: tasks.list.Request

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
 * @see <a href="../doc-files/api-spec.html#tasks.list.Request">API
 *      specification</a>
 */

public class ListRequest extends RequestBase {
	private final List<String> actions;

	@Nullable
	private final Boolean detailed;

	@Nullable
	private final GroupBy groupBy;

	@Nullable
	private final Time masterTimeout;

	private final List<String> nodes;

	@Nullable
	private final String parentTaskId;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private ListRequest(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiable(builder.actions);
		this.detailed = builder.detailed;
		this.groupBy = builder.groupBy;
		this.masterTimeout = builder.masterTimeout;
		this.nodes = ApiTypeHelper.unmodifiable(builder.nodes);
		this.parentTaskId = builder.parentTaskId;
		this.timeout = builder.timeout;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static ListRequest of(Function<Builder, ObjectBuilder<ListRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A comma-separated list or wildcard expression of actions used to limit the
	 * request. For example, you can use <code>cluser:*</code> to retrieve all
	 * cluster-related tasks.
	 * <p>
	 * API name: {@code actions}
	 */
	public final List<String> actions() {
		return this.actions;
	}

	/**
	 * If <code>true</code>, the response includes detailed information about the
	 * running tasks. This information is useful to distinguish tasks from each
	 * other but is more costly to run.
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public final Boolean detailed() {
		return this.detailed;
	}

	/**
	 * A key that is used to group tasks in the response. The task lists can be
	 * grouped either by nodes or by parent tasks.
	 * <p>
	 * API name: {@code group_by}
	 */
	@Nullable
	public final GroupBy groupBy() {
		return this.groupBy;
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * A comma-separated list of node IDs or names that is used to limit the
	 * returned information.
	 * <p>
	 * API name: {@code nodes}
	 */
	public final List<String> nodes() {
		return this.nodes;
	}

	/**
	 * A parent task identifier that is used to limit returned information. To
	 * return all tasks, omit this parameter or use a value of <code>-1</code>. If
	 * the parent task is not found, the API does not return a 404 response code.
	 * <p>
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public final String parentTaskId() {
		return this.parentTaskId;
	}

	/**
	 * The period to wait for each node to respond. If a node does not respond
	 * before its timeout expires, the response does not include its information.
	 * However, timed out nodes are included in the <code>node_failures</code>
	 * property.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * If <code>true</code>, the request blocks until the operation is complete.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ListRequest> {
		@Nullable
		private List<String> actions;

		@Nullable
		private Boolean detailed;

		@Nullable
		private GroupBy groupBy;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> nodes;

		@Nullable
		private String parentTaskId;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * A comma-separated list or wildcard expression of actions used to limit the
		 * request. For example, you can use <code>cluser:*</code> to retrieve all
		 * cluster-related tasks.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<String> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * A comma-separated list or wildcard expression of actions used to limit the
		 * request. For example, you can use <code>cluser:*</code> to retrieve all
		 * cluster-related tasks.
		 * <p>
		 * API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(String value, String... values) {
			this.actions = _listAdd(this.actions, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the response includes detailed information about the
		 * running tasks. This information is useful to distinguish tasks from each
		 * other but is more costly to run.
		 * <p>
		 * API name: {@code detailed}
		 */
		public final Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * A key that is used to group tasks in the response. The task lists can be
		 * grouped either by nodes or by parent tasks.
		 * <p>
		 * API name: {@code group_by}
		 */
		public final Builder groupBy(@Nullable GroupBy value) {
			this.groupBy = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * A comma-separated list of node IDs or names that is used to limit the
		 * returned information.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodes</code>.
		 */
		public final Builder nodes(List<String> list) {
			this.nodes = _listAddAll(this.nodes, list);
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names that is used to limit the
		 * returned information.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds one or more values to <code>nodes</code>.
		 */
		public final Builder nodes(String value, String... values) {
			this.nodes = _listAdd(this.nodes, value, values);
			return this;
		}

		/**
		 * A parent task identifier that is used to limit returned information. To
		 * return all tasks, omit this parameter or use a value of <code>-1</code>. If
		 * the parent task is not found, the API does not return a 404 response code.
		 * <p>
		 * API name: {@code parent_task_id}
		 */
		public final Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

		/**
		 * The period to wait for each node to respond. If a node does not respond
		 * before its timeout expires, the response does not include its information.
		 * However, timed out nodes are included in the <code>node_failures</code>
		 * property.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for each node to respond. If a node does not respond
		 * before its timeout expires, the response does not include its information.
		 * However, timed out nodes are included in the <code>node_failures</code>
		 * property.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>true</code>, the request blocks until the operation is complete.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListRequest build() {
			_checkSingleUse();

			return new ListRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code tasks.list}".
	 */
	public static final Endpoint<ListRequest, ListResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/tasks.list",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_tasks";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.nodes)) {
					params.put("nodes", request.nodes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.parentTaskId != null) {
					params.put("parent_task_id", request.parentTaskId);
				}
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (request.groupBy != null) {
					params.put("group_by", request.groupBy.jsonValue());
				}
				if (ApiTypeHelper.isDefined(request.actions)) {
					params.put("actions", request.actions.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ListResponse._DESERIALIZER);
}
