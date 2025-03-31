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
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
import co.elastic.clients.elasticsearch.inference.put_azureopenai.AzureOpenAIServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_azureopenai.AzureOpenAITaskSettings;
import co.elastic.clients.elasticsearch.inference.put_azureopenai.AzureOpenAITaskType;
import co.elastic.clients.elasticsearch.inference.put_azureopenai.ServiceType;
<<<<<<< HEAD
>>>>>>> 03828daff (regen from latest spec)
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
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

// typedef: inference.put_azureopenai.Request

/**
 * Create an Azure OpenAI inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>azureopenai</code> service.
 * <p>
 * The list of chat completion models that you can choose from in your Azure
 * OpenAI deployment include:
 * <ul>
 * <li><a href=
 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#gpt-4-and-gpt-4-turbo-models">GPT-4
 * and GPT-4 Turbo models</a></li>
 * <li><a href=
 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#gpt-35">GPT-3.5</a></li>
 * </ul>
 * <p>
 * The list of embeddings models that you can choose from in your deployment can
 * be found in the <a href=
 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#embeddings">Azure
 * models documentation</a>.
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
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_azureopenai.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAzureopenaiRequest extends RequestBase implements JsonpSerializable {
	private final String azureopenaiInferenceId;

	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

<<<<<<< HEAD
<<<<<<< HEAD
	private final AzureOpenAIServiceType service;
=======
	private final ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
	private final ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")

	private final AzureOpenAIServiceSettings serviceSettings;

	@Nullable
	private final AzureOpenAITaskSettings taskSettings;

	private final AzureOpenAITaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutAzureopenaiRequest(Builder builder) {

		this.azureopenaiInferenceId = ApiTypeHelper.requireNonNull(builder.azureopenaiInferenceId, this,
				"azureopenaiInferenceId");
		this.chunkingSettings = builder.chunkingSettings;
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutAzureopenaiRequest of(Function<Builder, ObjectBuilder<PutAzureopenaiRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code azureopenai_inference_id}
	 */
	public final String azureopenaiInferenceId() {
		return this.azureopenaiInferenceId;
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
	 * case, <code>azureopenai</code>.
	 * <p>
	 * API name: {@code service}
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	public final AzureOpenAIServiceType service() {
=======
	public final ServiceType service() {
>>>>>>> 03828daff (regen from latest spec)
=======
	public final ServiceType service() {
>>>>>>> c49af58dc (Revert "temp rebase fix")
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>azureopenai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final AzureOpenAIServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final AzureOpenAITaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform. NOTE:
	 * The <code>chat_completion</code> task type only supports streaming and only
	 * through the _stream API.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final AzureOpenAITaskType taskType() {
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
	 * Builder for {@link PutAzureopenaiRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAzureopenaiRequest> {
		private String azureopenaiInferenceId;

		@Nullable
		private InferenceChunkingSettings chunkingSettings;

<<<<<<< HEAD
<<<<<<< HEAD
		private AzureOpenAIServiceType service;
=======
		private ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
		private ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")

		private AzureOpenAIServiceSettings serviceSettings;

		@Nullable
		private AzureOpenAITaskSettings taskSettings;

		private AzureOpenAITaskType taskType;

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code azureopenai_inference_id}
		 */
		public final Builder azureopenaiInferenceId(String value) {
			this.azureopenaiInferenceId = value;
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
		 * case, <code>azureopenai</code>.
		 * <p>
		 * API name: {@code service}
		 */
<<<<<<< HEAD
<<<<<<< HEAD
		public final Builder service(AzureOpenAIServiceType value) {
=======
		public final Builder service(ServiceType value) {
>>>>>>> 03828daff (regen from latest spec)
=======
		public final Builder service(ServiceType value) {
>>>>>>> c49af58dc (Revert "temp rebase fix")
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>azureopenai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(AzureOpenAIServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>azureopenai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<AzureOpenAIServiceSettings.Builder, ObjectBuilder<AzureOpenAIServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new AzureOpenAIServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable AzureOpenAITaskSettings value) {
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
				Function<AzureOpenAITaskSettings.Builder, ObjectBuilder<AzureOpenAITaskSettings>> fn) {
			return this.taskSettings(fn.apply(new AzureOpenAITaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform. NOTE:
		 * The <code>chat_completion</code> task type only supports streaming and only
		 * through the _stream API.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(AzureOpenAITaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAzureopenaiRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAzureopenaiRequest build() {
			_checkSingleUse();

			return new PutAzureopenaiRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAzureopenaiRequest}
	 */
	public static final JsonpDeserializer<PutAzureopenaiRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutAzureopenaiRequest::setupPutAzureopenaiRequestDeserializer);

	protected static void setupPutAzureopenaiRequestDeserializer(ObjectDeserializer<PutAzureopenaiRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
<<<<<<< HEAD
<<<<<<< HEAD
		op.add(Builder::service, AzureOpenAIServiceType._DESERIALIZER, "service");
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> 03828daff (regen from latest spec)
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> c49af58dc (Revert "temp rebase fix")
		op.add(Builder::serviceSettings, AzureOpenAIServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, AzureOpenAITaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_azureopenai}".
	 */
	public static final Endpoint<PutAzureopenaiRequest, PutAzureopenaiResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_azureopenai",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _azureopenaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _azureopenaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _azureopenaiInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.azureopenaiInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _azureopenaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _azureopenaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _azureopenaiInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("azureopenaiInferenceId", request.azureopenaiInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutAzureopenaiResponse._DESERIALIZER);
}
