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

// typedef: tasks.cancel.Request

/**
 * Cancels a task, if it can be cancelled through an API.
 * 
 * @see <a href="../doc-files/api-spec.html#tasks.cancel.Request">API
 *      specification</a>
 */

public class CancelRequest extends RequestBase {
	private final List<String> actions;

	private final List<String> nodes;

	@Nullable
	private final String parentTaskId;

	@Nullable
	private final String taskId;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private CancelRequest(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiable(builder.actions);
		this.nodes = ApiTypeHelper.unmodifiable(builder.nodes);
		this.parentTaskId = builder.parentTaskId;
		this.taskId = builder.taskId;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static CancelRequest of(Function<Builder, ObjectBuilder<CancelRequest>> fn) {
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
	 * Comma-separated list of node IDs or names used to limit the request.
	 * <p>
	 * API name: {@code nodes}
	 */
	public final List<String> nodes() {
		return this.nodes;
	}

	/**
	 * Parent task ID used to limit the tasks.
	 * <p>
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public final String parentTaskId() {
		return this.parentTaskId;
	}

	/**
	 * ID of the task.
	 * <p>
	 * API name: {@code task_id}
	 */
	@Nullable
	public final String taskId() {
		return this.taskId;
	}

	/**
	 * Should the request block until the cancellation of the task and its
	 * descendant tasks is completed. Defaults to false
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CancelRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<CancelRequest> {
		@Nullable
		private List<String> actions;

		@Nullable
		private List<String> nodes;

		@Nullable
		private String parentTaskId;

		@Nullable
		private String taskId;

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
		 * Comma-separated list of node IDs or names used to limit the request.
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
		 * Comma-separated list of node IDs or names used to limit the request.
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
		 * Parent task ID used to limit the tasks.
		 * <p>
		 * API name: {@code parent_task_id}
		 */
		public final Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

		/**
		 * ID of the task.
		 * <p>
		 * API name: {@code task_id}
		 */
		public final Builder taskId(@Nullable String value) {
			this.taskId = value;
			return this;
		}

		/**
		 * Should the request block until the cancellation of the task and its
		 * descendant tasks is completed. Defaults to false
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
		 * Builds a {@link CancelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CancelRequest build() {
			_checkSingleUse();

			return new CancelRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code tasks.cancel}".
	 */
	public static final Endpoint<CancelRequest, CancelResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/tasks.cancel",

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskId = 1 << 0;

				int propsSet = 0;

				if (request.taskId() != null)
					propsSet |= _taskId;

				if (propsSet == 0) {
				}
				if (propsSet == (_taskId)) {
					params.put("taskId", request.taskId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.nodes)) {
					params.put("nodes", request.nodes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.parentTaskId != null) {
					params.put("parent_task_id", request.parentTaskId);
				}
				if (ApiTypeHelper.isDefined(request.actions)) {
					params.put("actions", request.actions.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, CancelResponse._DESERIALIZER);
}
