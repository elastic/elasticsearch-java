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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
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

// typedef: _global.delete_by_query_rethrottle.Request

/**
 * Changes the number of requests per second for a particular Delete By Query
 * operation.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.delete_by_query_rethrottle.Request">API
 *      specification</a>
 */

public class DeleteByQueryRethrottleRequest extends RequestBase {
	@Nullable
	private final Float requestsPerSecond;

	private final String taskId;

	// ---------------------------------------------------------------------------------------------

	private DeleteByQueryRethrottleRequest(Builder builder) {

		this.requestsPerSecond = builder.requestsPerSecond;
		this.taskId = ApiTypeHelper.requireNonNull(builder.taskId, this, "taskId");

	}

	public static DeleteByQueryRethrottleRequest of(
			Function<Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The throttle for this request in sub-requests per second.
	 * <p>
	 * API name: {@code requests_per_second}
	 */
	@Nullable
	public final Float requestsPerSecond() {
		return this.requestsPerSecond;
	}

	/**
	 * Required - The ID for the task.
	 * <p>
	 * API name: {@code task_id}
	 */
	public final String taskId() {
		return this.taskId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteByQueryRethrottleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteByQueryRethrottleRequest> {
		@Nullable
		private Float requestsPerSecond;

		private String taskId;

		/**
		 * The throttle for this request in sub-requests per second.
		 * <p>
		 * API name: {@code requests_per_second}
		 */
		public final Builder requestsPerSecond(@Nullable Float value) {
			this.requestsPerSecond = value;
			return this;
		}

		/**
		 * Required - The ID for the task.
		 * <p>
		 * API name: {@code task_id}
		 */
		public final Builder taskId(String value) {
			this.taskId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteByQueryRethrottleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteByQueryRethrottleRequest build() {
			_checkSingleUse();

			return new DeleteByQueryRethrottleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code delete_by_query_rethrottle}".
	 */
	public static final Endpoint<DeleteByQueryRethrottleRequest, DeleteByQueryRethrottleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/delete_by_query_rethrottle",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _taskId = 1 << 0;

				int propsSet = 0;

				propsSet |= _taskId;

				if (propsSet == (_taskId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_delete_by_query");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskId, buf);
					buf.append("/_rethrottle");
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
				if (request.requestsPerSecond != null) {
					params.put("requests_per_second", String.valueOf(request.requestsPerSecond));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteByQueryRethrottleResponse._DESERIALIZER);
}
