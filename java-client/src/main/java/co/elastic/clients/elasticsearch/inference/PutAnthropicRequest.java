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

// typedef: inference.put_anthropic.Request

/**
 * Create an Anthropic inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>anthropic</code> service.
 * <p>
 * When you create an inference endpoint, the associated machine learning model
 * is automatically deployed if it is not already running. After creating the
 * endpoint, wait for the model deployment to complete before using it. To
 * verify the deployment status, use the get trained model statistics API. Look
 * for <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the
 * response and ensure that the <code>&quot;allocation_count&quot;</code>
 * matches the <code>&quot;target_allocation_count&quot;</code>. Avoid creating
 * multiple endpoints for the same model unless required, as each endpoint
 * consumes significant resources.
 * 
 * @see <a href="../doc-files/api-spec.html#inference.put_anthropic.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAnthropicRequest extends RequestBase implements JsonpSerializable {
	private final String anthropicInferenceId;

	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final AnthropicServiceType service;

	private final AnthropicServiceSettings serviceSettings;

	@Nullable
	private final AnthropicTaskSettings taskSettings;

	private final AnthropicTaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutAnthropicRequest(Builder builder) {

		this.anthropicInferenceId = ApiTypeHelper.requireNonNullWithDefault(builder.anthropicInferenceId, this,
				"anthropicInferenceId", this.anthropicInferenceId());
		this.chunkingSettings = builder.chunkingSettings;
		this.service = ApiTypeHelper.requireNonNullWithDefault(builder.service, this, "service", this.service());
		this.serviceSettings = ApiTypeHelper.requireNonNullWithDefault(builder.serviceSettings, this, "serviceSettings",
				this.serviceSettings());
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNullWithDefault(builder.taskType, this, "taskType", this.taskType());

	}

	public static PutAnthropicRequest of(Function<Builder, ObjectBuilder<PutAnthropicRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code anthropic_inference_id}
	 */
	public final String anthropicInferenceId() {
		return this.anthropicInferenceId;
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
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>anthropic</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final AnthropicServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>watsonxai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final AnthropicServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final AnthropicTaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The task type. The only valid task type for the model to perform
	 * is <code>completion</code>.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final AnthropicTaskType taskType() {
		return this.taskType;
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
	 * Builder for {@link PutAnthropicRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAnthropicRequest> {
		private String anthropicInferenceId;

		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private AnthropicServiceType service;

		private AnthropicServiceSettings serviceSettings;

		@Nullable
		private AnthropicTaskSettings taskSettings;

		private AnthropicTaskType taskType;

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code anthropic_inference_id}
		 */
		public final Builder anthropicInferenceId(String value) {
			this.anthropicInferenceId = value;
			return this;
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
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>anthropic</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(AnthropicServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>watsonxai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(AnthropicServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>watsonxai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<AnthropicServiceSettings.Builder, ObjectBuilder<AnthropicServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new AnthropicServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable AnthropicTaskSettings value) {
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
				Function<AnthropicTaskSettings.Builder, ObjectBuilder<AnthropicTaskSettings>> fn) {
			return this.taskSettings(fn.apply(new AnthropicTaskSettings.Builder()).build());
		}

		/**
		 * Required - The task type. The only valid task type for the model to perform
		 * is <code>completion</code>.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(AnthropicTaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAnthropicRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAnthropicRequest build() {
			_checkSingleUse();

			return new PutAnthropicRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAnthropicRequest}
	 */
	public static final JsonpDeserializer<PutAnthropicRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutAnthropicRequest::setupPutAnthropicRequestDeserializer);

	protected static void setupPutAnthropicRequestDeserializer(ObjectDeserializer<PutAnthropicRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, AnthropicServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, AnthropicServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, AnthropicTaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_anthropic}".
	 */
	public static final Endpoint<PutAnthropicRequest, PutAnthropicResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_anthropic",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _anthropicInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _anthropicInferenceId;

				if (propsSet == (_taskType | _anthropicInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.anthropicInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _anthropicInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _anthropicInferenceId;

				if (propsSet == (_taskType | _anthropicInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("anthropicInferenceId", request.anthropicInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutAnthropicResponse._DESERIALIZER);
}
