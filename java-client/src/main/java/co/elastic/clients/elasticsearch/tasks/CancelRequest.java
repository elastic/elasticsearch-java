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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: tasks.cancel.Request

public final class CancelRequest extends RequestBase {
	@Nullable
	private final String taskId;

	@Nullable
	private final List<String> actions;

	@Nullable
	private final List<String> nodes;

	@Nullable
	private final String parentTaskId;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	public CancelRequest(Builder builder) {

		this.taskId = builder.taskId;
		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.nodes = ModelTypeHelper.unmodifiable(builder.nodes);
		this.parentTaskId = builder.parentTaskId;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public CancelRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Cancel the task with specified task id (node_id:task_number)
	 * <p>
	 * API name: {@code task_id}
	 */
	@Nullable
	public String taskId() {
		return this.taskId;
	}

	/**
	 * A comma-separated list of actions that should be cancelled. Leave empty to
	 * cancel all.
	 * <p>
	 * API name: {@code actions}
	 */
	@Nullable
	public List<String> actions() {
		return this.actions;
	}

	/**
	 * A comma-separated list of node IDs or names to limit the returned
	 * information; use <code>_local</code> to return information from the node
	 * you're connecting to, leave empty to get information from all nodes
	 * <p>
	 * API name: {@code nodes}
	 */
	@Nullable
	public List<String> nodes() {
		return this.nodes;
	}

	/**
	 * Cancel tasks with specified parent task id (node_id:task_number). Set to -1
	 * to cancel all.
	 * <p>
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public String parentTaskId() {
		return this.parentTaskId;
	}

	/**
	 * Should the request block until the cancellation of the task and its
	 * descendant tasks is completed. Defaults to false
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CancelRequest}.
	 */
	public static class Builder implements ObjectBuilder<CancelRequest> {
		@Nullable
		private String taskId;

		@Nullable
		private List<String> actions;

		@Nullable
		private List<String> nodes;

		@Nullable
		private String parentTaskId;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * Cancel the task with specified task id (node_id:task_number)
		 * <p>
		 * API name: {@code task_id}
		 */
		public Builder taskId(@Nullable String value) {
			this.taskId = value;
			return this;
		}

		/**
		 * A comma-separated list of actions that should be cancelled. Leave empty to
		 * cancel all.
		 * <p>
		 * API name: {@code actions}
		 */
		public Builder actions(@Nullable List<String> value) {
			this.actions = value;
			return this;
		}

		/**
		 * A comma-separated list of actions that should be cancelled. Leave empty to
		 * cancel all.
		 * <p>
		 * API name: {@code actions}
		 */
		public Builder actions(String... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(String value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code nodes}
		 */
		public Builder nodes(@Nullable List<String> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code nodes}
		 */
		public Builder nodes(String... value) {
			this.nodes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodes(List)}, creating the list if needed.
		 */
		public Builder addNodes(String value) {
			if (this.nodes == null) {
				this.nodes = new ArrayList<>();
			}
			this.nodes.add(value);
			return this;
		}

		/**
		 * Cancel tasks with specified parent task id (node_id:task_number). Set to -1
		 * to cancel all.
		 * <p>
		 * API name: {@code parent_task_id}
		 */
		public Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

		/**
		 * Should the request block until the cancellation of the task and its
		 * descendant tasks is completed. Defaults to false
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * Builds a {@link CancelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CancelRequest build() {

			return new CancelRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code tasks.cancel}".
	 */
	public static final Endpoint<CancelRequest, CancelResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _taskId = 1 << 0;

				int propsSet = 0;

				if (request.taskId() != null)
					propsSet |= _taskId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_tasks");
					buf.append("/_cancel");
					return buf.toString();
				}
				if (propsSet == (_taskId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_tasks");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskId, buf);
					buf.append("/_cancel");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.actions != null) {
					params.put("actions", request.actions.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.nodes != null) {
					params.put("nodes", request.nodes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.parentTaskId != null) {
					params.put("parent_task_id", request.parentTaskId);
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, CancelResponse._DESERIALIZER);
}
