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
import co.elastic.clients.elasticsearch.inference.put_openai.OpenAIServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_openai.OpenAITaskSettings;
import co.elastic.clients.elasticsearch.inference.put_openai.OpenAITaskType;
import co.elastic.clients.elasticsearch.inference.put_openai.ServiceType;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
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

// typedef: inference.put_openai.Request

/**
 * Create an OpenAI inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>openai</code> service or <code>openai</code> compatible APIs.
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
 * @see <a href="../doc-files/api-spec.html#inference.put_openai.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutOpenaiRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String openaiInferenceId;

<<<<<<< HEAD
<<<<<<< HEAD
	private final OpenAIServiceType service;
=======
	private final ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
	private final OpenAIServiceType service;
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)

	private final OpenAIServiceSettings serviceSettings;

	@Nullable
	private final OpenAITaskSettings taskSettings;

	private final OpenAITaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutOpenaiRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.openaiInferenceId = ApiTypeHelper.requireNonNull(builder.openaiInferenceId, this, "openaiInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutOpenaiRequest of(Function<Builder, ObjectBuilder<PutOpenaiRequest>> fn) {
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
	 * API name: {@code openai_inference_id}
	 */
	public final String openaiInferenceId() {
		return this.openaiInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>openai</code>.
	 * <p>
	 * API name: {@code service}
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	public final OpenAIServiceType service() {
=======
	public final ServiceType service() {
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
	public final OpenAIServiceType service() {
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>openai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final OpenAIServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final OpenAITaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform. NOTE:
	 * The <code>chat_completion</code> task type only supports streaming and only
	 * through the _stream API.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final OpenAITaskType taskType() {
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
	 * Builder for {@link PutOpenaiRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutOpenaiRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String openaiInferenceId;

<<<<<<< HEAD
<<<<<<< HEAD
		private OpenAIServiceType service;
=======
		private ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		private OpenAIServiceType service;
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)

		private OpenAIServiceSettings serviceSettings;

		@Nullable
		private OpenAITaskSettings taskSettings;

		private OpenAITaskType taskType;

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
		 * API name: {@code openai_inference_id}
		 */
		public final Builder openaiInferenceId(String value) {
			this.openaiInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>openai</code>.
		 * <p>
		 * API name: {@code service}
		 */
<<<<<<< HEAD
<<<<<<< HEAD
		public final Builder service(OpenAIServiceType value) {
=======
		public final Builder service(ServiceType value) {
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		public final Builder service(OpenAIServiceType value) {
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>openai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(OpenAIServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>openai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<OpenAIServiceSettings.Builder, ObjectBuilder<OpenAIServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new OpenAIServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable OpenAITaskSettings value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(Function<OpenAITaskSettings.Builder, ObjectBuilder<OpenAITaskSettings>> fn) {
			return this.taskSettings(fn.apply(new OpenAITaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform. NOTE:
		 * The <code>chat_completion</code> task type only supports streaming and only
		 * through the _stream API.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(OpenAITaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutOpenaiRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutOpenaiRequest build() {
			_checkSingleUse();

			return new PutOpenaiRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutOpenaiRequest}
	 */
	public static final JsonpDeserializer<PutOpenaiRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutOpenaiRequest::setupPutOpenaiRequestDeserializer);

	protected static void setupPutOpenaiRequestDeserializer(ObjectDeserializer<PutOpenaiRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
<<<<<<< HEAD
<<<<<<< HEAD
		op.add(Builder::service, OpenAIServiceType._DESERIALIZER, "service");
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		op.add(Builder::service, OpenAIServiceType._DESERIALIZER, "service");
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
		op.add(Builder::serviceSettings, OpenAIServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, OpenAITaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_openai}".
	 */
	public static final Endpoint<PutOpenaiRequest, PutOpenaiResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_openai",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _openaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _openaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _openaiInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.openaiInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _openaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _openaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _openaiInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("openaiInferenceId", request.openaiInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutOpenaiResponse._DESERIALIZER);
}
