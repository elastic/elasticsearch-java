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

package co.elastic.clients.elasticsearch.inference;

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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: inference.delete_model.Request

/**
 * Delete an inference service model
 * 
 * @see <a href="../doc-files/api-spec.html#inference.delete_model.Request">API
 *      specification</a>
 */

public class DeleteModelRequest extends RequestBase {
	private final String modelId;

	private final TaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private DeleteModelRequest(Builder builder) {

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static DeleteModelRequest of(Function<Builder, ObjectBuilder<DeleteModelRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - The model task type
	 * <p>
	 * API name: {@code task_type}
	 */
	public final TaskType taskType() {
		return this.taskType;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteModelRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteModelRequest> {
		private String modelId;

		private TaskType taskType;

		/**
		 * Required - The unique identifier of the inference model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - The model task type
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(TaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteModelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteModelRequest build() {
			_checkSingleUse();

			return new DeleteModelRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.delete_model}".
	 */
	public static final Endpoint<DeleteModelRequest, DeleteModelResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.delete_model",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _modelId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _modelId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _modelId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _modelId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("modelId", request.modelId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteModelResponse._DESERIALIZER);
}
