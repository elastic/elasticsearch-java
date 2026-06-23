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

package co.elastic.clients.elasticsearch.core;

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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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

// typedef: _global.get_reindex.Request

/**
 * Get the status and progress of a specific reindex task.
 * <p>
 * This API follows reindex tasks across node-shutdown relocations, so callers
 * can keep using the original task ID throughout the lifetime of the operation.
 * Returned task IDs and timings reflect the original task, not its relocated
 * successor. Relocated task IDs are also supported. They are followed
 * transparently and return the task ID and timings of the original task.
 * <p>
 * When the task ID cannot be resolved, the API returns the response below with
 * a 404 status code. This response is used whether the ID is unknown, refers to
 * a non-reindex task, refers to a sliced child subtask, or refers to a task
 * whose node left the cluster with no stored result (e.g. a non-graceful
 * shutdown).
 * 
 * <pre>
 * <code>{
 *   &quot;error&quot;: {
 *     &quot;type&quot;: &quot;resource_not_found_exception&quot;,
 *     &quot;reason&quot;: &quot;Reindex operation [r1A2WoRbTwKZ516z6NEs5A:36619] not found&quot;
 *   },
 *   &quot;status&quot;: 404
 * }
 * </code>
 * </pre>
 *
 * @see <a href="../doc-files/api-spec.html#_global.get_reindex.Request">API
 *      specification</a>
 */

public class GetReindexRequest extends RequestBase {
	private final String taskId;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private GetReindexRequest(Builder builder) {

		this.taskId = ApiTypeHelper.requireNonNull(builder.taskId, this, "taskId");
		this.timeout = builder.timeout;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static GetReindexRequest of(Function<Builder, ObjectBuilder<GetReindexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the reindex task to retrieve.
	 * <p>
	 * API name: {@code task_id}
	 */
	public final String taskId() {
		return this.taskId;
	}

	/**
	 * The period to wait for the reindex task to complete when
	 * <code>wait_for_completion</code> is <code>true</code>.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * If <code>true</code>, the request blocks until the reindex task completes,
	 * then returns the result.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetReindexRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetReindexRequest> {
		private String taskId;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean waitForCompletion;

		public Builder() {
		}
		private Builder(GetReindexRequest instance) {
			this.taskId = instance.taskId;
			this.timeout = instance.timeout;
			this.waitForCompletion = instance.waitForCompletion;

		}
		/**
		 * Required - The ID of the reindex task to retrieve.
		 * <p>
		 * API name: {@code task_id}
		 */
		public final Builder taskId(String value) {
			this.taskId = value;
			return this;
		}

		/**
		 * The period to wait for the reindex task to complete when
		 * <code>wait_for_completion</code> is <code>true</code>.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for the reindex task to complete when
		 * <code>wait_for_completion</code> is <code>true</code>.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>true</code>, the request blocks until the reindex task completes,
		 * then returns the result.
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
		 * Builds a {@link GetReindexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetReindexRequest build() {
			_checkSingleUse();

			return new GetReindexRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code get_reindex}".
	 */
	public static final Endpoint<GetReindexRequest, GetReindexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/get_reindex",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _taskId = 1 << 0;

				int propsSet = 0;

				propsSet |= _taskId;

				if (propsSet == (_taskId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_reindex");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskId = 1 << 0;

				int propsSet = 0;

				propsSet |= _taskId;

				if (propsSet == (_taskId)) {
					params.put("taskId", request.taskId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetReindexResponse._DESERIALIZER);
}
