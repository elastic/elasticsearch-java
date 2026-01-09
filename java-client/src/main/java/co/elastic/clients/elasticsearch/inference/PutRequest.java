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
import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: inference.put.Request

/**
 * Create an inference endpoint.
 * <p>
 * IMPORTANT: The inference APIs enable you to use certain services, such as
 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
 * Cohere, OpenAI, Mistral, Azure OpenAI, Google AI Studio, Google Vertex AI,
 * Anthropic, Watsonx.ai, or Hugging Face. For built-in models and models
 * uploaded through Eland, the inference APIs offer an alternative way to use
 * and manage trained models. However, if you do not plan to use the inference
 * APIs to use these models or if you want to use non-NLP models, use the
 * machine learning trained model APIs.
 * <p>
 * The following integrations are available through the inference API. You can
 * find the available task types next to the integration name:
 * <ul>
 * <li>AI21 (<code>chat_completion</code>, <code>completion</code>)</li>
 * <li>AlibabaCloud AI Search (<code>completion</code>, <code>rerank</code>,
 * <code>sparse_embedding</code>, <code>text_embedding</code>)</li>
 * <li>Amazon Bedrock (<code>completion</code>,
 * <code>text_embedding</code>)</li>
 * <li>Amazon SageMaker (<code>chat_completion</code>, <code>completion</code>,
 * <code>rerank</code>, <code>sparse_embedding</code>,
 * <code>text_embedding</code>)</li>
 * <li>Anthropic (<code>completion</code>)</li>
 * <li>Azure AI Studio (<code>completion</code>, <code>rerank</code>,
 * <code>text_embedding</code>)</li>
 * <li>Azure OpenAI (<code>chat_completion</code>, <code>completion</code>,
 * <code>text_embedding</code>)</li>
 * <li>Cohere (<code>completion</code>, <code>rerank</code>,
 * <code>text_embedding</code>)</li>
 * <li>DeepSeek (<code>chat_completion</code>, <code>completion</code>)</li>
 * <li>Elasticsearch (<code>rerank</code>, <code>sparse_embedding</code>,
 * <code>text_embedding</code> - this service is for built-in models and models
 * uploaded through Eland)</li>
 * <li>ELSER (<code>sparse_embedding</code>)</li>
 * <li>Google AI Studio (<code>completion</code>,
 * <code>text_embedding</code>)</li>
 * <li>Google Vertex AI (<code>chat_completion</code>, <code>completion</code>,
 * <code>rerank</code>, <code>text_embedding</code>)</li>
 * <li>Groq (<code>chat_completion</code>)</li>
 * <li>Hugging Face (<code>chat_completion</code>, <code>completion</code>,
 * <code>rerank</code>, <code>text_embedding</code>)</li>
 * <li>JinaAI (<code>rerank</code>, <code>text_embedding</code>)</li>
 * <li>Llama (<code>chat_completion</code>, <code>completion</code>,
 * <code>text_embedding</code>)</li>
 * <li>Mistral (<code>chat_completion</code>, <code>completion</code>,
 * <code>text_embedding</code>)</li>
 * <li>Nvidia (<code>chat_completion</code>, <code>completion</code>,
 * <code>text_embedding</code>, <code>rerank</code>)</li>
 * <li>OpenAI (<code>chat_completion</code>, <code>completion</code>,
 * <code>text_embedding</code>)</li>
 * <li>OpenShift AI (<code>chat_completion</code>, <code>completion</code>,
 * <code>rerank</code>, <code>text_embedding</code>)</li>
 * <li>VoyageAI (<code>rerank</code>, <code>text_embedding</code>)</li>
 * <li>Watsonx inference integration (<code>text_embedding</code>)</li>
 * </ul>
 *
 * @see <a href="../doc-files/api-spec.html#inference.put.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	@Nullable
	private final TaskType taskType;

	@Nullable
	private final Time timeout;

	private final InferenceEndpoint inferenceConfig;

	// ---------------------------------------------------------------------------------------------

	private PutRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.taskType = builder.taskType;
		this.timeout = builder.timeout;
		this.inferenceConfig = ApiTypeHelper.requireNonNull(builder.inferenceConfig, this, "inferenceConfig");

	}

	public static PutRequest of(Function<Builder, ObjectBuilder<PutRequest>> fn) {
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
	 * The task type. Refer to the integration list in the API description for the
	 * available task types.
	 * <p>
	 * API name: {@code task_type}
	 */
	@Nullable
	public final TaskType taskType() {
		return this.taskType;
	}

	/**
	 * Specifies the amount of time to wait for the inference endpoint to be
	 * created.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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
	 * Builder for {@link PutRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutRequest> {
		private String inferenceId;

		@Nullable
		private TaskType taskType;

		@Nullable
		private Time timeout;

		private InferenceEndpoint inferenceConfig;

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
		 * The task type. Refer to the integration list in the API description for the
		 * available task types.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(@Nullable TaskType value) {
			this.taskType = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the inference endpoint to be
		 * created.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the inference endpoint to be
		 * created.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
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
		 * Builds a {@link PutRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRequest build() {
			_checkSingleUse();

			return new PutRequest(this);
		}
	}

	public static final JsonpDeserializer<PutRequest> _DESERIALIZER = createPutRequestDeserializer();
	protected static JsonpDeserializer<PutRequest> createPutRequestDeserializer() {

		JsonpDeserializer<InferenceEndpoint> valueDeserializer = InferenceEndpoint._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.inferenceConfig(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put}".
	 */
	public static final Endpoint<PutRequest, PutResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put",

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
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutResponse._DESERIALIZER);
}
