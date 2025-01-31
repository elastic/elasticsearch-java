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

// typedef: inference.update.Request

/**
 * Update an inference endpoint.
 * <p>
 * Modify <code>task_settings</code>, secrets (within
 * <code>service_settings</code>), or <code>num_allocations</code> for an
 * inference endpoint, depending on the specific endpoint service and
 * <code>task_type</code>.
 * <p>
 * IMPORTANT: The inference APIs enable you to use certain services, such as
 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
 * Cohere, OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic,
 * Watsonx.ai, or Hugging Face. For built-in models and models uploaded through
 * Eland, the inference APIs offer an alternative way to use and manage trained
 * models. However, if you do not plan to use the inference APIs to use these
 * models or if you want to use non-NLP models, use the machine learning trained
 * model APIs.
 * 
 * @see <a href="../doc-files/api-spec.html#inference.update.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateInferenceRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	@Nullable
	private final TaskType taskType;

	private final InferenceEndpoint inferenceConfig;

	// ---------------------------------------------------------------------------------------------

	private UpdateInferenceRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.taskType = builder.taskType;
		this.inferenceConfig = ApiTypeHelper.requireNonNull(builder.inferenceConfig, this, "inferenceConfig");

	}

	public static UpdateInferenceRequest of(Function<Builder, ObjectBuilder<UpdateInferenceRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code inference_id}
	 */
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * The type of inference task that the model performs.
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
	public final InferenceEndpoint inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.inferenceConfig.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateInferenceRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateInferenceRequest> {
		private String inferenceId;

		@Nullable
		private TaskType taskType;

		private InferenceEndpoint inferenceConfig;

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * The type of inference task that the model performs.
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
		public final Builder inferenceConfig(InferenceEndpoint value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder inferenceConfig(Function<InferenceEndpoint.Builder, ObjectBuilder<InferenceEndpoint>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceEndpoint.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			InferenceEndpoint value = (InferenceEndpoint) InferenceEndpoint._DESERIALIZER.deserialize(parser, mapper);
			return this.inferenceConfig(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateInferenceRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateInferenceRequest build() {
			_checkSingleUse();

			return new UpdateInferenceRequest(this);
		}
	}

	public static final JsonpDeserializer<UpdateInferenceRequest> _DESERIALIZER = createUpdateInferenceRequestDeserializer();
	protected static JsonpDeserializer<UpdateInferenceRequest> createUpdateInferenceRequestDeserializer() {

		JsonpDeserializer<InferenceEndpoint> valueDeserializer = InferenceEndpoint._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.inferenceConfig(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.update}".
	 */
	public static final Endpoint<UpdateInferenceRequest, UpdateInferenceResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.update",

			// Request method
			request -> {
				return "POST";

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
					buf.append("/_update");
					return buf.toString();
				}
				if (propsSet == (_taskType | _inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					buf.append("/_update");
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

			}, SimpleEndpoint.emptyMap(), true, UpdateInferenceResponse._DESERIALIZER);
}
