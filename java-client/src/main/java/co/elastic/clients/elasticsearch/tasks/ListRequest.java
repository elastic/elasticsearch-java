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
 * The task management API returns information about tasks currently executing
 * on one or more nodes in the cluster.
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

	private final List<String> nodeId;

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
		this.nodeId = ApiTypeHelper.unmodifiable(builder.nodeId);
		this.parentTaskId = builder.parentTaskId;
		this.timeout = builder.timeout;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static ListRequest of(Function<Builder, ObjectBuilder<ListRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Comma-separated list or wildcard expression of actions used to limit the
	 * request.
	 * <p>
	 * API name: {@code actions}
	 */
	public final List<String> actions() {
		return this.actions;
	}

	/**
	 * If <code>true</code>, the response includes detailed information about shard
	 * recoveries.
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public final Boolean detailed() {
		return this.detailed;
	}

	/**
	 * Key used to group tasks in the response.
	 * <p>
	 * API name: {@code group_by}
	 */
	@Nullable
	public final GroupBy groupBy() {
		return this.groupBy;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Comma-separated list of node IDs or names used to limit returned information.
	 * <p>
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * Parent task ID used to limit returned information. To return all tasks, omit
	 * this parameter or use a value of <code>-1</code>.
	 * <p>
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public final String parentTaskId() {
		return this.parentTaskId;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
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
		private List<String> nodeId;

		@Nullable
		private String parentTaskId;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Comma-separated list or wildcard expression of actions used to limit the
		 * request.
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
		 * Comma-separated list or wildcard expression of actions used to limit the
		 * request.
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
		 * If <code>true</code>, the response includes detailed information about shard
		 * recoveries.
		 * <p>
		 * API name: {@code detailed}
		 */
		public final Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * Key used to group tasks in the response.
		 * <p>
		 * API name: {@code group_by}
		 */
		public final Builder groupBy(@Nullable GroupBy value) {
			this.groupBy = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Comma-separated list of node IDs or names used to limit returned information.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeId</code>.
		 */
		public final Builder nodeId(List<String> list) {
			this.nodeId = _listAddAll(this.nodeId, list);
			return this;
		}

		/**
		 * Comma-separated list of node IDs or names used to limit returned information.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds one or more values to <code>nodeId</code>.
		 */
		public final Builder nodeId(String value, String... values) {
			this.nodeId = _listAdd(this.nodeId, value, values);
			return this;
		}

		/**
		 * Parent task ID used to limit returned information. To return all tasks, omit
		 * this parameter or use a value of <code>-1</code>.
		 * <p>
		 * API name: {@code parent_task_id}
		 */
		public final Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
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
				if (ApiTypeHelper.isDefined(request.nodeId)) {
					params.put("node_id", request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ListResponse._DESERIALIZER);
}
