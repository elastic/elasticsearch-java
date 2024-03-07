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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
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

// typedef: inference.put_model.Request

/**
 * Create an inference service model
 * 
 * @see <a href="../doc-files/api-spec.html#inference.put_model.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutModelRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	@Nullable
	private final TaskType taskType;

	private final ModelConfig modelConfig;

	// ---------------------------------------------------------------------------------------------

	private PutModelRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.taskType = builder.taskType;
		this.modelConfig = ApiTypeHelper.requireNonNull(builder.modelConfig, this, "modelConfig");

	}

	public static PutModelRequest of(Function<Builder, ObjectBuilder<PutModelRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The inference Id
	 * <p>
	 * API name: {@code inference_id}
	 */
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

	/**
	 * Required - Request body.
	 */
	public final ModelConfig modelConfig() {
		return this.modelConfig;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.modelConfig.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutModelRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutModelRequest> {
		private String inferenceId;

		@Nullable
		private TaskType taskType;

		private ModelConfig modelConfig;

		/**
		 * Required - The inference Id
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(String value) {
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

		/**
		 * Required - Request body.
		 */
		public final Builder modelConfig(ModelConfig value) {
			this.modelConfig = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder modelConfig(Function<ModelConfig.Builder, ObjectBuilder<ModelConfig>> fn) {
			return this.modelConfig(fn.apply(new ModelConfig.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			ModelConfig value = (ModelConfig) ModelConfig._DESERIALIZER.deserialize(parser, mapper);
			return this.modelConfig(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutModelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutModelRequest build() {
			_checkSingleUse();

			return new PutModelRequest(this);
		}
	}

	public static final JsonpDeserializer<PutModelRequest> _DESERIALIZER = createPutModelRequestDeserializer();
	protected static JsonpDeserializer<PutModelRequest> createPutModelRequestDeserializer() {

		JsonpDeserializer<ModelConfig> valueDeserializer = ModelConfig._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.modelConfig(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_model}".
	 */
	public static final Endpoint<PutModelRequest, PutModelResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_model",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _inferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _inferenceId;
				if (request.taskType() != null)
					propsSet |= _taskType;

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

				propsSet |= _inferenceId;
				if (request.taskType() != null)
					propsSet |= _taskType;

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

			}, SimpleEndpoint.emptyMap(), true, PutModelResponse._DESERIALIZER);
}
