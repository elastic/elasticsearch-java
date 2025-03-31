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
<<<<<<< HEAD
=======
=======
>>>>>>> c49af58dc (Revert "temp rebase fix")
import co.elastic.clients.elasticsearch.inference.put_azureaistudio.AzureAiStudioServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_azureaistudio.AzureAiStudioTaskSettings;
import co.elastic.clients.elasticsearch.inference.put_azureaistudio.AzureAiStudioTaskType;
import co.elastic.clients.elasticsearch.inference.put_azureaistudio.ServiceType;
<<<<<<< HEAD
>>>>>>> 03828daff (regen from latest spec)
=======
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

// typedef: inference.put_azureaistudio.Request

/**
 * Create an Azure AI studio inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>azureaistudio</code> service.
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
 *      "../doc-files/api-spec.html#inference.put_azureaistudio.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAzureaistudioRequest extends RequestBase implements JsonpSerializable {
	private final String azureaistudioInferenceId;

	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	private final AzureAiStudioServiceType service;
=======
	private final ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
	private final ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
	private final AzureAiStudioServiceType service;
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)

	private final AzureAiStudioServiceSettings serviceSettings;

	@Nullable
	private final AzureAiStudioTaskSettings taskSettings;

	private final AzureAiStudioTaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutAzureaistudioRequest(Builder builder) {

		this.azureaistudioInferenceId = ApiTypeHelper.requireNonNull(builder.azureaistudioInferenceId, this,
				"azureaistudioInferenceId");
		this.chunkingSettings = builder.chunkingSettings;
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutAzureaistudioRequest of(Function<Builder, ObjectBuilder<PutAzureaistudioRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code azureaistudio_inference_id}
	 */
	public final String azureaistudioInferenceId() {
		return this.azureaistudioInferenceId;
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
	 * case, <code>azureaistudio</code>.
	 * <p>
	 * API name: {@code service}
	 */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public final AzureAiStudioServiceType service() {
=======
	public final ServiceType service() {
>>>>>>> 03828daff (regen from latest spec)
=======
	public final ServiceType service() {
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
	public final AzureAiStudioServiceType service() {
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>openai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final AzureAiStudioServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final AzureAiStudioTaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final AzureAiStudioTaskType taskType() {
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
	 * Builder for {@link PutAzureaistudioRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAzureaistudioRequest> {
		private String azureaistudioInferenceId;

		@Nullable
		private InferenceChunkingSettings chunkingSettings;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		private AzureAiStudioServiceType service;
=======
		private ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
		private ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		private AzureAiStudioServiceType service;
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)

		private AzureAiStudioServiceSettings serviceSettings;

		@Nullable
		private AzureAiStudioTaskSettings taskSettings;

		private AzureAiStudioTaskType taskType;

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code azureaistudio_inference_id}
		 */
		public final Builder azureaistudioInferenceId(String value) {
			this.azureaistudioInferenceId = value;
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
		 * case, <code>azureaistudio</code>.
		 * <p>
		 * API name: {@code service}
		 */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		public final Builder service(AzureAiStudioServiceType value) {
=======
		public final Builder service(ServiceType value) {
>>>>>>> 03828daff (regen from latest spec)
=======
		public final Builder service(ServiceType value) {
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		public final Builder service(AzureAiStudioServiceType value) {
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
		public final Builder serviceSettings(AzureAiStudioServiceSettings value) {
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
				Function<AzureAiStudioServiceSettings.Builder, ObjectBuilder<AzureAiStudioServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new AzureAiStudioServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable AzureAiStudioTaskSettings value) {
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
				Function<AzureAiStudioTaskSettings.Builder, ObjectBuilder<AzureAiStudioTaskSettings>> fn) {
			return this.taskSettings(fn.apply(new AzureAiStudioTaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(AzureAiStudioTaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAzureaistudioRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAzureaistudioRequest build() {
			_checkSingleUse();

			return new PutAzureaistudioRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAzureaistudioRequest}
	 */
	public static final JsonpDeserializer<PutAzureaistudioRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutAzureaistudioRequest::setupPutAzureaistudioRequestDeserializer);

	protected static void setupPutAzureaistudioRequestDeserializer(
			ObjectDeserializer<PutAzureaistudioRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		op.add(Builder::service, AzureAiStudioServiceType._DESERIALIZER, "service");
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> 03828daff (regen from latest spec)
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		op.add(Builder::service, AzureAiStudioServiceType._DESERIALIZER, "service");
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
		op.add(Builder::serviceSettings, AzureAiStudioServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, AzureAiStudioTaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_azureaistudio}".
	 */
	public static final Endpoint<PutAzureaistudioRequest, PutAzureaistudioResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_azureaistudio",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _azureaistudioInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _azureaistudioInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _azureaistudioInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.azureaistudioInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _azureaistudioInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _azureaistudioInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _azureaistudioInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("azureaistudioInferenceId", request.azureaistudioInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutAzureaistudioResponse._DESERIALIZER);
}
