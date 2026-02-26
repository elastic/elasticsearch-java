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

// typedef: inference.put_hugging_face.Request

/**
 * Create a Hugging Face inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>hugging_face</code> service. Supported tasks include:
 * <code>text_embedding</code>, <code>completion</code>, and
 * <code>chat_completion</code>.
 * <p>
 * To configure the endpoint, first visit the Hugging Face Inference Endpoints
 * page and create a new endpoint. Select a model that supports the task you
 * intend to use.
 * <p>
 * For Elastic's <code>text_embedding</code> task: The selected model must
 * support the <code>Sentence Embeddings</code> task. On the new endpoint
 * creation page, select the <code>Sentence Embeddings</code> task under the
 * <code>Advanced Configuration</code> section. After the endpoint has
 * initialized, copy the generated endpoint URL. Recommended models for
 * <code>text_embedding</code> task:
 * <ul>
 * <li><code>all-MiniLM-L6-v2</code></li>
 * <li><code>all-MiniLM-L12-v2</code></li>
 * <li><code>all-mpnet-base-v2</code></li>
 * <li><code>e5-base-v2</code></li>
 * <li><code>e5-small-v2</code></li>
 * <li><code>multilingual-e5-base</code></li>
 * <li><code>multilingual-e5-small</code></li>
 * </ul>
 * <p>
 * For Elastic's <code>chat_completion</code> and <code>completion</code> tasks:
 * The selected model must support the <code>Text Generation</code> task and
 * expose OpenAI API. HuggingFace supports both serverless and dedicated
 * endpoints for <code>Text Generation</code>. When creating dedicated endpoint
 * select the <code>Text Generation</code> task. After the endpoint is
 * initialized (for dedicated) or ready (for serverless), ensure it supports the
 * OpenAI API and includes <code>/v1/chat/completions</code> part in URL. Then,
 * copy the full endpoint URL for use. Recommended models for
 * <code>chat_completion</code> and <code>completion</code> tasks:
 * <ul>
 * <li><code>Mistral-7B-Instruct-v0.2</code></li>
 * <li><code>QwQ-32B</code></li>
 * <li><code>Phi-3-mini-128k-instruct</code></li>
 * </ul>
 * <p>
 * For Elastic's <code>rerank</code> task: The selected model must support the
 * <code>sentence-ranking</code> task and expose OpenAI API. HuggingFace
 * supports only dedicated (not serverless) endpoints for <code>Rerank</code> so
 * far. After the endpoint is initialized, copy the full endpoint URL for use.
 * Tested models for <code>rerank</code> task:
 * <ul>
 * <li><code>bge-reranker-base</code></li>
 * <li><code>jina-reranker-v1-turbo-en-GGUF</code></li>
 * </ul>
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_hugging_face.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutHuggingFaceRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String huggingfaceInferenceId;

	private final HuggingFaceServiceType service;

	private final HuggingFaceServiceSettings serviceSettings;

	@Nullable
	private final HuggingFaceTaskSettings taskSettings;

	private final HuggingFaceTaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutHuggingFaceRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.huggingfaceInferenceId = ApiTypeHelper.requireNonNull(builder.huggingfaceInferenceId, this,
				"huggingfaceInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutHuggingFaceRequest of(Function<Builder, ObjectBuilder<PutHuggingFaceRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The chunking configuration object.
	 * <p>
	 * API name: {@code chunking_settings}
	 */
	@Nullable
	public final InferenceChunkingSettings chunkingSettings() {
		return this.chunkingSettings;
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code huggingface_inference_id}
	 */
	public final String huggingfaceInferenceId() {
		return this.huggingfaceInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>hugging_face</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final HuggingFaceServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>hugging_face</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final HuggingFaceServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final HuggingFaceTaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final HuggingFaceTaskType taskType() {
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.chunkingSettings != null) {
			generator.writeKey("chunking_settings");
			this.chunkingSettings.serialize(generator, mapper);

		}
		generator.writeKey("service");
		this.service.serialize(generator, mapper);
		generator.writeKey("service_settings");
		this.serviceSettings.serialize(generator, mapper);

		if (this.taskSettings != null) {
			generator.writeKey("task_settings");
			this.taskSettings.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutHuggingFaceRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutHuggingFaceRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String huggingfaceInferenceId;

		private HuggingFaceServiceType service;

		private HuggingFaceServiceSettings serviceSettings;

		@Nullable
		private HuggingFaceTaskSettings taskSettings;

		private HuggingFaceTaskType taskType;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutHuggingFaceRequest instance) {
			this.chunkingSettings = instance.chunkingSettings;
			this.huggingfaceInferenceId = instance.huggingfaceInferenceId;
			this.service = instance.service;
			this.serviceSettings = instance.serviceSettings;
			this.taskSettings = instance.taskSettings;
			this.taskType = instance.taskType;
			this.timeout = instance.timeout;

		}
		/**
		 * The chunking configuration object.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(@Nullable InferenceChunkingSettings value) {
			this.chunkingSettings = value;
			return this;
		}

		/**
		 * The chunking configuration object.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(
				Function<InferenceChunkingSettings.Builder, ObjectBuilder<InferenceChunkingSettings>> fn) {
			return this.chunkingSettings(fn.apply(new InferenceChunkingSettings.Builder()).build());
		}

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code huggingface_inference_id}
		 */
		public final Builder huggingfaceInferenceId(String value) {
			this.huggingfaceInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>hugging_face</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(HuggingFaceServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>hugging_face</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(HuggingFaceServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>hugging_face</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<HuggingFaceServiceSettings.Builder, ObjectBuilder<HuggingFaceServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new HuggingFaceServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable HuggingFaceTaskSettings value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(
				Function<HuggingFaceTaskSettings.Builder, ObjectBuilder<HuggingFaceTaskSettings>> fn) {
			return this.taskSettings(fn.apply(new HuggingFaceTaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(HuggingFaceTaskType value) {
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutHuggingFaceRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutHuggingFaceRequest build() {
			_checkSingleUse();

			return new PutHuggingFaceRequest(this);
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
	 * Json deserializer for {@link PutHuggingFaceRequest}
	 */
	public static final JsonpDeserializer<PutHuggingFaceRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutHuggingFaceRequest::setupPutHuggingFaceRequestDeserializer);

	protected static void setupPutHuggingFaceRequestDeserializer(ObjectDeserializer<PutHuggingFaceRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, HuggingFaceServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, HuggingFaceServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, HuggingFaceTaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_hugging_face}".
	 */
	public static final Endpoint<PutHuggingFaceRequest, PutHuggingFaceResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_hugging_face",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _huggingfaceInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _huggingfaceInferenceId;

				if (propsSet == (_taskType | _huggingfaceInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.huggingfaceInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _huggingfaceInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _huggingfaceInferenceId;

				if (propsSet == (_taskType | _huggingfaceInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("huggingfaceInferenceId", request.huggingfaceInferenceId);
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

			}, SimpleEndpoint.emptyMap(), true, PutHuggingFaceResponse._DESERIALIZER);
}
