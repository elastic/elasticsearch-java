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
import co.elastic.clients.elasticsearch.inference.put_googlevertexai.GoogleVertexAIServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_googlevertexai.GoogleVertexAITaskSettings;
import co.elastic.clients.elasticsearch.inference.put_googlevertexai.GoogleVertexAITaskType;
import co.elastic.clients.elasticsearch.inference.put_googlevertexai.ServiceType;
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

// typedef: inference.put_googlevertexai.Request

/**
 * Create a Google Vertex AI inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>googlevertexai</code> service.
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
 *      "../doc-files/api-spec.html#inference.put_googlevertexai.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutGooglevertexaiRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String googlevertexaiInferenceId;

<<<<<<< HEAD
<<<<<<< HEAD
	private final GoogleVertexAIServiceType service;
=======
	private final ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
	private final ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")

	private final GoogleVertexAIServiceSettings serviceSettings;

	@Nullable
	private final GoogleVertexAITaskSettings taskSettings;

	private final GoogleVertexAITaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutGooglevertexaiRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.googlevertexaiInferenceId = ApiTypeHelper.requireNonNull(builder.googlevertexaiInferenceId, this,
				"googlevertexaiInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutGooglevertexaiRequest of(Function<Builder, ObjectBuilder<PutGooglevertexaiRequest>> fn) {
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
	 * API name: {@code googlevertexai_inference_id}
	 */
	public final String googlevertexaiInferenceId() {
		return this.googlevertexaiInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>googlevertexai</code>.
	 * <p>
	 * API name: {@code service}
	 */
<<<<<<< HEAD
<<<<<<< HEAD
	public final GoogleVertexAIServiceType service() {
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
	 * specific to the <code>googlevertexai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final GoogleVertexAIServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final GoogleVertexAITaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final GoogleVertexAITaskType taskType() {
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
	 * Builder for {@link PutGooglevertexaiRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutGooglevertexaiRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String googlevertexaiInferenceId;

<<<<<<< HEAD
<<<<<<< HEAD
		private GoogleVertexAIServiceType service;
=======
		private ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
		private ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")

		private GoogleVertexAIServiceSettings serviceSettings;

		@Nullable
		private GoogleVertexAITaskSettings taskSettings;

		private GoogleVertexAITaskType taskType;

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
		 * API name: {@code googlevertexai_inference_id}
		 */
		public final Builder googlevertexaiInferenceId(String value) {
			this.googlevertexaiInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>googlevertexai</code>.
		 * <p>
		 * API name: {@code service}
		 */
<<<<<<< HEAD
<<<<<<< HEAD
		public final Builder service(GoogleVertexAIServiceType value) {
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
		 * specific to the <code>googlevertexai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(GoogleVertexAIServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>googlevertexai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<GoogleVertexAIServiceSettings.Builder, ObjectBuilder<GoogleVertexAIServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new GoogleVertexAIServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable GoogleVertexAITaskSettings value) {
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
				Function<GoogleVertexAITaskSettings.Builder, ObjectBuilder<GoogleVertexAITaskSettings>> fn) {
			return this.taskSettings(fn.apply(new GoogleVertexAITaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(GoogleVertexAITaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutGooglevertexaiRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutGooglevertexaiRequest build() {
			_checkSingleUse();

			return new PutGooglevertexaiRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutGooglevertexaiRequest}
	 */
	public static final JsonpDeserializer<PutGooglevertexaiRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutGooglevertexaiRequest::setupPutGooglevertexaiRequestDeserializer);

	protected static void setupPutGooglevertexaiRequestDeserializer(
			ObjectDeserializer<PutGooglevertexaiRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
<<<<<<< HEAD
<<<<<<< HEAD
		op.add(Builder::service, GoogleVertexAIServiceType._DESERIALIZER, "service");
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> 03828daff (regen from latest spec)
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> c49af58dc (Revert "temp rebase fix")
		op.add(Builder::serviceSettings, GoogleVertexAIServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, GoogleVertexAITaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_googlevertexai}".
	 */
	public static final Endpoint<PutGooglevertexaiRequest, PutGooglevertexaiResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_googlevertexai",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _googlevertexaiInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _googlevertexaiInferenceId;

				if (propsSet == (_taskType | _googlevertexaiInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.googlevertexaiInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _googlevertexaiInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _googlevertexaiInferenceId;

				if (propsSet == (_taskType | _googlevertexaiInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("googlevertexaiInferenceId", request.googlevertexaiInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutGooglevertexaiResponse._DESERIALIZER);
}
