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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.tasks.Request

/**
 * Returns information about the tasks currently executing on one or more nodes
 * in the cluster.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.tasks.Request">API
 *      specification</a>
 */

public class TasksRequest extends CatRequestBase {
	private final List<String> actions;

	@Nullable
	private final Boolean detailed;

	private final List<String> nodeId;

	@Nullable
	private final Long parentTask;

	// ---------------------------------------------------------------------------------------------

	private TasksRequest(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiable(builder.actions);
		this.detailed = builder.detailed;
		this.nodeId = ApiTypeHelper.unmodifiable(builder.nodeId);
		this.parentTask = builder.parentTask;

	}

	public static TasksRequest of(Function<Builder, ObjectBuilder<TasksRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A comma-separated list of actions that should be returned. Leave empty to
	 * return all.
	 * <p>
	 * API name: {@code actions}
	 */
	public final List<String> actions() {
		return this.actions;
	}

	/**
	 * Return detailed task information (default: false)
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public final Boolean detailed() {
		return this.detailed;
	}

	/**
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code parent_task}
	 */
	@Nullable
	public final Long parentTask() {
		return this.parentTask;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TasksRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TasksRequest> {
		@Nullable
		private List<String> actions;

		@Nullable
		private Boolean detailed;

		@Nullable
		private List<String> nodeId;

		@Nullable
		private Long parentTask;

		/**
		 * A comma-separated list of actions that should be returned. Leave empty to
		 * return all.
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
		 * A comma-separated list of actions that should be returned. Leave empty to
		 * return all.
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
		 * Return detailed task information (default: false)
		 * <p>
		 * API name: {@code detailed}
		 */
		public final Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeId</code>.
		 */
		public final Builder nodeId(List<String> list) {
			this.nodeId = _listAddAll(this.nodeId, list);
			return this;
		}

		/**
		 * API name: {@code node_id}
		 * <p>
		 * Adds one or more values to <code>nodeId</code>.
		 */
		public final Builder nodeId(String value, String... values) {
			this.nodeId = _listAdd(this.nodeId, value, values);
			return this;
		}

		/**
		 * API name: {@code parent_task}
		 */
		public final Builder parentTask(@Nullable Long value) {
			this.parentTask = value;
			return this;
		}

		/**
		 * Builds a {@link TasksRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TasksRequest build() {
			_checkSingleUse();

			return new TasksRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.tasks}".
	 */
	public static final Endpoint<TasksRequest, TasksResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.tasks",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/tasks";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (request.parentTask != null) {
					params.put("parent_task", String.valueOf(request.parentTask));
				}
				if (ApiTypeHelper.isDefined(request.actions)) {
					params.put("actions", request.actions.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ApiTypeHelper.isDefined(request.nodeId)) {
					params.put("node_id", request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, TasksResponse._DESERIALIZER);
}
