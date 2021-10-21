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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
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

// typedef: cat.tasks.Request

public final class TasksRequest extends CatRequestBase {
	@Nullable
	private final List<String> actions;

	@Nullable
	private final Boolean detailed;

	@Nullable
	private final List<String> nodeId;

	@Nullable
	private final Long parentTask;

	// ---------------------------------------------------------------------------------------------

	public TasksRequest(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.detailed = builder.detailed;
		this.nodeId = ModelTypeHelper.unmodifiable(builder.nodeId);
		this.parentTask = builder.parentTask;

	}

	public TasksRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of actions that should be returned. Leave empty to
	 * return all.
	 * <p>
	 * API name: {@code actions}
	 */
	@Nullable
	public List<String> actions() {
		return this.actions;
	}

	/**
	 * Return detailed task information (default: false)
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public Boolean detailed() {
		return this.detailed;
	}

	/**
	 * API name: {@code node_id}
	 */
	@Nullable
	public List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code parent_task}
	 */
	@Nullable
	public Long parentTask() {
		return this.parentTask;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TasksRequest}.
	 */
	public static class Builder implements ObjectBuilder<TasksRequest> {
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
		 */
		public Builder actions(@Nullable List<String> value) {
			this.actions = value;
			return this;
		}

		/**
		 * A comma-separated list of actions that should be returned. Leave empty to
		 * return all.
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
		 * Return detailed task information (default: false)
		 * <p>
		 * API name: {@code detailed}
		 */
		public Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable List<String> value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String... value) {
			this.nodeId = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeId(List)}, creating the list if needed.
		 */
		public Builder addNodeId(String value) {
			if (this.nodeId == null) {
				this.nodeId = new ArrayList<>();
			}
			this.nodeId.add(value);
			return this;
		}

		/**
		 * API name: {@code parent_task}
		 */
		public Builder parentTask(@Nullable Long value) {
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

			return new TasksRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.tasks}".
	 */
	public static final Endpoint<TasksRequest, TasksResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (request.parentTask != null) {
					params.put("parent_task", String.valueOf(request.parentTask));
				}
				if (request.actions != null) {
					params.put("actions", request.actions.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.nodeId != null) {
					params.put("node_id", request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, TasksResponse._DESERIALIZER);
}
