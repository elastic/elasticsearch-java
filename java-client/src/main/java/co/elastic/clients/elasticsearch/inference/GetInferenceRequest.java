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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
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

// typedef: inference.get.Request

/**
 * Get an inference endpoint
 * 
 * @see <a href="../doc-files/api-spec.html#inference.get.Request">API
 *      specification</a>
 */

public class GetInferenceRequest extends RequestBase {
	@Nullable
	private final String inferenceId;

	@Nullable
	private final TaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private GetInferenceRequest(Builder builder) {

		this.inferenceId = builder.inferenceId;
		this.taskType = builder.taskType;

	}

	public static GetInferenceRequest of(Function<Builder, ObjectBuilder<GetInferenceRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The inference Id
	 * <p>
	 * API name: {@code inference_id}
	 */
	@Nullable
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * The task type
	 * <p>
	 * API name: {@code task_type}
	 */
	@Nullable
	public final TaskType taskType() {
		return this.taskType;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetInferenceRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetInferenceRequest> {
		@Nullable
		private String inferenceId;

		@Nullable
		private TaskType taskType;

		/**
		 * The inference Id
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(@Nullable String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * The task type
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(@Nullable TaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetInferenceRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInferenceRequest build() {
			_checkSingleUse();

			return new GetInferenceRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.get}".
	 */
	public static final Endpoint<GetInferenceRequest, GetInferenceResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.get",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _inferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				if (request.inferenceId() != null)
					propsSet |= _inferenceId;
				if (request.taskType() != null)
					propsSet |= _taskType;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					return buf.toString();
				}
				if (propsSet == (_inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					return buf.toString();
				}
				if (propsSet == (_taskType | _inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _inferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				if (request.inferenceId() != null)
					propsSet |= _inferenceId;
				if (request.taskType() != null)
					propsSet |= _taskType;

				if (propsSet == 0) {
				}
				if (propsSet == (_inferenceId)) {
					params.put("inferenceId", request.inferenceId);
				}
				if (propsSet == (_taskType | _inferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("inferenceId", request.inferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetInferenceResponse._DESERIALIZER);
}
